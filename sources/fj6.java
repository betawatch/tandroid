// default package

import android.animation.Animator;
import android.app.Activity;
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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fj6 extends iic implements fn7, s84 {
    public kac F;
    public lac G;
    public FrameLayout H;
    public hj6 I;
    public jl0 J;
    public cj6 K;
    public Integer L;
    public uj3 M;
    public uz4[] N;
    public int O;
    public int P;
    public int Q;
    public u8a R;
    public kg5 S;
    public boolean T;
    public final oz4 U;
    public final rz4 V;
    public final rz4 W;
    public boolean w;
    public boolean x;
    public final boolean[] y = new boolean[4];
    public final fm0 E = new fm0(0, this, k43.h, 380, true);
    public final RectF X = new RectF();
    public final RectF Y = new RectF();
    public final aj6 Z = new aj6(this, 0);

    public fj6() {
        if (Build.VERSION.SDK_INT >= 31) {
            rz4 rz4Var = new rz4(null);
            n31 n31Var = new n31(this, false);
            if (rz4Var.c == null) {
                rz4Var.c = new ga9(rz4Var.b, n31Var);
            }
            this.V = rz4Var;
            rz4 rz4Var2 = new rz4(null);
            n31 n31Var2 = new n31(this, true);
            if (rz4Var2.c == null) {
                rz4Var2.c = new ga9(rz4Var2.b, n31Var2);
            }
            this.W = rz4Var2;
        } else {
            this.V = null;
            this.W = null;
        }
        this.U = new oz4();
        t10 t10Var = new t10(this, (byte) 11);
        setBulletinDelegate(t10Var);
        v21.a(this.b, t10Var);
    }

    public static int m0(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1 || i == 2) {
            return 1;
        }
        return (i == 3 || i == 4) ? 2 : 3;
    }

    @Override // iic
    public final e Z(int i) {
        if (i == 1) {
            if (this.w) {
                return new lm7();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        }
        if (i == 2) {
            if (!this.x) {
                return new uba(bs2.l("hasMainTabs", true));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("needFinishFragment", false);
            bundle2.putBoolean("hasMainTabs", true);
            return new i91(bundle2);
        }
        if (i == 0) {
            uj3 uj3Var = new uj3(bs2.l("hasMainTabs", true));
            this.M = uj3Var;
            uj3Var.K3 = new aj3((Object) this, (byte) 18);
            return uj3Var;
        }
        if (i != 3) {
            return null;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putLong("user_id", yac.h(this.currentAccount).e());
        bundle3.putBoolean("my_profile", true);
        bundle3.putBoolean("hasMainTabs", true);
        return new ProfileActivity(bundle3, null);
    }

    @Override // iic, org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.h5));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public final void c0() {
        rz4 rz4Var;
        View view;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 || (rz4Var = this.V) == null || (view = this.fragmentView) == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = this.fragmentView.getMeasuredHeight();
        e0();
        lz4 f = vy4.f();
        if (!f.a) {
            rz4Var = null;
        } else if (!f.b || i < 33) {
            rz4Var = this.W;
        }
        if (rz4Var != null) {
            rz4Var.n(measuredWidth, measuredHeight);
            rz4Var.c.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean canBeginSlide() {
        e b0 = b0();
        return b0 != null && b0.canBeginSlide();
    }

    @Override // iic, org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        super.createView(context);
        hj6 hj6Var = new hj6(context, this.resourceProvider);
        this.I = hj6Var;
        final byte b = 0;
        hj6Var.setClipChildren(false);
        this.I.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f));
        this.I.setMaxWidth(hl.L(344.0f));
        uz4[] uz4VarArr = new uz4[6];
        this.N = uz4VarArr;
        uz4VarArr[0] = uz4.c(context, this.resourceProvider, tz4.r, 2131748461);
        final byte b2 = 1;
        this.N[1] = uz4.c(context, this.resourceProvider, tz4.h, 2131747982);
        final byte b3 = 2;
        this.N[2] = uz4.c(context, this.resourceProvider, tz4.f, 2131748460);
        final byte b4 = 3;
        this.N[3] = uz4.c(context, this.resourceProvider, tz4.s, 2131745223);
        this.N[4] = uz4.c(context, this.resourceProvider, tz4.n, 2131748462);
        uz4[] uz4VarArr2 = this.N;
        vnb vnbVar = this.resourceProvider;
        int i = this.currentAccount;
        uz4 uz4Var = new uz4(context);
        uz4Var.a.setText(ob6.M0(2131748459, null));
        uz4Var.b.setVisibility(8);
        TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(yac.h(i).e()));
        rb0 rb0Var = new rb0(0, X1);
        de0 de0Var = new de0(context);
        de0Var.f(X1, rb0Var);
        de0Var.setRoundRadius(hl.L(11.0f));
        uz4Var.c = de0Var;
        uz4Var.addView(de0Var, tre.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        uz4Var.x = aob.v0(aob.Tl, vnbVar);
        uz4Var.s = aob.v0(aob.Rl, vnbVar);
        uz4Var.w = aob.v0(aob.Sl, vnbVar);
        uz4Var.a();
        uz4VarArr2[5] = uz4Var;
        this.N[0].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: bj6
            public final /* synthetic */ fj6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                byte b5 = b;
                byte b6 = 3;
                fj6 fj6Var = this.b;
                switch (b5) {
                    case 0:
                        break;
                    case 1:
                        if (fj6Var.getParentActivity() != null && fj6Var.getParentActivity() != null) {
                            fu5 I = fu5.I(fj6Var, view);
                            I.b(R.drawable.msg_contact_add, ob6.M0(2131748037, null), new aj6(fj6Var, (byte) 4), false);
                            I.b(R.drawable.msg_calls, ob6.M0(2131743091, null), new aj6(fj6Var, (byte) 5), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -hl.L(4.0f));
                            I.i = (byte) 3;
                            ShapeDrawable b0 = aob.b0(hl.L(28.0f), fj6Var.getThemedColor(aob.d6));
                            b0.getPaint().setShadowLayer(hl.L(6.0f), 0.0f, hl.L(1.0f), aob.p1(0.15f, -16777216));
                            I.X(b0);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (fj6Var.getParentActivity() != null && fj6Var.getParentActivity() != null) {
                            fu5 I2 = fu5.I(fj6Var, view);
                            I2.b(R.drawable.menu_call_create, ob6.M0(2131749244, null), new aj6(fj6Var, (byte) 2), false);
                            I2.b(R.drawable.msg_archive_hide, ob6.M0(2131749076, null), new aj6(fj6Var, b6), false);
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -hl.L(4.0f));
                            ShapeDrawable b02 = aob.b0(hl.L(28.0f), fj6Var.getThemedColor(aob.d6));
                            b02.getPaint().setShadowLayer(hl.L(6.0f), 0.0f, hl.L(1.0f), aob.p1(0.15f, -16777216));
                            I2.X(b02);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        fj6Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.N[2].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: bj6
            public final /* synthetic */ fj6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                byte b5 = b2;
                byte b6 = 3;
                fj6 fj6Var = this.b;
                switch (b5) {
                    case 0:
                        break;
                    case 1:
                        if (fj6Var.getParentActivity() != null && fj6Var.getParentActivity() != null) {
                            fu5 I = fu5.I(fj6Var, view);
                            I.b(R.drawable.msg_contact_add, ob6.M0(2131748037, null), new aj6(fj6Var, (byte) 4), false);
                            I.b(R.drawable.msg_calls, ob6.M0(2131743091, null), new aj6(fj6Var, (byte) 5), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -hl.L(4.0f));
                            I.i = (byte) 3;
                            ShapeDrawable b0 = aob.b0(hl.L(28.0f), fj6Var.getThemedColor(aob.d6));
                            b0.getPaint().setShadowLayer(hl.L(6.0f), 0.0f, hl.L(1.0f), aob.p1(0.15f, -16777216));
                            I.X(b0);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (fj6Var.getParentActivity() != null && fj6Var.getParentActivity() != null) {
                            fu5 I2 = fu5.I(fj6Var, view);
                            I2.b(R.drawable.menu_call_create, ob6.M0(2131749244, null), new aj6(fj6Var, (byte) 2), false);
                            I2.b(R.drawable.msg_archive_hide, ob6.M0(2131749076, null), new aj6(fj6Var, b6), false);
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -hl.L(4.0f));
                            ShapeDrawable b02 = aob.b0(hl.L(28.0f), fj6Var.getThemedColor(aob.d6));
                            b02.getPaint().setShadowLayer(hl.L(6.0f), 0.0f, hl.L(1.0f), aob.p1(0.15f, -16777216));
                            I2.X(b02);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        fj6Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.N[4].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: bj6
            public final /* synthetic */ fj6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                byte b5 = b3;
                byte b6 = 3;
                fj6 fj6Var = this.b;
                switch (b5) {
                    case 0:
                        break;
                    case 1:
                        if (fj6Var.getParentActivity() != null && fj6Var.getParentActivity() != null) {
                            fu5 I = fu5.I(fj6Var, view);
                            I.b(R.drawable.msg_contact_add, ob6.M0(2131748037, null), new aj6(fj6Var, (byte) 4), false);
                            I.b(R.drawable.msg_calls, ob6.M0(2131743091, null), new aj6(fj6Var, (byte) 5), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -hl.L(4.0f));
                            I.i = (byte) 3;
                            ShapeDrawable b0 = aob.b0(hl.L(28.0f), fj6Var.getThemedColor(aob.d6));
                            b0.getPaint().setShadowLayer(hl.L(6.0f), 0.0f, hl.L(1.0f), aob.p1(0.15f, -16777216));
                            I.X(b0);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (fj6Var.getParentActivity() != null && fj6Var.getParentActivity() != null) {
                            fu5 I2 = fu5.I(fj6Var, view);
                            I2.b(R.drawable.menu_call_create, ob6.M0(2131749244, null), new aj6(fj6Var, (byte) 2), false);
                            I2.b(R.drawable.msg_archive_hide, ob6.M0(2131749076, null), new aj6(fj6Var, b6), false);
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -hl.L(4.0f));
                            ShapeDrawable b02 = aob.b0(hl.L(28.0f), fj6Var.getThemedColor(aob.d6));
                            b02.getPaint().setShadowLayer(hl.L(6.0f), 0.0f, hl.L(1.0f), aob.p1(0.15f, -16777216));
                            I2.X(b02);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        fj6Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.N[5].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: bj6
            public final /* synthetic */ fj6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                byte b5 = b4;
                byte b6 = 3;
                fj6 fj6Var = this.b;
                switch (b5) {
                    case 0:
                        break;
                    case 1:
                        if (fj6Var.getParentActivity() != null && fj6Var.getParentActivity() != null) {
                            fu5 I = fu5.I(fj6Var, view);
                            I.b(R.drawable.msg_contact_add, ob6.M0(2131748037, null), new aj6(fj6Var, (byte) 4), false);
                            I.b(R.drawable.msg_calls, ob6.M0(2131743091, null), new aj6(fj6Var, (byte) 5), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -hl.L(4.0f));
                            I.i = (byte) 3;
                            ShapeDrawable b0 = aob.b0(hl.L(28.0f), fj6Var.getThemedColor(aob.d6));
                            b0.getPaint().setShadowLayer(hl.L(6.0f), 0.0f, hl.L(1.0f), aob.p1(0.15f, -16777216));
                            I.X(b0);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (fj6Var.getParentActivity() != null && fj6Var.getParentActivity() != null) {
                            fu5 I2 = fu5.I(fj6Var, view);
                            I2.b(R.drawable.menu_call_create, ob6.M0(2131749244, null), new aj6(fj6Var, (byte) 2), false);
                            I2.b(R.drawable.msg_archive_hide, ob6.M0(2131749076, null), new aj6(fj6Var, b6), false);
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -hl.L(4.0f));
                            ShapeDrawable b02 = aob.b0(hl.L(28.0f), fj6Var.getThemedColor(aob.d6));
                            b02.getPaint().setShadowLayer(hl.L(6.0f), 0.0f, hl.L(1.0f), aob.p1(0.15f, -16777216));
                            I2.X(b02);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        fj6Var.q0(view);
                        break;
                }
                return true;
            }
        });
        this.I.Q.add(this.N[0]);
        this.I.Q.add(this.N[1]);
        this.I.Q.add(this.N[2]);
        this.I.Q.add(this.N[4]);
        this.I.Q.add(this.N[5]);
        int i2 = 0;
        while (true) {
            uz4[] uz4VarArr3 = this.N;
            if (i2 >= uz4VarArr3.length) {
                break;
            }
            uz4 uz4Var2 = uz4VarArr3[i2];
            this.N[i2].setOnClickListener(new w0(this, m0(i2), (byte) 10));
            this.I.addView(this.N[i2]);
            this.I.j(uz4Var2, true, false);
            i2++;
        }
        j0(false);
        t0(this.c.getCurrentPosition(), false);
        int themedColor = getThemedColor(aob.d6);
        oz4 oz4Var = this.U;
        oz4Var.a(themedColor);
        yic yicVar = new yic(this.b);
        mz4 mz4Var = this.V;
        if (mz4Var == null) {
            mz4Var = oz4Var;
        }
        mz4 mz4Var2 = this.W;
        if (mz4Var2 == null) {
            mz4Var2 = oz4Var;
        }
        ll0 ll0Var = new ll0(mz4Var, mz4Var2, oz4Var);
        d26 d26Var = this.b;
        ll0Var.h = yicVar;
        ll0Var.i = d26Var;
        ll0Var.k = true;
        jl0 c = ll0Var.c(this.I, dtd.g(this.resourceProvider), false);
        this.J = c;
        c.r(hl.L(28.0f));
        this.J.q(hl.L(7.666f));
        this.I.setBackground(this.J);
        ll0 ll0Var2 = new ll0(oz4Var, oz4Var, oz4Var);
        d26 d26Var2 = this.b;
        ll0Var2.h = yicVar;
        ll0Var2.i = d26Var2;
        this.K = new cj6(context);
        rl0 rl0Var = new rl0(ll0Var2.c(this.K, null, false));
        rl0Var.b(hl.L(60.0f), true);
        this.K.setBackground(rl0Var);
        this.b.addView(this.K, tre.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.H = frameLayout;
        frameLayout.setOnClickListener(new y00(b2));
        this.H.addView(this.I, tre.e(-1, 72, 81));
        this.H.setClipToPadding(false);
        this.b.addView(this.H, tre.e(-1, -2, 80));
        lac lacVar = new lac(context);
        this.G = lacVar;
        this.b.addView(lacVar, tre.e(-1, -2, 80));
        a aVar = a.a;
        Activity parentActivity = getParentActivity();
        lac lacVar2 = this.G;
        ((ApplicationLoaderImpl) aVar).getClass();
        kac kacVar = new kac(parentActivity, lacVar2);
        this.F = kacVar;
        kacVar.updateAppUpdateViews(this.currentAccount, false);
        l0(false);
        return this.b;
    }

    public final void d0() {
        int themedColor = getThemedColor(aob.a7);
        int themedColor2 = getThemedColor(aob.d6);
        hic hicVar = this.c;
        this.U.a(vm2.f(hicVar != null ? hicVar.p(0) : 1.0f, themedColor, themedColor2));
        cj6 cj6Var = this.K;
        if (cj6Var != null) {
            cj6Var.invalidate();
        }
        jl0 jl0Var = this.J;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        c0();
        cj6 cj6Var2 = this.K;
        if (cj6Var2 != null) {
            cj6Var2.invalidate();
        }
        hj6 hj6Var = this.I;
        if (hj6Var != null) {
            hj6Var.invalidate();
        }
        uz4[] uz4VarArr = this.N;
        if (uz4VarArr != null) {
            for (uz4 uz4Var : uz4VarArr) {
                uz4Var.g();
            }
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        uz4 uz4Var;
        LaunchActivity launchActivity;
        if (i == jn7.J4 || i == 2) {
            View view = this.fragmentView;
            l0(view != null && view.isAttachedToWindow());
            return;
        }
        if (i == jn7.U4) {
            kac kacVar = this.F;
            if (kacVar != null) {
                kacVar.updateFileProgress(null);
                this.F.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i == jn7.Y1) {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = xea.f1;
            if (tL_help_appUpdate == null || tL_help_appUpdate.document == null) {
                return;
            }
            a.t();
            return;
        }
        if (i == jn7.Z1) {
            TLRPC.TL_help_appUpdate tL_help_appUpdate2 = xea.f1;
            if (tL_help_appUpdate2 == null || tL_help_appUpdate2.document == null) {
                return;
            }
            a.t();
            return;
        }
        if (i == jn7.X1) {
            kac kacVar2 = this.F;
            if (kacVar2 != null) {
                kacVar2.updateFileProgress(objArr);
                return;
            }
            return;
        }
        if (i == jn7.T4) {
            kac kacVar3 = this.F;
            if (kacVar3 == null || (launchActivity = LaunchActivity.H1) == null) {
                return;
            }
            kacVar3.updateAppUpdateViews(this.currentAccount, launchActivity.e0.size() == 1);
            return;
        }
        if (i == jn7.w4) {
            int currentPosition = this.c.getCurrentPosition();
            SparseArray sparseArray = this.a;
            int size = sparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                gic gicVar = (gic) sparseArray.valueAt(i3);
                if (sparseArray.keyAt(i3) != currentPosition && gicVar != null) {
                    gicVar.a.clearViews();
                }
            }
            return;
        }
        if (i == jn7.j0) {
            uz4[] uz4VarArr = this.N;
            if (uz4VarArr == null || (uz4Var = uz4VarArr[5]) == null) {
                return;
            }
            int i4 = this.currentAccount;
            TLRPC.User X1 = uc7.s1(i4).X1(Long.valueOf(yac.h(i4).e()));
            uz4Var.c.f(X1, new rb0(0, X1));
            return;
        }
        if (i == jn7.S5) {
            f0();
        } else if (i == jn7.S3 || i == jn7.i5 || i == jn7.R5) {
            g0();
        }
    }

    public final void e0() {
        if (Build.VERSION.SDK_INT < 31 || this.V == null || this.b == null) {
            return;
        }
        lac lacVar = this.G;
        int height = ((this.b.getHeight() - this.O) - ((lacVar == null || !lacVar.a()) ? 0 : hl.L(44.0f))) - hl.L(8.0f);
        int L = height - hl.L(56.0f);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            e eVar = ((gic) sparseArray.valueAt(i)).a;
            View view = eVar.fragmentView;
            if (view != null && view.getWidth() > 0) {
                if (L >= view.getHeight()) {
                    eVar.setParentGlass(null, null);
                } else {
                    float L2 = L - hl.L(1.0f);
                    float width = view.getWidth();
                    float L3 = hl.L(1.0f) + height;
                    RectF rectF = this.Y;
                    rectF.set(0.0f, L2, width, L3);
                    eVar.setParentGlass(rectF, this.Z);
                }
            }
        }
    }

    public final void f0() {
        uz4 uz4Var;
        if (this.I == null || (uz4Var = this.N[2]) == null) {
            return;
        }
        if (this.w) {
            uz4Var.e(null, true, false);
            return;
        }
        boolean w = lv2.w();
        if (w) {
            uc7.f1().edit().putBoolean("askAboutContacts2", true).apply();
        }
        if (yac.h(this.currentAccount).V && !w && uc7.f1().getBoolean("askAboutContacts2", true)) {
            this.N[2].e("!", true, true);
        } else {
            this.N[2].e(null, true, true);
        }
    }

    public final void g0() {
        boolean E3 = getMessagesController().E3();
        boolean w = getMessagesController().w();
        boolean z = E3 != this.w;
        boolean z2 = w != this.x;
        if (z || z2) {
            this.w = E3;
            this.x = w;
            boolean[] zArr = this.y;
            if (z) {
                zArr[1] = true;
            }
            if (z2) {
                zArr[2] = true;
            }
            View view = this.fragmentView;
            if (view != null && this.I != null) {
                j0(view.isAttachedToWindow());
                f0();
            }
            h0(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        e b0 = b0();
        if (b0 != null) {
            return b0.getCustomSlideTransition(z, z2, f);
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final jt3 getEdgeToEdgeSupportMode() {
        return jt3.c;
    }

    @Override // iic, org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        return super.getThemeDescriptions();
    }

    public final void h0(boolean z) {
        hic hicVar;
        View view = this.fragmentView;
        boolean[] zArr = this.y;
        if (view == null || (hicVar = this.c) == null) {
            for (int i = 0; i < zArr.length; i++) {
                if (zArr[i]) {
                    a0(i);
                    zArr[i] = false;
                }
            }
            return;
        }
        if (hicVar.I || hicVar.s() || this.c.getViewPages()[1] != null) {
            return;
        }
        int currentPosition = this.c.getCurrentPosition();
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (zArr[i2]) {
                if (currentPosition != i2) {
                    a0(i2);
                    zArr[i2] = false;
                } else if (z) {
                    hl.c3(new aj6(this, (byte) 6));
                } else {
                    this.c.F(0);
                    t0(0, true);
                }
            }
        }
    }

    public final void i0() {
        hic hicVar = this.c;
        if (hicVar == null || this.K == null) {
            return;
        }
        float a = 1.0f - ete.a(Math.abs(3.0f - hicVar.getPositionAnimated()), 0.0f, 1.0f);
        float R1 = (1.0f - ((1.0f - hl.R1(0.0f, 1.0f, hl.Q0(this.O))) * a)) * this.E.e;
        this.K.setAlpha(R1);
        this.K.setTranslationY(a * hl.L(48.0f));
        this.K.setVisibility(R1 > 0.0f ? 0 : 8);
    }

    public final void j0(boolean z) {
        hj6 hj6Var = this.I;
        if (hj6Var != null) {
            hj6Var.j(this.N[1], this.w, z);
            this.I.j(this.N[2], !this.w, z);
            this.I.j(this.N[3], !this.x, z);
            this.I.j(this.N[4], this.x, z);
        }
    }

    public final void k0() {
        int L = hl.L(40.0f) + (-(this.G.a() ? hl.L(44.0f) : 0));
        float f = this.E.e;
        this.H.setTranslationY(hl.U1(f, L, r0));
        this.I.setClickable(f > 1.0f);
        this.I.setEnabled(f > 1.0f);
        this.I.setAlpha(f);
        this.I.setVisibility(f <= 0.0f ? 8 : 0);
    }

    public final void l0(boolean z) {
        if (this.I == null) {
            return;
        }
        int i = kf7.a0(this.currentAccount).L;
        if (i <= 0) {
            this.N[0].e(null, false, z);
        } else {
            this.N[0].e(ob6.E(i, ','), false, z);
        }
    }

    public final /* synthetic */ void n0(int i, fu5 fu5Var) {
        if (this.currentAccount != i) {
            fu5Var.u();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.N0(i);
            }
        }
    }

    public final void o0() {
        int i = 0;
        Integer num = null;
        for (int i2 = 3; i2 >= 0; i2--) {
            if (!yac.h(i2).o()) {
                i++;
                if (num == null) {
                    num = Integer.valueOf(i2);
                }
            }
        }
        if (!yac.n()) {
            i--;
        }
        if (i > 0 && num != null) {
            presentFragment(new qh6(num.intValue()));
        } else {
            if (yac.n()) {
                return;
            }
            showDialog(new l46(7, this.currentAccount, null, getParentActivity(), this));
        }
    }

    @Override // iic, org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        boolean onBackPressed = super.onBackPressed(z);
        if (onBackPressed && this.c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z) {
                this.c.F(0);
            }
        }
        return onBackPressed;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBeginSlide() {
        super.onBeginSlide();
        e b0 = b0();
        if (b0 != null) {
            b0.onBeginSlide();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        u8a u8aVar = new u8a(jn7.f(this.currentAccount), this);
        u8aVar.b(jn7.Y1);
        u8aVar.b(jn7.X1);
        u8aVar.b(jn7.Z1);
        u8aVar.b(jn7.J4);
        u8aVar.b(2);
        u8aVar.b(jn7.j0);
        u8aVar.b(jn7.S5);
        u8aVar.b(jn7.S3);
        u8aVar.b(jn7.i5);
        u8aVar.b(jn7.R5);
        u8aVar.e(jn7.T4);
        u8aVar.e(jn7.U4);
        u8aVar.e(jn7.w4);
        this.R = u8aVar;
        this.w = getMessagesController().E3();
        this.x = getMessagesController().w();
        return super.onFragmentCreate();
    }

    @Override // iic, org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        v21.h(this.b);
        u8a u8aVar = this.R;
        if (u8aVar != null) {
            u8aVar.a();
            this.R = null;
        }
        super.onFragmentDestroy();
    }

    @Override // iic, org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        kg5 kg5Var = this.S;
        if (kg5Var != null) {
            kg5Var.f(true);
        }
    }

    @Override // iic, org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        d0();
        f0();
        l0(true);
        g0();
        h0(false);
        if (this.T) {
            return;
        }
        if (this.S == null && mg5.r.c()) {
            hl.d3(new aj6(this, (byte) 7), 1500L);
        }
        this.T = true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onSlideProgress(boolean z, float f) {
        e b0 = b0();
        if (b0 != null) {
            b0.onSlideProgress(z, f);
        }
    }

    @Override // iic, org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            d0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p0() {
        yac userConfig = getUserConfig();
        if (userConfig.X) {
            userConfig.X = false;
            userConfig.u(false);
        }
        jn7.f(this.currentAccount).k(jn7.R5, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void prepareFragmentToSlide(boolean z, boolean z2) {
        e b0 = b0();
        if (b0 != null) {
            b0.prepareFragmentToSlide(z, z2);
        }
    }

    public final void q0(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < 4; i++) {
            if (yac.h(i).o()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new f03((byte) 29));
        fu5 I = fu5.I(this, view);
        byte b = 1;
        if (yac.c() < 4) {
            I.b(R.drawable.msg_addbot, ob6.M0(2131754477, null), new aj6(this, b), false);
        }
        if (arrayList.size() > 0) {
            if (I.y() > 0) {
                I.j();
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                int intValue = ((Integer) obj).intValue();
                boolean z = this.currentAccount == intValue;
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                int i3 = aob.i6;
                Drawable Y = aob.Y(getThemedColor(i3), 0, 0);
                uob M = yob.M(i3);
                vnb resourceProvider = getResourceProvider();
                linearLayout.setBackground(Y);
                yob.j(linearLayout, Y, null, M, resourceProvider);
                TLRPC.User f = yac.h(intValue).f();
                rb0 rb0Var = new rb0((vnb) null);
                rb0Var.q(f);
                gj3 gj3Var = new gj3(this, getParentActivity(), z);
                linearLayout.addView(gj3Var, tre.t(34, 34, 16, 12, 0, 0, 0));
                de0 de0Var = new de0(getParentActivity());
                if (z) {
                    de0Var.setScaleX(0.833f);
                    de0Var.setScaleY(0.833f);
                }
                de0Var.setRoundRadius(hl.L(16.0f));
                de0Var.getImageReceiver().d = intValue;
                de0Var.f(f, rb0Var);
                gj3Var.addView(de0Var, tre.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                yob.X(textView, aob.j5, getResourceProvider());
                textView.setText(lbc.r(f));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, tre.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new ae((Object) this, intValue, (Object) I, (byte) 9));
                I.q(linearLayout, tre.o(230, 48));
            }
        }
        I.u = true;
        I.v = true;
        I.b0(0.0f, -hl.L(4.0f));
        ShapeDrawable b0 = aob.b0(hl.L(28.0f), getThemedColor(aob.d6));
        b0.getPaint().setShadowLayer(hl.L(6.0f), 0.0f, hl.L(1.0f), aob.p1(0.15f, -16777216));
        I.X(b0);
        I.a0();
        mg5.r.a();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final boolean r0(android.view.View r29) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fj6.r0(android.view.View):boolean");
    }

    public final uj3 s0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        uj3 uj3Var = new uj3(bundle);
        this.M = uj3Var;
        uj3Var.K3 = new aj3((Object) this, (byte) 18);
        this.a.put(0, new gic(uj3Var));
        return this.M;
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            k0();
            i0();
        }
    }

    public final void t0(int i, boolean z) {
        int i2 = 0;
        while (true) {
            uz4[] uz4VarArr = this.N;
            if (i2 >= uz4VarArr.length) {
                return;
            }
            uz4VarArr[i2].f(m0(i2) == i, z);
            i2++;
        }
    }

    public final void u0(boolean z, float f) {
        for (int i = 0; i < this.N.length; i++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(m0(i) - f));
            uz4 uz4Var = this.N[i];
            uz4Var.K = max;
            uz4Var.J = z;
            uz4Var.invalidate();
        }
        this.I.invalidate();
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
