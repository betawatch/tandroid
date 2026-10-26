package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public k10 a;
    public p10 b;
    public s4.z c;
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

    public static void V(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        n10 n10Var;
        ArrayList arrayList = filtersSetupActivity.n;
        if (i10 < 0 || i10 >= arrayList.size() || (n10Var = (n10) arrayList.get(i10)) == null) {
            return;
        }
        int i11 = n10Var.a;
        if (i11 == 6) {
            if (!filtersSetupActivity.getUserConfig().isPremium()) {
                filtersSetupActivity.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) filtersSetupActivity, 35, true));
                return;
            }
            TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
            tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().folderTags;
            filtersSetupActivity.getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
            filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new j10(0, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
            ((org.telegram.ui.Cells.a9) view).setChecked(filtersSetupActivity.getMessagesController().folderTags);
            p10 p10Var = filtersSetupActivity.b;
            int i12 = filtersSetupActivity.s;
            p10Var.q(i12, filtersSetupActivity.v - i12);
            return;
        }
        if (i11 != 2) {
            if (i11 == 4) {
                filtersSetupActivity.Z(filtersSetupActivity.getParentLayout());
                return;
            }
            return;
        }
        MessagesController.DialogFilter dialogFilter = n10Var.d;
        if (dialogFilter == null || dialogFilter.isDefault()) {
            return;
        }
        if (dialogFilter.locked) {
            filtersSetupActivity.showDialog(new tg.j0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
        } else {
            filtersSetupActivity.presentFragment(new o00(dialogFilter, null));
        }
    }

    public final void Z(org.telegram.ui.ActionBar.j5 j5Var) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new tg.j0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (j5Var != null) {
            ((ActionBarLayout) j5Var).R(new o00(null, null));
        }
    }

    public final UndoView a0() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            FrameLayout frameLayout = (FrameLayout) this.fragmentView;
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            frameLayout.addView(undoView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    public final void b0(i10 i10Var) {
        if (!this.e) {
            if (i10Var != null) {
                i10Var.run();
                return;
            }
            return;
        }
        int i10 = 0;
        this.e = false;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        getMessagesStorage().saveDialogFiltersOrder();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int size = dialogFilters.size();
        while (i10 < size) {
            MessagesController.DialogFilter dialogFilter = dialogFilters.get(i10);
            i10 = c3.h0.i(dialogFilter.id, i10, 1, tL_messages_updateDialogFiltersOrder.order);
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new l(i10Var, 8));
    }

    public final void c0(boolean z10) {
        this.showTagsRow = -1;
        k10 k10Var = this.a;
        if (k10Var != null) {
            ArrayList arrayList = k10Var.K2;
            if (arrayList == null) {
                k10Var.K2 = new ArrayList();
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
        arrayList3.add(new n10(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string = LocaleController.getString(R.string.FilterRecommended);
            n10 n10Var = new n10(0, false);
            n10Var.c = string;
            arrayList3.add(n10Var);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = arrayList4.get(i10);
                n10 n10Var2 = new n10(5, false);
                n10Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(n10Var2);
            }
            k10 k10Var2 = this.a;
            if (k10Var2 != null) {
                k10Var2.K2.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            n10 n10Var3 = new n10(3, false);
            n10Var3.c = null;
            arrayList3.add(n10Var3);
        }
        if (dialogFilters.isEmpty()) {
            this.v = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String string2 = LocaleController.getString(R.string.Filters);
            n10 n10Var4 = new n10(0, false);
            n10Var4.c = string2;
            arrayList3.add(n10Var4);
            this.r = arrayList3.size();
            for (int i11 = 0; i11 < dialogFilters.size(); i11++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i11);
                n10 n10Var5 = new n10(2, false);
                n10Var5.d = dialogFilter;
                arrayList3.add(n10Var5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i11).color >= 0) {
                    this.x = true;
                }
            }
            int size2 = arrayList3.size();
            this.v = size2;
            k10 k10Var3 = this.a;
            if (k10Var3 != null) {
                k10Var3.K2.add(Long.valueOf(AndroidUtilities.pack(this.s, (size2 - 1) + (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium ? 0 : 1))));
            }
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string3 = LocaleController.getString(R.string.CreateNewFilter);
            n10 n10Var6 = new n10(4, false);
            n10Var6.c = string3;
            arrayList3.add(n10Var6);
        }
        n10 n10Var7 = new n10(3, false);
        n10Var7.c = null;
        arrayList3.add(n10Var7);
        this.w = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String string4 = LocaleController.getString(R.string.FolderShowTags);
        n10 n10Var8 = new n10(6, false);
        n10Var8.c = string4;
        arrayList3.add(n10Var8);
        CharSequence replaceSingleTag = !getUserConfig().isPremium() ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), org.telegram.ui.ActionBar.y6.L6, 2, new i10(this, 0)) : LocaleController.getString(R.string.FolderShowTagsInfo);
        n10 n10Var9 = new n10(3, false);
        n10Var9.c = replaceSingleTag;
        arrayList3.add(n10Var9);
        p10 p10Var = this.b;
        if (p10Var != null) {
            if (z10) {
                p10Var.E(arrayList2, arrayList3);
            } else {
                p10Var.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 29));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        k10 k10Var = new k10(0, context, this);
        this.a = k10Var;
        k10Var.u1();
        this.a.setClipChildren(false);
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.C = false;
        lVar.m = false;
        this.a.setItemAnimator(lVar);
        this.a.setSectionsDrawBackground(true);
        ((s4.l) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new s4.c0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        s4.z zVar = new s4.z(new s10(this));
        this.c = zVar;
        zVar.h(this.a);
        frameLayout.addView(this.a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        k10 k10Var2 = this.a;
        p10 p10Var = new p10(this, context);
        this.b = p10Var;
        k10Var2.setAdapter(p10Var);
        this.a.setOnItemClickListener(new org.telegram.ui.Components.voip.k1(11, this, context));
        if (this.f) {
            c0(false);
            this.f = false;
            this.a.v0(this.b.h() - 1);
            AndroidUtilities.runOnUIThread(new i10(this, 1), 200L);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogFiltersUpdated) {
            c0(true);
        } else if (i10 == NotificationCenter.suggestedFiltersLoaded) {
            c0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 16, new Class[]{org.telegram.ui.Cells.q4.class, r10.class, q10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.a, 196608, new Class[]{l10.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Vh));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        c0(false);
        getMessagesController().loadRemoteFilters(true);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogFiltersUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.suggestedFiltersLoaded);
        if (getMessagesController().suggestedFilters.isEmpty()) {
            getMessagesController().loadSuggestedFilters();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogFiltersUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.suggestedFiltersLoaded);
        b0(null);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        p10 p10Var = this.b;
        if (p10Var != null) {
            p10Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
