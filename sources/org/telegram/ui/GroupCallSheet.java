package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.function.Function$-CC;
import j$.util.function.Predicate$-CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

/* loaded from: classes4.dex */
public abstract class GroupCallSheet {
    public static void show(Context context, int i, long j, String str, Browser.Progress progress) {
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        show(context, i, j, tL_inputGroupCallSlug, progress);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r16.id == r0.id) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (android.text.TextUtils.equals(r0.slug, r16.slug) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void show(final Context context, final int i, final long j, final TLRPC.InputGroupCall inputGroupCall, final Browser.Progress progress) {
        AlertDialog alertDialog;
        ConferenceCall conferenceCall;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            if (inputGroupCall instanceof TLRPC.TL_inputGroupCall) {
                TLRPC.GroupCall groupCall = conferenceCall.groupCall;
                if (groupCall == null || inputGroupCall.id != groupCall.id) {
                    TLRPC.InputGroupCall inputGroupCall2 = conferenceCall.inputGroupCall;
                    if (inputGroupCall2 instanceof TLRPC.TL_inputGroupCall) {
                    }
                }
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity != null) {
                    GroupCallActivity.create(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                    return;
                }
            } else if (inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) {
                TLRPC.InputGroupCall inputGroupCall3 = conferenceCall.inputGroupCall;
                if (inputGroupCall3 instanceof TLRPC.TL_inputGroupCallSlug) {
                }
            }
        }
        if (progress == null) {
            alertDialog = new AlertDialog(context, 3);
            alertDialog.showDelayed(300L);
        } else {
            alertDialog = null;
        }
        final AlertDialog alertDialog2 = alertDialog;
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = inputGroupCall;
        getgroupcall.limit = 10;
        final int sendRequest = ConnectionsManager.getInstance(i).sendRequest(getgroupcall, new RequestDelegate() { // from class: org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                GroupCallSheet.lambda$show$1(AlertDialog.this, progress, i, context, j, inputGroupCall, tLObject, tL_error);
            }
        });
        if (progress != null) {
            progress.onCancel(new Runnable() { // from class: org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    GroupCallSheet.lambda$show$2(i, sendRequest);
                }
            });
            progress.init();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$1(final AlertDialog alertDialog, final Browser.Progress progress, final int i, final Context context, final long j, final TLRPC.InputGroupCall inputGroupCall, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                GroupCallSheet.lambda$show$0(AlertDialog.this, progress, tLObject, i, context, j, inputGroupCall, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$0(AlertDialog alertDialog, Browser.Progress progress, TLObject tLObject, int i, Context context, long j, TLRPC.InputGroupCall inputGroupCall, TLRPC.TL_error tL_error) {
        BaseFragment safeLastFragment;
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (progress != null) {
            progress.end();
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i).putUsers(groupcall.users, false);
            MessagesController.getInstance(i).putChats(groupcall.chats, false);
            if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null && (groupCall = conferenceCall.groupCall) != null && groupcall.call.id == groupCall.id && (launchActivity = LaunchActivity.instance) != null) {
                GroupCallActivity.create(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            } else {
                show(context, i, j, inputGroupCall, groupcall.call, groupcall.participants);
                return;
            }
        }
        if (tL_error == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            if (tL_error == null || (safeLastFragment = LaunchActivity.getSafeLastFragment()) == null) {
                return;
            }
            BulletinFactory.of(safeLastFragment).showForError(tL_error);
            return;
        }
        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment2 != null) {
            BulletinFactory.of(safeLastFragment2).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.LinkIsNoActive)).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$2(int i, int i2) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
    }

    public static void show(final Context context, final int i, final long j, final TLRPC.InputGroupCall inputGroupCall, TLRPC.GroupCall groupCall, ArrayList arrayList) {
        DarkThemeResourceProvider darkThemeResourceProvider = new DarkThemeResourceProvider();
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, darkThemeResourceProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, darkThemeResourceProvider)));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_calls_users);
        frameLayout.addView(imageView, LayoutHelper.createFrame(56, 56, 17));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(80, 80, 1, 2, 21, 2, 13));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        LinkSpanDrawable.LinksTextView makeLinkTextView = TextHelper.makeLinkTextView(context, 20.0f, i2, true, darkThemeResourceProvider);
        makeLinkTextView.setText(LocaleController.getString(R.string.GroupCallLinkTitle));
        makeLinkTextView.setGravity(17);
        linearLayout.addView(makeLinkTextView, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 4));
        List list = (List) Collection.-EL.stream(arrayList).map(new Function() { // from class: org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda3
            public /* synthetic */ Function andThen(Function function) {
                return Function$-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Long lambda$show$3;
                lambda$show$3 = GroupCallSheet.lambda$show$3((TLRPC.GroupCallParticipant) obj);
                return lambda$show$3;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$-CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda4
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$-CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$-CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$-CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$show$4;
                lambda$show$4 = GroupCallSheet.lambda$show$4(i, j, (Long) obj);
                return lambda$show$4;
            }
        }).collect(Collectors.toList());
        boolean isEmpty = list.isEmpty();
        LinkSpanDrawable.LinksTextView makeLinkTextView2 = TextHelper.makeLinkTextView(context, 14.0f, i2, false, darkThemeResourceProvider);
        makeLinkTextView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallLinkText)));
        makeLinkTextView2.setGravity(17);
        makeLinkTextView2.setMaxWidth(HintView2.cutInFancyHalf(makeLinkTextView2.getText(), makeLinkTextView2.getPaint()));
        linearLayout.addView(makeLinkTextView2, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 23));
        if (!isEmpty) {
            View view = new View(context);
            view.setBackgroundColor(-14012362);
            linearLayout.addView(view, LayoutHelper.createLinear(-1, 0.66f, 7, 0, 0, 0, 0));
            AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
            avatarsImageView.setCentered(true);
            avatarsImageView.setSize(AndroidUtilities.dp(38.0f));
            int min = Math.min(3, list.size());
            avatarsImageView.setCount(min);
            for (int i3 = 0; i3 < min; i3++) {
                avatarsImageView.setObject(i3, i, MessagesController.getInstance(i).getUser((Long) list.get(i3)));
            }
            avatarsImageView.commitTransition(false);
            linearLayout.addView(avatarsImageView, LayoutHelper.createLinear(-1, 58, 2.0f, 11.0f, 5.0f, 0.0f));
            LinkSpanDrawable.LinksTextView makeLinkTextView3 = TextHelper.makeLinkTextView(context, 14.0f, Theme.key_windowBackgroundWhiteBlackText, false, darkThemeResourceProvider);
            makeLinkTextView3.setGravity(17);
            if (list.size() == 1) {
                makeLinkTextView3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2One, DialogObject.getShortName(i, ((Long) list.get(0)).longValue()))));
            } else if (list.size() == 2) {
                makeLinkTextView3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2Two, DialogObject.getShortName(i, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i, ((Long) list.get(1)).longValue()))));
            } else {
                makeLinkTextView3.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GroupCallLinkText2Many", arrayList.size() - 2, DialogObject.getShortName(i, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i, ((Long) list.get(1)).longValue()))));
            }
            makeLinkTextView3.setMaxWidth(HintView2.cutInFancyHalf(makeLinkTextView3.getText(), makeLinkTextView3.getPaint()));
            linearLayout.addView(makeLinkTextView3, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 25));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        linearLayout2.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, darkThemeResourceProvider), 6, 6));
        final CheckBox2 checkBox2 = new CheckBox2(context, 24, darkThemeResourceProvider);
        checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(true);
        checkBox2.setChecked(MessagesController.getGlobalMainSettings().getBoolean("callmiconstart", true), false);
        checkBox2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, darkThemeResourceProvider));
        textView.setTextSize(1, 14.0f);
        textView.setText("Turn on the microphone");
        linearLayout2.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, 38, 1, 0, 4, 0, 12));
        ScaleStateListAnimator.apply(linearLayout2, 0.025f, 1.5f);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GroupCallSheet.lambda$show$5(CheckBox2.this, view2);
            }
        });
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, darkThemeResourceProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.GroupCallLinkJoin), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 2.0f, 0.0f, 2.0f, 0.0f));
        builder.setCustomView(linearLayout);
        final BottomSheet create = builder.create();
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GroupCallSheet.lambda$show$6(BottomSheet.this, context, checkBox2, i, inputGroupCall, view2);
            }
        });
        create.fixNavigationBar();
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$show$3(TLRPC.GroupCallParticipant groupCallParticipant) {
        return Long.valueOf(DialogObject.getPeerDialogId(groupCallParticipant.peer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$show$4(int i, long j, Long l) {
        return (l.longValue() == UserConfig.getInstance(i).getClientUserId() || l.longValue() == j) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$5(CheckBox2 checkBox2, View view) {
        checkBox2.setChecked(!checkBox2.isChecked(), true);
        MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", checkBox2.isChecked()).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$6(BottomSheet bottomSheet, Context context, CheckBox2 checkBox2, int i, TLRPC.InputGroupCall inputGroupCall, View view) {
        bottomSheet.lambda$new$0();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", checkBox2.isChecked()).apply();
        VoIPHelper.joinConference(findActivity, i, inputGroupCall, false, null);
    }
}
