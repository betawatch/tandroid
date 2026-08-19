package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

/* loaded from: classes5.dex */
public class CreateRtmpStreamBottomSheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private boolean hasButton;
    private final boolean hasFewPeers;
    private boolean hasRevokeButton;
    private final JoinCallAlert.JoinCallAlertDelegate joinCallDelegate;
    private String rtmpKey;
    private SpannableStringBuilder rtmpKeySpoiled;
    private String rtmpUrl;
    private TLRPC.InputPeer selectAfterDismiss;
    private final boolean story;
    private TopCell topCell;

    public static void show(TLRPC.Peer peer, BaseFragment baseFragment, long j, boolean z, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate) {
        CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet = new CreateRtmpStreamBottomSheet(baseFragment, peer, j, z, joinCallAlertDelegate);
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            baseFragment.showDialog(createRtmpStreamBottomSheet);
        } else {
            createRtmpStreamBottomSheet.show();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.telegram.ui.ActionBar.BottomSheet, org.telegram.ui.Components.BottomSheetWithRecyclerListView, org.telegram.ui.Components.CreateRtmpStreamBottomSheet] */
    public CreateRtmpStreamBottomSheet(final Context context, final int i, final TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl, final Utilities.Callback callback, final Theme.ResourcesProvider resourcesProvider) {
        int i2;
        final ?? bottomSheetWithRecyclerListView = new BottomSheetWithRecyclerListView(context, null, false, false, false, resourcesProvider);
        bottomSheetWithRecyclerListView.story = true;
        bottomSheetWithRecyclerListView.topPadding = 0.126f;
        bottomSheetWithRecyclerListView.joinCallDelegate = null;
        bottomSheetWithRecyclerListView.hasFewPeers = false;
        long peerDialogId = DialogObject.getPeerDialogId(getgroupcallstreamrtmpurl.peer);
        bottomSheetWithRecyclerListView.hasRevokeButton = callback != null && (peerDialogId >= 0 || ChatObject.isCreator(MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId))));
        CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet = bottomSheetWithRecyclerListView;
        if (callback != null) {
            bottomSheetWithRecyclerListView.hasButton = true;
            final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
            buttonWithCounterView.setText(LocaleController.getString(R.string.LiveStoryRTMPEnable), false);
            bottomSheetWithRecyclerListView.containerView.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (bottomSheetWithRecyclerListView.hasRevokeButton ? 52 : 0) + 12));
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda13
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CreateRtmpStreamBottomSheet.$r8$lambda$INw1K4jcWgLxJcawycOXi22md7A(CreateRtmpStreamBottomSheet.this, callback, buttonWithCounterView, view);
                }
            });
            boolean z = bottomSheetWithRecyclerListView.hasRevokeButton;
            createRtmpStreamBottomSheet = bottomSheetWithRecyclerListView;
            if (z) {
                final ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, false, resourcesProvider);
                buttonWithCounterView2.setColor(Theme.getColor(Theme.key_fill_RedNormal));
                buttonWithCounterView2.text.setTypeface(AndroidUtilities.bold());
                buttonWithCounterView2.setText(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false);
                CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet2 = this;
                buttonWithCounterView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda14
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CreateRtmpStreamBottomSheet.$r8$lambda$Sl93Rxj6AnrfAZ8cmV4mXMUb2mw(CreateRtmpStreamBottomSheet.this, context, resourcesProvider, buttonWithCounterView2, getgroupcallstreamrtmpurl, i, view);
                    }
                });
                createRtmpStreamBottomSheet2.containerView.addView(buttonWithCounterView2, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
                createRtmpStreamBottomSheet = createRtmpStreamBottomSheet2;
            }
        }
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        createRtmpStreamBottomSheet.recyclerListView.setItemAnimator(defaultItemAnimator);
        RecyclerListView recyclerListView = createRtmpStreamBottomSheet.recyclerListView;
        int i3 = createRtmpStreamBottomSheet.backgroundPaddingLeft;
        if (createRtmpStreamBottomSheet.hasButton) {
            i2 = AndroidUtilities.dp(createRtmpStreamBottomSheet.hasRevokeButton ? 124.0f : 72.0f);
        } else {
            i2 = 0;
        }
        recyclerListView.setPadding(i3, 0, i3, i2);
        createRtmpStreamBottomSheet.fixNavigationBar();
        createRtmpStreamBottomSheet.updateTitle();
        createRtmpStreamBottomSheet.rtmpUrl = groupcallstreamrtmpurl.url;
        createRtmpStreamBottomSheet.rtmpKey = groupcallstreamrtmpurl.key;
        createRtmpStreamBottomSheet.rtmpKeySpoiled = new SpannableStringBuilder(createRtmpStreamBottomSheet.rtmpKey);
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 256;
        textStyleRun.start = 0;
        textStyleRun.end = createRtmpStreamBottomSheet.rtmpKeySpoiled.length();
        createRtmpStreamBottomSheet.rtmpKeySpoiled.setSpan(new TextStyleSpan(textStyleRun), 0, createRtmpStreamBottomSheet.rtmpKeySpoiled.length(), 0);
        createRtmpStreamBottomSheet.adapter.update(false);
    }

    public static /* synthetic */ void $r8$lambda$INw1K4jcWgLxJcawycOXi22md7A(final CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, Utilities.Callback callback, final ButtonWithCounterView buttonWithCounterView, View view) {
        createRtmpStreamBottomSheet.getClass();
        callback.run(new Browser.Progress(new Runnable() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ButtonWithCounterView.this.setLoading(true);
            }
        }, new Runnable() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CreateRtmpStreamBottomSheet.$r8$lambda$JlrPQx2p8J__9sp7Kn54F2BW_IA(CreateRtmpStreamBottomSheet.this, buttonWithCounterView);
            }
        }));
    }

    public static /* synthetic */ void $r8$lambda$JlrPQx2p8J__9sp7Kn54F2BW_IA(CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, ButtonWithCounterView buttonWithCounterView) {
        createRtmpStreamBottomSheet.getClass();
        buttonWithCounterView.setLoading(false);
        createRtmpStreamBottomSheet.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$Sl93Rxj6AnrfAZ8cmV4mXMUb2mw(final CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, Context context, Theme.ResourcesProvider resourcesProvider, final ButtonWithCounterView buttonWithCounterView, final TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, final int i, View view) {
        createRtmpStreamBottomSheet.getClass();
        new AlertDialog.Builder(context, resourcesProvider).setTitle(LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle)).setMessage(LocaleController.getString(R.string.LiveStoryRTMPRevokeText)).setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda0
            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
            public final void onClick(AlertDialog alertDialog, int i2) {
                CreateRtmpStreamBottomSheet.$r8$lambda$CgXtk0rFCYP6j0B9yOcfgs4_Auo(CreateRtmpStreamBottomSheet.this, buttonWithCounterView, getgroupcallstreamrtmpurl, i, alertDialog, i2);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
    }

    public static /* synthetic */ void $r8$lambda$CgXtk0rFCYP6j0B9yOcfgs4_Auo(final CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, final ButtonWithCounterView buttonWithCounterView, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i, AlertDialog alertDialog, int i2) {
        createRtmpStreamBottomSheet.getClass();
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(i).sendRequest(getgroupcallstreamrtmpurl, new RequestDelegate() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda3
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CreateRtmpStreamBottomSheet.$r8$lambda$yd5M6XeOdCe2CBHlu_FxS1qUOtQ(CreateRtmpStreamBottomSheet.this, buttonWithCounterView, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$yd5M6XeOdCe2CBHlu_FxS1qUOtQ(final CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, final ButtonWithCounterView buttonWithCounterView, final TLObject tLObject, TLRPC.TL_error tL_error) {
        createRtmpStreamBottomSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                CreateRtmpStreamBottomSheet.$r8$lambda$X7nwlmCC58cOd-Nf6d8l5Os7rYA(CreateRtmpStreamBottomSheet.this, buttonWithCounterView, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$X7nwlmCC58cOd-Nf6d8l5Os7rYA(CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, ButtonWithCounterView buttonWithCounterView, TLObject tLObject) {
        createRtmpStreamBottomSheet.getClass();
        buttonWithCounterView.setLoading(false);
        if (tLObject instanceof TL_phone.groupCallStreamRtmpUrl) {
            TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
            createRtmpStreamBottomSheet.rtmpUrl = groupcallstreamrtmpurl.url;
            createRtmpStreamBottomSheet.rtmpKey = groupcallstreamrtmpurl.key;
            createRtmpStreamBottomSheet.rtmpKeySpoiled = new SpannableStringBuilder(createRtmpStreamBottomSheet.rtmpKey);
            createRtmpStreamBottomSheet.adapter.update(true);
        }
    }

    public CreateRtmpStreamBottomSheet(BaseFragment baseFragment, final TLRPC.Peer peer, final long j, boolean z, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate) {
        super(baseFragment, false, false);
        this.story = false;
        this.topPadding = 0.26f;
        this.joinCallDelegate = joinCallAlertDelegate;
        this.hasFewPeers = z;
        final Context context = this.containerView.getContext();
        boolean isCreator = ChatObject.isCreator(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j)));
        this.hasButton = true;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.VoipChannelStartStreaming));
        textView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, this.resourcesProvider));
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite), 120)));
        this.containerView.addView(textView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, (isCreator ? 52 : 0) + 12));
        textView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRtmpStreamBottomSheet.$r8$lambda$W5jeVHkpG1qCUM44vNJFodWUWpo(CreateRtmpStreamBottomSheet.this, peer, view);
            }
        });
        if (isCreator) {
            final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, false, this.resourcesProvider);
            buttonWithCounterView.setColor(Theme.getColor(Theme.key_fill_RedNormal));
            buttonWithCounterView.text.setTypeface(AndroidUtilities.bold());
            buttonWithCounterView.setText(LocaleController.getString(R.string.LiveStoryRTMPRevoke), false);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    new AlertDialog.Builder(context, r0.resourcesProvider).setTitle(LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle)).setMessage(LocaleController.getString(R.string.LiveStoryRTMPRevokeText)).setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda10
                        @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                        public final void onClick(AlertDialog alertDialog, int i) {
                            CreateRtmpStreamBottomSheet.$r8$lambda$W8JYa7WOMP1qslzUbTlfrWBnVng(CreateRtmpStreamBottomSheet.this, r2, r3, alertDialog, i);
                        }
                    }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
                }
            });
            this.containerView.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 12.0f));
        }
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.dp((isCreator ? 52 : 0) + 72));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        fixNavigationBar();
        updateTitle();
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        getgroupcallstreamrtmpurl.revoke = false;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new RequestDelegate() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda8
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CreateRtmpStreamBottomSheet.$r8$lambda$dg3tloRoDZUMyIb6hW1zWIhO2bA(CreateRtmpStreamBottomSheet.this, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$W5jeVHkpG1qCUM44vNJFodWUWpo(CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, TLRPC.Peer peer, View view) {
        createRtmpStreamBottomSheet.selectAfterDismiss = MessagesController.getInstance(createRtmpStreamBottomSheet.currentAccount).getInputPeer(MessageObject.getPeerId(peer));
        createRtmpStreamBottomSheet.dismiss();
    }

    public static /* synthetic */ void $r8$lambda$W8JYa7WOMP1qslzUbTlfrWBnVng(final CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, final ButtonWithCounterView buttonWithCounterView, long j, AlertDialog alertDialog, int i) {
        createRtmpStreamBottomSheet.getClass();
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
        getgroupcallstreamrtmpurl.peer = MessagesController.getInstance(createRtmpStreamBottomSheet.currentAccount).getInputPeer(j);
        getgroupcallstreamrtmpurl.revoke = true;
        ConnectionsManager.getInstance(createRtmpStreamBottomSheet.currentAccount).sendRequest(getgroupcallstreamrtmpurl, new RequestDelegate() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda11
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                CreateRtmpStreamBottomSheet.$r8$lambda$Yl-MNIcVCub9KY5ci2FOs46ahHs(CreateRtmpStreamBottomSheet.this, buttonWithCounterView, tLObject, tL_error);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Yl-MNIcVCub9KY5ci2FOs46ahHs(final CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, final ButtonWithCounterView buttonWithCounterView, final TLObject tLObject, TLRPC.TL_error tL_error) {
        createRtmpStreamBottomSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                CreateRtmpStreamBottomSheet.$r8$lambda$5BeFYzfNcVolLAnHlhxjSYj51WM(CreateRtmpStreamBottomSheet.this, buttonWithCounterView, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$5BeFYzfNcVolLAnHlhxjSYj51WM(CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, ButtonWithCounterView buttonWithCounterView, TLObject tLObject) {
        createRtmpStreamBottomSheet.getClass();
        buttonWithCounterView.setLoading(false);
        if (tLObject == null || !(tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
            return;
        }
        TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
        createRtmpStreamBottomSheet.rtmpUrl = groupcallstreamrtmpurl.url;
        createRtmpStreamBottomSheet.rtmpKey = groupcallstreamrtmpurl.key;
        createRtmpStreamBottomSheet.rtmpKeySpoiled = new SpannableStringBuilder(createRtmpStreamBottomSheet.rtmpKey);
        createRtmpStreamBottomSheet.adapter.update(true);
    }

    public static /* synthetic */ void $r8$lambda$dg3tloRoDZUMyIb6hW1zWIhO2bA(final CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, final TLObject tLObject, TLRPC.TL_error tL_error) {
        createRtmpStreamBottomSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                CreateRtmpStreamBottomSheet.$r8$lambda$BylSXsrpWi-1cZInI-pBsqmr4Z0(CreateRtmpStreamBottomSheet.this, tLObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$BylSXsrpWi-1cZInI-pBsqmr4Z0(CreateRtmpStreamBottomSheet createRtmpStreamBottomSheet, TLObject tLObject) {
        createRtmpStreamBottomSheet.getClass();
        if (tLObject == null || !(tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
            return;
        }
        TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
        createRtmpStreamBottomSheet.rtmpUrl = groupcallstreamrtmpurl.url;
        createRtmpStreamBottomSheet.rtmpKey = groupcallstreamrtmpurl.key;
        createRtmpStreamBottomSheet.rtmpKeySpoiled = new SpannableStringBuilder(createRtmpStreamBottomSheet.rtmpKey);
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags |= 256;
        textStyleRun.start = 0;
        textStyleRun.end = createRtmpStreamBottomSheet.rtmpKeySpoiled.length();
        createRtmpStreamBottomSheet.rtmpKeySpoiled.setSpan(new TextStyleSpan(textStyleRun), 0, createRtmpStreamBottomSheet.rtmpKeySpoiled.length(), 0);
        createRtmpStreamBottomSheet.adapter.update(false);
    }

    @Override // org.telegram.ui.ActionBar.BottomSheet
    public void dismissInternal() {
        TLRPC.InputPeer inputPeer;
        super.dismissInternal();
        JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate = this.joinCallDelegate;
        if (joinCallAlertDelegate == null || (inputPeer = this.selectAfterDismiss) == null) {
            return;
        }
        joinCallAlertDelegate.didSelectChat(inputPeer, this.hasFewPeers, false, true);
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.Streaming);
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$$ExternalSyntheticLambda5
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                CreateRtmpStreamBottomSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        if (this.topCell == null) {
            this.topCell = new TopCell(getContext(), this.resourcesProvider);
        }
        arrayList.add(UItem.asCustom(this.topCell));
        String str = null;
        arrayList.add(UItem.asShadow(null));
        arrayList.add(UItem.asHeader(LocaleController.getString(R.string.VoipChatStreamSettings)));
        arrayList.add(TextDetailCellFactory.of(this.rtmpUrl, LocaleController.getString(R.string.VoipChatStreamServerUrl), true));
        arrayList.add(TextDetailCellFactory.of(this.rtmpKeySpoiled, LocaleController.getString(R.string.VoipChatStreamKey), false));
        if (this.hasButton) {
            str = LocaleController.getString(this.story ? R.string.VoipChatStreamWithAnotherAppDescriptionStory : R.string.VoipChatStreamWithAnotherAppDescription);
        }
        arrayList.add(UItem.asShadow(str));
    }

    private static class TopCell extends LinearLayout {
        public TopCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            setOrientation(1);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            rLottieImageView.setAutoRepeat(true);
            rLottieImageView.setAnimation(R.raw.utyan_streaming, 112, 112);
            rLottieImageView.playAnimation();
            addView(rLottieImageView, LayoutHelper.createLinear(112, 112, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.formatString(R.string.Streaming, new Object[0]));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            textView2.setText(LocaleController.formatString(R.string.VoipStreamStart, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 28, 0, 28, 17));
        }
    }

    public static class TextDetailCellFactory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new TextDetailCellFactory());
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public TextDetailCell createView(final Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            final TextDetailCell textDetailCell = new TextDetailCell(context, resourcesProvider, true, false);
            textDetailCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            Drawable mutate = ContextCompat.getDrawable(context, R.drawable.msg_copy).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            textDetailCell.setImage(mutate);
            textDetailCell.setImageClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.CreateRtmpStreamBottomSheet$TextDetailCellFactory$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CreateRtmpStreamBottomSheet.TextDetailCellFactory.$r8$lambda$kJtNA81dr8ChSozeZgHipw_SSA8(CreateRtmpStreamBottomSheet.TextDetailCellFactory.this, context, textDetailCell, view);
                }
            });
            return textDetailCell;
        }

        public static /* synthetic */ void $r8$lambda$kJtNA81dr8ChSozeZgHipw_SSA8(TextDetailCellFactory textDetailCellFactory, Context context, TextDetailCell textDetailCell, View view) {
            textDetailCellFactory.getClass();
            textDetailCellFactory.copyRtmpValue(context, textDetailCell.textView.getText().toString());
        }

        @Override // org.telegram.ui.Components.UItem.UItemFactory
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            TextDetailCell textDetailCell = (TextDetailCell) view;
            textDetailCell.setTextAndValue(uItem.text, uItem.textValue, !uItem.hideDivider);
            if (uItem.text instanceof SpannableStringBuilder) {
                textDetailCell.textView.setTextSize(1, 13.0f);
                textDetailCell.textView.setTranslationY(AndroidUtilities.dp(2.0f));
                textDetailCell.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
            }
        }

        public static UItem of(CharSequence charSequence, CharSequence charSequence2, boolean z) {
            UItem ofFactory = UItem.ofFactory(TextDetailCellFactory.class);
            ofFactory.text = charSequence;
            ofFactory.textValue = charSequence2;
            ofFactory.hideDivider = !z;
            ofFactory.enabled = false;
            return ofFactory;
        }

        private void copyRtmpValue(Context context, String str) {
            AndroidUtilities.addToClipboard(str);
            if (AndroidUtilities.shouldShowClipboardToast()) {
                Toast.makeText(context, LocaleController.getString(R.string.TextCopied), 0).show();
            }
        }
    }
}
