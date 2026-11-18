package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ey0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public org.telegram.ui.Components.ck0 a;
    public ay0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public xi.e h;
    public cy0 n;

    public ey0() {
        super(null);
        this.d = -1;
    }

    public static void Z(ey0 ey0Var, View view) {
        int i7;
        int i10;
        if (view instanceof org.telegram.ui.Cells.x) {
            org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
            if (xVar.n && !ey0Var.getUserConfig().q()) {
                ey0Var.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) ey0Var, 4, true));
                return;
            } else {
                org.telegram.messenger.ri.d0(ey0Var.currentAccount).f2(xVar.f.reaction);
                ey0Var.a.getAdapter().k(0, ey0Var.a.getAdapter().b());
                return;
            }
        }
        if (view instanceof dy0) {
            dy0 dy0Var = (dy0) view;
            if (ey0Var.n != null) {
                return;
            }
            i11[] i11VarArr = new i11[1];
            org.telegram.ui.Components.m5 m5Var = dy0Var.a;
            if (m5Var != null) {
                m5Var.f();
                dy0Var.b();
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(m5Var.getBounds());
                i10 = (-(dy0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                float L = org.telegram.messenger.g0.L(324.0f);
                i7 = rect.centerX() - ((org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(12.0f)) - ((int) Math.min(L, r4.x * 0.95f)));
            } else {
                i7 = 0;
                i10 = 0;
            }
            by0 by0Var = new by0(ey0Var, ey0Var, ey0Var.getParentActivity(), Integer.valueOf(i7), dy0Var, i11VarArr);
            String S = ey0Var.getMediaDataController().S();
            if (S != null && S.startsWith("animated_")) {
                try {
                    by0Var.setSelected(Long.valueOf(Long.parseLong(S.substring(9))));
                } catch (Exception unused) {
                }
            }
            ArrayList arrayList = ey0Var.getMediaDataController().h;
            ArrayList arrayList2 = new ArrayList(20);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ch.p0 p0Var = new ch.p0();
                p0Var.f = ((TLRPC.TL_availableReaction) arrayList.get(i11)).reaction;
                arrayList2.add(p0Var);
            }
            by0Var.setRecentReactions(arrayList2);
            by0Var.setSaveState(3);
            by0Var.y(m5Var, dy0Var);
            cy0 cy0Var = new cy0(ey0Var, by0Var);
            ey0Var.n = cy0Var;
            i11VarArr[0] = cy0Var;
            cy0Var.showAsDropDown(dy0Var, 0, i10, 53);
            i11VarArr[0].b();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131746192, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.a = ck0Var;
        ck0Var.r1();
        this.a.setSectionsDrawBackground(true);
        ((v4.k) this.a.getItemAnimator()).m = false;
        this.a.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ck0 ck0Var2 = this.a;
        ay0 ay0Var = new ay0(this, context);
        this.b = ay0Var;
        ck0Var2.setAdapter(ay0Var);
        this.a.setOnItemClickListener(new zx0(this, 0));
        frameLayout.addView(this.a, c8.ma.c(-1.0f, -1));
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

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        return c8.sa.a(new f6(20, this), org.telegram.ui.ActionBar.n6.d6, org.telegram.ui.ActionBar.n6.G6, org.telegram.ui.ActionBar.n6.z6, org.telegram.ui.ActionBar.n6.i6, org.telegram.ui.ActionBar.n6.a7, org.telegram.ui.ActionBar.n6.B6, org.telegram.ui.ActionBar.n6.p7, org.telegram.ui.ActionBar.n6.f6, org.telegram.ui.ActionBar.n6.g6, org.telegram.ui.ActionBar.n6.O6, org.telegram.ui.ActionBar.n6.P6, org.telegram.ui.ActionBar.n6.Q6, org.telegram.ui.ActionBar.n6.R6);
    }

    public final void h0() {
        this.f = 2;
        this.c = 1;
        if (!org.telegram.messenger.j10.i(this.currentAccount).q()) {
            this.e = -1;
            this.d = this.f;
        } else {
            this.d = -1;
            int i7 = this.f;
            this.f = i7 + 1;
            this.e = i7;
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
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

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        xi.e eVar = this.h;
        if (eVar != null) {
            eVar.b();
            this.h = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
