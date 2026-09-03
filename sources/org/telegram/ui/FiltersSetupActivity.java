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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public lh.e1 a;
    public b20 b;
    public f2.e0 c;
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
        z10 z10Var;
        ArrayList arrayList = filtersSetupActivity.n;
        if (i10 < 0 || i10 >= arrayList.size() || (z10Var = (z10) arrayList.get(i10)) == null) {
            return;
        }
        int i11 = z10Var.a;
        if (i11 == 6) {
            if (!filtersSetupActivity.getUserConfig().isPremium()) {
                filtersSetupActivity.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) filtersSetupActivity, 35, true));
                return;
            }
            TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
            tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
            filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
            filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new no(22, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
            ((org.telegram.ui.Cells.r8) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
            b20 b20Var = filtersSetupActivity.b;
            int i12 = filtersSetupActivity.s;
            b20Var.q(i12, filtersSetupActivity.v - i12);
            return;
        }
        if (i11 != 2) {
            if (i11 == 4) {
                filtersSetupActivity.X(filtersSetupActivity.getParentLayout());
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter = z10Var.d;
        if (dialogFilter == null || dialogFilter.isDefault()) {
            return;
        }
        if (dialogFilter.locked) {
            filtersSetupActivity.showDialog(new eg.v0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
        } else {
            filtersSetupActivity.presentFragment(new c10(dialogFilter, null));
        }
    }

    public final void X(org.telegram.ui.ActionBar.e5 e5Var) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new eg.v0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (e5Var != null) {
            ((ActionBarLayout) e5Var).P(new c10(null, null));
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
            frameLayout.addView(undoView, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    public final void Z(boolean z4) {
        this.showTagsRow = -1;
        lh.e1 e1Var = this.a;
        if (e1Var != null) {
            ArrayList arrayList = e1Var.H2;
            if (arrayList == null) {
                e1Var.H2 = new ArrayList();
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
        arrayList3.add(new z10(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string = LocaleController.getString(R.string.FilterRecommended);
            z10 z10Var = new z10(0, false);
            z10Var.c = string;
            arrayList3.add(z10Var);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = arrayList4.get(i10);
                z10 z10Var2 = new z10(5, false);
                z10Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(z10Var2);
            }
            lh.e1 e1Var2 = this.a;
            if (e1Var2 != null) {
                e1Var2.H2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            z10 z10Var3 = new z10(3, false);
            z10Var3.c = null;
            arrayList3.add(z10Var3);
        }
        if (dialogFilters.isEmpty()) {
            this.v = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String string2 = LocaleController.getString(R.string.Filters);
            z10 z10Var4 = new z10(0, false);
            z10Var4.c = string2;
            arrayList3.add(z10Var4);
            this.r = arrayList3.size();
            for (int i11 = 0; i11 < dialogFilters.size(); i11++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i11);
                z10 z10Var5 = new z10(2, false);
                z10Var5.d = dialogFilter;
                arrayList3.add(z10Var5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i11).color >= 0) {
                    this.x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            lh.e1 e1Var3 = this.a;
            if (e1Var3 != null) {
                e1Var3.H2.add(Long.valueOf(AndroidUtilities.pack(this.s, (size2 - 1) + (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium ? 0 : 1))));
            }
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string3 = LocaleController.getString(R.string.CreateNewFilter);
            z10 z10Var6 = new z10(4, false);
            z10Var6.c = string3;
            arrayList3.add(z10Var6);
        }
        z10 z10Var7 = new z10(3, false);
        z10Var7.c = null;
        arrayList3.add(z10Var7);
        this.w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string4 = LocaleController.getString(R.string.FolderShowTags);
        z10 z10Var8 = new z10(6, false);
        z10Var8.c = string4;
        arrayList3.add(z10Var8);
        CharSequence replaceSingleTag = !getUserConfig().isPremium() ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.j6.L6, 2, new v10(this, 0)) : LocaleController.getString(R.string.FolderShowTagsInfo);
        z10 z10Var9 = new z10(3, false);
        z10Var9.c = replaceSingleTag;
        arrayList3.add(z10Var9);
        b20 b20Var = this.b;
        if (b20Var != null) {
            if (z4) {
                b20Var.E(arrayList2, arrayList3);
            } else {
                b20Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 11));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        lh.e1 e1Var = new lh.e1(this, context, 27);
        this.a = e1Var;
        e1Var.o1();
        this.actionBar.setAdaptiveBackground(this.a);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.mr.h);
        lVar.C = false;
        lVar.m = false;
        this.a.setItemAnimator(lVar);
        ((f2.l) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new f2.i0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        f2.e0 e0Var = new f2.e0(new e20(this));
        this.c = e0Var;
        e0Var.d(this.a);
        frameLayout.addView(this.a, k7.b6.c(-1.0f, -1));
        lh.e1 e1Var2 = this.a;
        b20 b20Var = new b20(this, context);
        this.b = b20Var;
        e1Var2.setAdapter(b20Var);
        this.a.setOnItemClickListener(new ss(8, this, context));
        if (this.f) {
            Z(false);
            this.f = false;
            this.a.u0(this.b.h() - 1);
            AndroidUtilities.runOnUIThread(new v10(this, 1), 200L);
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

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 16, new Class[]{org.telegram.ui.Cells.l4.class, d20.class, x10.class, c20.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{x10.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{x10.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        int i10 = org.telegram.ui.ActionBar.j6.Uh;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{x10.class}, new String[]{"moveImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{x10.class}, new String[]{"optionsImageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 196608, new Class[]{x10.class}, new String[]{"optionsImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{d20.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 32, new Class[]{d20.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 0, new Class[]{d20.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.k7));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
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

    @Override // org.telegram.ui.ActionBar.p2
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
                i11 = ai.d(dialogFilter.id, i11, 1, tL_messages_updateDialogFiltersOrder.order);
            }
            getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new nh.p5(4));
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        b20 b20Var = this.b;
        if (b20Var != null) {
            b20Var.l();
        }
    }
}
