package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ay0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public org.telegram.ui.Components.pj0 a;
    public wx0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ab.b0 h;
    public yx0 n;

    public ay0() {
        super(null);
        this.d = -1;
    }

    public static void Z(ay0 ay0Var, View view) {
        int i7;
        int i10;
        if (view instanceof org.telegram.ui.Cells.x) {
            org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
            if (xVar.n && !ay0Var.getUserConfig().q()) {
                ay0Var.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) ay0Var, 4, true));
                return;
            } else {
                org.telegram.messenger.ui.b0(ay0Var.currentAccount).a2(xVar.f.reaction);
                ay0Var.a.getAdapter().k(0, ay0Var.a.getAdapter().b());
                return;
            }
        }
        if (view instanceof zx0) {
            zx0 zx0Var = (zx0) view;
            if (ay0Var.n != null) {
                return;
            }
            h11[] h11VarArr = new h11[1];
            org.telegram.ui.Components.g5 g5Var = zx0Var.a;
            if (g5Var != null) {
                g5Var.f();
                zx0Var.b();
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(g5Var.getBounds());
                i10 = (-(zx0Var.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                float L = org.telegram.messenger.g0.L(324.0f);
                i7 = rect.centerX() - ((org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(12.0f)) - ((int) Math.min(L, r4.x * 0.95f)));
            } else {
                i7 = 0;
                i10 = 0;
            }
            xx0 xx0Var = new xx0(ay0Var, ay0Var, ay0Var.getParentActivity(), Integer.valueOf(i7), zx0Var, h11VarArr);
            String Q = ay0Var.getMediaDataController().Q();
            if (Q != null && Q.startsWith("animated_")) {
                try {
                    xx0Var.setSelected(Long.valueOf(Long.parseLong(Q.substring(9))));
                } catch (Exception unused) {
                }
            }
            ArrayList arrayList = ay0Var.getMediaDataController().h;
            ArrayList arrayList2 = new ArrayList(20);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ch.o0 o0Var = new ch.o0();
                o0Var.f = ((TLRPC.TL_availableReaction) arrayList.get(i11)).reaction;
                arrayList2.add(o0Var);
            }
            xx0Var.setRecentReactions(arrayList2);
            xx0Var.setSaveState(3);
            xx0Var.y(g5Var, zx0Var);
            yx0 yx0Var = new yx0(ay0Var, xx0Var);
            ay0Var.n = yx0Var;
            h11VarArr[0] = yx0Var;
            yx0Var.showAsDropDown(zx0Var, 0, i10, 53);
            h11VarArr[0].b();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746386, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new nt0(this, 5));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.a = pj0Var;
        pj0Var.r1();
        this.a.setSectionsDrawBackground(true);
        ((v4.k) this.a.getItemAnimator()).m = false;
        this.a.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.a;
        wx0 wx0Var = new wx0(this, context);
        this.b = wx0Var;
        pj0Var2.setAdapter(wx0Var);
        this.a.setOnItemClickListener(new vx0(this, 0));
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
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(20, this), org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.z6, org.telegram.ui.ActionBar.k6.i6, org.telegram.ui.ActionBar.k6.a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.p7, org.telegram.ui.ActionBar.k6.f6, org.telegram.ui.ActionBar.k6.g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
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
