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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ah6 extends jec implements gk7, x74 {
    public l6c E;
    public FrameLayout F;
    public ch6 G;
    public il0 H;
    public xg6 I;
    public Integer J;
    public cj3 K;
    public ox4[] L;
    public int M;
    public int N;
    public int O;
    public wtc P;
    public je5 Q;
    public boolean R;
    public final ix4 S;
    public final lx4 T;
    public final lx4 U;
    public k6c x;
    public boolean y;
    public final fm0 w = new fm0(0, this, s33.h, 380, true);
    public final RectF V = new RectF();
    public final RectF W = new RectF();
    public final vg6 X = new vg6(this, 0);

    public ah6() {
        if (Build.VERSION.SDK_INT >= 31) {
            lx4 lx4Var = new lx4(null);
            e31 e31Var = new e31(this, false);
            if (lx4Var.c == null) {
                lx4Var.c = new t69(lx4Var.b, e31Var);
            }
            this.T = lx4Var;
            lx4 lx4Var2 = new lx4(null);
            e31 e31Var2 = new e31(this, true);
            if (lx4Var2.c == null) {
                lx4Var2.c = new t69(lx4Var2.b, e31Var2);
            }
            this.U = lx4Var2;
        } else {
            this.T = null;
            this.U = null;
        }
        this.S = new ix4();
        s10 s10Var = new s10(this, (byte) 11);
        setBulletinDelegate(s10Var);
        m21.a(this.b, s10Var);
    }

    @Override // jec
    public final d Z(int i) {
        if (i == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        }
        if (i == 2) {
            if (!getUserConfig().X) {
                return new d8a(ir2.l("hasMainTabs", true));
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("needFinishFragment", false);
            bundle2.putBoolean("hasMainTabs", true);
            return new z81(bundle2);
        }
        if (i == 0) {
            cj3 cj3Var = new cj3(ir2.l("hasMainTabs", true));
            this.K = cj3Var;
            cj3Var.K3 = new s34((Object) this, (byte) 13);
            return cj3Var;
        }
        if (i != 3) {
            return null;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putLong("user_id", y6c.h(this.currentAccount).e());
        bundle3.putBoolean("my_profile", true);
        bundle3.putBoolean("hasMainTabs", true);
        return new ProfileActivity(bundle3, null);
    }

    @Override // jec, org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.g5));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public final void c0() {
        lx4 lx4Var;
        View view;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 || (lx4Var = this.T) == null || (view = this.fragmentView) == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = this.fragmentView.getMeasuredHeight();
        e0();
        fx4 f = qw4.f();
        if (!f.a) {
            lx4Var = null;
        } else if (!f.b || i < 33) {
            lx4Var = this.U;
        }
        if (lx4Var != null) {
            lx4Var.n(measuredWidth, measuredHeight);
            lx4Var.c.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean canBeginSlide() {
        d b0 = b0();
        return b0 != null && b0.canBeginSlide();
    }

    @Override // jec, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        super.createView(context);
        ch6 ch6Var = new ch6(context, this.resourceProvider);
        this.G = ch6Var;
        final byte b = 0;
        ch6Var.setClipChildren(false);
        this.G.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f));
        this.G.setMaxWidth(gl.L(344.0f));
        ox4[] ox4VarArr = new ox4[5];
        this.L = ox4VarArr;
        ox4VarArr[0] = ox4.c(context, this.resourceProvider, nx4.n, 2131748515);
        final byte b2 = 1;
        this.L[1] = ox4.c(context, this.resourceProvider, nx4.f, 2131748514);
        final byte b3 = 2;
        this.L[2] = ox4.c(context, this.resourceProvider, nx4.r, 2131745303);
        final byte b4 = 3;
        this.L[3] = ox4.c(context, this.resourceProvider, nx4.h, 2131748516);
        ox4[] ox4VarArr2 = this.L;
        wjb wjbVar = this.resourceProvider;
        int i = this.currentAccount;
        ox4 ox4Var = new ox4(context);
        ox4Var.a.setText(k96.M0(2131748513, null));
        ox4Var.b.setVisibility(8);
        TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(y6c.h(i).e()));
        pb0 pb0Var = new pb0(0, V1);
        be0 be0Var = new be0(context);
        be0Var.f(V1, pb0Var);
        be0Var.setRoundRadius(gl.L(11.0f));
        ox4Var.c = be0Var;
        ox4Var.addView(be0Var, nme.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        ox4Var.x = bkb.v0(bkb.Sl, wjbVar);
        ox4Var.s = bkb.v0(bkb.Ql, wjbVar);
        ox4Var.w = bkb.v0(bkb.Rl, wjbVar);
        ox4Var.a();
        ox4VarArr2[4] = ox4Var;
        this.L[0].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: wg6
            public final /* synthetic */ ah6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                byte b5 = b;
                byte b6 = 3;
                ah6 ah6Var = this.b;
                switch (b5) {
                    case 0:
                        break;
                    case 1:
                        if (ah6Var.getParentActivity() != null && ah6Var.getParentActivity() != null) {
                            cs5 I = cs5.I(ah6Var, view);
                            I.b(R.drawable.msg_contact_add, k96.M0(2131748091, null), new vg6(ah6Var, (byte) 5), false);
                            I.b(R.drawable.msg_calls, k96.M0(2131743197, null), new vg6(ah6Var, (byte) 6), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -gl.L(4.0f));
                            I.i = (byte) 3;
                            ShapeDrawable b0 = bkb.b0(gl.L(28.0f), ah6Var.getThemedColor(bkb.c6));
                            b0.getPaint().setShadowLayer(gl.L(6.0f), 0.0f, gl.L(1.0f), bkb.p1(0.15f, -16777216));
                            I.X(b0);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (ah6Var.getParentActivity() != null && ah6Var.getParentActivity() != null) {
                            cs5 I2 = cs5.I(ah6Var, view);
                            I2.b(R.drawable.menu_call_create, k96.M0(2131749298, null), new vg6(ah6Var, (byte) 2), false);
                            if (ah6Var.getUserConfig().X) {
                                I2.b(R.drawable.msg_archive_hide, k96.M0(2131749130, null), new vg6(ah6Var, b6), false);
                            } else {
                                I2.b(R.drawable.menu_add_tab_24, k96.M0(2131749269, null), new vg6(ah6Var, (byte) 4), false);
                            }
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -gl.L(4.0f));
                            ShapeDrawable b02 = bkb.b0(gl.L(28.0f), ah6Var.getThemedColor(bkb.c6));
                            b02.getPaint().setShadowLayer(gl.L(6.0f), 0.0f, gl.L(1.0f), bkb.p1(0.15f, -16777216));
                            I2.X(b02);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        ah6Var.o0(view);
                        break;
                }
                return true;
            }
        });
        this.L[1].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: wg6
            public final /* synthetic */ ah6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                byte b5 = b2;
                byte b6 = 3;
                ah6 ah6Var = this.b;
                switch (b5) {
                    case 0:
                        break;
                    case 1:
                        if (ah6Var.getParentActivity() != null && ah6Var.getParentActivity() != null) {
                            cs5 I = cs5.I(ah6Var, view);
                            I.b(R.drawable.msg_contact_add, k96.M0(2131748091, null), new vg6(ah6Var, (byte) 5), false);
                            I.b(R.drawable.msg_calls, k96.M0(2131743197, null), new vg6(ah6Var, (byte) 6), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -gl.L(4.0f));
                            I.i = (byte) 3;
                            ShapeDrawable b0 = bkb.b0(gl.L(28.0f), ah6Var.getThemedColor(bkb.c6));
                            b0.getPaint().setShadowLayer(gl.L(6.0f), 0.0f, gl.L(1.0f), bkb.p1(0.15f, -16777216));
                            I.X(b0);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (ah6Var.getParentActivity() != null && ah6Var.getParentActivity() != null) {
                            cs5 I2 = cs5.I(ah6Var, view);
                            I2.b(R.drawable.menu_call_create, k96.M0(2131749298, null), new vg6(ah6Var, (byte) 2), false);
                            if (ah6Var.getUserConfig().X) {
                                I2.b(R.drawable.msg_archive_hide, k96.M0(2131749130, null), new vg6(ah6Var, b6), false);
                            } else {
                                I2.b(R.drawable.menu_add_tab_24, k96.M0(2131749269, null), new vg6(ah6Var, (byte) 4), false);
                            }
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -gl.L(4.0f));
                            ShapeDrawable b02 = bkb.b0(gl.L(28.0f), ah6Var.getThemedColor(bkb.c6));
                            b02.getPaint().setShadowLayer(gl.L(6.0f), 0.0f, gl.L(1.0f), bkb.p1(0.15f, -16777216));
                            I2.X(b02);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        ah6Var.o0(view);
                        break;
                }
                return true;
            }
        });
        this.L[3].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: wg6
            public final /* synthetic */ ah6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                byte b5 = b3;
                byte b6 = 3;
                ah6 ah6Var = this.b;
                switch (b5) {
                    case 0:
                        break;
                    case 1:
                        if (ah6Var.getParentActivity() != null && ah6Var.getParentActivity() != null) {
                            cs5 I = cs5.I(ah6Var, view);
                            I.b(R.drawable.msg_contact_add, k96.M0(2131748091, null), new vg6(ah6Var, (byte) 5), false);
                            I.b(R.drawable.msg_calls, k96.M0(2131743197, null), new vg6(ah6Var, (byte) 6), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -gl.L(4.0f));
                            I.i = (byte) 3;
                            ShapeDrawable b0 = bkb.b0(gl.L(28.0f), ah6Var.getThemedColor(bkb.c6));
                            b0.getPaint().setShadowLayer(gl.L(6.0f), 0.0f, gl.L(1.0f), bkb.p1(0.15f, -16777216));
                            I.X(b0);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (ah6Var.getParentActivity() != null && ah6Var.getParentActivity() != null) {
                            cs5 I2 = cs5.I(ah6Var, view);
                            I2.b(R.drawable.menu_call_create, k96.M0(2131749298, null), new vg6(ah6Var, (byte) 2), false);
                            if (ah6Var.getUserConfig().X) {
                                I2.b(R.drawable.msg_archive_hide, k96.M0(2131749130, null), new vg6(ah6Var, b6), false);
                            } else {
                                I2.b(R.drawable.menu_add_tab_24, k96.M0(2131749269, null), new vg6(ah6Var, (byte) 4), false);
                            }
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -gl.L(4.0f));
                            ShapeDrawable b02 = bkb.b0(gl.L(28.0f), ah6Var.getThemedColor(bkb.c6));
                            b02.getPaint().setShadowLayer(gl.L(6.0f), 0.0f, gl.L(1.0f), bkb.p1(0.15f, -16777216));
                            I2.X(b02);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        ah6Var.o0(view);
                        break;
                }
                return true;
            }
        });
        this.L[4].setOnLongClickListener(new View.OnLongClickListener(this) { // from class: wg6
            public final /* synthetic */ ah6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                byte b5 = b4;
                byte b6 = 3;
                ah6 ah6Var = this.b;
                switch (b5) {
                    case 0:
                        break;
                    case 1:
                        if (ah6Var.getParentActivity() != null && ah6Var.getParentActivity() != null) {
                            cs5 I = cs5.I(ah6Var, view);
                            I.b(R.drawable.msg_contact_add, k96.M0(2131748091, null), new vg6(ah6Var, (byte) 5), false);
                            I.b(R.drawable.msg_calls, k96.M0(2131743197, null), new vg6(ah6Var, (byte) 6), false);
                            I.u = true;
                            I.v = true;
                            I.b0(0.0f, -gl.L(4.0f));
                            I.i = (byte) 3;
                            ShapeDrawable b0 = bkb.b0(gl.L(28.0f), ah6Var.getThemedColor(bkb.c6));
                            b0.getPaint().setShadowLayer(gl.L(6.0f), 0.0f, gl.L(1.0f), bkb.p1(0.15f, -16777216));
                            I.X(b0);
                            I.a0();
                            break;
                        }
                        break;
                    case 2:
                        if (ah6Var.getParentActivity() != null && ah6Var.getParentActivity() != null) {
                            cs5 I2 = cs5.I(ah6Var, view);
                            I2.b(R.drawable.menu_call_create, k96.M0(2131749298, null), new vg6(ah6Var, (byte) 2), false);
                            if (ah6Var.getUserConfig().X) {
                                I2.b(R.drawable.msg_archive_hide, k96.M0(2131749130, null), new vg6(ah6Var, b6), false);
                            } else {
                                I2.b(R.drawable.menu_add_tab_24, k96.M0(2131749269, null), new vg6(ah6Var, (byte) 4), false);
                            }
                            I2.u = true;
                            I2.v = true;
                            I2.b0(0.0f, -gl.L(4.0f));
                            ShapeDrawable b02 = bkb.b0(gl.L(28.0f), ah6Var.getThemedColor(bkb.c6));
                            b02.getPaint().setShadowLayer(gl.L(6.0f), 0.0f, gl.L(1.0f), bkb.p1(0.15f, -16777216));
                            I2.X(b02);
                            I2.a0();
                            break;
                        }
                        break;
                    default:
                        ah6Var.o0(view);
                        break;
                }
                return true;
            }
        });
        this.G.Q.add(this.L[0]);
        this.G.Q.add(this.L[1]);
        this.G.Q.add(this.L[4]);
        this.G.Q.add(this.L[3]);
        int i2 = 0;
        while (true) {
            ox4[] ox4VarArr3 = this.L;
            if (i2 >= ox4VarArr3.length) {
                break;
            }
            ox4 ox4Var2 = ox4VarArr3[i2];
            ox4Var2.setOnClickListener(new v0(this, i2 > 2 ? i2 - 1 : i2, (byte) 9));
            this.G.addView(this.L[i2]);
            this.G.j(ox4Var2, true, false);
            i2++;
        }
        g0(getUserConfig().X, false);
        r0(this.c.getCurrentPosition(), false);
        int themedColor = getThemedColor(bkb.c6);
        ix4 ix4Var = this.S;
        ix4Var.a(themedColor);
        zec zecVar = new zec(this.b);
        gx4 gx4Var = this.T;
        if (gx4Var == null) {
            gx4Var = ix4Var;
        }
        gx4 gx4Var2 = this.U;
        if (gx4Var2 == null) {
            gx4Var2 = ix4Var;
        }
        kl0 kl0Var = new kl0(gx4Var, gx4Var2, ix4Var);
        oc6 oc6Var = this.b;
        kl0Var.h = zecVar;
        kl0Var.i = oc6Var;
        kl0Var.k = true;
        il0 c = kl0Var.c(this.G, nod.g(this.resourceProvider), false);
        this.H = c;
        c.r(gl.L(28.0f));
        this.H.q(gl.L(7.666f));
        this.G.setBackground(this.H);
        kl0 kl0Var2 = new kl0(ix4Var, ix4Var, ix4Var);
        oc6 oc6Var2 = this.b;
        kl0Var2.h = zecVar;
        kl0Var2.i = oc6Var2;
        this.I = new xg6(context);
        ql0 ql0Var = new ql0(kl0Var2.c(this.I, null, false));
        ql0Var.b(gl.L(60.0f), true);
        this.I.setBackground(ql0Var);
        this.b.addView(this.I, nme.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        frameLayout.setOnClickListener(new x00(b2));
        this.F.addView(this.G, nme.e(-1, 72, 81));
        this.F.setClipToPadding(false);
        this.b.addView(this.F, nme.e(-1, -2, 80));
        l6c l6cVar = new l6c(context);
        this.E = l6cVar;
        this.b.addView(l6cVar, nme.e(-1, -2, 80));
        a aVar = a.a;
        Activity parentActivity = getParentActivity();
        l6c l6cVar2 = this.E;
        ((ApplicationLoaderImpl) aVar).getClass();
        k6c k6cVar = new k6c(parentActivity, l6cVar2);
        this.x = k6cVar;
        k6cVar.updateAppUpdateViews(this.currentAccount, false);
        j0(false);
        return this.b;
    }

    public final void d0() {
        int themedColor = getThemedColor(bkb.Z6);
        int themedColor2 = getThemedColor(bkb.c6);
        iec iecVar = this.c;
        this.S.a(bm2.f(iecVar != null ? iecVar.q(0) : 1.0f, themedColor, themedColor2));
        xg6 xg6Var = this.I;
        if (xg6Var != null) {
            xg6Var.invalidate();
        }
        il0 il0Var = this.H;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        c0();
        xg6 xg6Var2 = this.I;
        if (xg6Var2 != null) {
            xg6Var2.invalidate();
        }
        ch6 ch6Var = this.G;
        if (ch6Var != null) {
            ch6Var.invalidate();
        }
        ox4[] ox4VarArr = this.L;
        if (ox4VarArr != null) {
            for (ox4 ox4Var : ox4VarArr) {
                ox4Var.g();
            }
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ox4 ox4Var;
        LaunchActivity launchActivity;
        boolean z = false;
        z = false;
        if (i == kk7.I4 || i == 2) {
            View view = this.fragmentView;
            if (view != null && view.isAttachedToWindow()) {
                z = true;
            }
            j0(z);
            return;
        }
        if (i == kk7.T4) {
            k6c k6cVar = this.x;
            if (k6cVar != null) {
                k6cVar.updateFileProgress(null);
                this.x.updateAppUpdateViews(this.currentAccount, true);
                return;
            }
            return;
        }
        if (i == kk7.X1) {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = gba.f1;
            if (tL_help_appUpdate == null || tL_help_appUpdate.document == null) {
                return;
            }
            a.t();
            return;
        }
        if (i == kk7.Y1) {
            TLRPC.TL_help_appUpdate tL_help_appUpdate2 = gba.f1;
            if (tL_help_appUpdate2 == null || tL_help_appUpdate2.document == null) {
                return;
            }
            a.t();
            return;
        }
        if (i == kk7.W1) {
            k6c k6cVar2 = this.x;
            if (k6cVar2 != null) {
                k6cVar2.updateFileProgress(objArr);
                return;
            }
            return;
        }
        if (i == kk7.S4) {
            k6c k6cVar3 = this.x;
            if (k6cVar3 == null || (launchActivity = LaunchActivity.H1) == null) {
                return;
            }
            k6cVar3.updateAppUpdateViews(this.currentAccount, launchActivity.e0.size() == 1);
            return;
        }
        if (i == kk7.v4) {
            int currentPosition = this.c.getCurrentPosition();
            SparseArray sparseArray = this.a;
            int size = sparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                hec hecVar = (hec) sparseArray.valueAt(i3);
                if (sparseArray.keyAt(i3) != currentPosition && hecVar != null) {
                    hecVar.a.clearViews();
                }
            }
            return;
        }
        if (i == kk7.Q5) {
            g0(getUserConfig().X, true);
            iec iecVar = this.c;
            if (iecVar == null || iecVar.getCurrentPosition() != 2) {
                a0(2);
                return;
            }
            this.c.E(0);
            r0(0, true);
            this.y = true;
            return;
        }
        if (i != kk7.i0) {
            if (i == kk7.R5) {
                f0();
                return;
            }
            return;
        }
        ox4[] ox4VarArr = this.L;
        if (ox4VarArr == null || (ox4Var = ox4VarArr[4]) == null) {
            return;
        }
        int i4 = this.currentAccount;
        TLRPC.User V1 = na7.q1(i4).V1(Long.valueOf(y6c.h(i4).e()));
        ox4Var.c.f(V1, new pb0(0, V1));
    }

    public final void e0() {
        if (Build.VERSION.SDK_INT < 31 || this.T == null || this.b == null) {
            return;
        }
        l6c l6cVar = this.E;
        int height = ((this.b.getHeight() - this.M) - ((l6cVar == null || !l6cVar.a()) ? 0 : gl.L(44.0f))) - gl.L(8.0f);
        int L = height - gl.L(56.0f);
        SparseArray sparseArray = this.a;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            d dVar = ((hec) sparseArray.valueAt(i)).a;
            View view = dVar.fragmentView;
            if (view != null && view.getWidth() > 0) {
                if (L >= view.getHeight()) {
                    dVar.setParentGlass(null, null);
                } else {
                    float L2 = L - gl.L(1.0f);
                    float width = view.getWidth();
                    float L3 = gl.L(1.0f) + height;
                    RectF rectF = this.W;
                    rectF.set(0.0f, L2, width, L3);
                    dVar.setParentGlass(rectF, this.X);
                }
            }
        }
    }

    public final void f0() {
        if (this.G == null || this.L[1] == null) {
            return;
        }
        boolean w = qu2.w();
        if (w) {
            na7.d1().edit().putBoolean("askAboutContacts2", true).apply();
        }
        if (y6c.h(this.currentAccount).V && !w && na7.d1().getBoolean("askAboutContacts2", true)) {
            this.L[1].e("!", true, true);
        } else {
            this.L[1].e(null, true, true);
        }
    }

    public final void g0(boolean z, boolean z2) {
        ch6 ch6Var = this.G;
        if (ch6Var != null) {
            ch6Var.j(this.L[2], !z, z2);
            this.G.j(this.L[3], z, z2);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        d b0 = b0();
        if (b0 != null) {
            return b0.getCustomSlideTransition(z, z2, f);
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final rs3 getEdgeToEdgeSupportMode() {
        return rs3.c;
    }

    @Override // jec, org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        return super.getThemeDescriptions();
    }

    public final void h0() {
        iec iecVar = this.c;
        if (iecVar == null || this.I == null) {
            return;
        }
        float a = 1.0f - moe.a(Math.abs(3.0f - iecVar.getPositionAnimated()), 0.0f, 1.0f);
        float R1 = (1.0f - ((1.0f - gl.R1(0.0f, 1.0f, gl.Q0(this.M))) * a)) * this.w.e;
        this.I.setAlpha(R1);
        this.I.setTranslationY(a * gl.L(48.0f));
        this.I.setVisibility(R1 > 0.0f ? 0 : 8);
    }

    public final void i0() {
        int L = gl.L(40.0f) + (-(this.E.a() ? gl.L(44.0f) : 0));
        float f = this.w.e;
        this.F.setTranslationY(gl.U1(f, L, r0));
        this.G.setClickable(f > 1.0f);
        this.G.setEnabled(f > 1.0f);
        this.G.setAlpha(f);
        this.G.setVisibility(f <= 0.0f ? 8 : 0);
    }

    public final void j0(boolean z) {
        if (this.G == null) {
            return;
        }
        int i = ad7.Y(this.currentAccount).L;
        if (i <= 0) {
            this.L[0].e(null, false, z);
        } else {
            this.L[0].e(k96.E(i, ','), false, z);
        }
    }

    public final /* synthetic */ void k0(int i, cs5 cs5Var) {
        if (this.currentAccount != i) {
            cs5Var.u();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.N0(i);
            }
        }
    }

    public final void l0() {
        int i = 0;
        Integer num = null;
        for (int i2 = 3; i2 >= 0; i2--) {
            if (!y6c.h(i2).o()) {
                i++;
                if (num == null) {
                    num = Integer.valueOf(i2);
                }
            }
        }
        if (!y6c.n()) {
            i--;
        }
        if (i > 0 && num != null) {
            presentFragment(new mf6(num.intValue()));
        } else {
            if (y6c.n()) {
                return;
            }
            showDialog(new h26(7, this.currentAccount, null, getParentActivity(), this));
        }
    }

    public final void m0() {
        y6c userConfig = getUserConfig();
        if (userConfig.X) {
            userConfig.X = false;
            userConfig.u(false);
        }
        g0(false, true);
        kk7.f(this.currentAccount).k(kk7.Q5, new Object[0]);
    }

    public final void n0() {
        y6c userConfig = getUserConfig();
        if (!userConfig.X) {
            userConfig.X = true;
            userConfig.u(false);
        }
        g0(true, true);
        kk7.f(this.currentAccount).k(kk7.Q5, new Object[0]);
    }

    public final void o0(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < 4; i++) {
            if (y6c.h(i).o()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new mz2((byte) 28));
        cs5 I = cs5.I(this, view);
        byte b = 1;
        if (y6c.c() < 4) {
            I.b(R.drawable.msg_addbot, k96.M0(2131754481, null), new vg6(this, b), false);
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
                int i3 = bkb.h6;
                Drawable Y = bkb.Y(getThemedColor(i3), 0, 0);
                vkb M = zkb.M(i3);
                wjb resourceProvider = getResourceProvider();
                linearLayout.setBackground(Y);
                zkb.j(linearLayout, Y, null, M, resourceProvider);
                TLRPC.User f = y6c.h(intValue).f();
                pb0 pb0Var = new pb0((wjb) null);
                pb0Var.q(f);
                oi3 oi3Var = new oi3(this, getParentActivity(), z);
                linearLayout.addView(oi3Var, nme.t(34, 34, 16, 12, 0, 0, 0));
                be0 be0Var = new be0(getParentActivity());
                if (z) {
                    be0Var.setScaleX(0.833f);
                    be0Var.setScaleY(0.833f);
                }
                be0Var.setRoundRadius(gl.L(16.0f));
                be0Var.getImageReceiver().d = intValue;
                be0Var.f(f, pb0Var);
                oi3Var.addView(be0Var, nme.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                zkb.X(textView, bkb.i5, getResourceProvider());
                textView.setText(l7c.r(f));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, nme.q(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new wg((Object) this, intValue, (Object) I, (byte) 9));
                I.q(linearLayout, nme.o(kk7.F3, 48));
            }
        }
        I.u = true;
        I.v = true;
        I.b0(0.0f, -gl.L(4.0f));
        ShapeDrawable b0 = bkb.b0(gl.L(28.0f), getThemedColor(bkb.c6));
        b0.getPaint().setShadowLayer(gl.L(6.0f), 0.0f, gl.L(1.0f), bkb.p1(0.15f, -16777216));
        I.X(b0);
        I.a0();
        le5.r.a();
    }

    @Override // jec, org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        boolean onBackPressed = super.onBackPressed(z);
        if (onBackPressed && this.c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z) {
                this.c.E(0);
            }
        }
        return onBackPressed;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBeginSlide() {
        super.onBeginSlide();
        d b0 = b0();
        if (b0 != null) {
            b0.onBeginSlide();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        wtc wtcVar = new wtc(kk7.f(this.currentAccount), this);
        wtcVar.b(kk7.X1);
        wtcVar.b(kk7.W1);
        wtcVar.b(kk7.Y1);
        wtcVar.b(kk7.I4);
        wtcVar.b(2);
        wtcVar.b(kk7.Q5);
        wtcVar.b(kk7.i0);
        wtcVar.b(kk7.R5);
        wtcVar.e(kk7.S4);
        wtcVar.e(kk7.T4);
        wtcVar.e(kk7.v4);
        this.P = wtcVar;
        return super.onFragmentCreate();
    }

    @Override // jec, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        m21.h(this.b);
        wtc wtcVar = this.P;
        if (wtcVar != null) {
            wtcVar.a();
            this.P = null;
        }
        super.onFragmentDestroy();
    }

    @Override // jec, org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        je5 je5Var = this.Q;
        if (je5Var != null) {
            je5Var.f(true);
        }
    }

    @Override // jec, org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        d0();
        f0();
        j0(true);
        if (this.R) {
            return;
        }
        if (this.Q == null && le5.r.c()) {
            gl.d3(new vg6(this, (byte) 7), 1500L);
        }
        this.R = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onSlideProgress(boolean z, float f) {
        d b0 = b0();
        if (b0 != null) {
            b0.onSlideProgress(z, f);
        }
    }

    @Override // jec, org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            d0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            i0();
            h0();
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final boolean p0(android.view.View r29) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah6.p0(android.view.View):boolean");
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void prepareFragmentToSlide(boolean z, boolean z2) {
        d b0 = b0();
        if (b0 != null) {
            b0.prepareFragmentToSlide(z, z2);
        }
    }

    public final cj3 q0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        cj3 cj3Var = new cj3(bundle);
        this.K = cj3Var;
        cj3Var.K3 = new s34((Object) this, (byte) 13);
        this.a.put(0, new hec(cj3Var));
        return this.K;
    }

    public final void r0(int i, boolean z) {
        int i2 = 0;
        while (true) {
            ox4[] ox4VarArr = this.L;
            if (i2 >= ox4VarArr.length) {
                return;
            }
            ox4VarArr[i2].f((i2 > 2 ? i2 + (-1) : i2) == i, z);
            i2++;
        }
    }

    public final void s0(boolean z, float f) {
        int i = 0;
        while (i < this.L.length) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i > 2 ? i - 1 : i) - f));
            ox4 ox4Var = this.L[i];
            ox4Var.K = max;
            ox4Var.J = z;
            ox4Var.invalidate();
            i++;
        }
        this.G.invalidate();
    }

    @Override // x74
    public final void F(float f, int i) {
    }
}
