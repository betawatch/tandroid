package org.telegram.ui.community.sheet;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

/* loaded from: classes3.dex */
public class CommunityAddOptionsSheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private TLRPC.Chat chat;
    private TLRPC.ChatFull chatFull;
    private boolean isHidden;
    private int visibleRow;

    public CommunityAddOptionsSheet(Context context, TLRPC.Chat chat, TLRPC.Chat chat2, final Utilities.Callback callback) {
        super(context, null, false, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, null);
        this.chat = chat2;
        this.chatFull = chat2 != null ? MessagesController.getInstance(this.currentAccount).getChatFull(chat2.id) : null;
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        this.actionBar.setTitle(getTitle());
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(64.0f));
        this.recyclerListView.setSections();
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.community.sheet.CommunityAddOptionsSheet$$ExternalSyntheticLambda0
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i2) {
                CommunityAddOptionsSheet.this.lambda$new$0(view, i2);
            }
        });
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(ChatObject.canUserDoAdminAction(chat, 27) ? R.string.CommunityAddToCommunityButton : R.string.CommunityAddToCommunityRequestButton));
        buttonWithCounterView.setRound();
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.community.sheet.CommunityAddOptionsSheet$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommunityAddOptionsSheet.this.lambda$new$1(callback, view);
            }
        });
        this.containerView.addView(buttonWithCounterView, LayoutHelper.createFrameMarginPx(-1, 48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.adapter.update(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i) {
        int i2 = this.adapter.getItem(i - 1).id;
        if (i2 == 151) {
            setIsHidden(false);
        } else if (i2 == 150) {
            setIsHidden(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Utilities.Callback callback, View view) {
        apply(callback, this.isHidden, true);
    }

    private void apply(final Utilities.Callback callback, final boolean z, boolean z2) {
        if (z2 && !z) {
            AlertsCreator.showSimpleConfirmAlert(getContext(), this.resourcesProvider, LocaleController.getString(R.string.CommunityAddToCommunityTitle), LocaleController.getString(R.string.CommunityAddToCommunityGroupMessage), LocaleController.getString(R.string.Add), false, new Runnable() { // from class: org.telegram.ui.community.sheet.CommunityAddOptionsSheet$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    CommunityAddOptionsSheet.this.lambda$apply$2(callback, z);
                }
            });
        } else {
            callback.run(Boolean.valueOf(z));
            lambda$new$0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$apply$2(Utilities.Callback callback, boolean z) {
        apply(callback, z, false);
    }

    private void setIsHidden(boolean z) {
        boolean z2;
        if (this.isHidden == z) {
            return;
        }
        this.isHidden = z;
        View findViewByPosition = this.recyclerListView.findViewByPosition(this.visibleRow + 1);
        if (findViewByPosition instanceof RadioButtonCell) {
            ((RadioButtonCell) findViewByPosition).setChecked(!z, true);
            z2 = false;
        } else {
            z2 = true;
        }
        View findViewByPosition2 = this.recyclerListView.findViewByPosition(this.visibleRow + 2);
        if (findViewByPosition2 instanceof RadioButtonCell) {
            ((RadioButtonCell) findViewByPosition2).setChecked(z, true);
        } else {
            z2 = true;
        }
        if (z2) {
            this.adapter.update(true);
        }
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.CommunityAddChatTitle);
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, false, new Utilities.Callback2() { // from class: org.telegram.ui.community.sheet.CommunityAddOptionsSheet$$ExternalSyntheticLambda2
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                CommunityAddOptionsSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    private static class SpaceView extends View {
        public SpaceView(Context context) {
            super(context);
        }

        @Override // android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(3.0f), TLObject.FLAG_30));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(12.0f)));
        arrayList.add(UItem.asCustom(1, new SpaceView(getContext())));
        UItem asProfileCell = UItem.asProfileCell(this.chat);
        asProfileCell.enabled = false;
        asProfileCell.hideDivider = true;
        arrayList.add(asProfileCell);
        arrayList.add(UItem.asCustom(8, new SpaceView(getContext())));
        arrayList.add(UItem.asSpace(2, AndroidUtilities.dp(12.0f)));
        arrayList.add(UItem.asHeader(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
        this.visibleRow = arrayList.size();
        arrayList.add(UItem.asRadio2(NotificationCenter.messagePlayingDidStart, LocaleController.getString(R.string.CommunityChatVisibilityVisible), LocaleController.getString(R.string.CommunityChatVisibilityVisibleInfo)).setChecked(!this.isHidden));
        arrayList.add(UItem.asRadio2(150, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(R.string.CommunityChatVisibilityHiddenInfo)).setChecked(this.isHidden));
        arrayList.add(UItem.asShadow(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
    }
}
