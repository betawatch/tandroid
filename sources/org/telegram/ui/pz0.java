package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pz0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public org.telegram.ui.Components.tk0 a;
    public lz0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public xa.n h;
    public nz0 n;

    public pz0() {
        super(null);
        this.d = -1;
    }

    public static void Y(pz0 pz0Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.x) {
            org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
            if (xVar.n && !pz0Var.getUserConfig().q()) {
                pz0Var.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) pz0Var, 4, true));
                return;
            } else {
                org.telegram.messenger.ui.b0(pz0Var.currentAccount).a2(xVar.f.reaction);
                pz0Var.a.getAdapter().k(0, pz0Var.a.getAdapter().b());
                return;
            }
        }
        if (view instanceof oz0) {
            oz0 oz0Var = (oz0) view;
            if (pz0Var.n != null) {
                return;
            }
            z21[] z21VarArr = new z21[1];
            org.telegram.ui.Components.d5 d5Var = oz0Var.a;
            if (d5Var != null) {
                d5Var.f();
                oz0Var.b();
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set(d5Var.getBounds());
                i11 = (-(oz0Var.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(16.0f);
                float L = org.telegram.messenger.i0.L(324.0f);
                i10 = rect.centerX() - ((org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(12.0f)) - ((int) Math.min(L, r4.x * 0.95f)));
            } else {
                i10 = 0;
                i11 = 0;
            }
            mz0 mz0Var = new mz0(pz0Var, pz0Var, pz0Var.getParentActivity(), Integer.valueOf(i10), oz0Var, z21VarArr);
            String Q = pz0Var.getMediaDataController().Q();
            if (Q != null && Q.startsWith("animated_")) {
                try {
                    mz0Var.setSelected(Long.valueOf(Long.parseLong(Q.substring(9))));
                } catch (Exception unused) {
                }
            }
            ArrayList arrayList = pz0Var.getMediaDataController().h;
            ArrayList arrayList2 = new ArrayList(20);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                sg.o0 o0Var = new sg.o0();
                o0Var.f = ((TLRPC.TL_availableReaction) arrayList.get(i12)).reaction;
                arrayList2.add(o0Var);
            }
            mz0Var.setRecentReactions(arrayList2);
            mz0Var.setSaveState(3);
            mz0Var.y(d5Var, oz0Var);
            nz0 nz0Var = new nz0(pz0Var, mz0Var);
            pz0Var.n = nz0Var;
            z21VarArr[0] = nz0Var;
            nz0Var.showAsDropDown(oz0Var, 0, i11, 53);
            z21VarArr[0].b();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746402, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 26));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.a = tk0Var;
        tk0Var.r1();
        this.a.setSectionsDrawBackground(true);
        ((s4.j) this.a.getItemAnimator()).m = false;
        this.a.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.tk0 tk0Var2 = this.a;
        lz0 lz0Var = new lz0(this, context);
        this.b = lz0Var;
        tk0Var2.setAdapter(lz0Var);
        this.a.setOnItemClickListener(new kz0(this, 0));
        frameLayout.addView(this.a, w7.b6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.b.f();
        g0();
        return frameLayout;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == org.telegram.messenger.zs.V4) {
            this.b.f();
        } else if (i10 == org.telegram.messenger.zs.f5) {
            g0();
            this.b.f();
        }
    }

    public final void g0() {
        this.f = 2;
        this.c = 1;
        if (!org.telegram.messenger.d20.i(this.currentAccount).q()) {
            this.e = -1;
            this.d = this.f;
        } else {
            this.d = -1;
            int i10 = this.f;
            this.f = i10 + 1;
            this.e = i10;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        return w7.f6.a(new g6(20, this), org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.z6, org.telegram.ui.ActionBar.t6.i6, org.telegram.ui.ActionBar.t6.a7, org.telegram.ui.ActionBar.t6.B6, org.telegram.ui.ActionBar.t6.p7, org.telegram.ui.ActionBar.t6.f6, org.telegram.ui.ActionBar.t6.g6, org.telegram.ui.ActionBar.t6.O6, org.telegram.ui.ActionBar.t6.P6, org.telegram.ui.ActionBar.t6.Q6, org.telegram.ui.ActionBar.t6.R6);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        xa.n nVar = this.h;
        if (nVar != null) {
            nVar.a();
            this.h = null;
        }
        org.telegram.messenger.zs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xa.n nVar2 = new xa.n(notificationCenter, this);
        nVar2.e(org.telegram.messenger.zs.V4);
        nVar2.e(org.telegram.messenger.zs.f5);
        this.h = nVar2;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        xa.n nVar = this.h;
        if (nVar != null) {
            nVar.a();
            this.h = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
