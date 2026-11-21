package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class f6 extends org.telegram.ui.Components.sa implements fs {
    public static final /* synthetic */ int z3 = 0;
    public boolean A2;
    public TL_stars.SavedStarGift B2;
    public q8 C2;
    public fj D2;
    public String E2;
    public TL_stars.TL_starGiftUnique F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public boolean K2;
    public o5 L2;
    public boolean M2;
    public m4 N2;
    public final int[] O2;
    public l4 P2;
    public int Q2;
    public String R2;
    public bi.i8 S2;
    public final long T1;
    public nq T2;
    public final n4 U1;
    public boolean U2;
    public final h4 V1;
    public z3 V2;
    public final wz W1;
    public Float W2;
    public final View X1;
    public e5 X2;
    public bi.z2 Y1;
    public ValueAnimator Y2;
    public bi.z2 Z1;
    public nq Z2;
    public final k4 a2;
    public boolean a3;
    public final z5 b2;
    public TL_wallet.nftItem b3;
    public final j4 c2;
    public org.telegram.ui.Wallet.v5 c3;
    public final m80 d2;
    public org.telegram.ui.Wallet.w5 d3;
    public final ey0 e2;
    public TL_wallet.walletTransaction e3;
    public final m80 f2;
    public final LinearLayout f3;
    public final hi.e g2;
    public final TextView g3;
    public final FrameLayout h2;
    public final TextView h3;
    public final m80 i2;
    public View i3;
    public final FrameLayout j2;
    public bi.z5 j3;
    public final View k2;
    public boolean k3;
    public final FrameLayout l2;
    public Boolean l3;
    public b6 m2;
    public boolean m3;
    public boolean n2;
    public ArrayList n3;
    public final j4 o2;
    public ArrayList o3;
    public final ki.i[] p2;
    public ArrayList p3;
    public final View q2;
    public boolean q3;
    public final LinearLayout r2;
    public TLRPC.PaymentForm r3;
    public final op s2;
    public final nq[] s3;
    public final TextView t2;
    public final k1 t3;
    public final LinearLayout u2;
    public int u3;
    public final op v2;
    public Boolean v3;
    public boolean w2;
    public boolean w3;
    public final j4 x2;
    public hi.l3 x3;
    public final TextView y2;
    public View y3;
    public final j4 z2;

    public f6(Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, View view) {
        super(context, null, false, false, h6Var);
        this.n2 = false;
        this.O2 = new int[2];
        this.Q2 = -1;
        this.R2 = "";
        this.X2 = new e5(0, 0);
        this.a3 = true;
        this.s3 = new nq[1];
        this.t3 = new k1(this, 16);
        this.w3 = true;
        this.a = i7;
        this.T1 = j3;
        this.v1 = Math.max(0.05f, org.telegram.messenger.g0.L(82.0f) / (org.telegram.messenger.g0.q.y + org.telegram.messenger.g0.m));
        this.x = true;
        this.b = new bi.e3(2, context, this);
        n4 n4Var = new n4(this, context);
        this.U1 = n4Var;
        h4 h4Var = new h4(this, context);
        this.V1 = h4Var;
        h4Var.setAdapter(new i4(0, context, this));
        K2();
        View view2 = new View(context);
        this.X1 = view2;
        int i10 = org.telegram.ui.ActionBar.m6.h5;
        org.telegram.ui.ActionBar.t6.h(i10, view2, h6Var);
        FrameLayout.LayoutParams e10 = c8.ma.e(-1, 50, 80);
        int i11 = this.u0;
        e10.rightMargin = i11;
        e10.leftMargin = i11;
        this.b.addView(view2, e10);
        this.b.addView(h4Var, c8.ma.e(-1, -1, ks.E1));
        Q(i10);
        org.telegram.messenger.g0.E2(this.o1);
        n4Var.addView(this.o1, c8.ma.e(-1, -1, ks.E1));
        if (Build.VERSION.SDK_INT >= 26) {
            this.o1.setDefaultFocusHighlightEnabled(false);
        }
        j4 j4Var = new j4(this, context, 0);
        this.c2 = j4Var;
        j4Var.setOrientation(1);
        j4Var.setPadding(org.telegram.messenger.g0.L(14.0f) + this.u0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f) + this.u0, org.telegram.messenger.g0.L(68.0f));
        n4Var.addView(j4Var, c8.ma.e(-1, -1, 55));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f3 = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.g3 = textView;
        textView.setSingleLine(true);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        i5.c.x(textView, 1, 40.0f);
        int i12 = org.telegram.ui.ActionBar.m6.Fi;
        org.telegram.ui.ActionBar.t6.U(textView, i12, h6Var);
        linearLayout.addView(textView, c8.ma.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        this.h3 = textView2;
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.z6, h6Var);
        linearLayout.addView(textView2, c8.ma.t(-1, 20, 1, 0, 3, 0, 0));
        j4Var.addView(linearLayout, c8.ma.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.setVisibility(8);
        m80 m80Var = new m80(context, h6Var);
        this.d2 = m80Var;
        int i13 = org.telegram.ui.ActionBar.m6.q5;
        org.telegram.ui.ActionBar.t6.U(m80Var, i13, h6Var);
        m80Var.setTextSize(1, 12.0f);
        m80Var.setGravity(17);
        m80Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, h6Var);
        m80Var.setDisablePaddingsOffsetY(true);
        j4Var.addView(m80Var, c8.ma.t(-2, -2, 1, 4, -2, 4, 16));
        m80Var.setVisibility(8);
        ey0 ey0Var = new ey0(context, h6Var);
        this.e2 = ey0Var;
        j4Var.addView(ey0Var, c8.ma.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        m80 m80Var2 = new m80(context, h6Var);
        this.f2 = m80Var2;
        org.telegram.ui.ActionBar.t6.U(m80Var2, i13, h6Var);
        m80Var2.setTextSize(1, 12.0f);
        m80Var2.setGravity(17);
        m80Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.t6.G(m80Var2, i12, h6Var);
        m80Var2.setDisablePaddingsOffsetY(true);
        m80Var2.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        j4Var.addView(m80Var2, c8.ma.t(-2, -2, 1, 4, 2, 4, 8));
        m80Var2.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.u2 = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout2.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i14, h6Var), 21, 21);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
        linearLayout2.setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(linearLayout2, a02, null, M, h6Var);
        op opVar = new op(24, context, h6Var);
        this.v2 = opVar;
        int i15 = org.telegram.ui.ActionBar.m6.h7;
        int i16 = org.telegram.ui.ActionBar.m6.j7;
        int i17 = org.telegram.ui.ActionBar.m6.k7;
        opVar.b(i15, i16, i17);
        opVar.setDrawUnchecked(true);
        opVar.a(false, false);
        opVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(opVar, c8.ma.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        int i18 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(textView3, i18, h6Var);
        i5.c.r(14.0f, 1, 2131750372, textView3, null);
        linearLayout2.addView(textView3, c8.ma.t(-2, -2, 16, 9, 0, 0, 0));
        j4Var.addView(linearLayout2, c8.ma.t(-2, -2, 1, 0, -4, 0, 4));
        c8.ra.b(linearLayout2, 0.025f, 1.5f);
        linearLayout2.setOnClickListener(new i1(this, 25));
        linearLayout2.setVisibility(8);
        j4 j4Var2 = new j4(this, context, 1);
        this.o2 = j4Var2;
        j4Var2.setOrientation(1);
        j4Var2.setPadding(org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(66.0f));
        n4Var.addView(j4Var2, c8.ma.e(-1, -1, 55));
        ki.i[] iVarArr = {r7, r7, r7};
        this.p2 = iVarArr;
        ki.i iVar = new ki.i(context, h6Var, false);
        iVar.a(R.drawable.menu_feature_unique, gd.N0(2131749848, null), gd.N0(2131749399, null));
        j4Var2.addView(iVarArr[0], c8.ma.o(-1, -2));
        ki.i iVar2 = new ki.i(context, h6Var, false);
        iVar2.a(R.drawable.menu_feature_tradable, gd.N0(2131749842, null), gd.N0(2131749397, null));
        j4Var2.addView(iVarArr[1], c8.ma.o(-1, -2));
        ki.i iVar3 = new ki.i(context, h6Var, false);
        iVar3.a(R.drawable.menu_wear, gd.N0(2131749394, null), gd.N0(2131749395, null));
        j4Var2.addView(iVarArr[2], c8.ma.o(-1, -2));
        View view3 = new View(context);
        this.q2 = view3;
        int i19 = org.telegram.ui.ActionBar.m6.d7;
        org.telegram.ui.ActionBar.t6.h(i19, view3, h6Var);
        j4Var2.addView(view3, c8.ma.n(1.0f / org.telegram.messenger.g0.p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.r2 = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout3.setOrientation(0);
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i14, h6Var), 6, 6);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        linearLayout3.setBackground(a03);
        org.telegram.ui.ActionBar.t6.j(linearLayout3, a03, null, M2, h6Var);
        op opVar2 = new op(24, context, h6Var);
        this.s2 = opVar2;
        opVar2.b(i15, i16, i17);
        opVar2.setDrawUnchecked(true);
        opVar2.a(false, false);
        opVar2.setDrawBackgroundAsArc(10);
        linearLayout3.addView(opVar2, c8.ma.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        this.t2 = textView4;
        org.telegram.ui.ActionBar.t6.U(textView4, i18, h6Var);
        i5.c.r(14.0f, 1, 2131750380, textView4, null);
        linearLayout3.addView(textView4, c8.ma.t(-2, -2, 16, 9, 0, 0, 0));
        j4Var2.addView(linearLayout3, c8.ma.t(-2, -2, 1, 0, 0, 0, 4));
        c8.ra.b(linearLayout3, 0.025f, 1.5f);
        j4 j4Var3 = new j4(this, context, 2);
        this.x2 = j4Var3;
        j4Var3.setOrientation(1);
        j4Var3.setPadding(org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(66.0f));
        n4Var.addView(j4Var3, c8.ma.e(-1, -1, 55));
        TextView textView5 = new TextView(context);
        this.y2 = textView5;
        org.telegram.ui.ActionBar.t6.U(textView5, i18, h6Var);
        textView5.setTextSize(1, 20.0f);
        textView5.setGravity(17);
        textView5.setTypeface(org.telegram.messenger.g0.o());
        j4Var3.addView(textView5, c8.ma.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView6 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView6, i18, h6Var);
        textView6.setTextSize(1, 14.0f);
        org.telegram.messenger.f3.k(textView6, 17, null, 2131749817);
        j4Var3.addView(textView6, c8.ma.t(-1, -2, 7, 20, 6, 20, 24));
        ki.i iVar4 = new ki.i(context, h6Var, false);
        iVar4.a(R.drawable.menu_feature_unique, gd.N0(2131749823, null), gd.N0(2131749824, null));
        j4Var3.addView(r6[0], c8.ma.o(-1, -2));
        ki.i iVar5 = new ki.i(context, h6Var, false);
        iVar5.a(R.drawable.menu_feature_cover, gd.N0(2131749821, null), gd.N0(2131749822, null));
        j4Var3.addView(r6[1], c8.ma.o(-1, -2));
        ki.i iVar6 = new ki.i(context, h6Var, false);
        ki.i[] iVarArr2 = {iVar4, iVar5, iVar6};
        iVar6.a(R.drawable.menu_verification, gd.N0(2131749819, null), gd.N0(2131749820, null));
        j4Var3.addView(iVarArr2[2], c8.ma.o(-1, -2));
        j4 j4Var4 = new j4(this, context, 3);
        this.z2 = j4Var4;
        j4Var4.setOrientation(1);
        j4Var4.setPadding(org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(92.0f));
        n4Var.addView(j4Var4, c8.ma.e(-1, -1, 55));
        ki.i iVar7 = new ki.i(context, h6Var, false);
        iVar7.a(R.drawable.menu_feature_unique, gd.N0(2131749768, null), gd.N0(2131749769, null));
        j4Var4.addView(r7[0], c8.ma.o(-1, -2));
        ki.i iVar8 = new ki.i(context, h6Var, false);
        iVar8.a(R.drawable.menu_random, gd.N0(2131749766, null), gd.N0(2131749767, null));
        j4Var4.addView(r7[1], c8.ma.o(-1, -2));
        ki.i iVar9 = new ki.i(context, h6Var, false);
        ki.i[] iVarArr3 = {iVar7, iVar8, iVar9};
        iVar9.a(R.drawable.menu_feature_affect, gd.N0(2131749764, null), gd.N0(2131749765, null));
        j4Var4.addView(iVarArr3[2], c8.ma.o(-1, -2));
        j4Var.setAlpha(1.0f);
        j4Var2.setAlpha(0.0f);
        j4Var3.setAlpha(0.0f);
        j4Var4.setAlpha(0.0f);
        z5 z5Var = new z5(context, h6Var, new k1(this, 17), new i1(this, 26), new i1(this, 27), new i1(this, 28), new i1(this, 29), new p3(this, 0), new p3(this, 1), new p3(this, 2));
        this.b2 = z5Var;
        z5Var.N.c.setOnClickListener(new i1(this, 23));
        int i20 = this.u0;
        z5Var.setPadding(i20, 0, i20, 0);
        n4Var.addView(z5Var, c8.ma.e(-1, -2, 55));
        jg.b0 b0Var = this.n1;
        this.K1 = true;
        b0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h2 = frameLayout;
        org.telegram.ui.ActionBar.t6.h(i10, frameLayout, h6Var);
        View view4 = new View(context);
        this.k2 = view4;
        org.telegram.ui.ActionBar.t6.h(i19, view4, h6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, c8.ma.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
        hi.e g10 = n10.g(24, context, h6Var, true);
        this.g2 = g10;
        g10.i(gd.N0(2131747637, null), false, true);
        g10.g(null, false);
        FrameLayout.LayoutParams d = c8.ma.d(-1, 48.0f, ks.E1, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = org.telegram.messenger.g0.L(14.0f) + this.u0;
        d.rightMargin = org.telegram.messenger.g0.L(14.0f) + this.u0;
        frameLayout.addView(g10, d);
        n4Var.addView(frameLayout, c8.ma.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.j2 = frameLayout2;
        org.telegram.ui.ActionBar.t6.h(i10, frameLayout2, h6Var);
        m80 m80Var3 = new m80(context, null);
        this.i2 = m80Var3;
        m80Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var3, i12, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var3, i12, h6Var);
        m80Var3.setGravity(17);
        frameLayout2.addView(m80Var3, c8.ma.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        n4Var.addView(frameLayout2, c8.ma.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.o1.setOnScrollListener(new bi.u1(this, 9));
        linearLayout3.setOnClickListener(new i1(this, 24));
        wz wzVar = new wz(context);
        this.W1 = wzVar;
        n4Var.addView(wzVar, c8.ma.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.l2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(6.0f) + this.u0, 0, org.telegram.messenger.g0.L(6.0f) + this.u0, 0);
        n4Var.addView(frameLayout3, c8.ma.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        org.telegram.messenger.g0.E2(this.p1);
        n4Var.addView(this.p1, c8.ma.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        k4 k4Var = new k4(context);
        this.a2 = k4Var;
        n4Var.addView(k4Var, c8.ma.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        org.telegram.messenger.g0.m2(new ai.h0(k4Var, 11), 12.0f, 12, arrayList);
    }

    public static String A1(int i7) {
        Date date = new Date(i7 * 1000);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        gd E0 = gd.E0();
        return gd.a0(null, null, 2131742519, (calendar.get(1) == calendar2.get(1) ? E0.q0() : E0.s0()).format(date), E0.p0().format(date));
    }

    public static String F1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? gd.N0(2131750175, null) : starGift.title;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb2.append(" #");
        return i5.c.l(r3.num, ',', sb2);
    }

    public static String L1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return gd.N0(2131749446, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return gd.N0(2131749447, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return gd.N0(2131749449, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return gd.N0(2131749448, null);
        }
        if (!(starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
            return "";
        }
        int i7 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        return i7 <= 0 ? "<0.1%" : ki.j.J0(i7);
    }

    public static boolean P1(int i7, TL_stars.StarGift starGift) {
        if (!bi.y4.m(starGift)) {
            return false;
        }
        if (!((org.telegram.messenger.h0) mp.u1(i7).A7.p0.b).c) {
            return true;
        }
        if (((TL_stars.TL_starGiftUnique) starGift).fixed_sale) {
            return false;
        }
        return !((org.telegram.messenger.h0) r3.t.b).c;
    }

    public static boolean R1(int i7, long j3) {
        return j3 >= 0 ? j10.i(i7).e() == j3 : org.telegram.messenger.v3.w(5, mp.u1(i7).O0(Long.valueOf(-j3)));
    }

    public static boolean S1(int i7, long j3) {
        if (j3 >= 0) {
            return j10.i(i7).e() == j3;
        }
        TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
        return O0 != null && O0.creator;
    }

    public static boolean U1(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long o4 = org.telegram.messenger.n5.o(peer);
        if (o4 == 0) {
            return false;
        }
        if (o4 > 0) {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(o4));
            if (c22 != null) {
                TLRPC.EmojiStatus emojiStatus = c22.emoji_status;
                return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
            }
        } else {
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-o4));
            if (O0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = O0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void e1(f6 f6Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        n8 F;
        TLRPC.Message message;
        hi.e eVar = f6Var.g2;
        if (eVar.R) {
            return;
        }
        TL_stars.InputSavedStarGift G1 = f6Var.G1();
        fj fjVar = f6Var.D2;
        if (fjVar == null || (message = fjVar.k) == null) {
            TL_stars.SavedStarGift savedStarGift = f6Var.B2;
            if (savedStarGift == null) {
                return;
            }
            z10 = !savedStarGift.unsaved;
            document = savedStarGift.gift.getDocument();
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                z10 = tL_messageActionStarGift.saved;
                document = tL_messageActionStarGift.gift.getDocument();
            } else {
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                z10 = tL_messageActionStarGiftUnique.saved;
                document = tL_messageActionStarGiftUnique.gift.getDocument();
            }
        }
        TLRPC.Document document2 = document;
        boolean z12 = z10;
        eVar.setLoading(true);
        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.unsave = z12;
        savestargift.stargift = G1;
        if (f6Var.B2 == null || (F = y8.y(f6Var.a, false).F(f6Var.T1, false)) == null) {
            z11 = false;
        } else {
            F.m(f6Var.B2, savestargift.unsave);
            z11 = true;
        }
        ConnectionsManager.getInstance(f6Var.a).sendRequest(savestargift, new x3(f6Var, z11, document2, z12, savestargift));
    }

    public static void f1(final f6 f6Var) {
        int i7;
        long o4;
        long j3;
        long j10;
        final long e10 = j10.i(f6Var.a).e();
        final TL_stars.InputSavedStarGift G1 = f6Var.G1();
        if (G1 == null) {
            return;
        }
        fj fjVar = f6Var.D2;
        if (fjVar != null) {
            i7 = fjVar.k.date;
            boolean P3 = fjVar.P3();
            TLRPC.Message message = f6Var.D2.k;
            if (message == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGift.peer;
            j10 = peer != null ? org.telegram.messenger.n5.o(peer) : P3 ? fj.B0(message) : e10;
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            o4 = peer2 != null ? org.telegram.messenger.n5.o(peer2) : P3 ? e10 : fj.B0(f6Var.D2.k);
            j3 = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = f6Var.B2;
            if (savedStarGift == null) {
                return;
            }
            i7 = savedStarGift.date;
            o4 = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? 2666000L : org.telegram.messenger.n5.o(savedStarGift.from_id);
            j3 = f6Var.B2.convert_stars;
            j10 = f6Var.T1;
        }
        int max = Math.max(1, (mp.u1(f6Var.a).H6 - (ConnectionsManager.getInstance(f6Var.a).getCurrentTime() - i7)) / 86400);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
        String N0 = gd.N0(2131750209, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(gd.G(max, "Gift2ConvertText2", (o10.B(o4) || o4 == 2666000) ? gd.N0(2131744708, null) : org.telegram.messenger.n5.t(o4), gd.H(',', "Gift2ConvertStars", (int) j3)));
        final long j11 = j3;
        final long j12 = j10;
        alertDialog$Builder.k(gd.N0(2131750216, null), new org.telegram.ui.ActionBar.q1() { // from class: di.v3
            @Override // org.telegram.ui.ActionBar.q1
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                f6 f6Var2 = f6.this;
                TL_stars.InputSavedStarGift inputSavedStarGift = G1;
                long j13 = j12;
                long j14 = e10;
                long j15 = j11;
                org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, org.telegram.messenger.t0.b, null);
                t1Var3.r(500L);
                TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
                convertstargift.stargift = inputSavedStarGift;
                ConnectionsManager.getInstance(f6Var2.a).sendRequest(convertstargift, new h2(f6Var2, t1Var3, j13, j14, j15));
            }
        });
        i5.c.y(null, 2131752577, alertDialog$Builder, null);
    }

    public static void g1(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, fj fjVar) {
        t1Var.dismiss();
        f6Var.I2 = true;
        f6Var.v2(fjVar, null);
        super.show();
    }

    public static void h1(f6 f6Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        f6Var.F2 = tL_starGiftUnique;
        f6Var.x2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static void i1(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            t1Var.dismiss();
            f6Var.K2 = true;
            f6Var.w2(savedStarGift, null);
            super.show();
            return;
        }
        t1Var.dismiss();
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T != null) {
            org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.b0(T).Q(R.raw.error, 36, gd.N0(2131748359, null));
            Q.t = true;
            Q.j();
        }
    }

    public static void j1(f6 f6Var, boolean z10) {
        int I1 = f6Var.I1();
        if (I1 < 0) {
            return;
        }
        int i7 = (z10 ? 1 : -1) + I1;
        int i10 = f6Var.Q2;
        if (i10 >= 0 && (!z10 ? i10 < I1 : i10 > I1)) {
            i7 = i10;
        }
        q8 q8Var = f6Var.C2;
        Object obj = (q8Var == null || i7 < 0 || i7 >= q8Var.e()) ? null : f6Var.C2.get(i7);
        if (obj == null) {
            return;
        }
        if ((z10 ? f6Var.Z1 : f6Var.Y1) != null) {
            if (obj instanceof TL_stars.SavedStarGift) {
                if (y1((z10 ? f6Var.Z1 : f6Var.Y1).B2, (TL_stars.SavedStarGift) obj)) {
                    return;
                }
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                if (z1((z10 ? f6Var.Z1 : f6Var.Y1).F2, (TL_stars.TL_starGiftUnique) obj)) {
                    return;
                }
            }
        }
        bi.z2 z2Var = new bi.z2(f6Var, f6Var.getContext(), f6Var.a, f6Var.T1, f6Var.J0, f6Var.U1.getRootView());
        if (obj instanceof TL_stars.SavedStarGift) {
            z2Var.w2((TL_stars.SavedStarGift) obj, f6Var.C2);
        } else if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            z2Var.u2(tL_starGiftUnique.slug, tL_starGiftUnique, f6Var.C2);
        }
        org.telegram.messenger.g0.E2(z2Var.b);
        if (z10) {
            f6Var.Z1 = z2Var;
        } else {
            f6Var.Y1 = z2Var;
        }
    }

    public static TableRow k1(ey0 ey0Var, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        if (!WalletEngine2.isValidAddress(str2)) {
            return ey0Var.e(str, str2, null, null);
        }
        float L = org.telegram.messenger.g0.L(14.0f);
        TextView d4Var = new d4(ey0Var.getContext(), L);
        d4Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        int i7 = 0;
        d4Var.setTextSize(0, L);
        d4Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.t6.U(d4Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        while (i7 < str2.length()) {
            int i11 = i10 / 4;
            int i12 = i10 % 4;
            if (i10 > 0) {
                spannableStringBuilder.append((CharSequence) (i12 == 0 ? "\n" : " "));
            }
            int length = spannableStringBuilder.length();
            int i13 = i7 + 4;
            spannableStringBuilder.append((CharSequence) str2, i7, Math.min(str2.length(), i13));
            if (((i11 + i12) & 1) == 1) {
                spannableStringBuilder.setSpan(new k00(org.telegram.ui.ActionBar.m6.y6, h6Var), length, spannableStringBuilder.length(), 33);
            }
            i10++;
            i7 = i13;
        }
        d4Var.setText(spannableStringBuilder);
        return ey0Var.c(d4Var, str);
    }

    public static void m1(ey0 ey0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String N0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            N0 = gd.N0(2131750370, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            N0 = gd.N0(2131750363, null);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            N0 = gd.N0(2131750371, null);
        }
        String str = N0;
        Integer[] numArr = new Integer[1];
        ey0Var.d(str, starGiftAttribute.name, L1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static void p2(org.telegram.ui.ActionBar.g2 g2Var) {
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
        e2Var.a = true;
        T.showAsSheet(g2Var, e2Var);
    }

    public static SpannableStringBuilder s2(String str) {
        int i7;
        int i10;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i10 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i7 = 0;
        } else {
            i7 = i10 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new e4(0), indexOf, i7 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder t2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new nq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new nq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "👌");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString2, "👍");
        return spannableStringBuilder;
    }

    public static boolean y1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift == savedStarGift2) {
            return true;
        }
        if (savedStarGift == null) {
            return false;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        TL_stars.StarGift starGift2 = savedStarGift2.gift;
        if (starGift == starGift2) {
            return true;
        }
        return ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) ? starGift.id == starGift2.id : (starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.id == starGift2.id && savedStarGift.date == savedStarGift2.date;
    }

    public static boolean z1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique != null) {
            return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
        }
        return false;
    }

    public final void A2() {
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null) {
            return;
        }
        TLRPC.Peer peer = M1.owner_id;
        if (peer == null) {
            peer = M1.host_id;
        }
        long o4 = org.telegram.messenger.n5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(M1.title);
        sb2.append(" #");
        this.y2.setText(gd.a0(null, null, 2131749816, i5.c.l(M1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131749818, null));
        if (o4 == j10.i(this.a).e() && !j10.i(this.a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.T2 == null) {
                this.T2 = new nq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.T2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        hi.e eVar = this.g2;
        eVar.i(spannableStringBuilder, true, true);
        eVar.g(null, true);
        eVar.setOnClickListener(new p3(this, 3));
        this.b2.setWearPreview(mp.u1(this.a).g2(o4));
        H2(2, false, null);
        this.w2 = true;
    }

    public final int B1() {
        if (this.X2.d(1)) {
            return this.o2.getMeasuredHeight();
        }
        if (this.X2.d(2)) {
            return this.x2.getMeasuredHeight();
        }
        if (this.X2.d(3)) {
            return this.z2.getMeasuredHeight();
        }
        if (this.X2.d(4)) {
            return 0;
        }
        return this.c2.getMeasuredHeight();
    }

    public final void B2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique M1 = M1();
        TL_stars.InputSavedStarGift G1 = G1();
        if (G1 == null || M1 == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = G1;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject u10 = ki.s2.u(this.J0, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new bi.k2(this, charSequence, M1, tL_inputInvoiceStarGiftDropOriginalDetails, 2));
    }

    public final long C1() {
        TLRPC.Peer peer;
        fj fjVar = this.D2;
        if (fjVar == null) {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? org.telegram.messenger.n5.o(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.T1;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
            if (tL_starGiftUnique != null) {
                return org.telegram.messenger.n5.o(tL_starGiftUnique.owner_id);
            }
            return 0L;
        }
        TLRPC.Message message = fjVar.k;
        if (message == null) {
            return 0L;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
            return peer2 != null ? org.telegram.messenger.n5.o(peer2) : fjVar.P3() ? fj.B0(this.D2.k) : j10.i(this.a).e();
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return 0L;
        }
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
        TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
        if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && (peer = starGift2.owner_id) != null) {
            return org.telegram.messenger.n5.o(peer);
        }
        TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
        if (peer3 != null) {
            return org.telegram.messenger.n5.o(peer3);
        }
        return 0L;
    }

    public final void C2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        float primaryHorizontal;
        hi.l3 l3Var = this.x3;
        if ((l3Var != null && l3Var.W && this.y3 == view) || view == null) {
            return;
        }
        if (!z10) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof org.telegram.ui.ActionBar.m5)) {
                return;
            } else {
                layout = ((org.telegram.ui.ActionBar.m5) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            org.telegram.ui.Components.oc[] ocVarArr = (org.telegram.ui.Components.oc[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.oc.class);
            if (ocVarArr == null || ocVarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(ocVarArr[ocVarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
        } else {
            if (!(view instanceof org.telegram.ui.ActionBar.m5)) {
                return;
            }
            org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) view;
            primaryHorizontal = (m5Var.getRightDrawableWidth() / 2.0f) + m5Var.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        n4 n4Var = this.U1;
        n4Var.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        hi.l3 l3Var2 = this.x3;
        if (l3Var2 != null) {
            l3Var2.f(true);
            this.x3 = null;
        }
        hi.l3 l3Var3 = new hi.l3(getContext(), 3);
        l3Var3.r(!z10);
        l3Var3.v(charSequence);
        l3Var3.p(0.0f, (iArr[0] + primaryHorizontal) - (org.telegram.messenger.g0.L(16.0f) + this.u0));
        l3Var3.setTranslationY(((iArr[1] - org.telegram.messenger.g0.L(100.0f)) - (view.getHeight() / 2.0f)) + org.telegram.messenger.g0.L((z10 ? 18 : 0) + 4.33f));
        l3Var3.d = 3000L;
        l3Var3.setPadding(org.telegram.messenger.g0.L(16.0f) + this.u0, 0, org.telegram.messenger.g0.L(16.0f) + this.u0, 0);
        l3Var3.r0 = new bi.c0(l3Var3, 1);
        l3Var3.x();
        n4Var.addView(l3Var3, c8.ma.c(100.0f, -1));
        this.x3 = l3Var3;
        this.y3 = view;
    }

    public final TL_stars.StarGift D1() {
        fj fjVar = this.D2;
        if (fjVar != null) {
            TLRPC.Message message = fjVar.k;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final void D2(int i7, Context context, boolean z10) {
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(64.0f);
        int i10 = org.telegram.ui.ActionBar.m6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i10, this.J0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(frameLayout, L2, M, null, h6Var);
        g10.addView(frameLayout, c8.ma.t(64, 64, 49, 0, 6, 0, 0));
        rh0 rh0Var = new rh0(context);
        rh0Var.setScaleType(ImageView.ScaleType.CENTER);
        rh0Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(rh0Var, c8.ma.r(64, 64, 17));
        rh0Var.d();
        TextView b10 = c8.va.b(context, 20.0f, org.telegram.ui.ActionBar.m6.G6, true, null);
        b10.setGravity(17);
        b10.setText(gd.N0(z10 ? 2131749988 : 2131749894, null));
        g10.addView(b10, c8.ma.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = c8.va.b(context, 14.0f, org.telegram.ui.ActionBar.m6.F6, false, null);
        b11.setGravity(17);
        b11.setText(gd.a0(null, null, z10 ? 2131749989 : 2131749895, gd.c0(Math.max(10, i7))));
        g10.addView(b11, c8.ma.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, this.J0);
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(gd.N0(2131747637, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void E0(int i7) {
        super.E0(i7);
        org.telegram.messenger.g0.s3(this, 0, false, null);
    }

    public final String E1() {
        TL_stars.StarGift D1 = D1();
        if (!(D1 instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) D1).title);
        sb2.append(" #");
        return i5.c.l(r0.num, ',', sb2);
    }

    public final boolean E2() {
        if (!bi.y4.m(M1())) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String N0 = gd.N0(2131749901, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = gd.N0(2131749514, null);
        if (t1()) {
            alertDialog$Builder.k(gd.N0(2131750415, null), new g2(this, 2));
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
        } else {
            alertDialog$Builder.k(gd.N0(2131747637, null), null);
        }
        alertDialog$Builder.p();
        return true;
    }

    public final boolean F2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (!com.google.android.gms.internal.vision.e2.s(tL_starGiftUnique) || TextUtils.isEmpty(tL_starGiftUnique.gift_address) || TextUtils.isEmpty(tL_starGiftUnique.owner_address) || bi.y4.m(tL_starGiftUnique)) {
            return false;
        }
        org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(this.a);
        return org.telegram.ui.Wallet.u0.c(tL_starGiftUnique.owner_address, D.y()) || D.B().d(tL_starGiftUnique.gift_address);
    }

    @Override // org.telegram.ui.Components.sa, org.telegram.ui.ActionBar.w2
    public final boolean G() {
        if (this.X2.c(4)) {
            boolean z10 = this.b2.N.i0;
        }
        return false;
    }

    public final TL_stars.InputSavedStarGift G1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j3 = this.T1;
        if (j3 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = mp.u1(this.a).l1(j3);
            fj fjVar = this.D2;
            if (fjVar == null || (message3 = fjVar.k) == null) {
                TL_stars.SavedStarGift savedStarGift = this.B2;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.F2 == null || TextUtils.isEmpty(this.E2)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.E2;
                return tL_inputSavedStarGiftSlug;
            }
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if ((tL_messageActionStarGift.flags & TLObject.FLAG_12) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            }
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return null;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                return null;
            }
            tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
            return tL_inputSavedStarGiftChat;
        }
        fj fjVar2 = this.D2;
        if (fjVar2 != null && (message2 = fjVar2.k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & TLObject.FLAG_12) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                mp u12 = mp.u1(this.a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                tL_inputSavedStarGiftChat2.peer = u12.l1(peer != null ? org.telegram.messenger.n5.o(peer) : fj.B0(this.D2.k));
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (fjVar2 != null && (message = fjVar2.k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                mp u13 = mp.u1(this.a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                tL_inputSavedStarGiftChat3.peer = u13.l1(peer2 != null ? org.telegram.messenger.n5.o(peer2) : fj.B0(this.D2.k));
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        fj fjVar3 = this.D2;
        if (fjVar3 != null) {
            TLRPC.Message message4 = fjVar3.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = fjVar3.e1();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.B2;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.F2 == null || TextUtils.isEmpty(this.E2)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.E2;
        return tL_inputSavedStarGiftSlug2;
    }

    public final void G2(boolean z10, org.telegram.ui.ActionBar.t1 t1Var, vf.b bVar, Runnable runnable) {
        bVar.d();
        j10 i7 = j10.i(this.a);
        TL_account.tmpPassword tmppassword = i7.y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.a).getCurrentTime() + 60) {
            i7.y = null;
            i7.v(false);
        }
        TL_account.tmpPassword tmppassword2 = i7.y;
        if (tmppassword2 == null) {
            i2(z10, bVar, runnable);
        } else {
            O1(tmppassword2.tmp_password, null, z10, new x2(this, z10, bVar, runnable, t1Var));
        }
    }

    public final String H1() {
        TL_stars.StarGift D1 = D1();
        if (!(D1 instanceof TL_stars.TL_starGiftUnique) || D1.slug == null) {
            return null;
        }
        return mp.u1(this.a).X2 + "/nft/" + D1.slug;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H2(int i7, boolean z10, ch.k kVar) {
        int i10;
        hi.l3 l3Var;
        o5 o5Var;
        ValueAnimator valueAnimator = this.Y2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y2 = null;
        }
        z5 z5Var = this.b2;
        if (i7 != 1) {
            org.telegram.messenger.g0.r(z5Var.p0);
        }
        if (!this.a3) {
            this.W2 = Float.valueOf(this.U1.f());
        }
        e5 e5Var = this.X2;
        this.X2 = new e5(e5Var == null ? 0 : e5Var.c, i7);
        l4 l4Var = this.P2;
        int finalHeight = z5Var.getFinalHeight();
        int B1 = B1();
        if (this.X2.d(1)) {
            FrameLayout frameLayout = this.j2;
            if (frameLayout.getVisibility() == 0) {
                i10 = frameLayout.getMeasuredHeight();
                l4Var.H(finalHeight, B1 + i10);
                if (this.X2.c == 0 && (o5Var = this.L2) != null) {
                    o5Var.c();
                }
                j4 j4Var = this.z2;
                j4 j4Var2 = this.x2;
                j4 j4Var3 = this.o2;
                j4 j4Var4 = this.c2;
                if (z10) {
                    this.X2.a = 1.0f;
                    X1();
                    j4Var4.setVisibility(i7 == 0 ? 0 : 8);
                    j4Var3.setVisibility(i7 == 1 ? 0 : 8);
                    j4Var2.setVisibility(i7 == 2 ? 0 : 8);
                    j4Var.setVisibility(i7 != 3 ? 8 : 0);
                    J2();
                    if (kVar != null) {
                        kVar.run();
                    }
                } else {
                    j4Var4.setVisibility(this.X2.b(0) ? 0 : 8);
                    j4Var3.setVisibility(this.X2.b(1) ? 0 : 8);
                    j4Var2.setVisibility(this.X2.b(2) ? 0 : 8);
                    j4Var.setVisibility(this.X2.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.Y2 = ofFloat;
                    ofFloat.addUpdateListener(new ah.g(this, 5));
                    this.Y2.addListener(new a4(this, i7, kVar, r5));
                    this.Y2.setInterpolator(nr.h);
                    this.Y2.setDuration(320L);
                    this.Y2.start();
                    e5 e5Var2 = this.X2;
                    org.telegram.ui.Components.q9[] q9VarArr = z5Var.d;
                    int i11 = e5Var2.b;
                    int i12 = e5Var2.c;
                    if (i11 != i12) {
                        oh0 B = q9VarArr[i11].getImageReceiver().B();
                        oh0 B2 = q9VarArr[i12].getImageReceiver().B();
                        if (B2 != null && B != null) {
                            B2.T(false, B.t());
                        }
                    }
                }
                l3Var = this.x3;
                if (l3Var == null) {
                    l3Var.f(true);
                    this.x3 = null;
                    return;
                }
                return;
            }
        }
        i10 = 0;
        l4Var.H(finalHeight, B1 + i10);
        if (this.X2.c == 0) {
            o5Var.c();
        }
        j4 j4Var5 = this.z2;
        j4 j4Var22 = this.x2;
        j4 j4Var32 = this.o2;
        j4 j4Var42 = this.c2;
        if (z10) {
        }
        l3Var = this.x3;
        if (l3Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean I() {
        if (this.X2.c(4) && this.b2.N.i0) {
            return false;
        }
        return this.d0;
    }

    public final int I1() {
        int indexOf;
        q8 q8Var = this.C2;
        if (q8Var == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.B2;
        if (savedStarGift != null) {
            indexOf = q8Var.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = q8Var.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift D1 = D1();
        for (int i7 = 0; i7 < this.C2.e(); i7++) {
            Object obj = this.C2.get(i7);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.B2;
                if (savedStarGift2 != null) {
                    if (y1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                        return i7;
                    }
                }
                if (D1 != null) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (D1 != starGift) {
                        if ((D1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && D1.id == starGift.id) {
                        }
                    }
                    return i7;
                }
                continue;
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && z1(this.F2, (TL_stars.TL_starGiftUnique) obj)) {
                    return i7;
                }
            }
        }
        return -1;
    }

    public final void I2(boolean z10) {
        f6 f6Var;
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null) {
            return;
        }
        int i7 = 3;
        mp.g1().edit().putInt("statusgiftpage", 3).apply();
        boolean U1 = U1(this.a, M1());
        boolean z11 = !U1;
        boolean U12 = U1(this.a, M1());
        hi.e eVar = this.g2;
        if (U12) {
            mp.u1(this.a).s5(C1(), new TLRPC.TL_emojiStatusEmpty(), null);
            f6Var = this;
        } else {
            long C1 = C1();
            if (C1 >= 0) {
                if (!j10.i(this.a).q()) {
                    org.telegram.ui.Components.gc P = k().P(R.raw.star_premium_2, org.telegram.messenger.g0.x2(gd.N0(2131750406, null), new k1(this, i7)));
                    P.t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                mp u12 = mp.u1(this.a);
                eVar.setLoading(true);
                mp.u1(this.a).I0().a(C1, new bi.b4(this, u12, C1, 2));
                return;
            }
            f6Var = this;
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = M1.id;
            mp.u1(f6Var.a).s5(C1(), tL_inputEmojiStatusCollectible, M1);
        }
        f6Var.b2.J[1].e(!U1 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, gd.N0(!U1 ? 2131750405 : 2131750408, null), true);
        if (f6Var.w2) {
            dismiss();
            return;
        }
        ch.k kVar = new ch.k(2, this, z11);
        if (f6Var.X2.c(0)) {
            kVar.run();
        } else {
            H2(0, true, kVar);
        }
        eVar.i(gd.N0(2131747637, null), !f6Var.a3, true);
        eVar.g(null, !f6Var.a3);
        eVar.setOnClickListener(new i1(this, 11));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean J(MotionEvent motionEvent) {
        if (this.X2.c(4)) {
            boolean z10 = this.b2.N.i0;
        }
        return false;
    }

    public final TL_stars.SavedStarGift J1(boolean z10) {
        int I1 = I1();
        if (I1 < 0) {
            return null;
        }
        int i7 = (z10 ? 1 : -1) + I1;
        int i10 = this.Q2;
        if (i10 >= 0 && (!z10 ? i10 < I1 : i10 > I1)) {
            i7 = i10;
        }
        q8 q8Var = this.C2;
        Object obj = (q8Var == null || i7 < 0 || i7 >= q8Var.e()) ? null : this.C2.get(i7);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    public final void J2() {
        FrameLayout frameLayout = this.j2;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.l2;
        FrameLayout frameLayout3 = this.h2;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.X2.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.X2.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.X2.a(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    public final TL_stars.TL_starGiftUnique K1(boolean z10) {
        int I1 = I1();
        if (I1 < 0) {
            return null;
        }
        int i7 = (z10 ? 1 : -1) + I1;
        int i10 = this.Q2;
        if (i10 >= 0 && (!z10 ? i10 < I1 : i10 > I1)) {
            i7 = i10;
        }
        q8 q8Var = this.C2;
        Object obj = (q8Var == null || i7 < 0 || i7 >= q8Var.e()) ? null : this.C2.get(i7);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    public final void K2() {
        boolean N1 = N1(false);
        h4 h4Var = this.V1;
        h4Var.setPosition(N1 ? 1 : 0);
        h4Var.z(false);
        if (this.C2 == null || N1(true) || this.C2.e() >= this.C2.c()) {
            return;
        }
        this.C2.a();
    }

    public final void L2() {
        TL_stars.TL_starGiftUnique M1 = M1();
        TL_wallet.nftItem nftitem = this.b3;
        LinearLayout linearLayout = this.u2;
        if (nftitem == null || M1 == null) {
            linearLayout.setVisibility(8);
            return;
        }
        this.d2.setVisibility(8);
        this.f2.setVisibility(8);
        linearLayout.setVisibility(0);
        this.v2.a(M1.host_id != null, linearLayout.isAttachedToWindow());
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        l4 l4Var = new l4(this, 0);
        this.P2 = l4Var;
        return l4Var;
    }

    public final TL_stars.TL_starGiftUnique M1() {
        TL_stars.StarGift D1 = D1();
        if (D1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) D1;
        }
        return null;
    }

    public final TL_wallet.nftItem M2() {
        TL_wallet.nftItem nftitem = this.b3;
        if (nftitem != null) {
            return nftitem;
        }
        TL_stars.TL_starGiftUnique M1 = M1();
        if (!F2(M1)) {
            return null;
        }
        org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(this.a);
        if (M1 == null || TextUtils.isEmpty(M1.gift_address)) {
            return null;
        }
        ArrayList arrayList = D.B().b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) obj;
            if (org.telegram.ui.Wallet.u0.c(nftitem2.address, M1.gift_address)) {
                return nftitem2;
            }
        }
        TL_wallet.nftItem nftitem3 = new TL_wallet.nftItem();
        nftitem3.address = M1.gift_address;
        nftitem3.owner_address = D.y();
        nftitem3.index = "";
        nftitem3.name = M1.title + " #" + M1.num;
        nftitem3.gift = M1;
        return nftitem3;
    }

    public final boolean N1(boolean z10) {
        return (J1(z10) == null && K1(z10) == null) ? false : true;
    }

    @Override // org.telegram.ui.Components.sa
    public final int O0() {
        return org.telegram.messenger.g0.L(12.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, x2 x2Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift G1 = G1();
        if (G1 == null) {
            if (x2Var != null) {
                x2Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z10) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.w3;
            withdrawstargift.stargift = G1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = G1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftwithdrawalurl, new j3(this, x2Var, twoStepVerificationActivity, z10, 0));
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return this.R2;
    }

    public final boolean Q1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
            org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(this.a);
            String y10 = D.y();
            if (TextUtils.isEmpty(y10)) {
                TLRPC.Peer peer = tL_starGiftUnique.host_id;
                return peer != null && org.telegram.messenger.n5.o(peer) == j10.i(this.a).e();
            }
            if (org.telegram.ui.Wallet.u0.c(tL_starGiftUnique.owner_address, y10) || D.B().d(tL_starGiftUnique.gift_address)) {
                return true;
            }
        }
        return false;
    }

    public final boolean T1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (!com.google.android.gms.internal.vision.e2.s(tL_starGiftUnique) || !bi.y4.m(tL_starGiftUnique)) {
            return false;
        }
        if (tL_starGiftUnique.my_sale || this.b3 != null) {
            return true;
        }
        TLRPC.Peer peer = tL_starGiftUnique.host_id;
        if (peer == null || org.telegram.messenger.n5.o(peer) != j10.i(this.a).e()) {
            return !TextUtils.isEmpty(tL_starGiftUnique.owner_address) && org.telegram.ui.Wallet.u0.c(tL_starGiftUnique.owner_address, org.telegram.ui.Wallet.u0.D(this.a).y());
        }
        return true;
    }

    public final void V1() {
        TL_stars.TL_starGiftUnique M1 = M1();
        hi.e eVar = this.g2;
        if (eVar.R || M1 == null || P1(this.a, M1) || T1(M1)) {
            return;
        }
        boolean m10 = bi.y4.m(M1);
        long j3 = this.T1;
        if (m10) {
            if (this.F2 == null || !this.G2 || j3 == 0) {
                j3 = j10.i(this.a).e();
            }
            long j10 = j3;
            if (this.F2 == null || !this.G2 || j10 == j10.i(this.a).e()) {
                p1(M1, j10, null, true, null);
                return;
            }
            bi.k1 k1Var = new bi.k1(getContext(), this.J0, M1, j10);
            k1Var.F1 = new bg.f0(this, k1Var, M1, j10, 1);
            k1Var.show();
            return;
        }
        if (this.F2 == null || !this.G2 || j3 == 0) {
            j3 = j10.i(this.a).e();
        }
        long j11 = j3;
        cg.b bVar = M1.resale_ton_only ? cg.b.b : cg.b.a;
        if (this.F2 == null || !this.G2 || j11 == j10.i(this.a).e()) {
            eVar.setLoading(true);
            y8.x(this.a, bVar).H(M1, j11, null, true, new r1(this, null, bVar, M1, j11, null, true));
        } else {
            bi.k1 k1Var2 = new bi.k1(getContext(), this.J0, M1, j11);
            k1Var2.F1 = new t1(this, k1Var2, M1, j11, bVar, 1);
            k1Var2.show();
        }
    }

    public final void W1() {
        z3 z3Var = this.V2;
        if (z3Var != null && !z3Var.J) {
            z3Var.dismiss();
        }
        String H1 = H1();
        z3 z3Var2 = new z3(this, getContext(), H1, H1, this.J0);
        this.V2 = z3Var2;
        z3Var2.o2 = new ob.c(this, 16);
        z3Var2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).can_craft_at > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r4.can_craft_at > 0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X1() {
        TL_stars.TL_starGiftUnique M1;
        this.c2.setAlpha(this.X2.a(0));
        this.o2.setAlpha(this.X2.a(1));
        this.x2.setAlpha(this.X2.a(2));
        this.z2.setAlpha(this.X2.a(3));
        float a10 = 1.0f - this.X2.a(4);
        FrameLayout frameLayout = this.h2;
        frameLayout.setAlpha(a10);
        e5 e5Var = this.X2;
        z5 z5Var = this.b2;
        z5Var.d(e5Var);
        ImageView imageView = z5Var.R;
        if (this.X2.c(0) && (M1 = M1()) != null && !M1.crafted && S1(this.a, org.telegram.messenger.n5.o(M1.owner_id))) {
            fj fjVar = this.D2;
            if (fjVar != null) {
                TLRPC.Message message = fjVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.B2;
                if (savedStarGift != null) {
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    }
                }
            }
            imageView.setVisibility(r4);
            n4 n4Var = this.U1;
            float f10 = n4Var.f();
            this.a2.setAlpha(this.X2.a(0) * Utilities.l(org.telegram.messenger.g0.z1(f10 - r6.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f))));
            n4Var.h();
            n4Var.invalidate();
            frameLayout.setVisibility(this.X2.c(4) ? 8 : 0);
            J2();
        }
        int i7 = 8;
        imageView.setVisibility(i7);
        n4 n4Var2 = this.U1;
        float f102 = n4Var2.f();
        this.a2.setAlpha(this.X2.a(0) * Utilities.l(org.telegram.messenger.g0.z1(f102 - r6.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f))));
        n4Var2.h();
        n4Var2.invalidate();
        frameLayout.setVisibility(this.X2.c(4) ? 8 : 0);
        J2();
    }

    public final void Y1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        int i7;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            org.telegram.ui.Components.lc.c0("NULL_ERROR");
            return;
        }
        int i10 = 1;
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getPassword(), new l3(this, twoStepVerificationActivity, z10, i10), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
            }
            if (z10 && ("WALLET_CREATING".equals(tL_error.text) || "WALLET_UNAVAILABLE".equals(tL_error.text))) {
                bi.y4.q(getContext(), this.a, this.J0, null, tL_error.text, null);
                return;
            }
            String str = tL_error.text;
            if (str == null || !str.startsWith("FLOOD_WAIT")) {
                org.telegram.ui.Components.lc.e0(tL_error);
                return;
            } else {
                org.telegram.messenger.f3.o(null, 2131750670, org.telegram.ui.Components.lc.Y(), null);
                return;
            }
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.t0();
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String N0 = gd.N0(2131749883, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(getContext());
        int i11 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(textView, i11, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((gd.a0 ? 5 : 3) | 48);
        textView.setText(org.telegram.messenger.g0.W2(gd.N0(2131749887, null)));
        linearLayout.addView(textView, c8.ma.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(gd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), gd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView, i11, null, mode);
        TextView textView2 = new TextView(getContext());
        org.telegram.ui.ActionBar.t6.U(textView2, i11, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((gd.a0 ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.g0.W2(gd.N0(2131749886, null)));
        if (gd.a0) {
            linearLayout2.addView(textView2, c8.ma.o(-1, -2));
            linearLayout2.addView(imageView, c8.ma.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, c8.ma.o(-2, -2));
            linearLayout2.addView(textView2, c8.ma.o(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(gd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), gd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        org.telegram.ui.ActionBar.t6.s(imageView2, i11, null, mode);
        TextView textView3 = new TextView(getContext());
        org.telegram.ui.ActionBar.t6.U(textView3, i11, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((gd.a0 ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.g0.W2(gd.N0(2131749885, null)));
        if (gd.a0) {
            linearLayout3.addView(textView3, c8.ma.o(-1, -2));
            i7 = 5;
            linearLayout3.addView(imageView2, c8.ma.r(-2, -2, 5));
        } else {
            i7 = 5;
            linearLayout3.addView(imageView2, c8.ma.o(-2, -2));
            linearLayout3.addView(textView3, c8.ma.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(gd.N0(2131749882, null), new ci.v(this, 3));
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
        } else {
            TextView textView4 = new TextView(getContext());
            org.telegram.ui.ActionBar.t6.U(textView4, i11, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.f3.k(textView4, (gd.a0 ? i7 : 3) | 48, null, 2131749884);
            linearLayout.addView(textView4, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(gd.N0(2131747637, null), null);
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.showDialog(t1Var);
        } else {
            alertDialog$Builder.p();
        }
    }

    public final void Z1() {
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null) {
            return;
        }
        if (!bi.y4.u(M1)) {
            pb.j1(getContext(), this.a, M1, new t3(this, M1, 2), this.J0);
        } else if (t1()) {
            e2();
        } else {
            bi.y4.q(getContext(), this.a, this.J0, k(), "STARGIFT_ONCHAIN_SALE_DISABLED", Boolean.valueOf(M1.fixed_sale));
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final boolean a1() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a2() {
        int i7;
        CharSequence V;
        int i10;
        long j3;
        String str;
        String str2;
        String str3;
        long j10;
        String str4;
        TL_wallet.nftItem nftitem;
        String str5;
        org.telegram.ui.Wallet.v5 v5Var = this.c3;
        if (v5Var == null) {
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.g2) v5Var.c).currentAccount;
        if (!org.telegram.ui.Wallet.r8.F(i7, v5Var.a.slug)) {
            org.telegram.ui.Wallet.v5 v5Var2 = this.c3;
            org.telegram.ui.Wallet.r8 r8Var = v5Var2.c.k0;
            if (r8Var == null || (nftitem = v5Var2.b) == null || (str5 = nftitem.address) == null || !str5.equals(r8Var.Q0)) {
                Context context = getContext();
                int i11 = this.a;
                org.telegram.ui.Components.lc k10 = k();
                org.telegram.ui.ActionBar.h6 h6Var = this.J0;
                TL_stars.TL_starGiftUnique M1 = M1();
                ArrayList arrayList = new ArrayList(((org.telegram.messenger.o0) mp.u1(i11).A7.s0.b).c);
                if (arrayList.isEmpty()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                boolean z10 = 0;
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    String str6 = (String) arrayList.get(i12);
                    String str7 = "[^\\p{L}\\p{N}]";
                    String replaceAll = str6.replaceAll("[^\\p{L}\\p{N}]", "");
                    Locale locale = Locale.ROOT;
                    String lowerCase = replaceAll.toLowerCase(locale);
                    if (M1 == null || (str4 = M1.title) == null || !lowerCase.equals(str4.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(locale))) {
                        y8 y10 = y8.y(i11, z10);
                        y10.T();
                        ArrayList arrayList3 = y10.H;
                        int size2 = arrayList3.size();
                        ArrayList arrayList4 = arrayList3;
                        int i14 = z10;
                        while (i14 < size2) {
                            Object obj = arrayList4.get(i14);
                            int i15 = i14 + 1;
                            ArrayList arrayList5 = arrayList4;
                            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                            if (starGift != null) {
                                i10 = i11;
                                String str8 = starGift.title;
                                if (str8 != null) {
                                    str2 = str7;
                                    if (lowerCase.equals(str8.replaceAll(str7, "").toLowerCase(Locale.ROOT))) {
                                        str3 = starGift.title;
                                        j10 = starGift.id;
                                    }
                                } else {
                                    str2 = str7;
                                }
                            } else {
                                str2 = str7;
                                i10 = i11;
                            }
                            i11 = i10;
                            arrayList4 = arrayList5;
                            str7 = str2;
                            i14 = i15;
                        }
                        i10 = i11;
                        j3 = 0;
                        str = null;
                        if (str != null) {
                            str = str6.replaceAll("(?<=[a-z0-9])(?=[A-Z])", " ");
                        }
                        String str9 = str;
                        SpannableString spannableString = new SpannableString(str9);
                        i11 = i10;
                        spannableString.setSpan(new c4(new boolean[1], i11, context, h6Var, j3, str9, str6), 0, spannableString.length(), 33);
                        arrayList2.add(spannableString);
                        z10 = 0;
                        i12 = i13;
                    } else {
                        str3 = M1.title;
                        j10 = M1.gift_id;
                        i10 = i11;
                    }
                    str = str3;
                    j3 = j10;
                    if (str != null) {
                    }
                    String str92 = str;
                    SpannableString spannableString2 = new SpannableString(str92);
                    i11 = i10;
                    spannableString2.setSpan(new c4(new boolean[1], i11, context, h6Var, j3, str92, str6), 0, spannableString2.length(), 33);
                    arrayList2.add(spannableString2);
                    z10 = 0;
                    i12 = i13;
                }
                int i16 = z10;
                if (arrayList2.size() == 1) {
                    Object[] objArr = new Object[1];
                    objArr[i16] = arrayList2.get(i16);
                    V = gd.V(null, null, 2131742862, objArr);
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int i17 = 0;
                    for (int i18 = 1; i17 < arrayList2.size() - i18; i18 = 1) {
                        if (i17 > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        spannableStringBuilder.append((CharSequence) arrayList2.get(i17));
                        i17++;
                    }
                    V = gd.V(null, null, 2131742863, spannableStringBuilder, i5.c.h(1, arrayList2));
                }
                org.telegram.ui.Components.gc M = k10.M(context.getResources().getDrawable(R.drawable.filled_card_color_28).mutate(), V);
                org.telegram.ui.Components.lb lbVar = M.e;
                if (lbVar instanceof org.telegram.ui.Components.ob) {
                    TextView textView = ((org.telegram.ui.Components.ob) lbVar).b;
                    textView.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                    textView.setEllipsize(null);
                }
                M.j();
                return;
            }
        }
        org.telegram.ui.Wallet.v5 v5Var3 = this.c3;
        dismiss();
        Objects.requireNonNull(v5Var3);
        org.telegram.messenger.g0.h3(new ca.r(v5Var3, 16), 250L);
    }

    public final void b2() {
        if (j10.i(this.a).q() && (U1(this.a, M1()) || this.U2)) {
            I2(false);
            return;
        }
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null) {
            return;
        }
        TLRPC.Peer peer = M1.owner_id;
        if (peer == null) {
            peer = M1.host_id;
        }
        long o4 = org.telegram.messenger.n5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(M1.title);
        sb2.append(" #");
        this.y2.setText(gd.a0(null, null, 2131749816, i5.c.l(M1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131749818, null));
        if (!j10.i(this.a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.T2 == null) {
                this.T2 = new nq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.T2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        hi.e eVar = this.g2;
        eVar.i(spannableStringBuilder, true, true);
        eVar.g(null, true);
        eVar.setOnClickListener(new i1(this, 10));
        this.b2.setWearPreview(mp.u1(this.a).g2(o4));
        H2(2, true, null);
    }

    public final void c2(boolean z10) {
        int i7;
        fj fjVar = this.D2;
        int i10 = 0;
        if (fjVar != null) {
            TLRPC.Message message = fjVar.k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i7 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                i7 = savedStarGift.can_craft_at;
            }
            i7 = 0;
        }
        int i11 = 1;
        if (i7 > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
            String N0 = gd.N0(2131749760, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = gd.a0(null, null, 2131749761, gd.x(i7, true));
            org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(M1.gift_address) && !((org.telegram.messenger.h0) mp.u1(this.a).A7.x.b).c) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getContext(), this.J0);
            String N02 = gd.N0(2131749775, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            t1Var2.S = N02;
            t1Var2.U = gd.N0(2131749776, null);
            org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder2, null);
            return;
        }
        z5 z5Var = this.b2;
        if (z10) {
            z5Var.N.a(this.a, M1.gift_id, M1.getDocument(), M1.title);
            if (r1()) {
                b5 b5Var = z5Var.N;
                TL_stars.TL_starGiftUnique M12 = M1();
                if (M12 == null) {
                    b5Var.getClass();
                } else {
                    while (true) {
                        z4[] z4VarArr = b5Var.n;
                        if (i10 >= z4VarArr.length) {
                            break;
                        }
                        z4 z4Var = z4VarArr[i10];
                        TL_stars.StarGift starGift = z4Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            z4Var.a(M12, true);
                            break;
                        }
                        i10++;
                    }
                    b5Var.d(true);
                }
            }
        }
        b5 b5Var2 = z5Var.N;
        b5 b5Var3 = z5Var.N;
        b5Var2.setOnCraft(new q1(this, i11));
        if (this.S2 == null) {
            bi.i8 i8Var = new bi.i8(this.a, M1.gift_id);
            this.S2 = i8Var;
            i8Var.a();
        }
        b5Var3.setOnAddGift(new t3(this, M1, i11));
        b5Var3.setOnClose(new r3(this, 2));
        H2(4, true, null);
    }

    public final void d2(long j3) {
        int i7 = 0;
        if (j3 <= 0 || !o10.c(mp.u1(this.a).d2(j3))) {
            new bi.n3(getContext(), this.a, j3, null, new n1(this, i7)).show();
        } else {
            k().Q(R.raw.error, 36, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743499, org.telegram.messenger.n5.t(j3)))).k(false);
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.I3;
        z5 z5Var = this.b2;
        if (i7 != i11) {
            if (i7 == ks.d4) {
                z5Var.setInWallet(this.e3 == null && this.b3 == null && F2(M1()));
                return;
            }
            return;
        }
        if (this.C2 == ((p8) objArr[1])) {
            b5 b5Var = z5Var.N;
            if (b5Var == null || !b5Var.i0) {
                K2();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        if (this.X2.c(4) && this.b2.N.i0) {
            return;
        }
        bi.i8 i8Var = this.S2;
        if (i8Var != null) {
            i8Var.b();
            this.S2 = null;
        }
        o5 o5Var = this.L2;
        if (o5Var != null) {
            o5Var.a();
        }
        super.dismiss();
    }

    public final void e2() {
        TL_stars.TL_starGiftUnique M1 = M1();
        int i7 = 0;
        if (M1 == null || !M1.fixed_sale) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
            String N0 = gd.N0(2131750247, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = gd.N0(2131749649, null);
            alertDialog$Builder.k(gd.N0(2131750415, null), new g2(this, i7));
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
            alertDialog$Builder.p();
            return;
        }
        if (t1()) {
            bi.e5 e5Var = new bi.e5(this.a, getContext(), new y1(this, r5, M1, 1), this.J0);
            bi.e5[] e5VarArr = {e5Var};
            cg.b bVar = cg.b.b;
            long j3 = M1.getResellAmount(bVar).b;
            e5Var.v1 = true;
            e5Var.w1 = j3;
            e5Var.s1.setText(gd.N0(2131750247, null));
            if (j3 > 0) {
                String b10 = cg.a.j(j3, bVar).b();
                EditTextBoldCursor editTextBoldCursor = e5Var.o1;
                InputFilter[] filters = editTextBoldCursor.getFilters();
                editTextBoldCursor.setFilters(new InputFilter[0]);
                e5Var.x1 = true;
                editTextBoldCursor.setText(b10);
                e5Var.x1 = false;
                editTextBoldCursor.setFilters(filters);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            e5Var.J0(e5Var.t1);
            e5VarArr[0].show();
        }
    }

    public final void f2() {
        TL_stars.TL_starGiftUnique M1 = M1();
        if (t1()) {
            bi.e5[] e5VarArr = new bi.e5[1];
            e5VarArr[0] = new bi.e5(this.a, getContext(), new y1(this, e5VarArr, M1, 0), this.J0);
            org.telegram.messenger.p0 p0Var = mp.u1(this.a).A7;
            bi.e5 e5Var = e5VarArr[0];
            boolean z10 = (M1 == null || !M1.onchain_sale) ? ((org.telegram.messenger.h0) p0Var.u.b).c : M1.fixed_sale;
            e5Var.y1 = z10;
            if (!e5Var.v1) {
                e5Var.s1.setText(gd.N0(z10 ? 2131749528 : 2131749515, null));
            }
            e5Var.J0(e5Var.t1);
            e5VarArr[0].show();
        }
    }

    public final void g2() {
        TL_stars.TL_starGiftUnique M1 = M1();
        if (t1()) {
            Context context = getContext();
            int i7 = this.a;
            org.telegram.ui.ActionBar.h6 h6Var = this.J0;
            hi.e eVar = this.g2;
            Objects.requireNonNull(eVar);
            ai.h0 h0Var = new ai.h0(eVar, 3);
            org.telegram.ui.Components.lc k10 = k();
            k1 k1Var = new k1(this, 9);
            if (M1 == null || TextUtils.isEmpty(M1.slug)) {
                return;
            }
            TL_stars.cancelStarGiftOnchainSale cancelstargiftonchainsale = new TL_stars.cancelStarGiftOnchainSale();
            cancelstargiftonchainsale.slug = M1.slug;
            bi.y4.o(context, i7, cancelstargiftonchainsale, Boolean.valueOf(M1.fixed_sale), h6Var, h0Var, k10, new bi.x3(M1, context, i7, h6Var, bi.y4.h(M1), k1Var));
        }
    }

    public final void h2(long j3) {
        hi.l3 l3Var = this.x3;
        if (l3Var != null) {
            l3Var.f(true);
            this.x3 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T == null || o10.B(j3)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
            if (j3 == j10.i(this.a).e()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putBoolean("open_gifts", true);
        T.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void i2(boolean z10, vf.b bVar, Runnable runnable) {
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        int i7 = z10 ? 3 : 2;
        ab.j jVar = new ab.j(this, twoStepVerificationActivity, z10, 1);
        twoStepVerificationActivity.a0 = i7;
        twoStepVerificationActivity.c0 = jVar;
        twoStepVerificationActivity.b0 = E1();
        twoStepVerificationActivity.x0(new aa.r(this, runnable, bVar, twoStepVerificationActivity, 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j2() {
        int i7;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i10;
        int i11;
        TLRPC.Message message2;
        TLRPC.Message message3;
        hi.l3 l3Var = this.x3;
        if (l3Var != null) {
            l3Var.f(true);
            this.x3 = null;
        }
        if (E2()) {
            return;
        }
        fj fjVar = this.D2;
        if (fjVar != null && (message3 = fjVar.k) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i7 <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                    Context context = getContext();
                    fj fjVar2 = this.D2;
                    if (fjVar2 != null && (message2 = fjVar2.k) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i11 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            D2(i11 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.B2;
                    i11 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    D2(i11 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                    return;
                }
                TL_stars.SavedStarGift savedStarGift2 = this.B2;
                if (savedStarGift2 != null) {
                    TL_stars.StarGift starGift = savedStarGift2.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        i10 = savedStarGift2.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                        int max = currentTime <= i10 ? 0 : Math.max(1, Math.round(Math.max(0, i10 - currentTime) / 86400.0f));
                        bi.c2 c2Var = new bi.c2();
                        c2Var.d = gd.N0(2131749897, null);
                        c2Var.c = true;
                        c2Var.a = max;
                        c2Var.e = new y3(this, currentTime, i10, max, r8, tL_starGiftUnique2);
                        Context context2 = getContext();
                        int i12 = this.a;
                        bi.e2 e2Var = new bi.e2(context2, i12, false, org.telegram.messenger.v1.a(i12).b(), null, c2Var, this.J0);
                        bi.e2[] e2VarArr = {e2Var};
                        e2Var.show();
                        return;
                    }
                }
                fj fjVar3 = this.D2;
                if (fjVar3 == null || (message = fjVar3.k) == null) {
                    return;
                }
                TLRPC.MessageAction messageAction3 = message.action;
                if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                    TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                        i10 = tL_messageActionStarGiftUnique.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique22 = tL_starGiftUnique;
                        int currentTime2 = ConnectionsManager.getInstance(this.a).getCurrentTime();
                        if (currentTime2 <= i10) {
                        }
                        bi.c2 c2Var2 = new bi.c2();
                        c2Var2.d = gd.N0(2131749897, null);
                        c2Var2.c = true;
                        c2Var2.a = max;
                        c2Var2.e = new y3(this, currentTime2, i10, max, e2VarArr, tL_starGiftUnique22);
                        Context context22 = getContext();
                        int i122 = this.a;
                        bi.e2 e2Var2 = new bi.e2(context22, i122, false, org.telegram.messenger.v1.a(i122).b(), null, c2Var2, this.J0);
                        bi.e2[] e2VarArr2 = {e2Var2};
                        e2Var2.show();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift3 = this.B2;
        i7 = savedStarGift3 != null ? savedStarGift3.can_transfer_at : 0;
        if (i7 <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, org.telegram.ui.ActionBar.c2
    public org.telegram.ui.Components.lc k() {
        return new org.telegram.ui.Components.lc(this.l2, this.J0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k2(long j3, long j10, SpannableStringBuilder spannableStringBuilder, boolean z10, x10 x10Var) {
        String str;
        TLRPC.Chat chat;
        SpannableStringBuilder W2;
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null) {
            return;
        }
        if (j3 >= 0) {
            TLRPC.User c22 = mp.u1(this.a).c2(Long.valueOf(j3));
            str = o10.l(c22);
            chat = c22;
        } else {
            TLRPC.Chat O0 = mp.u1(this.a).O0(Long.valueOf(-j3));
            if (O0 == null) {
                str = "";
                chat = O0;
            } else {
                str = O0.title;
                chat = O0;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new d5(getContext(), M1, chat), c8.ma.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, this.J0);
        textView.setTextSize(1, 16.0f);
        if (spannableStringBuilder != null) {
            W2 = spannableStringBuilder;
        } else {
            W2 = org.telegram.messenger.g0.W2(j10 > 0 ? gd.K("Gift2TransferPriceText", (int) j10, ',', E1(), org.telegram.messenger.n5.t(j3)) : gd.a0(null, null, 2131749896, E1(), str));
        }
        textView.setText(W2);
        linearLayout.addView(textView, c8.ma.t(-1, -2, 48, 24, 4, 24, 4));
        ey0 ey0Var = new ey0(getContext(), this.J0);
        m1(ey0Var, y8.l(M1.attributes, TL_stars.starGiftAttributeModel.class));
        m1(ey0Var, y8.l(M1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        m1(ey0Var, y8.l(M1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(M1.slug) && (M1.flags & 256) != 0) {
            org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
            long j11 = M1.value_amount;
            String str2 = M1.value_currency;
            int h = org.telegram.messenger.r1.i().h(M1.value_currency);
            i7.getClass();
            ey0Var.e(gd.N0(2131749415, null), p5.c.k("~", org.telegram.messenger.r1.g(str2, h, j11, true)), null, null);
        }
        linearLayout.addView(ey0Var, c8.ma.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(j10 > 0 ? pb.T0(gd.a0(null, null, 2131749903, Integer.valueOf((int) j10))) : gd.N0(2131749904, null), new a1.c(x10Var, 25));
        alertDialog$Builder.h(gd.N0(2131752577, null), null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.Y0 = z10;
        t1Var.show();
    }

    public final void l1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String N0;
        char c10;
        o5 o5Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        f6 f6Var;
        ai.r rVar;
        int i7 = 0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            N0 = gd.N0(2131750370, null);
            c10 = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            N0 = gd.N0(2131750363, null);
            c10 = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            N0 = gd.N0(2131750371, null);
            c10 = 0;
        }
        if (!this.M2 && ((o5Var = this.L2) == null || !o5Var.o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.nc[] ncVarArr = new org.telegram.ui.Components.nc[1];
            Integer[] numArr = new Integer[1];
            String L1 = L1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                f6Var = this;
                rVar = new ai.r(this, zArr, starGiftAttribute2, ncVarArr, 9);
            } else {
                starGiftAttribute2 = starGiftAttribute;
                f6Var = this;
                rVar = null;
            }
            ncVarArr[0] = (org.telegram.ui.Components.nc) ((by0) f6Var.e2.d(N0, starGiftAttribute2.name, L1, rVar, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        t5 t5Var = new t5(getContext(), this.J0, new q1(this, i7));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        ey0 ey0Var = this.e2;
        tableRow.addView(new dy0(ey0Var, N0), layoutParams);
        tableRow.addView(new by0(ey0Var, t5Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        ey0Var.addView(tableRow);
        o5 o5Var2 = this.L2;
        if (o5Var2 != null) {
            if (c10 == 0) {
                o5Var2.d = t5Var;
            }
            if (c10 == 1) {
                o5Var2.c = t5Var;
            }
            if (c10 == 2) {
                o5Var2.b = t5Var;
            }
        }
    }

    public final void l2(long j3, x10 x10Var) {
        TLRPC.Message message;
        long j10;
        TL_stars.SavedStarGift savedStarGift = this.B2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            fj fjVar = this.D2;
            if (fjVar == null || (message = fjVar.k) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            } else {
                j10 = tL_messageActionStarGiftUnique.transfer_stars;
            }
        } else {
            j10 = savedStarGift.transfer_stars;
        }
        k2(j3, j10, null, true, x10Var);
    }

    public final void m2() {
        TL_stars.InputSavedStarGift G1;
        long j3;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        hi.l3 l3Var = this.x3;
        if (l3Var != null) {
            l3Var.f(true);
            this.x3 = null;
        }
        if (this.Y2 == null && (G1 = G1()) != null) {
            fj fjVar = this.D2;
            long j12 = this.T1;
            if (fjVar != null) {
                TLRPC.MessageAction messageAction = fjVar.k.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                j10 = tL_messageActionStarGift.gift.id;
                j11 = tL_messageActionStarGift.upgrade_stars;
                z10 = tL_messageActionStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                z11 = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
                j3 = 0;
                z12 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                z13 = tL_messageActionStarGift.prepaid_upgrade ? org.telegram.messenger.n5.o(tL_messageActionStarGift.from_id) != this.D2.Z0() : tL_messageActionStarGift.upgrade_separate;
            } else {
                j3 = 0;
                TL_stars.SavedStarGift savedStarGift = this.B2;
                if (savedStarGift == null) {
                    return;
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                j10 = starGift.id;
                j11 = savedStarGift.upgrade_stars;
                z10 = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                z11 = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
                z12 = j12 < 0;
                TL_stars.SavedStarGift savedStarGift2 = this.B2;
                str = savedStarGift2.prepaid_upgrade_hash;
                z13 = savedStarGift2.upgrade_separate;
            }
            TextView textView = this.t2;
            if (z10) {
                textView.setText(gd.N0(z12 ? 2131750381 : 2131750382, null));
            } else if (z11) {
                textView.setText(gd.N0(2131750379, null));
            } else {
                textView.setText(gd.N0(2131750380, null));
            }
            boolean z14 = (z10 || j11 <= j3 || z13) ? false : true;
            op opVar = this.s2;
            opVar.a(z14, false);
            ArrayList arrayList = this.n3;
            if (arrayList != null && (j11 > j3 || this.r3 != null)) {
                n2();
                return;
            }
            if (arrayList == null) {
                y8.y(this.a, false).K(j10, new n1(this, 2));
            }
            if (j11 > j3 || this.r3 != null) {
                return;
            }
            this.q3 = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = opVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = G1;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = mp.u1(this.a).l1(j12);
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            JSONObject u10 = ki.s2.u(this.J0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new w3(this, 0));
        }
    }

    public final void n1(LinearLayout linearLayout, int i7, int i10, int i11, String str, boolean z10) {
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i7);
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView, i11, h6Var, mode);
        linearLayout.addView(imageView, c8.ma.t(i10, i10, 16, i10 < 15 ? 1 : 0, 0, i10 < 15 ? 1 : 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i12 = org.telegram.ui.ActionBar.m6.r5;
        org.telegram.ui.ActionBar.t6.U(textView, i12, this.J0);
        textView.setText(str);
        linearLayout.addView(textView, c8.ma.t(-2, -2, 16, 4, 0, 0, 0));
        if (z10) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.msg_mini_topicarrow);
            org.telegram.ui.ActionBar.t6.s(imageView2, i12, this.J0, mode);
            linearLayout.addView(imageView2, c8.ma.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0034, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.prepaid_upgrade_hash) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n2() {
        long j3;
        boolean z10;
        boolean z11;
        char c10;
        int i7;
        int i10;
        String N0;
        String N02;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        fj fjVar = this.D2;
        if (fjVar != null) {
            TLRPC.MessageAction messageAction = fjVar.k.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j3 = tL_messageActionStarGift.upgrade_stars;
            if (j3 <= 0) {
            }
            z10 = false;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift == null) {
                return;
            }
            j3 = savedStarGift.upgrade_stars;
            if (j3 <= 0) {
            }
            z10 = false;
        }
        if (this.n3 != null) {
            if (j3 > 0 || this.r3 != null) {
                long j10 = 0;
                if (this.r3 != null) {
                    for (int i11 = 0; i11 < this.r3.invoice.prices.size(); i11++) {
                        j10 += this.r3.invoice.prices.get(i11).amount;
                    }
                }
                o5 o5Var = this.L2;
                z5 z5Var = this.b2;
                if (o5Var == null) {
                    this.L2 = new o5(z5Var);
                }
                o5 o5Var2 = this.L2;
                ArrayList arrayList = this.n3;
                z5 z5Var2 = o5Var2.a;
                ArrayList arrayList2 = o5Var2.g;
                ArrayList arrayList3 = o5Var2.f;
                ArrayList arrayList4 = o5Var2.e;
                int size = arrayList4.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList4.get(i12);
                    i12++;
                    ((m5) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList m10 = y8.m(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = m10.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = m10.get(i13);
                    i13++;
                    m5 m5Var = new m5(z5Var2.c, (TL_stars.starGiftAttributeModel) obj2);
                    if (z5Var2.isAttachedToWindow() && m5Var.c) {
                        m5Var.d.P();
                    }
                    arrayList4.add(m5Var);
                }
                ArrayList m11 = y8.m(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = m11.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = m11.get(i14);
                    i14++;
                    arrayList3.add(new l5((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList m12 = y8.m(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = m12.size();
                int i15 = 0;
                while (i15 < size4) {
                    Object obj4 = m12.get(i15);
                    i15++;
                    arrayList2.add(new n5((TL_stars.starGiftAttributePattern) obj4));
                }
                z5Var.setPreviewingAttributes(this.n3);
                long j11 = this.T1;
                if (z10) {
                    z11 = true;
                    z5Var.i(1, gd.N0(2131750045, null), gd.a0(null, null, 2131750046, org.telegram.messenger.n5.s(this.a, j11)), null);
                } else {
                    z11 = true;
                    z5Var.i(1, gd.N0(2131749834, null), gd.N0(2131749835, null), null);
                }
                hi.e eVar = this.g2;
                eVar.setFilled(z11);
                eVar.g(null, z11);
                if (j10 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                    if (this.p3 != null) {
                        for (int i16 = 0; i16 < this.p3.size(); i16++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) this.p3.get(i16);
                            if (starGiftUpgradePrice.date >= currentTime) {
                                break;
                            }
                        }
                    }
                    starGiftUpgradePrice = null;
                    ArrayList arrayList5 = this.o3;
                    FrameLayout frameLayout = this.j2;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.i2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2("**" + gd.N0(2131749853, null) + "**", new k1(this, 5)), false, org.telegram.messenger.g0.L(0.6666667f), org.telegram.messenger.g0.L(0.66f)));
                    }
                    J2();
                    nq[] nqVarArr = this.s3;
                    if (z10) {
                        eVar.i(pb.U0(gd.a0(null, null, 2131750050, Long.valueOf(j10)), 1.13f, nqVarArr), true, true);
                    } else {
                        eVar.i(pb.U0(gd.a0(null, null, 2131749860, Long.valueOf(j10)), 1.13f, nqVarArr), true, true);
                    }
                } else {
                    eVar.i(gd.N0(2131751805, null), true, true);
                }
                eVar.setOnClickListener(new i1(this, 13));
                View view = this.q2;
                LinearLayout linearLayout = this.r2;
                if (z10) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    c10 = 0;
                } else {
                    c10 = 0;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                }
                ki.i[] iVarArr = this.p2;
                if (z10) {
                    ki.i iVar = iVarArr[c10];
                    String N03 = gd.N0(2131749848, null);
                    if (z10) {
                        char c11 = c10;
                        i10 = 1;
                        i7 = 2;
                        Object[] objArr = new Object[1];
                        objArr[c11] = org.telegram.messenger.n5.s(this.a, j11);
                        N0 = gd.a0(null, null, 2131750049, objArr);
                    } else {
                        i10 = 1;
                        i7 = 2;
                        N0 = gd.N0(2131749850, null);
                    }
                    iVar.a(R.drawable.menu_feature_unique, N03, N0);
                    ki.i iVar2 = iVarArr[i10];
                    String N04 = gd.N0(2131749845, null);
                    if (z10) {
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = org.telegram.messenger.n5.s(this.a, j11);
                        N02 = gd.a0(null, null, 2131750048, objArr2);
                    } else {
                        N02 = gd.N0(2131749847, null);
                    }
                    iVar2.a(R.drawable.menu_feature_transfer, N04, N02);
                    iVarArr[i7].a(R.drawable.menu_feature_tradable, gd.N0(2131749842, null), z10 ? gd.a0(null, null, 2131750047, org.telegram.messenger.n5.s(this.a, j11)) : gd.N0(2131749844, null));
                } else {
                    i7 = 2;
                    iVarArr[c10].a(R.drawable.menu_feature_unique, gd.N0(2131749848, null), gd.N0(2131749399, null));
                    iVarArr[1].a(R.drawable.menu_feature_tradable, gd.N0(2131749842, null), gd.N0(2131749397, null));
                    iVarArr[2].a(R.drawable.menu_wear, gd.N0(2131749394, null), gd.N0(2131749395, null));
                }
                org.telegram.messenger.g0.g3(new m1(this, j10, i7));
            }
        }
    }

    public final void o1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            y8.y(this.a, false).O(C1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i7 = 0; i7 < updates.updates.size(); i7++) {
                    TLRPC.Update update2 = updates.updates.get(i7);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message == null) {
            y8.y(this.a, false).O(C1());
            dismiss();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.B2;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.M2 = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.B2;
                savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                int i10 = savedStarGift2.flags | 8;
                savedStarGift2.msg_id = message.id;
                savedStarGift2.flags = i10 & (-2049);
                savedStarGift2.saved_id = 0L;
                savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                savedStarGift2.can_upgrade = false;
                savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                w2(savedStarGift2, this.C2);
                this.n3 = null;
                this.M2 = false;
                q8 q8Var = this.C2;
                if (q8Var != null) {
                    q8Var.d();
                } else {
                    y8.y(this.a, false).O(this.T1);
                }
                org.telegram.messenger.g0.g3(runnable);
                return;
            }
        }
        if (this.C2 == null) {
            y8.y(this.a, false).O(C1());
        }
        this.M2 = true;
        this.B2 = null;
        this.A2 = false;
        fj fjVar = new fj(this.a, message, false, false);
        fjVar.L5();
        v2(fjVar, this.C2);
        this.n3 = null;
        this.M2 = false;
        org.telegram.messenger.g0.g3(runnable);
    }

    public final void o2() {
        TL_stars.TL_starGiftUnique M1 = M1();
        if (E2() || M2() == null || M1 == null || TextUtils.isEmpty(M1.slug)) {
            return;
        }
        bi.c2 c2Var = new bi.c2();
        c2Var.d = gd.N0(2131749897, null);
        c2Var.b = true;
        c2Var.e = new ai.x1(10, this, r1);
        Context context = getContext();
        int i7 = this.a;
        bi.e2 e2Var = new bi.e2(context, i7, false, org.telegram.messenger.v1.a(i7).b(), null, c2Var, this.J0);
        bi.e2[] e2VarArr = {e2Var};
        e2Var.show();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.a).c(this, ks.I3);
        ks.f(this.a).c(this, ks.d4);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        z5 z5Var;
        b5 b5Var;
        if (this.X2.c(4) && (z5Var = this.b2) != null && (b5Var = z5Var.N) != null) {
            if (b5Var.i0) {
                return;
            }
            if (b5Var.j0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.w2 || this.X2.c <= 0 || this.g2.R || this.m3) {
            super.onBackPressed();
            return;
        }
        fj fjVar = this.D2;
        if (fjVar != null) {
            v2(fjVar, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                w2(savedStarGift, this.C2);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
                if (tL_starGiftUnique != null) {
                    u2(this.E2, tL_starGiftUnique, this.C2);
                }
            }
        }
        H2(0, true, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.a).n(this, ks.I3);
        ks.f(this.a).n(this, ks.d4);
    }

    public final void p1(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, bi.k1 k1Var) {
        org.telegram.ui.Components.lc k10;
        q8 q8Var = this.C2;
        if (k1Var != null) {
            org.telegram.ui.ActionBar.m2 m2Var = k1Var.c;
            org.telegram.messenger.g0.v1(m2Var.findFocus());
            k10 = new org.telegram.ui.Components.lc(m2Var, this.J0);
        } else {
            k10 = k();
        }
        bi.y4.d(getContext(), this.a, tL_starGiftUnique, j3, tL_textWithEntities, !z10, this.J0, new ai.x1(8, this, k1Var), k10, new c1.a(29, this, k1Var), new f2(0, q8Var, tL_starGiftUnique));
    }

    public final boolean q1() {
        TLRPC.Peer peer;
        if (G1() == null) {
            return false;
        }
        fj fjVar = this.D2;
        if (fjVar != null) {
            TLRPC.MessageAction messageAction = fjVar.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!fjVar.P3() || ((fj.B0(this.D2.k) > j10.i(this.a).e() ? 1 : (fj.B0(this.D2.k) == j10.i(this.a).e() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && S1(this.a, org.telegram.messenger.n5.o(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && mp.u1(this.a).H6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.D2.k.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                int currentTime = mp.u1(this.a).H6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                int i7 = this.a;
                long j3 = this.T1;
                if (S1(i7, j3)) {
                    int i10 = this.B2.flags;
                    if (((j3 < 0 ? 2048 : 8) & i10) != 0 && (i10 & 16) != 0 && (i10 & 2) != 0 && currentTime > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final SpannableStringBuilder q2(TLRPC.Peer peer) {
        if (peer != null) {
            String r10 = org.telegram.messenger.n5.r(mp.u1(this.a).g2(org.telegram.messenger.n5.o(peer)));
            if (!TextUtils.isEmpty(r10)) {
                return org.telegram.messenger.g0.T2(gd.a0(null, null, 2131750026, p5.c.k("@", r10)), new h3(this, r10, 8));
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void r0() {
        hi.l3 l3Var = this.x3;
        if (l3Var != null) {
            l3Var.f(true);
            this.x3 = null;
        }
    }

    public final boolean r1() {
        int i7;
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null || M1.crafted || bi.y4.m(M1) || !S1(this.a, org.telegram.messenger.n5.o(M1.owner_id))) {
            return false;
        }
        fj fjVar = this.D2;
        if (fjVar == null) {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i7 = savedStarGift.can_craft_at;
            }
        }
        TLRPC.Message message = fjVar.k;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return false;
        }
        i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        return i7 > 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= i7;
    }

    public final SpannableStringBuilder r2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return q2(starGift.released_by);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            Q(org.telegram.ui.ActionBar.m6.h5);
            z5 z5Var = this.b2;
            if (z5Var != null) {
                z5Var.l();
            }
            nq nqVar = this.Z2;
            if (nqVar != null) {
                Drawable drawable = nqVar.c;
                if (drawable instanceof a6) {
                    ((a6) drawable).d.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.J0));
                    hi.e eVar = this.g2;
                    if (eVar != null) {
                        eVar.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s1() {
        if (this.b3 == null && G1() != null) {
            fj fjVar = this.D2;
            if (fjVar != null) {
                TLRPC.Message message = fjVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TL_stars.StarGift starGift = tL_messageActionStarGift.gift;
                        if ((starGift instanceof TL_stars.TL_starGift) && !starGift.limited && starGift.availability_total <= 0 && !starGift.auction && !tL_messageActionStarGift.converted && !tL_messageActionStarGift.upgraded && !tL_messageActionStarGift.refunded && tL_messageActionStarGift.convert_stars > 0) {
                            boolean P3 = fjVar.P3();
                            boolean z10 = fj.B0(this.D2.k) == j10.i(this.a).e();
                            TLRPC.Peer peer = tL_messageActionStarGift.peer;
                            if (peer != null) {
                                return S1(this.a, org.telegram.messenger.n5.o(peer));
                            }
                            if (!P3 || z10) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.B2;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (!(starGift2 instanceof TL_stars.TL_starGift) || starGift2.limited || starGift2.availability_total > 0 || starGift2.auction || savedStarGift.refunded || !S1(this.a, this.T1)) {
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        fj fjVar;
        TLRPC.Message message;
        String str;
        if (mp.u1(this.a).A2()) {
            org.telegram.ui.b.b(this.a);
            return;
        }
        TL_wallet.nftItem nftitem = this.b3;
        if (nftitem != null && (str = this.E2) != null && this.F2 != null) {
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = str;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift, new bi.q1(this, nftitem, str, 4));
        }
        if (this.E2 != null && this.F2 == null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
            t1Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift2 = new TL_stars.getUniqueStarGift();
            getuniquestargift2.slug = this.E2;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift2, new bi.o1(5, this, t1Var));
        } else if (this.B2 == null && (fjVar = this.D2) != null && (message = fjVar.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
                        t1Var2.r(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new bi.q1(this, tL_messageActionStarGift, t1Var2, 2));
                        return;
                    }
                    if (G1() != null) {
                        org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
                        t1Var3.r(500L);
                        y8.y(this.a, false).L(G1(), new ai.x1(7, this, t1Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final boolean t1() {
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null || TextUtils.isEmpty(M1.slug)) {
            return false;
        }
        if (this.b3 == null && !T1(M1) && !Q1(M1) && (!bi.y4.u(M1) || !R1(this.a, org.telegram.messenger.n5.o(M1.owner_id)))) {
            return false;
        }
        org.telegram.messenger.p0 p0Var = mp.u1(this.a).A7;
        if (((org.telegram.messenger.h0) p0Var.p0.b).c) {
            return ((org.telegram.messenger.h0) p0Var.t.b).c || ((org.telegram.messenger.h0) p0Var.u.b).c || T1(M1);
        }
        return false;
    }

    public final void u1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String N0 = gd.N0(2131750249, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = gd.N0(2131750250, null);
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 != null && !TextUtils.isEmpty(M1.slug)) {
            alertDialog$Builder.k(gd.N0(2131747611, null), new s3(this, M1, 1));
        }
        i5.c.y(null, 2131752577, alertDialog$Builder, null);
    }

    public final void u2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, q8 q8Var) {
        o5 o5Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.E2 = str;
        this.F2 = tL_starGiftUnique;
        this.C2 = q8Var;
        this.G2 = (this.e3 != null || tL_starGiftUnique.resell_amount == null || R1(this.a, org.telegram.messenger.n5.o(tL_starGiftUnique.owner_id)) || P1(this.a, tL_starGiftUnique) || T1(tL_starGiftUnique)) ? false : true;
        if (!this.M2 && (o5Var = this.L2) != null && o5Var.o && (tL_starGiftUnique2 = o5Var.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            o5Var.a();
            this.L2 = null;
            z5 z5Var = this.b2;
            z5Var.b.setAlpha(1.0f);
            z5Var.c.setAlpha(0.0f);
        }
        this.a2.b(this.a, this.B2);
        x2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z10 = tL_starGiftUnique.host_id != null;
        TL_wallet.walletTransaction wallettransaction = this.e3;
        m80 m80Var = this.d2;
        if (wallettransaction != null || !z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            m80Var.setVisibility(8);
        } else {
            m80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750164, null), new h3(this, str3, 3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            m80Var.setVisibility(0);
            org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.q5, this.J0);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.e3;
        m80 m80Var2 = this.f2;
        if (wallettransaction2 != null || z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            m80Var2.setVisibility(8);
        } else {
            m80Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750164, null), new h3(this, str3, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            m80Var2.setVisibility(0);
        }
        L2();
        if (this.G2) {
            y2(tL_starGiftUnique);
            this.g2.setOnClickListener(new i1(this, 18));
        }
        if (this.a3) {
            H2(0, false, null);
            this.n1.n0(1);
            this.a3 = false;
        }
        K2();
    }

    public final void v1(long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload, long j10, vf.b bVar, bi.e2 e2Var) {
        TL_wallet.nftItem M2 = M2();
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M2 == null || M1 == null || TextUtils.isEmpty(M1.slug)) {
            return;
        }
        boolean z10 = this.b3 != null;
        String E1 = E1();
        bVar.d();
        w2 w2Var = new w2(this, j10, bVar, j3, M1, M2, e2Var, z10, E1);
        if (stargiftdepositpayload != null) {
            w2Var.a(stargiftdepositpayload);
            return;
        }
        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
        depositstargift.peer = mp.u1(this.a).l1(j3);
        depositstargift.slug = M1.slug;
        ConnectionsManager.getInstance(this.a).sendRequestTyped(depositstargift, new d3.b(1), new e2(this, bVar, e2Var, w2Var, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:322:0x0369, code lost:
    
        if (S1(r58.a, org.telegram.messenger.n5.o(r8)) != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x037c, code lost:
    
        if (r44 > 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x03bf, code lost:
    
        if (r36 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x03c1, code lost:
    
        if (r46 == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x03c5, code lost:
    
        if (r26 <= 0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03c7, code lost:
    
        r14 = null;
        r7 = org.telegram.messenger.gd.a0(null, null, 2131750148, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x03d8, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x03dc, code lost:
    
        if (r29 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x03de, code lost:
    
        if (r24 != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x03e0, code lost:
    
        r7 = org.telegram.messenger.gd.a0(null, null, 2131750126, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x03ed, code lost:
    
        if (r24 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x03ef, code lost:
    
        r7 = "Gift2InfoOutConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x03f4, code lost:
    
        r7 = org.telegram.messenger.gd.K(r7, (int) r9, ',', r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0402, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x03f2, code lost:
    
        r7 = "Gift2InfoOut";
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0404, code lost:
    
        if (r24 == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0406, code lost:
    
        if (r38 == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0408, code lost:
    
        r7 = "Gift2InfoChannelConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0415, code lost:
    
        r7 = org.telegram.messenger.gd.H(',', r7, (int) r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x040b, code lost:
    
        r7 = "Gift2InfoConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x040e, code lost:
    
        if (r38 == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0410, code lost:
    
        r7 = "Gift2Info3Channel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0413, code lost:
    
        r7 = "Gift2Info3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x03bd, code lost:
    
        if (r8 > 0) goto L188;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x043f  */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30, types: [org.telegram.ui.Components.dy0[], org.telegram.ui.Components.nc[], org.telegram.ui.Components.nq[]] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v2(fj fjVar, q8 q8Var) {
        long j3;
        TLRPC.Peer peer;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.Peer peer2;
        long j10;
        long j11;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i7;
        boolean z12;
        boolean z13;
        boolean z14;
        TLRPC.Peer peer3;
        boolean z15;
        String str;
        boolean z16;
        boolean z17;
        String N0;
        hi.e eVar;
        boolean z18;
        String str2;
        String str3;
        char c10;
        CharSequence charSequence;
        int i10;
        CharSequence concat;
        int i11;
        ey0 ey0Var;
        hi.e eVar2;
        boolean z19;
        String str4;
        int i12;
        boolean z20;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        boolean z21;
        boolean z22;
        int i13;
        CharSequence charSequence2;
        String N02;
        ?? r14;
        CharSequence charSequence3;
        String str5;
        String N03;
        CharSequence W2;
        CharSequence charSequence4;
        o5 o5Var;
        String N04;
        boolean z23;
        TLObject g22;
        boolean z24;
        o5 o5Var2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.InputSavedStarGift G1;
        if (fjVar == null || fjVar.k == null) {
            return;
        }
        this.A2 = false;
        this.B2 = null;
        this.D2 = fjVar;
        this.C2 = q8Var;
        this.a2.set(fjVar);
        long e10 = j10.i(this.a).e();
        boolean z25 = fj.B0(fjVar.k) == e10;
        TLRPC.MessageAction messageAction = fjVar.k.action;
        boolean z26 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        int i14 = 3;
        z5 z5Var = this.b2;
        hi.e eVar3 = this.g2;
        if (z26 || (((z23 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
            if (!this.M2 && (o5Var = this.L2) != null && o5Var.o && o5Var.l != null) {
                o5Var.a();
                this.L2 = null;
                z5Var.b.setVisibility(0);
                z5Var.c.setVisibility(4);
            }
            boolean P3 = z25 ? false : fjVar.P3();
            TLRPC.Message message = fjVar.k;
            int i15 = message.date;
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                boolean z27 = tL_messageActionStarGift.converted;
                boolean z28 = tL_messageActionStarGift.saved;
                boolean z29 = tL_messageActionStarGift.refunded;
                boolean z30 = tL_messageActionStarGift.name_hidden;
                TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                boolean z31 = tL_messageActionStarGift.can_upgrade;
                j3 = e10;
                long j12 = tL_messageActionStarGift.convert_stars;
                j11 = tL_messageActionStarGift.upgrade_stars;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageActionStarGift.message;
                TLRPC.Peer peer4 = tL_messageActionStarGift.from_id;
                TLRPC.Peer peer5 = tL_messageActionStarGift.peer;
                z15 = tL_messageActionStarGift.prepaid_upgrade;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                TLRPC.Peer peer6 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
                peer2 = peer4;
                peer = peer5;
                z10 = z28;
                i7 = tL_messageActionStarGift.gift_num;
                tL_textWithEntities = tL_textWithEntities2;
                peer3 = peer6;
                z13 = z27;
                z14 = z30;
                z11 = z29;
                starGift = starGift3;
                z12 = z31;
                j10 = j12;
            } else {
                j3 = e10;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                boolean z32 = tL_messageActionStarGiftUnique.saved;
                boolean z33 = tL_messageActionStarGiftUnique.refunded;
                TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique.gift;
                TLRPC.Peer peer7 = tL_messageActionStarGiftUnique.from_id;
                peer = tL_messageActionStarGiftUnique.peer;
                z10 = z32;
                z11 = z33;
                starGift = starGift4;
                peer2 = peer7;
                j10 = 0;
                j11 = 0;
                tL_textWithEntities = null;
                i7 = 0;
                z12 = false;
                z13 = false;
                z14 = false;
                peer3 = null;
                z15 = false;
                str = null;
            }
            long j13 = this.T1;
            String t6 = org.telegram.messenger.n5.t(j13);
            z16 = z25;
            boolean z34 = P3;
            boolean u10 = o10.u(mp.u1(this.a).c2(Long.valueOf(j13)));
            boolean z35 = peer != null && org.telegram.messenger.n5.o(peer) < 0;
            boolean U1 = U1(this.a, M1());
            H1();
            z5Var.f(starGift, false, false, U1);
            z5Var.setShowOptions(s1());
            if (z16) {
                if (i7 == 0 || starGift.title == null) {
                    z17 = z11;
                    str5 = null;
                    N03 = gd.N0(2131749923, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    z17 = z11;
                    sb2.append(starGift.title);
                    sb2.append(" #");
                    N03 = i5.c.l(i7, ',', sb2);
                    str5 = null;
                }
                this.R2 = N03;
                if (z17) {
                    W2 = str5;
                } else {
                    if (z12) {
                        charSequence4 = org.telegram.messenger.g0.W2(gd.N0(2131749980, str5));
                    } else if (j10 > 0) {
                        charSequence4 = org.telegram.messenger.g0.W2(gd.H(',', z13 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j10));
                    } else {
                        W2 = org.telegram.messenger.g0.W2(gd.N0(2131749987, null));
                    }
                    W2 = charSequence4;
                }
                z5Var.i(0, N03, W2, r2(starGift));
            } else {
                z17 = z11;
                if (z35 && !this.A2) {
                    z5Var.i(0, gd.N0(2131749925, null), null, r2(starGift));
                } else if ((z34 || z12) && j11 > 0) {
                    String N05 = gd.N0(z34 ? 2131749920 : 2131749924, null);
                    this.R2 = N05;
                    z5Var.i(0, N05, z17 ? null : !z34 ? gd.N0(2131750131, null) : gd.a0(null, null, 2131750132, t6), r2(starGift));
                } else {
                    if (i7 == 0 || starGift.title == null) {
                        N0 = gd.N0(z34 ? 2131749920 : 2131749924, null);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift.title);
                        sb3.append(" #");
                        N0 = i5.c.l(i7, ',', sb3);
                    }
                    this.R2 = N0;
                    if (z17) {
                        eVar = eVar3;
                        z18 = z12;
                        concat = null;
                        i10 = 0;
                    } else {
                        if (!u10 && G1() != null) {
                            fj fjVar2 = this.D2;
                            if (fjVar2 != null) {
                                TLRPC.MessageAction messageAction3 = fjVar2.k.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z36 = tL_messageActionStarGift2.peer != null;
                                    fjVar2.P3();
                                    fj.B0(this.D2.k);
                                    j10.i(this.a).e();
                                    boolean z37 = z36;
                                    int currentTime = mp.u1(this.a).H6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.D2.k.date);
                                    if (z37) {
                                        TLRPC.Peer peer8 = tL_messageActionStarGift2.peer;
                                        if (peer8 != null) {
                                            i11 = currentTime;
                                            eVar = eVar3;
                                            z18 = z12;
                                        }
                                    } else {
                                        i11 = currentTime;
                                        eVar = eVar3;
                                        z18 = z12;
                                    }
                                    if (!tL_messageActionStarGift2.converted) {
                                        if (tL_messageActionStarGift2.convert_stars > 0) {
                                        }
                                    }
                                    if (z34) {
                                        str2 = null;
                                        str3 = gd.a0(null, null, (!z18 || j11 <= 0) ? 2131750149 : 2131750148, t6);
                                    } else {
                                        str2 = null;
                                        str3 = gd.N0(!z10 ? z35 ? 2131750156 : 2131750161 : z35 ? 2131750155 : 2131750160, null);
                                    }
                                }
                            } else {
                                eVar = eVar3;
                                z18 = z12;
                                TL_stars.SavedStarGift savedStarGift = this.B2;
                                if (savedStarGift != null) {
                                    int currentTime2 = mp.u1(this.a).H6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                                    if (S1(this.a, j13)) {
                                        int i16 = this.B2.flags;
                                        if (((j13 < 0 ? 2048 : 8) & i16) != 0) {
                                            if ((i16 & 16) != 0) {
                                                if ((i16 & 2) != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z34) {
                                }
                            }
                            SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(str3);
                            if (u10 && q1()) {
                                c10 = 1;
                                charSequence = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.N0(2131750093, str2).replace(' ', (char) 160), new k1(this, 15)), true);
                            } else {
                                c10 = 1;
                                charSequence = "";
                            }
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i10 = 0;
                            charSequenceArr[0] = W22;
                            charSequenceArr[c10] = " ";
                            charSequenceArr[2] = charSequence;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        eVar = eVar3;
                        z18 = z12;
                        if (z34) {
                        }
                        SpannableStringBuilder W222 = org.telegram.messenger.g0.W2(str3);
                        if (u10) {
                        }
                        c10 = 1;
                        charSequence = "";
                        CharSequence[] charSequenceArr2 = new CharSequence[3];
                        i10 = 0;
                        charSequenceArr2[0] = W222;
                        charSequenceArr2[c10] = " ";
                        charSequenceArr2[2] = charSequence;
                        concat = TextUtils.concat(charSequenceArr2);
                    }
                    z5Var.i(i10, N0, concat, r2(starGift));
                    ey0Var = this.e2;
                    ey0Var.removeAllViews();
                    long o4 = peer2 == null ? org.telegram.messenger.n5.o(peer2) : z34 ? j3 : j13;
                    if (peer == null) {
                        j13 = org.telegram.messenger.n5.o(peer);
                    } else if (!z34) {
                        j13 = j3;
                    }
                    TLRPC.User c22 = mp.u1(this.a).c2(Long.valueOf(o4));
                    if (peer3 == null) {
                        long o10 = org.telegram.messenger.n5.o(peer3);
                        this.e2.m(gd.N0(2131749919, null), this.a, o10, new m1(this, o10, 7), null, z35 ? null : new m1(this, o10, 8));
                    } else {
                        if (o4 != j3 || z15 || z35) {
                            this.e2.m(gd.N0(2131750176, null), this.a, o4, new m1(this, o4, 9), (o4 == j3 || o4 == 2666000 || o10.y(c22) || u10 || z35) ? null : gd.N0(2131750267, null), z35 ? null : new m1(this, o4, 10));
                        }
                        if (j13 != j3 || z35) {
                            this.e2.m(gd.N0(2131749919, null), this.a, j13, new m1(this, j13, 11), null, z35 ? null : new m1(this, j13, 12));
                        }
                    }
                    ey0Var.g(i15, gd.N0(2131744719, null));
                    if (starGift.stars > 0) {
                        String N06 = gd.N0(2131749830, null);
                        String l10 = i5.c.l(starGift.stars + j11, ',', new StringBuilder("⭐️ "));
                        if (!q1() || z17) {
                            r14 = 0;
                            charSequence3 = "";
                        } else {
                            r14 = 0;
                            charSequence3 = org.telegram.ui.Components.oc.b(gd.H(',', "Gift2ButtonSell", (int) j10), new k1(this, 10), this.J0, null);
                        }
                        ey0Var.e(N06, pb.b1(false, TextUtils.concat(l10, " ", charSequence3), 0.8f, r14), r14, r14);
                    }
                    if (starGift.limited && !z17) {
                        pb.H0(ey0Var, this.a, starGift, this.J0);
                    }
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z17) {
                        ey0Var.b(tL_textWithEntities.text, tL_textWithEntities.entities);
                    }
                    if (z34 && z18 && !z17) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                        if (this.Z2 == null) {
                            eVar2 = eVar;
                            i13 = 0;
                            this.Z2 = new nq(0, new a6(eVar2, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.J0)));
                        } else {
                            eVar2 = eVar;
                            i13 = 0;
                        }
                        spannableStringBuilder.setSpan(this.Z2, i13, 1, 33);
                        if (j11 > 0) {
                            charSequence2 = null;
                            N02 = gd.N0(2131749858, null);
                        } else {
                            charSequence2 = null;
                            N02 = gd.N0(2131749857, null);
                        }
                        spannableStringBuilder.append((CharSequence) N02);
                        eVar2.setFilled(true);
                        eVar2.i(spannableStringBuilder, !this.a3, true);
                        eVar2.g(charSequence2, !this.a3);
                        eVar2.setOnClickListener(new i1(this, 22));
                    } else {
                        eVar2 = eVar;
                        if (this.n2 || this.V1 == null || this.C2 == null || I1() < 0 || this.C2.b(I1()) < 0) {
                            if ((starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                                z19 = true;
                                str4 = null;
                                eVar2.setFilled(true);
                                eVar2.i(gd.N0(2131747637, null), !this.a3, true);
                                eVar2.g(null, !this.a3);
                                eVar2.setOnClickListener(new i1(this, 20));
                            } else {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                                if (this.Z2 == null) {
                                    i12 = 0;
                                    this.Z2 = new nq(0, new a6(eVar2, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.J0)));
                                } else {
                                    i12 = 0;
                                }
                                z19 = true;
                                spannableStringBuilder2.setSpan(this.Z2, i12, 1, 33);
                                str4 = null;
                                spannableStringBuilder2.append((CharSequence) gd.N0(2131750174, null));
                                eVar2.setFilled(true);
                                eVar2.i(spannableStringBuilder2, !this.a3, true);
                                eVar2.g(null, !this.a3);
                                eVar2.setOnClickListener(new i1(this, 19));
                            }
                            z21 = z10;
                            z22 = z34;
                        } else {
                            eVar2.setFilled(false);
                            int b10 = this.C2.b(I1());
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) gd.N0(2131749838, null));
                            Object obj = this.C2.get(b10);
                            if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                                z20 = true;
                            } else {
                                spannableStringBuilder3.append((CharSequence) " e");
                                z20 = true;
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.y5(document, eVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                            }
                            eVar2.i(spannableStringBuilder3, this.a3 ^ z20, z20);
                            eVar2.g(null, this.a3 ^ z20);
                            eVar2.setOnClickListener(new j1(this, b10, 3));
                        }
                    }
                    z19 = true;
                    str4 = null;
                    z21 = z10;
                    z22 = z34;
                }
            }
            eVar = eVar3;
            z18 = z12;
            ey0Var = this.e2;
            ey0Var.removeAllViews();
            if (peer2 == null) {
            }
            if (peer == null) {
            }
            TLRPC.User c222 = mp.u1(this.a).c2(Long.valueOf(o4));
            if (peer3 == null) {
            }
            ey0Var.g(i15, gd.N0(2131744719, null));
            if (starGift.stars > 0) {
            }
            if (starGift.limited) {
                pb.H0(ey0Var, this.a, starGift, this.J0);
            }
            if (tL_textWithEntities != null) {
                ey0Var.b(tL_textWithEntities.text, tL_textWithEntities.entities);
            }
            if (z34) {
            }
            eVar2 = eVar;
            if (this.n2) {
            }
            if (starGift instanceof TL_stars.TL_starGift) {
            }
            z19 = true;
            str4 = null;
            eVar2.setFilled(true);
            eVar2.i(gd.N0(2131747637, null), !this.a3, true);
            eVar2.g(null, !this.a3);
            eVar2.setOnClickListener(new i1(this, 20));
            z21 = z10;
            z22 = z34;
        } else {
            if (!z23) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique2.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            if (tL_messageActionStarGiftUnique2.name_hidden) {
                g22 = null;
            } else {
                mp u12 = mp.u1(this.a);
                TLRPC.Peer peer9 = tL_messageActionStarGiftUnique2.from_id;
                g22 = u12.g2(peer9 != null ? org.telegram.messenger.n5.o(peer9) : fjVar.Z0());
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique2.gift;
            boolean z38 = tL_messageActionStarGiftUnique2.refunded;
            x2(tL_starGiftUnique2, z38, g22, tL_messageActionStarGiftUnique2.message);
            z21 = tL_messageActionStarGiftUnique2.saved;
            starGift = tL_messageActionStarGiftUnique2.gift;
            boolean z39 = (tL_messageActionStarGiftUnique2.upgrade ^ true) == fjVar.P3();
            if (fj.B0(fjVar.k) == e10) {
                z39 = false;
            }
            if (!this.J2 && !this.K2 && this.D2 != null && (G1 = G1()) != null) {
                this.J2 = true;
                y8.y(this.a, false).L(G1, new n1(this, i14));
            }
            if (this.M2 || (o5Var2 = this.L2) == null || !o5Var2.o || (tL_starGiftUnique = o5Var2.l) == null) {
                z24 = z39;
            } else {
                z24 = z39;
                if (starGift == null || tL_starGiftUnique.id != starGift.id) {
                    o5Var2.a();
                    this.L2 = null;
                    z5Var.b.setAlpha(1.0f);
                    z5Var.c.setAlpha(0.0f);
                }
            }
            z16 = z25;
            z17 = z38;
            eVar2 = eVar3;
            z22 = z24;
            tL_textWithEntities = null;
            z19 = true;
            str4 = null;
            z13 = false;
            z14 = false;
            peer3 = null;
        }
        if (this.k3) {
            eVar2.setFilled(z19);
            eVar2.i(gd.N0(2131749777, str4), false, z19);
            eVar2.setOnClickListener(new i1(this, 21));
        }
        String str6 = starGift == null ? null : starGift.owner_address;
        String str7 = starGift == null ? null : starGift.gift_address;
        boolean z40 = (starGift == null || starGift.host_id == null) ? false : true;
        m80 m80Var = this.d2;
        if (z17) {
            m80Var.setVisibility(0);
            m80Var.setText(gd.N0(2131750028, null));
            org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.q7, this.J0);
        } else if (z40 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
            m80Var.setVisibility(0);
            m80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750164, null), new h3(this, str7, 5)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.q5, this.J0);
        } else if (TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && z14 && !z16) {
            m80Var.setVisibility(0);
            if (z22) {
                N04 = gd.a0(null, null, (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? 2131750071 : 2131750070, org.telegram.messenger.n5.t(fj.B0(fjVar.k)));
            } else {
                N04 = gd.N0((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? 2131750163 : 2131750162, null);
            }
            m80Var.setText(N04);
            org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.q5, this.J0);
        } else {
            m80Var.setVisibility(8);
        }
        m80 m80Var2 = this.f2;
        if (!z40 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
            m80Var2.setVisibility(0);
            m80Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750164, null), new h3(this, str7, 6)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
        } else if (z13 || z17 || starGift == null || !R1(this.a, C1()) || peer3 != null) {
            m80Var2.setVisibility(8);
        } else {
            m80Var2.setVisibility(0);
            if (C1() >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (!z21) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new nq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) org.telegram.messenger.g0.T2(gd.N0(z21 ? 2131750038 : 2131750041, null), new k1(this, 8)));
                m80Var2.setText(org.telegram.messenger.g0.I2(spannableStringBuilder4, true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            } else {
                m80Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(z21 ? 2131750236 : 2131750237, null), new k1(this, 8)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            }
        }
        if (this.a3) {
            H2(0, false, null);
            this.n1.n0(1);
            this.a3 = false;
        }
        this.p1.setTitle(this.R2);
        K2();
    }

    public final void w1(final long j3, final x10 x10Var) {
        TLRPC.Message message;
        long o4;
        long j10;
        TL_stars.InputSavedStarGift G1 = G1();
        if (G1 == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.B2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            fj fjVar = this.D2;
            if (fjVar == null || (message = fjVar.k) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            o4 = org.telegram.messenger.n5.o(tL_messageActionStarGiftUnique.gift.owner_id);
            j10 = tL_messageActionStarGiftUnique.transfer_stars;
        } else {
            j10 = savedStarGift.transfer_stars;
            o4 = this.T1;
        }
        if (j10 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = G1;
            transferstargift.to_id = mp.u1(this.a).l1(j3);
            final long j11 = o4;
            ConnectionsManager.getInstance(this.a).sendRequest(transferstargift, new RequestDelegate() { // from class: di.i2
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    boolean z10 = tLObject instanceof TLRPC.Updates;
                    f6 f6Var = f6.this;
                    if (z10) {
                        mp.u1(f6Var.a).V3((TLRPC.Updates) tLObject, false);
                    }
                    org.telegram.messenger.g0.g3(new l2(f6Var, x10Var, tL_error, tLObject, j3, j11));
                }
            });
            return;
        }
        long j12 = o4;
        y8 y10 = y8.y(this.a, false);
        if (!y10.e) {
            y10.r(new j2(this, y10, j3, x10Var, 0));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = G1;
        tL_inputInvoiceStarGiftTransfer.to_id = mp.u1(this.a).l1(j3);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject u10 = ki.s2.u(this.J0, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new k2(this, tL_inputInvoiceStarGiftTransfer, j3, j12, x10Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x047d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0314  */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27, types: [org.telegram.ui.Components.dy0[], org.telegram.ui.Components.nc[], org.telegram.ui.Components.nq[]] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v42, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.ViewGroup, org.telegram.ui.Components.ey0] */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r35v0, types: [di.f6, org.telegram.ui.ActionBar.w2, org.telegram.ui.Components.sa] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w2(TL_stars.SavedStarGift savedStarGift, q8 q8Var) {
        long j3;
        int i7;
        String N0;
        int i10;
        CharSequence charSequence;
        String str;
        String a02;
        int i11;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        TL_stars.StarGift starGift;
        ?? r13;
        SpannableString spannableString;
        TL_stars.StarGift starGift2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z11;
        hi.e eVar;
        int i12;
        boolean z12;
        TL_stars.StarGift starGift3;
        TLRPC.Document document;
        String str2;
        String str3;
        boolean z13;
        int i13;
        CharSequence charSequence2;
        String N02;
        String str4;
        String N03;
        CharSequence W2;
        CharSequence charSequence3;
        TL_stars.StarGift starGift4;
        float f10;
        float f11;
        ?? r14;
        o5 o5Var;
        if (savedStarGift == null) {
            return;
        }
        int i14 = this.a;
        long j10 = this.T1;
        this.A2 = R1(i14, j10);
        this.B2 = savedStarGift;
        this.C2 = q8Var;
        this.D2 = null;
        boolean z14 = this.M2;
        z5 z5Var = this.b2;
        if (!z14 && (o5Var = this.L2) != null && o5Var.o && o5Var.l != null) {
            o5Var.a();
            this.L2 = null;
            z5Var.b.setVisibility(0);
            z5Var.c.setVisibility(4);
        }
        this.a2.b(this.a, savedStarGift);
        String t6 = org.telegram.messenger.n5.t(j10);
        long o4 = org.telegram.messenger.n5.o(savedStarGift.from_id);
        boolean u10 = o10.u(mp.u1(this.a).c2(Long.valueOf(o4)));
        int currentTime = mp.u1(this.a).H6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
        long e10 = j10.i(this.a).e();
        if ((savedStarGift.flags & 2) == 0) {
            o4 = 2666000;
        }
        int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        boolean z15 = i15 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
        boolean z16 = savedStarGift.refunded;
        TL_stars.StarGift starGift5 = savedStarGift.gift;
        if (starGift5 instanceof TL_stars.TL_starGiftUnique) {
            str2 = starGift5.owner_address;
            str3 = starGift5.gift_address;
            z13 = starGift5.host_id != null;
            x2((TL_stars.TL_starGiftUnique) starGift5, z16, !savedStarGift.name_hidden ? mp.u1(this.a).g2(org.telegram.messenger.n5.o(savedStarGift.from_id)) : null, savedStarGift.message);
            i7 = i15;
        } else {
            boolean z17 = this.A2 && e10 == o4 && i15 >= 0;
            boolean U1 = U1(this.a, M1());
            H1();
            z5Var.f(starGift5, false, false, U1);
            z5Var.setShowOptions(s1());
            ?? r22 = this.e2;
            r22.removeAllViews();
            ?? r34 = "";
            if (z17) {
                if (savedStarGift.gift_num == 0 || (starGift4 = savedStarGift.gift) == null || starGift4.title == null) {
                    j3 = e10;
                    str4 = null;
                    N03 = gd.N0(2131749923, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j3 = e10;
                    N03 = i5.c.l(savedStarGift.gift_num, ',', sb2);
                    str4 = null;
                }
                this.R2 = N03;
                if (z16) {
                    W2 = str4;
                } else {
                    if (savedStarGift.can_upgrade) {
                        charSequence3 = org.telegram.messenger.g0.W2(gd.N0(2131749980, str4));
                    } else {
                        long j11 = savedStarGift.convert_stars;
                        if (j11 > 0) {
                            charSequence3 = org.telegram.messenger.g0.W2(gd.H(',', "Gift2SelfInfoConvert", (int) j11));
                        } else {
                            W2 = org.telegram.messenger.g0.W2(gd.N0(2131749987, null));
                        }
                    }
                    W2 = charSequence3;
                }
                z5Var.i(0, N03, W2, r2(savedStarGift.gift));
            } else {
                j3 = e10;
                if (!z15 || this.A2) {
                    boolean z18 = this.A2;
                    if (!z18 || savedStarGift.can_upgrade) {
                        i7 = i15;
                        if (savedStarGift.upgrade_stars > 0) {
                            String N04 = gd.N0(z18 ? 2131749924 : 2131749925, null);
                            this.R2 = N04;
                            z5Var.i(0, N04, z16 ? null : this.A2 ? gd.N0(2131750131, null) : null, r2(savedStarGift.gift));
                            if (j3 == o4 || z15) {
                                this.e2.m(gd.N0(2131750176, null), this.a, o4, new m1(this, o4, 4), (o4 != j3 || o4 == 2666000 || u10 || o10.y(mp.u1(this.a).c2(Long.valueOf(o4))) || z15) ? null : gd.N0(2131750267, null), new m1(this, o4, 5));
                            }
                            r22.e(gd.N0(2131744719, null), gd.a0(null, null, 2131742519, gd.E0().s0().format(new Date(savedStarGift.date * 1000)), gd.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
                            String N05 = gd.N0(2131749830, null);
                            String l10 = i5.c.l(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
                            if (q1() || z16) {
                                r13 = 0;
                                spannableString = r34;
                            } else {
                                r13 = 0;
                                spannableString = org.telegram.ui.Components.oc.b(gd.H(',', "Gift2ButtonSell", (int) savedStarGift.convert_stars), new k1(this, 10), this.J0, null);
                            }
                            r22.e(N05, pb.b1(false, TextUtils.concat(l10, " ", spannableString), 0.8f, r13), r13, r13);
                            starGift2 = savedStarGift.gift;
                            if (starGift2.limited && !z16) {
                                pb.H0(r22, this.a, starGift2, this.J0);
                            }
                            tL_textWithEntities = savedStarGift.message;
                            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z16) {
                                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                                r22.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                            }
                            z11 = this.A2;
                            eVar = this.g2;
                            if (!z11 && savedStarGift.can_upgrade) {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                                if (this.Z2 == null) {
                                    i13 = 0;
                                    this.Z2 = new nq(0, new a6(eVar, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.J0)));
                                } else {
                                    i13 = 0;
                                }
                                spannableStringBuilder2.setSpan(this.Z2, i13, 1, 33);
                                if (savedStarGift.upgrade_stars > 0) {
                                    charSequence2 = null;
                                    N02 = gd.N0(2131749858, null);
                                } else {
                                    charSequence2 = null;
                                    N02 = gd.N0(2131749857, null);
                                }
                                spannableStringBuilder2.append((CharSequence) N02);
                                eVar.setFilled(true);
                                eVar.i(spannableStringBuilder2, !this.a3, true);
                                eVar.g(charSequence2, !this.a3);
                                eVar.setOnClickListener(new i1(this, 14));
                            } else if (!this.n2 && z11 && this.V1 != null && this.C2 != null && I1() >= 0 && this.C2.b(I1()) >= 0) {
                                eVar.setFilled(false);
                                int b10 = this.C2.b(I1());
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                spannableStringBuilder3.append((CharSequence) gd.N0(2131749838, null));
                                Object obj = this.C2.get(b10);
                                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                                    z12 = true;
                                } else {
                                    spannableStringBuilder3.append((CharSequence) " e");
                                    z12 = true;
                                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.y5(document, eVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                                }
                                eVar.i(spannableStringBuilder3, this.a3 ^ z12, z12);
                                eVar.g(null, this.a3 ^ z12);
                                eVar.setOnClickListener(new j1(this, b10, 2));
                            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                                eVar.setFilled(true);
                                eVar.i(gd.N0(2131747637, null), !this.a3, true);
                                eVar.g(null, !this.a3);
                                eVar.setOnClickListener(new i1(this, 16));
                            } else {
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("^  ");
                                if (this.Z2 == null) {
                                    i12 = 0;
                                    this.Z2 = new nq(0, new a6(eVar, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.J0)));
                                } else {
                                    i12 = 0;
                                }
                                spannableStringBuilder4.setSpan(this.Z2, i12, 1, 33);
                                spannableStringBuilder4.append((CharSequence) gd.N0(2131750174, null));
                                eVar.setFilled(true);
                                eVar.i(spannableStringBuilder4, !this.a3, true);
                                eVar.g(null, !this.a3);
                                eVar.setOnClickListener(new i1(this, 15));
                            }
                            str2 = null;
                            str3 = null;
                            z13 = false;
                        }
                    } else {
                        i7 = i15;
                    }
                    if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                        N0 = gd.N0(z18 ? 2131749924 : 2131749925, null);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(savedStarGift.gift.title);
                        sb3.append(" #");
                        N0 = i5.c.l(savedStarGift.gift_num, ',', sb3);
                    }
                    this.R2 = N0;
                    if (z16 || !this.A2) {
                        i10 = 0;
                        charSequence = null;
                    } else {
                        if (!u10 && q1()) {
                            if (this.A2) {
                                a02 = gd.H(',', currentTime <= 0 ? z15 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z15 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                a02 = gd.K("Gift2Info2Out", (int) savedStarGift.convert_stars, ',', t6);
                            }
                            str = null;
                        } else if (this.A2) {
                            if (savedStarGift.unsaved) {
                                i11 = z15 ? 2131750156 : 2131750161;
                                str = null;
                            } else {
                                str = null;
                                i11 = z15 ? 2131750155 : 2131750160;
                            }
                            a02 = gd.N0(i11, str);
                        } else {
                            str = null;
                            a02 = gd.a0(null, null, (!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? 2131750149 : 2131750148, t6);
                        }
                        SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(a02);
                        if (u10 || !q1()) {
                            z10 = true;
                            spannableStringBuilder = r34;
                        } else {
                            z10 = true;
                            spannableStringBuilder = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.N0(2131750093, str).replace(' ', (char) 160), new k1(this, 6)), true);
                        }
                        boolean z19 = z10;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        i10 = 0;
                        charSequenceArr[0] = W22;
                        charSequenceArr[z19 ? 1 : 0] = " ";
                        charSequenceArr[2] = spannableStringBuilder;
                        charSequence = TextUtils.concat(charSequenceArr);
                    }
                    z5Var.i(i10, N0, charSequence, r2(savedStarGift.gift));
                    if (j3 == o4) {
                    }
                    this.e2.m(gd.N0(2131750176, null), this.a, o4, new m1(this, o4, 4), (o4 != j3 || o4 == 2666000 || u10 || o10.y(mp.u1(this.a).c2(Long.valueOf(o4))) || z15) ? null : gd.N0(2131750267, null), new m1(this, o4, 5));
                    r22.e(gd.N0(2131744719, null), gd.a0(null, null, 2131742519, gd.E0().s0().format(new Date(savedStarGift.date * 1000)), gd.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
                    String N052 = gd.N0(2131749830, null);
                    String l102 = i5.c.l(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
                    if (q1()) {
                    }
                    r13 = 0;
                    spannableString = r34;
                    r22.e(N052, pb.b1(false, TextUtils.concat(l102, " ", spannableString), 0.8f, r13), r13, r13);
                    starGift2 = savedStarGift.gift;
                    if (starGift2.limited) {
                        pb.H0(r22, this.a, starGift2, this.J0);
                    }
                    tL_textWithEntities = savedStarGift.message;
                    if (tL_textWithEntities != null) {
                        TLRPC.TL_textWithEntities tL_textWithEntities32 = savedStarGift.message;
                        r22.b(tL_textWithEntities32.text, tL_textWithEntities32.entities);
                    }
                    z11 = this.A2;
                    eVar = this.g2;
                    if (!z11) {
                    }
                    if (!this.n2) {
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
                    }
                    eVar.setFilled(true);
                    eVar.i(gd.N0(2131747637, null), !this.a3, true);
                    eVar.g(null, !this.a3);
                    eVar.setOnClickListener(new i1(this, 16));
                    str2 = null;
                    str3 = null;
                    z13 = false;
                } else {
                    String N06 = gd.N0(2131749925, null);
                    this.R2 = N06;
                    z5Var.i(0, N06, null, q2(savedStarGift.gift.released_by));
                }
            }
            i7 = i15;
            if (j3 == o4) {
            }
            this.e2.m(gd.N0(2131750176, null), this.a, o4, new m1(this, o4, 4), (o4 != j3 || o4 == 2666000 || u10 || o10.y(mp.u1(this.a).c2(Long.valueOf(o4))) || z15) ? null : gd.N0(2131750267, null), new m1(this, o4, 5));
            r22.e(gd.N0(2131744719, null), gd.a0(null, null, 2131742519, gd.E0().s0().format(new Date(savedStarGift.date * 1000)), gd.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
            String N0522 = gd.N0(2131749830, null);
            String l1022 = i5.c.l(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (q1()) {
            }
            r13 = 0;
            spannableString = r34;
            r22.e(N0522, pb.b1(false, TextUtils.concat(l1022, " ", spannableString), 0.8f, r13), r13, r13);
            starGift2 = savedStarGift.gift;
            if (starGift2.limited) {
            }
            tL_textWithEntities = savedStarGift.message;
            if (tL_textWithEntities != null) {
            }
            z11 = this.A2;
            eVar = this.g2;
            if (!z11) {
            }
            if (!this.n2) {
            }
            if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
            }
            eVar.setFilled(true);
            eVar.i(gd.N0(2131747637, null), !this.a3, true);
            eVar.g(null, !this.a3);
            eVar.setOnClickListener(new i1(this, 16));
            str2 = null;
            str3 = null;
            z13 = false;
        }
        boolean z20 = savedStarGift.refunded;
        int i16 = 8;
        m80 m80Var = this.d2;
        if (z20) {
            m80Var.setVisibility(0);
            m80Var.setText(gd.N0(2131750028, null));
            org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.q7, this.J0);
            f10 = 2.6666667f;
            f11 = 0.66f;
        } else if (!z13 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            f10 = 2.6666667f;
            f11 = 0.66f;
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && this.A2 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
                m80Var.setVisibility(0);
                m80Var.setText(gd.N0((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? 2131750163 : 2131750162, null));
                org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.q5, this.J0);
            } else {
                m80Var.setVisibility(8);
            }
        } else {
            f11 = 0.66f;
            f10 = 2.6666667f;
            m80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750164, null), new h3(this, str3, 0)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            m80Var.setVisibility(0);
            org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.q5, this.J0);
        }
        m80 m80Var2 = this.f2;
        if (!z13 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            m80Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750164, null), new h3(this, str3, 2)), true, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f11)));
            r14 = 0;
            m80Var2.setVisibility(0);
        } else if (this.A2 && R1(this.a, j10)) {
            if (i7 >= 0) {
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder5.append((CharSequence) ". ");
                    spannableStringBuilder5.setSpan(new nq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder5.append((CharSequence) org.telegram.messenger.g0.T2(gd.N0(!savedStarGift.unsaved ? 2131750038 : 2131750041, null), new k1(this, i16)));
                m80Var2.setText(org.telegram.messenger.g0.I2(spannableStringBuilder5, true, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f11)));
            } else {
                m80Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(!savedStarGift.unsaved ? 2131750236 : 2131750237, null), new k1(this, i16)), true, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f11)));
            }
            r14 = 0;
            m80Var2.setVisibility(0);
        } else {
            r14 = 0;
            m80Var2.setVisibility(8);
        }
        if (this.a3) {
            H2(r14, r14, null);
            this.n1.n0(1);
            this.a3 = r14;
        }
        this.p1.setTitle(this.R2);
        K2();
    }

    public final void x1() {
        TL_stars.InputSavedStarGift G1;
        long j3;
        hi.e eVar = this.g2;
        if (eVar.R || (G1 = G1()) == null) {
            return;
        }
        fj fjVar = this.D2;
        String str = null;
        long j10 = 0;
        if (fjVar != null) {
            TLRPC.MessageAction messageAction = fjVar.k.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j3 = tL_messageActionStarGift.upgrade_stars;
            if (j3 <= 0) {
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift == null) {
                return;
            }
            j3 = savedStarGift.upgrade_stars;
            if (j3 <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
        }
        if (j3 > 0 || this.r3 != null) {
            eVar.setLoading(true);
            op opVar = this.s2;
            if (j3 > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = opVar.a.q;
                upgradestargift.stargift = G1;
                ConnectionsManager.getInstance(this.a).sendRequest(upgradestargift, new bi.o1(7, this, G1));
                return;
            }
            int i7 = 0;
            y8 y10 = y8.y(this.a, false);
            if (!y10.e) {
                y10.r(new f2(2, this, y10));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.r3.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = opVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = G1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = mp.u1(this.a).l1(this.T1);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.r3.invoice.prices;
            int size = arrayList.size();
            while (i7 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                i7++;
                j10 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new y(this, str, G1, j10, 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:368:0x0607, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r4).drop_original_details_stars >= 0) goto L206;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a60  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0288  */
    /* JADX WARN: Type inference failed for: r10v39, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v53, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.String, org.telegram.ui.Components.dy0[], org.telegram.ui.Components.nc[]] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35, types: [java.lang.String, org.telegram.ui.Components.dy0[], org.telegram.ui.Components.nc[]] */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v76 */
    /* JADX WARN: Type inference failed for: r11v95 */
    /* JADX WARN: Type inference failed for: r11v96 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.String, org.telegram.ui.Components.dy0[], org.telegram.ui.Components.nc[]] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.String, org.telegram.ui.Components.dy0[], org.telegram.ui.Components.nc[]] */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.String, org.telegram.ui.Components.dy0[], org.telegram.ui.Components.nc[]] */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r3v27, types: [android.view.ViewGroup, org.telegram.ui.Components.ey0] */
    /* JADX WARN: Type inference failed for: r4v70, types: [android.view.ViewGroup, android.widget.TableRow] */
    /* JADX WARN: Type inference failed for: r4v72, types: [android.view.ViewGroup, org.telegram.ui.Components.by0] */
    /* JADX WARN: Type inference failed for: r4v74, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v65, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        final int i7;
        CharSequence charSequence;
        CharSequence charSequence2;
        String N0;
        Spannable spannable;
        int i10;
        int i11;
        String str;
        int i12;
        ?? r14;
        ?? r13;
        ?? r11;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        float f10;
        z5 z5Var;
        Class cls;
        Class cls2;
        Class cls3;
        o5 o5Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        o5 o5Var2;
        boolean z12;
        ?? r112;
        int i13;
        ?? r113;
        int i14;
        Object obj;
        int i15;
        Spannable spannable2;
        CharSequence V;
        TLRPC.Message message;
        fj fjVar;
        int i16;
        String str2;
        int i17;
        final int i18;
        String str3;
        int i19;
        TL_wallet.nftItem nftitem;
        String str4;
        TL_wallet.nftItem nftitem2;
        String str5;
        org.telegram.ui.Wallet.q8 q8Var;
        o5 o5Var3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique3;
        long o4 = org.telegram.messenger.n5.o(tL_starGiftUnique.owner_id);
        long o10 = org.telegram.messenger.n5.o(tL_starGiftUnique.host_id);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.R2 = i5.c.l(tL_starGiftUnique.num, ',', sb2);
        boolean z13 = this.M2;
        z5 z5Var2 = this.b2;
        if (!z13 && (o5Var3 = this.L2) != null && o5Var3.o && (tL_starGiftUnique3 = o5Var3.l) != null && tL_starGiftUnique3.id != tL_starGiftUnique.id) {
            o5Var3.a();
            this.L2 = null;
            z5Var2.b.setAlpha(1.0f);
            z5Var2.c.setAlpha(0.0f);
        } else if (z13 && this.L2 == null) {
            this.L2 = new o5(z5Var2);
        }
        boolean z14 = this.e3 == null;
        z5Var2.setInWallet(z14 && this.b3 == null && F2(tL_starGiftUnique));
        TextPaint textPaint = z5Var2.H;
        boolean z15 = z14 && S1(this.a, o4);
        boolean z16 = z14 && S1(this.a, o10);
        boolean U1 = U1(this.a, M1());
        H1();
        z5Var2.f(tL_starGiftUnique, z15, z16, U1);
        z5Var2.setShowOptions(false);
        int i20 = 9;
        int i21 = 8;
        int i22 = 5;
        int i23 = 6;
        if (this.b3 != null) {
            if (this.d3 != null) {
                z5Var2.j(new p3(this, i22), this.c3 == null ? null : new i1(this, i22), new i1(this, i23), true);
                org.telegram.ui.Wallet.w5 w5Var = this.d3;
                org.telegram.ui.Wallet.r8 r8Var = w5Var.b.k0;
                z5Var2.setWalletCard((r8Var == null || (nftitem2 = w5Var.a) == null || (str5 = nftitem2.address) == null || (q8Var = (org.telegram.ui.Wallet.q8) r8Var.f.get(str5)) == null || !q8Var.b()) ? false : true);
            } else {
                z5Var2.j(new i1(this, 7), this.c3 == null ? null : new i1(this, i21), new i1(this, i20), tL_starGiftUnique.host_id != null);
            }
            org.telegram.ui.Wallet.v5 v5Var = this.c3;
            if (v5Var != null) {
                i19 = ((org.telegram.ui.ActionBar.g2) v5Var.c).currentAccount;
                boolean F = org.telegram.ui.Wallet.r8.F(i19, v5Var.a.slug);
                org.telegram.ui.Wallet.v5 v5Var2 = this.c3;
                org.telegram.ui.Wallet.r8 r8Var2 = v5Var2.c.k0;
                boolean z17 = (r8Var2 == null || (nftitem = v5Var2.b) == null || (str4 = nftitem.address) == null || !str4.equals(r8Var2.Q0)) ? false : true;
                ai.l0 l0Var = z5Var2.K;
                l0Var.e(R.drawable.filled_card_color, gd.N0(z17 ? 2131742858 : 2131742864, null), false);
                l0Var.setAlpha((F || z17) ? 1.0f : 0.5f);
            }
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ("#" + gd.E(tL_starGiftUnique.num, ',')));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        int i24 = 33;
        spannableStringBuilder.setSpan(new org.telegram.messenger.t(ks.U2, 2, false), length, spannableStringBuilder.length(), 33);
        TL_wallet.walletTransaction wallettransaction = this.e3;
        if (wallettransaction == null || org.telegram.ui.Wallet.f3.c(wallettransaction) == null) {
            TL_wallet.walletTransaction wallettransaction2 = this.e3;
            if (wallettransaction2 != null) {
                N0 = gd.N0(wallettransaction2.incoming ? 2131742830 : 2131742829, null);
            } else {
                if (tLObject != null) {
                    i7 = 1;
                    charSequence2 = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743639, org.telegram.messenger.n5.u(tLObject)));
                } else {
                    i7 = 1;
                    if (tL_starGiftUnique.released_by != null || stargiftattributemodel == null) {
                        charSequence = null;
                        if (tL_textWithEntities != null || textPaint == null) {
                            spannable = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                            fj.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
                            spannable = fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                        }
                        z5Var2.h(0, spannableStringBuilder, charSequence, q2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                        this.i3 = null;
                        ?? r32 = this.e2;
                        r32.removeAllViews();
                        if (z10) {
                            i10 = i7;
                            i11 = 0;
                            str = null;
                        } else if (tL_starGiftUnique.host_id != null) {
                            if (TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                                i18 = 0;
                                str3 = null;
                            } else {
                                final String str6 = tL_starGiftUnique.owner_address;
                                str3 = null;
                                i18 = 0;
                                k1(r32, gd.N0(2131750165, null), str6, this.J0).setOnClickListener(new View.OnClickListener(this) { // from class: di.l1
                                    public final /* synthetic */ f6 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i25 = i18;
                                        String str7 = str6;
                                        f6 f6Var = this.b;
                                        switch (i25) {
                                            case 0:
                                                org.telegram.messenger.g0.g(str7);
                                                f6Var.k().Q(R.raw.copy, 36, gd.N0(2131742958, null)).k(false);
                                                break;
                                            case 1:
                                                org.telegram.messenger.g0.g(str7);
                                                f6Var.k().Q(R.raw.copy, 36, gd.N0(2131742958, null)).k(false);
                                                break;
                                            default:
                                                org.telegram.messenger.g0.g(str7);
                                                f6Var.k().Q(R.raw.copy, 36, gd.N0(2131742958, null)).k(false);
                                                break;
                                        }
                                    }
                                });
                            }
                            if (o10 != 0) {
                                int i25 = i18;
                                this.i3 = ((by0) this.e2.o(gd.N0(2131750166, str3), this.a, o10, new m1(this, o10, i18)).getChildAt(i7)).getChildAt(i25);
                                i16 = i25;
                                str2 = str3;
                                i17 = i7;
                                i24 = 33;
                                i10 = i17;
                                i11 = i16;
                                str = str2;
                            } else {
                                r13 = i18;
                                r14 = str3;
                                i12 = 8;
                                r11 = i7;
                                l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                                l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                if (!z10) {
                                    if (this.D2 == null) {
                                        ?? r12 = r14;
                                        r32.e(gd.N0(2131750037, r12), gd.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + gd.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r12, r12);
                                    } else if (this.I2) {
                                        ?? r122 = r14;
                                        r32.e(gd.N0(2131750037, r122), gd.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + gd.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r122, r122);
                                    } else {
                                        ?? r42 = (TextView) ((by0) r32.e(gd.N0(2131750037, r14), "", r14, r14).getChildAt(r11)).getChildAt(r13);
                                        ?? spannableStringBuilder3 = new SpannableStringBuilder("x ");
                                        r80 r80Var = new r80(r42, org.telegram.messenger.g0.L(90.0f), r13, this.J0);
                                        int i26 = org.telegram.ui.ActionBar.m6.G6;
                                        r80Var.a(org.telegram.ui.ActionBar.m6.r1(0.21f, org.telegram.ui.ActionBar.m6.w0(i26, this.J0)), org.telegram.ui.ActionBar.m6.r1(0.08f, org.telegram.ui.ActionBar.m6.w0(i26, this.J0)));
                                        spannableStringBuilder3.setSpan(r80Var, r13, r11, i24);
                                        r42.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                                        if (!this.H2 && !this.I2 && (fjVar = this.D2) != null) {
                                            this.H2 = r11;
                                            int e12 = fjVar.e1();
                                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                            tL_messages_getMessages.id.add(Integer.valueOf(e12));
                                            ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new w1(this, e12, r13));
                                        }
                                    }
                                    if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                                        org.telegram.messenger.r1 i27 = org.telegram.messenger.r1.i();
                                        long j3 = tL_starGiftUnique.value_amount;
                                        String str7 = tL_starGiftUnique.value_currency;
                                        int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                                        i27.getClass();
                                        this.e2.d(gd.N0(2131749415, null), p5.c.k("~", org.telegram.messenger.r1.g(str7, h, j3, r11)), gd.N0(2131749414, null), new aa.r((Object) this, (Object) tL_starGiftUnique, org.telegram.messenger.r1.i().f(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 26), null);
                                    }
                                }
                                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                if (stargiftattributeoriginaldetails != null) {
                                    if ((stargiftattributeoriginaldetails.flags & r11) != 0) {
                                        f10 = 14.0f;
                                        long o11 = org.telegram.messenger.n5.o(stargiftattributeoriginaldetails.sender_id);
                                        ?? spannableString = new SpannableString(org.telegram.messenger.n5.l(j10.t0, o11));
                                        spannableString.setSpan(new f4(this, o11), r13, spannableString.length(), 33);
                                        obj = spannableString;
                                    } else {
                                        f10 = 14.0f;
                                        obj = null;
                                    }
                                    long o12 = org.telegram.messenger.n5.o(stargiftattributeoriginaldetails.recipient_id);
                                    ?? spannableString2 = new SpannableString(org.telegram.messenger.n5.l(j10.t0, o12));
                                    spannableString2.setSpan(new g4(this, o12), r13, spannableString2.length(), 33);
                                    if (stargiftattributeoriginaldetails.message != null) {
                                        TextPaint textPaint2 = new TextPaint((int) r11);
                                        textPaint2.setTextSize(org.telegram.messenger.g0.L(f10));
                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                                        fj.b(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false, 0);
                                        i15 = r11;
                                        spannable2 = fj.B5(org.telegram.messenger.j6.m(spannableStringBuilder4, textPaint2.getFontMetricsInt(), r13, null, r13), stargiftattributeoriginaldetails.message.entities, textPaint2.getFontMetricsInt(), r13);
                                    } else {
                                        i15 = r11;
                                        spannable2 = null;
                                    }
                                    int i28 = r13;
                                    String replaceAll = gd.E0().C0().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                                    if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                                        if (spannable2 == null) {
                                            Object[] objArr = new Object[2];
                                            objArr[i28] = obj;
                                            objArr[i15] = replaceAll;
                                            V = gd.V(null, null, 2131750365, objArr);
                                        } else {
                                            Object[] objArr2 = new Object[3];
                                            objArr2[i28] = obj;
                                            objArr2[i15] = replaceAll;
                                            objArr2[2] = spannable2;
                                            V = gd.V(null, null, 2131750364, objArr2);
                                        }
                                    } else if (obj != null) {
                                        if (spannable2 == null) {
                                            ?? r72 = new Object[3];
                                            r72[i28] = obj;
                                            r72[i15] = spannableString2;
                                            r72[2] = replaceAll;
                                            V = gd.V(null, null, 2131750369, r72);
                                        } else {
                                            ?? r142 = new Object[4];
                                            r142[i28] = obj;
                                            r142[i15] = spannableString2;
                                            r142[2] = replaceAll;
                                            r142[3] = spannable2;
                                            V = gd.V(null, null, 2131750368, r142);
                                        }
                                    } else if (spannable2 == null) {
                                        ?? r73 = new Object[2];
                                        r73[i28] = spannableString2;
                                        r73[i15] = replaceAll;
                                        V = gd.V(null, null, 2131750367, r73);
                                    } else {
                                        ?? r10 = new Object[3];
                                        r10[i28] = spannableString2;
                                        r10[i15] = replaceAll;
                                        r10[2] = spannable2;
                                        V = gd.V(null, null, 2131750366, r10);
                                    }
                                    if (R1(this.a, org.telegram.messenger.n5.o(tL_starGiftUnique.owner_id))) {
                                        TL_stars.SavedStarGift savedStarGift = this.B2;
                                        if (savedStarGift == null || savedStarGift.drop_original_details_stars < 0) {
                                            fj fjVar2 = this.D2;
                                            if (fjVar2 != null && (message = fjVar2.k) != null) {
                                                TLRPC.MessageAction messageAction = message.action;
                                                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                }
                                            }
                                        }
                                        LinearLayout linearLayout = new LinearLayout(getContext());
                                        linearLayout.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
                                        linearLayout.setOrientation(i28);
                                        xh.l lVar = new xh.l(getContext());
                                        org.telegram.ui.ActionBar.t6.U(lVar, org.telegram.ui.ActionBar.m6.G6, this.J0);
                                        org.telegram.ui.ActionBar.t6.G(lVar, org.telegram.ui.ActionBar.m6.Xc, this.J0);
                                        lVar.setTextSize(i15, 12.0f);
                                        lVar.setGravity(3);
                                        lVar.setText(V);
                                        linearLayout.addView(lVar, c8.ma.p(-1, -2, 1.0f, 19));
                                        ImageView imageView = new ImageView(getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                                        int i29 = org.telegram.ui.ActionBar.m6.Fi;
                                        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i29, this.J0)), 6, 6);
                                        org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i29);
                                        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
                                        imageView.setBackground(a02);
                                        org.telegram.ui.ActionBar.t6.j(imageView, a02, null, K, h6Var);
                                        imageView.setImageResource(R.drawable.menu_delete_old);
                                        org.telegram.ui.ActionBar.t6.s(imageView, i29, this.J0, PorterDuff.Mode.SRC_IN);
                                        c8.ra.a(imageView);
                                        imageView.setOnClickListener(new ai.x2(15, this, V));
                                        linearLayout.addView(imageView, c8.ma.q(32, 32, 0.0f, 21, 8, 0, 0, 0));
                                        TableRow tableRow = new TableRow(getContext());
                                        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                                        layoutParams.span = 2;
                                        tableRow.addView(new cy0(r32, linearLayout, true), layoutParams);
                                        r32.addView(tableRow);
                                    }
                                    boolean z18 = i15;
                                    cy0 a10 = r32.a(V);
                                    a10.setFilled(z18);
                                    xh.l lVar2 = (xh.l) a10.getChildAt(0);
                                    lVar2.setTextSize(z18 ? 1 : 0, 12.0f);
                                    lVar2.setGravity(17);
                                } else {
                                    f10 = 14.0f;
                                }
                                if (this.e3 != null) {
                                    this.i3 = null;
                                    r32.removeAllViews();
                                    org.telegram.ui.Wallet.f3 c10 = org.telegram.ui.Wallet.f3.c(this.e3);
                                    int i30 = c10 != null ? 0 : i12;
                                    LinearLayout linearLayout2 = this.f3;
                                    linearLayout2.setVisibility(i30);
                                    if (c10 != null) {
                                        long j10 = c10.e;
                                        int i31 = c10.j;
                                        int i32 = c10.a;
                                        long j11 = c10.g;
                                        long j12 = c10.f;
                                        long abs = Math.abs(j10);
                                        z5Var = z5Var2;
                                        cls2 = TL_stars.starGiftAttributeBackdrop.class;
                                        SpannableStringBuilder v = org.telegram.ui.Wallet.u0.v(org.telegram.ui.Wallet.u0.t(abs, false), 0.75f);
                                        if (abs != 0) {
                                            cls = TL_stars.starGiftAttributePattern.class;
                                            v.insert(0, (CharSequence) (j10 > 0 ? "+" : "–"));
                                        } else {
                                            cls = TL_stars.starGiftAttributePattern.class;
                                        }
                                        cls3 = TL_stars.starGiftAttributeModel.class;
                                        v.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.m6.w0(j10 > 0 ? org.telegram.ui.ActionBar.m6.lk : org.telegram.ui.ActionBar.m6.G6, this.J0)), 0, v.length(), 33);
                                        linearLayout2.setVisibility((abs == 0 || (i32 == 9 || i32 == 4)) ? i12 : 0);
                                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(org.telegram.ui.Wallet.u0.q("GramCapital", v, 2131749343));
                                        int indexOf = TextUtils.indexOf(spannableStringBuilder5, v);
                                        int length2 = v.length() + indexOf;
                                        if (indexOf > 0) {
                                            i13 = 33;
                                            spannableStringBuilder5.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
                                        } else {
                                            i13 = 33;
                                        }
                                        if (indexOf >= 0 && length2 < spannableStringBuilder5.length()) {
                                            spannableStringBuilder5.setSpan(new RelativeSizeSpan(0.75f), length2, spannableStringBuilder5.length(), i13);
                                        }
                                        this.g3.setText(spannableStringBuilder5);
                                        this.h3.setText(org.telegram.ui.Wallet.u0.D(this.a).r(abs, false));
                                        boolean z19 = i32 == 0 || i32 == 1 || i32 == 2;
                                        if (i32 == 0 && j12 > 0 && j11 > 0) {
                                            r32.e(gd.N0(2131749532, null), bi.y4.i(j12), null, null);
                                        } else if (z19 && j12 > 0) {
                                            r32.e(gd.N0(2131749534, null), bi.y4.i(j12), null, null);
                                        }
                                        if (z19 && j11 > 0) {
                                            CharSequence i33 = bi.y4.i(j11);
                                            if (j12 > 0) {
                                                double d = (j11 * 100.0d) / j12;
                                                SpannableString spannableString3 = new SpannableString(a8.p0.p("(", a8.p0.s(new StringBuilder(), Math.abs(d - ((double) Math.round(d))) < 0.05d ? String.valueOf(Math.round(d)) : String.format(Locale.US, "%.1f", Double.valueOf(d)), "%"), ")"));
                                                spannableString3.setSpan(new k00(org.telegram.ui.ActionBar.m6.z6, this.J0), 0, spannableString3.length(), 33);
                                                i33 = TextUtils.concat(i33, " ", spannableString3);
                                            }
                                            r32.e(gd.N0(2131749574, null), i33, null, null);
                                        }
                                        long j13 = this.e3.fee;
                                        if (j13 != 0) {
                                            long abs2 = Math.abs(j13);
                                            StringBuilder sb3 = new StringBuilder("⭐️ ");
                                            BigDecimal movePointLeft = new BigDecimal(abs2).movePointLeft(9);
                                            sb3.append((movePointLeft.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : movePointLeft.stripTrailingZeros()).toPlainString());
                                            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(pb.b1(true, sb3.toString(), 0.8f, null));
                                            CharSequence r15 = org.telegram.ui.Wallet.u0.D(this.a).r(abs2, true);
                                            if (!TextUtils.isEmpty(r15)) {
                                                int length3 = spannableStringBuilder6.length();
                                                spannableStringBuilder6.append((CharSequence) " ~").append(r15);
                                                spannableStringBuilder6.setSpan(new k00(org.telegram.ui.ActionBar.m6.z6, this.J0), length3, spannableStringBuilder6.length(), 33);
                                            }
                                            r32.e(gd.N0(2131749537, null), spannableStringBuilder6, null, null);
                                        }
                                        boolean z20 = i32 == 9;
                                        if ((i32 == 3 || z20) && j12 > 0) {
                                            r113 = 0;
                                            r32.e(gd.N0(z20 ? 2131749536 : 2131749534, null), bi.y4.i(j12), null, null);
                                        } else {
                                            r113 = 0;
                                        }
                                        if (z20 && c10.i > 0) {
                                            r32.e(gd.N0(2131749535, r113), bi.y4.j(c10.i), r113, r113);
                                        }
                                        if (i32 == 5 && i31 > 0) {
                                            r32.e(gd.N0(2131749538, r113), A1(i31), r113, r113);
                                        }
                                        if (i32 == 6 && c10.k) {
                                            r32.e(gd.N0(2131749540, r113), bi.y4.i(c10.h), r113, r113);
                                        }
                                        final String str8 = c10.l;
                                        if (str8 != null && (i14 = c10.m) != 0) {
                                            final int i34 = 2;
                                            k1(r32, gd.N0(i14, r113), str8, this.J0).setOnClickListener(new View.OnClickListener(this) { // from class: di.l1
                                                public final /* synthetic */ f6 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i252 = i34;
                                                    String str72 = str8;
                                                    f6 f6Var = this.b;
                                                    switch (i252) {
                                                        case 0:
                                                            org.telegram.messenger.g0.g(str72);
                                                            f6Var.k().Q(R.raw.copy, 36, gd.N0(2131742958, null)).k(false);
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.g(str72);
                                                            f6Var.k().Q(R.raw.copy, 36, gd.N0(2131742958, null)).k(false);
                                                            break;
                                                        default:
                                                            org.telegram.messenger.g0.g(str72);
                                                            f6Var.k().Q(R.raw.copy, 36, gd.N0(2131742958, null)).k(false);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                        if (this.e3.date != 0) {
                                            r32.e(gd.N0(2131742900, null), A1(this.e3.date), null, null);
                                        }
                                    } else {
                                        z5Var = z5Var2;
                                        cls = TL_stars.starGiftAttributePattern.class;
                                        cls2 = TL_stars.starGiftAttributeBackdrop.class;
                                        cls3 = TL_stars.starGiftAttributeModel.class;
                                        long e10 = j10.i(this.a).e();
                                        this.e2.n(gd.N0(this.e3.incoming ? 2131742751 : 2131742776, null), this.a, e10, new m1(this, e10, 3));
                                        long abs3 = Math.abs(this.e3.fee);
                                        if (abs3 > 0) {
                                            TextView textView = new TextView(getContext());
                                            textView.setGravity(16);
                                            textView.setIncludeFontPadding(false);
                                            textView.setTextSize(1, f10);
                                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, this.J0);
                                            textView.setText(org.telegram.ui.Wallet.n6.z0(this.a, abs3, this.J0));
                                            r112 = 0;
                                            r32.c(textView, gd.N0(2131742876, null));
                                        } else {
                                            r112 = 0;
                                        }
                                        if (this.e3.date != 0) {
                                            r32.e(gd.N0(2131742900, r112), gd.Q(this.e3.date), r112, r112);
                                        }
                                    }
                                } else {
                                    z5Var = z5Var2;
                                    cls = TL_stars.starGiftAttributePattern.class;
                                    cls2 = TL_stars.starGiftAttributeBackdrop.class;
                                    cls3 = TL_stars.starGiftAttributeModel.class;
                                }
                                o5Var = this.L2;
                                hi.e eVar = this.g2;
                                if (o5Var != null || !o5Var.o) {
                                    if (this.e3 != null) {
                                        eVar.setFilled(true);
                                        eVar.i(gd.N0(2131747637, null), !this.a3, true);
                                        eVar.g(null, !this.a3);
                                        eVar.setOnClickListener(new i1(this, 0));
                                    } else {
                                        int i35 = 1;
                                        if (T1(tL_starGiftUnique) && t1()) {
                                            eVar.setFilled(true);
                                            eVar.i(gd.N0(2131750415, null), !this.a3, true);
                                            eVar.g(null, !this.a3);
                                            eVar.setOnClickListener(new i1(this, i35));
                                        } else {
                                            tL_starGiftUnique2 = tL_starGiftUnique;
                                            if (!R1(this.a, org.telegram.messenger.n5.o(tL_starGiftUnique2.owner_id)) && tL_starGiftUnique2.resell_amount != null && !P1(this.a, tL_starGiftUnique2)) {
                                                eVar.setFilled(true);
                                                y2(tL_starGiftUnique);
                                                eVar.setOnClickListener(new i1(this, 2));
                                            } else {
                                                if (!this.n2 || this.V1 == null || this.C2 == null || I1() < 0 || this.C2.b(I1()) < 0) {
                                                    eVar.setFilled(true);
                                                    eVar.i(gd.N0(2131747637, null), !this.a3, true);
                                                    eVar.g(null, !this.a3);
                                                    eVar.setOnClickListener(new i1(this, 3));
                                                    this.p1.setTitle(this.R2);
                                                    o5Var2 = this.L2;
                                                    if (o5Var2 != null) {
                                                        boolean z21 = this.M2;
                                                        k1 k1Var = new k1(this, 0);
                                                        k1 k1Var2 = new k1(this, 1);
                                                        ArrayList arrayList = o5Var2.f;
                                                        z5 z5Var3 = o5Var2.a;
                                                        TL_stars.TL_starGiftUnique tL_starGiftUnique4 = o5Var2.l;
                                                        if (tL_starGiftUnique4 != null && tL_starGiftUnique4.id == tL_starGiftUnique2.id) {
                                                            z12 = o5Var2.o;
                                                        } else if (z21) {
                                                            org.telegram.ui.Components.q9 upgradeImageView = z5Var3.getUpgradeImageView();
                                                            r5 r5Var = z5Var3.c;
                                                            TL_stars.starGiftAttributeModel upgradeImageViewAttribute = z5Var3.getUpgradeImageViewAttribute();
                                                            TL_stars.starGiftAttributePattern upgradePatternAttribute = z5Var3.getUpgradePatternAttribute();
                                                            TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = z5Var3.getUpgradeBackdropAttribute();
                                                            TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) y8.l(tL_starGiftUnique2.attributes, cls3);
                                                            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) y8.l(tL_starGiftUnique2.attributes, cls);
                                                            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) y8.l(tL_starGiftUnique2.attributes, cls2);
                                                            o5Var2.o = true;
                                                            o5Var2.l = tL_starGiftUnique2;
                                                            o5Var2.r = k1Var;
                                                            o5Var2.s = k1Var2;
                                                            o5Var2.t = (float) Math.random();
                                                            o5Var2.m = System.currentTimeMillis();
                                                            o5Var2.n = 0.0f;
                                                            o5Var2.p = false;
                                                            o5Var2.q = false;
                                                            o5Var2.o = true;
                                                            k5 k5Var = o5Var2.h;
                                                            if (k5Var != null) {
                                                                k5Var.a();
                                                            }
                                                            m5 m5Var = new m5(r5Var, stargiftattributemodel2);
                                                            if (r5Var.isAttachedToWindow() && m5Var.c) {
                                                                m5Var.d.P();
                                                            }
                                                            o5Var2.h = new k5(new i5(o5Var2, 0), o5Var2.e, new m5(upgradeImageView, upgradeImageViewAttribute), m5Var, 0.9f, o5Var2.t > 0.5f ? 3 : 2);
                                                            k5 k5Var2 = o5Var2.i;
                                                            if (k5Var2 != null) {
                                                                k5Var2.a();
                                                            }
                                                            o5Var2.i = new k5(new i5(o5Var2, 0), o5Var2.g, new n5(upgradePatternAttribute), new n5(stargiftattributepattern), 1.0f, o5Var2.t > 0.5f ? 2 : 1);
                                                            k5 k5Var3 = o5Var2.j;
                                                            if (k5Var3 != null) {
                                                                k5Var3.a();
                                                            }
                                                            o5Var2.j = new k5(new i5(o5Var2, 0), arrayList, new l5(upgradeBackdropAttribute), new l5(stargiftattributebackdrop), 0.5f, o5Var2.t > 0.5f ? 2 : 1);
                                                            k5 k5Var4 = o5Var2.k;
                                                            if (k5Var4 != null) {
                                                                k5Var4.a();
                                                            }
                                                            o5Var2.k = new k5(new i5(o5Var2, 0), arrayList, new l5(upgradeBackdropAttribute), new l5(stargiftattributebackdrop), 1.25f, o5Var2.t > 0.5f ? 2 : 1);
                                                            o5Var2.b();
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        if (z12) {
                                                            z5 z5Var4 = z5Var;
                                                            z5Var4.b.setAlpha(0.0f);
                                                            z5Var4.c.setAlpha(1.0f);
                                                            eVar.i(gd.N0(2131749434, null), true, true);
                                                            eVar.setFilled(true);
                                                            eVar.setOnClickListener(new i1(this, 4));
                                                            int length4 = ((f6) this.P2.d).O2.length - 1;
                                                            ek0 ek0Var = this.o1;
                                                            ek0Var.v0(length4);
                                                            ek0Var.post(new k1(this, 2));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                eVar.setFilled(false);
                                                int b10 = this.C2.b(I1());
                                                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                                spannableStringBuilder7.append((CharSequence) gd.N0(2131749838, null));
                                                Object obj2 = this.C2.get(b10);
                                                if (!(obj2 instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj2).gift) == null || (document = starGift.getDocument()) == null) {
                                                    z11 = true;
                                                } else {
                                                    spannableStringBuilder7.append((CharSequence) " e");
                                                    z11 = true;
                                                    spannableStringBuilder7.setSpan(new org.telegram.ui.Components.y5(document, eVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder7.length() - 1, spannableStringBuilder7.length(), 33);
                                                }
                                                eVar.i(spannableStringBuilder7, this.a3 ^ z11, z11);
                                                eVar.g(null, this.a3 ^ z11);
                                                eVar.setOnClickListener(new j1(this, b10, 0));
                                            }
                                            this.p1.setTitle(this.R2);
                                            o5Var2 = this.L2;
                                            if (o5Var2 != null) {
                                            }
                                        }
                                    }
                                }
                                tL_starGiftUnique2 = tL_starGiftUnique;
                                this.p1.setTitle(this.R2);
                                o5Var2 = this.L2;
                                if (o5Var2 != null) {
                                }
                            }
                        } else {
                            if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                                final String str9 = tL_starGiftUnique.owner_address;
                                k1(r32, gd.N0(2131750069, null), str9, this.J0).setOnClickListener(new View.OnClickListener(this) { // from class: di.l1
                                    public final /* synthetic */ f6 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i252 = i7;
                                        String str72 = str9;
                                        f6 f6Var = this.b;
                                        switch (i252) {
                                            case 0:
                                                org.telegram.messenger.g0.g(str72);
                                                f6Var.k().Q(R.raw.copy, 36, gd.N0(2131742958, null)).k(false);
                                                break;
                                            case 1:
                                                org.telegram.messenger.g0.g(str72);
                                                f6Var.k().Q(R.raw.copy, 36, gd.N0(2131742958, null)).k(false);
                                                break;
                                            default:
                                                org.telegram.messenger.g0.g(str72);
                                                f6Var.k().Q(R.raw.copy, 36, gd.N0(2131742958, null)).k(false);
                                                break;
                                        }
                                    }
                                });
                            } else if (o4 == 0 && tL_starGiftUnique.owner_name != null) {
                                r32.e(gd.N0(2131750069, null), tL_starGiftUnique.owner_name, null, null);
                            } else if (o4 != 0) {
                                int i36 = i7;
                                r14 = 0;
                                r13 = 0;
                                i12 = 8;
                                this.i3 = ((by0) this.e2.o(gd.N0(2131750069, null), this.a, o4, new m1(this, o4, i7)).getChildAt(i36 == true ? 1 : 0)).getChildAt(0);
                                r11 = i36;
                                l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                                l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                                l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                if (!z10) {
                                }
                                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                                if (stargiftattributeoriginaldetails != null) {
                                }
                                if (this.e3 != null) {
                                }
                                o5Var = this.L2;
                                hi.e eVar2 = this.g2;
                                if (o5Var != null) {
                                }
                                if (this.e3 != null) {
                                }
                                tL_starGiftUnique2 = tL_starGiftUnique;
                                this.p1.setTitle(this.R2);
                                o5Var2 = this.L2;
                                if (o5Var2 != null) {
                                }
                            }
                            i16 = 0;
                            str2 = null;
                            i17 = i7;
                            i10 = i17;
                            i11 = i16;
                            str = str2;
                        }
                        i12 = 8;
                        r11 = i10;
                        r13 = i11;
                        r14 = str;
                        l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                        l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                        l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        if (!z10) {
                        }
                        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                        if (stargiftattributeoriginaldetails != null) {
                        }
                        if (this.e3 != null) {
                        }
                        o5Var = this.L2;
                        hi.e eVar22 = this.g2;
                        if (o5Var != null) {
                        }
                        if (this.e3 != null) {
                        }
                        tL_starGiftUnique2 = tL_starGiftUnique;
                        this.p1.setTitle(this.R2);
                        o5Var2 = this.L2;
                        if (o5Var2 != null) {
                        }
                    } else {
                        charSequence2 = stargiftattributemodel.name;
                    }
                }
                charSequence = charSequence2;
                if (tL_textWithEntities != null) {
                }
                spannable = null;
                z5Var2.h(0, spannableStringBuilder, charSequence, q2(tL_starGiftUnique.released_by), null, tLObject, spannable);
                this.i3 = null;
                ?? r322 = this.e2;
                r322.removeAllViews();
                if (z10) {
                }
                i12 = 8;
                r11 = i10;
                r13 = i11;
                r14 = str;
                l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                if (!z10) {
                }
                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                if (stargiftattributeoriginaldetails != null) {
                }
                if (this.e3 != null) {
                }
                o5Var = this.L2;
                hi.e eVar222 = this.g2;
                if (o5Var != null) {
                }
                if (this.e3 != null) {
                }
                tL_starGiftUnique2 = tL_starGiftUnique;
                this.p1.setTitle(this.R2);
                o5Var2 = this.L2;
                if (o5Var2 != null) {
                }
            }
        } else {
            N0 = org.telegram.ui.Wallet.f3.c(this.e3).e();
        }
        charSequence = N0;
        i7 = 1;
        if (tL_textWithEntities != null) {
        }
        spannable = null;
        z5Var2.h(0, spannableStringBuilder, charSequence, q2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        this.i3 = null;
        ?? r3222 = this.e2;
        r3222.removeAllViews();
        if (z10) {
        }
        i12 = 8;
        r11 = i10;
        r13 = i11;
        r14 = str;
        l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
        l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        l1(y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z10) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
        }
        if (this.e3 != null) {
        }
        o5Var = this.L2;
        hi.e eVar2222 = this.g2;
        if (o5Var != null) {
        }
        if (this.e3 != null) {
        }
        tL_starGiftUnique2 = tL_starGiftUnique;
        this.p1.setTitle(this.R2);
        o5Var2 = this.L2;
        if (o5Var2 != null) {
        }
    }

    public final void y2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        hi.e eVar = this.g2;
        if (z10) {
            eVar.i(pb.t1(pb.V0(gd.a0(null, null, 2131745950, tL_starGiftUnique.getResellAmount(cg.b.b).d()), true), true), !this.a3, true);
            eVar.g(bi.y4.m(tL_starGiftUnique) ? null : pb.T0(gd.H(',', "ResellGiftBuyEq", (int) resellAmount.a())), !this.a3);
        } else {
            eVar.i(pb.T0(gd.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.a3, true);
            eVar.g(null, !this.a3);
        }
    }

    public final void z2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10) {
        if (z10) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = j10.i(this.a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= TLObject.FLAG_12;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.b2.setWalletDisplayed(z10);
        L2();
    }
}
