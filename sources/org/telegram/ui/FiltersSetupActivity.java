package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public ai.w0 a;
    public g20 b;
    public s4.y c;
    public UndoView d;
    public boolean e;
    public boolean f;
    public final ArrayList h;
    public final ArrayList n;
    public int r;
    public int s;
    private int showTagsRow;
    public int v;
    public int w;
    public boolean x;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.v = -1;
    }

    public static void U(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        d20 d20Var;
        ArrayList arrayList = filtersSetupActivity.n;
        if (i10 < 0 || i10 >= arrayList.size() || (d20Var = (d20) arrayList.get(i10)) == null) {
            return;
        }
        int i11 = d20Var.a;
        if (i11 == 6) {
            if (!filtersSetupActivity.getUserConfig().isPremium()) {
                filtersSetupActivity.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) filtersSetupActivity, 35, true));
                return;
            }
            TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
            tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
            filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
            filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new qo(22, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
            ((org.telegram.ui.Cells.w8) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
            g20 g20Var = filtersSetupActivity.b;
            int i12 = filtersSetupActivity.s;
            g20Var.q(i12, filtersSetupActivity.v - i12);
            return;
        }
        if (i11 != 2) {
            if (i11 == 4) {
                filtersSetupActivity.X(filtersSetupActivity.getParentLayout());
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter = d20Var.d;
        if (dialogFilter == null || dialogFilter.isDefault()) {
            return;
        }
        if (dialogFilter.locked) {
            filtersSetupActivity.showDialog(new rg.j0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
        } else {
            filtersSetupActivity.presentFragment(new h10(dialogFilter, null));
        }
    }

    public final void X(org.telegram.ui.ActionBar.e5 e5Var) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new rg.j0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (e5Var != null) {
            ((ActionBarLayout) e5Var).P(new h10(null, null));
        }
    }

    public final UndoView Y() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            FrameLayout frameLayout = (FrameLayout) this.fragmentView;
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            frameLayout.addView(undoView, w7.x5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void Z(boolean z10) {
        this.showTagsRow = -1;
        ai.w0 w0Var = this.a;
        if (w0Var != null) {
            ArrayList arrayList = w0Var.K2;
            if (arrayList == null) {
                w0Var.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList<TLRPC.TL_dialogFilterSuggested> arrayList4 = getMessagesController().suggestedFilters;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        arrayList3.add(new d20(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string = LocaleController.getString(R.string.FilterRecommended);
            d20 d20Var = new d20(0, false);
            d20Var.c = string;
            arrayList3.add(d20Var);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = arrayList4.get(i10);
                d20 d20Var2 = new d20(5, false);
                d20Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(d20Var2);
            }
            ai.w0 w0Var2 = this.a;
            if (w0Var2 != null) {
                w0Var2.K2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            d20 d20Var3 = new d20(3, false);
            d20Var3.c = null;
            arrayList3.add(d20Var3);
        }
        if (dialogFilters.isEmpty()) {
            this.v = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String string2 = LocaleController.getString(R.string.Filters);
            d20 d20Var4 = new d20(0, false);
            d20Var4.c = string2;
            arrayList3.add(d20Var4);
            this.r = arrayList3.size();
            for (int i11 = 0; i11 < dialogFilters.size(); i11++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i11);
                d20 d20Var5 = new d20(2, false);
                d20Var5.d = dialogFilter;
                arrayList3.add(d20Var5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i11).color >= 0) {
                    this.x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            ai.w0 w0Var3 = this.a;
            if (w0Var3 != null) {
                w0Var3.K2.add(Long.valueOf(AndroidUtilities.pack(this.s, (size2 - 1) + (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium ? 0 : 1))));
            }
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string3 = LocaleController.getString(R.string.CreateNewFilter);
            d20 d20Var6 = new d20(4, false);
            d20Var6.c = string3;
            arrayList3.add(d20Var6);
        }
        d20 d20Var7 = new d20(3, false);
        d20Var7.c = null;
        arrayList3.add(d20Var7);
        this.w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string4 = LocaleController.getString(R.string.FolderShowTags);
        d20 d20Var8 = new d20(6, false);
        d20Var8.c = string4;
        arrayList3.add(d20Var8);
        CharSequence replaceSingleTag = !getUserConfig().isPremium() ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.j6.L6, 2, new a20(this, 0)) : LocaleController.getString(R.string.FolderShowTagsInfo);
        d20 d20Var9 = new d20(3, false);
        d20Var9.c = replaceSingleTag;
        arrayList3.add(d20Var9);
        g20 g20Var = this.b;
        if (g20Var != null) {
            if (z10) {
                g20Var.E(arrayList2, arrayList3);
            } else {
                g20Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.actionBar.setActionBarMenuOnItemClick(new to(this, 24));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        ai.w0 w0Var = new ai.w0(this, context, 29);
        this.a = w0Var;
        w0Var.q1();
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.qr.h);
        jVar.C = false;
        jVar.m = false;
        this.a.setItemAnimator(jVar);
        ((s4.j) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new s4.c0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        s4.y yVar = new s4.y(new j20(this));
        this.c = yVar;
        yVar.e(this.a);
        frameLayout.addView(this.a, w7.x5.c(-1.0f, -1));
        ai.w0 w0Var2 = this.a;
        g20 g20Var = new g20(this, context);
        this.b = g20Var;
        w0Var2.setAdapter(g20Var);
        this.a.setOnItemClickListener(new org.telegram.ui.Components.mf(29, this, context));
        if (this.f) {
            Z(false);
            this.f = false;
            this.a.v0(this.b.h() - 1);
            AndroidUtilities.runOnUIThread(new a20(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogFiltersUpdated) {
            Z(true);
        } else if (i10 == NotificationCenter.suggestedFiltersLoaded) {
            Z(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.Components.ml0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 16, new Class[]{org.telegram.ui.Cells.l4.class, i20.class, b20.class, h20.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{b20.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{b20.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        int i10 = org.telegram.ui.ActionBar.j6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{b20.class}, new String[]{"moveImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{b20.class}, new String[]{"optionsImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 196608, new Class[]{b20.class}, new String[]{"optionsImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{i20.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 32, new Class[]{i20.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{i20.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.k7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        Z(false);
        getMessagesController().loadRemoteFilters(true);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogFiltersUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.suggestedFiltersLoaded);
        if (getMessagesController().suggestedFilters.isEmpty()) {
            getMessagesController().loadSuggestedFilters();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i10 = NotificationCenter.dialogFiltersUpdated;
        notificationCenter.removeObserver(this, i10);
        getNotificationCenter().removeObserver(this, NotificationCenter.suggestedFiltersLoaded);
        if (this.e) {
            int i11 = 0;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
            getMessagesStorage().saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            while (i11 < size) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i11);
                i11 = com.google.android.gms.internal.vision.e2.e(dialogFilter.id, i11, 1, tL_messages_updateDialogFiltersOrder.order);
            }
            getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new ai.t7(8));
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        g20 g20Var = this.b;
        if (g20Var != null) {
            g20Var.l();
        }
    }
}
