package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class FiltersSetupActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public ag.b1 a;
    public f10 b;
    public s4.x c;
    public UndoView d;
    public boolean e;
    public boolean f;
    public final ArrayList h;
    public final ArrayList n;
    public int r;
    public int s;
    private int showTagsRow;
    public int w;
    public int x;
    public boolean y;

    public FiltersSetupActivity() {
        super(null);
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.w = -1;
    }

    public static void Y(FiltersSetupActivity filtersSetupActivity, Context context, View view, int i10) {
        d10 d10Var;
        ArrayList arrayList = filtersSetupActivity.n;
        if (i10 < 0 || i10 >= arrayList.size() || (d10Var = (d10) arrayList.get(i10)) == null) {
            return;
        }
        int i11 = d10Var.a;
        if (i11 != 6) {
            if (i11 != 2) {
                if (i11 == 4) {
                    filtersSetupActivity.c0(filtersSetupActivity.getParentLayout());
                    return;
                }
                return;
            }
            org.telegram.messenger.ap apVar = d10Var.d;
            if (apVar == null || apVar.e()) {
                return;
            }
            if (apVar.p) {
                filtersSetupActivity.showDialog(new kg.q0(3, filtersSetupActivity.currentAccount, context, filtersSetupActivity, null));
                return;
            } else {
                filtersSetupActivity.presentFragment(new i00(apVar, null));
                return;
            }
        }
        if (!filtersSetupActivity.getUserConfig().q()) {
            filtersSetupActivity.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) filtersSetupActivity, 35, true));
            return;
        }
        TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
        tL_messages_toggleDialogFilterTags.enabled = true ^ filtersSetupActivity.getMessagesController().B7;
        org.telegram.messenger.vp messagesController = filtersSetupActivity.getMessagesController();
        boolean z10 = tL_messages_toggleDialogFilterTags.enabled;
        SharedPreferences.Editor edit = messagesController.f7.edit();
        messagesController.B7 = z10;
        edit.putBoolean("folderTags", z10).apply();
        filtersSetupActivity.getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new org.telegram.ui.Components.t20(12, filtersSetupActivity, tL_messages_toggleDialogFilterTags));
        ((org.telegram.ui.Cells.t8) view).setChecked(filtersSetupActivity.getMessagesController().B7);
        f10 f10Var = filtersSetupActivity.b;
        int i12 = filtersSetupActivity.s;
        f10Var.k(i12, filtersSetupActivity.w - i12);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.k7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    public final void c0(org.telegram.ui.ActionBar.z4 z4Var) {
        int size = getMessagesController().S0().size();
        if ((size - 1 >= getMessagesController().M4 && !getUserConfig().q()) || size >= getMessagesController().N4) {
            showDialog(new kg.q0(3, this.currentAccount, getParentActivity(), this, null));
        } else if (z4Var != null) {
            ((ActionBarLayout) z4Var).R(new i00(null, null));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131750697, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 23));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        ag.b1 b1Var = new ag.b1(this, context, 28);
        this.a = b1Var;
        b1Var.r1();
        this.a.setClipChildren(false);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.m = false;
        this.a.setItemAnimator(jVar);
        this.a.setSectionsDrawBackground(true);
        ((s4.j) this.a.getItemAnimator()).C = false;
        this.a.setLayoutManager(new s4.a0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        s4.x xVar = new s4.x(new org.telegram.ui.Components.sz(this));
        this.c = xVar;
        xVar.h(this.a);
        frameLayout.addView(this.a, w7.b6.c(-1.0f, -1));
        ag.b1 b1Var2 = this.a;
        f10 f10Var = new f10(this, context);
        this.b = f10Var;
        b1Var2.setAdapter(f10Var);
        this.a.setOnItemClickListener(new rv(4, this, context));
        if (this.f) {
            f0(false);
            this.f = false;
            this.a.v0(this.b.b() - 1);
            org.telegram.messenger.i0.h3(new a10(this, i10), 200L);
        }
        return this.fragmentView;
    }

    public final UndoView d0() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.d == null) {
            FrameLayout frameLayout = (FrameLayout) this.fragmentView;
            UndoView undoView = new UndoView(getParentActivity());
            this.d = undoView;
            frameLayout.addView(undoView, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.d.setTranslationY(-getBottomInset());
        }
        return this.d;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.O2) {
            f0(true);
        } else if (i10 == org.telegram.messenger.zs.Q2) {
            f0(true);
        }
    }

    public final void e0(a10 a10Var) {
        if (!this.e) {
            if (a10Var != null) {
                a10Var.run();
                return;
            }
            return;
        }
        int i10 = 0;
        this.e = false;
        getNotificationCenter().k(org.telegram.messenger.zs.O2, new Object[0]);
        getMessagesStorage().y1();
        TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
        ArrayList S0 = getMessagesController().S0();
        int size = S0.size();
        while (i10 < size) {
            org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) S0.get(i10);
            i10 = c3.i0.j(apVar.a, i10, 1, tL_messages_updateDialogFiltersOrder.order);
        }
        getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new k(a10Var, 8));
    }

    public final void f0(boolean z10) {
        this.showTagsRow = -1;
        ag.b1 b1Var = this.a;
        if (b1Var != null) {
            ArrayList arrayList = b1Var.K2;
            if (arrayList == null) {
                b1Var.K2 = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.n;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList arrayList4 = getMessagesController().V0;
        ArrayList S0 = getMessagesController().S0();
        int i10 = 0;
        arrayList3.add(new d10(1, false));
        if (!arrayList4.isEmpty() && S0.size() < 10) {
            int size = arrayList3.size();
            String L0 = org.telegram.messenger.cd.L0(2131750719, null);
            d10 d10Var = new d10(0, false);
            d10Var.c = L0;
            arrayList3.add(d10Var);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = (TLRPC.TL_dialogFilterSuggested) arrayList4.get(i11);
                d10 d10Var2 = new d10(5, false);
                d10Var2.e = tL_dialogFilterSuggested;
                arrayList3.add(d10Var2);
            }
            ag.b1 b1Var2 = this.a;
            if (b1Var2 != null) {
                b1Var2.K2.add(Long.valueOf(org.telegram.messenger.i0.w2(size, arrayList3.size() - 1)));
            }
            d10 d10Var3 = new d10(3, false);
            d10Var3.c = null;
            arrayList3.add(d10Var3);
        }
        if (S0.isEmpty()) {
            this.w = -1;
            this.s = -1;
        } else {
            this.s = arrayList3.size();
            String L02 = org.telegram.messenger.cd.L0(2131750697, null);
            d10 d10Var4 = new d10(0, false);
            d10Var4.c = L02;
            arrayList3.add(d10Var4);
            this.r = arrayList3.size();
            for (int i12 = 0; i12 < S0.size(); i12++) {
                org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) S0.get(i12);
                d10 d10Var5 = new d10(2, false);
                d10Var5.d = apVar;
                arrayList3.add(d10Var5);
                if (org.telegram.messenger.vp.r1(this.currentAccount).B7 && ((org.telegram.messenger.ap) S0.get(i12)).m >= 0) {
                    this.y = true;
                }
            }
            int size2 = arrayList3.size();
            this.w = size2;
            ag.b1 b1Var3 = this.a;
            if (b1Var3 != null) {
                b1Var3.K2.add(Long.valueOf(org.telegram.messenger.i0.w2(this.s, (size2 - 1) + (S0.size() >= getMessagesController().N4 ? 0 : 1))));
            }
        }
        if (S0.size() < getMessagesController().N4) {
            String L03 = org.telegram.messenger.cd.L0(2131751717, null);
            d10 d10Var6 = new d10(4, false);
            d10Var6.c = L03;
            arrayList3.add(d10Var6);
        }
        d10 d10Var7 = new d10(3, false);
        d10Var7.c = null;
        arrayList3.add(d10Var7);
        this.x = arrayList3.size();
        this.showTagsRow = arrayList3.size();
        String L04 = org.telegram.messenger.cd.L0(2131750626, null);
        d10 d10Var8 = new d10(6, false);
        d10Var8.c = L04;
        arrayList3.add(d10Var8);
        CharSequence R2 = !getUserConfig().q() ? org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131750624, null), org.telegram.ui.ActionBar.t6.L6, 2, new a10(this, i10), null) : org.telegram.messenger.cd.L0(2131750625, null);
        d10 d10Var9 = new d10(3, false);
        d10Var9.c = R2;
        arrayList3.add(d10Var9);
        f10 f10Var = this.b;
        if (f10Var != null) {
            if (z10) {
                f10Var.E(arrayList2, arrayList3);
            } else {
                f10Var.f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 16, new Class[]{org.telegram.ui.Cells.p4.class, h10.class, g10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 196608, new Class[]{b10.class}, new String[]{"optionsImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ji));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        f0(false);
        getMessagesController().a3(true, null);
        getNotificationCenter().c(this, org.telegram.messenger.zs.O2);
        getNotificationCenter().c(this, org.telegram.messenger.zs.Q2);
        if (getMessagesController().V0.isEmpty()) {
            getMessagesController().b3();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.zs.O2);
        getNotificationCenter().n(this, org.telegram.messenger.zs.Q2);
        e0(null);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        UndoView undoView = this.d;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        f10 f10Var = this.b;
        if (f10Var != null) {
            f10Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
