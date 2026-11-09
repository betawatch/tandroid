package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ey0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public org.telegram.ui.Components.qj0 a;
    public ay0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ab.b0 h;
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
                ey0Var.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) ey0Var, 4, true));
                return;
            } else {
                org.telegram.messenger.ui.b0(ey0Var.currentAccount).a2(xVar.f.reaction);
                ey0Var.a.getAdapter().k(0, ey0Var.a.getAdapter().b());
                return;
            }
        }
        if (view instanceof dy0) {
            dy0 dy0Var = (dy0) view;
            if (ey0Var.n != null) {
                return;
            }
            j11[] j11VarArr = new j11[1];
            org.telegram.ui.Components.g5 g5Var = dy0Var.a;
            if (g5Var != null) {
                g5Var.f();
                dy0Var.b();
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(g5Var.getBounds());
                i10 = (-(dy0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                float L = org.telegram.messenger.g0.L(324.0f);
                i7 = rect.centerX() - ((org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(12.0f)) - ((int) Math.min(L, r4.x * 0.95f)));
            } else {
                i7 = 0;
                i10 = 0;
            }
            by0 by0Var = new by0(ey0Var, ey0Var, ey0Var.getParentActivity(), Integer.valueOf(i7), dy0Var, j11VarArr);
            String Q = ey0Var.getMediaDataController().Q();
            if (Q != null && Q.startsWith("animated_")) {
                try {
                    by0Var.setSelected(Long.valueOf(Long.parseLong(Q.substring(9))));
                } catch (Exception unused) {
                }
            }
            ArrayList arrayList = ey0Var.getMediaDataController().h;
            ArrayList arrayList2 = new ArrayList(20);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ch.o0 o0Var = new ch.o0();
                o0Var.f = ((TLRPC.TL_availableReaction) arrayList.get(i11)).reaction;
                arrayList2.add(o0Var);
            }
            by0Var.setRecentReactions(arrayList2);
            by0Var.setSaveState(3);
            by0Var.y(g5Var, dy0Var);
            cy0 cy0Var = new cy0(ey0Var, by0Var);
            ey0Var.n = cy0Var;
            j11VarArr[0] = cy0Var;
            cy0Var.showAsDropDown(dy0Var, 0, i10, 53);
            j11VarArr[0].b();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131746387, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new pt0(this, 5));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.a = qj0Var;
        qj0Var.r1();
        this.a.setSectionsDrawBackground(true);
        ((v4.k) this.a.getItemAnimator()).m = false;
        this.a.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.qj0 qj0Var2 = this.a;
        ay0 ay0Var = new ay0(this, context);
        this.b = ay0Var;
        qj0Var2.setAdapter(ay0Var);
        this.a.setOnItemClickListener(new zx0(this, 0));
        frameLayout.addView(this.a, c8.ha.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.b.f();
        h0();
        return frameLayout;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i10 != this.currentAccount) {
            return;
        }
        if (i7 == org.telegram.messenger.qs.V4) {
            this.b.f();
        } else if (i7 == org.telegram.messenger.qs.f5) {
            h0();
            this.b.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(20, this), org.telegram.ui.ActionBar.l6.d6, org.telegram.ui.ActionBar.l6.G6, org.telegram.ui.ActionBar.l6.z6, org.telegram.ui.ActionBar.l6.i6, org.telegram.ui.ActionBar.l6.a7, org.telegram.ui.ActionBar.l6.B6, org.telegram.ui.ActionBar.l6.p7, org.telegram.ui.ActionBar.l6.f6, org.telegram.ui.ActionBar.l6.g6, org.telegram.ui.ActionBar.l6.O6, org.telegram.ui.ActionBar.l6.P6, org.telegram.ui.ActionBar.l6.Q6, org.telegram.ui.ActionBar.l6.R6);
    }

    public final void h0() {
        this.f = 2;
        this.c = 1;
        if (!org.telegram.messenger.p10.i(this.currentAccount).q()) {
            this.e = -1;
            this.d = this.f;
        } else {
            this.d = -1;
            int i7 = this.f;
            this.f = i7 + 1;
            this.e = i7;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        ab.b0 b0Var = this.h;
        if (b0Var != null) {
            b0Var.b();
            this.h = null;
        }
        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        ab.b0 b0Var2 = new ab.b0(notificationCenter, this);
        b0Var2.c(org.telegram.messenger.qs.V4);
        b0Var2.c(org.telegram.messenger.qs.f5);
        this.h = b0Var2;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ab.b0 b0Var = this.h;
        if (b0Var != null) {
            b0Var.b();
            this.h = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
