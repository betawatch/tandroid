package org.telegram.ui;

import android.animation.Animator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class me0 extends qb1 implements org.telegram.messenger.fs, te.b {
    public cb1 E;
    public FrameLayout F;
    public oe0 G;
    public fh.g H;
    public je0 I;
    public Integer J;
    public cx K;
    public qh.b[] L;
    public int M;
    public int N;
    public int O;
    public xi.e P;
    public hi.m3 Q;
    public boolean R;
    public final ui.c S;
    public final ui.f T;
    public final ui.f U;
    public org.telegram.ui.Components.l51 x;
    public boolean y;
    public final te.a w = new te.a(0, this, org.telegram.ui.Components.lr.h, 380, true);
    public final RectF V = new RectF();
    public final RectF W = new RectF();
    public final he0 X = new he0(this, 0);

    public me0() {
        if (Build.VERSION.SDK_INT >= 31) {
            ui.f fVar = new ui.f(null);
            ca.i iVar = new ca.i(this, false);
            if (fVar.c == null) {
                fVar.c = new dh.i(fVar.b, iVar);
            }
            this.T = fVar;
            ui.f fVar2 = new ui.f(null);
            ca.i iVar2 = new ca.i(this, true);
            if (fVar2.c == null) {
                fVar2.c = new dh.i(fVar2.b, iVar2);
            }
            this.U = fVar2;
        } else {
            this.T = null;
            this.U = null;
        }
        this.S = new ui.c();
        y8 y8Var = new y8(this, 5);
        setBulletinDelegate(y8Var);
        org.telegram.ui.Components.gc.a(this.b, y8Var);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static boolean d0(org.telegram.ui.me0 r28, android.view.View r29) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.me0.d0(org.telegram.ui.me0, android.view.View):boolean");
    }

    public static void e0(me0 me0Var) {
        org.telegram.messenger.j10 userConfig = me0Var.getUserConfig();
        if (!userConfig.X) {
            userConfig.X = true;
            userConfig.v(false);
        }
        me0Var.m0(true, true);
        org.telegram.messenger.ks.f(me0Var.currentAccount).k(org.telegram.messenger.ks.R5, new Object[0]);
    }

    public static void f0(me0 me0Var) {
        me0Var.getClass();
        int i7 = 0;
        Integer num = null;
        for (int i10 = 3; i10 >= 0; i10--) {
            if (!org.telegram.messenger.j10.i(i10).p()) {
                i7++;
                if (num == null) {
                    num = Integer.valueOf(i10);
                }
            }
        }
        if (!org.telegram.messenger.j10.o()) {
            i7--;
        }
        if (i7 > 0 && num != null) {
            me0Var.presentFragment(new ee0(num.intValue()));
        } else {
            if (org.telegram.messenger.j10.o()) {
                return;
            }
            me0Var.showDialog(new ug.l0(7, me0Var.currentAccount, me0Var.getParentActivity(), me0Var, null));
        }
    }

    public static /* synthetic */ void g0(me0 me0Var, int i7, org.telegram.ui.Components.y60 y60Var) {
        if (me0Var.currentAccount == i7) {
            return;
        }
        y60Var.v();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.O0(i7);
        }
    }

    public static void h0(me0 me0Var) {
        org.telegram.messenger.j10 userConfig = me0Var.getUserConfig();
        if (userConfig.X) {
            userConfig.X = false;
            userConfig.v(false);
        }
        me0Var.m0(false, true);
        org.telegram.messenger.ks.f(me0Var.currentAccount).k(org.telegram.messenger.ks.R5, new Object[0]);
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            o0();
            n0();
        }
    }

    @Override // org.telegram.ui.qb1
    public final org.telegram.ui.ActionBar.h2 a0(int i7) {
        if (i7 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        }
        if (i7 == 2) {
            if (!getUserConfig().X) {
                return new o31(a8.p0.k("hasMainTabs", true));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("needFinishFragment", false);
            bundle2.putBoolean("hasMainTabs", true);
            return new i9(bundle2);
        }
        if (i7 == 0) {
            cx cxVar = new cx(a8.p0.k("hasMainTabs", true));
            this.K = cxVar;
            cxVar.K3 = new f(this, 23);
            return cxVar;
        }
        if (i7 != 3) {
            return null;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putLong("user_id", org.telegram.messenger.j10.i(this.currentAccount).e());
        bundle3.putBoolean("my_profile", true);
        bundle3.putBoolean("hasMainTabs", true);
        return new ProfileActivity(bundle3, null);
    }

    @Override // org.telegram.ui.qb1, org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d6));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.h2 c02 = c0();
        return c02 != null && c02.canBeginSlide();
    }

    @Override // org.telegram.ui.qb1, org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        super.createView(context);
        oe0 oe0Var = new oe0(context, this.resourceProvider);
        this.G = oe0Var;
        final int i7 = 0;
        oe0Var.setClipChildren(false);
        this.G.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.G.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        qh.b[] bVarArr = new qh.b[5];
        this.L = bVarArr;
        bVarArr[0] = qh.b.c(context, this.resourceProvider, qh.a.n, 2131748515);
        final int i10 = 1;
        this.L[1] = qh.b.c(context, this.resourceProvider, qh.a.f, 2131748514);
        final int i11 = 2;
        this.L[2] = qh.b.c(context, this.resourceProvider, qh.a.r, 2131745300);
        final int i12 = 3;
        this.L[3] = qh.b.c(context, this.resourceProvider, qh.a.h, 2131748516);
        qh.b[] bVarArr2 = this.L;
        org.telegram.ui.ActionBar.i6 i6Var = this.resourceProvider;
        int i13 = this.currentAccount;
        qh.b bVar = new qh.b(context);
        bVar.a.setText(org.telegram.messenger.gd.M0(2131748513, null));
        bVar.b.setVisibility(8);
        TLRPC.User c22 = org.telegram.messenger.mp.u1(i13).c2(Long.valueOf(org.telegram.messenger.j10.i(i13).e()));
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(0, c22);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        q9Var.f(c22, b9Var);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        bVar.c = q9Var;
        bVar.addView(q9Var, c8.ma.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Tl, i6Var);
        bVar.s = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Rl, i6Var);
        bVar.w = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Sl, i6Var);
        bVar.a();
        bVarArr2[4] = bVar;
        this.L[0].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.ie0
            public final /* synthetic */ me0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i7;
                int i15 = 3;
                me0 me0Var = this.b;
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(me0Var, view);
                            I.c(R.drawable.msg_contact_add, org.telegram.messenger.gd.M0(2131748091, null), new he0(me0Var, 5), false);
                            I.c(R.drawable.msg_calls, org.telegram.messenger.gd.M0(2131743202, null), new he0(me0Var, 6), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            I.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I.X(d02);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.y60 I2 = org.telegram.ui.Components.y60.I(me0Var, view);
                            I2.c(R.drawable.menu_call_create, org.telegram.messenger.gd.M0(2131749298, null), new he0(me0Var, 2), false);
                            if (me0Var.getUserConfig().X) {
                                I2.c(R.drawable.msg_archive_hide, org.telegram.messenger.gd.M0(2131749130, null), new he0(me0Var, i15), false);
                            } else {
                                I2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.gd.M0(2131749269, null), new he0(me0Var, 4), false);
                            }
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I2.X(d03);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        me0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.L[1].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.ie0
            public final /* synthetic */ me0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i10;
                int i15 = 3;
                me0 me0Var = this.b;
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(me0Var, view);
                            I.c(R.drawable.msg_contact_add, org.telegram.messenger.gd.M0(2131748091, null), new he0(me0Var, 5), false);
                            I.c(R.drawable.msg_calls, org.telegram.messenger.gd.M0(2131743202, null), new he0(me0Var, 6), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            I.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I.X(d02);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.y60 I2 = org.telegram.ui.Components.y60.I(me0Var, view);
                            I2.c(R.drawable.menu_call_create, org.telegram.messenger.gd.M0(2131749298, null), new he0(me0Var, 2), false);
                            if (me0Var.getUserConfig().X) {
                                I2.c(R.drawable.msg_archive_hide, org.telegram.messenger.gd.M0(2131749130, null), new he0(me0Var, i15), false);
                            } else {
                                I2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.gd.M0(2131749269, null), new he0(me0Var, 4), false);
                            }
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I2.X(d03);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        me0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.L[3].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.ie0
            public final /* synthetic */ me0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i11;
                int i15 = 3;
                me0 me0Var = this.b;
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(me0Var, view);
                            I.c(R.drawable.msg_contact_add, org.telegram.messenger.gd.M0(2131748091, null), new he0(me0Var, 5), false);
                            I.c(R.drawable.msg_calls, org.telegram.messenger.gd.M0(2131743202, null), new he0(me0Var, 6), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            I.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I.X(d02);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.y60 I2 = org.telegram.ui.Components.y60.I(me0Var, view);
                            I2.c(R.drawable.menu_call_create, org.telegram.messenger.gd.M0(2131749298, null), new he0(me0Var, 2), false);
                            if (me0Var.getUserConfig().X) {
                                I2.c(R.drawable.msg_archive_hide, org.telegram.messenger.gd.M0(2131749130, null), new he0(me0Var, i15), false);
                            } else {
                                I2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.gd.M0(2131749269, null), new he0(me0Var, 4), false);
                            }
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I2.X(d03);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        me0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.L[4].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.ie0
            public final /* synthetic */ me0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i12;
                int i15 = 3;
                me0 me0Var = this.b;
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(me0Var, view);
                            I.c(R.drawable.msg_contact_add, org.telegram.messenger.gd.M0(2131748091, null), new he0(me0Var, 5), false);
                            I.c(R.drawable.msg_calls, org.telegram.messenger.gd.M0(2131743202, null), new he0(me0Var, 6), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            I.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I.X(d02);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (me0Var.getParentActivity() != null && me0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.y60 I2 = org.telegram.ui.Components.y60.I(me0Var, view);
                            I2.c(R.drawable.menu_call_create, org.telegram.messenger.gd.M0(2131749298, null), new he0(me0Var, 2), false);
                            if (me0Var.getUserConfig().X) {
                                I2.c(R.drawable.msg_archive_hide, org.telegram.messenger.gd.M0(2131749130, null), new he0(me0Var, i15), false);
                            } else {
                                I2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.gd.M0(2131749269, null), new he0(me0Var, 4), false);
                            }
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), me0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I2.X(d03);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        me0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.G.Q.add(this.L[0]);
        this.G.Q.add(this.L[1]);
        this.G.Q.add(this.L[4]);
        this.G.Q.add(this.L[3]);
        int i14 = 0;
        while (true) {
            qh.b[] bVarArr3 = this.L;
            if (i14 >= bVarArr3.length) {
                break;
            }
            qh.b bVar2 = bVarArr3[i14];
            bVar2.setOnClickListener(new ci.q(this, i14 > 2 ? i14 - 1 : i14, 27));
            this.G.addView(this.L[i14]);
            this.G.j(bVar2, true, false);
            i14++;
        }
        m0(getUserConfig().X, false);
        s0(this.c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.d6);
        ui.c cVar = this.S;
        cVar.a(themedColor);
        jh.k kVar = new jh.k(this.b);
        ui.a aVar = this.T;
        if (aVar == null) {
            aVar = cVar;
        }
        ui.a aVar2 = this.U;
        if (aVar2 == null) {
            aVar2 = cVar;
        }
        dh.c cVar2 = new dh.c(aVar, aVar2, cVar);
        k0 k0Var = this.b;
        cVar2.h = kVar;
        cVar2.i = k0Var;
        cVar2.k = true;
        fh.g c10 = cVar2.c(this.G, c8.i0.g(this.resourceProvider), false);
        this.H = c10;
        c10.r(org.telegram.messenger.g0.L(28.0f));
        this.H.q(org.telegram.messenger.g0.L(7.666f));
        this.G.setBackground(this.H);
        dh.c cVar3 = new dh.c(cVar, cVar, cVar);
        k0 k0Var2 = this.b;
        cVar3.h = kVar;
        cVar3.i = k0Var2;
        this.I = new je0(context);
        dh.d dVar = new dh.d(cVar3.c(this.I, null, false));
        dVar.b(org.telegram.messenger.g0.L(60.0f), true);
        this.I.setBackground(dVar);
        this.b.addView(this.I, c8.ma.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        frameLayout.setOnClickListener(new bi.o(24));
        this.F.addView(this.G, c8.ma.e(-1, 72, 81));
        this.F.setClipToPadding(false);
        this.b.addView(this.F, c8.ma.e(-1, -2, 80));
        cb1 cb1Var = new cb1(context);
        this.E = cb1Var;
        this.b.addView(cb1Var, c8.ma.e(-1, -2, 80));
        org.telegram.ui.Components.l51 l51Var = ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() ? new org.telegram.ui.Components.l51(getParentActivity(), this.E) : null;
        this.x = l51Var;
        if (l51Var != null) {
            l51Var.updateAppUpdateViews(this.currentAccount, false);
        }
        p0(false);
        return this.b;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        qh.b bVar;
        LaunchActivity launchActivity;
        boolean z10 = false;
        z10 = false;
        if (i7 == org.telegram.messenger.ks.J4 || i7 == org.telegram.messenger.ks.r) {
            View view = this.fragmentView;
            if (view != null && view.isAttachedToWindow()) {
                z10 = true;
            }
            p0(z10);
            return;
        }
        if (i7 == org.telegram.messenger.ks.U4) {
            org.telegram.ui.Components.l51 l51Var = this.x;
            if (l51Var != null) {
                l51Var.updateFileProgress(null);
                this.x.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.Y1) {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = org.telegram.messenger.bz.j1;
            if (tL_help_appUpdate == null || tL_help_appUpdate.document == null) {
                return;
            }
            org.telegram.messenger.t0.u();
            return;
        }
        if (i7 == org.telegram.messenger.ks.Z1) {
            TLRPC.TL_help_appUpdate tL_help_appUpdate2 = org.telegram.messenger.bz.j1;
            if (tL_help_appUpdate2 == null || tL_help_appUpdate2.document == null) {
                return;
            }
            org.telegram.messenger.t0.u();
            return;
        }
        if (i7 == org.telegram.messenger.ks.X1) {
            org.telegram.ui.Components.l51 l51Var2 = this.x;
            if (l51Var2 != null) {
                l51Var2.updateFileProgress(objArr);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.T4) {
            org.telegram.ui.Components.l51 l51Var3 = this.x;
            if (l51Var3 == null || (launchActivity = LaunchActivity.H1) == null) {
                return;
            }
            l51Var3.updateAppUpdateViews(this.currentAccount, launchActivity.e0.size() == 1);
            return;
        }
        if (i7 == org.telegram.messenger.ks.w4) {
            int currentPosition = this.c.getCurrentPosition();
            SparseArray sparseArray = this.a;
            int size = sparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                ob1 ob1Var = (ob1) sparseArray.valueAt(i11);
                if (sparseArray.keyAt(i11) != currentPosition && ob1Var != null) {
                    ob1Var.a.clearViews();
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.R5) {
            m0(getUserConfig().X, true);
            pb1 pb1Var = this.c;
            if (pb1Var == null || pb1Var.getCurrentPosition() != 2) {
                b0(2);
                return;
            }
            this.c.A(0);
            s0(0, true);
            this.y = true;
            return;
        }
        if (i7 != org.telegram.messenger.ks.j0) {
            if (i7 == org.telegram.messenger.ks.S5) {
                l0();
                return;
            }
            return;
        }
        qh.b[] bVarArr = this.L;
        if (bVarArr == null || (bVar = bVarArr[4]) == null) {
            return;
        }
        int i12 = this.currentAccount;
        TLRPC.User c22 = org.telegram.messenger.mp.u1(i12).c2(Long.valueOf(org.telegram.messenger.j10.i(i12).e()));
        bVar.c.f(c22, new org.telegram.ui.Components.b9(0, c22));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        org.telegram.ui.ActionBar.h2 c02 = c0();
        if (c02 != null) {
            return c02.getCustomSlideTransition(z10, z11, f10);
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.ActionBar.q3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.q3.c;
    }

    public final void i0() {
        ui.f fVar;
        View view;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 31 || (fVar = this.T) == null || (view = this.fragmentView) == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = this.fragmentView.getMeasuredHeight();
        k0();
        ri.r f10 = ri.q.f();
        if (!f10.a) {
            fVar = null;
        } else if (!f10.b || i7 < 33) {
            fVar = this.U;
        }
        if (fVar != null) {
            fVar.m(measuredWidth, measuredHeight);
            fVar.c.a();
        }
    }

    public final void j0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.n6.d6);
        pb1 pb1Var = this.c;
        this.S.a(i0.a.f(pb1Var != null ? pb1Var.m(0) : 1.0f, themedColor, themedColor2));
        je0 je0Var = this.I;
        if (je0Var != null) {
            je0Var.invalidate();
        }
        fh.g gVar = this.H;
        if (gVar != null) {
            gVar.updateColors();
        }
        i0();
        je0 je0Var2 = this.I;
        if (je0Var2 != null) {
            je0Var2.invalidate();
        }
        oe0 oe0Var = this.G;
        if (oe0Var != null) {
            oe0Var.invalidate();
        }
        qh.b[] bVarArr = this.L;
        if (bVarArr != null) {
            for (qh.b bVar : bVarArr) {
                bVar.g();
            }
        }
    }

    public final void k0() {
        if (Build.VERSION.SDK_INT < 31 || this.T == null || this.b == null) {
            return;
        }
        cb1 cb1Var = this.E;
        int height = ((this.b.getHeight() - this.M) - ((cb1Var == null || !cb1Var.a()) ? 0 : org.telegram.messenger.g0.L(44.0f))) - org.telegram.messenger.g0.L(8.0f);
        int L = height - org.telegram.messenger.g0.L(56.0f);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.ui.ActionBar.h2 h2Var = ((ob1) sparseArray.valueAt(i7)).a;
            View view = h2Var.fragmentView;
            if (view != null && view.getWidth() > 0 && (h2Var instanceof le0)) {
                if (L >= view.getHeight()) {
                    h2Var.setParentGlass(null, null);
                } else {
                    float L2 = L - org.telegram.messenger.g0.L(1.0f);
                    float width = view.getWidth();
                    float L3 = org.telegram.messenger.g0.L(1.0f) + height;
                    RectF rectF = this.W;
                    rectF.set(0.0f, L2, width, L3);
                    h2Var.setParentGlass(rectF, this.X);
                }
            }
        }
    }

    public final void l0() {
        if (this.G == null || this.L[1] == null) {
            return;
        }
        boolean w10 = org.telegram.messenger.i5.w();
        if (w10) {
            org.telegram.messenger.mp.h1().edit().putBoolean("askAboutContacts2", true).apply();
        }
        if (org.telegram.messenger.j10.i(this.currentAccount).V && !w10 && org.telegram.messenger.mp.h1().getBoolean("askAboutContacts2", true)) {
            this.L[1].e("!", true, true);
        } else {
            this.L[1].e(null, true, true);
        }
    }

    public final void m0(boolean z10, boolean z11) {
        oe0 oe0Var = this.G;
        if (oe0Var != null) {
            oe0Var.j(this.L[2], !z10, z11);
            this.G.j(this.L[3], z10, z11);
        }
    }

    public final void n0() {
        pb1 pb1Var = this.c;
        if (pb1Var == null || this.I == null) {
            return;
        }
        float a10 = 1.0f - c8.l9.a(Math.abs(3.0f - pb1Var.getPositionAnimated()), 0.0f, 1.0f);
        float T1 = (1.0f - ((1.0f - org.telegram.messenger.g0.T1(0.0f, 1.0f, org.telegram.messenger.g0.R0(this.M))) * a10)) * this.w.e;
        this.I.setAlpha(T1);
        this.I.setTranslationY(a10 * org.telegram.messenger.g0.L(48.0f));
        this.I.setVisibility(T1 > 0.0f ? 0 : 8);
    }

    public final void o0() {
        int L = org.telegram.messenger.g0.L(40.0f) + (-(this.E.a() ? org.telegram.messenger.g0.L(44.0f) : 0));
        float f10 = this.w.e;
        this.F.setTranslationY(org.telegram.messenger.g0.W1(f10, L, r0));
        this.G.setClickable(f10 > 1.0f);
        this.G.setEnabled(f10 > 1.0f);
        this.G.setAlpha(f10);
        this.G.setVisibility(f10 <= 0.0f ? 8 : 0);
    }

    @Override // org.telegram.ui.qb1, org.telegram.ui.ActionBar.h2
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.c.A(0);
            }
        }
        return onBackPressed;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.h2 c02 = c0();
        if (c02 != null) {
            c02.onBeginSlide();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        xi.e eVar = new xi.e(org.telegram.messenger.ks.f(this.currentAccount), this);
        eVar.c(org.telegram.messenger.ks.Y1);
        eVar.c(org.telegram.messenger.ks.X1);
        eVar.c(org.telegram.messenger.ks.Z1);
        eVar.c(org.telegram.messenger.ks.J4);
        eVar.c(org.telegram.messenger.ks.r);
        eVar.c(org.telegram.messenger.ks.R5);
        eVar.c(org.telegram.messenger.ks.j0);
        eVar.c(org.telegram.messenger.ks.S5);
        eVar.f(org.telegram.messenger.ks.T4);
        eVar.f(org.telegram.messenger.ks.U4);
        eVar.f(org.telegram.messenger.ks.w4);
        this.P = eVar;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.qb1, org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.gc.h(this.b);
        xi.e eVar = this.P;
        if (eVar != null) {
            eVar.b();
            this.P = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.qb1, org.telegram.ui.ActionBar.h2
    public final void onPause() {
        super.onPause();
        hi.m3 m3Var = this.Q;
        if (m3Var != null) {
            m3Var.f(true);
        }
    }

    @Override // org.telegram.ui.qb1, org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        j0();
        l0();
        p0(true);
        if (this.R) {
            return;
        }
        if (this.Q == null && org.telegram.ui.Components.k30.r.c()) {
            org.telegram.messenger.g0.h3(new he0(this, 7), 1500L);
        }
        this.R = true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onSlideProgress(boolean z10, float f10) {
        org.telegram.ui.ActionBar.h2 c02 = c0();
        if (c02 != null) {
            c02.onSlideProgress(z10, f10);
        }
    }

    @Override // org.telegram.ui.qb1, org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z10) {
        if (this.G == null) {
            return;
        }
        int i7 = org.telegram.messenger.tr.a0(this.currentAccount).L;
        if (i7 <= 0) {
            this.L[0].e(null, false, z10);
        } else {
            this.L[0].e(org.telegram.messenger.gd.E(i7, ','), false, z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.h2 c02 = c0();
        if (c02 != null) {
            c02.prepareFragmentToSlide(z10, z11);
        }
    }

    public final void q0(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.j10.i(i7).p()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList, new pe(25));
        org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(this, view);
        int i10 = 1;
        if (org.telegram.messenger.j10.c() < 4) {
            I.c(R.drawable.msg_addbot, org.telegram.messenger.gd.M0(2131754482, null), new he0(this, i10), false);
        }
        if (arrayList.size() > 0) {
            if (I.y() > 0) {
                I.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int intValue = ((Integer) obj).intValue();
                boolean z10 = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i12 = org.telegram.ui.ActionBar.n6.i6;
                Drawable a02 = org.telegram.ui.ActionBar.n6.a0(getThemedColor(i12), 0, 0);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
                org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(a02);
                org.telegram.ui.ActionBar.u6.j(linearLayout, a02, null, M, resourceProvider);
                TLRPC.User f10 = org.telegram.messenger.j10.i(intValue).f();
                org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
                b9Var.r(f10);
                hi.q3 q3Var = new hi.q3(this, getParentActivity(), z10);
                linearLayout.addView(q3Var, c8.ma.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(getParentActivity());
                if (z10) {
                    q9Var.setScaleX(0.833f);
                    q9Var.setScaleY(0.833f);
                }
                q9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                q9Var.getImageReceiver().d = intValue;
                q9Var.f(f10, b9Var);
                q3Var.addView(q9Var, c8.ma.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, getResourceProvider());
                textView.setText(org.telegram.messenger.o10.q(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.ma.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.e5(this, intValue, I, 18));
                I.r(linearLayout, c8.ma.o(org.telegram.messenger.ks.G3, 48));
            }
        }
        I.u = true;
        I.v = true;
        I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), getThemedColor(org.telegram.ui.ActionBar.n6.d6));
        d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
        I.X(d02);
        I.a0();
        org.telegram.ui.Components.k30.r.a();
    }

    public final cx r0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        cx cxVar = new cx(bundle);
        this.K = cxVar;
        cxVar.K3 = new f(this, 23);
        this.a.put(0, new ob1(cxVar));
        return this.K;
    }

    public final void s0(int i7, boolean z10) {
        int i10 = 0;
        while (true) {
            qh.b[] bVarArr = this.L;
            if (i10 >= bVarArr.length) {
                return;
            }
            bVarArr[i10].f((i10 > 2 ? i10 + (-1) : i10) == i7, z10);
            i10++;
        }
    }

    public final void t0(boolean z10, float f10) {
        int i7 = 0;
        while (i7 < this.L.length) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i7 > 2 ? i7 - 1 : i7) - f10));
            qh.b bVar = this.L[i7];
            bVar.K = max;
            bVar.J = z10;
            bVar.invalidate();
            i7++;
        }
        this.G.invalidate();
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
