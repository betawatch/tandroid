package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class cy0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public org.telegram.ui.Components.ek0 a;
    public yx0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public xi.e h;
    public ay0 n;

    public cy0() {
        super(null);
        this.d = -1;
    }

    public static void Z(cy0 cy0Var, View view) {
        int i7;
        int i10;
        if (view instanceof org.telegram.ui.Cells.x) {
            org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
            if (xVar.n && !cy0Var.getUserConfig().q()) {
                cy0Var.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) cy0Var, 4, true));
                return;
            } else {
                org.telegram.messenger.ri.d0(cy0Var.currentAccount).f2(xVar.f.reaction);
                cy0Var.a.getAdapter().k(0, cy0Var.a.getAdapter().b());
                return;
            }
        }
        if (view instanceof by0) {
            by0 by0Var = (by0) view;
            if (cy0Var.n != null) {
                return;
            }
            h11[] h11VarArr = new h11[1];
            org.telegram.ui.Components.m5 m5Var = by0Var.a;
            if (m5Var != null) {
                m5Var.f();
                by0Var.b();
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(m5Var.getBounds());
                i10 = (-(by0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                float L = org.telegram.messenger.g0.L(324.0f);
                i7 = rect.centerX() - ((org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(12.0f)) - ((int) Math.min(L, r4.x * 0.95f)));
            } else {
                i7 = 0;
                i10 = 0;
            }
            zx0 zx0Var = new zx0(cy0Var, cy0Var, cy0Var.getParentActivity(), Integer.valueOf(i7), by0Var, h11VarArr);
            String S = cy0Var.getMediaDataController().S();
            if (S != null && S.startsWith("animated_")) {
                try {
                    zx0Var.setSelected(Long.valueOf(Long.parseLong(S.substring(9))));
                } catch (Exception unused) {
                }
            }
            ArrayList arrayList = cy0Var.getMediaDataController().h;
            ArrayList arrayList2 = new ArrayList(20);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ch.p0 p0Var = new ch.p0();
                p0Var.f = ((TLRPC.TL_availableReaction) arrayList.get(i11)).reaction;
                arrayList2.add(p0Var);
            }
            zx0Var.setRecentReactions(arrayList2);
            zx0Var.setSaveState(3);
            zx0Var.y(m5Var, by0Var);
            ay0 ay0Var = new ay0(cy0Var, zx0Var);
            cy0Var.n = ay0Var;
            h11VarArr[0] = ay0Var;
            ay0Var.showAsDropDown(by0Var, 0, i10, 53);
            h11VarArr[0].b();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746191, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new gs0(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.a = ek0Var;
        ek0Var.r1();
        this.a.setSectionsDrawBackground(true);
        ((v4.l) this.a.getItemAnimator()).m = false;
        this.a.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.a;
        yx0 yx0Var = new yx0(this, context);
        this.b = yx0Var;
        ek0Var2.setAdapter(yx0Var);
        this.a.setOnItemClickListener(new xx0(this, 0));
        frameLayout.addView(this.a, c8.na.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.b.f();
        h0();
        return frameLayout;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 != this.currentAccount) {
            return;
        }
        if (i7 == org.telegram.messenger.ks.Y4) {
            this.b.f();
        } else if (i7 == org.telegram.messenger.ks.i5) {
            h0();
            this.b.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        return c8.ta.a(new g6(20, this), org.telegram.ui.ActionBar.n6.d6, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.z6, org.telegram.ui.ActionBar.n6.i6, org.telegram.ui.ActionBar.n6.a7, org.telegram.ui.ActionBar.n6.B6, org.telegram.ui.ActionBar.n6.p7, org.telegram.ui.ActionBar.n6.f6, org.telegram.ui.ActionBar.n6.g6, org.telegram.ui.ActionBar.n6.O6, org.telegram.ui.ActionBar.n6.P6, org.telegram.ui.ActionBar.n6.Q6, org.telegram.ui.ActionBar.n6.R6);
    }

    public final void h0() {
        this.f = 2;
        this.c = 1;
        if (!org.telegram.messenger.i10.i(this.currentAccount).q()) {
            this.e = -1;
            this.d = this.f;
        } else {
            this.d = -1;
            int i7 = this.f;
            this.f = i7 + 1;
            this.e = i7;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        xi.e eVar = this.h;
        if (eVar != null) {
            eVar.b();
            this.h = null;
        }
        org.telegram.messenger.ks notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar2 = new xi.e(notificationCenter, this);
        eVar2.c(org.telegram.messenger.ks.Y4);
        eVar2.c(org.telegram.messenger.ks.i5);
        this.h = eVar2;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        xi.e eVar = this.h;
        if (eVar != null) {
            eVar.b();
            this.h = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
