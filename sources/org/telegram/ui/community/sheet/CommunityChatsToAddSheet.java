package org.telegram.ui.community.sheet;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;

/* loaded from: classes3.dex */
public class CommunityChatsToAddSheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private final ArrayList chats;

    public CommunityChatsToAddSheet(Context context, ArrayList arrayList, final Utilities.Callback callback) {
        super(context, null, false, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, null);
        this.chats = arrayList;
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        this.actionBar.setTitle(getTitle());
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.navigationBarHeight);
        this.recyclerListView.setSections();
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() { // from class: org.telegram.ui.community.sheet.CommunityChatsToAddSheet$$ExternalSyntheticLambda0
            @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
            public final void onItemClick(View view, int i2) {
                CommunityChatsToAddSheet.this.lambda$new$0(callback, view, i2);
            }
        });
        this.adapter.update(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Utilities.Callback callback, View view, int i) {
        callback.run((TLRPC.Chat) this.adapter.getItem(i - 1).object);
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.CommunityAddAChatToCommunity);
    }

    @Override // org.telegram.ui.Components.BottomSheetWithRecyclerListView
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, false, new Utilities.Callback2() { // from class: org.telegram.ui.community.sheet.CommunityChatsToAddSheet$$ExternalSyntheticLambda1
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                CommunityChatsToAddSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(12.0f)));
        ArrayList arrayList2 = this.chats;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(UItem.asProfileCell((TLRPC.Chat) it.next()));
            }
        }
    }
}
