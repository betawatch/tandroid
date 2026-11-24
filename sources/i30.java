// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i30 extends my0 implements jm7, cr3 {
    public static i30 S2;
    public static final float[] T2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final hu5 A1;
    public int A2;
    public final y20 B1;
    public float B2;
    public final z20 C1;
    public int C2;
    public final m20 D1;
    public long D2;
    public final n20 E1;
    public long E2;
    public final z20 F1;
    public boolean F2;
    public final r7 G1;
    public float G2;
    public final ai2 H1;
    public final o1 H2;
    public a8 I1;
    public t20 I2;
    public final o20 J1;
    public long J2;
    public final boolean K1;
    public float K2;
    public final k46 L1;
    public final v20 L2;
    public final a30 M1;
    public ValueAnimator M2;
    public final lka N1;
    public int N2;
    public final r7 O1;
    public boolean O2;
    public final dna P1;
    public int P2;
    public final v7 Q1;
    public int Q2;
    public boolean R1;
    public int R2;
    public final a8[] S1;
    public final TextView T1;
    public final r7 U1;
    public final a8 V1;
    public final a8 W1;
    public final a8 X1;
    public final a8 Y1;
    public final ImageView Z1;
    public final ae8 a2;
    public final k20 b2;
    public final bf0 c2;
    public final r7 d2;
    public final r7 e2;
    public boolean f2;
    public final View[] g2;
    public final zna h2;
    public long i2;
    public boolean j2;
    public boolean k2;
    public final View l1;
    public int l2;
    public final x20 m1;
    public int m2;
    public final View n1;
    public final boolean n2;
    public final View o1;
    public final boolean o2;
    public boolean p1;
    public jc7 p2;
    public boolean q1;
    public ArrayList q2;
    public final p20 r1;
    public k47 r2;
    public final u46 s1;
    public boolean s2;
    public final h30 t1;
    public int t2;
    public final LinearLayout u1;
    public String u2;
    public final TextView v1;
    public AnimatorSet v2;
    public final TextView w1;
    public int w2;
    public final k20 x1;
    public int x2;
    public final b61 y1;
    public final int y2;
    public final b61 z1;
    public final LaunchActivity z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i30(Activity activity, final ylb ylbVar) {
        super(1, ylbVar, (Context) activity, true);
        int i;
        r6 r6Var;
        TLRPC.User W1;
        byte b = 1;
        a8[] a8VarArr = new a8[6];
        this.S1 = a8VarArr;
        View[] viewArr = new View[5];
        this.g2 = viewArr;
        this.k2 = true;
        this.l2 = -1;
        this.t2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.B2 = -1.0f;
        this.G2 = -1.0f;
        this.H2 = new o1(this, (byte) 4);
        this.L2 = new v20(this);
        this.r = true;
        J();
        k47 k47Var = MediaController.w().v0;
        if (k47Var != null) {
            i = k47Var.K1;
            this.a = i;
        } else {
            i = z8c.t0;
            this.a = i;
        }
        this.z2 = (LaunchActivity) activity;
        this.y2 = er3.q(i).k();
        nm7.f(this.a).b(this, nm7.f2);
        nm7.f(this.a).b(this, nm7.g2);
        nm7.f(this.a).b(this, nm7.h2);
        nm7.f(this.a).b(this, nm7.e2);
        nm7.f(this.a).b(this, nm7.Y1);
        nm7.f(this.a).b(this, nm7.X1);
        nm7.f(this.a).b(this, nm7.K0);
        nm7.f(this.a).b(this, nm7.L0);
        nm7.f(this.a).b(this, nm7.X3);
        nm7.e().b(this, nm7.N4);
        w20 w20Var = new w20(this, activity);
        this.b = w20Var;
        final byte b2 = 0;
        w20Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, 0, i2, 0);
        x20 x20Var = new x20(this, activity, ylbVar, b2);
        this.m1 = x20Var;
        x20Var.setBackgroundColor(0);
        x20Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i3 = cmb.Ej;
        anb.l(x20Var, 1, i3, ylbVar);
        anb.l(x20Var, 3, cmb.Dj, ylbVar);
        anb.l(x20Var, 5, i3, ylbVar);
        anb.l(x20Var, 6, cmb.Fj, ylbVar);
        x20Var.setOccupyStatusBar(true);
        r6 t = x20Var.t();
        t.setLayoutParams(qoe.e(-1, -1, nm7.D1));
        View view = new View(activity);
        this.l1 = view;
        anb.h(cmb.g5, ylbVar, view);
        x20Var.addView(view, 0, qoe.e(-1, -1, nm7.D1));
        view.setAlpha(0.0f);
        x20Var.setAlpha(0.0f);
        x20Var.setActionBarMenuOnItemClick(new r8(this, (byte) 3));
        View view2 = new View(activity);
        this.n1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.o1 = view3;
        anb.h(cmb.U5, ylbVar, view3);
        k20 k20Var = new k20(this, activity, (byte) 2);
        this.x1 = k20Var;
        y20 y20Var = new y20(this, activity);
        this.B1 = y20Var;
        k20Var.addView(y20Var, qoe.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        z20 z20Var = new z20(this, activity, activity, b2);
        this.C1 = z20Var;
        k20Var.addView(z20Var, qoe.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        z20 z20Var2 = new z20(this, activity, activity, b);
        this.F1 = z20Var2;
        k20Var.addView(z20Var2, qoe.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        a30 a30Var = new a30(this, activity, ylbVar);
        this.M1 = a30Var;
        a30Var.setLineWidth(4);
        a30Var.setDelegate(new nl9((Object) this, (byte) 7));
        a30Var.setReportChanges(true);
        k20Var.addView(a30Var, qoe.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        zna znaVar = new zna(new xk4(0.0f));
        aoa aoaVar = new aoa();
        aoaVar.b(750.0f);
        aoaVar.a(1.0f);
        znaVar.m = aoaVar;
        znaVar.b(new h20(this, b2));
        this.h2 = znaVar;
        k46 k46Var = new k46(activity);
        this.L1 = k46Var;
        k46Var.setVisibility(4);
        anb.h(cmb.Jj, ylbVar, k46Var);
        k46Var.setProgressColor(cmb.v0(cmb.Lj, this.J0));
        k20Var.addView(k46Var, qoe.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        lka lkaVar = new lka(activity);
        this.N1 = lkaVar;
        lkaVar.setTextSize(12);
        lkaVar.l("0:00", false);
        int i4 = cmb.Ij;
        anb.W(lkaVar, i4, ylbVar);
        lkaVar.setImportantForAccessibility(2);
        k20Var.addView(lkaVar, qoe.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.T1 = textView;
        textView.setTextSize(1, 12.0f);
        anb.X(textView, i4, ylbVar);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        k20Var.addView(textView, qoe.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        r7 r7Var = new r7(activity, null, 0, cmb.v0(i4, this.J0), false, ylbVar);
        this.O1 = r7Var;
        r7Var.setLongClickEnabled(false);
        r7Var.setShowSubmenuByMove(false);
        r7Var.setAdditionalYOffset(-gm.L(224.0f));
        r7Var.setContentDescription(jb6.M0(2131754804, null));
        r7Var.setDelegate(new u10(this, b2));
        dna dnaVar = new dna();
        this.P1 = dnaVar;
        r7Var.setIcon(dnaVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        v7 v7Var = new v7(getContext(), ylbVar);
        this.Q1 = v7Var;
        v7Var.setRoundRadiusDp(6.0f);
        v7Var.setDrawShadow(true);
        v7Var.setOnValueChange(new v10(this, b2));
        a8VarArr[0] = r7Var.e(0, R.drawable.msg_speed_slow, jb6.M0(2131744955, null));
        a8VarArr[1] = r7Var.e(1, R.drawable.msg_speed_normal, jb6.M0(2131744956, null));
        a8VarArr[2] = r7Var.e(2, R.drawable.msg_speed_medium, jb6.M0(2131744957, null));
        a8VarArr[3] = r7Var.e(3, R.drawable.msg_speed_fast, jb6.M0(2131744959, null));
        a8VarArr[4] = r7Var.e(4, R.drawable.msg_speed_veryfast, jb6.M0(2131744953, null));
        a8VarArr[5] = r7Var.e(5, R.drawable.msg_speed_superfast, jb6.M0(2131744954, null));
        if (gm.p >= 3.0f) {
            r7Var.setPadding(0, 1, 0, 0);
        }
        r7Var.setAdditionalXOffset(gm.L(8.0f));
        r7Var.setAdditionalYOffset(-gm.L(400.0f));
        r7Var.setShowedFromBottom(true);
        k20Var.addView(r7Var, qoe.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        r7Var.setOnClickListener(new t(this, fArr, (byte) 19));
        r7Var.setOnLongClickListener(new u0(this, ylbVar, b));
        V0(false);
        k20 k20Var2 = new k20(this, activity, b2);
        k20Var.addView(k20Var2, qoe.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        r7 r7Var2 = new r7(activity, null, 0, 0, false, ylbVar);
        this.U1 = r7Var2;
        viewArr[0] = r7Var2;
        r7Var2.setLongClickEnabled(false);
        r7Var2.setShowSubmenuByMove(false);
        r7Var2.setAdditionalYOffset(-gm.L(166.0f));
        int i5 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i5, this.J0), 1, gm.L(18.0f));
        wmb M = anb.M(i5);
        r7Var2.setBackground(f0);
        anb.j(r7Var2, f0, null, M, ylbVar);
        k20Var2.addView(r7Var2, qoe.e(48, 48, 51));
        r7Var2.setOnClickListener(new View.OnClickListener(this) { // from class: w10
            public final /* synthetic */ i30 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                byte b3 = b2;
                i30 i30Var = this.b;
                switch (b3) {
                    case 0:
                        i30Var.Y0();
                        i30Var.U1.U(null, null);
                        break;
                    default:
                        o20 o20Var = i30Var.J1;
                        k47 k47Var2 = MediaController.w().v0;
                        if (k47Var2 != null) {
                            char c = 1;
                            char c2 = 1;
                            bu5 H = bu5.H(i30Var.c, i30Var.J0, view4, true);
                            bu5 D0 = i30Var.D0(H, k47Var2);
                            if (!i30Var.I0()) {
                                H.k(R.drawable.msg_stories_save, jb6.M0(2131753881, null), new c20(H, D0, c2 == true ? 1 : 0), !i30Var.s2);
                                if (!i30Var.s2 && H.z() != null) {
                                    H.z().setRightIcon(R.drawable.msg_arrowright);
                                }
                                H.j();
                            }
                            H.k(R.drawable.msg_forward, jb6.M0(2131750519, null), new d20(i30Var, H, (byte) 0), !i30Var.s2);
                            H.k(R.drawable.msg_shareout, jb6.M0(2131745193, null), new d20(i30Var, H, c == true ? 1 : 0), !i30Var.s2);
                            H.k(R.drawable.msg_message, jb6.M0(2131745076, null), new d20(i30Var, H, (byte) 2), k47Var2.e1() > 0);
                            if (i30Var.K1) {
                                a8 a8Var = new a8(0, H.d, H.e, false, false);
                                H.c(a8Var);
                                i30Var.I1 = a8Var;
                                a8Var.j(jb6.M0(2131743276, null), R.drawable.menu_video_chromecast, null);
                                i30Var.I1.setOnClickListener(new t(i30Var, H, (byte) 20));
                                gm.B2(o20Var);
                                i30Var.I1.addView(o20Var, 0, qoe.c(-1.0f, -1));
                                i30Var.updateColors();
                            }
                            H.l(R.drawable.msg_delete, new d20(i30Var, H, (byte) 3), jb6.M0(2131746378, null), i30Var.I0(), true);
                            H.Y(gm.L(64.0f));
                            H.a0();
                            break;
                        }
                        break;
                }
            }
        });
        this.V1 = r7Var2.e(3, R.drawable.player_new_repeatone, jb6.M0(2131746006, null));
        this.W1 = r7Var2.e(4, R.drawable.player_new_repeatall, jb6.M0(2131746009, null));
        r7Var2.a(-1).getLayoutParams().height = gm.L(4.0f);
        this.X1 = r7Var2.e(2, R.drawable.player_new_shuffle, jb6.M0(2131745056, null));
        r7Var2.a(-1).getLayoutParams().height = gm.L(4.0f);
        this.Y1 = r7Var2.e(1, R.drawable.player_new_order, jb6.M0(2131745760, null));
        r7Var2.setShowedFromBottom(true);
        r7Var2.setDelegate(new u10(this, b));
        int i6 = cmb.Mj;
        int v0 = cmb.v0(i6, this.J0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        m20 m20Var = new m20(this, activity, scaledTouchSlop);
        this.D1 = m20Var;
        viewArr[1] = m20Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        m20Var.setScaleType(scaleType);
        m20Var.f(R.raw.player_prev, 20, 20, null);
        m20Var.h(v0, "Triangle 3");
        m20Var.h(v0, "Triangle 4");
        m20Var.h(v0, "Rectangle 4");
        fg0 f02 = cmb.f0(cmb.v0(i5, this.J0), 1, gm.L(22.0f));
        wmb M2 = anb.M(i5);
        m20Var.setBackground(f02);
        anb.j(m20Var, f02, null, M2, ylbVar);
        k20Var2.addView(m20Var, qoe.e(48, 48, 51));
        m20Var.setContentDescription(jb6.M0(2131754799, null));
        ImageView imageView = new ImageView(activity);
        this.Z1 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        ae8 ae8Var = new ae8(28);
        this.a2 = ae8Var;
        imageView.setImageDrawable(ae8Var);
        ae8Var.a(!MediaController.w().C(), false);
        anb.s(imageView, i6, ylbVar, PorterDuff.Mode.MULTIPLY);
        fg0 f03 = cmb.f0(cmb.v0(i5, this.J0), 1, gm.L(24.0f));
        wmb M3 = anb.M(i5);
        imageView.setBackground(f03);
        anb.j(imageView, f03, null, M3, ylbVar);
        k20Var2.addView(imageView, qoe.e(48, 48, 51));
        imageView.setOnClickListener(new x10((byte) 0));
        n20 n20Var = new n20(this, activity, scaledTouchSlop);
        this.E1 = n20Var;
        viewArr[3] = n20Var;
        n20Var.setScaleType(scaleType);
        n20Var.f(R.raw.player_prev, 20, 20, null);
        n20Var.h(v0, "Triangle 3");
        n20Var.h(v0, "Triangle 4");
        n20Var.h(v0, "Rectangle 4");
        n20Var.setRotation(180.0f);
        fg0 f04 = cmb.f0(cmb.v0(i5, this.J0), 1, gm.L(22.0f));
        wmb M4 = anb.M(i5);
        n20Var.setBackground(f04);
        anb.j(n20Var, f04, null, M4, ylbVar);
        k20Var2.addView(n20Var, qoe.e(48, 48, 51));
        n20Var.setContentDescription(jb6.M0(2131747984, null));
        r7 r7Var3 = new r7(activity, null, 0, v0, false, ylbVar);
        this.G1 = r7Var3;
        viewArr[4] = r7Var3;
        ai2 ai2Var = new ai2(activity, R.drawable.ic_ab_other, ylbVar);
        this.H1 = ai2Var;
        r7Var3.setIcon(ai2Var);
        r7Var3.setLongClickEnabled(false);
        r7Var3.setAdditionalYOffset(-gm.L(197.0f));
        final byte b3 = 1;
        fg0 f05 = cmb.f0(cmb.v0(i5, this.J0), 1, gm.L(18.0f));
        wmb M5 = anb.M(i5);
        r7Var3.setBackground(f05);
        anb.j(r7Var3, f05, null, M5, ylbVar);
        r7Var3.setOnClickListener(new View.OnClickListener(this) { // from class: w10
            public final /* synthetic */ i30 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                byte b32 = b3;
                i30 i30Var = this.b;
                switch (b32) {
                    case 0:
                        i30Var.Y0();
                        i30Var.U1.U(null, null);
                        break;
                    default:
                        o20 o20Var = i30Var.J1;
                        k47 k47Var2 = MediaController.w().v0;
                        if (k47Var2 != null) {
                            char c = 1;
                            char c2 = 1;
                            bu5 H = bu5.H(i30Var.c, i30Var.J0, view4, true);
                            bu5 D0 = i30Var.D0(H, k47Var2);
                            if (!i30Var.I0()) {
                                H.k(R.drawable.msg_stories_save, jb6.M0(2131753881, null), new c20(H, D0, c2 == true ? 1 : 0), !i30Var.s2);
                                if (!i30Var.s2 && H.z() != null) {
                                    H.z().setRightIcon(R.drawable.msg_arrowright);
                                }
                                H.j();
                            }
                            H.k(R.drawable.msg_forward, jb6.M0(2131750519, null), new d20(i30Var, H, (byte) 0), !i30Var.s2);
                            H.k(R.drawable.msg_shareout, jb6.M0(2131745193, null), new d20(i30Var, H, c == true ? 1 : 0), !i30Var.s2);
                            H.k(R.drawable.msg_message, jb6.M0(2131745076, null), new d20(i30Var, H, (byte) 2), k47Var2.e1() > 0);
                            if (i30Var.K1) {
                                a8 a8Var = new a8(0, H.d, H.e, false, false);
                                H.c(a8Var);
                                i30Var.I1 = a8Var;
                                a8Var.j(jb6.M0(2131743276, null), R.drawable.menu_video_chromecast, null);
                                i30Var.I1.setOnClickListener(new t(i30Var, H, (byte) 20));
                                gm.B2(o20Var);
                                i30Var.I1.addView(o20Var, 0, qoe.c(-1.0f, -1));
                                i30Var.updateColors();
                            }
                            H.l(R.drawable.msg_delete, new d20(i30Var, H, (byte) 3), jb6.M0(2131746378, null), i30Var.I0(), true);
                            H.Y(gm.L(64.0f));
                            H.a0();
                            break;
                        }
                        break;
                }
            }
        });
        k20Var2.addView(r7Var3, qoe.e(48, 48, 51));
        o20 o20Var = new o20(this, activity, (byte) 0);
        this.J1 = o20Var;
        this.K1 = true;
        try {
            o20Var.setRouteSelector(ie1.c(activity).a());
        } catch (Exception e) {
            fc4.g(e, true);
            this.K1 = false;
        }
        this.J1.setVisibility(4);
        ai2 ai2Var2 = this.H1;
        if (ai2Var2 != null) {
            ai2Var2.a(fp.w());
        }
        this.G1.setShowedFromBottom(true);
        this.G1.setDelegate(new u10(this, (byte) 2));
        this.G1.setContentDescription(jb6.M0(2131754838, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.u1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i7 = 8;
        linearLayout.setVisibility(8);
        this.b.addView(linearLayout, qoe.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new p8((byte) 15));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.music_empty);
        anb.s(imageView2, cmb.V5, ylbVar, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, qoe.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.v1 = textView2;
        int i8 = cmb.W5;
        anb.X(textView2, i8, ylbVar);
        textView2.setGravity(17);
        textView2.setText(jb6.M0(2131747977, null));
        textView2.setTypeface(gm.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(gm.L(40.0f), 0, gm.L(40.0f), 0);
        linearLayout.addView(textView2, qoe.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.w1 = textView3;
        anb.X(textView3, i8, ylbVar);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(gm.L(40.0f), 0, gm.L(40.0f), 0);
        linearLayout.addView(textView3, qoe.t(-2, -2, 17, 0, 6, 0, 0));
        p20 p20Var = new p20(this, activity);
        this.r1 = p20Var;
        p20Var.setClipToPadding(false);
        getContext();
        u46 u46Var = new u46(1, false);
        this.s1 = u46Var;
        p20Var.setLayoutManager(u46Var);
        p20Var.setHorizontalScrollBarEnabled(false);
        p20Var.setVerticalScrollBarEnabled(false);
        this.b.addView(p20Var, qoe.e(-1, -1, 51));
        h30 h30Var = new h30(this, activity);
        this.t1 = h30Var;
        p20Var.setAdapter(h30Var);
        anb.l(p20Var, 21, cmb.z5, ylbVar);
        p20Var.setOnItemClickListener(new l5((byte) 1));
        p20Var.setOnItemLongClickListener(new u10(this, (byte) 3));
        p20Var.setOnScrollListener(new y(this, (byte) 6));
        b61 b61Var = new b61(ylbVar, activity, true);
        b61Var.setRoundRadius(24);
        this.y1 = b61Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final byte b4 = 0;
        spannableStringBuilder.setSpan(new pn2(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) jb6.M0(2131753890, null));
        b61Var.setText(spannableStringBuilder);
        b61Var.setOnClickListener(new View.OnClickListener(this) { // from class: j20
            public final /* synthetic */ i30 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                byte b5 = b4;
                ylb ylbVar2 = ylbVar;
                i30 i30Var = this.b;
                switch (b5) {
                    case 0:
                        k47 k47Var2 = MediaController.w().v0;
                        if (k47Var2 != null && i30Var.z2 != null) {
                            i30Var.L0(k47Var2, true, new jd((byte) 10), false);
                            i30Var.O0(true);
                            ts2.u(null, 2131753877, new c41((FrameLayout) i30Var.b, ylbVar2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        k47 k47Var3 = MediaController.w().v0;
                        if (k47Var3 != null && i30Var.z2 != null) {
                            i30Var.L0(k47Var3, false, new jd((byte) 10), false);
                            i30Var.O0(false);
                            ts2.u(null, 2131753876, new c41((FrameLayout) i30Var.b, ylbVar2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.x1.addView(b61Var, qoe.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final byte b5 = 1;
        b61 b61Var2 = new b61(ylbVar, activity, true);
        b61Var2.setRoundRadius(24);
        b61Var2.e();
        this.z1 = b61Var2;
        b61Var2.setText(jb6.M0(2131753882, null));
        b61Var2.setOnClickListener(new View.OnClickListener(this) { // from class: j20
            public final /* synthetic */ i30 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                byte b52 = b5;
                ylb ylbVar2 = ylbVar;
                i30 i30Var = this.b;
                switch (b52) {
                    case 0:
                        k47 k47Var2 = MediaController.w().v0;
                        if (k47Var2 != null && i30Var.z2 != null) {
                            i30Var.L0(k47Var2, true, new jd((byte) 10), false);
                            i30Var.O0(true);
                            ts2.u(null, 2131753877, new c41((FrameLayout) i30Var.b, ylbVar2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        k47 k47Var3 = MediaController.w().v0;
                        if (k47Var3 != null && i30Var.z2 != null) {
                            i30Var.L0(k47Var3, false, new jd((byte) 10), false);
                            i30Var.O0(false);
                            ts2.u(null, 2131753876, new c41((FrameLayout) i30Var.b, ylbVar2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.x1.addView(b61Var2, qoe.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        jc7 jc7Var = MediaController.w().R0;
        this.p2 = jc7Var;
        boolean z = jc7Var != null;
        this.n2 = z;
        this.m1.n0 = z;
        this.o2 = I0();
        this.q2 = MediaController.w().S0;
        if (I0()) {
            r6Var = t;
            this.d2 = r6Var.a(8, R.drawable.msg_add);
        } else {
            r6Var = t;
        }
        r7 a = r6Var.a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new q20(this, (byte) 0);
        this.e2 = a;
        a.setContentDescription(jb6.M0(2131745570, null));
        EditTextBoldCursor searchField = a.getSearchField();
        searchField.setHint(jb6.M0(2131745570, null));
        int i9 = cmb.Ej;
        anb.X(searchField, i9, ylbVar);
        anb.D(searchField, cmb.Ij, ylbVar);
        anb.l(searchField, 30, i9, ylbVar);
        if (z) {
            p20Var.r1();
            s0(cmb.v0(cmb.Z6, ylbVar));
            this.m1.setAlpha(1.0f);
            this.l1.setAlpha(0.0f);
            v20 v20Var = this.L2;
            x20 x20Var2 = this.m1;
            Float valueOf = Float.valueOf(0.0f);
            v20Var.getClass();
            v20Var.a(x20Var2, valueOf);
        }
        boolean z2 = this.q2.size() > 1;
        h30Var.h = z2;
        if (z2) {
            p20Var.setVisibility(0);
            p20Var.setTranslationY(0.0f);
        } else {
            p20Var.setVisibility(8);
            p20Var.setTranslationY(gm.q.y);
        }
        h30Var.f();
        this.m1.setTitle(jb6.M0(2131753917, null));
        jc7 jc7Var2 = this.p2;
        if (jc7Var2 != null) {
            long j = jc7Var2.b;
            long e2 = z8c.h(this.a).e();
            x20 x20Var3 = this.m1;
            if (j == e2) {
                x20Var3.setTitle(jb6.M0(2131746376, null));
            } else {
                x20Var3.setTitle(jb6.a0(null, null, 2131746377, pg3.s(this.p2.b)));
            }
        } else if (k47Var != null && MediaController.w().D0 == null) {
            long B0 = k47.B0(k47Var.k);
            boolean B = pg3.B(B0);
            int i10 = this.a;
            if (B) {
                TLRPC.EncryptedChat Z0 = oc7.r1(i10).Z0(Integer.valueOf((int) (B0 & 4294967295L)));
                if (Z0 != null && (W1 = oc7.r1(this.a).W1(Long.valueOf(Z0.user_id))) != null) {
                    this.m1.setTitle(bw2.m(0, W1.first_name, W1.last_name));
                }
            } else if (B0 == z8c.h(i10).e()) {
                long P1 = k47Var.P1();
                x20 x20Var4 = this.m1;
                if (P1 == 2666000) {
                    x20Var4.setTitle(jb6.M0(2131754217, null));
                } else {
                    x20Var4.setTitle(jb6.M0(2131745635, null));
                }
            } else {
                boolean D = pg3.D(B0);
                int i11 = this.a;
                if (D) {
                    TLRPC.User W12 = oc7.r1(i11).W1(Long.valueOf(B0));
                    if (W12 != null) {
                        this.m1.setTitle(bw2.m(0, W12.first_name, W12.last_name));
                    }
                } else {
                    TLRPC.Chat L0 = oc7.r1(i11).L0(Long.valueOf(-B0));
                    if (L0 != null) {
                        this.m1.setTitle(L0.title);
                    }
                }
            }
        }
        if (I0()) {
            b61Var.setVisibility(8);
            b61Var2.setVisibility(8);
            hu5 hu5Var = new hu5(new r20(this, (byte) 0));
            this.A1 = hu5Var;
            hu5Var.h(p20Var);
        }
        this.b.addView(this.x1, qoe.e(-1, ((I0() || this.s2) ? 0 : 52) + nm7.I2, 83));
        this.b.addView(this.o1, new FrameLayout.LayoutParams(-1, gm.e1(), 83));
        ((FrameLayout.LayoutParams) this.x1.getLayoutParams()).height = gm.L(((I0() || this.s2) ? 0 : 52) + nm7.I2);
        ((FrameLayout.LayoutParams) this.o1.getLayoutParams()).bottomMargin = gm.L(nm7.I2 + ((I0() || this.s2) ? 0 : 52));
        this.b.addView(this.n1, qoe.c(3.0f, -1));
        this.b.addView(this.m1);
        k20 k20Var3 = new k20(this, activity, (byte) 1);
        this.b2 = k20Var3;
        k20Var3.setAlpha(0.0f);
        k20Var3.setVisibility(4);
        this.c.addView(k20Var3);
        bf0 bf0Var = new bf0(activity);
        this.c2 = bf0Var;
        bf0Var.setAspectFit(true);
        bf0Var.setRoundRadius(gm.L(8.0f));
        bf0Var.setScaleX(0.9f);
        bf0Var.setScaleY(0.9f);
        k20Var3.addView(bf0Var, qoe.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        a1(false);
        X0();
        if (this.q1 && h30Var.b() == 0) {
            i7 = 0;
        }
        linearLayout.setVisibility(i7);
        T0();
    }

    public static boolean F0(float f, float f2) {
        return Math.abs(f - f2) < 0.05f;
    }

    public static gn5 H0(k47 k47Var) {
        TLRPC.Document F0 = k47Var.F0();
        TLRPC.PhotoSize w = F0 != null ? bc4.w(F0.thumbs, 360, false, null, false) : null;
        if (!(w instanceof TLRPC.TL_photoSize) && !(w instanceof TLRPC.TL_photoSizeProgressive)) {
            w = null;
        }
        if (w != null) {
            return gn5.c(w, F0);
        }
        String u0 = k47Var.u0(true);
        if (u0 != null) {
            return gn5.g(u0);
        }
        return null;
    }

    @Override // my0
    public final boolean C() {
        return false;
    }

    public final bu5 D0(bu5 bu5Var, k47 k47Var) {
        ic7 F1 = oc7.r1(this.a).F1();
        TLRPC.Document F0 = k47Var.F0();
        long j = F0 != null ? F0.id : 0L;
        bu5 K = bu5Var.K();
        K.b(R.drawable.ic_ab_back, jb6.M0(2131753721, null), new bo1(bu5Var, (byte) 0), false);
        K.j();
        K.k(R.drawable.left_status_profile, jb6.M0(2131753878, null), new b20(this, k47Var, bu5Var, (byte) 6), !F1.b.contains(Long.valueOf(j)));
        K.b(R.drawable.msg_saved, jb6.M0(2131753875, null), new b20(this, k47Var, bu5Var, (byte) 7), false);
        K.b(R.drawable.menu_download_round, jb6.M0(2131753879, null), new b20(this, k47Var, bu5Var, (byte) 8), false);
        K.j();
        K.o(12, gm.L(200.0f), jb6.M0(2131753880, null));
        return K;
    }

    public final void E0() {
        r7 r7Var = this.U1;
        int v0 = cmb.v0(((Integer) r7Var.getTag()).intValue(), this.J0);
        int v02 = cmb.v0(cmb.Mj, this.J0);
        int v03 = cmb.v0(cmb.h6, this.J0);
        if (!this.O2 || v0 != this.P2) {
            this.P2 = v0;
            r7Var.setIconColor(v0);
        }
        boolean z = this.O2;
        r7 r7Var2 = this.G1;
        if (!z || v02 != this.Q2) {
            this.Q2 = v02;
            r7Var2.setIconColor(v02);
        }
        if (!this.O2 || v03 != this.R2) {
            this.R2 = v03;
            cmb.F1(r7Var.getBackground(), v03, true);
            cmb.F1(r7Var2.getBackground(), v03, true);
        }
        this.O2 = true;
        this.L1.setProgressColor(cmb.v0(cmb.Lj, this.J0));
        Y0();
        int i = cmb.F8;
        r7Var.I(cmb.v0(i, this.J0));
        int i2 = cmb.D8;
        r7Var2.O(cmb.v0(i2, this.J0), false);
        r7Var2.O(cmb.v0(i2, this.J0), true);
        r7Var2.I(cmb.v0(i, this.J0));
    }

    public final void G0(k47 k47Var) {
        ArrayList u;
        TLRPC.TL_document tL_document;
        int i = z8c.t0;
        int i2 = this.a;
        LaunchActivity launchActivity = this.z2;
        if (i != i2) {
            launchActivity.N0(i2);
        }
        Bundle j = td4.j(3, "onlySelect", "dialogsType", true);
        j.putBoolean("canSelectTopics", true);
        nk3 nk3Var = new nk3(j);
        if (k47Var.e1() >= 0) {
            u = td4.u(k47Var);
            tL_document = null;
        } else {
            if (!(k47Var.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) k47Var.F0();
            u = null;
        }
        nk3Var.E2 = new lu((Object) this, (Object) u, (Object) tL_document, (Object) k47Var, (byte) 1);
        launchActivity.t0(nk3Var);
        dismiss();
    }

    public final boolean I0() {
        jc7 jc7Var = this.p2;
        return jc7Var != null && jc7Var.b == z8c.h(this.a).e();
    }

    public final void J0(int i) {
        LaunchActivity launchActivity;
        k47 k47Var = MediaController.w().v0;
        if (k47Var == null || (launchActivity = this.z2) == null) {
            return;
        }
        if (i == 1) {
            G0(k47Var);
            return;
        }
        if (i == 2) {
            P0(k47Var);
            return;
        }
        byte b = 0;
        if (i != 4) {
            if (i == 5) {
                K0(k47Var);
                return;
            }
            if (i == 6) {
                hi2.v().Q(MediaController.w().u());
                this.J1.performClick();
                return;
            } else {
                if (i == 7) {
                    L0(k47Var, false, new y10(this, k47Var, b), false);
                    return;
                }
                if (i == 8) {
                    zz9 zz9Var = new zz9(getContext(), true, null, new a20(this, b), null);
                    zz9Var.c2 = true;
                    zz9Var.U1 = false;
                    zz9Var.j2.O(true);
                    zz9Var.show();
                    return;
                }
                return;
            }
        }
        int i2 = z8c.t0;
        int i3 = this.a;
        if (i2 != i3) {
            launchActivity.N0(i3);
        }
        Bundle bundle = new Bundle();
        long B0 = k47.B0(k47Var.k);
        if (pg3.B(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (pg3.D(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat L0 = oc7.r1(this.a).L0(Long.valueOf(-B0));
            if (L0 != null && L0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -L0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", k47Var.e1());
        nm7.f(this.a).k(nm7.s, new Object[0]);
        launchActivity.u0(new yv1(bundle), false, false);
        dismiss();
    }

    public final void K0(k47 k47Var) {
        if (Build.VERSION.SDK_INT <= 28 || e21.b) {
            LaunchActivity launchActivity = this.z2;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String B = bc4.B(k47Var.F0());
        if (TextUtils.isEmpty(B)) {
            B = k47Var.S0();
        }
        String str = B;
        String str2 = k47Var.k.attachPath;
        if (str2 != null && str2.length() > 0 && !aq1.t(str2)) {
            str2 = null;
        }
        byte b = 1;
        if (str2 == null || str2.length() == 0) {
            bc4.G(this.a);
            str2 = bc4.M(k47Var.k, false, true).toString();
        }
        String str3 = k47Var.F0() != null ? k47Var.F0().mime_type : "";
        MediaController.d0(str2, this.z2, 3, str, str3, new a20(this, b));
    }

    public final void L0(k47 k47Var, boolean z, Runnable runnable, boolean z2) {
        TLRPC.Document F0 = k47Var.F0();
        if (F0 == null) {
            return;
        }
        long j = F0.id;
        TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
        tL_account_saveMusic.unsave = !z;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_account_saveMusic.id = tL_inputDocument;
        tL_inputDocument.id = j;
        tL_inputDocument.access_hash = F0.access_hash;
        byte[] bArr = F0.file_reference;
        tL_inputDocument.file_reference = bArr;
        if (bArr == null) {
            tL_inputDocument.file_reference = new byte[0];
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_account_saveMusic, new e20(this, z2, k47Var, z, runnable, j, F0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r4.getBottom() <= r7.getMeasuredHeight()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M0(boolean z) {
        k47 k47Var = MediaController.w().v0;
        boolean z2 = false;
        if (k47Var != null) {
            if (z) {
                p20 p20Var = this.r1;
                int childCount = p20Var.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = p20Var.getChildAt(i);
                    if (!(childAt instanceof j30) || ((j30) childAt).getMessageObject() != k47Var) {
                        i++;
                    }
                }
            }
            int indexOf = this.q2.indexOf(k47Var);
            if (this.o2) {
                indexOf++;
            }
            if (indexOf >= 0) {
                boolean z3 = gda.K0;
                z2 = true;
                u46 u46Var = this.s1;
                if (z3) {
                    u46Var.m0(indexOf);
                    return true;
                }
                u46Var.m0(this.q2.size() - indexOf);
            }
        }
        return z2;
    }

    public final void N0(a8 a8Var, boolean z) {
        if (z) {
            int i = cmb.Nj;
            a8Var.setTextColor(cmb.v0(i, this.J0));
            a8Var.setIconColor(cmb.v0(i, this.J0));
        } else {
            int i2 = cmb.D8;
            a8Var.setTextColor(cmb.v0(i2, this.J0));
            a8Var.setIconColor(cmb.v0(i2, this.J0));
        }
    }

    public final void O0(final boolean z) {
        boolean I0 = I0();
        b61 b61Var = this.z1;
        b61 b61Var2 = this.y1;
        if (I0 || this.s2) {
            b61Var2.setVisibility(8);
            b61Var.setVisibility(8);
            return;
        }
        final byte b = 0;
        b61Var2.setVisibility(0);
        b61Var.setVisibility(0);
        ViewPropertyAnimator duration = b61Var2.animate().alpha(z ? 0.0f : 1.0f).scaleX(z ? 0.8f : 1.0f).scaleY(z ? 0.8f : 1.0f).setDuration(420L);
        d53 d53Var = d53.h;
        duration.setInterpolator(d53Var).withEndAction(new Runnable(this) { // from class: z10
            public final /* synthetic */ i30 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                boolean z2 = z;
                i30 i30Var = this.b;
                switch (b2) {
                    case 0:
                        i30Var.y1.setVisibility(z2 ? 8 : 0);
                        break;
                    default:
                        i30Var.z1.setVisibility(z2 ? 0 : 8);
                        break;
                }
            }
        }).start();
        final byte b2 = 1;
        b61Var.animate().alpha(z ? 1.0f : 0.0f).scaleX(!z ? 0.8f : 1.0f).scaleY(z ? 1.0f : 0.8f).setDuration(420L).setInterpolator(d53Var).withEndAction(new Runnable(this) { // from class: z10
            public final /* synthetic */ i30 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                boolean z2 = z;
                i30 i30Var = this.b;
                switch (b22) {
                    case 0:
                        i30Var.y1.setVisibility(z2 ? 8 : 0);
                        break;
                    default:
                        i30Var.z1.setVisibility(z2 ? 0 : 8);
                        break;
                }
            }
        }).start();
    }

    @Override // my0
    public final int P() {
        k20 k20Var = this.x1;
        if (k20Var == null) {
            return 0;
        }
        if (this.q2.size() <= 1) {
            return k20Var.getMeasuredHeight() + this.t0;
        }
        int L = gm.L(13.0f);
        int translationY = (int) (this.r1.getTranslationY() + ((this.t2 - this.t0) - L));
        if (this.t0 + translationY < a.getCurrentActionBarHeight()) {
            float L2 = gm.L(4.0f) + L;
            translationY -= (int) ((a.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((a.getCurrentActionBarHeight() - translationY) - this.t0) / L2));
        }
        return this.c.getMeasuredHeight() - (translationY + gm.m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r1.exists() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(k47 k47Var) {
        File file;
        try {
            if (!TextUtils.isEmpty(k47Var.k.attachPath)) {
                file = new File(k47Var.k.attachPath);
            }
            file = null;
            if (file == null) {
                bc4.G(this.a);
                file = bc4.M(k47Var.k, false, true);
            }
            if (!file.exists()) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.z2);
                alertDialog$Builder.a.S = jb6.M0(R.string.AppName, null);
                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                alertDialog$Builder.a.U = jb6.M0(2131746951, null);
                alertDialog$Builder.o();
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(k47Var.t1());
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    Context context = org.telegram.messenger.a.b;
                    org.telegram.messenger.a.d();
                    intent.putExtra("android.intent.extra.STREAM", FileProvider.c(context, "org.telegram.messenger.beta.provider", file));
                    intent.setFlags(1);
                } catch (Exception unused) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                }
            } else {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
            }
            this.z2.startActivityForResult(Intent.createChooser(intent, jb6.M0(2131745193, null)), 500);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void Q0(boolean z, boolean z2) {
        byte b = 1;
        bf0 bf0Var = this.c2;
        k20 k20Var = this.b2;
        if (z) {
            if (k20Var.getVisibility() == 0 || this.f2) {
                return;
            }
            k20Var.setTag(1);
            y20 y20Var = this.B1;
            bf0Var.setImageBitmap(y20Var.a[y20Var.b ? 1 : 0].getImageReceiver().n());
            this.f2 = true;
            vs9.d(new v10(this, b));
            k20Var.setVisibility(0);
            k20Var.animate().alpha(1.0f).setDuration(180L).setListener(new u20(this, (byte) 0)).start();
            bf0Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (k20Var.getVisibility() != 0) {
            return;
        }
        k20Var.setTag(null);
        if (z2) {
            this.f2 = true;
            k20Var.animate().alpha(0.0f).setDuration(180L).setListener(new u20(this, b)).start();
            bf0Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            k20Var.setAlpha(0.0f);
            k20Var.setVisibility(4);
            bf0Var.setImageBitmap(null);
            bf0Var.setScaleX(0.9f);
            bf0Var.setScaleY(0.9f);
        }
    }

    @Override // my0
    public final ArrayList R() {
        ArrayList arrayList = new ArrayList();
        t10 t10Var = new t10(this, (byte) 0);
        int i = cmb.Ej;
        arrayList.add(new cnb(this.m1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        int i2 = cmb.Ij;
        arrayList.add(new cnb(this.m1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, (bnb) null, cmb.g5));
        arrayList.add(new cnb(this.L1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Lj));
        int i3 = cmb.v7;
        r7 r7Var = this.O1;
        arrayList.add(new cnb(r7Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(r7Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.w7));
        int i4 = cmb.Mj;
        r7 r7Var2 = this.U1;
        arrayList.add(new cnb(r7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, i4));
        arrayList.add(new cnb(r7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, cmb.Nj));
        int i5 = cmb.D8;
        arrayList.add(new cnb(r7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, i5));
        int i6 = cmb.F8;
        arrayList.add(new cnb(r7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, i6));
        r7 r7Var3 = this.G1;
        arrayList.add(new cnb(r7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, i4));
        arrayList.add(new cnb(r7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, i5));
        arrayList.add(new cnb(r7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t10Var, i6));
        m20 m20Var = this.D1;
        arrayList.add(new cnb(m20Var, new p09[]{m20Var.getAnimatedDrawable()}, "Triangle 3", i4));
        arrayList.add(new cnb(m20Var, new p09[]{m20Var.getAnimatedDrawable()}, "Triangle 4", i4));
        arrayList.add(new cnb(m20Var, new p09[]{m20Var.getAnimatedDrawable()}, "Rectangle 4", i4));
        int i7 = cmb.h6;
        arrayList.add(new cnb(this.D1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i7));
        arrayList.add(new cnb(this.Z1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i7));
        n20 n20Var = this.E1;
        arrayList.add(new cnb(n20Var, new p09[]{n20Var.getAnimatedDrawable()}, "Triangle 3", i4));
        arrayList.add(new cnb(n20Var, new p09[]{n20Var.getAnimatedDrawable()}, "Triangle 4", i4));
        arrayList.add(new cnb(n20Var, new p09[]{n20Var.getAnimatedDrawable()}, "Rectangle 4", i4));
        arrayList.add(new cnb(this.E1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i7));
        int i8 = cmb.W5;
        arrayList.add(new cnb(this.v1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i8));
        arrayList.add(new cnb(this.w1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i8));
        arrayList.add(new cnb(this.L1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        arrayList.add(new cnb(this.L1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        z20 z20Var = this.C1;
        arrayList.add(new cnb(z20Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(z20Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        z20 z20Var2 = this.F1;
        arrayList.add(new cnb(z20Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(z20Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.yj));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R0(j30 j30Var, k47 k47Var) {
        byte b = 1;
        bu5 H = bu5.H(this.c, this.J0, j30Var, true);
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (I0()) {
            H.k(R.drawable.msg_forward, jb6.M0(2131750519, null), new b20(this, H, k47Var, (byte) (objArr2 == true ? 1 : 0)), !this.s2);
            H.k(R.drawable.msg_shareout, jb6.M0(2131745193, null), new b20(this, H, k47Var, b), !this.s2);
            H.b(R.drawable.msg_delete, jb6.M0(2131751535, null), new b20(this, k47Var, H, (byte) 2), true);
        } else {
            H.k(R.drawable.msg_stories_save, jb6.M0(2131753881, null), new c20(H, D0(H, k47Var), objArr == true ? 1 : 0), !this.s2);
            if (!this.s2 && H.z() != null) {
                H.z().setRightIcon(R.drawable.msg_arrowright);
            }
            H.j();
            H.k(R.drawable.msg_forward, jb6.M0(2131750519, null), new b20(this, H, k47Var, r1), !this.s2);
            H.k(R.drawable.msg_share, jb6.M0(2131745193, null), new b20(this, H, k47Var, (byte) 4), !this.s2);
            H.k(R.drawable.msg_view_file, jb6.M0(2131745076, null), new y10(this, k47Var, b), k47Var.e1() > 0);
        }
        H.W(jb6.a0 ? (byte) 3 : (byte) 5);
        H.a0();
    }

    public final void S0() {
        if (this.A2 == 1) {
            this.D2 = System.currentTimeMillis();
            this.B2 = MediaController.w().v0.b0;
            o1 o1Var = this.H2;
            gm.r(o1Var);
            gm.c3(o1Var);
        }
    }

    @Override // my0
    public final boolean T(float f, float f2) {
        FrameLayout frameLayout = this.F;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.F.getChildAt(0);
            if (f2 >= childAt.getY() + this.F.getY()) {
                if (f2 <= childAt.getY() + this.F.getY() + childAt.getHeight()) {
                    if (f >= childAt.getX() + this.F.getX()) {
                        if (f <= childAt.getX() + this.F.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        int top = this.b.getTop();
        Drawable drawable = this.s0;
        return f2 < ((float) (top + (drawable != null ? drawable.getBounds().top : 0))) || f < ((float) this.b.getLeft()) || f > ((float) this.b.getRight());
    }

    public final void T0() {
        LinearLayout linearLayout = this.u1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.b.getMeasuredHeight()) - (this.x1.getVisibility() == 0 ? gm.L(150.0f) : -gm.L(30.0f))) / 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0() {
        Integer num;
        int z;
        float min;
        AnimatorSet animatorSet;
        boolean z2;
        p20 p20Var = this.r1;
        if (p20Var.getChildCount() <= 0) {
            int paddingTop = p20Var.getPaddingTop();
            this.t2 = paddingTop;
            p20Var.setTopGlowOffset(paddingTop);
            this.b.invalidate();
            return;
        }
        boolean z3 = false;
        View childAt = p20Var.getChildAt(0);
        b59 b59Var = (b59) p20Var.G(childAt);
        int top = childAt instanceof j30 ? childAt.getTop() : childAt.getBottom();
        int L = gm.L(7.0f);
        if (top < gm.L(7.0f) || b59Var == null || b59Var.b() != 0) {
            top = L;
        }
        boolean z4 = top <= gm.L(12.0f);
        x20 x20Var = this.m1;
        Object tag = x20Var.getTag();
        if (z4) {
            if (tag == null) {
                num = 1;
                x20Var.setTag(num);
                animatorSet = this.v2;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.v2 = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.v2 = animatorSet2;
                z2 = this.n2;
                byte b = 2;
                View view = this.n1;
                if (z2) {
                    Property property = View.ALPHA;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(x20Var, (Property<x20, Float>) property, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z4 ? 1.0f : 0.0f));
                } else {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x20Var, this.L2, z4 ? 1.0f : 0.0f);
                    Property property2 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(this.l1, (Property<View, Float>) property2, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z4 ? 1.0f : 0.0f));
                }
                this.v2.setDuration(320L);
                this.v2.setInterpolator(d53.h);
                this.v2.addListener(new u20(this, b));
                this.v2.start();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) p20Var.getLayoutParams();
            z = b10.z(11.0f, layoutParams.topMargin - gm.m, top);
            if (this.t2 != z) {
                this.t2 = z;
                p20Var.setTopGlowOffset((z - layoutParams.topMargin) - gm.m);
                this.b.invalidate();
            }
            int L2 = gm.L(13.0f);
            min = this.t0 + ((int) (p20Var.getTranslationY() + ((this.t2 - this.t0) - L2))) < a.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((a.getCurrentActionBarHeight() - r0) - this.t0) / (gm.L(4.0f) + L2)) : 1.0f;
            this.G2 = min;
            if (min <= 0.5f && on2.h(cmb.v0(cmb.g5, this.J0)) > 0.699999988079071d) {
                z3 = true;
            }
            if (z3 == this.F2) {
                this.F2 = z3;
                gm.l3(this, z3);
                return;
            }
            return;
        }
        if (tag != null) {
            num = null;
            x20Var.setTag(num);
            animatorSet = this.v2;
            if (animatorSet != null) {
            }
            AnimatorSet animatorSet22 = new AnimatorSet();
            this.v2 = animatorSet22;
            z2 = this.n2;
            byte b2 = 2;
            View view2 = this.n1;
            if (z2) {
            }
            this.v2.setDuration(320L);
            this.v2.setInterpolator(d53.h);
            this.v2.addListener(new u20(this, b2));
            this.v2.start();
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) p20Var.getLayoutParams();
        z = b10.z(11.0f, layoutParams2.topMargin - gm.m, top);
        if (this.t2 != z) {
        }
        int L22 = gm.L(13.0f);
        if (this.t0 + ((int) (p20Var.getTranslationY() + ((this.t2 - this.t0) - L22))) < a.getCurrentActionBarHeight()) {
        }
        this.G2 = min;
        if (min <= 0.5f) {
            z3 = true;
        }
        if (z3 == this.F2) {
        }
    }

    public final void V0(boolean z) {
        if (this.O1 == null) {
            return;
        }
        float f = MediaController.w().r0;
        this.P1.b(z, f);
        this.Q1.e(z, f);
        updateColors();
        boolean z2 = this.R1;
        int i = 0;
        this.R1 = false;
        while (true) {
            a8[] a8VarArr = this.S1;
            if (i >= a8VarArr.length) {
                return;
            }
            if (z2 || !F0(f, T2[i])) {
                a8 a8Var = a8VarArr[i];
                int i2 = cmb.D8;
                a8Var.d(cmb.v0(i2, this.J0), cmb.v0(i2, this.J0));
            } else {
                a8 a8Var2 = a8VarArr[i];
                int i3 = cmb.Gi;
                a8Var2.d(cmb.v0(i3, this.J0), cmb.v0(i3, this.J0));
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (org.telegram.messenger.MediaController.w().C() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(k47 k47Var, boolean z) {
        boolean z2;
        float f;
        int i;
        a30 a30Var = this.M1;
        if (a30Var != null) {
            if (a30Var.x) {
                i = (int) (k47Var.L0() * a30Var.getProgress());
            } else {
                if (this.B2 >= 0.0f) {
                    int i2 = this.A2;
                    z2 = true;
                    if (i2 != -1) {
                        if (i2 == 1) {
                        }
                    }
                    if (z2) {
                        a30Var.e(z, k47Var.b0);
                    } else {
                        a30Var.e(z, this.B2);
                    }
                    f = 1.0f;
                    if (!this.j2) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(elapsedRealtime - this.i2) >= 500) {
                            if (MediaController.w().m0) {
                                f = bc4.G(this.a).t(this.u2, k47Var.b0);
                            }
                            this.i2 = elapsedRealtime;
                        } else {
                            f = -1.0f;
                        }
                    }
                    if (f != -1.0f) {
                        zna znaVar = this.h2;
                        znaVar.m.i = f * 1000.0f;
                        znaVar.h();
                    }
                    if (z2) {
                        i = k47Var.i0;
                    } else {
                        i = (int) (k47Var.L0() * a30Var.getProgress());
                        k47Var.i0 = i;
                    }
                }
                z2 = false;
                if (z2) {
                }
                f = 1.0f;
                if (!this.j2) {
                }
                if (f != -1.0f) {
                }
                if (z2) {
                }
            }
            if (this.w2 != i) {
                this.w2 = i;
                this.N1.l(gm.g0(i, false, false), false);
            }
            a30Var.g(k47Var);
        }
    }

    public final void X0() {
        int i = gda.O0;
        r7 r7Var = this.U1;
        if (i != 0 && i != 1) {
            if (i == 2) {
                r7Var.setIcon(R.drawable.player_new_repeatone);
                int i2 = cmb.Nj;
                r7Var.setTag(Integer.valueOf(i2));
                r7Var.setIconColor(cmb.v0(i2, this.J0));
                cmb.F1(r7Var.getBackground(), cmb.v0(i2, this.J0) & 436207615, true);
                r7Var.setContentDescription(jb6.M0(2131754784, null));
                return;
            }
            return;
        }
        if (gda.J0) {
            if (i == 0) {
                r7Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                r7Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (!gda.K0) {
            r7Var.setIcon(R.drawable.player_new_repeatall);
        } else if (i == 0) {
            r7Var.setIcon(R.drawable.player_new_order);
        } else {
            r7Var.setIcon(R.drawable.player_new_repeat_reverse);
        }
        if (i == 0 && !gda.J0 && !gda.K0) {
            int i3 = cmb.Mj;
            r7Var.setTag(Integer.valueOf(i3));
            r7Var.setIconColor(cmb.v0(i3, this.J0));
            cmb.F1(r7Var.getBackground(), cmb.v0(cmb.h6, this.J0), true);
            r7Var.setContentDescription(jb6.M0(2131754785, null));
            return;
        }
        int i4 = cmb.Nj;
        r7Var.setTag(Integer.valueOf(i4));
        r7Var.setIconColor(cmb.v0(i4, this.J0));
        cmb.F1(r7Var.getBackground(), cmb.v0(i4, this.J0) & 436207615, true);
        if (i != 0) {
            r7Var.setContentDescription(jb6.M0(2131754786, null));
        } else if (gda.J0) {
            r7Var.setContentDescription(jb6.M0(2131745056, null));
        } else {
            r7Var.setContentDescription(jb6.M0(2131745760, null));
        }
    }

    public final void Y0() {
        N0(this.X1, gda.J0);
        N0(this.Y1, gda.K0);
        N0(this.W1, gda.O0 == 1);
        N0(this.V1, gda.O0 == 2);
    }

    public final void Z0() {
        int v0 = cmb.v0(this.n2 ? cmb.Z6 : cmb.g5, this.J0);
        if (v0 != this.N2) {
            this.N2 = v0;
            s0(v0);
        }
        int v02 = cmb.v0(cmb.Mj, this.J0);
        m20 m20Var = this.D1;
        if (m20Var != null) {
            m20Var.h(v02, "Triangle 3");
            m20Var.h(v02, "Triangle 4");
            m20Var.h(v02, "Rectangle 4");
        }
        n20 n20Var = this.E1;
        if (n20Var != null) {
            n20Var.h(v02, "Triangle 3");
            n20Var.h(v02, "Triangle 4");
            n20Var.h(v02, "Rectangle 4");
        }
        a30 a30Var = this.M1;
        if (a30Var != null) {
            a30Var.setOuterColor(cmb.v0(cmb.Lj, this.J0));
        }
        boolean z = false;
        r7 r7Var = this.O1;
        if (r7Var != null) {
            float f = MediaController.w().r0;
            int v03 = cmb.v0(!F0(f, 1.0f) ? cmb.Gi : cmb.w7, this.J0);
            dna dnaVar = this.P1;
            if (dnaVar != null) {
                dnaVar.a.u(v03);
                Paint paint = dnaVar.b;
                if (paint != null) {
                    paint.setColor(v03);
                }
            }
            cmb.F1(r7Var.getBackground(), v03 & 436207615, true);
            int i = 0;
            while (true) {
                a8[] a8VarArr = this.S1;
                if (i >= a8VarArr.length) {
                    break;
                }
                if (a8VarArr[i] != null) {
                    int v04 = cmb.v0(F0(f, T2[i]) ? cmb.Gi : cmb.D8, this.J0);
                    a8VarArr[i].d(v04, v04);
                }
                i++;
            }
        }
        a8 a8Var = this.I1;
        if (a8Var != null) {
            o20 o20Var = this.J1;
            if (o20Var != null && o20Var.b()) {
                z = true;
            }
            int v05 = cmb.v0(cmb.D8, this.J0);
            int v06 = cmb.v0(cmb.E8, this.J0);
            int i2 = cmb.Ei;
            a8Var.e(v05, v06, cmb.v0(i2, this.J0), z);
            this.I1.setSelectorColor((o20Var == null || !o20Var.b()) ? cmb.v0(cmb.h6, this.J0) : cmb.p1(0.1f, cmb.v0(i2, this.J0)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0110, code lost:
    
        if (r2.exists() == false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a1(boolean z) {
        long j;
        long j2;
        File file;
        k47 k47Var;
        k47 k47Var2;
        bf0 bf0Var;
        int i;
        String str;
        Bitmap bitmap;
        k47 k47Var3 = MediaController.w().v0;
        if (k47Var3 == null) {
            if (!z) {
                this.r2 = null;
                return;
            }
        } else if (k47Var3.I3()) {
            byte b = 1;
            Object[] objArr = 0;
            boolean z2 = k47Var3 == this.r2;
            this.r2 = k47Var3;
            long j3 = k47Var3.T;
            r7 r7Var = this.G1;
            if (j3 != 0 || k47Var3.e1() <= -2000000000) {
                r7Var.setVisibility(4);
            } else {
                r7Var.setVisibility(0);
            }
            long B0 = k47.B0(k47Var3.k);
            if (k47Var3.F0() != null) {
                j = 0;
                j2 = k47Var3.F0().id;
            } else {
                j = 0;
                j2 = 0;
            }
            boolean z3 = (B0 < j && oc7.r1(this.a).B2(B0)) || oc7.r1(this.a).B2(k47.B0(k47Var3.k)) || k47Var3.k.noforwards;
            if (z3 != this.s2) {
                this.s2 = z3;
                k20 k20Var = this.x1;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k20Var.getLayoutParams();
                layoutParams.height = gm.L(((z3 || I0()) ? 0 : 52) + nm7.I2);
                k20Var.setLayoutParams(layoutParams);
                View view = this.o1;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams2.bottomMargin = gm.L(nm7.I2 + ((I0() || z3) ? 0 : 52));
                view.setLayoutParams(layoutParams2);
            }
            if (z3) {
                r7Var.u(1);
                r7Var.u(2);
                r7Var.u(5);
                r7Var.u(6);
                r7Var.setAdditionalYOffset(-gm.L(16.0f));
            } else {
                r7Var.S(1);
                r7Var.S(2);
                r7Var.S(5);
                r7Var.setAdditionalYOffset(-gm.L(197.0f));
            }
            String str2 = k47Var3.k.attachPath;
            if (str2 != null && str2.length() > 0) {
                file = new File(k47Var3.k.attachPath);
            }
            file = null;
            if (file == null) {
                bc4.G(this.a);
                file = bc4.M(k47Var3.k, false, true);
            }
            Object[] objArr2 = gda.x0 && ((int) k47.B0(k47Var3.k)) != 0 && k47Var3.I3();
            boolean exists = file.exists();
            ImageView imageView = this.Z1;
            a30 a30Var = this.M1;
            k46 k46Var = this.L1;
            if (exists || objArr2 == true) {
                er3.q(this.a).v(this);
                k46Var.setVisibility(4);
                a30Var.setVisibility(0);
                imageView.setEnabled(true);
            } else {
                String S0 = k47Var3.S0();
                er3.q(this.a).a(S0, null, this);
                Float s = fn5.z().s(S0);
                k46Var.a(false, s != null ? s.floatValue() : 0.0f);
                k46Var.setVisibility(0);
                a30Var.setVisibility(4);
                imageView.setEnabled(false);
            }
            W0(k47Var3, !z2);
            y20 y20Var = this.B1;
            bf0 bf0Var2 = !z2 ? y20Var.a[!y20Var.b ? 1 : 0] : y20Var.a[y20Var.b ? 1 : 0];
            g10 g10Var = MediaController.w().E0;
            if (z2) {
                k47Var = k47Var3;
            } else {
                AnimatorSet animatorSet = y20Var.c;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                y20Var.c = new AnimatorSet();
                boolean z4 = y20Var.b;
                boolean z5 = !z4;
                y20Var.b = z5;
                bf0[] bf0VarArr = y20Var.a;
                bf0 bf0Var3 = bf0VarArr[z4 ? 1 : 0];
                bf0 bf0Var4 = bf0VarArr[z5 ? 1 : 0];
                boolean B = bf0Var3.getImageReceiver().B();
                bf0Var4.setAlpha(B ? 1.0f : 0.0f);
                bf0Var4.setScaleX(0.8f);
                bf0Var4.setScaleY(0.8f);
                bf0Var4.setVisibility(0);
                if (B) {
                    bf0Var3.bringToFront();
                } else {
                    bf0Var3.setVisibility(8);
                    bf0Var3.setImageDrawable(null);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
                k47Var = k47Var3;
                ofFloat.setDuration(125L);
                ofFloat.setInterpolator(d53.g);
                ofFloat.addUpdateListener(new d30(objArr == true ? 1 : 0, bf0Var4, B));
                if (B) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(bf0Var3.getScaleX(), 0.8f);
                    ofFloat2.setDuration(125L);
                    ofFloat2.setInterpolator(d53.i);
                    ofFloat2.addUpdateListener(new pl(bf0Var3, bf0Var4, b));
                    ofFloat2.addListener(new g0(bf0Var3, (byte) 16));
                    y20Var.c.playSequentially(ofFloat2, ofFloat);
                } else {
                    y20Var.c.play(ofFloat);
                }
                y20Var.c.start();
            }
            if (g10Var == null || (bitmap = g10Var.o) == null) {
                this.u2 = bc4.r(null, k47Var.F0());
                this.j2 = false;
                k47Var2 = k47Var;
                String u0 = k47Var2.u0(false);
                gn5 H0 = H0(k47Var2);
                if (TextUtils.isEmpty(u0)) {
                    bf0Var = bf0Var2;
                    i = 8;
                    if (H0 != null) {
                        bf0Var.g(1, 0L, null, H0, k47Var2, null, null, null);
                    } else {
                        str = null;
                        bf0Var.setImageDrawable(null);
                        bf0Var.invalidate();
                    }
                } else {
                    gn5 g = gn5.g(u0);
                    bf0Var = bf0Var2;
                    i = 8;
                    bf0Var.g(1, 0L, g, H0, k47Var2, null, null, null);
                }
                str = null;
                bf0Var.invalidate();
            } else {
                bf0Var2.setImageBitmap(bitmap);
                this.u2 = null;
                this.j2 = true;
                str = null;
                k47Var2 = k47Var;
                i = 8;
            }
            boolean C = MediaController.w().C();
            ae8 ae8Var = this.a2;
            if (C) {
                ae8Var.a(false, true);
                imageView.setContentDescription(jb6.M0(2131754929, str));
            } else {
                ae8Var.a(true, true);
                imageView.setContentDescription(jb6.M0(2131754930, str));
            }
            String y1 = k47Var2.y1(true);
            String w1 = k47Var2.w1(true);
            this.C1.setText(y1);
            this.F1.setText(w1);
            ic7 F1 = oc7.r1(this.a).F1();
            this.y1.setLoading(F1.c);
            O0(F1.b.contains(Long.valueOf(j2)));
            int L0 = (int) k47Var2.L0();
            this.x2 = L0;
            TextView textView = this.T1;
            if (textView != null) {
                textView.setText(L0 != 0 ? gm.g0(L0, false, false) : "-:--");
            }
            r7 r7Var2 = this.O1;
            if (L0 > 600) {
                r7Var2.setVisibility(0);
            } else {
                r7Var2.setVisibility(i);
            }
            if (z2) {
                return;
            }
            MediaController w = MediaController.w();
            ArrayList arrayList = w.S0;
            if (arrayList.size() > 1) {
                ArrayList arrayList2 = new ArrayList();
                int i2 = w.V0;
                int i3 = i2 + 1;
                int i4 = i2 - 1;
                if (i3 >= arrayList.size()) {
                    i3 = 0;
                }
                if (i3 <= -1) {
                    i3 = arrayList.size() - 1;
                }
                if (i4 <= -1) {
                    i4 = arrayList.size() - 1;
                }
                if (i4 >= arrayList.size()) {
                    i4 = 0;
                }
                arrayList2.add((k47) arrayList.get(i3));
                if (i3 != i4) {
                    arrayList2.add((k47) arrayList.get(i4));
                }
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    k47 k47Var4 = (k47) arrayList2.get(i5);
                    gn5 H02 = H0(k47Var4);
                    if (H02 != null) {
                        if (H02.g != null) {
                            fn5 z6 = fn5.z();
                            z6.s.c(new jm5(z6, H02.g, (byte) 3));
                        } else {
                            bc4.G(this.a).V(H02, k47Var4, null, 0, 1);
                        }
                    }
                }
                return;
            }
            return;
        }
        dismiss();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        j30 j30Var;
        k47 messageObject;
        j30 j30Var2;
        k47 messageObject2;
        k47 k47Var;
        int i3 = nm7.h2;
        int i4 = nm7.f2;
        int i5 = nm7.g2;
        p20 p20Var = this.r1;
        if (i == i3 || i == i5 || i == i4) {
            a1(i == i4 && ((Boolean) objArr[1]).booleanValue());
            if (i == i4 || i == i5) {
                int childCount = p20Var.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = p20Var.getChildAt(i6);
                    if ((childAt instanceof j30) && (messageObject = (j30Var = (j30) childAt).getMessageObject()) != null && (k47.Q4(messageObject.k) || messageObject.I3())) {
                        j30Var.b(false, true);
                    }
                }
                if (i == i5 && MediaController.w().v0 != null) {
                    if (MediaController.w().C()) {
                        S0();
                    } else if (this.A2 == 1 && this.B2 != -1.0f) {
                        o1 o1Var = this.H2;
                        gm.r(o1Var);
                        this.E2 = 0L;
                        o1Var.run();
                        this.B2 = -1.0f;
                    }
                }
            } else {
                if (((k47) objArr[0]).T != 0) {
                    return;
                }
                int childCount2 = p20Var.getChildCount();
                for (int i7 = 0; i7 < childCount2; i7++) {
                    View childAt2 = p20Var.getChildAt(i7);
                    if ((childAt2 instanceof j30) && (messageObject2 = (j30Var2 = (j30) childAt2).getMessageObject()) != null && (k47.Q4(messageObject2.k) || messageObject2.I3())) {
                        j30Var2.b(false, true);
                    }
                }
            }
            ai2 ai2Var = this.H1;
            if (ai2Var != null) {
                ai2Var.a(fp.w());
                return;
            }
            return;
        }
        if (i == nm7.e2) {
            k47 k47Var2 = MediaController.w().v0;
            if (k47Var2 == null || !k47Var2.I3()) {
                return;
            }
            W0(k47Var2, false);
            return;
        }
        if (i == nm7.N4) {
            V0(true);
            return;
        }
        int i8 = nm7.K0;
        h30 h30Var = this.t1;
        if (i == i8) {
            this.p2 = MediaController.w().R0;
            this.q2 = MediaController.w().S0;
            h30Var.f();
            return;
        }
        if (i == nm7.L0) {
            this.p2 = MediaController.w().R0;
            this.q2 = MediaController.w().S0;
            h30Var.f();
            if (gda.K0) {
                p20Var.D0();
                int intValue = ((Integer) objArr[0]).intValue();
                u46 u46Var = this.s1;
                u46Var.K0();
                int M0 = u46Var.M0();
                if (M0 != -1) {
                    View m = u46Var.m(M0);
                    u46Var.g1(M0 + intValue, m != null ? m.getTop() : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == nm7.Y1) {
            if (((String) objArr[0]).equals(this.u2)) {
                a1(false);
                this.j2 = true;
                return;
            }
            return;
        }
        if (i != nm7.X1) {
            if (i == nm7.X3) {
                a1(false);
                return;
            }
            return;
        }
        if (!((String) objArr[0]).equals(this.u2) || (k47Var = MediaController.w().v0) == null) {
            return;
        }
        if (!this.j2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - this.i2) >= 500) {
                r13 = MediaController.w().m0 ? bc4.G(this.a).t(this.u2, k47Var.b0) : 1.0f;
                this.i2 = elapsedRealtime;
            } else {
                r13 = -1.0f;
            }
        }
        if (r13 != -1.0f) {
            zna znaVar = this.h2;
            znaVar.m.i = r13 * 1000.0f;
            znaVar.h();
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        nm7.f(this.a).n(this, nm7.f2);
        nm7.f(this.a).n(this, nm7.g2);
        nm7.f(this.a).n(this, nm7.h2);
        nm7.f(this.a).n(this, nm7.e2);
        nm7.f(this.a).n(this, nm7.Y1);
        nm7.f(this.a).n(this, nm7.X1);
        nm7.f(this.a).n(this, nm7.K0);
        nm7.f(this.a).n(this, nm7.L0);
        nm7.f(this.a).n(this, nm7.X3);
        nm7.e().n(this, nm7.N4);
        er3.q(this.a).v(this);
        if (S2 == this) {
            S2 = null;
        }
    }

    @Override // cr3
    public final int getObserverTag() {
        return this.y2;
    }

    @Override // my0
    public final boolean h0(View view, int i, int i2, int i3, int i4) {
        k20 k20Var = this.b2;
        if (view != k20Var) {
            return false;
        }
        k20Var.layout(0, 0, k20Var.getMeasuredWidth(), k20Var.getMeasuredHeight());
        return true;
    }

    @Override // cr3
    public final void i(long j, long j2) {
        this.L1.a(true, Math.min(1.0f, j / j2));
    }

    @Override // my0
    public final boolean i0(View view, int i, int i2) {
        k20 k20Var = this.b2;
        if (view != k20Var) {
            return false;
        }
        dy0 dy0Var = this.c;
        k20Var.measure(View.MeasureSpec.makeMeasureSpec(dy0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dy0Var.getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // my0, android.app.Dialog
    public final void onBackPressed() {
        x20 x20Var = this.m1;
        if (x20Var != null && x20Var.o0) {
            x20Var.o(true);
        } else if (this.b2.getTag() != null) {
            Q0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // my0
    public final void p0() {
        super.p0();
        try {
            if (this.e2 != null && this.U1 != null && this.G1 != null && this.L1 != null) {
                E0();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            Z0();
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        try {
            float f = this.G2;
            if (f >= 0.0f) {
                boolean z = f <= 0.5f && on2.h(cmb.v0(cmb.g5, this.J0)) > 0.699999988079071d;
                if (z != this.F2) {
                    this.F2 = z;
                    gm.l3(this, z);
                }
            }
        } catch (Exception e3) {
            fc4.g(e3, true);
        }
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        super.show();
        S2 = this;
    }

    public final void updateColors() {
        r7 r7Var = this.O1;
        if (r7Var != null) {
            int v0 = cmb.v0(!F0(MediaController.w().r0, 1.0f) ? cmb.Gi : cmb.w7, this.J0);
            dna dnaVar = this.P1;
            if (dnaVar != null) {
                dnaVar.a.u(v0);
                Paint paint = dnaVar.b;
                if (paint != null) {
                    paint.setColor(v0);
                }
            }
            r7Var.setBackground(cmb.f0(v0 & 436207615, 1, gm.L(14.0f)));
        }
        a8 a8Var = this.I1;
        if (a8Var != null) {
            o20 o20Var = this.J1;
            boolean z = o20Var != null && o20Var.b();
            int v02 = cmb.v0(cmb.D8, this.J0);
            int v03 = cmb.v0(cmb.E8, this.J0);
            int i = cmb.Ei;
            a8Var.e(v02, v03, cmb.v0(i, this.J0), z);
            this.I1.setSelectorColor((o20Var == null || !o20Var.b()) ? cmb.v0(cmb.h6, this.J0) : cmb.p1(0.1f, cmb.v0(i, this.J0)));
        }
    }

    @Override // my0
    public final void z(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.Hj));
        hashSet.add(Integer.valueOf(cmb.Lj));
        hashSet.add(Integer.valueOf(cmb.Kj));
        hashSet.add(Integer.valueOf(cmb.Yd));
        hashSet.add(Integer.valueOf(cmb.Zd));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.ld));
        hashSet.add(Integer.valueOf(cmb.kd));
        hashSet.add(Integer.valueOf(cmb.Ze));
        hashSet.add(Integer.valueOf(cmb.Dc));
        hashSet.add(Integer.valueOf(cmb.Ye));
    }

    @Override // cr3
    public final void A(boolean z) {
    }

    @Override // cr3
    public final void N(String str) {
    }

    @Override // cr3
    public final void l(long j, long j2) {
    }
}
