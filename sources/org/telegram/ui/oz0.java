package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class oz0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public org.telegram.ui.Components.uk0 a;
    public kz0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public xa.n h;
    public mz0 n;

    public oz0() {
        super(null);
        this.d = -1;
    }

    public static void Z(oz0 oz0Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.x) {
            org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
            if (xVar.n && !oz0Var.getUserConfig().q()) {
                oz0Var.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) oz0Var, 4, true));
                return;
            } else {
                org.telegram.messenger.vi.b0(oz0Var.currentAccount).a2(xVar.f.reaction);
                oz0Var.a.getAdapter().k(0, oz0Var.a.getAdapter().b());
                return;
            }
        }
        if (view instanceof nz0) {
            nz0 nz0Var = (nz0) view;
            if (oz0Var.n != null) {
                return;
            }
            x21[] x21VarArr = new x21[1];
            org.telegram.ui.Components.d5 d5Var = nz0Var.a;
            if (d5Var != null) {
                d5Var.f();
                nz0Var.b();
                Rect rect = org.telegram.messenger.i0.Q;
                rect.set(d5Var.getBounds());
                i11 = (-(nz0Var.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(16.0f);
                float L = org.telegram.messenger.i0.L(324.0f);
                i10 = rect.centerX() - ((org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(12.0f)) - ((int) Math.min(L, r4.x * 0.95f)));
            } else {
                i10 = 0;
                i11 = 0;
            }
            lz0 lz0Var = new lz0(oz0Var, oz0Var, oz0Var.getParentActivity(), Integer.valueOf(i10), nz0Var, x21VarArr);
            String Q = oz0Var.getMediaDataController().Q();
            if (Q != null && Q.startsWith("animated_")) {
                try {
                    lz0Var.setSelected(Long.valueOf(Long.parseLong(Q.substring(9))));
                } catch (Exception unused) {
                }
            }
            ArrayList arrayList = oz0Var.getMediaDataController().h;
            ArrayList arrayList2 = new ArrayList(20);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                sg.o0 o0Var = new sg.o0();
                o0Var.f = ((TLRPC.TL_availableReaction) arrayList.get(i12)).reaction;
                arrayList2.add(o0Var);
            }
            lz0Var.setRecentReactions(arrayList2);
            lz0Var.setSaveState(3);
            lz0Var.y(d5Var, nz0Var);
            mz0 mz0Var = new mz0(oz0Var, lz0Var);
            oz0Var.n = mz0Var;
            x21VarArr[0] = mz0Var;
            mz0Var.showAsDropDown(nz0Var, 0, i11, 53);
            x21VarArr[0].b();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131746402, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 26));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.a = uk0Var;
        uk0Var.r1();
        this.a.setSectionsDrawBackground(true);
        ((s4.j) this.a.getItemAnimator()).m = false;
        this.a.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.uk0 uk0Var2 = this.a;
        kz0 kz0Var = new kz0(this, context);
        this.b = kz0Var;
        uk0Var2.setAdapter(kz0Var);
        this.a.setOnItemClickListener(new jz0(this, 0));
        frameLayout.addView(this.a, w7.b6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.b.f();
        h0();
        return frameLayout;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == org.telegram.messenger.at.V4) {
            this.b.f();
        } else if (i10 == org.telegram.messenger.at.f5) {
            h0();
            this.b.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        return w7.f6.a(new g6(20, this), org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.z6, org.telegram.ui.ActionBar.t6.i6, org.telegram.ui.ActionBar.t6.a7, org.telegram.ui.ActionBar.t6.B6, org.telegram.ui.ActionBar.t6.p7, org.telegram.ui.ActionBar.t6.f6, org.telegram.ui.ActionBar.t6.g6, org.telegram.ui.ActionBar.t6.O6, org.telegram.ui.ActionBar.t6.P6, org.telegram.ui.ActionBar.t6.Q6, org.telegram.ui.ActionBar.t6.R6);
    }

    public final void h0() {
        this.f = 2;
        this.c = 1;
        if (!org.telegram.messenger.e20.i(this.currentAccount).q()) {
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
        org.telegram.messenger.at notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xa.n nVar2 = new xa.n(notificationCenter, this);
        nVar2.e(org.telegram.messenger.at.V4);
        nVar2.e(org.telegram.messenger.at.f5);
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
