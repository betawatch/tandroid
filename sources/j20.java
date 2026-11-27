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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class j20 extends nx0 implements fn7, jq3 {
    public static j20 S2;
    public static final float[] T2 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public final lu5 A1;
    public int A2;
    public final z10 B1;
    public float B2;
    public final a20 C1;
    public int C2;
    public final n10 D1;
    public long D2;
    public final o10 E1;
    public long E2;
    public final a20 F1;
    public boolean F2;
    public final s7 G1;
    public float G2;
    public final eh2 H1;
    public final p1 H2;
    public b8 I1;
    public u10 I2;
    public final p10 J1;
    public long J2;
    public final boolean K1;
    public float K2;
    public final n46 L1;
    public final w10 L2;
    public final b20 M1;
    public ValueAnimator M2;
    public final ema N1;
    public int N2;
    public final s7 O1;
    public boolean O2;
    public final zoa P1;
    public int P2;
    public final w7 Q1;
    public int Q2;
    public boolean R1;
    public int R2;
    public final b8[] S1;
    public final TextView T1;
    public final s7 U1;
    public final b8 V1;
    public final b8 W1;
    public final b8 X1;
    public final b8 Y1;
    public final ImageView Z1;
    public final mf8 a2;
    public final l10 b2;
    public final de0 c2;
    public final s7 d2;
    public final s7 e2;
    public boolean f2;
    public final View[] g2;
    public final vpa h2;
    public long i2;
    public boolean j2;
    public boolean k2;
    public final View l1;
    public int l2;
    public final y10 m1;
    public int m2;
    public final View n1;
    public final boolean n2;
    public final View o1;
    public final boolean o2;
    public boolean p1;
    public pc7 p2;
    public boolean q1;
    public ArrayList q2;
    public final q10 r1;
    public r47 r2;
    public final x46 s1;
    public boolean s2;
    public final i20 t1;
    public int t2;
    public final LinearLayout u1;
    public String u2;
    public final TextView v1;
    public AnimatorSet v2;
    public final TextView w1;
    public int w2;
    public final l10 x1;
    public int x2;
    public final c51 y1;
    public final int y2;
    public final c51 z1;
    public final LaunchActivity z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j20(Activity activity, final vnb vnbVar) {
        super(1, vnbVar, (Context) activity, true);
        int i;
        s6 s6Var;
        TLRPC.User X1;
        byte b = 1;
        b8[] b8VarArr = new b8[6];
        this.S1 = b8VarArr;
        View[] viewArr = new View[5];
        this.g2 = viewArr;
        this.k2 = true;
        this.l2 = -1;
        this.t2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.B2 = -1.0f;
        this.G2 = -1.0f;
        this.H2 = new p1(this, (byte) 4);
        this.L2 = new w10(this);
        this.r = true;
        J();
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null) {
            i = r47Var.K1;
            this.a = i;
        } else {
            i = yac.t0;
            this.a = i;
        }
        this.z2 = (LaunchActivity) activity;
        this.y2 = lq3.q(i).k();
        jn7.f(this.a).b(this, jn7.f2);
        jn7.f(this.a).b(this, jn7.g2);
        jn7.f(this.a).b(this, jn7.h2);
        jn7.f(this.a).b(this, jn7.e2);
        jn7.f(this.a).b(this, jn7.Y1);
        jn7.f(this.a).b(this, jn7.X1);
        jn7.f(this.a).b(this, jn7.K0);
        jn7.f(this.a).b(this, jn7.L0);
        jn7.f(this.a).b(this, jn7.X3);
        jn7.e().b(this, jn7.M4);
        x10 x10Var = new x10(this, activity);
        this.b = x10Var;
        final byte b2 = 0;
        x10Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, 0, i2, 0);
        y10 y10Var = new y10(this, activity, vnbVar, b2);
        this.m1 = y10Var;
        y10Var.setBackgroundColor(0);
        y10Var.setBackButtonImage(R.drawable.ic_ab_back);
        int i3 = aob.Fj;
        yob.l(y10Var, 1, i3, vnbVar);
        yob.l(y10Var, 3, aob.Ej, vnbVar);
        yob.l(y10Var, 5, i3, vnbVar);
        yob.l(y10Var, 6, aob.Gj, vnbVar);
        y10Var.setOccupyStatusBar(true);
        s6 u = y10Var.u();
        u.setLayoutParams(tre.e(-1, -1, jn7.D1));
        View view = new View(activity);
        this.l1 = view;
        yob.h(aob.h5, vnbVar, view);
        y10Var.addView(view, 0, tre.e(-1, -1, jn7.D1));
        view.setAlpha(0.0f);
        y10Var.setAlpha(0.0f);
        y10Var.setActionBarMenuOnItemClick(new s8(this, (byte) 3));
        View view2 = new View(activity);
        this.n1 = view2;
        view2.setAlpha(0.0f);
        view2.setBackgroundResource(R.drawable.header_shadow);
        View view3 = new View(activity);
        this.o1 = view3;
        yob.h(aob.V5, vnbVar, view3);
        l10 l10Var = new l10(this, activity, (byte) 2);
        this.x1 = l10Var;
        z10 z10Var = new z10(this, activity);
        this.B1 = z10Var;
        l10Var.addView(z10Var, tre.d(44, 44.0f, 53, 0.0f, 20.0f, 20.0f, 0.0f));
        a20 a20Var = new a20(this, activity, activity, b2);
        this.C1 = a20Var;
        l10Var.addView(a20Var, tre.d(-1, -2.0f, 51, 20.0f, 20.0f, 20.0f, 0.0f));
        a20 a20Var2 = new a20(this, activity, activity, b);
        this.F1 = a20Var2;
        l10Var.addView(a20Var2, tre.d(-1, -2.0f, 51, 14.0f, 47.0f, 20.0f, 0.0f));
        b20 b20Var = new b20(this, activity, vnbVar);
        this.M1 = b20Var;
        b20Var.setLineWidth(4);
        b20Var.setDelegate(new zm9((Object) this, (byte) 7));
        b20Var.setReportChanges(true);
        l10Var.addView(b20Var, tre.d(-1, 44.0f, 51, 5.0f, 67.0f, 5.0f, 0.0f));
        vpa vpaVar = new vpa(new xk4(0.0f));
        wpa wpaVar = new wpa();
        wpaVar.b(750.0f);
        wpaVar.a(1.0f);
        vpaVar.m = wpaVar;
        vpaVar.b(new i10(this, b2));
        this.h2 = vpaVar;
        n46 n46Var = new n46(activity);
        this.L1 = n46Var;
        n46Var.setVisibility(4);
        yob.h(aob.Kj, vnbVar, n46Var);
        n46Var.setProgressColor(aob.v0(aob.Mj, this.J0));
        l10Var.addView(n46Var, tre.d(-1, 2.0f, 51, 21.0f, 90.0f, 21.0f, 0.0f));
        ema emaVar = new ema(activity);
        this.N1 = emaVar;
        emaVar.setTextSize(12);
        emaVar.l("0:00", false);
        int i4 = aob.Jj;
        yob.W(emaVar, i4, vnbVar);
        emaVar.setImportantForAccessibility(2);
        l10Var.addView(emaVar, tre.d(100, -2.0f, 51, 20.0f, 98.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.T1 = textView;
        textView.setTextSize(1, 12.0f);
        yob.X(textView, i4, vnbVar);
        textView.setGravity(17);
        textView.setImportantForAccessibility(2);
        l10Var.addView(textView, tre.d(-2, -2.0f, 53, 0.0f, 96.0f, 20.0f, 0.0f));
        s7 s7Var = new s7(activity, null, 0, aob.v0(i4, this.J0), false, vnbVar);
        this.O1 = s7Var;
        s7Var.setLongClickEnabled(false);
        s7Var.setShowSubmenuByMove(false);
        s7Var.setAdditionalYOffset(-hl.L(224.0f));
        s7Var.setContentDescription(ob6.M0(2131754800, null));
        s7Var.setDelegate(new v00(this, b2));
        zoa zoaVar = new zoa();
        this.P1 = zoaVar;
        s7Var.setIcon(zoaVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        w7 w7Var = new w7(getContext(), vnbVar);
        this.Q1 = w7Var;
        w7Var.setRoundRadiusDp(6.0f);
        w7Var.setDrawShadow(true);
        w7Var.setOnValueChange(new w00(this, b2));
        b8VarArr[0] = s7Var.e(0, R.drawable.msg_speed_slow, ob6.M0(2131744923, null));
        b8VarArr[1] = s7Var.e(1, R.drawable.msg_speed_normal, ob6.M0(2131744924, null));
        b8VarArr[2] = s7Var.e(2, R.drawable.msg_speed_medium, ob6.M0(2131744925, null));
        b8VarArr[3] = s7Var.e(3, R.drawable.msg_speed_fast, ob6.M0(2131744927, null));
        b8VarArr[4] = s7Var.e(4, R.drawable.msg_speed_veryfast, ob6.M0(2131744921, null));
        b8VarArr[5] = s7Var.e(5, R.drawable.msg_speed_superfast, ob6.M0(2131744922, null));
        if (hl.p >= 3.0f) {
            s7Var.setPadding(0, 1, 0, 0);
        }
        s7Var.setAdditionalXOffset(hl.L(8.0f));
        s7Var.setAdditionalYOffset(-hl.L(400.0f));
        s7Var.setShowedFromBottom(true);
        l10Var.addView(s7Var, tre.d(36, 36.0f, 53, 0.0f, 86.0f, 20.0f, 0.0f));
        s7Var.setOnClickListener(new t(this, fArr, (byte) 19));
        s7Var.setOnLongClickListener(new v0(this, vnbVar, b));
        W0(false);
        l10 l10Var2 = new l10(this, activity, b2);
        l10Var.addView(l10Var2, tre.d(-1, 66.0f, 51, 0.0f, 111.0f, 0.0f, 0.0f));
        s7 s7Var2 = new s7(activity, null, 0, 0, false, vnbVar);
        this.U1 = s7Var2;
        viewArr[0] = s7Var2;
        s7Var2.setLongClickEnabled(false);
        s7Var2.setShowSubmenuByMove(false);
        s7Var2.setAdditionalYOffset(-hl.L(166.0f));
        int i5 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i5, this.J0), 1, hl.L(18.0f));
        uob M = yob.M(i5);
        s7Var2.setBackground(f0);
        yob.j(s7Var2, f0, null, M, vnbVar);
        l10Var2.addView(s7Var2, tre.e(48, 48, 51));
        s7Var2.setOnClickListener(new View.OnClickListener(this) { // from class: x00
            public final /* synthetic */ j20 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                byte b3 = b2;
                j20 j20Var = this.b;
                switch (b3) {
                    case 0:
                        j20Var.Z0();
                        j20Var.U1.U(null, null);
                        break;
                    default:
                        p10 p10Var = j20Var.J1;
                        r47 r47Var2 = MediaController.z().v0;
                        if (r47Var2 != null) {
                            char c = 1;
                            fu5 H = fu5.H(j20Var.c, j20Var.J0, view4, true);
                            fu5 E0 = j20Var.E0(H, r47Var2);
                            byte b4 = 0;
                            if (!j20Var.J0()) {
                                H.k(R.drawable.msg_stories_save, ob6.M0(2131753909, null), new c10(H, E0, b4), !j20Var.s2);
                                if (!j20Var.s2 && H.z() != null) {
                                    H.z().setRightIcon(R.drawable.msg_arrowright);
                                }
                                H.j();
                            }
                            H.k(R.drawable.msg_forward, ob6.M0(2131750547, null), new d10(j20Var, H, b4), !j20Var.s2);
                            H.k(R.drawable.msg_shareout, ob6.M0(2131745187, null), new d10(j20Var, H, c == true ? 1 : 0), !j20Var.s2);
                            H.k(R.drawable.msg_message, ob6.M0(2131745070, null), new d10(j20Var, H, (byte) 2), r47Var2.e1() > 0);
                            if (j20Var.K1) {
                                b8 b8Var = new b8(0, H.d, H.e, false, false);
                                H.c(b8Var);
                                j20Var.I1 = b8Var;
                                b8Var.j(ob6.M0(2131743244, null), R.drawable.menu_video_chromecast, null);
                                j20Var.I1.setOnClickListener(new t(j20Var, H, (byte) 20));
                                hl.B2(p10Var);
                                j20Var.I1.addView(p10Var, 0, tre.c(-1.0f, -1));
                                j20Var.updateColors();
                            }
                            H.l(R.drawable.msg_delete, new d10(j20Var, H, (byte) 3), ob6.M0(2131746372, null), j20Var.J0(), true);
                            H.Y(hl.L(64.0f));
                            H.a0();
                            break;
                        }
                        break;
                }
            }
        });
        this.V1 = s7Var2.e(3, R.drawable.player_new_repeatone, ob6.M0(2131746000, null));
        this.W1 = s7Var2.e(4, R.drawable.player_new_repeatall, ob6.M0(2131746003, null));
        s7Var2.a(-1).getLayoutParams().height = hl.L(4.0f);
        this.X1 = s7Var2.e(2, R.drawable.player_new_shuffle, ob6.M0(2131745050, null));
        s7Var2.a(-1).getLayoutParams().height = hl.L(4.0f);
        this.Y1 = s7Var2.e(1, R.drawable.player_new_order, ob6.M0(2131745754, null));
        s7Var2.setShowedFromBottom(true);
        s7Var2.setDelegate(new v00(this, b));
        int i6 = aob.Nj;
        int v0 = aob.v0(i6, this.J0);
        float scaledTouchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        n10 n10Var = new n10(this, activity, scaledTouchSlop);
        this.D1 = n10Var;
        viewArr[1] = n10Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        n10Var.setScaleType(scaleType);
        n10Var.f(R.raw.player_prev, 20, 20, null);
        n10Var.h(v0, "Triangle 3");
        n10Var.h(v0, "Triangle 4");
        n10Var.h(v0, "Rectangle 4");
        hf0 f02 = aob.f0(aob.v0(i5, this.J0), 1, hl.L(22.0f));
        uob M2 = yob.M(i5);
        n10Var.setBackground(f02);
        yob.j(n10Var, f02, null, M2, vnbVar);
        l10Var2.addView(n10Var, tre.e(48, 48, 51));
        n10Var.setContentDescription(ob6.M0(2131754795, null));
        ImageView imageView = new ImageView(activity);
        this.Z1 = imageView;
        viewArr[2] = imageView;
        imageView.setScaleType(scaleType);
        mf8 mf8Var = new mf8(28);
        this.a2 = mf8Var;
        imageView.setImageDrawable(mf8Var);
        mf8Var.a(!MediaController.z().G(), false);
        yob.s(imageView, i6, vnbVar, PorterDuff.Mode.MULTIPLY);
        hf0 f03 = aob.f0(aob.v0(i5, this.J0), 1, hl.L(24.0f));
        uob M3 = yob.M(i5);
        imageView.setBackground(f03);
        yob.j(imageView, f03, null, M3, vnbVar);
        l10Var2.addView(imageView, tre.e(48, 48, 51));
        imageView.setOnClickListener(new y00((byte) 0));
        o10 o10Var = new o10(this, activity, scaledTouchSlop);
        this.E1 = o10Var;
        viewArr[3] = o10Var;
        o10Var.setScaleType(scaleType);
        o10Var.f(R.raw.player_prev, 20, 20, null);
        o10Var.h(v0, "Triangle 3");
        o10Var.h(v0, "Triangle 4");
        o10Var.h(v0, "Rectangle 4");
        o10Var.setRotation(180.0f);
        hf0 f04 = aob.f0(aob.v0(i5, this.J0), 1, hl.L(22.0f));
        uob M4 = yob.M(i5);
        o10Var.setBackground(f04);
        yob.j(o10Var, f04, null, M4, vnbVar);
        l10Var2.addView(o10Var, tre.e(48, 48, 51));
        o10Var.setContentDescription(ob6.M0(2131747981, null));
        s7 s7Var3 = new s7(activity, null, 0, v0, false, vnbVar);
        this.G1 = s7Var3;
        viewArr[4] = s7Var3;
        eh2 eh2Var = new eh2(activity, R.drawable.ic_ab_other, vnbVar);
        this.H1 = eh2Var;
        s7Var3.setIcon(eh2Var);
        s7Var3.setLongClickEnabled(false);
        s7Var3.setAdditionalYOffset(-hl.L(197.0f));
        final byte b3 = 1;
        hf0 f05 = aob.f0(aob.v0(i5, this.J0), 1, hl.L(18.0f));
        uob M5 = yob.M(i5);
        s7Var3.setBackground(f05);
        yob.j(s7Var3, f05, null, M5, vnbVar);
        s7Var3.setOnClickListener(new View.OnClickListener(this) { // from class: x00
            public final /* synthetic */ j20 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                byte b32 = b3;
                j20 j20Var = this.b;
                switch (b32) {
                    case 0:
                        j20Var.Z0();
                        j20Var.U1.U(null, null);
                        break;
                    default:
                        p10 p10Var = j20Var.J1;
                        r47 r47Var2 = MediaController.z().v0;
                        if (r47Var2 != null) {
                            char c = 1;
                            fu5 H = fu5.H(j20Var.c, j20Var.J0, view4, true);
                            fu5 E0 = j20Var.E0(H, r47Var2);
                            byte b4 = 0;
                            if (!j20Var.J0()) {
                                H.k(R.drawable.msg_stories_save, ob6.M0(2131753909, null), new c10(H, E0, b4), !j20Var.s2);
                                if (!j20Var.s2 && H.z() != null) {
                                    H.z().setRightIcon(R.drawable.msg_arrowright);
                                }
                                H.j();
                            }
                            H.k(R.drawable.msg_forward, ob6.M0(2131750547, null), new d10(j20Var, H, b4), !j20Var.s2);
                            H.k(R.drawable.msg_shareout, ob6.M0(2131745187, null), new d10(j20Var, H, c == true ? 1 : 0), !j20Var.s2);
                            H.k(R.drawable.msg_message, ob6.M0(2131745070, null), new d10(j20Var, H, (byte) 2), r47Var2.e1() > 0);
                            if (j20Var.K1) {
                                b8 b8Var = new b8(0, H.d, H.e, false, false);
                                H.c(b8Var);
                                j20Var.I1 = b8Var;
                                b8Var.j(ob6.M0(2131743244, null), R.drawable.menu_video_chromecast, null);
                                j20Var.I1.setOnClickListener(new t(j20Var, H, (byte) 20));
                                hl.B2(p10Var);
                                j20Var.I1.addView(p10Var, 0, tre.c(-1.0f, -1));
                                j20Var.updateColors();
                            }
                            H.l(R.drawable.msg_delete, new d10(j20Var, H, (byte) 3), ob6.M0(2131746372, null), j20Var.J0(), true);
                            H.Y(hl.L(64.0f));
                            H.a0();
                            break;
                        }
                        break;
                }
            }
        });
        l10Var2.addView(s7Var3, tre.e(48, 48, 51));
        p10 p10Var = new p10(this, activity, (byte) 0);
        this.J1 = p10Var;
        this.K1 = true;
        try {
            p10Var.setRouteSelector(id1.c(activity).a());
        } catch (Exception e) {
            cc4.g(e, true);
            this.K1 = false;
        }
        this.J1.setVisibility(4);
        eh2 eh2Var2 = this.H1;
        if (eh2Var2 != null) {
            eh2Var2.a(go.w());
        }
        this.G1.setShowedFromBottom(true);
        this.G1.setDelegate(new v00(this, (byte) 2));
        this.G1.setContentDescription(ob6.M0(2131754834, null));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.u1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int i7 = 8;
        linearLayout.setVisibility(8);
        this.b.addView(linearLayout, tre.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new q8((byte) 15));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.music_empty);
        yob.s(imageView2, aob.W5, vnbVar, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, tre.o(-2, -2));
        TextView textView2 = new TextView(activity);
        this.v1 = textView2;
        int i8 = aob.X5;
        yob.X(textView2, i8, vnbVar);
        textView2.setGravity(17);
        textView2.setText(ob6.M0(2131747974, null));
        textView2.setTypeface(hl.o());
        textView2.setTextSize(1, 17.0f);
        textView2.setPadding(hl.L(40.0f), 0, hl.L(40.0f), 0);
        linearLayout.addView(textView2, tre.t(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(activity);
        this.w1 = textView3;
        yob.X(textView3, i8, vnbVar);
        textView3.setGravity(17);
        textView3.setTextSize(1, 15.0f);
        textView3.setPadding(hl.L(40.0f), 0, hl.L(40.0f), 0);
        linearLayout.addView(textView3, tre.t(-2, -2, 17, 0, 6, 0, 0));
        q10 q10Var = new q10(this, activity);
        this.r1 = q10Var;
        q10Var.setClipToPadding(false);
        getContext();
        x46 x46Var = new x46(1, false);
        this.s1 = x46Var;
        q10Var.setLayoutManager(x46Var);
        q10Var.setHorizontalScrollBarEnabled(false);
        q10Var.setVerticalScrollBarEnabled(false);
        this.b.addView(q10Var, tre.e(-1, -1, 51));
        i20 i20Var = new i20(this, activity);
        this.t1 = i20Var;
        q10Var.setAdapter(i20Var);
        yob.l(q10Var, 21, aob.A5, vnbVar);
        q10Var.setOnItemClickListener(new m5((byte) 1));
        q10Var.setOnItemLongClickListener(new v00(this, (byte) 3));
        q10Var.setOnScrollListener(new y(this, (byte) 5));
        c51 c51Var = new c51(vnbVar, activity, true);
        c51Var.setRoundRadius(24);
        this.y1 = c51Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "+ ");
        final byte b4 = 0;
        spannableStringBuilder.setSpan(new wm2(R.drawable.filled_track_add, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) ob6.M0(2131753918, null));
        c51Var.setText(spannableStringBuilder);
        c51Var.setOnClickListener(new View.OnClickListener(this) { // from class: k10
            public final /* synthetic */ j20 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                byte b5 = b4;
                vnb vnbVar2 = vnbVar;
                j20 j20Var = this.b;
                switch (b5) {
                    case 0:
                        r47 r47Var2 = MediaController.z().v0;
                        if (r47Var2 != null && j20Var.z2 != null) {
                            j20Var.M0(r47Var2, true, new kc((byte) 10), false);
                            j20Var.P0(true);
                            bs2.v(null, 2131753905, new d31((FrameLayout) j20Var.b, vnbVar2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        r47 r47Var3 = MediaController.z().v0;
                        if (r47Var3 != null && j20Var.z2 != null) {
                            j20Var.M0(r47Var3, false, new kc((byte) 10), false);
                            j20Var.P0(false);
                            bs2.v(null, 2131753904, new d31((FrameLayout) j20Var.b, vnbVar2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.x1.addView(c51Var, tre.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        final byte b5 = 1;
        c51 c51Var2 = new c51(vnbVar, activity, true);
        c51Var2.setRoundRadius(24);
        c51Var2.e();
        this.z1 = c51Var2;
        c51Var2.setText(ob6.M0(2131753910, null));
        c51Var2.setOnClickListener(new View.OnClickListener(this) { // from class: k10
            public final /* synthetic */ j20 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                byte b52 = b5;
                vnb vnbVar2 = vnbVar;
                j20 j20Var = this.b;
                switch (b52) {
                    case 0:
                        r47 r47Var2 = MediaController.z().v0;
                        if (r47Var2 != null && j20Var.z2 != null) {
                            j20Var.M0(r47Var2, true, new kc((byte) 10), false);
                            j20Var.P0(true);
                            bs2.v(null, 2131753905, new d31((FrameLayout) j20Var.b, vnbVar2), R.raw.saved_messages, 36);
                            break;
                        }
                        break;
                    default:
                        r47 r47Var3 = MediaController.z().v0;
                        if (r47Var3 != null && j20Var.z2 != null) {
                            j20Var.M0(r47Var3, false, new kc((byte) 10), false);
                            j20Var.P0(false);
                            bs2.v(null, 2131753904, new d31((FrameLayout) j20Var.b, vnbVar2), R.raw.ic_delete, 36);
                            break;
                        }
                        break;
                }
            }
        });
        this.x1.addView(c51Var2, tre.d(-1, 42.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        pc7 pc7Var = MediaController.z().R0;
        this.p2 = pc7Var;
        boolean z = pc7Var != null;
        this.n2 = z;
        this.m1.n0 = z;
        this.o2 = J0();
        this.q2 = MediaController.z().S0;
        if (J0()) {
            s6Var = u;
            this.d2 = s6Var.a(8, R.drawable.msg_add);
        } else {
            s6Var = u;
        }
        s7 a = s6Var.a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new r10(this, (byte) 0);
        this.e2 = a;
        a.setContentDescription(ob6.M0(2131745564, null));
        EditTextBoldCursor searchField = a.getSearchField();
        searchField.setHint(ob6.M0(2131745564, null));
        int i9 = aob.Fj;
        yob.X(searchField, i9, vnbVar);
        yob.D(searchField, aob.Jj, vnbVar);
        yob.l(searchField, 30, i9, vnbVar);
        if (z) {
            q10Var.s1();
            s0(aob.v0(aob.a7, vnbVar));
            this.m1.setAlpha(1.0f);
            this.l1.setAlpha(0.0f);
            w10 w10Var = this.L2;
            y10 y10Var2 = this.m1;
            Float valueOf = Float.valueOf(0.0f);
            w10Var.getClass();
            w10Var.a(y10Var2, valueOf);
        }
        boolean z2 = this.q2.size() > 1;
        i20Var.h = z2;
        if (z2) {
            q10Var.setVisibility(0);
            q10Var.setTranslationY(0.0f);
        } else {
            q10Var.setVisibility(8);
            q10Var.setTranslationY(hl.q.y);
        }
        i20Var.f();
        this.m1.setTitle(ob6.M0(2131753945, null));
        pc7 pc7Var2 = this.p2;
        if (pc7Var2 != null) {
            long j = pc7Var2.b;
            long e2 = yac.h(this.a).e();
            y10 y10Var3 = this.m1;
            if (j == e2) {
                y10Var3.setTitle(ob6.M0(2131746370, null));
            } else {
                y10Var3.setTitle(ob6.a0(null, null, 2131746371, wf3.s(this.p2.b)));
            }
        } else if (r47Var != null && MediaController.z().D0 == null) {
            long B0 = r47.B0(r47Var.k);
            boolean B = wf3.B(B0);
            int i10 = this.a;
            if (B) {
                TLRPC.EncryptedChat a1 = uc7.s1(i10).a1(Integer.valueOf((int) (B0 & 4294967295L)));
                if (a1 != null && (X1 = uc7.s1(this.a).X1(Long.valueOf(a1.user_id))) != null) {
                    this.m1.setTitle(lv2.m(0, X1.first_name, X1.last_name));
                }
            } else if (B0 == yac.h(i10).e()) {
                long P1 = r47Var.P1();
                y10 y10Var4 = this.m1;
                if (P1 == 2666000) {
                    y10Var4.setTitle(ob6.M0(2131754245, null));
                } else {
                    y10Var4.setTitle(ob6.M0(2131745629, null));
                }
            } else {
                boolean D = wf3.D(B0);
                int i11 = this.a;
                if (D) {
                    TLRPC.User X12 = uc7.s1(i11).X1(Long.valueOf(B0));
                    if (X12 != null) {
                        this.m1.setTitle(lv2.m(0, X12.first_name, X12.last_name));
                    }
                } else {
                    TLRPC.Chat M0 = uc7.s1(i11).M0(Long.valueOf(-B0));
                    if (M0 != null) {
                        this.m1.setTitle(M0.title);
                    }
                }
            }
        }
        if (J0()) {
            c51Var.setVisibility(8);
            c51Var2.setVisibility(8);
            lu5 lu5Var = new lu5(new s10(this, (byte) 0));
            this.A1 = lu5Var;
            lu5Var.h(q10Var);
        }
        this.b.addView(this.x1, tre.e(-1, ((J0() || this.s2) ? 0 : 52) + jn7.I2, 83));
        this.b.addView(this.o1, new FrameLayout.LayoutParams(-1, hl.e1(), 83));
        ((FrameLayout.LayoutParams) this.x1.getLayoutParams()).height = hl.L(((J0() || this.s2) ? 0 : 52) + jn7.I2);
        ((FrameLayout.LayoutParams) this.o1.getLayoutParams()).bottomMargin = hl.L(jn7.I2 + ((J0() || this.s2) ? 0 : 52));
        this.b.addView(this.n1, tre.c(3.0f, -1));
        this.b.addView(this.m1);
        l10 l10Var3 = new l10(this, activity, (byte) 1);
        this.b2 = l10Var3;
        l10Var3.setAlpha(0.0f);
        l10Var3.setVisibility(4);
        this.c.addView(l10Var3);
        de0 de0Var = new de0(activity);
        this.c2 = de0Var;
        de0Var.setAspectFit(true);
        de0Var.setRoundRadius(hl.L(8.0f));
        de0Var.setScaleX(0.9f);
        de0Var.setScaleY(0.9f);
        l10Var3.addView(de0Var, tre.d(-1, -1.0f, 51, 30.0f, 30.0f, 30.0f, 30.0f));
        b1(false);
        Y0();
        if (this.q1 && i20Var.b() == 0) {
            i7 = 0;
        }
        linearLayout.setVisibility(i7);
        U0();
    }

    public static boolean G0(float f, float f2) {
        return Math.abs(f - f2) < 0.05f;
    }

    public static jn5 I0(r47 r47Var) {
        TLRPC.Document F0 = r47Var.F0();
        TLRPC.PhotoSize w = F0 != null ? xb4.w(F0.thumbs, 360, false, null, false) : null;
        if (!(w instanceof TLRPC.TL_photoSize) && !(w instanceof TLRPC.TL_photoSizeProgressive)) {
            w = null;
        }
        if (w != null) {
            return jn5.c(w, F0);
        }
        String u0 = r47Var.u0(true);
        if (u0 != null) {
            return jn5.g(u0);
        }
        return null;
    }

    @Override // nx0
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.Ij));
        hashSet.add(Integer.valueOf(aob.Mj));
        hashSet.add(Integer.valueOf(aob.Lj));
        hashSet.add(Integer.valueOf(aob.Zd));
        hashSet.add(Integer.valueOf(aob.ae));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.md));
        hashSet.add(Integer.valueOf(aob.ld));
        hashSet.add(Integer.valueOf(aob.af));
        hashSet.add(Integer.valueOf(aob.Ec));
        hashSet.add(Integer.valueOf(aob.Ze));
    }

    @Override // nx0
    public final boolean D() {
        return false;
    }

    public final fu5 E0(fu5 fu5Var, r47 r47Var) {
        oc7 G1 = uc7.s1(this.a).G1();
        TLRPC.Document F0 = r47Var.F0();
        long j = F0 != null ? F0.id : 0L;
        fu5 K = fu5Var.K();
        byte b = 0;
        K.b(R.drawable.ic_ab_back, ob6.M0(2131753749, null), new vn1(fu5Var, b), false);
        K.j();
        K.k(R.drawable.left_status_profile, ob6.M0(2131753906, null), new e10(this, r47Var, fu5Var, b), !G1.b.contains(Long.valueOf(j)));
        K.b(R.drawable.msg_saved, ob6.M0(2131753903, null), new e10(this, r47Var, fu5Var, (byte) 1), false);
        K.b(R.drawable.menu_download_round, ob6.M0(2131753907, null), new e10(this, r47Var, fu5Var, (byte) 2), false);
        K.j();
        K.o(12, hl.L(200.0f), ob6.M0(2131753908, null));
        return K;
    }

    public final void F0() {
        s7 s7Var = this.U1;
        int v0 = aob.v0(((Integer) s7Var.getTag()).intValue(), this.J0);
        int v02 = aob.v0(aob.Nj, this.J0);
        int v03 = aob.v0(aob.i6, this.J0);
        if (!this.O2 || v0 != this.P2) {
            this.P2 = v0;
            s7Var.setIconColor(v0);
        }
        boolean z = this.O2;
        s7 s7Var2 = this.G1;
        if (!z || v02 != this.Q2) {
            this.Q2 = v02;
            s7Var2.setIconColor(v02);
        }
        if (!this.O2 || v03 != this.R2) {
            this.R2 = v03;
            aob.F1(s7Var.getBackground(), v03, true);
            aob.F1(s7Var2.getBackground(), v03, true);
        }
        this.O2 = true;
        this.L1.setProgressColor(aob.v0(aob.Mj, this.J0));
        Z0();
        int i = aob.G8;
        s7Var.I(aob.v0(i, this.J0));
        int i2 = aob.E8;
        s7Var2.O(aob.v0(i2, this.J0), false);
        s7Var2.O(aob.v0(i2, this.J0), true);
        s7Var2.I(aob.v0(i, this.J0));
    }

    public final void H0(r47 r47Var) {
        ArrayList t;
        TLRPC.TL_document tL_document;
        int i = yac.t0;
        int i2 = this.a;
        LaunchActivity launchActivity = this.z2;
        if (i != i2) {
            launchActivity.N0(i2);
        }
        Bundle j = qd4.j(3, "onlySelect", "dialogsType", true);
        j.putBoolean("canSelectTopics", true);
        uj3 uj3Var = new uj3(j);
        if (r47Var.e1() >= 0) {
            t = qd4.t(r47Var);
            tL_document = null;
        } else {
            if (!(r47Var.F0() instanceof TLRPC.TL_document)) {
                return;
            }
            tL_document = (TLRPC.TL_document) r47Var.F0();
            t = null;
        }
        uj3Var.E2 = new pt((Object) this, (Object) t, (Object) tL_document, (Object) r47Var, (byte) 1);
        launchActivity.t0(uj3Var);
        dismiss();
    }

    public final boolean J0() {
        pc7 pc7Var = this.p2;
        return pc7Var != null && pc7Var.b == yac.h(this.a).e();
    }

    public final void K0(int i) {
        LaunchActivity launchActivity;
        r47 r47Var = MediaController.z().v0;
        if (r47Var == null || (launchActivity = this.z2) == null) {
            return;
        }
        if (i == 1) {
            H0(r47Var);
            return;
        }
        if (i == 2) {
            Q0(r47Var);
            return;
        }
        byte b = 0;
        if (i != 4) {
            if (i == 5) {
                L0(r47Var);
                return;
            }
            if (i == 6) {
                lh2.t().T(MediaController.z().x());
                this.J1.performClick();
                return;
            } else {
                if (i == 7) {
                    M0(r47Var, false, new z00(this, r47Var, b), false);
                    return;
                }
                if (i == 8) {
                    r1a r1aVar = new r1a(getContext(), true, null, new b10(this, b), null);
                    r1aVar.c2 = true;
                    r1aVar.U1 = false;
                    r1aVar.j2.O(true);
                    r1aVar.show();
                    return;
                }
                return;
            }
        }
        int i2 = yac.t0;
        int i3 = this.a;
        if (i2 != i3) {
            launchActivity.N0(i3);
        }
        Bundle bundle = new Bundle();
        long B0 = r47.B0(r47Var.k);
        if (wf3.B(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (wf3.D(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", r47Var.e1());
        jn7.f(this.a).k(jn7.s, new Object[0]);
        launchActivity.u0(new zu1(bundle), false, false);
        dismiss();
    }

    public final void L0(r47 r47Var) {
        if (Build.VERSION.SDK_INT <= 28 || f11.b) {
            LaunchActivity launchActivity = this.z2;
            if (launchActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                launchActivity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        String B = xb4.B(r47Var.F0());
        if (TextUtils.isEmpty(B)) {
            B = r47Var.S0();
        }
        String str = B;
        String str2 = r47Var.k.attachPath;
        if (str2 != null && str2.length() > 0 && !bp1.t(str2)) {
            str2 = null;
        }
        byte b = 1;
        if (str2 == null || str2.length() == 0) {
            xb4.G(this.a);
            str2 = xb4.M(r47Var.k, false, true).toString();
        }
        String str3 = r47Var.F0() != null ? r47Var.F0().mime_type : "";
        MediaController.g0(str2, this.z2, 3, str, str3, new b10(this, b));
    }

    public final void M0(r47 r47Var, boolean z, Runnable runnable, boolean z2) {
        TLRPC.Document F0 = r47Var.F0();
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_account_saveMusic, new f10(this, z2, r47Var, z, runnable, j, F0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r4.getBottom() <= r7.getMeasuredHeight()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean N0(boolean z) {
        r47 r47Var = MediaController.z().v0;
        boolean z2 = false;
        if (r47Var != null) {
            if (z) {
                q10 q10Var = this.r1;
                int childCount = q10Var.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = q10Var.getChildAt(i);
                    if (!(childAt instanceof k20) || ((k20) childAt).getMessageObject() != r47Var) {
                        i++;
                    }
                }
            }
            int indexOf = this.q2.indexOf(r47Var);
            if (this.o2) {
                indexOf++;
            }
            if (indexOf >= 0) {
                boolean z3 = xea.K0;
                z2 = true;
                x46 x46Var = this.s1;
                if (z3) {
                    x46Var.m0(indexOf);
                    return true;
                }
                x46Var.m0(this.q2.size() - indexOf);
            }
        }
        return z2;
    }

    public final void O0(b8 b8Var, boolean z) {
        if (z) {
            int i = aob.Oj;
            b8Var.setTextColor(aob.v0(i, this.J0));
            b8Var.setIconColor(aob.v0(i, this.J0));
        } else {
            int i2 = aob.E8;
            b8Var.setTextColor(aob.v0(i2, this.J0));
            b8Var.setIconColor(aob.v0(i2, this.J0));
        }
    }

    @Override // nx0
    public final int P() {
        l10 l10Var = this.x1;
        if (l10Var == null) {
            return 0;
        }
        if (this.q2.size() <= 1) {
            return l10Var.getMeasuredHeight() + this.t0;
        }
        int L = hl.L(13.0f);
        int translationY = (int) (this.r1.getTranslationY() + ((this.t2 - this.t0) - L));
        if (this.t0 + translationY < a.getCurrentActionBarHeight()) {
            float L2 = hl.L(4.0f) + L;
            translationY -= (int) ((a.getCurrentActionBarHeight() - L2) * Math.min(1.0f, ((a.getCurrentActionBarHeight() - translationY) - this.t0) / L2));
        }
        return this.c.getMeasuredHeight() - (translationY + hl.m);
    }

    public final void P0(final boolean z) {
        boolean J0 = J0();
        c51 c51Var = this.z1;
        c51 c51Var2 = this.y1;
        if (J0 || this.s2) {
            c51Var2.setVisibility(8);
            c51Var.setVisibility(8);
            return;
        }
        final byte b = 0;
        c51Var2.setVisibility(0);
        c51Var.setVisibility(0);
        ViewPropertyAnimator duration = c51Var2.animate().alpha(z ? 0.0f : 1.0f).scaleX(z ? 0.8f : 1.0f).scaleY(z ? 0.8f : 1.0f).setDuration(420L);
        k43 k43Var = k43.h;
        duration.setInterpolator(k43Var).withEndAction(new Runnable(this) { // from class: a10
            public final /* synthetic */ j20 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                boolean z2 = z;
                j20 j20Var = this.b;
                switch (b2) {
                    case 0:
                        j20Var.y1.setVisibility(z2 ? 8 : 0);
                        break;
                    default:
                        j20Var.z1.setVisibility(z2 ? 0 : 8);
                        break;
                }
            }
        }).start();
        final byte b2 = 1;
        c51Var.animate().alpha(z ? 1.0f : 0.0f).scaleX(!z ? 0.8f : 1.0f).scaleY(z ? 1.0f : 0.8f).setDuration(420L).setInterpolator(k43Var).withEndAction(new Runnable(this) { // from class: a10
            public final /* synthetic */ j20 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                boolean z2 = z;
                j20 j20Var = this.b;
                switch (b22) {
                    case 0:
                        j20Var.y1.setVisibility(z2 ? 8 : 0);
                        break;
                    default:
                        j20Var.z1.setVisibility(z2 ? 0 : 8);
                        break;
                }
            }
        }).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r1.exists() == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(r47 r47Var) {
        File file;
        try {
            if (!TextUtils.isEmpty(r47Var.k.attachPath)) {
                file = new File(r47Var.k.attachPath);
            }
            file = null;
            if (file == null) {
                xb4.G(this.a);
                file = xb4.M(r47Var.k, false, true);
            }
            if (!file.exists()) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.z2);
                alertDialog$Builder.a.S = ob6.M0(R.string.AppName, null);
                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                alertDialog$Builder.a.U = ob6.M0(2131746945, null);
                alertDialog$Builder.o();
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(r47Var.t1());
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
            this.z2.startActivityForResult(Intent.createChooser(intent, ob6.M0(2131745187, null)), 500);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void R0(boolean z, boolean z2) {
        byte b = 1;
        de0 de0Var = this.c2;
        l10 l10Var = this.b2;
        if (z) {
            if (l10Var.getVisibility() == 0 || this.f2) {
                return;
            }
            l10Var.setTag(1);
            z10 z10Var = this.B1;
            de0Var.setImageBitmap(z10Var.a[z10Var.b ? 1 : 0].getImageReceiver().n());
            this.f2 = true;
            mu9.d(new w00(this, b));
            l10Var.setVisibility(0);
            l10Var.animate().alpha(1.0f).setDuration(180L).setListener(new v10(this, (byte) 0)).start();
            de0Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).start();
            return;
        }
        if (l10Var.getVisibility() != 0) {
            return;
        }
        l10Var.setTag(null);
        if (z2) {
            this.f2 = true;
            l10Var.animate().alpha(0.0f).setDuration(180L).setListener(new v10(this, b)).start();
            de0Var.animate().scaleX(0.9f).scaleY(0.9f).setDuration(180L).start();
        } else {
            l10Var.setAlpha(0.0f);
            l10Var.setVisibility(4);
            de0Var.setImageBitmap(null);
            de0Var.setScaleX(0.9f);
            de0Var.setScaleY(0.9f);
        }
    }

    @Override // nx0
    public final ArrayList S() {
        ArrayList arrayList = new ArrayList();
        u00 u00Var = new u00(this, (byte) 0);
        int i = aob.Fj;
        arrayList.add(new apb(this.m1, 1024, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        int i2 = aob.Jj;
        arrayList.add(new apb(this.m1, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.b, 0, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, (zob) null, aob.h5));
        arrayList.add(new apb(this.L1, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Mj));
        int i3 = aob.w7;
        s7 s7Var = this.O1;
        arrayList.add(new apb(s7Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i3));
        arrayList.add(new apb(s7Var, 262152, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.x7));
        int i4 = aob.Nj;
        s7 s7Var2 = this.U1;
        arrayList.add(new apb(s7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, i4));
        arrayList.add(new apb(s7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, aob.Oj));
        int i5 = aob.E8;
        arrayList.add(new apb(s7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, i5));
        int i6 = aob.G8;
        arrayList.add(new apb(s7Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, i6));
        s7 s7Var3 = this.G1;
        arrayList.add(new apb(s7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, i4));
        arrayList.add(new apb(s7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, i5));
        arrayList.add(new apb(s7Var3, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u00Var, i6));
        n10 n10Var = this.D1;
        arrayList.add(new apb(n10Var, new b29[]{n10Var.getAnimatedDrawable()}, "Triangle 3", i4));
        arrayList.add(new apb(n10Var, new b29[]{n10Var.getAnimatedDrawable()}, "Triangle 4", i4));
        arrayList.add(new apb(n10Var, new b29[]{n10Var.getAnimatedDrawable()}, "Rectangle 4", i4));
        int i7 = aob.i6;
        arrayList.add(new apb(this.D1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i7));
        arrayList.add(new apb(this.Z1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i7));
        o10 o10Var = this.E1;
        arrayList.add(new apb(o10Var, new b29[]{o10Var.getAnimatedDrawable()}, "Triangle 3", i4));
        arrayList.add(new apb(o10Var, new b29[]{o10Var.getAnimatedDrawable()}, "Triangle 4", i4));
        arrayList.add(new apb(o10Var, new b29[]{o10Var.getAnimatedDrawable()}, "Rectangle 4", i4));
        arrayList.add(new apb(this.E1, 131080, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i7));
        int i8 = aob.X5;
        arrayList.add(new apb(this.v1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i8));
        arrayList.add(new apb(this.w1, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i8));
        arrayList.add(new apb(this.L1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
        arrayList.add(new apb(this.L1, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
        a20 a20Var = this.C1;
        arrayList.add(new apb(a20Var.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(a20Var.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        a20 a20Var2 = this.F1;
        arrayList.add(new apb(a20Var2.getTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(a20Var2.getNextTextView(), 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.zj));
        return arrayList;
    }

    public final void S0(k20 k20Var, r47 r47Var) {
        byte b = 1;
        fu5 H = fu5.H(this.c, this.J0, k20Var, true);
        byte b2 = 3;
        if (J0()) {
            H.k(R.drawable.msg_forward, ob6.M0(2131750547, null), new e10(this, H, r47Var, b2), !this.s2);
            H.k(R.drawable.msg_shareout, ob6.M0(2131745187, null), new e10(this, H, r47Var, (byte) 4), !this.s2);
            H.b(R.drawable.msg_delete, ob6.M0(2131751563, null), new e10(this, r47Var, H, r1), true);
        } else {
            H.k(R.drawable.msg_stories_save, ob6.M0(2131753909, null), new c10(H, E0(H, r47Var), b), !this.s2);
            if (!this.s2 && H.z() != null) {
                H.z().setRightIcon(R.drawable.msg_arrowright);
            }
            H.j();
            H.k(R.drawable.msg_forward, ob6.M0(2131750547, null), new e10(this, H, r47Var, (byte) 6), !this.s2);
            H.k(R.drawable.msg_share, ob6.M0(2131745187, null), new e10(this, H, r47Var, (byte) 7), !this.s2);
            H.k(R.drawable.msg_view_file, ob6.M0(2131745070, null), new z00(this, r47Var, b), r47Var.e1() > 0);
        }
        H.W(ob6.a0 ? (byte) 3 : (byte) 5);
        H.a0();
    }

    public final void T0() {
        if (this.A2 == 1) {
            this.D2 = System.currentTimeMillis();
            this.B2 = MediaController.z().v0.b0;
            p1 p1Var = this.H2;
            hl.r(p1Var);
            hl.c3(p1Var);
        }
    }

    @Override // nx0
    public final boolean U(float f, float f2) {
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

    public final void U0() {
        LinearLayout linearLayout = this.u1;
        if (linearLayout.getVisibility() != 0) {
            return;
        }
        linearLayout.setTranslationY(((linearLayout.getMeasuredHeight() - this.b.getMeasuredHeight()) - (this.x1.getVisibility() == 0 ? hl.L(150.0f) : -hl.L(30.0f))) / 2);
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
    public final void V0() {
        Integer num;
        int A;
        float min;
        AnimatorSet animatorSet;
        boolean z;
        q10 q10Var = this.r1;
        if (q10Var.getChildCount() <= 0) {
            int paddingTop = q10Var.getPaddingTop();
            this.t2 = paddingTop;
            q10Var.setTopGlowOffset(paddingTop);
            this.b.invalidate();
            return;
        }
        boolean z2 = false;
        View childAt = q10Var.getChildAt(0);
        n69 n69Var = (n69) q10Var.H(childAt);
        int top = childAt instanceof k20 ? childAt.getTop() : childAt.getBottom();
        int L = hl.L(7.0f);
        if (top < hl.L(7.0f) || n69Var == null || n69Var.b() != 0) {
            top = L;
        }
        boolean z3 = top <= hl.L(12.0f);
        y10 y10Var = this.m1;
        Object tag = y10Var.getTag();
        if (z3) {
            if (tag == null) {
                num = 1;
                y10Var.setTag(num);
                animatorSet = this.v2;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.v2 = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.v2 = animatorSet2;
                z = this.n2;
                byte b = 2;
                View view = this.n1;
                if (z) {
                    Property property = View.ALPHA;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(y10Var, (Property<y10, Float>) property, z3 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z3 ? 1.0f : 0.0f));
                } else {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10Var, this.L2, z3 ? 1.0f : 0.0f);
                    Property property2 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(this.l1, (Property<View, Float>) property2, z3 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, z3 ? 1.0f : 0.0f));
                }
                this.v2.setDuration(320L);
                this.v2.setInterpolator(k43.h);
                this.v2.addListener(new v10(this, b));
                this.v2.start();
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q10Var.getLayoutParams();
            A = c00.A(11.0f, layoutParams.topMargin - hl.m, top);
            if (this.t2 != A) {
                this.t2 = A;
                q10Var.setTopGlowOffset((A - layoutParams.topMargin) - hl.m);
                this.b.invalidate();
            }
            int L2 = hl.L(13.0f);
            min = this.t0 + ((int) (q10Var.getTranslationY() + ((this.t2 - this.t0) - L2))) < a.getCurrentActionBarHeight() ? 1.0f - Math.min(1.0f, ((a.getCurrentActionBarHeight() - r0) - this.t0) / (hl.L(4.0f) + L2)) : 1.0f;
            this.G2 = min;
            if (min <= 0.5f && vm2.h(aob.v0(aob.h5, this.J0)) > 0.699999988079071d) {
                z2 = true;
            }
            if (z2 == this.F2) {
                this.F2 = z2;
                hl.l3(this, z2);
                return;
            }
            return;
        }
        if (tag != null) {
            num = null;
            y10Var.setTag(num);
            animatorSet = this.v2;
            if (animatorSet != null) {
            }
            AnimatorSet animatorSet22 = new AnimatorSet();
            this.v2 = animatorSet22;
            z = this.n2;
            byte b2 = 2;
            View view2 = this.n1;
            if (z) {
            }
            this.v2.setDuration(320L);
            this.v2.setInterpolator(k43.h);
            this.v2.addListener(new v10(this, b2));
            this.v2.start();
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) q10Var.getLayoutParams();
        A = c00.A(11.0f, layoutParams2.topMargin - hl.m, top);
        if (this.t2 != A) {
        }
        int L22 = hl.L(13.0f);
        if (this.t0 + ((int) (q10Var.getTranslationY() + ((this.t2 - this.t0) - L22))) < a.getCurrentActionBarHeight()) {
        }
        this.G2 = min;
        if (min <= 0.5f) {
            z2 = true;
        }
        if (z2 == this.F2) {
        }
    }

    public final void W0(boolean z) {
        if (this.O1 == null) {
            return;
        }
        float f = MediaController.z().r0;
        this.P1.b(z, f);
        this.Q1.e(z, f);
        updateColors();
        boolean z2 = this.R1;
        int i = 0;
        this.R1 = false;
        while (true) {
            b8[] b8VarArr = this.S1;
            if (i >= b8VarArr.length) {
                return;
            }
            if (z2 || !G0(f, T2[i])) {
                b8 b8Var = b8VarArr[i];
                int i2 = aob.E8;
                b8Var.d(aob.v0(i2, this.J0), aob.v0(i2, this.J0));
            } else {
                b8 b8Var2 = b8VarArr[i];
                int i3 = aob.Hi;
                b8Var2.d(aob.v0(i3, this.J0), aob.v0(i3, this.J0));
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (org.telegram.messenger.MediaController.z().G() == false) goto L14;
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
    public final void X0(r47 r47Var, boolean z) {
        boolean z2;
        float f;
        int i;
        b20 b20Var = this.M1;
        if (b20Var != null) {
            if (b20Var.x) {
                i = (int) (r47Var.L0() * b20Var.getProgress());
            } else {
                if (this.B2 >= 0.0f) {
                    int i2 = this.A2;
                    z2 = true;
                    if (i2 != -1) {
                        if (i2 == 1) {
                        }
                    }
                    if (z2) {
                        b20Var.e(z, r47Var.b0);
                    } else {
                        b20Var.e(z, this.B2);
                    }
                    f = 1.0f;
                    if (!this.j2) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(elapsedRealtime - this.i2) >= 500) {
                            if (MediaController.z().m0) {
                                f = xb4.G(this.a).t(this.u2, r47Var.b0);
                            }
                            this.i2 = elapsedRealtime;
                        } else {
                            f = -1.0f;
                        }
                    }
                    if (f != -1.0f) {
                        vpa vpaVar = this.h2;
                        vpaVar.m.i = f * 1000.0f;
                        vpaVar.h();
                    }
                    if (z2) {
                        i = r47Var.i0;
                    } else {
                        i = (int) (r47Var.L0() * b20Var.getProgress());
                        r47Var.i0 = i;
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
                this.N1.l(hl.g0(i, false, false), false);
            }
            b20Var.g(r47Var);
        }
    }

    public final void Y0() {
        int i = xea.O0;
        s7 s7Var = this.U1;
        if (i != 0 && i != 1) {
            if (i == 2) {
                s7Var.setIcon(R.drawable.player_new_repeatone);
                int i2 = aob.Oj;
                s7Var.setTag(Integer.valueOf(i2));
                s7Var.setIconColor(aob.v0(i2, this.J0));
                aob.F1(s7Var.getBackground(), aob.v0(i2, this.J0) & 436207615, true);
                s7Var.setContentDescription(ob6.M0(2131754780, null));
                return;
            }
            return;
        }
        if (xea.J0) {
            if (i == 0) {
                s7Var.setIcon(R.drawable.player_new_shuffle);
            } else {
                s7Var.setIcon(R.drawable.player_new_repeat_shuffle);
            }
        } else if (!xea.K0) {
            s7Var.setIcon(R.drawable.player_new_repeatall);
        } else if (i == 0) {
            s7Var.setIcon(R.drawable.player_new_order);
        } else {
            s7Var.setIcon(R.drawable.player_new_repeat_reverse);
        }
        if (i == 0 && !xea.J0 && !xea.K0) {
            int i3 = aob.Nj;
            s7Var.setTag(Integer.valueOf(i3));
            s7Var.setIconColor(aob.v0(i3, this.J0));
            aob.F1(s7Var.getBackground(), aob.v0(aob.i6, this.J0), true);
            s7Var.setContentDescription(ob6.M0(2131754781, null));
            return;
        }
        int i4 = aob.Oj;
        s7Var.setTag(Integer.valueOf(i4));
        s7Var.setIconColor(aob.v0(i4, this.J0));
        aob.F1(s7Var.getBackground(), aob.v0(i4, this.J0) & 436207615, true);
        if (i != 0) {
            s7Var.setContentDescription(ob6.M0(2131754782, null));
        } else if (xea.J0) {
            s7Var.setContentDescription(ob6.M0(2131745050, null));
        } else {
            s7Var.setContentDescription(ob6.M0(2131745754, null));
        }
    }

    public final void Z0() {
        O0(this.X1, xea.J0);
        O0(this.Y1, xea.K0);
        O0(this.W1, xea.O0 == 1);
        O0(this.V1, xea.O0 == 2);
    }

    public final void a1() {
        int v0 = aob.v0(this.n2 ? aob.a7 : aob.h5, this.J0);
        if (v0 != this.N2) {
            this.N2 = v0;
            s0(v0);
        }
        int v02 = aob.v0(aob.Nj, this.J0);
        n10 n10Var = this.D1;
        if (n10Var != null) {
            n10Var.h(v02, "Triangle 3");
            n10Var.h(v02, "Triangle 4");
            n10Var.h(v02, "Rectangle 4");
        }
        o10 o10Var = this.E1;
        if (o10Var != null) {
            o10Var.h(v02, "Triangle 3");
            o10Var.h(v02, "Triangle 4");
            o10Var.h(v02, "Rectangle 4");
        }
        b20 b20Var = this.M1;
        if (b20Var != null) {
            b20Var.setOuterColor(aob.v0(aob.Mj, this.J0));
        }
        boolean z = false;
        s7 s7Var = this.O1;
        if (s7Var != null) {
            float f = MediaController.z().r0;
            int v03 = aob.v0(!G0(f, 1.0f) ? aob.Hi : aob.x7, this.J0);
            zoa zoaVar = this.P1;
            if (zoaVar != null) {
                zoaVar.a.u(v03);
                Paint paint = zoaVar.b;
                if (paint != null) {
                    paint.setColor(v03);
                }
            }
            aob.F1(s7Var.getBackground(), v03 & 436207615, true);
            int i = 0;
            while (true) {
                b8[] b8VarArr = this.S1;
                if (i >= b8VarArr.length) {
                    break;
                }
                if (b8VarArr[i] != null) {
                    int v04 = aob.v0(G0(f, T2[i]) ? aob.Hi : aob.E8, this.J0);
                    b8VarArr[i].d(v04, v04);
                }
                i++;
            }
        }
        b8 b8Var = this.I1;
        if (b8Var != null) {
            p10 p10Var = this.J1;
            if (p10Var != null && p10Var.b()) {
                z = true;
            }
            int v05 = aob.v0(aob.E8, this.J0);
            int v06 = aob.v0(aob.F8, this.J0);
            int i2 = aob.Fi;
            b8Var.e(v05, v06, aob.v0(i2, this.J0), z);
            this.I1.setSelectorColor((p10Var == null || !p10Var.b()) ? aob.v0(aob.i6, this.J0) : aob.p1(0.1f, aob.v0(i2, this.J0)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x010e, code lost:
    
        if (r2.exists() == false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(boolean z) {
        File file;
        de0 de0Var;
        ImageView imageView;
        int i;
        String str;
        Bitmap bitmap;
        z10 z10Var;
        r47 r47Var = MediaController.z().v0;
        if (r47Var == null) {
            if (!z) {
                this.r2 = null;
                return;
            }
        } else if (r47Var.I3()) {
            byte b = 1;
            Object[] objArr = 0;
            boolean z2 = r47Var == this.r2;
            this.r2 = r47Var;
            long j = r47Var.T;
            s7 s7Var = this.G1;
            if (j != 0 || r47Var.e1() <= -2000000000) {
                s7Var.setVisibility(4);
            } else {
                s7Var.setVisibility(0);
            }
            long B0 = r47.B0(r47Var.k);
            long j2 = r47Var.F0() != null ? r47Var.F0().id : 0L;
            boolean z3 = (B0 < 0 && uc7.s1(this.a).E2(B0)) || uc7.s1(this.a).E2(r47.B0(r47Var.k)) || r47Var.k.noforwards;
            if (z3 != this.s2) {
                this.s2 = z3;
                l10 l10Var = this.x1;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) l10Var.getLayoutParams();
                layoutParams.height = hl.L(((z3 || J0()) ? 0 : 52) + jn7.I2);
                l10Var.setLayoutParams(layoutParams);
                View view = this.o1;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams2.bottomMargin = hl.L(jn7.I2 + ((J0() || z3) ? 0 : 52));
                view.setLayoutParams(layoutParams2);
            }
            if (z3) {
                s7Var.u(1);
                s7Var.u(2);
                s7Var.u(5);
                s7Var.u(6);
                s7Var.setAdditionalYOffset(-hl.L(16.0f));
            } else {
                s7Var.S(1);
                s7Var.S(2);
                s7Var.S(5);
                s7Var.setAdditionalYOffset(-hl.L(197.0f));
            }
            String str2 = r47Var.k.attachPath;
            if (str2 != null && str2.length() > 0) {
                file = new File(r47Var.k.attachPath);
            }
            file = null;
            if (file == null) {
                xb4.G(this.a);
                file = xb4.M(r47Var.k, false, true);
            }
            Object[] objArr2 = xea.x0 && ((int) r47.B0(r47Var.k)) != 0 && r47Var.I3();
            boolean exists = file.exists();
            ImageView imageView2 = this.Z1;
            b20 b20Var = this.M1;
            n46 n46Var = this.L1;
            if (exists || objArr2 == true) {
                lq3.q(this.a).v(this);
                n46Var.setVisibility(4);
                b20Var.setVisibility(0);
                imageView2.setEnabled(true);
            } else {
                String S0 = r47Var.S0();
                lq3.q(this.a).a(S0, null, this);
                Float s = in5.z().s(S0);
                n46Var.a(false, s != null ? s.floatValue() : 0.0f);
                n46Var.setVisibility(0);
                b20Var.setVisibility(4);
                imageView2.setEnabled(false);
            }
            X0(r47Var, !z2);
            z10 z10Var2 = this.B1;
            de0 de0Var2 = !z2 ? z10Var2.a[!z10Var2.b ? 1 : 0] : z10Var2.a[z10Var2.b ? 1 : 0];
            h00 h00Var = MediaController.z().E0;
            if (!z2) {
                AnimatorSet animatorSet = z10Var2.c;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                z10Var2.c = new AnimatorSet();
                boolean z4 = z10Var2.b;
                boolean z5 = !z4;
                z10Var2.b = z5;
                de0[] de0VarArr = z10Var2.a;
                de0 de0Var3 = de0VarArr[z4 ? 1 : 0];
                de0 de0Var4 = de0VarArr[z5 ? 1 : 0];
                boolean B = de0Var3.getImageReceiver().B();
                de0Var4.setAlpha(B ? 1.0f : 0.0f);
                de0Var4.setScaleX(0.8f);
                de0Var4.setScaleY(0.8f);
                de0Var4.setVisibility(0);
                if (B) {
                    de0Var3.bringToFront();
                } else {
                    de0Var3.setVisibility(8);
                    de0Var3.setImageDrawable(null);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
                ofFloat.setDuration(125L);
                ofFloat.setInterpolator(k43.g);
                ofFloat.addUpdateListener(new e20(objArr == true ? 1 : 0, de0Var4, B));
                if (B) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(de0Var3.getScaleX(), 0.8f);
                    ofFloat2.setDuration(125L);
                    ofFloat2.setInterpolator(k43.i);
                    ofFloat2.addUpdateListener(new lk(de0Var3, de0Var4, b));
                    ofFloat2.addListener(new h0(de0Var3, (byte) 14));
                    z10Var = z10Var2;
                    z10Var.c.playSequentially(ofFloat2, ofFloat);
                } else {
                    z10Var = z10Var2;
                    z10Var.c.play(ofFloat);
                }
                z10Var.c.start();
            }
            if (h00Var == null || (bitmap = h00Var.o) == null) {
                this.u2 = xb4.r(null, r47Var.F0());
                this.j2 = false;
                String u0 = r47Var.u0(false);
                jn5 I0 = I0(r47Var);
                if (TextUtils.isEmpty(u0)) {
                    de0Var = de0Var2;
                    imageView = imageView2;
                    i = 8;
                    if (I0 != null) {
                        de0Var.g(1, 0L, null, I0, r47Var, null, null, null);
                    } else {
                        str = null;
                        de0Var.setImageDrawable(null);
                        de0Var.invalidate();
                    }
                } else {
                    jn5 g = jn5.g(u0);
                    de0Var = de0Var2;
                    imageView = imageView2;
                    i = 8;
                    de0Var.g(1, 0L, g, I0, r47Var, null, null, null);
                }
                str = null;
                de0Var.invalidate();
            } else {
                de0Var2.setImageBitmap(bitmap);
                this.u2 = null;
                this.j2 = true;
                str = null;
                imageView = imageView2;
                i = 8;
            }
            boolean G = MediaController.z().G();
            mf8 mf8Var = this.a2;
            if (G) {
                mf8Var.a(false, true);
                imageView.setContentDescription(ob6.M0(2131754925, str));
            } else {
                mf8Var.a(true, true);
                imageView.setContentDescription(ob6.M0(2131754926, str));
            }
            String y1 = r47Var.y1(true);
            String w1 = r47Var.w1(true);
            this.C1.setText(y1);
            this.F1.setText(w1);
            oc7 G1 = uc7.s1(this.a).G1();
            this.y1.setLoading(G1.c);
            P0(G1.b.contains(Long.valueOf(j2)));
            int L0 = (int) r47Var.L0();
            this.x2 = L0;
            TextView textView = this.T1;
            if (textView != null) {
                textView.setText(L0 != 0 ? hl.g0(L0, false, false) : "-:--");
            }
            s7 s7Var2 = this.O1;
            if (L0 > 600) {
                s7Var2.setVisibility(0);
            } else {
                s7Var2.setVisibility(i);
            }
            if (z2) {
                return;
            }
            MediaController z6 = MediaController.z();
            ArrayList arrayList = z6.S0;
            if (arrayList.size() > 1) {
                ArrayList arrayList2 = new ArrayList();
                int i2 = z6.V0;
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
                arrayList2.add((r47) arrayList.get(i3));
                if (i3 != i4) {
                    arrayList2.add((r47) arrayList.get(i4));
                }
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    r47 r47Var2 = (r47) arrayList2.get(i5);
                    jn5 I02 = I0(r47Var2);
                    if (I02 != null) {
                        if (I02.g != null) {
                            in5 z7 = in5.z();
                            z7.s.c(new mm5(z7, I02.g, (byte) 4));
                        } else {
                            xb4.G(this.a).V(I02, r47Var2, null, 0, 1);
                        }
                    }
                }
                return;
            }
            return;
        }
        dismiss();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        k20 k20Var;
        r47 messageObject;
        k20 k20Var2;
        r47 messageObject2;
        r47 r47Var;
        int i3 = jn7.h2;
        int i4 = jn7.f2;
        int i5 = jn7.g2;
        q10 q10Var = this.r1;
        if (i == i3 || i == i5 || i == i4) {
            b1(i == i4 && ((Boolean) objArr[1]).booleanValue());
            if (i == i4 || i == i5) {
                int childCount = q10Var.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = q10Var.getChildAt(i6);
                    if ((childAt instanceof k20) && (messageObject = (k20Var = (k20) childAt).getMessageObject()) != null && (r47.Q4(messageObject.k) || messageObject.I3())) {
                        k20Var.b(false, true);
                    }
                }
                if (i == i5 && MediaController.z().v0 != null) {
                    if (MediaController.z().G()) {
                        T0();
                    } else if (this.A2 == 1 && this.B2 != -1.0f) {
                        p1 p1Var = this.H2;
                        hl.r(p1Var);
                        this.E2 = 0L;
                        p1Var.run();
                        this.B2 = -1.0f;
                    }
                }
            } else {
                if (((r47) objArr[0]).T != 0) {
                    return;
                }
                int childCount2 = q10Var.getChildCount();
                for (int i7 = 0; i7 < childCount2; i7++) {
                    View childAt2 = q10Var.getChildAt(i7);
                    if ((childAt2 instanceof k20) && (messageObject2 = (k20Var2 = (k20) childAt2).getMessageObject()) != null && (r47.Q4(messageObject2.k) || messageObject2.I3())) {
                        k20Var2.b(false, true);
                    }
                }
            }
            eh2 eh2Var = this.H1;
            if (eh2Var != null) {
                eh2Var.a(go.w());
                return;
            }
            return;
        }
        if (i == jn7.e2) {
            r47 r47Var2 = MediaController.z().v0;
            if (r47Var2 == null || !r47Var2.I3()) {
                return;
            }
            X0(r47Var2, false);
            return;
        }
        if (i == jn7.M4) {
            W0(true);
            return;
        }
        int i8 = jn7.K0;
        i20 i20Var = this.t1;
        if (i == i8) {
            this.p2 = MediaController.z().R0;
            this.q2 = MediaController.z().S0;
            i20Var.f();
            return;
        }
        if (i == jn7.L0) {
            this.p2 = MediaController.z().R0;
            this.q2 = MediaController.z().S0;
            i20Var.f();
            if (xea.K0) {
                q10Var.E0();
                int intValue = ((Integer) objArr[0]).intValue();
                x46 x46Var = this.s1;
                x46Var.K0();
                int M0 = x46Var.M0();
                if (M0 != -1) {
                    View m = x46Var.m(M0);
                    x46Var.g1(M0 + intValue, m != null ? m.getTop() : 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == jn7.Y1) {
            if (((String) objArr[0]).equals(this.u2)) {
                b1(false);
                this.j2 = true;
                return;
            }
            return;
        }
        if (i != jn7.X1) {
            if (i == jn7.X3) {
                b1(false);
                return;
            }
            return;
        }
        if (!((String) objArr[0]).equals(this.u2) || (r47Var = MediaController.z().v0) == null) {
            return;
        }
        if (!this.j2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - this.i2) >= 500) {
                r13 = MediaController.z().m0 ? xb4.G(this.a).t(this.u2, r47Var.b0) : 1.0f;
                this.i2 = elapsedRealtime;
            } else {
                r13 = -1.0f;
            }
        }
        if (r13 != -1.0f) {
            vpa vpaVar = this.h2;
            vpaVar.m.i = r13 * 1000.0f;
            vpaVar.h();
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        jn7.f(this.a).n(this, jn7.f2);
        jn7.f(this.a).n(this, jn7.g2);
        jn7.f(this.a).n(this, jn7.h2);
        jn7.f(this.a).n(this, jn7.e2);
        jn7.f(this.a).n(this, jn7.Y1);
        jn7.f(this.a).n(this, jn7.X1);
        jn7.f(this.a).n(this, jn7.K0);
        jn7.f(this.a).n(this, jn7.L0);
        jn7.f(this.a).n(this, jn7.X3);
        jn7.e().n(this, jn7.M4);
        lq3.q(this.a).v(this);
        if (S2 == this) {
            S2 = null;
        }
    }

    @Override // jq3
    public final int getObserverTag() {
        return this.y2;
    }

    @Override // nx0
    public final boolean h0(View view, int i, int i2, int i3, int i4) {
        l10 l10Var = this.b2;
        if (view != l10Var) {
            return false;
        }
        l10Var.layout(0, 0, l10Var.getMeasuredWidth(), l10Var.getMeasuredHeight());
        return true;
    }

    @Override // jq3
    public final void i(long j, long j2) {
        this.L1.a(true, Math.min(1.0f, j / j2));
    }

    @Override // nx0
    public final boolean i0(View view, int i, int i2) {
        l10 l10Var = this.b2;
        if (view != l10Var) {
            return false;
        }
        ex0 ex0Var = this.c;
        l10Var.measure(View.MeasureSpec.makeMeasureSpec(ex0Var.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(ex0Var.getMeasuredHeight(), TLObject.FLAG_30));
        return true;
    }

    @Override // nx0, android.app.Dialog
    public final void onBackPressed() {
        y10 y10Var = this.m1;
        if (y10Var != null && y10Var.o0) {
            y10Var.o(true);
        } else if (this.b2.getTag() != null) {
            R0(false, true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // nx0
    public final void p0() {
        super.p0();
        try {
            if (this.e2 != null && this.U1 != null && this.G1 != null && this.L1 != null) {
                F0();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            a1();
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        try {
            float f = this.G2;
            if (f >= 0.0f) {
                boolean z = f <= 0.5f && vm2.h(aob.v0(aob.h5, this.J0)) > 0.699999988079071d;
                if (z != this.F2) {
                    this.F2 = z;
                    hl.l3(this, z);
                }
            }
        } catch (Exception e3) {
            cc4.g(e3, true);
        }
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        super.show();
        S2 = this;
    }

    public final void updateColors() {
        s7 s7Var = this.O1;
        if (s7Var != null) {
            int v0 = aob.v0(!G0(MediaController.z().r0, 1.0f) ? aob.Hi : aob.x7, this.J0);
            zoa zoaVar = this.P1;
            if (zoaVar != null) {
                zoaVar.a.u(v0);
                Paint paint = zoaVar.b;
                if (paint != null) {
                    paint.setColor(v0);
                }
            }
            s7Var.setBackground(aob.f0(v0 & 436207615, 1, hl.L(14.0f)));
        }
        b8 b8Var = this.I1;
        if (b8Var != null) {
            p10 p10Var = this.J1;
            boolean z = p10Var != null && p10Var.b();
            int v02 = aob.v0(aob.E8, this.J0);
            int v03 = aob.v0(aob.F8, this.J0);
            int i = aob.Fi;
            b8Var.e(v02, v03, aob.v0(i, this.J0), z);
            this.I1.setSelectorColor((p10Var == null || !p10Var.b()) ? aob.v0(aob.i6, this.J0) : aob.p1(0.1f, aob.v0(i, this.J0)));
        }
    }

    @Override // jq3
    public final void B(boolean z) {
    }

    @Override // jq3
    public final void N(String str) {
    }

    @Override // jq3
    public final void l(long j, long j2) {
    }
}
