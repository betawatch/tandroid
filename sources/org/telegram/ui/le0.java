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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class le0 extends ob1 implements org.telegram.messenger.fs, te.b {
    public ab1 E;
    public FrameLayout F;
    public ne0 G;
    public fh.g H;
    public ie0 I;
    public Integer J;
    public bx K;
    public qh.b[] L;
    public int M;
    public int N;
    public int O;
    public xi.e P;
    public hi.u3 Q;
    public boolean R;
    public final ui.c S;
    public final ui.f T;
    public final ui.f U;
    public org.telegram.ui.Components.n51 x;
    public boolean y;
    public final te.a w = new te.a(0, this, org.telegram.ui.Components.kr.h, 380, true);
    public final RectF V = new RectF();
    public final RectF W = new RectF();
    public final ge0 X = new ge0(this, 0);

    public le0() {
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
        z8 z8Var = new z8(this, 5);
        setBulletinDelegate(z8Var);
        org.telegram.ui.Components.fc.a(this.b, z8Var);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static boolean d0(org.telegram.ui.le0 r28, android.view.View r29) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.le0.d0(org.telegram.ui.le0, android.view.View):boolean");
    }

    public static void e0(le0 le0Var) {
        org.telegram.messenger.i10 userConfig = le0Var.getUserConfig();
        if (!userConfig.X) {
            userConfig.X = true;
            userConfig.v(false);
        }
        le0Var.m0(true, true);
        org.telegram.messenger.ks.f(le0Var.currentAccount).k(org.telegram.messenger.ks.R5, new Object[0]);
    }

    public static void f0(le0 le0Var) {
        le0Var.getClass();
        int i7 = 0;
        Integer num = null;
        for (int i10 = 3; i10 >= 0; i10--) {
            if (!org.telegram.messenger.i10.i(i10).p()) {
                i7++;
                if (num == null) {
                    num = Integer.valueOf(i10);
                }
            }
        }
        if (!org.telegram.messenger.i10.o()) {
            i7--;
        }
        if (i7 > 0 && num != null) {
            le0Var.presentFragment(new de0(num.intValue()));
        } else {
            if (org.telegram.messenger.i10.o()) {
                return;
            }
            le0Var.showDialog(new ug.k0(7, le0Var.currentAccount, le0Var.getParentActivity(), le0Var, null));
        }
    }

    public static /* synthetic */ void g0(le0 le0Var, int i7, org.telegram.ui.Components.x60 x60Var) {
        if (le0Var.currentAccount == i7) {
            return;
        }
        x60Var.v();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.O0(i7);
        }
    }

    public static void h0(le0 le0Var) {
        org.telegram.messenger.i10 userConfig = le0Var.getUserConfig();
        if (userConfig.X) {
            userConfig.X = false;
            userConfig.v(false);
        }
        le0Var.m0(false, true);
        org.telegram.messenger.ks.f(le0Var.currentAccount).k(org.telegram.messenger.ks.R5, new Object[0]);
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            o0();
            n0();
        }
    }

    @Override // org.telegram.ui.ob1
    public final org.telegram.ui.ActionBar.g2 a0(int i7) {
        if (i7 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        }
        if (i7 == 2) {
            if (!getUserConfig().X) {
                return new n31(a8.p0.k("hasMainTabs", true));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("needFinishFragment", false);
            bundle2.putBoolean("hasMainTabs", true);
            return new j9(bundle2);
        }
        if (i7 == 0) {
            bx bxVar = new bx(a8.p0.k("hasMainTabs", true));
            this.K = bxVar;
            bxVar.K3 = new f(this, 23);
            return bxVar;
        }
        if (i7 != 3) {
            return null;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putLong("user_id", org.telegram.messenger.i10.i(this.currentAccount).e());
        bundle3.putBoolean("my_profile", true);
        bundle3.putBoolean("hasMainTabs", true);
        return new ProfileActivity(bundle3, null);
    }

    @Override // org.telegram.ui.ob1, org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d6));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.g2 c02 = c0();
        return c02 != null && c02.canBeginSlide();
    }

    @Override // org.telegram.ui.ob1, org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        super.createView(context);
        ne0 ne0Var = new ne0(context, this.resourceProvider);
        this.G = ne0Var;
        final int i7 = 0;
        ne0Var.setClipChildren(false);
        this.G.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.G.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        qh.b[] bVarArr = new qh.b[5];
        this.L = bVarArr;
        bVarArr[0] = qh.b.c(context, this.resourceProvider, qh.a.n, 2131748514);
        final int i10 = 1;
        this.L[1] = qh.b.c(context, this.resourceProvider, qh.a.f, 2131748513);
        final int i11 = 2;
        this.L[2] = qh.b.c(context, this.resourceProvider, qh.a.r, 2131745299);
        final int i12 = 3;
        this.L[3] = qh.b.c(context, this.resourceProvider, qh.a.h, 2131748515);
        qh.b[] bVarArr2 = this.L;
        org.telegram.ui.ActionBar.i6 i6Var = this.resourceProvider;
        int i13 = this.currentAccount;
        qh.b bVar = new qh.b(context);
        bVar.a.setText(org.telegram.messenger.gd.N0(2131748512, null));
        bVar.b.setVisibility(8);
        TLRPC.User c22 = org.telegram.messenger.mp.u1(i13).c2(Long.valueOf(org.telegram.messenger.i10.i(i13).e()));
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9(0, c22);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.f(c22, a9Var);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        bVar.c = p9Var;
        bVar.addView(p9Var, c8.na.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.x = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Tl, i6Var);
        bVar.s = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Rl, i6Var);
        bVar.w = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Sl, i6Var);
        bVar.a();
        bVarArr2[4] = bVar;
        this.L[0].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.he0
            public final /* synthetic */ le0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i7;
                int i15 = 3;
                le0 le0Var = this.b;
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        if (le0Var.getParentActivity() != null && le0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(le0Var, view);
                            I.c(R.drawable.msg_contact_add, org.telegram.messenger.gd.N0(2131748090, null), new ge0(le0Var, 5), false);
                            I.c(R.drawable.msg_calls, org.telegram.messenger.gd.N0(2131743189, null), new ge0(le0Var, 6), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            I.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I.X(d02);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (le0Var.getParentActivity() != null && le0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.x60 I2 = org.telegram.ui.Components.x60.I(le0Var, view);
                            I2.c(R.drawable.menu_call_create, org.telegram.messenger.gd.N0(2131749297, null), new ge0(le0Var, 2), false);
                            if (le0Var.getUserConfig().X) {
                                I2.c(R.drawable.msg_archive_hide, org.telegram.messenger.gd.N0(2131749129, null), new ge0(le0Var, i15), false);
                            } else {
                                I2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.gd.N0(2131749268, null), new ge0(le0Var, 4), false);
                            }
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I2.X(d03);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        le0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.L[1].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.he0
            public final /* synthetic */ le0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i10;
                int i15 = 3;
                le0 le0Var = this.b;
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        if (le0Var.getParentActivity() != null && le0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(le0Var, view);
                            I.c(R.drawable.msg_contact_add, org.telegram.messenger.gd.N0(2131748090, null), new ge0(le0Var, 5), false);
                            I.c(R.drawable.msg_calls, org.telegram.messenger.gd.N0(2131743189, null), new ge0(le0Var, 6), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            I.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I.X(d02);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (le0Var.getParentActivity() != null && le0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.x60 I2 = org.telegram.ui.Components.x60.I(le0Var, view);
                            I2.c(R.drawable.menu_call_create, org.telegram.messenger.gd.N0(2131749297, null), new ge0(le0Var, 2), false);
                            if (le0Var.getUserConfig().X) {
                                I2.c(R.drawable.msg_archive_hide, org.telegram.messenger.gd.N0(2131749129, null), new ge0(le0Var, i15), false);
                            } else {
                                I2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.gd.N0(2131749268, null), new ge0(le0Var, 4), false);
                            }
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I2.X(d03);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        le0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.L[3].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.he0
            public final /* synthetic */ le0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i11;
                int i15 = 3;
                le0 le0Var = this.b;
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        if (le0Var.getParentActivity() != null && le0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(le0Var, view);
                            I.c(R.drawable.msg_contact_add, org.telegram.messenger.gd.N0(2131748090, null), new ge0(le0Var, 5), false);
                            I.c(R.drawable.msg_calls, org.telegram.messenger.gd.N0(2131743189, null), new ge0(le0Var, 6), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            I.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I.X(d02);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (le0Var.getParentActivity() != null && le0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.x60 I2 = org.telegram.ui.Components.x60.I(le0Var, view);
                            I2.c(R.drawable.menu_call_create, org.telegram.messenger.gd.N0(2131749297, null), new ge0(le0Var, 2), false);
                            if (le0Var.getUserConfig().X) {
                                I2.c(R.drawable.msg_archive_hide, org.telegram.messenger.gd.N0(2131749129, null), new ge0(le0Var, i15), false);
                            } else {
                                I2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.gd.N0(2131749268, null), new ge0(le0Var, 4), false);
                            }
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I2.X(d03);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        le0Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.L[4].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: org.telegram.ui.he0
            public final /* synthetic */ le0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i14 = i12;
                int i15 = 3;
                le0 le0Var = this.b;
                switch (i14) {
                    case 0:
                        break;
                    case 1:
                        if (le0Var.getParentActivity() != null && le0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(le0Var, view);
                            I.c(R.drawable.msg_contact_add, org.telegram.messenger.gd.N0(2131748090, null), new ge0(le0Var, 5), false);
                            I.c(R.drawable.msg_calls, org.telegram.messenger.gd.N0(2131743189, null), new ge0(le0Var, 6), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            I.i = 3;
                            ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d02.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I.X(d02);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (le0Var.getParentActivity() != null && le0Var.getParentActivity() != null) {
                            org.telegram.ui.Components.x60 I2 = org.telegram.ui.Components.x60.I(le0Var, view);
                            I2.c(R.drawable.menu_call_create, org.telegram.messenger.gd.N0(2131749297, null), new ge0(le0Var, 2), false);
                            if (le0Var.getUserConfig().X) {
                                I2.c(R.drawable.msg_archive_hide, org.telegram.messenger.gd.N0(2131749129, null), new ge0(le0Var, i15), false);
                            } else {
                                I2.c(R.drawable.menu_add_tab_24, org.telegram.messenger.gd.N0(2131749268, null), new ge0(le0Var, 4), false);
                            }
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -org.telegram.messenger.g0.L(4.0f));
                            ShapeDrawable d03 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(28.0f), le0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
                            d03.getPaint().setShadowLayer(org.telegram.messenger.g0.L(6.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), org.telegram.ui.ActionBar.n6.r1(0.15f, -16777216));
                            I2.X(d03);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        le0Var.q0(view);
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
        fh.g c10 = cVar2.c(this.G, c8.j0.g(this.resourceProvider), false);
        this.H = c10;
        c10.r(org.telegram.messenger.g0.L(28.0f));
        this.H.q(org.telegram.messenger.g0.L(7.666f));
        this.G.setBackground(this.H);
        dh.c cVar3 = new dh.c(cVar, cVar, cVar);
        k0 k0Var2 = this.b;
        cVar3.h = kVar;
        cVar3.i = k0Var2;
        this.I = new ie0(context);
        dh.d dVar = new dh.d(cVar3.c(this.I, null, false));
        dVar.b(org.telegram.messenger.g0.L(60.0f), true);
        this.I.setBackground(dVar);
        this.b.addView(this.I, c8.na.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        frameLayout.setOnClickListener(new bi.o(24));
        this.F.addView(this.G, c8.na.e(-1, 72, 81));
        this.F.setClipToPadding(false);
        this.b.addView(this.F, c8.na.e(-1, -2, 80));
        ab1 ab1Var = new ab1(context);
        this.E = ab1Var;
        this.b.addView(ab1Var, c8.na.e(-1, -2, 80));
        org.telegram.ui.Components.n51 n51Var = ((ApplicationLoaderImpl) org.telegram.messenger.t0.a).q() ? new org.telegram.ui.Components.n51(getParentActivity(), this.E) : null;
        this.x = n51Var;
        if (n51Var != null) {
            n51Var.updateAppUpdateViews(this.currentAccount, false);
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
            org.telegram.ui.Components.n51 n51Var = this.x;
            if (n51Var != null) {
                n51Var.updateFileProgress(null);
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
            org.telegram.ui.Components.n51 n51Var2 = this.x;
            if (n51Var2 != null) {
                n51Var2.updateFileProgress(objArr);
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.T4) {
            org.telegram.ui.Components.n51 n51Var3 = this.x;
            if (n51Var3 == null || (launchActivity = LaunchActivity.H1) == null) {
                return;
            }
            n51Var3.updateAppUpdateViews(this.currentAccount, launchActivity.e0.size() == 1);
            return;
        }
        if (i7 == org.telegram.messenger.ks.w4) {
            int currentPosition = this.c.getCurrentPosition();
            SparseArray sparseArray = this.a;
            int size = sparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                mb1 mb1Var = (mb1) sparseArray.valueAt(i11);
                if (sparseArray.keyAt(i11) != currentPosition && mb1Var != null) {
                    mb1Var.a.clearViews();
                }
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.R5) {
            m0(getUserConfig().X, true);
            nb1 nb1Var = this.c;
            if (nb1Var == null || nb1Var.getCurrentPosition() != 2) {
                b0(2);
                return;
            }
            this.c.C(0);
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
        TLRPC.User c22 = org.telegram.messenger.mp.u1(i12).c2(Long.valueOf(org.telegram.messenger.i10.i(i12).e()));
        bVar.c.f(c22, new org.telegram.ui.Components.a9(0, c22));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        org.telegram.ui.ActionBar.g2 c02 = c0();
        if (c02 != null) {
            return c02.getCustomSlideTransition(z10, z11, f10);
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.ActionBar.p3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.p3.c;
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
        nb1 nb1Var = this.c;
        this.S.a(i0.a.f(nb1Var != null ? nb1Var.o(0) : 1.0f, themedColor, themedColor2));
        ie0 ie0Var = this.I;
        if (ie0Var != null) {
            ie0Var.invalidate();
        }
        fh.g gVar = this.H;
        if (gVar != null) {
            gVar.updateColors();
        }
        i0();
        ie0 ie0Var2 = this.I;
        if (ie0Var2 != null) {
            ie0Var2.invalidate();
        }
        ne0 ne0Var = this.G;
        if (ne0Var != null) {
            ne0Var.invalidate();
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
        ab1 ab1Var = this.E;
        int height = ((this.b.getHeight() - this.M) - ((ab1Var == null || !ab1Var.a()) ? 0 : org.telegram.messenger.g0.L(44.0f))) - org.telegram.messenger.g0.L(8.0f);
        int L = height - org.telegram.messenger.g0.L(56.0f);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.ui.ActionBar.g2 g2Var = ((mb1) sparseArray.valueAt(i7)).a;
            View view = g2Var.fragmentView;
            if (view != null && view.getWidth() > 0 && (g2Var instanceof ke0)) {
                if (L >= view.getHeight()) {
                    g2Var.setParentGlass(null, null);
                } else {
                    float L2 = L - org.telegram.messenger.g0.L(1.0f);
                    float width = view.getWidth();
                    float L3 = org.telegram.messenger.g0.L(1.0f) + height;
                    RectF rectF = this.W;
                    rectF.set(0.0f, L2, width, L3);
                    g2Var.setParentGlass(rectF, this.X);
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
        if (org.telegram.messenger.i10.i(this.currentAccount).V && !w10 && org.telegram.messenger.mp.h1().getBoolean("askAboutContacts2", true)) {
            this.L[1].e("!", true, true);
        } else {
            this.L[1].e(null, true, true);
        }
    }

    public final void m0(boolean z10, boolean z11) {
        ne0 ne0Var = this.G;
        if (ne0Var != null) {
            ne0Var.j(this.L[2], !z10, z11);
            this.G.j(this.L[3], z10, z11);
        }
    }

    public final void n0() {
        nb1 nb1Var = this.c;
        if (nb1Var == null || this.I == null) {
            return;
        }
        float a10 = 1.0f - c8.m9.a(Math.abs(3.0f - nb1Var.getPositionAnimated()), 0.0f, 1.0f);
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

    @Override // org.telegram.ui.ob1, org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.c.C(0);
            }
        }
        return onBackPressed;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.g2 c02 = c0();
        if (c02 != null) {
            c02.onBeginSlide();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
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

    @Override // org.telegram.ui.ob1, org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.fc.h(this.b);
        xi.e eVar = this.P;
        if (eVar != null) {
            eVar.b();
            this.P = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ob1, org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        hi.u3 u3Var = this.Q;
        if (u3Var != null) {
            u3Var.f(true);
        }
    }

    @Override // org.telegram.ui.ob1, org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        j0();
        l0();
        p0(true);
        if (this.R) {
            return;
        }
        if (this.Q == null && org.telegram.ui.Components.k30.r.c()) {
            org.telegram.messenger.g0.h3(new ge0(this, 7), 1500L);
        }
        this.R = true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onSlideProgress(boolean z10, float f10) {
        org.telegram.ui.ActionBar.g2 c02 = c0();
        if (c02 != null) {
            c02.onSlideProgress(z10, f10);
        }
    }

    @Override // org.telegram.ui.ob1, org.telegram.ui.ActionBar.g2
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.g2 c02 = c0();
        if (c02 != null) {
            c02.prepareFragmentToSlide(z10, z11);
        }
    }

    public final void q0(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i7 = 0; i7 < 4; i7++) {
            if (org.telegram.messenger.i10.i(i7).p()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        Collections.sort(arrayList, new pe(25));
        org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(this, view);
        int i10 = 1;
        if (org.telegram.messenger.i10.c() < 4) {
            I.c(R.drawable.msg_addbot, org.telegram.messenger.gd.N0(2131754481, null), new ge0(this, i10), false);
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
                TLRPC.User f10 = org.telegram.messenger.i10.i(intValue).f();
                org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                a9Var.r(f10);
                hi.y3 y3Var = new hi.y3(this, getParentActivity(), z10);
                linearLayout.addView(y3Var, c8.na.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getParentActivity());
                if (z10) {
                    p9Var.setScaleX(0.833f);
                    p9Var.setScaleY(0.833f);
                }
                p9Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
                p9Var.getImageReceiver().d = intValue;
                p9Var.f(f10, a9Var);
                y3Var.addView(p9Var, c8.na.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, getResourceProvider());
                textView.setText(org.telegram.messenger.n10.q(f10));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, c8.na.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.k5(this, intValue, I, 18));
                I.r(linearLayout, c8.na.o(org.telegram.messenger.ks.G3, 48));
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

    public final bx r0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        bx bxVar = new bx(bundle);
        this.K = bxVar;
        bxVar.K3 = new f(this, 23);
        this.a.put(0, new mb1(bxVar));
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
    public final /* synthetic */ void G(float f10, int i7) {
    }
}
