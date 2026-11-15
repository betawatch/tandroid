package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.mg0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class c6 extends org.telegram.ui.Components.ja implements is {
    public static final /* synthetic */ int w3 = 0;
    public boolean A2;
    public TL_stars.SavedStarGift B2;
    public m8 C2;
    public gj D2;
    public String E2;
    public TL_stars.TL_starGiftUnique F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public boolean K2;
    public l5 L2;
    public boolean M2;
    public j4 N2;
    public final int[] O2;
    public i4 P2;
    public int Q2;
    public String R2;
    public bi.y5 S2;
    public final long T1;
    public eq T2;
    public final k4 U1;
    public boolean U2;
    public final e4 V1;
    public x3 V2;
    public final nz W1;
    public Float W2;
    public final View X1;
    public b5 X2;
    public bi.b2 Y1;
    public ValueAnimator Y2;
    public bi.b2 Z1;
    public eq Z2;
    public final h4 a2;
    public boolean a3;
    public final w5 b2;
    public TL_wallet.nftItem b3;
    public final g4 c2;
    public org.telegram.ui.Wallet.g5 c3;
    public final z70 d2;
    public org.telegram.ui.Wallet.h5 d3;
    public final vx0 e2;
    public TL_wallet.walletTransaction e3;
    public final z70 f2;
    public View f3;
    public final hi.d g2;
    public bi.o3 g3;
    public final FrameLayout h2;
    public boolean h3;
    public final z70 i2;
    public Boolean i3;
    public final FrameLayout j2;
    public boolean j3;
    public final View k2;
    public ArrayList k3;
    public final FrameLayout l2;
    public ArrayList l3;
    public y5 m2;
    public ArrayList m3;
    public boolean n2;
    public boolean n3;
    public final g4 o2;
    public TLRPC.PaymentForm o3;
    public final ki.j[] p2;
    public final eq[] p3;
    public final View q2;
    public final l1 q3;
    public final LinearLayout r2;
    public int r3;
    public final fp s2;
    public Boolean s3;
    public final TextView t2;
    public boolean t3;
    public final LinearLayout u2;
    public hi.l3 u3;
    public final fp v2;
    public View v3;
    public boolean w2;
    public final g4 x2;
    public final TextView y2;
    public final g4 z2;

    public c6(Context context, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        super(context, null, false, false, e6Var);
        this.n2 = false;
        this.O2 = new int[2];
        this.Q2 = -1;
        this.R2 = "";
        this.X2 = new b5(0, 0);
        this.a3 = true;
        this.p3 = new eq[1];
        this.q3 = new l1(this, 11);
        this.t3 = true;
        this.a = i7;
        this.T1 = j3;
        this.v1 = Math.max(0.05f, org.telegram.messenger.g0.L(82.0f) / (org.telegram.messenger.g0.q.y + org.telegram.messenger.g0.m));
        this.x = true;
        this.b = new bi.g2(2, context, this);
        k4 k4Var = new k4(this, context);
        this.U1 = k4Var;
        e4 e4Var = new e4(this, context);
        this.V1 = e4Var;
        e4Var.setAdapter(new f4(0, context, this));
        w2();
        View view2 = new View(context);
        this.X1 = view2;
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        org.telegram.ui.ActionBar.q6.h(i10, view2, e6Var);
        FrameLayout.LayoutParams e10 = c8.ja.e(-1, 50, 80);
        int i11 = this.u0;
        e10.rightMargin = i11;
        e10.leftMargin = i11;
        this.b.addView(view2, e10);
        this.b.addView(e4Var, c8.ja.e(-1, -1, ns.E1));
        Q(i10);
        org.telegram.messenger.g0.E2(this.o1);
        k4Var.addView(this.o1, c8.ja.e(-1, -1, ns.E1));
        g4 g4Var = new g4(this, context, 0);
        this.c2 = g4Var;
        g4Var.setOrientation(1);
        g4Var.setPadding(org.telegram.messenger.g0.L(14.0f) + this.u0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f) + this.u0, org.telegram.messenger.g0.L(68.0f));
        k4Var.addView(g4Var, c8.ja.e(-1, -1, 55));
        z70 z70Var = new z70(context, e6Var);
        this.d2 = z70Var;
        int i12 = org.telegram.ui.ActionBar.j6.q5;
        org.telegram.ui.ActionBar.q6.U(z70Var, i12, e6Var);
        z70Var.setTextSize(1, 12.0f);
        z70Var.setGravity(17);
        z70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        z70Var.setDisablePaddingsOffsetY(true);
        g4Var.addView(z70Var, c8.ja.t(-2, -2, 1, 4, -2, 4, 16));
        z70Var.setVisibility(8);
        vx0 vx0Var = new vx0(context, e6Var);
        this.e2 = vx0Var;
        g4Var.addView(vx0Var, c8.ja.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        z70 z70Var2 = new z70(context, e6Var);
        this.f2 = z70Var2;
        org.telegram.ui.ActionBar.q6.U(z70Var2, i12, e6Var);
        z70Var2.setTextSize(1, 12.0f);
        z70Var2.setGravity(17);
        z70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.q6.G(z70Var2, i13, e6Var);
        z70Var2.setDisablePaddingsOffsetY(true);
        z70Var2.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        g4Var.addView(z70Var2, c8.ja.t(-2, -2, 1, 4, 2, 4, 8));
        z70Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.u2 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i14, e6Var), 21, 21);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(linearLayout, a02, null, M, e6Var);
        fp fpVar = new fp(24, context, e6Var);
        this.v2 = fpVar;
        int i15 = org.telegram.ui.ActionBar.j6.h7;
        int i16 = org.telegram.ui.ActionBar.j6.j7;
        int i17 = org.telegram.ui.ActionBar.j6.k7;
        fpVar.b(i15, i16, i17);
        fpVar.setDrawUnchecked(true);
        fpVar.a(false, false);
        fpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(fpVar, c8.ja.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i18 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(textView, i18, e6Var);
        i5.c.w(textView, 1, 14.0f, null, 2131750389);
        linearLayout.addView(textView, c8.ja.t(-2, -2, 16, 9, 0, 0, 0));
        g4Var.addView(linearLayout, c8.ja.t(-2, -2, 1, 0, -4, 0, 4));
        c8.na.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new k1(this, 18));
        linearLayout.setVisibility(8);
        g4 g4Var2 = new g4(this, context, 1);
        this.o2 = g4Var2;
        g4Var2.setOrientation(1);
        g4Var2.setPadding(org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(66.0f));
        k4Var.addView(g4Var2, c8.ja.e(-1, -1, 55));
        ki.j[] jVarArr = {r9, r6, r6};
        this.p2 = jVarArr;
        ki.j jVar = new ki.j(context, e6Var, false);
        jVar.a(R.drawable.menu_feature_unique, hd.M0(2131749865, null), hd.M0(2131749575, null));
        g4Var2.addView(jVarArr[0], c8.ja.o(-1, -2));
        ki.j jVar2 = new ki.j(context, e6Var, false);
        jVar2.a(R.drawable.menu_feature_tradable, hd.M0(2131749859, null), hd.M0(2131749573, null));
        g4Var2.addView(jVarArr[1], c8.ja.o(-1, -2));
        ki.j jVar3 = new ki.j(context, e6Var, false);
        jVar3.a(R.drawable.menu_wear, hd.M0(2131749570, null), hd.M0(2131749571, null));
        g4Var2.addView(jVarArr[2], c8.ja.o(-1, -2));
        View view3 = new View(context);
        this.q2 = view3;
        int i19 = org.telegram.ui.ActionBar.j6.d7;
        org.telegram.ui.ActionBar.q6.h(i19, view3, e6Var);
        g4Var2.addView(view3, c8.ja.n(1.0f / org.telegram.messenger.g0.p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.r2 = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i14, e6Var), 6, 6);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i14);
        linearLayout2.setBackground(a03);
        org.telegram.ui.ActionBar.q6.j(linearLayout2, a03, null, M2, e6Var);
        fp fpVar2 = new fp(24, context, e6Var);
        this.s2 = fpVar2;
        fpVar2.b(i15, i16, i17);
        fpVar2.setDrawUnchecked(true);
        fpVar2.a(false, false);
        fpVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(fpVar2, c8.ja.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.t2 = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, i18, e6Var);
        i5.c.w(textView2, 1, 14.0f, null, 2131750397);
        linearLayout2.addView(textView2, c8.ja.t(-2, -2, 16, 9, 0, 0, 0));
        g4Var2.addView(linearLayout2, c8.ja.t(-2, -2, 1, 0, 0, 0, 4));
        c8.na.b(linearLayout2, 0.025f, 1.5f);
        g4 g4Var3 = new g4(this, context, 2);
        this.x2 = g4Var3;
        g4Var3.setOrientation(1);
        g4Var3.setPadding(org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(66.0f));
        k4Var.addView(g4Var3, c8.ja.e(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.y2 = textView3;
        org.telegram.ui.ActionBar.q6.U(textView3, i18, e6Var);
        textView3.setTextSize(1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        g4Var3.addView(textView3, c8.ja.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView4, i18, e6Var);
        textView4.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.l(textView4, 17, null, 2131749834);
        g4Var3.addView(textView4, c8.ja.t(-1, -2, 7, 20, 6, 20, 24));
        ki.j jVar4 = new ki.j(context, e6Var, false);
        jVar4.a(R.drawable.menu_feature_unique, hd.M0(2131749840, null), hd.M0(2131749841, null));
        g4Var3.addView(r6[0], c8.ja.o(-1, -2));
        ki.j jVar5 = new ki.j(context, e6Var, false);
        jVar5.a(R.drawable.menu_feature_cover, hd.M0(2131749838, null), hd.M0(2131749839, null));
        g4Var3.addView(r6[1], c8.ja.o(-1, -2));
        ki.j jVar6 = new ki.j(context, e6Var, false);
        ki.j[] jVarArr2 = {jVar4, jVar5, jVar6};
        jVar6.a(R.drawable.menu_verification, hd.M0(2131749836, null), hd.M0(2131749837, null));
        g4Var3.addView(jVarArr2[2], c8.ja.o(-1, -2));
        g4 g4Var4 = new g4(this, context, 3);
        this.z2 = g4Var4;
        g4Var4.setOrientation(1);
        g4Var4.setPadding(org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(92.0f));
        k4Var.addView(g4Var4, c8.ja.e(-1, -1, 55));
        ki.j jVar7 = new ki.j(context, e6Var, false);
        jVar7.a(R.drawable.menu_feature_unique, hd.M0(2131749785, null), hd.M0(2131749786, null));
        g4Var4.addView(r8[0], c8.ja.o(-1, -2));
        ki.j jVar8 = new ki.j(context, e6Var, false);
        jVar8.a(R.drawable.menu_random, hd.M0(2131749783, null), hd.M0(2131749784, null));
        g4Var4.addView(r8[1], c8.ja.o(-1, -2));
        ki.j jVar9 = new ki.j(context, e6Var, false);
        ki.j[] jVarArr3 = {jVar7, jVar8, jVar9};
        jVar9.a(R.drawable.menu_feature_affect, hd.M0(2131749781, null), hd.M0(2131749782, null));
        g4Var4.addView(jVarArr3[2], c8.ja.o(-1, -2));
        g4Var.setAlpha(1.0f);
        g4Var2.setAlpha(0.0f);
        g4Var3.setAlpha(0.0f);
        g4Var4.setAlpha(0.0f);
        w5 w5Var = new w5(context, e6Var, new l1(this, 12), new k1(this, 19), new k1(this, 20), new k1(this, 21), new k1(this, 22), new k1(this, 23), new k1(this, 24), new k1(this, 25));
        this.b2 = w5Var;
        w5Var.N.c.setOnClickListener(new k1(this, 16));
        int i20 = this.u0;
        w5Var.setPadding(i20, 0, i20, 0);
        k4Var.addView(w5Var, c8.ja.e(-1, -2, 55));
        jg.b0 b0Var = this.n1;
        this.K1 = true;
        b0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h2 = frameLayout;
        org.telegram.ui.ActionBar.q6.h(i10, frameLayout, e6Var);
        View view4 = new View(context);
        this.k2 = view4;
        org.telegram.ui.ActionBar.q6.h(i19, view4, e6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, c8.ja.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
        hi.d g10 = i20.g(24, context, e6Var, true);
        this.g2 = g10;
        g10.i(hd.M0(2131747831, null), false, true);
        g10.g(null, false);
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, ns.E1, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = org.telegram.messenger.g0.L(14.0f) + this.u0;
        d.rightMargin = org.telegram.messenger.g0.L(14.0f) + this.u0;
        frameLayout.addView(g10, d);
        k4Var.addView(frameLayout, c8.ja.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.j2 = frameLayout2;
        org.telegram.ui.ActionBar.q6.h(i10, frameLayout2, e6Var);
        z70 z70Var3 = new z70(context, null);
        this.i2 = z70Var3;
        z70Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var3, i13, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var3, i13, e6Var);
        z70Var3.setGravity(17);
        frameLayout2.addView(z70Var3, c8.ja.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        k4Var.addView(frameLayout2, c8.ja.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.o1.setOnScrollListener(new bi.z4(this, 8));
        linearLayout2.setOnClickListener(new k1(this, 17));
        nz nzVar = new nz(context);
        this.W1 = nzVar;
        k4Var.addView(nzVar, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.l2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(6.0f) + this.u0, 0, org.telegram.messenger.g0.L(6.0f) + this.u0, 0);
        k4Var.addView(frameLayout3, c8.ja.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        org.telegram.messenger.g0.E2(this.p1);
        k4Var.addView(this.p1, c8.ja.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        h4 h4Var = new h4(context);
        this.a2 = h4Var;
        k4Var.addView(h4Var, c8.ja.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        org.telegram.messenger.g0.m2(new ai.g0(h4Var, 10), 12.0f, 12, arrayList);
    }

    public static String A1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? hd.M0(2131750192, null) : starGift.title;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb2.append(" #");
        return i5.c.l(r3.num, ',', sb2);
    }

    public static String G1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return hd.M0(2131749619, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return hd.M0(2131749620, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return hd.M0(2131749622, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return hd.M0(2131749621, null);
        }
        if (!(starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
            return "";
        }
        int i7 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        return i7 <= 0 ? "<0.1%" : ki.k.J0(i7);
    }

    public static boolean K1(int i7, long j3) {
        return j3 >= 0 ? m10.i(i7).e() == j3 : org.telegram.messenger.t3.w(5, np.s1(i7).M0(Long.valueOf(-j3)));
    }

    public static boolean L1(int i7, long j3) {
        if (j3 >= 0) {
            return m10.i(i7).e() == j3;
        }
        TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
        return M0 != null && M0.creator;
    }

    public static boolean M1(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long o4 = org.telegram.messenger.m5.o(peer);
        if (o4 == 0) {
            return false;
        }
        if (o4 > 0) {
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(o4));
            if (a22 != null) {
                TLRPC.EmojiStatus emojiStatus = a22.emoji_status;
                return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
            }
        } else {
            TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-o4));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = M0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void d1(c6 c6Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        j8 F;
        TLRPC.Message message;
        hi.d dVar = c6Var.g2;
        if (dVar.R) {
            return;
        }
        TL_stars.InputSavedStarGift B1 = c6Var.B1();
        gj gjVar = c6Var.D2;
        if (gjVar == null || (message = gjVar.k) == null) {
            TL_stars.SavedStarGift savedStarGift = c6Var.B2;
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
        dVar.setLoading(true);
        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.unsave = z12;
        savestargift.stargift = B1;
        if (c6Var.B2 == null || (F = u8.y(c6Var.a, false).F(c6Var.T1, false)) == null) {
            z11 = false;
        } else {
            F.m(c6Var.B2, savestargift.unsave);
            z11 = true;
        }
        ConnectionsManager.getInstance(c6Var.a).sendRequest(savestargift, new u3(c6Var, z11, document2, z12, savestargift));
    }

    public static void d2(org.telegram.ui.ActionBar.e2 e2Var) {
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2();
        c2Var.a = true;
        T.showAsSheet(e2Var, c2Var);
    }

    public static void e1(final c6 c6Var) {
        int i7;
        long o4;
        long j3;
        long j10;
        final long e10 = m10.i(c6Var.a).e();
        final TL_stars.InputSavedStarGift B1 = c6Var.B1();
        if (B1 == null) {
            return;
        }
        gj gjVar = c6Var.D2;
        if (gjVar != null) {
            i7 = gjVar.k.date;
            boolean P3 = gjVar.P3();
            TLRPC.Message message = c6Var.D2.k;
            if (message == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGift.peer;
            j10 = peer != null ? org.telegram.messenger.m5.o(peer) : P3 ? gj.B0(message) : e10;
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            o4 = peer2 != null ? org.telegram.messenger.m5.o(peer2) : P3 ? e10 : gj.B0(c6Var.D2.k);
            j3 = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = c6Var.B2;
            if (savedStarGift == null) {
                return;
            }
            i7 = savedStarGift.date;
            o4 = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? 2666000L : org.telegram.messenger.m5.o(savedStarGift.from_id);
            j3 = c6Var.B2.convert_stars;
            j10 = c6Var.T1;
        }
        int max = Math.max(1, (np.s1(c6Var.a).F6 - (ConnectionsManager.getInstance(c6Var.a).getCurrentTime() - i7)) / 86400);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, c6Var.getContext(), c6Var.J0);
        String M0 = hd.M0(2131750226, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.g0.X2(hd.G(max, "Gift2ConvertText2", (q10.A(o4) || o4 == 2666000) ? hd.M0(2131744949, null) : org.telegram.messenger.m5.t(o4), hd.H(',', "Gift2ConvertStars", (int) j3)));
        final long j11 = j3;
        final long j12 = j10;
        alertDialog$Builder.k(hd.M0(2131750233, null), new org.telegram.ui.ActionBar.q1() { // from class: di.r3
            @Override // org.telegram.ui.ActionBar.q1
            public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                c6 c6Var2 = c6.this;
                TL_stars.InputSavedStarGift inputSavedStarGift = B1;
                long j13 = j12;
                long j14 = e10;
                long j15 = j11;
                org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, org.telegram.messenger.t0.b, null);
                t1Var3.r(500L);
                TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
                convertstargift.stargift = inputSavedStarGift;
                ConnectionsManager.getInstance(c6Var2.a).sendRequest(convertstargift, new c2(c6Var2, t1Var3, j13, j14, j15));
            }
        });
        i5.c.x(null, 2131752589, alertDialog$Builder, null);
    }

    public static void f1(c6 c6Var, org.telegram.ui.ActionBar.t1 t1Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            t1Var.dismiss();
            c6Var.K2 = true;
            c6Var.k2(savedStarGift, null);
            super.show();
            return;
        }
        t1Var.dismiss();
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T != null) {
            org.telegram.ui.Components.xb Q = org.telegram.ui.Components.cc.a0(T).Q(R.raw.error, 36, hd.M0(2131748552, null));
            Q.t = true;
            Q.j();
        }
    }

    public static void g1(c6 c6Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        c6Var.F2 = tL_starGiftUnique;
        c6Var.l2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static SpannableStringBuilder g2(String str) {
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
            spannableStringBuilder.setSpan(new b4(0), indexOf, i7 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void h1(c6 c6Var, org.telegram.ui.ActionBar.t1 t1Var, gj gjVar) {
        t1Var.dismiss();
        c6Var.I2 = true;
        c6Var.j2(gjVar, null);
        super.show();
    }

    public static SpannableStringBuilder h2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new eq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new eq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "👌");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString2, "👍");
        return spannableStringBuilder;
    }

    public static void i1(c6 c6Var, boolean z10) {
        int D1 = c6Var.D1();
        if (D1 < 0) {
            return;
        }
        int i7 = (z10 ? 1 : -1) + D1;
        int i10 = c6Var.Q2;
        if (i10 >= 0 && (!z10 ? i10 < D1 : i10 > D1)) {
            i7 = i10;
        }
        m8 m8Var = c6Var.C2;
        Object obj = (m8Var == null || i7 < 0 || i7 >= m8Var.e()) ? null : c6Var.C2.get(i7);
        if (obj == null) {
            return;
        }
        if ((z10 ? c6Var.Z1 : c6Var.Y1) != null) {
            if (obj instanceof TL_stars.SavedStarGift) {
                if (u1((z10 ? c6Var.Z1 : c6Var.Y1).B2, (TL_stars.SavedStarGift) obj)) {
                    return;
                }
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                if (v1((z10 ? c6Var.Z1 : c6Var.Y1).F2, (TL_stars.TL_starGiftUnique) obj)) {
                    return;
                }
            }
        }
        bi.b2 b2Var = new bi.b2(c6Var, c6Var.getContext(), c6Var.a, c6Var.T1, c6Var.J0, c6Var.U1.getRootView());
        if (obj instanceof TL_stars.SavedStarGift) {
            b2Var.k2((TL_stars.SavedStarGift) obj, c6Var.C2);
        } else if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            b2Var.i2(tL_starGiftUnique.slug, tL_starGiftUnique, c6Var.C2);
        }
        org.telegram.messenger.g0.E2(b2Var.b);
        if (z10) {
            c6Var.Z1 = b2Var;
        } else {
            c6Var.Y1 = b2Var;
        }
    }

    public static void k1(vx0 vx0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = hd.M0(2131750387, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = hd.M0(2131750380, null);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            M0 = hd.M0(2131750388, null);
        }
        String str = M0;
        Integer[] numArr = new Integer[1];
        vx0Var.e(str, starGiftAttribute.name, G1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static boolean u1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
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

    public static boolean v1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique != null) {
            return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
        }
        return false;
    }

    public final TL_stars.InputSavedStarGift B1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j3 = this.T1;
        if (j3 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = np.s1(this.a).j1(j3);
            gj gjVar = this.D2;
            if (gjVar == null || (message3 = gjVar.k) == null) {
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
        gj gjVar2 = this.D2;
        if (gjVar2 != null && (message2 = gjVar2.k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & TLObject.FLAG_12) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                np s12 = np.s1(this.a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                tL_inputSavedStarGiftChat2.peer = s12.j1(peer != null ? org.telegram.messenger.m5.o(peer) : gj.B0(this.D2.k));
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (gjVar2 != null && (message = gjVar2.k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                np s13 = np.s1(this.a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                tL_inputSavedStarGiftChat3.peer = s13.j1(peer2 != null ? org.telegram.messenger.m5.o(peer2) : gj.B0(this.D2.k));
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        gj gjVar3 = this.D2;
        if (gjVar3 != null) {
            TLRPC.Message message4 = gjVar3.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = gjVar3.e1();
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

    public final String C1() {
        TL_stars.StarGift y12 = y1();
        if (!(y12 instanceof TL_stars.TL_starGiftUnique) || y12.slug == null) {
            return null;
        }
        return np.s1(this.a).V2 + "/nft/" + y12.slug;
    }

    public final int D1() {
        int indexOf;
        m8 m8Var = this.C2;
        if (m8Var == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.B2;
        if (savedStarGift != null) {
            indexOf = m8Var.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = m8Var.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift y12 = y1();
        for (int i7 = 0; i7 < this.C2.e(); i7++) {
            Object obj = this.C2.get(i7);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.B2;
                if (savedStarGift2 != null) {
                    if (u1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                        return i7;
                    }
                }
                if (y12 != null) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (y12 != starGift) {
                        if ((y12 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && y12.id == starGift.id) {
                        }
                    }
                    return i7;
                }
                continue;
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && v1(this.F2, (TL_stars.TL_starGiftUnique) obj)) {
                    return i7;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void E0(int i7) {
        super.E0(i7);
        org.telegram.messenger.g0.t3(this, 0, false, null);
    }

    public final TL_stars.SavedStarGift E1(boolean z10) {
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        int i7 = (z10 ? 1 : -1) + D1;
        int i10 = this.Q2;
        if (i10 >= 0 && (!z10 ? i10 < D1 : i10 > D1)) {
            i7 = i10;
        }
        m8 m8Var = this.C2;
        Object obj = (m8Var == null || i7 < 0 || i7 >= m8Var.e()) ? null : this.C2.get(i7);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique F1(boolean z10) {
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        int i7 = (z10 ? 1 : -1) + D1;
        int i10 = this.Q2;
        if (i10 >= 0 && (!z10 ? i10 < D1 : i10 > D1)) {
            i7 = i10;
        }
        m8 m8Var = this.C2;
        Object obj = (m8Var == null || i7 < 0 || i7 >= m8Var.e()) ? null : this.C2.get(i7);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.ja, org.telegram.ui.ActionBar.u2
    public final boolean H() {
        if (this.X2.c(4)) {
            boolean z10 = this.b2.N.i0;
        }
        return false;
    }

    public final TL_stars.TL_starGiftUnique H1() {
        TL_stars.StarGift y12 = y1();
        if (y12 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) y12;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean I() {
        if (this.X2.c(4) && this.b2.N.i0) {
            return false;
        }
        return this.d0;
    }

    public final boolean I1(boolean z10) {
        return (E1(z10) == null && F1(z10) == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean J(MotionEvent motionEvent) {
        if (this.X2.c(4)) {
            boolean z10 = this.b2.N.i0;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, t2 t2Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null) {
            if (t2Var != null) {
                t2Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z10) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.t3;
            withdrawstargift.stargift = B1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = B1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftwithdrawalurl, new f3(this, t2Var, twoStepVerificationActivity, z10, 0));
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        i4 i4Var = new i4(this, 0);
        this.P2 = i4Var;
        return i4Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final int N0() {
        return org.telegram.messenger.g0.L(12.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r4 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N1() {
        long e10;
        TL_stars.TL_starGiftUnique H1 = H1();
        hi.d dVar = this.g2;
        if (dVar.R || H1 == null) {
            return;
        }
        if (this.F2 != null && this.G2) {
            e10 = this.T1;
        }
        e10 = m10.i(this.a).e();
        cg.b bVar = H1.resale_ton_only ? cg.b.b : cg.b.a;
        if (this.F2 == null || !this.G2) {
            dVar.setLoading(true);
            long j3 = e10;
            u8.x(this.a, bVar).H(H1, j3, null, true, new t1(this, null, bVar, H1, j3, null, true));
        } else {
            bi.f1 f1Var = new bi.f1(getContext(), this.J0, H1, e10);
            f1Var.F1 = new o3(this, f1Var, H1, e10, bVar, 0);
            f1Var.show();
        }
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return this.R2;
    }

    public final void O1() {
        x3 x3Var = this.V2;
        if (x3Var != null && !x3Var.J) {
            x3Var.dismiss();
        }
        String C1 = C1();
        x3 x3Var2 = new x3(this, getContext(), C1, C1, this.J0);
        this.V2 = x3Var2;
        x3Var2.o2 = new d6.i(this, 13);
        x3Var2.show();
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
    public final void P1() {
        TL_stars.TL_starGiftUnique H1;
        this.c2.setAlpha(this.X2.a(0));
        this.o2.setAlpha(this.X2.a(1));
        this.x2.setAlpha(this.X2.a(2));
        this.z2.setAlpha(this.X2.a(3));
        float a10 = 1.0f - this.X2.a(4);
        FrameLayout frameLayout = this.h2;
        frameLayout.setAlpha(a10);
        b5 b5Var = this.X2;
        w5 w5Var = this.b2;
        w5Var.d(b5Var);
        ImageView imageView = w5Var.R;
        if (this.X2.c(0) && (H1 = H1()) != null && !H1.crafted && L1(this.a, org.telegram.messenger.m5.o(H1.owner_id))) {
            gj gjVar = this.D2;
            if (gjVar != null) {
                TLRPC.Message message = gjVar.k;
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
            k4 k4Var = this.U1;
            float f10 = k4Var.f();
            this.a2.setAlpha(this.X2.a(0) * Utilities.l(org.telegram.messenger.g0.z1(f10 - r6.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f))));
            k4Var.g();
            k4Var.invalidate();
            frameLayout.setVisibility(this.X2.c(4) ? 8 : 0);
            v2();
        }
        int i7 = 8;
        imageView.setVisibility(i7);
        k4 k4Var2 = this.U1;
        float f102 = k4Var2.f();
        this.a2.setAlpha(this.X2.a(0) * Utilities.l(org.telegram.messenger.g0.z1(f102 - r6.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f))));
        k4Var2.g();
        k4Var2.invalidate();
        frameLayout.setVisibility(this.X2.c(4) ? 8 : 0);
        v2();
    }

    public final void Q1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        int i7;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            org.telegram.ui.Components.cc.b0("NULL_ERROR");
            return;
        }
        int i10 = 1;
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getPassword(), new j3(this, twoStepVerificationActivity, z10, i10), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
            }
            org.telegram.ui.Components.cc.d0(tL_error);
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.t0();
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = hd.M0(2131749900, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(getContext());
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(textView, i11, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((hd.a0 ? 5 : 3) | 48);
        textView.setText(org.telegram.messenger.g0.X2(hd.M0(2131749904, null)));
        linearLayout.addView(textView, c8.ja.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView, i11, null, mode);
        TextView textView2 = new TextView(getContext());
        org.telegram.ui.ActionBar.q6.U(textView2, i11, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((hd.a0 ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.g0.X2(hd.M0(2131749903, null)));
        if (hd.a0) {
            linearLayout2.addView(textView2, c8.ja.o(-1, -2));
            linearLayout2.addView(imageView, c8.ja.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, c8.ja.o(-2, -2));
            linearLayout2.addView(textView2, c8.ja.o(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        org.telegram.ui.ActionBar.q6.s(imageView2, i11, null, mode);
        TextView textView3 = new TextView(getContext());
        org.telegram.ui.ActionBar.q6.U(textView3, i11, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((hd.a0 ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.g0.X2(hd.M0(2131749902, null)));
        if (hd.a0) {
            linearLayout3.addView(textView3, c8.ja.o(-1, -2));
            i7 = 5;
            linearLayout3.addView(imageView2, c8.ja.r(-2, -2, 5));
        } else {
            i7 = 5;
            linearLayout3.addView(imageView2, c8.ja.o(-2, -2));
            linearLayout3.addView(textView3, c8.ja.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(hd.M0(2131749899, null), new o(this, 2));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
        } else {
            TextView textView4 = new TextView(getContext());
            org.telegram.ui.ActionBar.q6.U(textView4, i11, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.k5.l(textView4, (hd.a0 ? i7 : 3) | 48, null, 2131749901);
            linearLayout.addView(textView4, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(hd.M0(2131747831, null), null);
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.showDialog(t1Var);
        } else {
            alertDialog$Builder.p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R1() {
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
        org.telegram.ui.Wallet.g5 g5Var = this.c3;
        if (g5Var == null) {
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.e2) g5Var.c).currentAccount;
        if (!org.telegram.ui.Wallet.c8.F(i7, g5Var.a.slug)) {
            org.telegram.ui.Wallet.g5 g5Var2 = this.c3;
            org.telegram.ui.Wallet.c8 c8Var = g5Var2.c.k0;
            if (c8Var == null || (nftitem = g5Var2.b) == null || (str5 = nftitem.address) == null || !str5.equals(c8Var.Q0)) {
                Context context = getContext();
                int i11 = this.a;
                org.telegram.ui.Components.cc k10 = k();
                org.telegram.ui.ActionBar.e6 e6Var = this.J0;
                TL_stars.TL_starGiftUnique H1 = H1();
                ArrayList arrayList = new ArrayList(((org.telegram.messenger.o0) np.s1(i11).y7.m0.b).c);
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
                    if (H1 == null || (str4 = H1.title) == null || !lowerCase.equals(str4.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(locale))) {
                        u8 y10 = u8.y(i11, z10);
                        y10.U();
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
                        spannableString.setSpan(new a4(new boolean[1], i11, context, e6Var, j3, str9, str6), 0, spannableString.length(), 33);
                        arrayList2.add(spannableString);
                        z10 = 0;
                        i12 = i13;
                    } else {
                        str3 = H1.title;
                        j10 = H1.gift_id;
                        i10 = i11;
                    }
                    str = str3;
                    j3 = j10;
                    if (str != null) {
                    }
                    String str92 = str;
                    SpannableString spannableString2 = new SpannableString(str92);
                    i11 = i10;
                    spannableString2.setSpan(new a4(new boolean[1], i11, context, e6Var, j3, str92, str6), 0, spannableString2.length(), 33);
                    arrayList2.add(spannableString2);
                    z10 = 0;
                    i12 = i13;
                }
                int i16 = z10;
                if (arrayList2.size() == 1) {
                    Object[] objArr = new Object[1];
                    objArr[i16] = arrayList2.get(i16);
                    V = hd.V(null, null, 2131743107, objArr);
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
                    V = hd.V(null, null, 2131743108, spannableStringBuilder, i5.c.h(1, arrayList2));
                }
                org.telegram.ui.Components.xb M = k10.M(context.getResources().getDrawable(R.drawable.filled_card_color_28).mutate(), V);
                org.telegram.ui.Components.cb cbVar = M.e;
                if (cbVar instanceof org.telegram.ui.Components.fb) {
                    TextView textView = ((org.telegram.ui.Components.fb) cbVar).b;
                    textView.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                    textView.setEllipsize(null);
                }
                M.j();
                return;
            }
        }
        org.telegram.ui.Wallet.g5 g5Var3 = this.c3;
        dismiss();
        Objects.requireNonNull(g5Var3);
        org.telegram.messenger.g0.i3(new ch.w(g5Var3, 12), 250L);
    }

    public final void S1() {
        if (m10.i(this.a).q() && (M1(this.a, H1()) || this.U2)) {
            u2(false);
            return;
        }
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        TLRPC.Peer peer = H1.owner_id;
        if (peer == null) {
            peer = H1.host_id;
        }
        long o4 = org.telegram.messenger.m5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(H1.title);
        sb2.append(" #");
        this.y2.setText(hd.a0(null, null, 2131749833, i5.c.l(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131749835, null));
        if (!m10.i(this.a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.T2 == null) {
                this.T2 = new eq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.T2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        hi.d dVar = this.g2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new k1(this, 3));
        this.b2.setWearPreview(np.s1(this.a).e2(o4));
        t2(2, true, null);
    }

    public final void T1(boolean z10) {
        int i7;
        gj gjVar = this.D2;
        int i10 = 0;
        if (gjVar != null) {
            TLRPC.Message message = gjVar.k;
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
            String M0 = hd.M0(2131749777, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = hd.a0(null, null, 2131749778, hd.x(i7, true));
            i5.c.C(null, 2131747831, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(H1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getContext(), this.J0);
            String M02 = hd.M0(2131749792, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            t1Var2.S = M02;
            t1Var2.U = hd.M0(2131749793, null);
            i5.c.C(null, 2131747831, alertDialog$Builder2, null);
            return;
        }
        w5 w5Var = this.b2;
        if (z10) {
            w5Var.N.a(this.a, H1.gift_id, H1.getDocument(), H1.title);
            if (o1()) {
                y4 y4Var = w5Var.N;
                TL_stars.TL_starGiftUnique H12 = H1();
                if (H12 == null) {
                    y4Var.getClass();
                } else {
                    while (true) {
                        w4[] w4VarArr = y4Var.n;
                        if (i10 >= w4VarArr.length) {
                            break;
                        }
                        w4 w4Var = w4VarArr[i10];
                        TL_stars.StarGift starGift = w4Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            w4Var.a(H12, true);
                            break;
                        }
                        i10++;
                    }
                    y4Var.d(true);
                }
            }
        }
        y4 y4Var2 = w5Var.N;
        y4 y4Var3 = w5Var.N;
        y4Var2.setOnCraft(new s1(this, i11));
        if (this.S2 == null) {
            bi.y5 y5Var = new bi.y5(this.a, H1.gift_id);
            this.S2 = y5Var;
            y5Var.a();
        }
        y4Var3.setOnAddGift(new q3(this, H1, i11));
        y4Var3.setOnClose(new l1(this, 23));
        t2(4, true, null);
    }

    public final void U1(long j3) {
        int i7 = 0;
        if (j3 <= 0 || !q10.b(np.s1(this.a).b2(j3))) {
            new bi.s2(getContext(), this.a, j3, null, new n1(this, i7)).show();
        } else {
            k().Q(R.raw.error, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(j3)))).k(false);
        }
    }

    public final void V1(long j3) {
        hi.l3 l3Var = this.u3;
        if (l3Var != null) {
            l3Var.f(true);
            this.u3 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T == null || q10.A(j3)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
            if (j3 == m10.i(this.a).e()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putBoolean("open_gifts", true);
        T.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void W1(boolean z10, vf.b bVar, Runnable runnable) {
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        int i7 = z10 ? 3 : 2;
        ab.j jVar = new ab.j(this, twoStepVerificationActivity, z10, 1);
        twoStepVerificationActivity.a0 = i7;
        twoStepVerificationActivity.c0 = jVar;
        twoStepVerificationActivity.b0 = z1();
        twoStepVerificationActivity.x0(new aa.r(this, runnable, bVar, twoStepVerificationActivity, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X1() {
        int i7;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i10;
        org.telegram.ui.Components.fa faVar;
        mg0 mg0Var;
        int i11;
        TLRPC.Message message2;
        TLRPC.Message message3;
        hi.l3 l3Var = this.u3;
        if (l3Var != null) {
            l3Var.f(true);
            this.u3 = null;
        }
        gj gjVar = this.D2;
        if (gjVar != null && (message3 = gjVar.k) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i7 <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                    Context context = getContext();
                    gj gjVar2 = this.D2;
                    if (gjVar2 != null && (message2 = gjVar2.k) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i11 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            r2(i11 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.B2;
                    i11 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    r2(i11 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
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
                        Context context2 = getContext();
                        int i12 = this.a;
                        wg.c1[] c1VarArr = {new wg.c1(context2, i12, org.telegram.messenger.v1.a(i12).b(), 3, this.J0)};
                        wg.c1 c1Var = c1VarArr[0];
                        c1Var.v2 = hd.M0(2131749914, null);
                        faVar = c1Var.p1;
                        if (faVar != null) {
                            faVar.setTitle(c1Var.O0());
                        }
                        mg0Var = c1Var.X1;
                        if (mg0Var != null) {
                            mg0Var.setText(c1Var.O0());
                        }
                        int max = currentTime <= i10 ? 0 : Math.max(1, Math.round(Math.max(0, i10 - currentTime) / 86400.0f));
                        wg.c1 c1Var2 = c1VarArr[0];
                        c1Var2.D2 = true;
                        c1Var2.E2 = max;
                        c1Var2.o1(false, true);
                        wg.c1 c1Var3 = c1VarArr[0];
                        c1Var3.x2 = new v3(this, currentTime, i10, max, c1VarArr, tL_starGiftUnique2);
                        c1Var3.show();
                        return;
                    }
                }
                gj gjVar3 = this.D2;
                if (gjVar3 == null || (message = gjVar3.k) == null) {
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
                        Context context22 = getContext();
                        int i122 = this.a;
                        wg.c1[] c1VarArr2 = {new wg.c1(context22, i122, org.telegram.messenger.v1.a(i122).b(), 3, this.J0)};
                        wg.c1 c1Var4 = c1VarArr2[0];
                        c1Var4.v2 = hd.M0(2131749914, null);
                        faVar = c1Var4.p1;
                        if (faVar != null) {
                        }
                        mg0Var = c1Var4.X1;
                        if (mg0Var != null) {
                        }
                        if (currentTime2 <= i10) {
                        }
                        wg.c1 c1Var22 = c1VarArr2[0];
                        c1Var22.D2 = true;
                        c1Var22.E2 = max;
                        c1Var22.o1(false, true);
                        wg.c1 c1Var32 = c1VarArr2[0];
                        c1Var32.x2 = new v3(this, currentTime2, i10, max, c1VarArr2, tL_starGiftUnique22);
                        c1Var32.show();
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y1(long j3, long j10, boolean z10, z10 z10Var) {
        String str;
        TLRPC.Chat chat;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (j3 >= 0) {
            TLRPC.User a22 = np.s1(this.a).a2(Long.valueOf(j3));
            str = q10.k(a22);
            chat = a22;
        } else {
            TLRPC.Chat M0 = np.s1(this.a).M0(Long.valueOf(-j3));
            if (M0 == null) {
                str = "";
                chat = M0;
            } else {
                str = M0.title;
                chat = M0;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new a5(getContext(), H1, chat), c8.ja.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, this.J0);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.g0.X2(j10 > 0 ? hd.K("Gift2TransferPriceText", (int) j10, ',', z1(), org.telegram.messenger.m5.t(j3)) : hd.a0(null, null, 2131749913, z1(), str)));
        linearLayout.addView(textView, c8.ja.t(-1, -2, 48, 24, 4, 24, 4));
        vx0 vx0Var = new vx0(getContext(), this.J0);
        k1(vx0Var, u8.l(H1.attributes, TL_stars.starGiftAttributeModel.class));
        k1(vx0Var, u8.l(H1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        k1(vx0Var, u8.l(H1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(H1.slug) && (H1.flags & 256) != 0) {
            org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
            long j11 = H1.value_amount;
            String str2 = H1.value_currency;
            int h = org.telegram.messenger.r1.i().h(H1.value_currency);
            i7.getClass();
            vx0Var.c(hd.M0(2131749591, null), r.b.k("~", org.telegram.messenger.r1.g(str2, h, j11, true)), null, null);
        }
        linearLayout.addView(vx0Var, c8.ja.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(j10 > 0 ? lb.T0(hd.a0(null, null, 2131749920, Integer.valueOf((int) j10))) : hd.M0(2131749921, null), new a1.c(z10Var, 24));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.Y0 = z10;
        t1Var.show();
    }

    @Override // org.telegram.ui.Components.ja
    public final boolean Z0() {
        return false;
    }

    public final void Z1(long j3, z10 z10Var) {
        TLRPC.Message message;
        long j10;
        TL_stars.SavedStarGift savedStarGift = this.B2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            gj gjVar = this.D2;
            if (gjVar == null || (message = gjVar.k) == null) {
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
        Y1(j3, j10, true, z10Var);
    }

    public final void a2() {
        TL_stars.InputSavedStarGift B1;
        long j3;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        hi.l3 l3Var = this.u3;
        if (l3Var != null) {
            l3Var.f(true);
            this.u3 = null;
        }
        if (this.Y2 == null && (B1 = B1()) != null) {
            gj gjVar = this.D2;
            long j12 = this.T1;
            if (gjVar != null) {
                TLRPC.MessageAction messageAction = gjVar.k.action;
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
                z13 = tL_messageActionStarGift.prepaid_upgrade ? org.telegram.messenger.m5.o(tL_messageActionStarGift.from_id) != this.D2.Z0() : tL_messageActionStarGift.upgrade_separate;
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
                textView.setText(hd.M0(z12 ? 2131750398 : 2131750399, null));
            } else if (z11) {
                textView.setText(hd.M0(2131750396, null));
            } else {
                textView.setText(hd.M0(2131750397, null));
            }
            boolean z14 = (z10 || j11 <= j3 || z13) ? false : true;
            fp fpVar = this.s2;
            fpVar.a(z14, false);
            ArrayList arrayList = this.k3;
            if (arrayList != null && (j11 > j3 || this.o3 != null)) {
                b2();
                return;
            }
            if (arrayList == null) {
                u8.y(this.a, false).K(j10, new n1(this, 2));
            }
            if (j11 > j3 || this.o3 != null) {
                return;
            }
            this.n3 = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = fpVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = np.s1(this.a).j1(j12);
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            JSONObject u10 = ki.x2.u(this.J0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new t3(this, 0));
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
    public final void b2() {
        long j3;
        boolean z10;
        boolean z11;
        char c10;
        int i7;
        int i10;
        String M0;
        String M02;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        gj gjVar = this.D2;
        if (gjVar != null) {
            TLRPC.MessageAction messageAction = gjVar.k.action;
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
        if (this.k3 != null) {
            if (j3 > 0 || this.o3 != null) {
                long j10 = 0;
                if (this.o3 != null) {
                    for (int i11 = 0; i11 < this.o3.invoice.prices.size(); i11++) {
                        j10 += this.o3.invoice.prices.get(i11).amount;
                    }
                }
                l5 l5Var = this.L2;
                w5 w5Var = this.b2;
                if (l5Var == null) {
                    this.L2 = new l5(w5Var);
                }
                l5 l5Var2 = this.L2;
                ArrayList arrayList = this.k3;
                w5 w5Var2 = l5Var2.a;
                ArrayList arrayList2 = l5Var2.g;
                ArrayList arrayList3 = l5Var2.f;
                ArrayList arrayList4 = l5Var2.e;
                int size = arrayList4.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList4.get(i12);
                    i12++;
                    ((j5) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList m10 = u8.m(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = m10.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = m10.get(i13);
                    i13++;
                    j5 j5Var = new j5(w5Var2.c, (TL_stars.starGiftAttributeModel) obj2);
                    if (w5Var2.isAttachedToWindow() && j5Var.c) {
                        j5Var.d.P();
                    }
                    arrayList4.add(j5Var);
                }
                ArrayList m11 = u8.m(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = m11.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = m11.get(i14);
                    i14++;
                    arrayList3.add(new i5((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList m12 = u8.m(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = m12.size();
                int i15 = 0;
                while (i15 < size4) {
                    Object obj4 = m12.get(i15);
                    i15++;
                    arrayList2.add(new k5((TL_stars.starGiftAttributePattern) obj4));
                }
                w5Var.setPreviewingAttributes(this.k3);
                long j11 = this.T1;
                if (z10) {
                    z11 = true;
                    w5Var.i(1, hd.M0(2131750062, null), hd.a0(null, null, 2131750063, org.telegram.messenger.m5.s(this.a, j11)), null);
                } else {
                    z11 = true;
                    w5Var.i(1, hd.M0(2131749851, null), hd.M0(2131749852, null), null);
                }
                hi.d dVar = this.g2;
                dVar.setFilled(z11);
                dVar.g(null, z11);
                if (j10 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                    if (this.m3 != null) {
                        for (int i16 = 0; i16 < this.m3.size(); i16++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) this.m3.get(i16);
                            if (starGiftUpgradePrice.date >= currentTime) {
                                break;
                            }
                        }
                    }
                    starGiftUpgradePrice = null;
                    ArrayList arrayList5 = this.l3;
                    FrameLayout frameLayout = this.j2;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.i2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2("**" + hd.M0(2131749870, null) + "**", new l1(this, 3)), false, org.telegram.messenger.g0.L(0.6666667f), org.telegram.messenger.g0.L(0.66f)));
                    }
                    v2();
                    eq[] eqVarArr = this.p3;
                    if (z10) {
                        dVar.i(lb.U0(hd.a0(null, null, 2131750067, Long.valueOf(j10)), 1.13f, eqVarArr), true, true);
                    } else {
                        dVar.i(lb.U0(hd.a0(null, null, 2131749877, Long.valueOf(j10)), 1.13f, eqVarArr), true, true);
                    }
                } else {
                    dVar.i(hd.M0(2131751817, null), true, true);
                }
                dVar.setOnClickListener(new k1(this, 5));
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
                ki.j[] jVarArr = this.p2;
                if (z10) {
                    ki.j jVar = jVarArr[c10];
                    String M03 = hd.M0(2131749865, null);
                    if (z10) {
                        char c11 = c10;
                        i10 = 1;
                        i7 = 2;
                        Object[] objArr = new Object[1];
                        objArr[c11] = org.telegram.messenger.m5.s(this.a, j11);
                        M0 = hd.a0(null, null, 2131750066, objArr);
                    } else {
                        i10 = 1;
                        i7 = 2;
                        M0 = hd.M0(2131749867, null);
                    }
                    jVar.a(R.drawable.menu_feature_unique, M03, M0);
                    ki.j jVar2 = jVarArr[i10];
                    String M04 = hd.M0(2131749862, null);
                    if (z10) {
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = org.telegram.messenger.m5.s(this.a, j11);
                        M02 = hd.a0(null, null, 2131750065, objArr2);
                    } else {
                        M02 = hd.M0(2131749864, null);
                    }
                    jVar2.a(R.drawable.menu_feature_transfer, M04, M02);
                    jVarArr[i7].a(R.drawable.menu_feature_tradable, hd.M0(2131749859, null), z10 ? hd.a0(null, null, 2131750064, org.telegram.messenger.m5.s(this.a, j11)) : hd.M0(2131749861, null));
                } else {
                    i7 = 2;
                    jVarArr[c10].a(R.drawable.menu_feature_unique, hd.M0(2131749865, null), hd.M0(2131749575, null));
                    jVarArr[1].a(R.drawable.menu_feature_tradable, hd.M0(2131749859, null), hd.M0(2131749573, null));
                    jVarArr[2].a(R.drawable.menu_wear, hd.M0(2131749570, null), hd.M0(2131749571, null));
                }
                org.telegram.messenger.g0.h3(new m1(this, j10, i7));
            }
        }
    }

    public final void c2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        if (this.b3 == null || H1 == null || TextUtils.isEmpty(H1.slug)) {
            return;
        }
        Context context = getContext();
        int i7 = this.a;
        wg.c1[] c1VarArr = {new wg.c1(context, i7, org.telegram.messenger.v1.a(i7).b(), 3, this.J0)};
        wg.c1 c1Var = c1VarArr[0];
        c1Var.v2 = hd.M0(2131749914, null);
        org.telegram.ui.Components.fa faVar = c1Var.p1;
        if (faVar != null) {
            faVar.setTitle(c1Var.O0());
        }
        mg0 mg0Var = c1Var.X1;
        if (mg0Var != null) {
            mg0Var.setText(c1Var.O0());
        }
        wg.c1 c1Var2 = c1VarArr[0];
        c1Var2.C2 = true;
        c1Var2.o1(false, true);
        wg.c1 c1Var3 = c1VarArr[0];
        c1Var3.x2 = new ai.v1(6, this, c1VarArr);
        c1Var3.show();
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.G3) {
            if (this.C2 == ((l8) objArr[1])) {
                y4 y4Var = this.b2.N;
                if (y4Var == null || !y4Var.i0) {
                    w2();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        if (this.X2.c(4) && this.b2.N.i0) {
            return;
        }
        bi.y5 y5Var = this.S2;
        if (y5Var != null) {
            y5Var.b();
            this.S2 = null;
        }
        l5 l5Var = this.L2;
        if (l5Var != null) {
            l5Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TLRPC.Peer peer) {
        if (peer != null) {
            String r10 = org.telegram.messenger.m5.r(np.s1(this.a).e2(org.telegram.messenger.m5.o(peer)));
            if (!TextUtils.isEmpty(r10)) {
                return org.telegram.messenger.g0.U2(hd.a0(null, null, 2131750043, r.b.k("@", r10)), new d3(this, r10, 8));
            }
        }
        return null;
    }

    public final SpannableStringBuilder f2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return e2(starGift.released_by);
    }

    public final void i2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, m8 m8Var) {
        l5 l5Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.E2 = str;
        this.F2 = tL_starGiftUnique;
        this.C2 = m8Var;
        this.G2 = (tL_starGiftUnique.resell_amount == null || K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.M2 && (l5Var = this.L2) != null && l5Var.o && (tL_starGiftUnique2 = l5Var.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            l5Var.a();
            this.L2 = null;
            w5 w5Var = this.b2;
            w5Var.b.setAlpha(1.0f);
            w5Var.c.setAlpha(0.0f);
        }
        this.a2.b(this.a, this.B2);
        l2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z10 = tL_starGiftUnique.host_id != null;
        TL_wallet.walletTransaction wallettransaction = this.e3;
        z70 z70Var = this.d2;
        if (wallettransaction != null || !z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            z70Var.setVisibility(8);
        } else {
            z70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750181, null), new d3(this, str3, 3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            z70Var.setVisibility(0);
            org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.q5, this.J0);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.e3;
        z70 z70Var2 = this.f2;
        if (wallettransaction2 != null || z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            z70Var2.setVisibility(8);
        } else {
            z70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750181, null), new d3(this, str3, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            z70Var2.setVisibility(0);
        }
        x2();
        if (this.G2) {
            m2(tL_starGiftUnique);
            this.g2.setOnClickListener(new k1(this, 11));
        }
        if (this.a3) {
            t2(0, false, null);
            this.n1.n0(1);
            this.a3 = false;
        }
        w2();
    }

    public final void j1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        char c10;
        l5 l5Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        c6 c6Var;
        ai.r rVar;
        int i7 = 0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = hd.M0(2131750387, null);
            c10 = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = hd.M0(2131750380, null);
            c10 = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            M0 = hd.M0(2131750388, null);
            c10 = 0;
        }
        if (!this.M2 && ((l5Var = this.L2) == null || !l5Var.o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.ec[] ecVarArr = new org.telegram.ui.Components.ec[1];
            Integer[] numArr = new Integer[1];
            String G1 = G1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                c6Var = this;
                rVar = new ai.r(this, zArr, starGiftAttribute2, ecVarArr, 8);
            } else {
                starGiftAttribute2 = starGiftAttribute;
                c6Var = this;
                rVar = null;
            }
            ecVarArr[0] = (org.telegram.ui.Components.ec) ((sx0) c6Var.e2.e(M0, starGiftAttribute2.name, G1, rVar, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        q5 q5Var = new q5(getContext(), this.J0, new s1(this, i7));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        vx0 vx0Var = this.e2;
        tableRow.addView(new ux0(vx0Var, M0), layoutParams);
        tableRow.addView(new sx0(vx0Var, q5Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        vx0Var.addView(tableRow);
        l5 l5Var2 = this.L2;
        if (l5Var2 != null) {
            if (c10 == 0) {
                l5Var2.d = q5Var;
            }
            if (c10 == 1) {
                l5Var2.c = q5Var;
            }
            if (c10 == 2) {
                l5Var2.b = q5Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:322:0x0367, code lost:
    
        if (L1(r58.a, org.telegram.messenger.m5.o(r8)) != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x037a, code lost:
    
        if (r44 > 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x03bd, code lost:
    
        if (r36 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x03bf, code lost:
    
        if (r46 == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x03c3, code lost:
    
        if (r26 <= 0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03c5, code lost:
    
        r14 = null;
        r7 = org.telegram.messenger.hd.a0(null, null, 2131750165, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x03d6, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x03da, code lost:
    
        if (r29 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x03dc, code lost:
    
        if (r24 != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x03de, code lost:
    
        r7 = org.telegram.messenger.hd.a0(null, null, 2131750143, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x03eb, code lost:
    
        if (r24 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x03ed, code lost:
    
        r7 = "Gift2InfoOutConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x03f2, code lost:
    
        r7 = org.telegram.messenger.hd.K(r7, (int) r9, ',', r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0400, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x03f0, code lost:
    
        r7 = "Gift2InfoOut";
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0402, code lost:
    
        if (r24 == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0404, code lost:
    
        if (r38 == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0406, code lost:
    
        r7 = "Gift2InfoChannelConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0413, code lost:
    
        r7 = org.telegram.messenger.hd.H(',', r7, (int) r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0409, code lost:
    
        r7 = "Gift2InfoConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x040c, code lost:
    
        if (r38 == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x040e, code lost:
    
        r7 = "Gift2Info3Channel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0411, code lost:
    
        r7 = "Gift2Info3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x03bb, code lost:
    
        if (r8 > 0) goto L188;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x043d  */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29, types: [org.telegram.ui.Components.ec[], org.telegram.ui.Components.eq[], org.telegram.ui.Components.ux0[]] */
    /* JADX WARN: Type inference failed for: r14v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j2(gj gjVar, m8 m8Var) {
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
        String M0;
        hi.d dVar;
        boolean z18;
        String str2;
        String str3;
        char c10;
        CharSequence charSequence;
        int i10;
        CharSequence concat;
        int i11;
        vx0 vx0Var;
        hi.d dVar2;
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
        String M02;
        ?? r14;
        String str5;
        String M03;
        CharSequence X2;
        CharSequence charSequence3;
        l5 l5Var;
        String M04;
        boolean z23;
        TLObject e22;
        boolean z24;
        l5 l5Var2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.InputSavedStarGift B1;
        if (gjVar == null || gjVar.k == null) {
            return;
        }
        this.A2 = false;
        this.B2 = null;
        this.D2 = gjVar;
        this.C2 = m8Var;
        this.a2.set(gjVar);
        long e10 = m10.i(this.a).e();
        boolean z25 = gj.B0(gjVar.k) == e10;
        TLRPC.MessageAction messageAction = gjVar.k.action;
        boolean z26 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        int i14 = 3;
        w5 w5Var = this.b2;
        hi.d dVar3 = this.g2;
        if (z26 || (((z23 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
            if (!this.M2 && (l5Var = this.L2) != null && l5Var.o && l5Var.l != null) {
                l5Var.a();
                this.L2 = null;
                w5Var.b.setVisibility(0);
                w5Var.c.setVisibility(4);
            }
            boolean P3 = z25 ? false : gjVar.P3();
            TLRPC.Message message = gjVar.k;
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
            String t6 = org.telegram.messenger.m5.t(j13);
            z16 = z25;
            boolean z34 = P3;
            boolean t10 = q10.t(np.s1(this.a).a2(Long.valueOf(j13)));
            boolean z35 = peer != null && org.telegram.messenger.m5.o(peer) < 0;
            boolean M1 = M1(this.a, H1());
            C1();
            w5Var.f(starGift, false, false, M1);
            w5Var.setShowOptions(p1());
            CharSequence charSequence4 = "";
            int i16 = 2;
            if (z16) {
                if (i7 == 0 || starGift.title == null) {
                    z17 = z11;
                    str5 = null;
                    M03 = hd.M0(2131749940, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    z17 = z11;
                    sb2.append(starGift.title);
                    sb2.append(" #");
                    M03 = i5.c.l(i7, ',', sb2);
                    str5 = null;
                }
                this.R2 = M03;
                if (z17) {
                    X2 = str5;
                } else {
                    if (z12) {
                        charSequence3 = org.telegram.messenger.g0.X2(hd.M0(2131749997, str5));
                    } else if (j10 > 0) {
                        charSequence3 = org.telegram.messenger.g0.X2(hd.H(',', z13 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j10));
                    } else {
                        X2 = org.telegram.messenger.g0.X2(hd.M0(2131750004, null));
                    }
                    X2 = charSequence3;
                }
                w5Var.i(0, M03, X2, f2(starGift));
            } else {
                z17 = z11;
                if (z35 && !this.A2) {
                    w5Var.i(0, hd.M0(2131749942, null), null, f2(starGift));
                } else if ((z34 || z12) && j11 > 0) {
                    String M05 = hd.M0(z34 ? 2131749937 : 2131749941, null);
                    this.R2 = M05;
                    w5Var.i(0, M05, z17 ? null : !z34 ? hd.M0(2131750148, null) : hd.a0(null, null, 2131750149, t6), f2(starGift));
                } else {
                    if (i7 == 0 || starGift.title == null) {
                        M0 = hd.M0(z34 ? 2131749937 : 2131749941, null);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift.title);
                        sb3.append(" #");
                        M0 = i5.c.l(i7, ',', sb3);
                    }
                    this.R2 = M0;
                    if (z17) {
                        dVar = dVar3;
                        z18 = z12;
                        concat = null;
                        i10 = 0;
                    } else {
                        if (!t10 && B1() != null) {
                            gj gjVar2 = this.D2;
                            if (gjVar2 != null) {
                                TLRPC.MessageAction messageAction3 = gjVar2.k.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z36 = tL_messageActionStarGift2.peer != null;
                                    gjVar2.P3();
                                    gj.B0(this.D2.k);
                                    m10.i(this.a).e();
                                    boolean z37 = z36;
                                    int currentTime = np.s1(this.a).F6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.D2.k.date);
                                    if (z37) {
                                        TLRPC.Peer peer8 = tL_messageActionStarGift2.peer;
                                        if (peer8 != null) {
                                            i11 = currentTime;
                                            dVar = dVar3;
                                            z18 = z12;
                                        }
                                    } else {
                                        i11 = currentTime;
                                        dVar = dVar3;
                                        z18 = z12;
                                    }
                                    if (!tL_messageActionStarGift2.converted) {
                                        if (tL_messageActionStarGift2.convert_stars > 0) {
                                        }
                                    }
                                    if (z34) {
                                        str2 = null;
                                        str3 = hd.a0(null, null, (!z18 || j11 <= 0) ? 2131750166 : 2131750165, t6);
                                    } else {
                                        str2 = null;
                                        str3 = hd.M0(!z10 ? z35 ? 2131750173 : 2131750178 : z35 ? 2131750172 : 2131750177, null);
                                    }
                                }
                            } else {
                                dVar = dVar3;
                                z18 = z12;
                                TL_stars.SavedStarGift savedStarGift = this.B2;
                                if (savedStarGift != null) {
                                    int currentTime2 = np.s1(this.a).F6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                                    if (L1(this.a, j13)) {
                                        int i17 = this.B2.flags;
                                        if (((j13 < 0 ? 2048 : 8) & i17) != 0) {
                                            if ((i17 & 16) != 0) {
                                                if ((i17 & 2) != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z34) {
                                }
                            }
                            SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(str3);
                            if (t10 && n1()) {
                                c10 = 1;
                                charSequence = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(hd.M0(2131750110, str2).replace(' ', (char) 160), new l1(this, 10)), true);
                            } else {
                                c10 = 1;
                                charSequence = "";
                            }
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i10 = 0;
                            charSequenceArr[0] = X22;
                            charSequenceArr[c10] = " ";
                            charSequenceArr[2] = charSequence;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        dVar = dVar3;
                        z18 = z12;
                        if (z34) {
                        }
                        SpannableStringBuilder X222 = org.telegram.messenger.g0.X2(str3);
                        if (t10) {
                        }
                        c10 = 1;
                        charSequence = "";
                        CharSequence[] charSequenceArr2 = new CharSequence[3];
                        i10 = 0;
                        charSequenceArr2[0] = X222;
                        charSequenceArr2[c10] = " ";
                        charSequenceArr2[2] = charSequence;
                        concat = TextUtils.concat(charSequenceArr2);
                    }
                    w5Var.i(i10, M0, concat, f2(starGift));
                    vx0Var = this.e2;
                    vx0Var.removeAllViews();
                    long o4 = peer2 == null ? org.telegram.messenger.m5.o(peer2) : z34 ? j3 : j13;
                    if (peer == null) {
                        j13 = org.telegram.messenger.m5.o(peer);
                    } else if (!z34) {
                        j13 = j3;
                    }
                    TLRPC.User a22 = np.s1(this.a).a2(Long.valueOf(o4));
                    int i18 = 7;
                    if (peer3 == null) {
                        long o10 = org.telegram.messenger.m5.o(peer3);
                        this.e2.m(hd.M0(2131749936, null), this.a, o10, new m1(this, o10, i18), null, z35 ? null : new m1(this, o10, 8));
                    } else {
                        if (o4 != j3 || z15 || z35) {
                            this.e2.m(hd.M0(2131750193, null), this.a, o4, new m1(this, o4, 9), (o4 == j3 || o4 == 2666000 || q10.x(a22) || t10 || z35) ? null : hd.M0(2131750284, null), z35 ? null : new m1(this, o4, 10));
                        }
                        if (j13 != j3 || z35) {
                            this.e2.m(hd.M0(2131749936, null), this.a, j13, new m1(this, j13, 11), null, z35 ? null : new m1(this, j13, 12));
                        }
                    }
                    vx0Var.g(i15, hd.M0(2131744960, null));
                    if (starGift.stars > 0) {
                        String M06 = hd.M0(2131749847, null);
                        String l10 = i5.c.l(starGift.stars + j11, ',', new StringBuilder("⭐️ "));
                        if (!n1() || z17) {
                            r14 = 0;
                        } else {
                            r14 = 0;
                            charSequence4 = org.telegram.ui.Components.fc.b(hd.H(',', "Gift2ButtonSell", (int) j10), new l1(this, 7), this.J0, null);
                        }
                        vx0Var.c(M06, lb.a1(false, TextUtils.concat(l10, " ", charSequence4), 0.8f, r14), r14, r14);
                    }
                    if (starGift.limited && !z17) {
                        lb.H0(vx0Var, this.a, starGift, this.J0);
                    }
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z17) {
                        vx0Var.b(tL_textWithEntities.text, tL_textWithEntities.entities);
                    }
                    if (z34 && z18 && !z17) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                        if (this.Z2 == null) {
                            dVar2 = dVar;
                            i13 = 0;
                            this.Z2 = new eq(0, new x5(dVar2, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.J0)));
                        } else {
                            dVar2 = dVar;
                            i13 = 0;
                        }
                        spannableStringBuilder.setSpan(this.Z2, i13, 1, 33);
                        if (j11 > 0) {
                            charSequence2 = null;
                            M02 = hd.M0(2131749875, null);
                        } else {
                            charSequence2 = null;
                            M02 = hd.M0(2131749874, null);
                        }
                        spannableStringBuilder.append((CharSequence) M02);
                        dVar2.setFilled(true);
                        dVar2.i(spannableStringBuilder, !this.a3, true);
                        dVar2.g(charSequence2, !this.a3);
                        dVar2.setOnClickListener(new k1(this, 15));
                    } else {
                        dVar2 = dVar;
                        if (this.n2 || this.V1 == null || this.C2 == null || D1() < 0 || this.C2.b(D1()) < 0) {
                            if ((starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                                z19 = true;
                                str4 = null;
                                dVar2.setFilled(true);
                                dVar2.i(hd.M0(2131747831, null), !this.a3, true);
                                dVar2.g(null, !this.a3);
                                dVar2.setOnClickListener(new k1(this, 13));
                            } else {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                                if (this.Z2 == null) {
                                    i12 = 0;
                                    this.Z2 = new eq(0, new x5(dVar2, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.J0)));
                                } else {
                                    i12 = 0;
                                }
                                z19 = true;
                                spannableStringBuilder2.setSpan(this.Z2, i12, 1, 33);
                                str4 = null;
                                spannableStringBuilder2.append((CharSequence) hd.M0(2131750191, null));
                                dVar2.setFilled(true);
                                dVar2.i(spannableStringBuilder2, !this.a3, true);
                                dVar2.g(null, !this.a3);
                                dVar2.setOnClickListener(new k1(this, 12));
                            }
                            z21 = z10;
                            z22 = z34;
                        } else {
                            dVar2.setFilled(false);
                            int b10 = this.C2.b(D1());
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) hd.M0(2131749855, null));
                            Object obj = this.C2.get(b10);
                            if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                                z20 = true;
                            } else {
                                spannableStringBuilder3.append((CharSequence) " e");
                                z20 = true;
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.p5(document, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                            }
                            dVar2.i(spannableStringBuilder3, this.a3 ^ z20, z20);
                            dVar2.g(null, this.a3 ^ z20);
                            dVar2.setOnClickListener(new d2(this, b10, i16));
                        }
                    }
                    z19 = true;
                    str4 = null;
                    z21 = z10;
                    z22 = z34;
                }
            }
            dVar = dVar3;
            z18 = z12;
            vx0Var = this.e2;
            vx0Var.removeAllViews();
            if (peer2 == null) {
            }
            if (peer == null) {
            }
            TLRPC.User a222 = np.s1(this.a).a2(Long.valueOf(o4));
            int i182 = 7;
            if (peer3 == null) {
            }
            vx0Var.g(i15, hd.M0(2131744960, null));
            if (starGift.stars > 0) {
            }
            if (starGift.limited) {
                lb.H0(vx0Var, this.a, starGift, this.J0);
            }
            if (tL_textWithEntities != null) {
                vx0Var.b(tL_textWithEntities.text, tL_textWithEntities.entities);
            }
            if (z34) {
            }
            dVar2 = dVar;
            if (this.n2) {
            }
            if (starGift instanceof TL_stars.TL_starGift) {
            }
            z19 = true;
            str4 = null;
            dVar2.setFilled(true);
            dVar2.i(hd.M0(2131747831, null), !this.a3, true);
            dVar2.g(null, !this.a3);
            dVar2.setOnClickListener(new k1(this, 13));
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
                e22 = null;
            } else {
                np s12 = np.s1(this.a);
                TLRPC.Peer peer9 = tL_messageActionStarGiftUnique2.from_id;
                e22 = s12.e2(peer9 != null ? org.telegram.messenger.m5.o(peer9) : gjVar.Z0());
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique2.gift;
            boolean z38 = tL_messageActionStarGiftUnique2.refunded;
            l2(tL_starGiftUnique2, z38, e22, tL_messageActionStarGiftUnique2.message);
            z21 = tL_messageActionStarGiftUnique2.saved;
            starGift = tL_messageActionStarGiftUnique2.gift;
            boolean z39 = (tL_messageActionStarGiftUnique2.upgrade ^ true) == gjVar.P3();
            if (gj.B0(gjVar.k) == e10) {
                z39 = false;
            }
            if (!this.J2 && !this.K2 && this.D2 != null && (B1 = B1()) != null) {
                this.J2 = true;
                u8.y(this.a, false).M(B1, new n1(this, i14));
            }
            if (this.M2 || (l5Var2 = this.L2) == null || !l5Var2.o || (tL_starGiftUnique = l5Var2.l) == null) {
                z24 = z39;
            } else {
                z24 = z39;
                if (starGift == null || tL_starGiftUnique.id != starGift.id) {
                    l5Var2.a();
                    this.L2 = null;
                    w5Var.b.setAlpha(1.0f);
                    w5Var.c.setAlpha(0.0f);
                }
            }
            z16 = z25;
            z17 = z38;
            dVar2 = dVar3;
            z22 = z24;
            tL_textWithEntities = null;
            z19 = true;
            str4 = null;
            z13 = false;
            z14 = false;
            peer3 = null;
        }
        if (this.h3) {
            dVar2.setFilled(z19);
            dVar2.i(hd.M0(2131749794, str4), false, z19);
            dVar2.setOnClickListener(new k1(this, 14));
        }
        String str6 = starGift == null ? null : starGift.owner_address;
        String str7 = starGift == null ? null : starGift.gift_address;
        boolean z40 = (starGift == null || starGift.host_id == null) ? false : true;
        z70 z70Var = this.d2;
        if (z17) {
            z70Var.setVisibility(0);
            z70Var.setText(hd.M0(2131750045, null));
            org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.q7, this.J0);
        } else if (z40 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
            z70Var.setVisibility(0);
            z70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750181, null), new d3(this, str7, 5)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.q5, this.J0);
        } else if (TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && z14 && !z16) {
            z70Var.setVisibility(0);
            if (z22) {
                M04 = hd.a0(null, null, (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? 2131750088 : 2131750087, org.telegram.messenger.m5.t(gj.B0(gjVar.k)));
            } else {
                M04 = hd.M0((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? 2131750180 : 2131750179, null);
            }
            z70Var.setText(M04);
            org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.q5, this.J0);
        } else {
            z70Var.setVisibility(8);
        }
        int i19 = 6;
        z70 z70Var2 = this.f2;
        if (!z40 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
            z70Var2.setVisibility(0);
            z70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750181, null), new d3(this, str7, i19)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
        } else if (z13 || z17 || starGift == null || !K1(this.a, x1()) || peer3 != null) {
            z70Var2.setVisibility(8);
        } else {
            z70Var2.setVisibility(0);
            if (x1() >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (!z21) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new eq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) org.telegram.messenger.g0.U2(hd.M0(z21 ? 2131750055 : 2131750058, null), new l1(this, i19)));
                z70Var2.setText(org.telegram.messenger.g0.I2(spannableStringBuilder4, true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            } else {
                z70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(z21 ? 2131750253 : 2131750254, null), new l1(this, i19)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            }
        }
        if (this.a3) {
            t2(0, false, null);
            this.n1.n0(1);
            this.a3 = false;
        }
        this.p1.setTitle(this.R2);
        w2();
    }

    @Override // org.telegram.ui.ActionBar.u2, org.telegram.ui.ActionBar.a2
    public org.telegram.ui.Components.cc k() {
        return new org.telegram.ui.Components.cc(this.l2, this.J0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0476 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0312  */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27, types: [org.telegram.ui.Components.ec[], org.telegram.ui.Components.eq[], org.telegram.ui.Components.ux0[]] */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v42, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k2(TL_stars.SavedStarGift savedStarGift, m8 m8Var) {
        long j3;
        int i7;
        String M0;
        int i10;
        CharSequence charSequence;
        String str;
        String a02;
        int i11;
        boolean z10;
        CharSequence charSequence2;
        TL_stars.StarGift starGift;
        ?? r13;
        TL_stars.StarGift starGift2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z11;
        hi.d dVar;
        int i12;
        ?? r12;
        TL_stars.StarGift starGift3;
        TLRPC.Document document;
        String str2;
        String str3;
        boolean z12;
        int i13;
        CharSequence charSequence3;
        String M02;
        String str4;
        String M03;
        CharSequence X2;
        CharSequence charSequence4;
        TL_stars.StarGift starGift4;
        float f10;
        ?? r14;
        l5 l5Var;
        if (savedStarGift == null) {
            return;
        }
        int i14 = this.a;
        long j10 = this.T1;
        this.A2 = K1(i14, j10);
        this.B2 = savedStarGift;
        this.C2 = m8Var;
        this.D2 = null;
        boolean z13 = this.M2;
        w5 w5Var = this.b2;
        if (!z13 && (l5Var = this.L2) != null && l5Var.o && l5Var.l != null) {
            l5Var.a();
            this.L2 = null;
            w5Var.b.setVisibility(0);
            w5Var.c.setVisibility(4);
        }
        this.a2.b(this.a, savedStarGift);
        String t6 = org.telegram.messenger.m5.t(j10);
        long o4 = org.telegram.messenger.m5.o(savedStarGift.from_id);
        boolean t10 = q10.t(np.s1(this.a).a2(Long.valueOf(o4)));
        int currentTime = np.s1(this.a).F6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
        long e10 = m10.i(this.a).e();
        if ((savedStarGift.flags & 2) == 0) {
            o4 = 2666000;
        }
        int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        boolean z14 = i15 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
        boolean z15 = savedStarGift.refunded;
        TL_stars.StarGift starGift5 = savedStarGift.gift;
        if (starGift5 instanceof TL_stars.TL_starGiftUnique) {
            str2 = starGift5.owner_address;
            str3 = starGift5.gift_address;
            z12 = starGift5.host_id != null;
            l2((TL_stars.TL_starGiftUnique) starGift5, z15, !savedStarGift.name_hidden ? np.s1(this.a).e2(org.telegram.messenger.m5.o(savedStarGift.from_id)) : null, savedStarGift.message);
            i7 = i15;
        } else {
            boolean z16 = this.A2 && e10 == o4 && i15 >= 0;
            boolean M1 = M1(this.a, H1());
            C1();
            w5Var.f(starGift5, false, false, M1);
            w5Var.setShowOptions(p1());
            vx0 vx0Var = this.e2;
            vx0Var.removeAllViews();
            CharSequence charSequence5 = "";
            if (z16) {
                if (savedStarGift.gift_num == 0 || (starGift4 = savedStarGift.gift) == null || starGift4.title == null) {
                    j3 = e10;
                    str4 = null;
                    M03 = hd.M0(2131749940, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j3 = e10;
                    M03 = i5.c.l(savedStarGift.gift_num, ',', sb2);
                    str4 = null;
                }
                this.R2 = M03;
                if (z15) {
                    X2 = str4;
                } else {
                    if (savedStarGift.can_upgrade) {
                        charSequence4 = org.telegram.messenger.g0.X2(hd.M0(2131749997, str4));
                    } else {
                        long j11 = savedStarGift.convert_stars;
                        if (j11 > 0) {
                            charSequence4 = org.telegram.messenger.g0.X2(hd.H(',', "Gift2SelfInfoConvert", (int) j11));
                        } else {
                            X2 = org.telegram.messenger.g0.X2(hd.M0(2131750004, null));
                        }
                    }
                    X2 = charSequence4;
                }
                w5Var.i(0, M03, X2, f2(savedStarGift.gift));
            } else {
                j3 = e10;
                if (!z14 || this.A2) {
                    boolean z17 = this.A2;
                    if (!z17 || savedStarGift.can_upgrade) {
                        i7 = i15;
                        if (savedStarGift.upgrade_stars > 0) {
                            String M04 = hd.M0(z17 ? 2131749941 : 2131749942, null);
                            this.R2 = M04;
                            w5Var.i(0, M04, z15 ? null : this.A2 ? hd.M0(2131750148, null) : null, f2(savedStarGift.gift));
                            if (j3 == o4 || z14) {
                                this.e2.m(hd.M0(2131750193, null), this.a, o4, new m1(this, o4, 4), (o4 != j3 || o4 == 2666000 || t10 || q10.x(np.s1(this.a).a2(Long.valueOf(o4))) || z14) ? null : hd.M0(2131750284, null), new m1(this, o4, 5));
                            }
                            vx0Var.c(hd.M0(2131744960, null), hd.a0(null, null, 2131742783, hd.E0().s0().format(new Date(savedStarGift.date * 1000)), hd.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
                            String M05 = hd.M0(2131749847, null);
                            String l10 = i5.c.l(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
                            int i16 = 7;
                            if (n1() || z15) {
                                r13 = 0;
                            } else {
                                r13 = 0;
                                charSequence5 = org.telegram.ui.Components.fc.b(hd.H(',', "Gift2ButtonSell", (int) savedStarGift.convert_stars), new l1(this, i16), this.J0, null);
                            }
                            vx0Var.c(M05, lb.a1(false, TextUtils.concat(l10, " ", charSequence5), 0.8f, r13), r13, r13);
                            starGift2 = savedStarGift.gift;
                            if (starGift2.limited && !z15) {
                                lb.H0(vx0Var, this.a, starGift2, this.J0);
                            }
                            tL_textWithEntities = savedStarGift.message;
                            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z15) {
                                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                                vx0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                            }
                            z11 = this.A2;
                            dVar = this.g2;
                            if (!z11 && savedStarGift.can_upgrade) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                                if (this.Z2 == null) {
                                    i13 = 0;
                                    this.Z2 = new eq(0, new x5(dVar, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.J0)));
                                } else {
                                    i13 = 0;
                                }
                                spannableStringBuilder.setSpan(this.Z2, i13, 1, 33);
                                if (savedStarGift.upgrade_stars > 0) {
                                    charSequence3 = null;
                                    M02 = hd.M0(2131749875, null);
                                } else {
                                    charSequence3 = null;
                                    M02 = hd.M0(2131749874, null);
                                }
                                spannableStringBuilder.append((CharSequence) M02);
                                dVar.setFilled(true);
                                dVar.i(spannableStringBuilder, !this.a3, true);
                                dVar.g(charSequence3, !this.a3);
                                dVar.setOnClickListener(new k1(this, i16));
                            } else if (!this.n2 && z11 && this.V1 != null && this.C2 != null && D1() >= 0 && this.C2.b(D1()) >= 0) {
                                dVar.setFilled(false);
                                int b10 = this.C2.b(D1());
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) hd.M0(2131749855, null));
                                Object obj = this.C2.get(b10);
                                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                                    r12 = 1;
                                } else {
                                    spannableStringBuilder2.append((CharSequence) " e");
                                    r12 = 1;
                                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                                }
                                dVar.i(spannableStringBuilder2, (this.a3 ? 1 : 0) ^ r12, r12);
                                dVar.g(null, (this.a3 ? 1 : 0) ^ r12);
                                dVar.setOnClickListener(new d2(this, b10, r12));
                            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                                dVar.setFilled(true);
                                dVar.i(hd.M0(2131747831, null), !this.a3, true);
                                dVar.g(null, !this.a3);
                                dVar.setOnClickListener(new k1(this, 10));
                            } else {
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                                if (this.Z2 == null) {
                                    i12 = 0;
                                    this.Z2 = new eq(0, new x5(dVar, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.J0)));
                                } else {
                                    i12 = 0;
                                }
                                spannableStringBuilder3.setSpan(this.Z2, i12, 1, 33);
                                spannableStringBuilder3.append((CharSequence) hd.M0(2131750191, null));
                                dVar.setFilled(true);
                                dVar.i(spannableStringBuilder3, !this.a3, true);
                                dVar.g(null, !this.a3);
                                dVar.setOnClickListener(new k1(this, 9));
                            }
                            str2 = null;
                            str3 = null;
                            z12 = false;
                        }
                    } else {
                        i7 = i15;
                    }
                    if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                        M0 = hd.M0(z17 ? 2131749941 : 2131749942, null);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(savedStarGift.gift.title);
                        sb3.append(" #");
                        M0 = i5.c.l(savedStarGift.gift_num, ',', sb3);
                    }
                    this.R2 = M0;
                    if (z15 || !this.A2) {
                        i10 = 0;
                        charSequence = null;
                    } else {
                        if (!t10 && n1()) {
                            if (this.A2) {
                                a02 = hd.H(',', currentTime <= 0 ? z14 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z14 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                a02 = hd.K("Gift2Info2Out", (int) savedStarGift.convert_stars, ',', t6);
                            }
                            str = null;
                        } else if (this.A2) {
                            if (savedStarGift.unsaved) {
                                i11 = z14 ? 2131750173 : 2131750178;
                                str = null;
                            } else {
                                str = null;
                                i11 = z14 ? 2131750172 : 2131750177;
                            }
                            a02 = hd.M0(i11, str);
                        } else {
                            str = null;
                            a02 = hd.a0(null, null, (!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? 2131750166 : 2131750165, t6);
                        }
                        SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(a02);
                        if (t10 || !n1()) {
                            z10 = true;
                            charSequence2 = "";
                        } else {
                            z10 = true;
                            charSequence2 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(hd.M0(2131750110, str).replace(' ', (char) 160), new l1(this, 5)), true);
                        }
                        boolean z18 = z10;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        i10 = 0;
                        charSequenceArr[0] = X22;
                        charSequenceArr[z18 ? 1 : 0] = " ";
                        charSequenceArr[2] = charSequence2;
                        charSequence = TextUtils.concat(charSequenceArr);
                    }
                    w5Var.i(i10, M0, charSequence, f2(savedStarGift.gift));
                    if (j3 == o4) {
                    }
                    this.e2.m(hd.M0(2131750193, null), this.a, o4, new m1(this, o4, 4), (o4 != j3 || o4 == 2666000 || t10 || q10.x(np.s1(this.a).a2(Long.valueOf(o4))) || z14) ? null : hd.M0(2131750284, null), new m1(this, o4, 5));
                    vx0Var.c(hd.M0(2131744960, null), hd.a0(null, null, 2131742783, hd.E0().s0().format(new Date(savedStarGift.date * 1000)), hd.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
                    String M052 = hd.M0(2131749847, null);
                    String l102 = i5.c.l(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
                    int i162 = 7;
                    if (n1()) {
                    }
                    r13 = 0;
                    vx0Var.c(M052, lb.a1(false, TextUtils.concat(l102, " ", charSequence5), 0.8f, r13), r13, r13);
                    starGift2 = savedStarGift.gift;
                    if (starGift2.limited) {
                        lb.H0(vx0Var, this.a, starGift2, this.J0);
                    }
                    tL_textWithEntities = savedStarGift.message;
                    if (tL_textWithEntities != null) {
                        TLRPC.TL_textWithEntities tL_textWithEntities32 = savedStarGift.message;
                        vx0Var.b(tL_textWithEntities32.text, tL_textWithEntities32.entities);
                    }
                    z11 = this.A2;
                    dVar = this.g2;
                    if (!z11) {
                    }
                    if (!this.n2) {
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
                    }
                    dVar.setFilled(true);
                    dVar.i(hd.M0(2131747831, null), !this.a3, true);
                    dVar.g(null, !this.a3);
                    dVar.setOnClickListener(new k1(this, 10));
                    str2 = null;
                    str3 = null;
                    z12 = false;
                } else {
                    String M06 = hd.M0(2131749942, null);
                    this.R2 = M06;
                    w5Var.i(0, M06, null, e2(savedStarGift.gift.released_by));
                }
            }
            i7 = i15;
            if (j3 == o4) {
            }
            this.e2.m(hd.M0(2131750193, null), this.a, o4, new m1(this, o4, 4), (o4 != j3 || o4 == 2666000 || t10 || q10.x(np.s1(this.a).a2(Long.valueOf(o4))) || z14) ? null : hd.M0(2131750284, null), new m1(this, o4, 5));
            vx0Var.c(hd.M0(2131744960, null), hd.a0(null, null, 2131742783, hd.E0().s0().format(new Date(savedStarGift.date * 1000)), hd.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
            String M0522 = hd.M0(2131749847, null);
            String l1022 = i5.c.l(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            int i1622 = 7;
            if (n1()) {
            }
            r13 = 0;
            vx0Var.c(M0522, lb.a1(false, TextUtils.concat(l1022, " ", charSequence5), 0.8f, r13), r13, r13);
            starGift2 = savedStarGift.gift;
            if (starGift2.limited) {
            }
            tL_textWithEntities = savedStarGift.message;
            if (tL_textWithEntities != null) {
            }
            z11 = this.A2;
            dVar = this.g2;
            if (!z11) {
            }
            if (!this.n2) {
            }
            if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
            }
            dVar.setFilled(true);
            dVar.i(hd.M0(2131747831, null), !this.a3, true);
            dVar.g(null, !this.a3);
            dVar.setOnClickListener(new k1(this, 10));
            str2 = null;
            str3 = null;
            z12 = false;
        }
        boolean z19 = savedStarGift.refunded;
        z70 z70Var = this.d2;
        if (z19) {
            z70Var.setVisibility(0);
            z70Var.setText(hd.M0(2131750045, null));
            org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.q7, this.J0);
            f10 = 0.66f;
        } else if (!z12 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            f10 = 0.66f;
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && this.A2 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
                z70Var.setVisibility(0);
                z70Var.setText(hd.M0((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? 2131750180 : 2131750179, null));
                org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.q5, this.J0);
            } else {
                z70Var.setVisibility(8);
            }
        } else {
            f10 = 0.66f;
            z70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750181, null), new d3(this, str3, 1)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            z70Var.setVisibility(0);
            org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.q5, this.J0);
        }
        z70 z70Var2 = this.f2;
        if (!z12 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            z70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750181, null), new d3(this, str3, 2)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(f10)));
            r14 = 0;
            z70Var2.setVisibility(0);
        } else if (this.A2 && K1(this.a, j10)) {
            int i17 = 6;
            if (i7 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new eq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) org.telegram.messenger.g0.U2(hd.M0(!savedStarGift.unsaved ? 2131750055 : 2131750058, null), new l1(this, i17)));
                z70Var2.setText(org.telegram.messenger.g0.I2(spannableStringBuilder4, true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(f10)));
            } else {
                z70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(!savedStarGift.unsaved ? 2131750253 : 2131750254, null), new l1(this, i17)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(f10)));
            }
            r14 = 0;
            z70Var2.setVisibility(0);
        } else {
            r14 = 0;
            z70Var2.setVisibility(8);
        }
        if (this.a3) {
            t2(r14, r14, null);
            this.n1.n0(1);
            this.a3 = r14;
        }
        this.p1.setTitle(this.R2);
        w2();
    }

    public final void l1(LinearLayout linearLayout, int i7, int i10, int i11, String str, boolean z10) {
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i7);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.s(imageView, i11, e6Var, mode);
        linearLayout.addView(imageView, c8.ja.t(i10, i10, 16, i10 < 15 ? 1 : 0, 0, i10 < 15 ? 1 : 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i12 = org.telegram.ui.ActionBar.j6.r5;
        org.telegram.ui.ActionBar.q6.U(textView, i12, this.J0);
        textView.setText(str);
        linearLayout.addView(textView, c8.ja.t(-2, -2, 16, 4, 0, 0, 0));
        if (z10) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.msg_mini_topicarrow);
            org.telegram.ui.ActionBar.q6.s(imageView2, i12, this.J0, mode);
            linearLayout.addView(imageView2, c8.ja.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x05cd, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r8).drop_original_details_stars >= r39) goto L193;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0342  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.view.View, int[], java.lang.CharSequence, java.lang.String, org.telegram.ui.ActionBar.m6, org.telegram.ui.Components.ec[], org.telegram.ui.Components.ux0[]] */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        int i7;
        CharSequence charSequence;
        CharSequence charSequence2;
        Spannable spannable;
        long j3;
        int i10;
        ?? r15;
        ?? r13;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        float f10;
        l5 l5Var;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        l5 l5Var2;
        boolean z12;
        Object obj;
        Object obj2;
        CharSequence V;
        CharSequence V2;
        TLRPC.Message message;
        gj gjVar;
        int i11;
        int i12;
        Object obj3;
        int i13;
        int i14;
        TL_wallet.nftItem nftitem;
        String str;
        TL_wallet.nftItem nftitem2;
        String str2;
        org.telegram.ui.Wallet.b8 b8Var;
        l5 l5Var3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        long o4 = org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id);
        long o10 = org.telegram.messenger.m5.o(tL_starGiftUnique.host_id);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.R2 = i5.c.l(tL_starGiftUnique.num, ',', sb2);
        boolean z13 = this.M2;
        w5 w5Var = this.b2;
        if (!z13 && (l5Var3 = this.L2) != null && l5Var3.o && (tL_starGiftUnique2 = l5Var3.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            l5Var3.a();
            this.L2 = null;
            w5Var.b.setAlpha(1.0f);
            w5Var.c.setAlpha(0.0f);
        } else if (z13 && this.L2 == null) {
            this.L2 = new l5(w5Var);
        }
        int i15 = 0;
        int i16 = 1;
        boolean z14 = this.e3 == null;
        boolean z15 = z14 && L1(this.a, o4);
        boolean z16 = z14 && L1(this.a, o10);
        boolean M1 = M1(this.a, H1());
        C1();
        w5Var.f(tL_starGiftUnique, z15, z16, M1);
        w5Var.setShowOptions(false);
        TextPaint textPaint = w5Var.H;
        final int i17 = 4;
        int i18 = 2;
        final int i19 = 3;
        if (this.b3 != null) {
            if (this.d3 != null) {
                w5Var.j(new k1(this, 28), this.c3 == null ? null : new View.OnClickListener(this) { // from class: di.w3
                    public final /* synthetic */ c6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i19) {
                            case 0:
                                this.b.N1();
                                break;
                            case 1:
                                this.b.onBackPressed();
                                break;
                            case 2:
                                l5 l5Var4 = this.b.L2;
                                l5Var4.h.e();
                                l5Var4.i.e();
                                l5Var4.j.e();
                                l5Var4.k.e();
                                break;
                            case 3:
                                this.b.R1();
                                break;
                            default:
                                c6 c6Var = this.b;
                                org.telegram.ui.Wallet.h5 h5Var = c6Var.d3;
                                if (h5Var != null) {
                                    c6Var.dismiss();
                                    org.telegram.messenger.g0.i3(new ch.w(h5Var, 13), 250L);
                                    break;
                                }
                                break;
                        }
                    }
                }, new View.OnClickListener(this) { // from class: di.w3
                    public final /* synthetic */ c6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                this.b.N1();
                                break;
                            case 1:
                                this.b.onBackPressed();
                                break;
                            case 2:
                                l5 l5Var4 = this.b.L2;
                                l5Var4.h.e();
                                l5Var4.i.e();
                                l5Var4.j.e();
                                l5Var4.k.e();
                                break;
                            case 3:
                                this.b.R1();
                                break;
                            default:
                                c6 c6Var = this.b;
                                org.telegram.ui.Wallet.h5 h5Var = c6Var.d3;
                                if (h5Var != null) {
                                    c6Var.dismiss();
                                    org.telegram.messenger.g0.i3(new ch.w(h5Var, 13), 250L);
                                    break;
                                }
                                break;
                        }
                    }
                }, true);
                org.telegram.ui.Wallet.h5 h5Var = this.d3;
                org.telegram.ui.Wallet.c8 c8Var = h5Var.b.k0;
                w5Var.setWalletCard((c8Var == null || (nftitem2 = h5Var.a) == null || (str2 = nftitem2.address) == null || (b8Var = (org.telegram.ui.Wallet.b8) c8Var.f.get(str2)) == null || !b8Var.b()) ? false : true);
            } else {
                w5Var.j(new k1(this, i15), this.c3 == null ? null : new k1(this, i16), new k1(this, i18), tL_starGiftUnique.host_id != null);
            }
            org.telegram.ui.Wallet.g5 g5Var = this.c3;
            if (g5Var != null) {
                i14 = ((org.telegram.ui.ActionBar.e2) g5Var.c).currentAccount;
                boolean F = org.telegram.ui.Wallet.c8.F(i14, g5Var.a.slug);
                org.telegram.ui.Wallet.g5 g5Var2 = this.c3;
                org.telegram.ui.Wallet.c8 c8Var2 = g5Var2.c.k0;
                boolean z17 = (c8Var2 == null || (nftitem = g5Var2.b) == null || (str = nftitem.address) == null || !str.equals(c8Var2.Q0)) ? false : true;
                ai.k0 k0Var = w5Var.K;
                k0Var.e(R.drawable.filled_card_color, hd.M0(z17 ? 2131743103 : 2131743109, null), false);
                k0Var.setAlpha((F || z17) ? 1.0f : 0.5f);
            }
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ("#" + hd.E(tL_starGiftUnique.num, ',')));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new org.telegram.messenger.t(ns.U2, 2, false), length, spannableStringBuilder.length(), 33);
        TL_wallet.walletTransaction wallettransaction = this.e3;
        if (wallettransaction != null) {
            charSequence = hd.M0(wallettransaction.incoming ? 2131743075 : 2131743074, null);
            i7 = 1;
        } else {
            if (tLObject != null) {
                i7 = 1;
                charSequence2 = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131743882, org.telegram.messenger.m5.u(tLObject)));
            } else {
                i7 = 1;
                if (tL_starGiftUnique.released_by != null || stargiftattributemodel == null) {
                    charSequence = null;
                } else {
                    charSequence2 = stargiftattributemodel.name;
                }
            }
            charSequence = charSequence2;
        }
        if (tL_textWithEntities == null || textPaint == null) {
            spannable = null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
            gj.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
            spannable = gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        }
        w5Var.h(0, spannableStringBuilder, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        ?? r11 = 0;
        this.f3 = null;
        vx0 vx0Var = this.e2;
        vx0Var.removeAllViews();
        if (z10) {
            j3 = 0;
            i10 = 0;
        } else {
            if (tL_starGiftUnique.host_id != null) {
                if (TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    i13 = 0;
                } else {
                    i13 = 0;
                    vx0Var.p(hd.M0(2131750182, null), tL_starGiftUnique.owner_address, new l1(this, i13));
                }
                if (o10 != 0) {
                    int i20 = i13;
                    i11 = i7;
                    this.f3 = ((sx0) this.e2.o(hd.M0(2131750183, null), this.a, o10, new m1(this, o10, i13)).getChildAt(i11)).getChildAt(i20);
                    i12 = i20;
                    obj3 = null;
                } else {
                    i10 = i13;
                    j3 = 0;
                }
            } else {
                i11 = i7;
                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    vx0Var.p(hd.M0(2131750086, null), tL_starGiftUnique.owner_address, new l1(this, i11));
                } else if (o4 == 0 && tL_starGiftUnique.owner_name != null) {
                    vx0Var.c(hd.M0(2131750086, null), tL_starGiftUnique.owner_name, null, null);
                } else if (o4 != 0) {
                    r11 = 0;
                    j3 = 0;
                    r13 = 0;
                    int i21 = i11;
                    this.f3 = ((sx0) this.e2.o(hd.M0(2131750086, null), this.a, o4, new m1(this, o4, i11)).getChildAt(i21 == true ? 1 : 0)).getChildAt(0);
                    r15 = i21;
                    j1(u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                    j1(u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                    j1(u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    if (!z10) {
                        if (this.D2 == null) {
                            vx0Var.c(hd.M0(2131750054, r11), hd.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + hd.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r11, r11);
                        } else if (this.I2) {
                            vx0Var.c(hd.M0(2131750054, r11), hd.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + hd.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r11, r11);
                        } else {
                            TextView textView = (TextView) ((sx0) vx0Var.c(hd.M0(2131750054, r11), "", r11, r11).getChildAt(r15)).getChildAt(r13);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                            e80 e80Var = new e80(textView, org.telegram.messenger.g0.L(90.0f), r13, this.J0);
                            int i22 = org.telegram.ui.ActionBar.j6.G6;
                            e80Var.a(org.telegram.ui.ActionBar.j6.r1(0.21f, org.telegram.ui.ActionBar.j6.w0(i22, this.J0)), org.telegram.ui.ActionBar.j6.r1(0.08f, org.telegram.ui.ActionBar.j6.w0(i22, this.J0)));
                            spannableStringBuilder3.setSpan(e80Var, r13, r15, 33);
                            textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                            if (!this.H2 && !this.I2 && (gjVar = this.D2) != null) {
                                this.H2 = r15;
                                int e12 = gjVar.e1();
                                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                tL_messages_getMessages.id.add(Integer.valueOf(e12));
                                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new u1(this, e12, r13));
                            }
                        }
                        if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                            org.telegram.messenger.r1 i23 = org.telegram.messenger.r1.i();
                            long j10 = tL_starGiftUnique.value_amount;
                            String str3 = tL_starGiftUnique.value_currency;
                            int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                            i23.getClass();
                            this.e2.e(hd.M0(2131749591, r11), r.b.k("~", org.telegram.messenger.r1.g(str3, h, j10, r15)), hd.M0(2131749590, r11), new aa.r((Object) this, (Object) tL_starGiftUnique, org.telegram.messenger.r1.i().f(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 21), null);
                        }
                    }
                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                    if (stargiftattributeoriginaldetails != null) {
                        if ((stargiftattributeoriginaldetails.flags & r15) != 0) {
                            long o11 = org.telegram.messenger.m5.o(stargiftattributeoriginaldetails.sender_id);
                            SpannableString spannableString = new SpannableString(org.telegram.messenger.m5.l(m10.t0, o11));
                            spannableString.setSpan(new c4(this, o11), r13, spannableString.length(), 33);
                            obj = spannableString;
                        } else {
                            obj = r11;
                        }
                        Object obj4 = obj;
                        f10 = 14.0f;
                        long o12 = org.telegram.messenger.m5.o(stargiftattributeoriginaldetails.recipient_id);
                        SpannableString spannableString2 = new SpannableString(org.telegram.messenger.m5.l(m10.t0, o12));
                        spannableString2.setSpan(new d4(this, o12), r13, spannableString2.length(), 33);
                        if (stargiftattributeoriginaldetails.message != null) {
                            TextPaint textPaint2 = new TextPaint((int) r15);
                            textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                            gj.b(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false, 0);
                            obj2 = gj.B5(org.telegram.messenger.j6.m(spannableStringBuilder4, textPaint2.getFontMetricsInt(), r13, r11, r13), stargiftattributeoriginaldetails.message.entities, textPaint2.getFontMetricsInt(), r13);
                        } else {
                            obj2 = r11;
                        }
                        int i24 = r13;
                        Object replaceAll = hd.E0().C0().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                        if (stargiftattributeoriginaldetails.sender_id != stargiftattributeoriginaldetails.recipient_id) {
                            if (obj4 != null) {
                                if (obj2 == null) {
                                    Object[] objArr = new Object[3];
                                    objArr[i24] = obj4;
                                    objArr[r15] = spannableString2;
                                    objArr[2] = replaceAll;
                                    V2 = hd.V(r11, r11, 2131750386, objArr);
                                } else {
                                    Object[] objArr2 = new Object[4];
                                    objArr2[i24] = obj4;
                                    objArr2[r15] = spannableString2;
                                    objArr2[2] = replaceAll;
                                    objArr2[3] = obj2;
                                    V2 = hd.V(r11, r11, 2131750385, objArr2);
                                }
                            } else if (obj2 == null) {
                                Object[] objArr3 = new Object[2];
                                objArr3[i24] = spannableString2;
                                objArr3[r15] = replaceAll;
                                V2 = hd.V(r11, r11, 2131750384, objArr3);
                            } else {
                                Object[] objArr4 = new Object[3];
                                objArr4[i24] = spannableString2;
                                objArr4[r15] = replaceAll;
                                objArr4[2] = obj2;
                                V = hd.V(r11, r11, 2131750383, objArr4);
                                if (K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                                }
                                tx0 a10 = vx0Var.a(V);
                                a10.setFilled(r15);
                                xh.l lVar = (xh.l) a10.getChildAt(0);
                                lVar.setTextSize(r15, 12.0f);
                                lVar.setGravity(17);
                            }
                            V = V2;
                            if (K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                            }
                            tx0 a102 = vx0Var.a(V);
                            a102.setFilled(r15);
                            xh.l lVar2 = (xh.l) a102.getChildAt(0);
                            lVar2.setTextSize(r15, 12.0f);
                            lVar2.setGravity(17);
                        } else if (obj2 == null) {
                            Object[] objArr5 = new Object[2];
                            objArr5[i24] = obj4;
                            objArr5[r15] = replaceAll;
                            V = hd.V(r11, r11, 2131750382, objArr5);
                            if (K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                                TL_stars.SavedStarGift savedStarGift = this.B2;
                                if (savedStarGift == null || savedStarGift.drop_original_details_stars < j3) {
                                    gj gjVar2 = this.D2;
                                    if (gjVar2 != null && (message = gjVar2.k) != null) {
                                        TLRPC.MessageAction messageAction = message.action;
                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                        }
                                    }
                                }
                                LinearLayout linearLayout = new LinearLayout(getContext());
                                linearLayout.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
                                linearLayout.setOrientation(i24);
                                xh.l lVar3 = new xh.l(getContext());
                                org.telegram.ui.ActionBar.q6.U(lVar3, org.telegram.ui.ActionBar.j6.G6, this.J0);
                                org.telegram.ui.ActionBar.q6.G(lVar3, org.telegram.ui.ActionBar.j6.Xc, this.J0);
                                lVar3.setTextSize(r15, 12.0f);
                                lVar3.setGravity(3);
                                lVar3.setText(V);
                                linearLayout.addView(lVar3, c8.ja.p(-1, -2, 1.0f, 19));
                                ImageView imageView = new ImageView(getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                int i25 = org.telegram.ui.ActionBar.j6.Fi;
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(i25, this.J0)), 6, 6);
                                org.telegram.ui.ActionBar.m6 K = org.telegram.ui.ActionBar.q6.K(0.1f, i25);
                                org.telegram.ui.ActionBar.e6 e6Var = this.J0;
                                imageView.setBackground(a02);
                                org.telegram.ui.ActionBar.q6.j(imageView, a02, r11, K, e6Var);
                                imageView.setImageResource(R.drawable.menu_delete_old);
                                org.telegram.ui.ActionBar.q6.s(imageView, i25, this.J0, PorterDuff.Mode.SRC_IN);
                                c8.na.a(imageView);
                                imageView.setOnClickListener(new ai.v2(14, this, V));
                                linearLayout.addView(imageView, c8.ja.q(32, 32, 0.0f, 21, 8, 0, 0, 0));
                                TableRow tableRow = new TableRow(getContext());
                                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                                layoutParams.span = 2;
                                tableRow.addView(new tx0(vx0Var, linearLayout, true), layoutParams);
                                vx0Var.addView(tableRow);
                            }
                            tx0 a1022 = vx0Var.a(V);
                            a1022.setFilled(r15);
                            xh.l lVar22 = (xh.l) a1022.getChildAt(0);
                            lVar22.setTextSize(r15, 12.0f);
                            lVar22.setGravity(17);
                        } else {
                            Object[] objArr6 = new Object[3];
                            objArr6[i24] = obj4;
                            objArr6[r15] = replaceAll;
                            objArr6[2] = obj2;
                            V2 = hd.V(r11, r11, 2131750381, objArr6);
                            V = V2;
                            if (K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                            }
                            tx0 a10222 = vx0Var.a(V);
                            a10222.setFilled(r15);
                            xh.l lVar222 = (xh.l) a10222.getChildAt(0);
                            lVar222.setTextSize(r15, 12.0f);
                            lVar222.setGravity(17);
                        }
                    } else {
                        f10 = 14.0f;
                    }
                    if (this.e3 != null) {
                        this.f3 = r11;
                        vx0Var.removeAllViews();
                        long e10 = m10.i(this.a).e();
                        this.e2.n(hd.M0(this.e3.incoming ? 2131743015 : 2131743040, r11), this.a, e10, new m1(this, e10, 3));
                        long abs = Math.abs(this.e3.fee);
                        if (abs > j3) {
                            TextView textView2 = new TextView(getContext());
                            textView2.setGravity(16);
                            textView2.setIncludeFontPadding(false);
                            textView2.setTextSize(1, f10);
                            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.G6, this.J0);
                            textView2.setText(org.telegram.ui.Wallet.y5.w0(this.a, abs, this.J0));
                            vx0Var.f(textView2, hd.M0(2131743121, r11));
                        }
                        if (this.e3.date != 0) {
                            vx0Var.c(hd.M0(2131743144, r11), hd.Q(this.e3.date), r11, r11);
                        }
                    }
                    l5Var = this.L2;
                    hi.d dVar = this.g2;
                    if (l5Var != null || !l5Var.o) {
                        if (this.e3 != null) {
                            dVar.setFilled(true);
                            dVar.i(hd.M0(2131747831, r11), !this.a3, true);
                            dVar.g(r11, !this.a3);
                            dVar.setOnClickListener(new k1(this, 29));
                        } else {
                            if (K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id)) || tL_starGiftUnique.resell_amount == null) {
                                if (!this.n2 || this.V1 == null || this.C2 == null || D1() < 0 || this.C2.b(D1()) < 0) {
                                    final int i26 = 1;
                                    dVar.setFilled(true);
                                    dVar.i(hd.M0(2131747831, r11), !this.a3, true);
                                    dVar.g(r11, !this.a3);
                                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: di.w3
                                        public final /* synthetic */ c6 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i26) {
                                                case 0:
                                                    this.b.N1();
                                                    break;
                                                case 1:
                                                    this.b.onBackPressed();
                                                    break;
                                                case 2:
                                                    l5 l5Var4 = this.b.L2;
                                                    l5Var4.h.e();
                                                    l5Var4.i.e();
                                                    l5Var4.j.e();
                                                    l5Var4.k.e();
                                                    break;
                                                case 3:
                                                    this.b.R1();
                                                    break;
                                                default:
                                                    c6 c6Var = this.b;
                                                    org.telegram.ui.Wallet.h5 h5Var2 = c6Var.d3;
                                                    if (h5Var2 != null) {
                                                        c6Var.dismiss();
                                                        org.telegram.messenger.g0.i3(new ch.w(h5Var2, 13), 250L);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                } else {
                                    dVar.setFilled(false);
                                    int b10 = this.C2.b(D1());
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                    spannableStringBuilder5.append((CharSequence) hd.M0(2131749855, r11));
                                    Object obj5 = this.C2.get(b10);
                                    if (!(obj5 instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj5).gift) == null || (document = starGift.getDocument()) == null) {
                                        z11 = true;
                                    } else {
                                        spannableStringBuilder5.append((CharSequence) " e");
                                        z11 = true;
                                        spannableStringBuilder5.setSpan(new org.telegram.ui.Components.p5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                                    }
                                    dVar.i(spannableStringBuilder5, this.a3 ^ z11, z11);
                                    dVar.g(r11, this.a3 ^ z11);
                                    dVar.setOnClickListener(new d2(this, b10, 3));
                                }
                                this.p1.setTitle(this.R2);
                                l5Var2 = this.L2;
                                if (l5Var2 == null) {
                                    boolean z18 = this.M2;
                                    l1 l1Var = new l1(this, 24);
                                    l1 l1Var2 = new l1(this, 25);
                                    ArrayList arrayList = l5Var2.f;
                                    w5 w5Var2 = l5Var2.a;
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique3 = l5Var2.l;
                                    if (tL_starGiftUnique3 != null && tL_starGiftUnique3.id == tL_starGiftUnique.id) {
                                        z12 = l5Var2.o;
                                    } else if (z18) {
                                        org.telegram.ui.Components.i9 upgradeImageView = w5Var2.getUpgradeImageView();
                                        o5 o5Var = w5Var2.c;
                                        TL_stars.starGiftAttributeModel upgradeImageViewAttribute = w5Var2.getUpgradeImageViewAttribute();
                                        TL_stars.starGiftAttributePattern upgradePatternAttribute = w5Var2.getUpgradePatternAttribute();
                                        TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = w5Var2.getUpgradeBackdropAttribute();
                                        TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                                        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                                        l5Var2.o = true;
                                        l5Var2.l = tL_starGiftUnique;
                                        l5Var2.r = l1Var;
                                        l5Var2.s = l1Var2;
                                        l5Var2.t = (float) Math.random();
                                        l5Var2.m = System.currentTimeMillis();
                                        l5Var2.n = 0.0f;
                                        l5Var2.p = false;
                                        l5Var2.q = false;
                                        l5Var2.o = true;
                                        h5 h5Var2 = l5Var2.h;
                                        if (h5Var2 != null) {
                                            h5Var2.a();
                                        }
                                        j5 j5Var = new j5(o5Var, stargiftattributemodel2);
                                        if (o5Var.isAttachedToWindow() && j5Var.c) {
                                            j5Var.d.P();
                                        }
                                        l5Var2.h = new h5(new f5(l5Var2, 0), l5Var2.e, new j5(upgradeImageView, upgradeImageViewAttribute), j5Var, 0.9f, l5Var2.t > 0.5f ? 3 : 2);
                                        h5 h5Var3 = l5Var2.i;
                                        if (h5Var3 != null) {
                                            h5Var3.a();
                                        }
                                        l5Var2.i = new h5(new f5(l5Var2, 0), l5Var2.g, new k5(upgradePatternAttribute), new k5(stargiftattributepattern), 1.0f, l5Var2.t > 0.5f ? 2 : 1);
                                        h5 h5Var4 = l5Var2.j;
                                        if (h5Var4 != null) {
                                            h5Var4.a();
                                        }
                                        l5Var2.j = new h5(new f5(l5Var2, 0), arrayList, new i5(upgradeBackdropAttribute), new i5(stargiftattributebackdrop), 0.5f, l5Var2.t > 0.5f ? 2 : 1);
                                        h5 h5Var5 = l5Var2.k;
                                        if (h5Var5 != null) {
                                            h5Var5.a();
                                        }
                                        l5Var2.k = new h5(new f5(l5Var2, 0), arrayList, new i5(upgradeBackdropAttribute), new i5(stargiftattributebackdrop), 1.25f, l5Var2.t > 0.5f ? 2 : 1);
                                        l5Var2.b();
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        w5Var.b.setAlpha(0.0f);
                                        w5Var.c.setAlpha(1.0f);
                                        dVar.i(hd.M0(2131749610, null), true, true);
                                        dVar.setFilled(true);
                                        final int i27 = 2;
                                        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: di.w3
                                            public final /* synthetic */ c6 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                switch (i27) {
                                                    case 0:
                                                        this.b.N1();
                                                        break;
                                                    case 1:
                                                        this.b.onBackPressed();
                                                        break;
                                                    case 2:
                                                        l5 l5Var4 = this.b.L2;
                                                        l5Var4.h.e();
                                                        l5Var4.i.e();
                                                        l5Var4.j.e();
                                                        l5Var4.k.e();
                                                        break;
                                                    case 3:
                                                        this.b.R1();
                                                        break;
                                                    default:
                                                        c6 c6Var = this.b;
                                                        org.telegram.ui.Wallet.h5 h5Var22 = c6Var.d3;
                                                        if (h5Var22 != null) {
                                                            c6Var.dismiss();
                                                            org.telegram.messenger.g0.i3(new ch.w(h5Var22, 13), 250L);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        int length2 = ((c6) this.P2.d).O2.length - 1;
                                        uj0 uj0Var = this.o1;
                                        uj0Var.v0(length2);
                                        uj0Var.post(new l1(this, 26));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            dVar.setFilled(true);
                            m2(tL_starGiftUnique);
                            final int i28 = 0;
                            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: di.w3
                                public final /* synthetic */ c6 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i28) {
                                        case 0:
                                            this.b.N1();
                                            break;
                                        case 1:
                                            this.b.onBackPressed();
                                            break;
                                        case 2:
                                            l5 l5Var4 = this.b.L2;
                                            l5Var4.h.e();
                                            l5Var4.i.e();
                                            l5Var4.j.e();
                                            l5Var4.k.e();
                                            break;
                                        case 3:
                                            this.b.R1();
                                            break;
                                        default:
                                            c6 c6Var = this.b;
                                            org.telegram.ui.Wallet.h5 h5Var22 = c6Var.d3;
                                            if (h5Var22 != null) {
                                                c6Var.dismiss();
                                                org.telegram.messenger.g0.i3(new ch.w(h5Var22, 13), 250L);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                    }
                    this.p1.setTitle(this.R2);
                    l5Var2 = this.L2;
                    if (l5Var2 == null) {
                    }
                }
                i12 = 0;
                obj3 = null;
            }
            j3 = 0;
            r15 = i11;
            r11 = obj3;
            r13 = i12;
            j1(u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            j1(u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            j1(u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            if (!z10) {
            }
            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
            if (stargiftattributeoriginaldetails != null) {
            }
            if (this.e3 != null) {
            }
            l5Var = this.L2;
            hi.d dVar2 = this.g2;
            if (l5Var != null) {
            }
            if (this.e3 != null) {
            }
            this.p1.setTitle(this.R2);
            l5Var2 = this.L2;
            if (l5Var2 == null) {
            }
        }
        r15 = i7;
        r13 = i10;
        j1(u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
        j1(u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        j1(u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z10) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) u8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
        }
        if (this.e3 != null) {
        }
        l5Var = this.L2;
        hi.d dVar22 = this.g2;
        if (l5Var != null) {
        }
        if (this.e3 != null) {
        }
        this.p1.setTitle(this.R2);
        l5Var2 = this.L2;
        if (l5Var2 == null) {
        }
    }

    public final void m1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            u8.y(this.a, false).P(x1());
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
            u8.y(this.a, false).P(x1());
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
                k2(savedStarGift2, this.C2);
                this.k3 = null;
                this.M2 = false;
                m8 m8Var = this.C2;
                if (m8Var != null) {
                    m8Var.d();
                } else {
                    u8.y(this.a, false).P(this.T1);
                }
                org.telegram.messenger.g0.h3(runnable);
                return;
            }
        }
        if (this.C2 == null) {
            u8.y(this.a, false).P(x1());
        }
        this.M2 = true;
        this.B2 = null;
        this.A2 = false;
        gj gjVar = new gj(this.a, message, false, false);
        gjVar.L5();
        j2(gjVar, this.C2);
        this.k3 = null;
        this.M2 = false;
        org.telegram.messenger.g0.h3(runnable);
    }

    public final void m2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        hi.d dVar = this.g2;
        if (z10) {
            dVar.i(lb.s1(lb.V0(hd.a0(null, null, 2131746146, tL_starGiftUnique.getResellAmount(cg.b.b).d()), true), true), !this.a3, true);
            dVar.g(lb.T0(hd.H(',', "ResellGiftBuyEq", (int) resellAmount.a())), !this.a3);
        } else {
            dVar.i(lb.T0(hd.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.a3, true);
            dVar.g(null, !this.a3);
        }
    }

    public final boolean n1() {
        TLRPC.Peer peer;
        if (B1() == null) {
            return false;
        }
        gj gjVar = this.D2;
        if (gjVar != null) {
            TLRPC.MessageAction messageAction = gjVar.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!gjVar.P3() || ((gj.B0(this.D2.k) > m10.i(this.a).e() ? 1 : (gj.B0(this.D2.k) == m10.i(this.a).e() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && L1(this.a, org.telegram.messenger.m5.o(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && np.s1(this.a).F6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.D2.k.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                int currentTime = np.s1(this.a).F6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                int i7 = this.a;
                long j3 = this.T1;
                if (L1(i7, j3)) {
                    int i10 = this.B2.flags;
                    if (((j3 < 0 ? 2048 : 8) & i10) != 0 && (i10 & 16) != 0 && (i10 & 2) != 0 && currentTime > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void n2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10) {
        if (z10) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = m10.i(this.a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= TLObject.FLAG_12;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.b2.setWalletDisplayed(z10);
        x2();
    }

    public final boolean o1() {
        int i7;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null || H1.crafted || !L1(this.a, org.telegram.messenger.m5.o(H1.owner_id))) {
            return false;
        }
        gj gjVar = this.D2;
        if (gjVar == null) {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i7 = savedStarGift.can_craft_at;
            }
        }
        TLRPC.Message message = gjVar.k;
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

    public final void o2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        TLRPC.Peer peer = H1.owner_id;
        if (peer == null) {
            peer = H1.host_id;
        }
        long o4 = org.telegram.messenger.m5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(H1.title);
        sb2.append(" #");
        this.y2.setText(hd.a0(null, null, 2131749833, i5.c.l(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131749835, null));
        if (o4 == m10.i(this.a).e() && !m10.i(this.a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.T2 == null) {
                this.T2 = new eq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.T2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        hi.d dVar = this.g2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new k1(this, 26));
        this.b2.setWearPreview(np.s1(this.a).e2(o4));
        t2(2, false, null);
        this.w2 = true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.a).c(this, ns.G3);
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void onBackPressed() {
        w5 w5Var;
        y4 y4Var;
        if (this.X2.c(4) && (w5Var = this.b2) != null && (y4Var = w5Var.N) != null) {
            if (y4Var.i0) {
                return;
            }
            if (y4Var.j0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.w2 || this.X2.c <= 0 || this.g2.R || this.j3) {
            super.onBackPressed();
            return;
        }
        gj gjVar = this.D2;
        if (gjVar != null) {
            j2(gjVar, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                k2(savedStarGift, this.C2);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
                if (tL_starGiftUnique != null) {
                    i2(this.E2, tL_starGiftUnique, this.C2);
                }
            }
        }
        t2(0, true, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.a).n(this, ns.G3);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p1() {
        if (this.b3 == null && B1() != null) {
            gj gjVar = this.D2;
            if (gjVar != null) {
                TLRPC.Message message = gjVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TL_stars.StarGift starGift = tL_messageActionStarGift.gift;
                        if ((starGift instanceof TL_stars.TL_starGift) && !starGift.limited && starGift.availability_total <= 0 && !starGift.auction && !tL_messageActionStarGift.converted && !tL_messageActionStarGift.upgraded && !tL_messageActionStarGift.refunded && tL_messageActionStarGift.convert_stars > 0) {
                            boolean P3 = gjVar.P3();
                            boolean z10 = gj.B0(this.D2.k) == m10.i(this.a).e();
                            TLRPC.Peer peer = tL_messageActionStarGift.peer;
                            if (peer != null) {
                                return L1(this.a, org.telegram.messenger.m5.o(peer));
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
                    if (!(starGift2 instanceof TL_stars.TL_starGift) || starGift2.limited || starGift2.availability_total > 0 || starGift2.auction || savedStarGift.refunded || !L1(this.a, this.T1)) {
                    }
                }
            }
        }
        return false;
    }

    public final void p2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique H1 = H1();
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null || H1 == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = B1;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject u10 = ki.x2.u(this.J0, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new bi.l1(this, charSequence, H1, tL_inputInvoiceStarGiftDropOriginalDetails, 2));
    }

    public final void q1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String M0 = hd.M0(2131750266, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = hd.M0(2131750267, null);
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
            alertDialog$Builder.k(hd.M0(2131747805, null), new p3(this, H1, 1));
        }
        i5.c.x(null, 2131752589, alertDialog$Builder, null);
    }

    public final void q2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        float primaryHorizontal;
        hi.l3 l3Var = this.u3;
        if ((l3Var != null && l3Var.W && this.v3 == view) || view == null) {
            return;
        }
        if (!z10) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof org.telegram.ui.ActionBar.j5)) {
                return;
            } else {
                layout = ((org.telegram.ui.ActionBar.j5) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            org.telegram.ui.Components.fc[] fcVarArr = (org.telegram.ui.Components.fc[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.fc.class);
            if (fcVarArr == null || fcVarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(fcVarArr[fcVarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
        } else {
            if (!(view instanceof org.telegram.ui.ActionBar.j5)) {
                return;
            }
            org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) view;
            primaryHorizontal = (j5Var.getRightDrawableWidth() / 2.0f) + j5Var.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        k4 k4Var = this.U1;
        k4Var.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        hi.l3 l3Var2 = this.u3;
        if (l3Var2 != null) {
            l3Var2.f(true);
            this.u3 = null;
        }
        hi.l3 l3Var3 = new hi.l3(getContext(), 3);
        l3Var3.r(!z10);
        l3Var3.u(charSequence);
        l3Var3.p(0.0f, (iArr[0] + primaryHorizontal) - (org.telegram.messenger.g0.L(16.0f) + this.u0));
        l3Var3.setTranslationY(((iArr[1] - org.telegram.messenger.g0.L(100.0f)) - (view.getHeight() / 2.0f)) + org.telegram.messenger.g0.L((z10 ? 18 : 0) + 4.33f));
        l3Var3.d = 3000L;
        l3Var3.setPadding(org.telegram.messenger.g0.L(16.0f) + this.u0, 0, org.telegram.messenger.g0.L(16.0f) + this.u0, 0);
        l3Var3.r0 = new bi.c0(l3Var3, 1);
        l3Var3.w();
        k4Var.addView(l3Var3, c8.ja.c(100.0f, -1));
        this.u3 = l3Var3;
        this.v3 = view;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void r0() {
        hi.l3 l3Var = this.u3;
        if (l3Var != null) {
            l3Var.f(true);
            this.u3 = null;
        }
    }

    public final void r1(long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload, vf.b bVar, wg.c1 c1Var) {
        TL_wallet.nftItem nftitem = this.b3;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (nftitem == null || H1 == null || TextUtils.isEmpty(H1.slug)) {
            return;
        }
        bVar.d();
        w2 w2Var = new w2(this, bVar, c1Var, j3, H1, nftitem, 0);
        if (stargiftdepositpayload != null) {
            w2Var.a(stargiftdepositpayload);
            return;
        }
        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
        depositstargift.peer = np.s1(this.a).j1(j3);
        depositstargift.slug = H1.slug;
        ConnectionsManager.getInstance(this.a).sendRequestTyped(depositstargift, new d3.b(1), new b2(this, bVar, c1Var, w2Var, 1));
    }

    public final void r2(int i7, Context context, boolean z10) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(64.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i10, this.J0));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(frameLayout, L2, M, null, e6Var);
        f10.addView(frameLayout, c8.ja.t(64, 64, 49, 0, 6, 0, 0));
        fh0 fh0Var = new fh0(context);
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        fh0Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(fh0Var, c8.ja.r(64, 64, 17));
        fh0Var.d();
        TextView b10 = c8.sa.b(context, 20.0f, org.telegram.ui.ActionBar.j6.G6, true, null);
        b10.setGravity(17);
        b10.setText(hd.M0(z10 ? 2131750005 : 2131749911, null));
        f10.addView(b10, c8.ja.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = c8.sa.b(context, 14.0f, org.telegram.ui.ActionBar.j6.F6, false, null);
        b11.setGravity(17);
        b11.setText(hd.a0(null, null, z10 ? 2131750006 : 2131749912, hd.c0(Math.max(10, i7))));
        f10.addView(b11, c8.ja.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, this.J0);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(hd.M0(2131747831, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        super.s0();
        try {
            Q(org.telegram.ui.ActionBar.j6.h5);
            w5 w5Var = this.b2;
            if (w5Var != null) {
                w5Var.l();
            }
            eq eqVar = this.Z2;
            if (eqVar != null) {
                Drawable drawable = eqVar.c;
                if (drawable instanceof x5) {
                    ((x5) drawable).d.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.J0));
                    hi.d dVar = this.g2;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(final long j3, final z10 z10Var) {
        TLRPC.Message message;
        long o4;
        long j10;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.B2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            gj gjVar = this.D2;
            if (gjVar == null || (message = gjVar.k) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            o4 = org.telegram.messenger.m5.o(tL_messageActionStarGiftUnique.gift.owner_id);
            j10 = tL_messageActionStarGiftUnique.transfer_stars;
        } else {
            j10 = savedStarGift.transfer_stars;
            o4 = this.T1;
        }
        if (j10 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = B1;
            transferstargift.to_id = np.s1(this.a).j1(j3);
            final long j11 = o4;
            ConnectionsManager.getInstance(this.a).sendRequest(transferstargift, new RequestDelegate() { // from class: di.e2
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    boolean z10 = tLObject instanceof TLRPC.Updates;
                    c6 c6Var = c6.this;
                    if (z10) {
                        np.s1(c6Var.a).O3((TLRPC.Updates) tLObject, false);
                    }
                    org.telegram.messenger.g0.h3(new p2(c6Var, z10Var, tL_error, tLObject, j3, j11));
                }
            });
            return;
        }
        long j12 = o4;
        u8 y10 = u8.y(this.a, false);
        if (!y10.e) {
            y10.r(new f2(this, y10, j3, z10Var, 0));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = B1;
        tL_inputInvoiceStarGiftTransfer.to_id = np.s1(this.a).j1(j3);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject u10 = ki.x2.u(this.J0, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new g2(this, tL_inputInvoiceStarGiftTransfer, j3, j12, z10Var));
    }

    public final void s2(boolean z10, org.telegram.ui.ActionBar.t1 t1Var, vf.b bVar, Runnable runnable) {
        bVar.d();
        m10 i7 = m10.i(this.a);
        TL_account.tmpPassword tmppassword = i7.y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.a).getCurrentTime() + 60) {
            i7.y = null;
            i7.v(false);
        }
        TL_account.tmpPassword tmppassword2 = i7.y;
        if (tmppassword2 == null) {
            W1(z10, bVar, runnable);
        } else {
            J1(tmppassword2.tmp_password, null, z10, new t2(this, z10, bVar, runnable, t1Var));
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        gj gjVar;
        TLRPC.Message message;
        if (np.s1(this.a).v2()) {
            org.telegram.ui.b.b(this.a);
            return;
        }
        if (this.E2 != null && this.F2 == null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
            t1Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.E2;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift, new bi.v2(4, this, t1Var));
        } else if (this.B2 == null && (gjVar = this.D2) != null && (message = gjVar.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
                        t1Var2.r(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new bi.j6(this, tL_messageActionStarGift, t1Var2, 1));
                        return;
                    }
                    if (B1() != null) {
                        org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
                        t1Var3.r(500L);
                        u8.y(this.a, false).M(B1(), new ai.v1(7, this, t1Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t1() {
        TL_stars.InputSavedStarGift B1;
        long j3;
        hi.d dVar = this.g2;
        if (dVar.R || (B1 = B1()) == null) {
            return;
        }
        gj gjVar = this.D2;
        String str = null;
        long j10 = 0;
        if (gjVar != null) {
            TLRPC.MessageAction messageAction = gjVar.k.action;
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
        if (j3 > 0 || this.o3 != null) {
            dVar.setLoading(true);
            fp fpVar = this.s2;
            if (j3 > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = fpVar.a.q;
                upgradestargift.stargift = B1;
                ConnectionsManager.getInstance(this.a).sendRequest(upgradestargift, new bi.v2(6, this, B1));
                return;
            }
            int i7 = 0;
            u8 y10 = u8.y(this.a, false);
            if (!y10.e) {
                y10.r(new s2(0, this, y10));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.o3.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = fpVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = np.s1(this.a).j1(this.T1);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.o3.invoice.prices;
            int size = arrayList.size();
            while (i7 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                i7++;
                j10 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new y(this, str, B1, j10, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t2(int i7, boolean z10, ai.q qVar) {
        int i10;
        hi.l3 l3Var;
        l5 l5Var;
        ValueAnimator valueAnimator = this.Y2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y2 = null;
        }
        w5 w5Var = this.b2;
        if (i7 != 1) {
            org.telegram.messenger.g0.r(w5Var.m0);
        }
        if (!this.a3) {
            this.W2 = Float.valueOf(this.U1.f());
        }
        b5 b5Var = this.X2;
        this.X2 = new b5(b5Var == null ? 0 : b5Var.c, i7);
        i4 i4Var = this.P2;
        int finalHeight = w5Var.getFinalHeight();
        int w12 = w1();
        if (this.X2.d(1)) {
            FrameLayout frameLayout = this.j2;
            if (frameLayout.getVisibility() == 0) {
                i10 = frameLayout.getMeasuredHeight();
                i4Var.H(finalHeight, w12 + i10);
                if (this.X2.c == 0 && (l5Var = this.L2) != null) {
                    l5Var.c();
                }
                g4 g4Var = this.z2;
                g4 g4Var2 = this.x2;
                g4 g4Var3 = this.o2;
                g4 g4Var4 = this.c2;
                if (z10) {
                    this.X2.a = 1.0f;
                    P1();
                    g4Var4.setVisibility(i7 == 0 ? 0 : 8);
                    g4Var3.setVisibility(i7 == 1 ? 0 : 8);
                    g4Var2.setVisibility(i7 == 2 ? 0 : 8);
                    g4Var.setVisibility(i7 != 3 ? 8 : 0);
                    v2();
                    if (qVar != null) {
                        qVar.run();
                    }
                } else {
                    g4Var4.setVisibility(this.X2.b(0) ? 0 : 8);
                    g4Var3.setVisibility(this.X2.b(1) ? 0 : 8);
                    g4Var2.setVisibility(this.X2.b(2) ? 0 : 8);
                    g4Var.setVisibility(this.X2.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.Y2 = ofFloat;
                    ofFloat.addUpdateListener(new ah.h(this, 5));
                    this.Y2.addListener(new y3(this, i7, qVar, r5));
                    this.Y2.setInterpolator(er.h);
                    this.Y2.setDuration(320L);
                    this.Y2.start();
                    b5 b5Var2 = this.X2;
                    org.telegram.ui.Components.i9[] i9VarArr = w5Var.d;
                    int i11 = b5Var2.b;
                    int i12 = b5Var2.c;
                    if (i11 != i12) {
                        ch0 B = i9VarArr[i11].getImageReceiver().B();
                        ch0 B2 = i9VarArr[i12].getImageReceiver().B();
                        if (B2 != null && B != null) {
                            B2.T(false, B.t());
                        }
                    }
                }
                l3Var = this.u3;
                if (l3Var == null) {
                    l3Var.f(true);
                    this.u3 = null;
                    return;
                }
                return;
            }
        }
        i10 = 0;
        i4Var.H(finalHeight, w12 + i10);
        if (this.X2.c == 0) {
            l5Var.c();
        }
        g4 g4Var5 = this.z2;
        g4 g4Var22 = this.x2;
        g4 g4Var32 = this.o2;
        g4 g4Var42 = this.c2;
        if (z10) {
        }
        l3Var = this.u3;
        if (l3Var == null) {
        }
    }

    public final void u2(boolean z10) {
        boolean z11;
        int i7;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        np.e1().edit().putInt("statusgiftpage", 3).apply();
        boolean M1 = M1(this.a, H1());
        boolean z12 = !M1;
        boolean M12 = M1(this.a, H1());
        hi.d dVar = this.g2;
        if (M12) {
            np.s1(this.a).h5(x1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z11 = z12;
            i7 = 3;
        } else {
            z11 = z12;
            i7 = 3;
            long x12 = x1();
            if (x12 >= 0) {
                if (!m10.i(this.a).q()) {
                    org.telegram.ui.Components.xb P = k().P(R.raw.star_premium_2, org.telegram.messenger.g0.x2(hd.M0(2131750423, null), new l1(this, 2)));
                    P.t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                np s12 = np.s1(this.a);
                dVar.setLoading(true);
                np.s1(this.a).G0().a(x12, new o1(this, s12, x12, 0));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = H1.id;
            np.s1(this.a).h5(x1(), tL_inputEmojiStatusCollectible, H1);
        }
        this.b2.J[1].e(!M1 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, hd.M0(!M1 ? 2131750422 : 2131750425, null), true);
        if (this.w2) {
            dismiss();
            return;
        }
        ai.q qVar = new ai.q(i7, this, z11);
        if (this.X2.c(0)) {
            qVar.run();
        } else {
            t2(0, true, qVar);
        }
        dVar.i(hd.M0(2131747831, null), !this.a3, true);
        dVar.g(null, !this.a3);
        dVar.setOnClickListener(new k1(this, 4));
    }

    public final void v2() {
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

    public final int w1() {
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

    public final void w2() {
        boolean I1 = I1(false);
        e4 e4Var = this.V1;
        e4Var.setPosition(I1 ? 1 : 0);
        e4Var.B(false);
        if (this.C2 == null || I1(true) || this.C2.e() >= this.C2.c()) {
            return;
        }
        this.C2.a();
    }

    public final long x1() {
        TLRPC.Peer peer;
        gj gjVar = this.D2;
        if (gjVar == null) {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? org.telegram.messenger.m5.o(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.T1;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
            if (tL_starGiftUnique != null) {
                return org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id);
            }
            return 0L;
        }
        TLRPC.Message message = gjVar.k;
        if (message == null) {
            return 0L;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
            return peer2 != null ? org.telegram.messenger.m5.o(peer2) : gjVar.P3() ? gj.B0(this.D2.k) : m10.i(this.a).e();
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return 0L;
        }
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
        TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
        if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && (peer = starGift2.owner_id) != null) {
            return org.telegram.messenger.m5.o(peer);
        }
        TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
        if (peer3 != null) {
            return org.telegram.messenger.m5.o(peer3);
        }
        return 0L;
    }

    public final void x2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        TL_wallet.nftItem nftitem = this.b3;
        LinearLayout linearLayout = this.u2;
        if (nftitem == null || H1 == null) {
            linearLayout.setVisibility(8);
            return;
        }
        this.d2.setVisibility(8);
        this.f2.setVisibility(8);
        linearLayout.setVisibility(0);
        this.v2.a(H1.host_id != null, linearLayout.isAttachedToWindow());
    }

    public final TL_stars.StarGift y1() {
        gj gjVar = this.D2;
        if (gjVar != null) {
            TLRPC.Message message = gjVar.k;
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

    public final String z1() {
        TL_stars.StarGift y12 = y1();
        if (!(y12 instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) y12).title);
        sb2.append(" #");
        return i5.c.l(r0.num, ',', sb2);
    }
}
