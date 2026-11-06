package bi;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.mg0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class k7 extends org.telegram.ui.Components.na implements ls {
    public static final /* synthetic */ int s3 = 0;
    public String A2;
    public TL_stars.TL_starGiftUnique B2;
    public boolean C2;
    public boolean D2;
    public boolean E2;
    public boolean F2;
    public boolean G2;
    public s6 H2;
    public boolean I2;
    public l5 J2;
    public final int[] K2;
    public k5 L2;
    public int M2;
    public String N2;
    public zh.k3 O2;
    public final long P1;
    public wp P2;
    public final m5 Q1;
    public boolean Q2;
    public final f5 R1;
    public x4 R2;
    public final jz S1;
    public Float S2;
    public final View T1;
    public g6 T2;
    public i5 U1;
    public ValueAnimator U2;
    public i5 V1;
    public wp V2;
    public final j5 W1;
    public boolean W2;
    public final e7 X1;
    public TL_wallet.nftItem X2;
    public final h5 Y1;
    public org.telegram.ui.Wallet.g5 Y2;
    public final w70 Z1;
    public org.telegram.ui.Wallet.h5 Z2;
    public final tx0 a2;
    public TL_wallet.walletTransaction a3;
    public final w70 b2;
    public View b3;
    public final fi.d c2;
    public zh.q1 c3;
    public final FrameLayout d2;
    public boolean d3;
    public final w70 e2;
    public Boolean e3;
    public final FrameLayout f2;
    public boolean f3;
    public final View g2;
    public ArrayList g3;
    public final FrameLayout h2;
    public ArrayList h3;
    public g7 i2;
    public ArrayList i3;
    public boolean j2;
    public boolean j3;
    public final h5 k2;
    public TLRPC.PaymentForm k3;
    public final hi.i[] l2;
    public final wp[] l3;
    public final View m2;
    public final z1 m3;
    public final LinearLayout n2;
    public int n3;
    public final wo o2;
    public Boolean o3;
    public final TextView p2;
    public boolean p3;
    public final LinearLayout q2;
    public fi.m3 q3;
    public final wo r2;
    public View r3;
    public boolean s2;
    public final h5 t2;
    public final TextView u2;
    public final h5 v2;
    public boolean w2;
    public TL_stars.SavedStarGift x2;
    public w9 y2;
    public ij z2;

    public k7(Context context, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        super(context, null, false, false, f6Var);
        int i10 = 0;
        this.j2 = false;
        this.K2 = new int[2];
        this.M2 = -1;
        this.N2 = "";
        this.T2 = new g6(0, 0);
        this.W2 = true;
        this.l3 = new wp[1];
        this.m3 = new z1(this, 11);
        this.p3 = true;
        this.a = i7;
        this.P1 = j3;
        this.r1 = Math.max(0.05f, org.telegram.messenger.g0.L(82.0f) / (org.telegram.messenger.g0.q.y + org.telegram.messenger.g0.m));
        this.x = true;
        this.b = new e5(i10, context, this);
        m5 m5Var = new m5(this, context);
        this.Q1 = m5Var;
        f5 f5Var = new f5(this, context);
        this.R1 = f5Var;
        f5Var.setAdapter(new g5(i10, context, this));
        v2();
        View view2 = new View(context);
        this.T1 = view2;
        int i11 = org.telegram.ui.ActionBar.k6.h5;
        org.telegram.ui.ActionBar.r6.i(i11, view2, f6Var);
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, 50, 80);
        int i12 = this.t0;
        e10.rightMargin = i12;
        e10.leftMargin = i12;
        this.b.addView(view2, e10);
        this.b.addView(f5Var, c8.ha.e(-1, -1, qs.E1));
        P(i11);
        org.telegram.messenger.g0.E2(this.k1);
        m5Var.addView(this.k1, c8.ha.e(-1, -1, qs.E1));
        h5 h5Var = new h5(this, context, 0);
        this.Y1 = h5Var;
        h5Var.setOrientation(1);
        h5Var.setPadding(org.telegram.messenger.g0.L(14.0f) + this.t0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f) + this.t0, org.telegram.messenger.g0.L(68.0f));
        m5Var.addView(h5Var, c8.ha.e(-1, -1, 55));
        w70 w70Var = new w70(context, f6Var);
        this.Z1 = w70Var;
        int i13 = org.telegram.ui.ActionBar.k6.q5;
        org.telegram.ui.ActionBar.r6.V(w70Var, i13, f6Var);
        w70Var.setTextSize(1, 12.0f);
        w70Var.setGravity(17);
        w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        w70Var.setDisablePaddingsOffsetY(true);
        h5Var.addView(w70Var, c8.ha.t(-2, -2, 1, 4, -2, 4, 16));
        w70Var.setVisibility(8);
        tx0 tx0Var = new tx0(context, f6Var);
        this.a2 = tx0Var;
        h5Var.addView(tx0Var, c8.ha.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        w70 w70Var2 = new w70(context, f6Var);
        this.b2 = w70Var2;
        org.telegram.ui.ActionBar.r6.V(w70Var2, i13, f6Var);
        w70Var2.setTextSize(1, 12.0f);
        w70Var2.setGravity(17);
        w70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        int i14 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.H(w70Var2, i14, f6Var);
        w70Var2.setDisablePaddingsOffsetY(true);
        w70Var2.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        h5Var.addView(w70Var2, c8.ha.t(-2, -2, 1, 4, 2, 4, 8));
        w70Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.q2 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setOrientation(0);
        int i15 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i15, f6Var), 21, 21);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(linearLayout, a02, null, N, f6Var);
        wo woVar = new wo(24, context, f6Var);
        this.r2 = woVar;
        int i16 = org.telegram.ui.ActionBar.k6.h7;
        int i17 = org.telegram.ui.ActionBar.k6.j7;
        int i18 = org.telegram.ui.ActionBar.k6.k7;
        woVar.b(i16, i17, i18);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(woVar, c8.ha.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i19 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i19, f6Var);
        jg.g.v(textView, 1, 14.0f, null, 2131750388);
        linearLayout.addView(textView, c8.ha.t(-2, -2, 16, 9, 0, 0, 0));
        h5Var.addView(linearLayout, c8.ha.t(-2, -2, 1, 0, -4, 0, 4));
        c8.ka.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new y1(this, 19));
        linearLayout.setVisibility(8);
        h5 h5Var2 = new h5(this, context, 1);
        this.k2 = h5Var2;
        h5Var2.setOrientation(1);
        h5Var2.setPadding(org.telegram.messenger.g0.L(4.0f) + this.t0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f) + this.t0, org.telegram.messenger.g0.L(66.0f));
        m5Var.addView(h5Var2, c8.ha.e(-1, -1, 55));
        hi.i[] iVarArr = {r9, r6, r6};
        this.l2 = iVarArr;
        hi.i iVar = new hi.i(context, f6Var, false);
        iVar.a(R.drawable.menu_feature_unique, org.telegram.messenger.hd.M0(2131749864, null), org.telegram.messenger.hd.M0(2131749574, null));
        h5Var2.addView(iVarArr[0], c8.ha.o(-1, -2));
        hi.i iVar2 = new hi.i(context, f6Var, false);
        iVar2.a(R.drawable.menu_feature_tradable, org.telegram.messenger.hd.M0(2131749858, null), org.telegram.messenger.hd.M0(2131749572, null));
        h5Var2.addView(iVarArr[1], c8.ha.o(-1, -2));
        hi.i iVar3 = new hi.i(context, f6Var, false);
        iVar3.a(R.drawable.menu_wear, org.telegram.messenger.hd.M0(2131749569, null), org.telegram.messenger.hd.M0(2131749570, null));
        h5Var2.addView(iVarArr[2], c8.ha.o(-1, -2));
        View view3 = new View(context);
        this.m2 = view3;
        int i20 = org.telegram.ui.ActionBar.k6.d7;
        org.telegram.ui.ActionBar.r6.i(i20, view3, f6Var);
        h5Var2.addView(view3, c8.ha.n(1.0f / org.telegram.messenger.g0.p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n2 = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i15, f6Var), 6, 6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i15);
        linearLayout2.setBackground(a03);
        org.telegram.ui.ActionBar.r6.k(linearLayout2, a03, null, N2, f6Var);
        wo woVar2 = new wo(24, context, f6Var);
        this.o2 = woVar2;
        woVar2.b(i16, i17, i18);
        woVar2.setDrawUnchecked(true);
        woVar2.a(false, false);
        woVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(woVar2, c8.ha.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.p2 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i19, f6Var);
        jg.g.v(textView2, 1, 14.0f, null, 2131750396);
        linearLayout2.addView(textView2, c8.ha.t(-2, -2, 16, 9, 0, 0, 0));
        h5Var2.addView(linearLayout2, c8.ha.t(-2, -2, 1, 0, 0, 0, 4));
        c8.ka.b(linearLayout2, 0.025f, 1.5f);
        h5 h5Var3 = new h5(this, context, 2);
        this.t2 = h5Var3;
        h5Var3.setOrientation(1);
        h5Var3.setPadding(org.telegram.messenger.g0.L(4.0f) + this.t0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) + this.t0, org.telegram.messenger.g0.L(66.0f));
        m5Var.addView(h5Var3, c8.ha.e(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.u2 = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i19, f6Var);
        textView3.setTextSize(1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        h5Var3.addView(textView3, c8.ha.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView4, i19, f6Var);
        textView4.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.m(textView4, 17, null, 2131749833);
        h5Var3.addView(textView4, c8.ha.t(-1, -2, 7, 20, 6, 20, 24));
        hi.i iVar4 = new hi.i(context, f6Var, false);
        iVar4.a(R.drawable.menu_feature_unique, org.telegram.messenger.hd.M0(2131749839, null), org.telegram.messenger.hd.M0(2131749840, null));
        h5Var3.addView(r6[0], c8.ha.o(-1, -2));
        hi.i iVar5 = new hi.i(context, f6Var, false);
        iVar5.a(R.drawable.menu_feature_cover, org.telegram.messenger.hd.M0(2131749837, null), org.telegram.messenger.hd.M0(2131749838, null));
        h5Var3.addView(r6[1], c8.ha.o(-1, -2));
        hi.i iVar6 = new hi.i(context, f6Var, false);
        hi.i[] iVarArr2 = {iVar4, iVar5, iVar6};
        iVar6.a(R.drawable.menu_verification, org.telegram.messenger.hd.M0(2131749835, null), org.telegram.messenger.hd.M0(2131749836, null));
        h5Var3.addView(iVarArr2[2], c8.ha.o(-1, -2));
        h5 h5Var4 = new h5(this, context, 3);
        this.v2 = h5Var4;
        h5Var4.setOrientation(1);
        h5Var4.setPadding(org.telegram.messenger.g0.L(4.0f) + this.t0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f) + this.t0, org.telegram.messenger.g0.L(92.0f));
        m5Var.addView(h5Var4, c8.ha.e(-1, -1, 55));
        hi.i iVar7 = new hi.i(context, f6Var, false);
        iVar7.a(R.drawable.menu_feature_unique, org.telegram.messenger.hd.M0(2131749784, null), org.telegram.messenger.hd.M0(2131749785, null));
        h5Var4.addView(r6[0], c8.ha.o(-1, -2));
        hi.i iVar8 = new hi.i(context, f6Var, false);
        iVar8.a(R.drawable.menu_random, org.telegram.messenger.hd.M0(2131749782, null), org.telegram.messenger.hd.M0(2131749783, null));
        h5Var4.addView(r6[1], c8.ha.o(-1, -2));
        hi.i iVar9 = new hi.i(context, f6Var, false);
        hi.i[] iVarArr3 = {iVar7, iVar8, iVar9};
        iVar9.a(R.drawable.menu_feature_affect, org.telegram.messenger.hd.M0(2131749780, null), org.telegram.messenger.hd.M0(2131749781, null));
        h5Var4.addView(iVarArr3[2], c8.ha.o(-1, -2));
        h5Var.setAlpha(1.0f);
        h5Var2.setAlpha(0.0f);
        h5Var3.setAlpha(0.0f);
        h5Var4.setAlpha(0.0f);
        e7 e7Var = new e7(context, f6Var, new z1(this, 12), new y1(this, 20), new y1(this, 21), new y1(this, 22), new y1(this, 23), new y1(this, 24), new y1(this, 25), new y1(this, 26));
        this.X1 = e7Var;
        e7Var.M.c.setOnClickListener(new y1(this, 17));
        int i21 = this.t0;
        e7Var.setPadding(i21, 0, i21, 0);
        m5Var.addView(e7Var, c8.ha.e(-1, -2, 55));
        jg.b0 b0Var = this.j1;
        this.G1 = true;
        b0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d2 = frameLayout;
        org.telegram.ui.ActionBar.r6.i(i11, frameLayout, f6Var);
        View view4 = new View(context);
        this.g2 = view4;
        org.telegram.ui.ActionBar.r6.i(i20, view4, f6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        this.c2 = h;
        h.i(org.telegram.messenger.hd.M0(2131747830, null), false, true);
        h.g(null, false);
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, qs.E1, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = org.telegram.messenger.g0.L(14.0f) + this.t0;
        d.rightMargin = org.telegram.messenger.g0.L(14.0f) + this.t0;
        frameLayout.addView(h, d);
        m5Var.addView(frameLayout, c8.ha.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f2 = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i11, frameLayout2, f6Var);
        w70 w70Var3 = new w70(context, null);
        this.e2 = w70Var3;
        w70Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var3, i14, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var3, i14, f6Var);
        w70Var3.setGravity(17);
        frameLayout2.addView(w70Var3, c8.ha.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        m5Var.addView(frameLayout2, c8.ha.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.k1.setOnScrollListener(new ai.b(this, 4));
        linearLayout2.setOnClickListener(new y1(this, 18));
        jz jzVar = new jz(context);
        this.S1 = jzVar;
        m5Var.addView(jzVar, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.h2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(6.0f) + this.t0, 0, org.telegram.messenger.g0.L(6.0f) + this.t0, 0);
        m5Var.addView(frameLayout3, c8.ha.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        org.telegram.messenger.g0.E2(this.l1);
        m5Var.addView(this.l1, c8.ha.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        j5 j5Var = new j5(context);
        this.W1 = j5Var;
        m5Var.addView(j5Var, c8.ha.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        org.telegram.messenger.g0.m2(new ai.i(j5Var, 6), 12.0f, 12, arrayList);
    }

    public static String A1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? org.telegram.messenger.hd.M0(2131750191, null) : starGift.title;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb2.append(" #");
        return jg.g.m(r3.num, ',', sb2);
    }

    public static String G1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return org.telegram.messenger.hd.M0(2131749618, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return org.telegram.messenger.hd.M0(2131749619, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return org.telegram.messenger.hd.M0(2131749621, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return org.telegram.messenger.hd.M0(2131749620, null);
        }
        if (!(starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
            return "";
        }
        int i7 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        return i7 <= 0 ? "<0.1%" : hi.j.J0(i7);
    }

    public static boolean K1(int i7, long j3) {
        return j3 >= 0 ? p10.i(i7).e() == j3 : org.telegram.messenger.t3.w(5, qp.s1(i7).M0(Long.valueOf(-j3)));
    }

    public static boolean L1(int i7, long j3) {
        if (j3 >= 0) {
            return p10.i(i7).e() == j3;
        }
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
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
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(o4));
            if (a22 != null) {
                TLRPC.EmojiStatus emojiStatus = a22.emoji_status;
                return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
            }
        } else {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-o4));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = M0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void c2(org.telegram.ui.ActionBar.f2 f2Var) {
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
        d2Var.a = true;
        T.showAsSheet(f2Var, d2Var);
    }

    public static void d1(k7 k7Var) {
        boolean z9;
        TLRPC.Document document;
        boolean z10;
        t9 F;
        TLRPC.Message message;
        fi.d dVar = k7Var.c2;
        if (dVar.Q) {
            return;
        }
        TL_stars.InputSavedStarGift B1 = k7Var.B1();
        ij ijVar = k7Var.z2;
        if (ijVar == null || (message = ijVar.k) == null) {
            TL_stars.SavedStarGift savedStarGift = k7Var.x2;
            if (savedStarGift == null) {
                return;
            }
            z9 = !savedStarGift.unsaved;
            document = savedStarGift.gift.getDocument();
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                z9 = tL_messageActionStarGift.saved;
                document = tL_messageActionStarGift.gift.getDocument();
            } else {
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                z9 = tL_messageActionStarGiftUnique.saved;
                document = tL_messageActionStarGiftUnique.gift.getDocument();
            }
        }
        TLRPC.Document document2 = document;
        boolean z11 = z9;
        dVar.setLoading(true);
        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.unsave = z11;
        savestargift.stargift = B1;
        if (k7Var.x2 == null || (F = ea.y(k7Var.a, false).F(k7Var.P1, false)) == null) {
            z10 = false;
        } else {
            F.m(k7Var.x2, savestargift.unsave);
            z10 = true;
        }
        ConnectionsManager.getInstance(k7Var.a).sendRequest(savestargift, new t4(k7Var, z10, document2, z11, savestargift));
    }

    public static void e1(final k7 k7Var) {
        int i7;
        long o4;
        long j3;
        long j10;
        final long e10 = p10.i(k7Var.a).e();
        final TL_stars.InputSavedStarGift B1 = k7Var.B1();
        if (B1 == null) {
            return;
        }
        ij ijVar = k7Var.z2;
        if (ijVar != null) {
            i7 = ijVar.k.date;
            boolean Q3 = ijVar.Q3();
            TLRPC.Message message = k7Var.z2.k;
            if (message == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGift.peer;
            j10 = peer != null ? org.telegram.messenger.m5.o(peer) : Q3 ? ij.B0(message) : e10;
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            o4 = peer2 != null ? org.telegram.messenger.m5.o(peer2) : Q3 ? e10 : ij.B0(k7Var.z2.k);
            j3 = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = k7Var.x2;
            if (savedStarGift == null) {
                return;
            }
            i7 = savedStarGift.date;
            o4 = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? 2666000L : org.telegram.messenger.m5.o(savedStarGift.from_id);
            j3 = k7Var.x2.convert_stars;
            j10 = k7Var.P1;
        }
        int max = Math.max(1, (qp.s1(k7Var.a).E6 - (ConnectionsManager.getInstance(k7Var.a).getCurrentTime() - i7)) / 86400);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
        String M0 = org.telegram.messenger.hd.M0(2131750225, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(max, "Gift2ConvertText2", (t10.A(o4) || o4 == 2666000) ? org.telegram.messenger.hd.M0(2131744950, null) : org.telegram.messenger.m5.t(o4), org.telegram.messenger.hd.H(',', "Gift2ConvertStars", (int) j3)));
        final long j11 = j3;
        final long j12 = j10;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131750232, null), new org.telegram.ui.ActionBar.r1() { // from class: bi.q4
            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                k7 k7Var2 = k7.this;
                TL_stars.InputSavedStarGift inputSavedStarGift = B1;
                long j13 = j12;
                long j14 = e10;
                long j15 = j11;
                org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, org.telegram.messenger.t0.b, null);
                u1Var3.r(500L);
                TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
                convertstargift.stargift = inputSavedStarGift;
                ConnectionsManager.getInstance(k7Var2.a).sendRequest(convertstargift, new t2(k7Var2, u1Var3, j13, j14, j15));
            }
        });
        jg.g.w(null, 2131752589, alertDialog$Builder, null);
    }

    public static void f1(k7 k7Var, org.telegram.ui.ActionBar.u1 u1Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            u1Var.dismiss();
            k7Var.G2 = true;
            k7Var.j2(savedStarGift, null);
            super.show();
            return;
        }
        u1Var.dismiss();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null) {
            org.telegram.ui.Components.cc Q = org.telegram.ui.Components.hc.a0(T).Q(R.raw.error, 36, org.telegram.messenger.hd.M0(2131748551, null));
            Q.t = true;
            Q.j();
        }
    }

    public static SpannableStringBuilder f2(String str) {
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
            spannableStringBuilder.setSpan(new b5(0), indexOf, i7 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void g1(k7 k7Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        k7Var.B2 = tL_starGiftUnique;
        k7Var.k2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static SpannableStringBuilder g2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new wp(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new wp(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "👌");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString2, "👍");
        return spannableStringBuilder;
    }

    public static void h1(k7 k7Var, org.telegram.ui.ActionBar.u1 u1Var, ij ijVar) {
        u1Var.dismiss();
        k7Var.E2 = true;
        k7Var.i2(ijVar, null);
        super.show();
    }

    public static void i1(k7 k7Var, boolean z9) {
        int D1 = k7Var.D1();
        if (D1 < 0) {
            return;
        }
        int i7 = (z9 ? 1 : -1) + D1;
        int i10 = k7Var.M2;
        if (i10 >= 0 && (!z9 ? i10 < D1 : i10 > D1)) {
            i7 = i10;
        }
        w9 w9Var = k7Var.y2;
        Object obj = (w9Var == null || i7 < 0 || i7 >= w9Var.e()) ? null : k7Var.y2.get(i7);
        if (obj == null) {
            return;
        }
        if ((z9 ? k7Var.V1 : k7Var.U1) != null) {
            if (obj instanceof TL_stars.SavedStarGift) {
                if (u1((z9 ? k7Var.V1 : k7Var.U1).x2, (TL_stars.SavedStarGift) obj)) {
                    return;
                }
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                if (v1((z9 ? k7Var.V1 : k7Var.U1).B2, (TL_stars.TL_starGiftUnique) obj)) {
                    return;
                }
            }
        }
        i5 i5Var = new i5(k7Var, k7Var.getContext(), k7Var.a, k7Var.P1, k7Var.I0, k7Var.Q1.getRootView());
        if (obj instanceof TL_stars.SavedStarGift) {
            i5Var.j2((TL_stars.SavedStarGift) obj, k7Var.y2);
        } else if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            i5Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, k7Var.y2);
        }
        org.telegram.messenger.g0.E2(i5Var.b);
        if (z9) {
            k7Var.V1 = i5Var;
        } else {
            k7Var.U1 = i5Var;
        }
    }

    public static void k1(tx0 tx0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = org.telegram.messenger.hd.M0(2131750386, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = org.telegram.messenger.hd.M0(2131750379, null);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            M0 = org.telegram.messenger.hd.M0(2131750387, null);
        }
        String str = M0;
        Integer[] numArr = new Integer[1];
        tx0Var.e(str, starGiftAttribute.name, G1(starGiftAttribute.rarity, numArr), null, numArr[0]);
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
        long j3 = this.P1;
        if (j3 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = qp.s1(this.a).j1(j3);
            ij ijVar = this.z2;
            if (ijVar == null || (message3 = ijVar.k) == null) {
                TL_stars.SavedStarGift savedStarGift = this.x2;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.B2 == null || TextUtils.isEmpty(this.A2)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.A2;
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
        ij ijVar2 = this.z2;
        if (ijVar2 != null && (message2 = ijVar2.k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & TLObject.FLAG_12) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                qp s12 = qp.s1(this.a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                tL_inputSavedStarGiftChat2.peer = s12.j1(peer != null ? org.telegram.messenger.m5.o(peer) : ij.B0(this.z2.k));
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (ijVar2 != null && (message = ijVar2.k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                qp s13 = qp.s1(this.a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                tL_inputSavedStarGiftChat3.peer = s13.j1(peer2 != null ? org.telegram.messenger.m5.o(peer2) : ij.B0(this.z2.k));
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        ij ijVar3 = this.z2;
        if (ijVar3 != null) {
            TLRPC.Message message4 = ijVar3.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = ijVar3.f1();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.x2;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.B2 == null || TextUtils.isEmpty(this.A2)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.A2;
        return tL_inputSavedStarGiftSlug2;
    }

    public final String C1() {
        TL_stars.StarGift y12 = y1();
        if (!(y12 instanceof TL_stars.TL_starGiftUnique) || y12.slug == null) {
            return null;
        }
        return qp.s1(this.a).U2 + "/nft/" + y12.slug;
    }

    public final int D1() {
        int indexOf;
        w9 w9Var = this.y2;
        if (w9Var == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.x2;
        if (savedStarGift != null) {
            indexOf = w9Var.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = w9Var.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift y12 = y1();
        for (int i7 = 0; i7 < this.y2.e(); i7++) {
            Object obj = this.y2.get(i7);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.x2;
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
                if ((obj instanceof TL_stars.TL_starGiftUnique) && v1(this.B2, (TL_stars.TL_starGiftUnique) obj)) {
                    return i7;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void E0(int i7) {
        super.E0(i7);
        org.telegram.messenger.g0.u3(this, 0, false, null);
    }

    public final TL_stars.SavedStarGift E1(boolean z9) {
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        int i7 = (z9 ? 1 : -1) + D1;
        int i10 = this.M2;
        if (i10 >= 0 && (!z9 ? i10 < D1 : i10 > D1)) {
            i7 = i10;
        }
        w9 w9Var = this.y2;
        Object obj = (w9Var == null || i7 < 0 || i7 >= w9Var.e()) ? null : this.y2.get(i7);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique F1(boolean z9) {
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        int i7 = (z9 ? 1 : -1) + D1;
        int i10 = this.M2;
        if (i10 >= 0 && (!z9 ? i10 < D1 : i10 > D1)) {
            i7 = i10;
        }
        w9 w9Var = this.y2;
        Object obj = (w9Var == null || i7 < 0 || i7 >= w9Var.e()) ? null : this.y2.get(i7);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.na, org.telegram.ui.ActionBar.v2
    public final boolean G() {
        if (this.T2.c(4)) {
            boolean z9 = this.X1.M.h0;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean H() {
        if (this.T2.c(4) && this.X1.M.h0) {
            return false;
        }
        return this.c0;
    }

    public final TL_stars.TL_starGiftUnique H1() {
        TL_stars.StarGift y12 = y1();
        if (y12 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) y12;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean I(MotionEvent motionEvent) {
        if (this.T2.c(4)) {
            boolean z9 = this.X1.M.h0;
        }
        return false;
    }

    public final boolean I1(boolean z9) {
        return (E1(z9) == null && F1(z9) == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, n3 n3Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null) {
            if (n3Var != null) {
                n3Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z9) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.p3;
            withdrawstargift.stargift = B1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = B1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftwithdrawalurl, new d4(this, n3Var, twoStepVerificationActivity, z9, 0));
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        k5 k5Var = new k5(this, 0);
        this.L2 = k5Var;
        return k5Var;
    }

    @Override // org.telegram.ui.Components.na
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
        fi.d dVar = this.c2;
        if (dVar.Q || H1 == null) {
            return;
        }
        if (this.B2 != null && this.C2) {
            e10 = this.P1;
        }
        e10 = p10.i(this.a).e();
        cg.b bVar = H1.resale_ton_only ? cg.b.b : cg.b.a;
        if (this.B2 == null || !this.C2) {
            dVar.setLoading(true);
            long j3 = e10;
            ea.x(this.a, bVar).H(H1, j3, null, true, new i2(this, null, bVar, H1, j3, null, true));
        } else {
            zh.i0 i0Var = new zh.i0(getContext(), this.I0, H1, e10);
            i0Var.B1 = new n4(this, i0Var, H1, e10, bVar, 0);
            i0Var.show();
        }
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return this.N2;
    }

    public final void O1() {
        x4 x4Var = this.R2;
        if (x4Var != null && !x4Var.I) {
            x4Var.dismiss();
        }
        String C1 = C1();
        x4 x4Var2 = new x4(this, getContext(), C1, C1, this.I0);
        this.R2 = x4Var2;
        x4Var2.k2 = new cb.c(this, 11);
        x4Var2.show();
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
        this.Y1.setAlpha(this.T2.a(0));
        this.k2.setAlpha(this.T2.a(1));
        this.t2.setAlpha(this.T2.a(2));
        this.v2.setAlpha(this.T2.a(3));
        float a10 = 1.0f - this.T2.a(4);
        FrameLayout frameLayout = this.d2;
        frameLayout.setAlpha(a10);
        g6 g6Var = this.T2;
        e7 e7Var = this.X1;
        e7Var.d(g6Var);
        ImageView imageView = e7Var.Q;
        if (this.T2.c(0) && (H1 = H1()) != null && !H1.crafted && L1(this.a, org.telegram.messenger.m5.o(H1.owner_id))) {
            ij ijVar = this.z2;
            if (ijVar != null) {
                TLRPC.Message message = ijVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.x2;
                if (savedStarGift != null) {
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    }
                }
            }
            imageView.setVisibility(r4);
            m5 m5Var = this.Q1;
            float f10 = m5Var.f();
            this.W1.setAlpha(this.T2.a(0) * Utilities.l(org.telegram.messenger.g0.z1(f10 - r6.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f))));
            m5Var.g();
            m5Var.invalidate();
            frameLayout.setVisibility(this.T2.c(4) ? 8 : 0);
            u2();
        }
        int i7 = 8;
        imageView.setVisibility(i7);
        m5 m5Var2 = this.Q1;
        float f102 = m5Var2.f();
        this.W1.setAlpha(this.T2.a(0) * Utilities.l(org.telegram.messenger.g0.z1(f102 - r6.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f))));
        m5Var2.g();
        m5Var2.invalidate();
        frameLayout.setVisibility(this.T2.c(4) ? 8 : 0);
        u2();
    }

    public final void Q1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9) {
        int i7;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            org.telegram.ui.Components.hc.b0("NULL_ERROR");
            return;
        }
        int i10 = 1;
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getPassword(), new i4(this, twoStepVerificationActivity, z9, i10), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
            }
            org.telegram.ui.Components.hc.d0(tL_error);
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.t0();
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = org.telegram.messenger.hd.M0(2131749899, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(getContext());
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749903, null)));
        linearLayout.addView(textView, c8.ha.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, null, mode);
        TextView textView2 = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.V(textView2, i11, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749902, null)));
        if (org.telegram.messenger.hd.a0) {
            linearLayout2.addView(textView2, c8.ha.o(-1, -2));
            linearLayout2.addView(imageView, c8.ha.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, c8.ha.o(-2, -2));
            linearLayout2.addView(textView2, c8.ha.o(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        org.telegram.ui.ActionBar.r6.t(imageView2, i11, null, mode);
        TextView textView3 = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.V(textView3, i11, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749901, null)));
        if (org.telegram.messenger.hd.a0) {
            linearLayout3.addView(textView3, c8.ha.o(-1, -2));
            i7 = 5;
            linearLayout3.addView(imageView2, c8.ha.r(-2, -2, 5));
        } else {
            i7 = 5;
            linearLayout3.addView(imageView2, c8.ha.o(-2, -2));
            linearLayout3.addView(textView3, c8.ha.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131749898, null), new a3.l(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        } else {
            TextView textView4 = new TextView(getContext());
            org.telegram.ui.ActionBar.r6.V(textView4, i11, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.k5.m(textView4, (org.telegram.messenger.hd.a0 ? i7 : 3) | 48, null, 2131749900);
            linearLayout.addView(textView4, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747830, null), null);
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.showDialog(u1Var);
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
        org.telegram.ui.Wallet.g5 g5Var = this.Y2;
        if (g5Var == null) {
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) g5Var.c).currentAccount;
        if (!org.telegram.ui.Wallet.c8.F(i7, g5Var.a.slug)) {
            org.telegram.ui.Wallet.g5 g5Var2 = this.Y2;
            org.telegram.ui.Wallet.c8 c8Var = g5Var2.c.j0;
            if (c8Var == null || (nftitem = g5Var2.b) == null || (str5 = nftitem.address) == null || !str5.equals(c8Var.P0)) {
                Context context = getContext();
                int i11 = this.a;
                org.telegram.ui.Components.hc k10 = k();
                org.telegram.ui.ActionBar.f6 f6Var = this.I0;
                TL_stars.TL_starGiftUnique H1 = H1();
                ArrayList arrayList = new ArrayList(((org.telegram.messenger.o0) qp.s1(i11).x7.m0.b).c);
                if (arrayList.isEmpty()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                boolean z9 = 0;
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    String str6 = (String) arrayList.get(i12);
                    String str7 = "[^\\p{L}\\p{N}]";
                    String replaceAll = str6.replaceAll("[^\\p{L}\\p{N}]", "");
                    Locale locale = Locale.ROOT;
                    String lowerCase = replaceAll.toLowerCase(locale);
                    if (H1 == null || (str4 = H1.title) == null || !lowerCase.equals(str4.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(locale))) {
                        ea y10 = ea.y(i11, z9);
                        y10.U();
                        ArrayList arrayList3 = y10.H;
                        int size2 = arrayList3.size();
                        ArrayList arrayList4 = arrayList3;
                        int i14 = z9;
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
                        spannableString.setSpan(new a5(new boolean[1], i11, context, f6Var, j3, str9, str6), 0, spannableString.length(), 33);
                        arrayList2.add(spannableString);
                        z9 = 0;
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
                    spannableString2.setSpan(new a5(new boolean[1], i11, context, f6Var, j3, str92, str6), 0, spannableString2.length(), 33);
                    arrayList2.add(spannableString2);
                    z9 = 0;
                    i12 = i13;
                }
                int i16 = z9;
                if (arrayList2.size() == 1) {
                    Object[] objArr = new Object[1];
                    objArr[i16] = arrayList2.get(i16);
                    V = org.telegram.messenger.hd.V(null, null, 2131743108, objArr);
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
                    V = org.telegram.messenger.hd.V(null, null, 2131743109, spannableStringBuilder, jg.g.i(1, arrayList2));
                }
                org.telegram.ui.Components.cc M = k10.M(context.getResources().getDrawable(R.drawable.filled_card_color_28).mutate(), V);
                org.telegram.ui.Components.gb gbVar = M.e;
                if (gbVar instanceof org.telegram.ui.Components.kb) {
                    TextView textView = ((org.telegram.ui.Components.kb) gbVar).b;
                    textView.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                    textView.setEllipsize(null);
                }
                M.j();
                return;
            }
        }
        org.telegram.ui.Wallet.g5 g5Var3 = this.Y2;
        dismiss();
        Objects.requireNonNull(g5Var3);
        org.telegram.messenger.g0.i3(new a3.f(g5Var3, 21), 250L);
    }

    public final void S1() {
        if (p10.i(this.a).q() && (M1(this.a, H1()) || this.Q2)) {
            t2(false);
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
        this.u2.setText(org.telegram.messenger.hd.a0(null, null, 2131749832, jg.g.m(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131749834, null));
        if (!p10.i(this.a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.P2 == null) {
                this.P2 = new wp(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.P2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        fi.d dVar = this.c2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new y1(this, 4));
        this.X1.setWearPreview(qp.s1(this.a).e2(o4));
        s2(2, true, null);
    }

    public final void T1(boolean z9) {
        int i7;
        ij ijVar = this.z2;
        int i10 = 0;
        if (ijVar != null) {
            TLRPC.Message message = ijVar.k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i7 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift != null) {
                i7 = savedStarGift.can_craft_at;
            }
            i7 = 0;
        }
        int i11 = 1;
        if (i7 > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
            String M0 = org.telegram.messenger.hd.M0(2131749776, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.a0(null, null, 2131749777, org.telegram.messenger.hd.x(i7, true));
            jg.g.C(null, 2131747830, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(H1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getContext(), this.I0);
            String M02 = org.telegram.messenger.hd.M0(2131749791, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            u1Var2.R = M02;
            u1Var2.T = org.telegram.messenger.hd.M0(2131749792, null);
            jg.g.C(null, 2131747830, alertDialog$Builder2, null);
            return;
        }
        e7 e7Var = this.X1;
        if (z9) {
            e7Var.M.a(this.a, H1.gift_id, H1.getDocument(), H1.title);
            if (o1()) {
                d6 d6Var = e7Var.M;
                TL_stars.TL_starGiftUnique H12 = H1();
                if (H12 == null) {
                    d6Var.getClass();
                } else {
                    while (true) {
                        b6[] b6VarArr = d6Var.n;
                        if (i10 >= b6VarArr.length) {
                            break;
                        }
                        b6 b6Var = b6VarArr[i10];
                        TL_stars.StarGift starGift = b6Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            b6Var.a(H12, true);
                            break;
                        }
                        i10++;
                    }
                    d6Var.d(true);
                }
            }
        }
        d6 d6Var2 = e7Var.M;
        d6 d6Var3 = e7Var.M;
        d6Var2.setOnCraft(new h2(this, i11));
        if (this.O2 == null) {
            zh.k3 k3Var = new zh.k3(this.a, H1.gift_id);
            this.O2 = k3Var;
            k3Var.a();
        }
        d6Var3.setOnAddGift(new p4(this, H1, i11));
        d6Var3.setOnClose(new z1(this, 23));
        s2(4, true, null);
    }

    public final void U1(long j3) {
        fi.m3 m3Var = this.q3;
        if (m3Var != null) {
            m3Var.f(true);
            this.q3 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null || t10.A(j3)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
            if (j3 == p10.i(this.a).e()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putBoolean("open_gifts", true);
        T.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void V1(boolean z9, vf.b bVar, Runnable runnable) {
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        int i7 = z9 ? 3 : 2;
        ab.j jVar = new ab.j(this, twoStepVerificationActivity, z9, 1);
        twoStepVerificationActivity.Z = i7;
        twoStepVerificationActivity.b0 = jVar;
        twoStepVerificationActivity.a0 = z1();
        twoStepVerificationActivity.x0(new aa.s(this, runnable, bVar, twoStepVerificationActivity, 12));
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
    public final void W1() {
        int i7;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i10;
        org.telegram.ui.Components.ja jaVar;
        mg0 mg0Var;
        int i11;
        TLRPC.Message message2;
        TLRPC.Message message3;
        fi.m3 m3Var = this.q3;
        if (m3Var != null) {
            m3Var.f(true);
            this.q3 = null;
        }
        ij ijVar = this.z2;
        if (ijVar != null && (message3 = ijVar.k) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i7 <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                    Context context = getContext();
                    ij ijVar2 = this.z2;
                    if (ijVar2 != null && (message2 = ijVar2.k) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i11 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            q2(i11 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.x2;
                    i11 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    q2(i11 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                    return;
                }
                TL_stars.SavedStarGift savedStarGift2 = this.x2;
                if (savedStarGift2 != null) {
                    TL_stars.StarGift starGift = savedStarGift2.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        i10 = savedStarGift2.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                        Context context2 = getContext();
                        int i12 = this.a;
                        wg.f1[] f1VarArr = {new wg.f1(context2, i12, org.telegram.messenger.v1.a(i12).b(), 3, this.I0)};
                        wg.f1 f1Var = f1VarArr[0];
                        f1Var.r2 = org.telegram.messenger.hd.M0(2131749913, null);
                        jaVar = f1Var.l1;
                        if (jaVar != null) {
                            jaVar.setTitle(f1Var.O0());
                        }
                        mg0Var = f1Var.T1;
                        if (mg0Var != null) {
                            mg0Var.setText(f1Var.O0());
                        }
                        int max = currentTime <= i10 ? 0 : Math.max(1, Math.round(Math.max(0, i10 - currentTime) / 86400.0f));
                        wg.f1 f1Var2 = f1VarArr[0];
                        f1Var2.z2 = true;
                        f1Var2.A2 = max;
                        f1Var2.o1(false, true);
                        wg.f1 f1Var3 = f1VarArr[0];
                        f1Var3.t2 = new u4(this, currentTime, i10, max, f1VarArr, tL_starGiftUnique2);
                        f1Var3.show();
                        return;
                    }
                }
                ij ijVar3 = this.z2;
                if (ijVar3 == null || (message = ijVar3.k) == null) {
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
                        wg.f1[] f1VarArr2 = {new wg.f1(context22, i122, org.telegram.messenger.v1.a(i122).b(), 3, this.I0)};
                        wg.f1 f1Var4 = f1VarArr2[0];
                        f1Var4.r2 = org.telegram.messenger.hd.M0(2131749913, null);
                        jaVar = f1Var4.l1;
                        if (jaVar != null) {
                        }
                        mg0Var = f1Var4.T1;
                        if (mg0Var != null) {
                        }
                        if (currentTime2 <= i10) {
                        }
                        wg.f1 f1Var22 = f1VarArr2[0];
                        f1Var22.z2 = true;
                        f1Var22.A2 = max;
                        f1Var22.o1(false, true);
                        wg.f1 f1Var32 = f1VarArr2[0];
                        f1Var32.t2 = new u4(this, currentTime2, i10, max, f1VarArr2, tL_starGiftUnique22);
                        f1Var32.show();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift3 = this.x2;
        i7 = savedStarGift3 != null ? savedStarGift3.can_transfer_at : 0;
        if (i7 <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X1(long j3, long j10, boolean z9, c20 c20Var) {
        String str;
        TLRPC.Chat chat;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (j3 >= 0) {
            TLRPC.User a22 = qp.s1(this.a).a2(Long.valueOf(j3));
            str = t10.k(a22);
            chat = a22;
        } else {
            TLRPC.Chat M0 = qp.s1(this.a).M0(Long.valueOf(-j3));
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
        linearLayout.addView(new f6(getContext(), H1, chat), c8.ha.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, this.I0);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.g0.X2(j10 > 0 ? org.telegram.messenger.hd.K("Gift2TransferPriceText", (int) j10, ',', z1(), org.telegram.messenger.m5.t(j3)) : org.telegram.messenger.hd.a0(null, null, 2131749912, z1(), str)));
        linearLayout.addView(textView, c8.ha.t(-1, -2, 48, 24, 4, 24, 4));
        tx0 tx0Var = new tx0(getContext(), this.I0);
        k1(tx0Var, ea.l(H1.attributes, TL_stars.starGiftAttributeModel.class));
        k1(tx0Var, ea.l(H1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        k1(tx0Var, ea.l(H1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(H1.slug) && (H1.flags & 256) != 0) {
            org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
            long j11 = H1.value_amount;
            String str2 = H1.value_currency;
            int h = org.telegram.messenger.r1.i().h(H1.value_currency);
            i7.getClass();
            tx0Var.c(org.telegram.messenger.hd.M0(2131749590, null), rf.b.i("~", org.telegram.messenger.r1.g(str2, h, j11, true)), null, null);
        }
        linearLayout.addView(tx0Var, c8.ha.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(j10 > 0 ? dd.T0(org.telegram.messenger.hd.a0(null, null, 2131749919, Integer.valueOf((int) j10))) : org.telegram.messenger.hd.M0(2131749920, null), new a1.c(c20Var, 12));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.X0 = z9;
        u1Var.show();
    }

    public final void Y1(long j3, c20 c20Var) {
        TLRPC.Message message;
        long j10;
        TL_stars.SavedStarGift savedStarGift = this.x2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            ij ijVar = this.z2;
            if (ijVar == null || (message = ijVar.k) == null) {
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
        X1(j3, j10, true, c20Var);
    }

    @Override // org.telegram.ui.Components.na
    public final boolean Z0() {
        return false;
    }

    public final void Z1() {
        TL_stars.InputSavedStarGift B1;
        long j3;
        long j10;
        long j11;
        boolean z9;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        fi.m3 m3Var = this.q3;
        if (m3Var != null) {
            m3Var.f(true);
            this.q3 = null;
        }
        if (this.U2 == null && (B1 = B1()) != null) {
            ij ijVar = this.z2;
            long j12 = this.P1;
            if (ijVar != null) {
                TLRPC.MessageAction messageAction = ijVar.k.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                j10 = tL_messageActionStarGift.gift.id;
                j11 = tL_messageActionStarGift.upgrade_stars;
                z9 = tL_messageActionStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                z10 = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
                j3 = 0;
                z11 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                z12 = tL_messageActionStarGift.prepaid_upgrade ? org.telegram.messenger.m5.o(tL_messageActionStarGift.from_id) != this.z2.Z0() : tL_messageActionStarGift.upgrade_separate;
            } else {
                j3 = 0;
                TL_stars.SavedStarGift savedStarGift = this.x2;
                if (savedStarGift == null) {
                    return;
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                j10 = starGift.id;
                j11 = savedStarGift.upgrade_stars;
                z9 = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                z10 = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
                z11 = j12 < 0;
                TL_stars.SavedStarGift savedStarGift2 = this.x2;
                str = savedStarGift2.prepaid_upgrade_hash;
                z12 = savedStarGift2.upgrade_separate;
            }
            TextView textView = this.p2;
            if (z9) {
                textView.setText(org.telegram.messenger.hd.M0(z11 ? 2131750397 : 2131750398, null));
            } else if (z10) {
                textView.setText(org.telegram.messenger.hd.M0(2131750395, null));
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131750396, null));
            }
            boolean z13 = (z9 || j11 <= j3 || z12) ? false : true;
            wo woVar = this.o2;
            woVar.a(z13, false);
            ArrayList arrayList = this.g3;
            if (arrayList != null && (j11 > j3 || this.k3 != null)) {
                a2();
                return;
            }
            if (arrayList == null) {
                ea.y(this.a, false).K(j10, new y3(this, 2));
            }
            if (j11 > j3 || this.k3 != null) {
                return;
            }
            this.j3 = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = woVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = qp.s1(this.a).j1(j12);
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            JSONObject u10 = hi.a3.u(this.I0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new s4(this, 0));
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
    public final void a2() {
        long j3;
        boolean z9;
        boolean z10;
        char c10;
        int i7;
        int i10;
        String M0;
        String M02;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        ij ijVar = this.z2;
        if (ijVar != null) {
            TLRPC.MessageAction messageAction = ijVar.k.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j3 = tL_messageActionStarGift.upgrade_stars;
            if (j3 <= 0) {
            }
            z9 = false;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift == null) {
                return;
            }
            j3 = savedStarGift.upgrade_stars;
            if (j3 <= 0) {
            }
            z9 = false;
        }
        if (this.g3 != null) {
            if (j3 > 0 || this.k3 != null) {
                long j10 = 0;
                if (this.k3 != null) {
                    for (int i11 = 0; i11 < this.k3.invoice.prices.size(); i11++) {
                        j10 += this.k3.invoice.prices.get(i11).amount;
                    }
                }
                s6 s6Var = this.H2;
                e7 e7Var = this.X1;
                if (s6Var == null) {
                    this.H2 = new s6(e7Var);
                }
                s6 s6Var2 = this.H2;
                ArrayList arrayList = this.g3;
                e7 e7Var2 = s6Var2.a;
                ArrayList arrayList2 = s6Var2.g;
                ArrayList arrayList3 = s6Var2.f;
                ArrayList arrayList4 = s6Var2.e;
                int size = arrayList4.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList4.get(i12);
                    i12++;
                    ((q6) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList m10 = ea.m(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = m10.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = m10.get(i13);
                    i13++;
                    q6 q6Var = new q6(e7Var2.c, (TL_stars.starGiftAttributeModel) obj2);
                    if (e7Var2.isAttachedToWindow() && q6Var.c) {
                        q6Var.d.P();
                    }
                    arrayList4.add(q6Var);
                }
                ArrayList m11 = ea.m(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = m11.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = m11.get(i14);
                    i14++;
                    arrayList3.add(new p6((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList m12 = ea.m(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = m12.size();
                int i15 = 0;
                while (i15 < size4) {
                    Object obj4 = m12.get(i15);
                    i15++;
                    arrayList2.add(new r6((TL_stars.starGiftAttributePattern) obj4));
                }
                e7Var.setPreviewingAttributes(this.g3);
                long j11 = this.P1;
                if (z9) {
                    z10 = true;
                    e7Var.i(1, org.telegram.messenger.hd.M0(2131750061, null), org.telegram.messenger.hd.a0(null, null, 2131750062, org.telegram.messenger.m5.s(this.a, j11)), null);
                } else {
                    z10 = true;
                    e7Var.i(1, org.telegram.messenger.hd.M0(2131749850, null), org.telegram.messenger.hd.M0(2131749851, null), null);
                }
                fi.d dVar = this.c2;
                dVar.setFilled(z10);
                dVar.g(null, z10);
                if (j10 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                    if (this.i3 != null) {
                        for (int i16 = 0; i16 < this.i3.size(); i16++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) this.i3.get(i16);
                            if (starGiftUpgradePrice.date >= currentTime) {
                                break;
                            }
                        }
                    }
                    starGiftUpgradePrice = null;
                    ArrayList arrayList5 = this.h3;
                    FrameLayout frameLayout = this.f2;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.e2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2("**" + org.telegram.messenger.hd.M0(2131749869, null) + "**", new z1(this, 3)), false, org.telegram.messenger.g0.L(0.6666667f), org.telegram.messenger.g0.L(0.66f)));
                    }
                    u2();
                    wp[] wpVarArr = this.l3;
                    if (z9) {
                        dVar.i(dd.U0(org.telegram.messenger.hd.a0(null, null, 2131750066, Long.valueOf(j10)), 1.13f, wpVarArr), true, true);
                    } else {
                        dVar.i(dd.U0(org.telegram.messenger.hd.a0(null, null, 2131749876, Long.valueOf(j10)), 1.13f, wpVarArr), true, true);
                    }
                } else {
                    dVar.i(org.telegram.messenger.hd.M0(2131751817, null), true, true);
                }
                dVar.setOnClickListener(new y1(this, 6));
                View view = this.m2;
                LinearLayout linearLayout = this.n2;
                if (z9) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    c10 = 0;
                } else {
                    c10 = 0;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                }
                hi.i[] iVarArr = this.l2;
                if (z9) {
                    hi.i iVar = iVarArr[c10];
                    String M03 = org.telegram.messenger.hd.M0(2131749864, null);
                    if (z9) {
                        char c11 = c10;
                        i10 = 1;
                        i7 = 2;
                        Object[] objArr = new Object[1];
                        objArr[c11] = org.telegram.messenger.m5.s(this.a, j11);
                        M0 = org.telegram.messenger.hd.a0(null, null, 2131750065, objArr);
                    } else {
                        i10 = 1;
                        i7 = 2;
                        M0 = org.telegram.messenger.hd.M0(2131749866, null);
                    }
                    iVar.a(R.drawable.menu_feature_unique, M03, M0);
                    hi.i iVar2 = iVarArr[i10];
                    String M04 = org.telegram.messenger.hd.M0(2131749861, null);
                    if (z9) {
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = org.telegram.messenger.m5.s(this.a, j11);
                        M02 = org.telegram.messenger.hd.a0(null, null, 2131750064, objArr2);
                    } else {
                        M02 = org.telegram.messenger.hd.M0(2131749863, null);
                    }
                    iVar2.a(R.drawable.menu_feature_transfer, M04, M02);
                    iVarArr[i7].a(R.drawable.menu_feature_tradable, org.telegram.messenger.hd.M0(2131749858, null), z9 ? org.telegram.messenger.hd.a0(null, null, 2131750063, org.telegram.messenger.m5.s(this.a, j11)) : org.telegram.messenger.hd.M0(2131749860, null));
                } else {
                    i7 = 2;
                    iVarArr[c10].a(R.drawable.menu_feature_unique, org.telegram.messenger.hd.M0(2131749864, null), org.telegram.messenger.hd.M0(2131749574, null));
                    iVarArr[1].a(R.drawable.menu_feature_tradable, org.telegram.messenger.hd.M0(2131749858, null), org.telegram.messenger.hd.M0(2131749572, null));
                    iVarArr[2].a(R.drawable.menu_wear, org.telegram.messenger.hd.M0(2131749569, null), org.telegram.messenger.hd.M0(2131749570, null));
                }
                org.telegram.messenger.g0.h3(new a2(this, j10, i7));
            }
        }
    }

    public final void b2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        if (this.X2 == null || H1 == null || TextUtils.isEmpty(H1.slug)) {
            return;
        }
        Context context = getContext();
        int i7 = this.a;
        int i10 = 1;
        wg.f1[] f1VarArr = {new wg.f1(context, i7, org.telegram.messenger.v1.a(i7).b(), 3, this.I0)};
        wg.f1 f1Var = f1VarArr[0];
        f1Var.r2 = org.telegram.messenger.hd.M0(2131749913, null);
        org.telegram.ui.Components.ja jaVar = f1Var.l1;
        if (jaVar != null) {
            jaVar.setTitle(f1Var.O0());
        }
        mg0 mg0Var = f1Var.T1;
        if (mg0Var != null) {
            mg0Var.setText(f1Var.O0());
        }
        wg.f1 f1Var2 = f1VarArr[0];
        f1Var2.y2 = true;
        f1Var2.o1(false, true);
        wg.f1 f1Var3 = f1VarArr[0];
        f1Var3.t2 = new ai.f1(i10, this, f1VarArr);
        f1Var3.show();
    }

    public final SpannableStringBuilder d2(TLRPC.Peer peer) {
        if (peer != null) {
            String r10 = org.telegram.messenger.m5.r(qp.s1(this.a).e2(org.telegram.messenger.m5.o(peer)));
            if (!TextUtils.isEmpty(r10)) {
                return org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131750042, rf.b.i("@", r10)), new b4(this, r10, 8));
            }
        }
        return null;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.G3) {
            if (this.y2 == ((v9) objArr[1])) {
                d6 d6Var = this.X1.M;
                if (d6Var == null || !d6Var.h0) {
                    v2();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        if (this.T2.c(4) && this.X1.M.h0) {
            return;
        }
        zh.k3 k3Var = this.O2;
        if (k3Var != null) {
            k3Var.b();
            this.O2 = null;
        }
        s6 s6Var = this.H2;
        if (s6Var != null) {
            s6Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return d2(starGift.released_by);
    }

    public final void h2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, w9 w9Var) {
        s6 s6Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.A2 = str;
        this.B2 = tL_starGiftUnique;
        this.y2 = w9Var;
        this.C2 = (tL_starGiftUnique.resell_amount == null || K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.I2 && (s6Var = this.H2) != null && s6Var.o && (tL_starGiftUnique2 = s6Var.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            s6Var.a();
            this.H2 = null;
            e7 e7Var = this.X1;
            e7Var.b.setAlpha(1.0f);
            e7Var.c.setAlpha(0.0f);
        }
        this.W1.b(this.a, this.x2);
        k2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z9 = tL_starGiftUnique.host_id != null;
        TL_wallet.walletTransaction wallettransaction = this.a3;
        w70 w70Var = this.Z1;
        if (wallettransaction != null || !z9 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            w70Var.setVisibility(8);
        } else {
            w70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131750180, null), new b4(this, str3, 3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            w70Var.setVisibility(0);
            org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.q5, this.I0);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.a3;
        w70 w70Var2 = this.b2;
        if (wallettransaction2 != null || z9 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            w70Var2.setVisibility(8);
        } else {
            w70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131750180, null), new b4(this, str3, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            w70Var2.setVisibility(0);
        }
        w2();
        if (this.C2) {
            l2(tL_starGiftUnique);
            this.c2.setOnClickListener(new y1(this, 12));
        }
        if (this.W2) {
            s2(0, false, null);
            this.j1.n0(1);
            this.W2 = false;
        }
        v2();
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
        r7 = org.telegram.messenger.hd.a0(null, null, 2131750164, r34);
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
    
        r7 = org.telegram.messenger.hd.a0(null, null, 2131750142, r34);
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
    /* JADX WARN: Removed duplicated region for block: B:188:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x043d  */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30, types: [org.telegram.ui.Components.jc[], org.telegram.ui.Components.sx0[], org.telegram.ui.Components.wp[]] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i2(ij ijVar, w9 w9Var) {
        long j3;
        TLRPC.Peer peer;
        boolean z9;
        boolean z10;
        TL_stars.StarGift starGift;
        TLRPC.Peer peer2;
        long j10;
        long j11;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i7;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.Peer peer3;
        boolean z14;
        String str;
        boolean z15;
        boolean z16;
        String M0;
        fi.d dVar;
        boolean z17;
        String str2;
        String str3;
        char c10;
        CharSequence charSequence;
        int i10;
        CharSequence concat;
        int i11;
        tx0 tx0Var;
        fi.d dVar2;
        boolean z18;
        String str4;
        int i12;
        boolean z19;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        boolean z20;
        boolean z21;
        int i13;
        CharSequence charSequence2;
        String M02;
        ?? r14;
        String str5;
        String M03;
        CharSequence X2;
        CharSequence charSequence3;
        s6 s6Var;
        String M04;
        boolean z22;
        TLObject e22;
        boolean z23;
        s6 s6Var2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.InputSavedStarGift B1;
        if (ijVar == null || ijVar.k == null) {
            return;
        }
        this.w2 = false;
        this.x2 = null;
        this.z2 = ijVar;
        this.y2 = w9Var;
        this.W1.set(ijVar);
        long e10 = p10.i(this.a).e();
        boolean z24 = ij.B0(ijVar.k) == e10;
        TLRPC.MessageAction messageAction = ijVar.k.action;
        boolean z25 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        int i14 = 3;
        e7 e7Var = this.X1;
        fi.d dVar3 = this.c2;
        if (z25 || (((z22 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
            if (!this.I2 && (s6Var = this.H2) != null && s6Var.o && s6Var.l != null) {
                s6Var.a();
                this.H2 = null;
                e7Var.b.setVisibility(0);
                e7Var.c.setVisibility(4);
            }
            boolean Q3 = z24 ? false : ijVar.Q3();
            TLRPC.Message message = ijVar.k;
            int i15 = message.date;
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                boolean z26 = tL_messageActionStarGift.converted;
                boolean z27 = tL_messageActionStarGift.saved;
                boolean z28 = tL_messageActionStarGift.refunded;
                boolean z29 = tL_messageActionStarGift.name_hidden;
                TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                boolean z30 = tL_messageActionStarGift.can_upgrade;
                j3 = e10;
                long j12 = tL_messageActionStarGift.convert_stars;
                j11 = tL_messageActionStarGift.upgrade_stars;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageActionStarGift.message;
                TLRPC.Peer peer4 = tL_messageActionStarGift.from_id;
                TLRPC.Peer peer5 = tL_messageActionStarGift.peer;
                z14 = tL_messageActionStarGift.prepaid_upgrade;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                TLRPC.Peer peer6 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
                peer2 = peer4;
                peer = peer5;
                z9 = z27;
                i7 = tL_messageActionStarGift.gift_num;
                tL_textWithEntities = tL_textWithEntities2;
                peer3 = peer6;
                z12 = z26;
                z13 = z29;
                z10 = z28;
                starGift = starGift3;
                z11 = z30;
                j10 = j12;
            } else {
                j3 = e10;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                boolean z31 = tL_messageActionStarGiftUnique.saved;
                boolean z32 = tL_messageActionStarGiftUnique.refunded;
                TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique.gift;
                TLRPC.Peer peer7 = tL_messageActionStarGiftUnique.from_id;
                peer = tL_messageActionStarGiftUnique.peer;
                z9 = z31;
                z10 = z32;
                starGift = starGift4;
                peer2 = peer7;
                j10 = 0;
                j11 = 0;
                tL_textWithEntities = null;
                i7 = 0;
                z11 = false;
                z12 = false;
                z13 = false;
                peer3 = null;
                z14 = false;
                str = null;
            }
            long j13 = this.P1;
            String t6 = org.telegram.messenger.m5.t(j13);
            z15 = z24;
            boolean z33 = Q3;
            boolean t10 = t10.t(qp.s1(this.a).a2(Long.valueOf(j13)));
            boolean z34 = peer != null && org.telegram.messenger.m5.o(peer) < 0;
            boolean M1 = M1(this.a, H1());
            C1();
            e7Var.f(starGift, false, false, M1);
            e7Var.setShowOptions(p1());
            CharSequence charSequence4 = "";
            int i16 = 2;
            if (z15) {
                if (i7 == 0 || starGift.title == null) {
                    z16 = z10;
                    str5 = null;
                    M03 = org.telegram.messenger.hd.M0(2131749939, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    z16 = z10;
                    sb2.append(starGift.title);
                    sb2.append(" #");
                    M03 = jg.g.m(i7, ',', sb2);
                    str5 = null;
                }
                this.N2 = M03;
                if (z16) {
                    X2 = str5;
                } else {
                    if (z11) {
                        charSequence3 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749996, str5));
                    } else if (j10 > 0) {
                        charSequence3 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', z12 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j10));
                    } else {
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131750003, null));
                    }
                    X2 = charSequence3;
                }
                e7Var.i(0, M03, X2, e2(starGift));
            } else {
                z16 = z10;
                if (z34 && !this.w2) {
                    e7Var.i(0, org.telegram.messenger.hd.M0(2131749941, null), null, e2(starGift));
                } else if ((z33 || z11) && j11 > 0) {
                    String M05 = org.telegram.messenger.hd.M0(z33 ? 2131749936 : 2131749940, null);
                    this.N2 = M05;
                    e7Var.i(0, M05, z16 ? null : !z33 ? org.telegram.messenger.hd.M0(2131750147, null) : org.telegram.messenger.hd.a0(null, null, 2131750148, t6), e2(starGift));
                } else {
                    if (i7 == 0 || starGift.title == null) {
                        M0 = org.telegram.messenger.hd.M0(z33 ? 2131749936 : 2131749940, null);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift.title);
                        sb3.append(" #");
                        M0 = jg.g.m(i7, ',', sb3);
                    }
                    this.N2 = M0;
                    if (z16) {
                        dVar = dVar3;
                        z17 = z11;
                        concat = null;
                        i10 = 0;
                    } else {
                        if (!t10 && B1() != null) {
                            ij ijVar2 = this.z2;
                            if (ijVar2 != null) {
                                TLRPC.MessageAction messageAction3 = ijVar2.k.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z35 = tL_messageActionStarGift2.peer != null;
                                    ijVar2.Q3();
                                    ij.B0(this.z2.k);
                                    p10.i(this.a).e();
                                    boolean z36 = z35;
                                    int currentTime = qp.s1(this.a).E6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.z2.k.date);
                                    if (z36) {
                                        TLRPC.Peer peer8 = tL_messageActionStarGift2.peer;
                                        if (peer8 != null) {
                                            i11 = currentTime;
                                            dVar = dVar3;
                                            z17 = z11;
                                        }
                                    } else {
                                        i11 = currentTime;
                                        dVar = dVar3;
                                        z17 = z11;
                                    }
                                    if (!tL_messageActionStarGift2.converted) {
                                        if (tL_messageActionStarGift2.convert_stars > 0) {
                                        }
                                    }
                                    if (z33) {
                                        str2 = null;
                                        str3 = org.telegram.messenger.hd.a0(null, null, (!z17 || j11 <= 0) ? 2131750165 : 2131750164, t6);
                                    } else {
                                        str2 = null;
                                        str3 = org.telegram.messenger.hd.M0(!z9 ? z34 ? 2131750172 : 2131750177 : z34 ? 2131750171 : 2131750176, null);
                                    }
                                }
                            } else {
                                dVar = dVar3;
                                z17 = z11;
                                TL_stars.SavedStarGift savedStarGift = this.x2;
                                if (savedStarGift != null) {
                                    int currentTime2 = qp.s1(this.a).E6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                                    if (L1(this.a, j13)) {
                                        int i17 = this.x2.flags;
                                        if (((j13 < 0 ? 2048 : 8) & i17) != 0) {
                                            if ((i17 & 16) != 0) {
                                                if ((i17 & 2) != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z33) {
                                }
                            }
                            SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(str3);
                            if (t10 && n1()) {
                                c10 = 1;
                                charSequence = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131750109, str2).replace(' ', (char) 160), new z1(this, 10)), true);
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
                        z17 = z11;
                        if (z33) {
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
                    e7Var.i(i10, M0, concat, e2(starGift));
                    tx0Var = this.a2;
                    tx0Var.removeAllViews();
                    long o4 = peer2 == null ? org.telegram.messenger.m5.o(peer2) : z33 ? j3 : j13;
                    if (peer == null) {
                        j13 = org.telegram.messenger.m5.o(peer);
                    } else if (!z33) {
                        j13 = j3;
                    }
                    TLRPC.User a22 = qp.s1(this.a).a2(Long.valueOf(o4));
                    int i18 = 7;
                    if (peer3 == null) {
                        long o10 = org.telegram.messenger.m5.o(peer3);
                        this.a2.m(org.telegram.messenger.hd.M0(2131749935, null), this.a, o10, new a2(this, o10, i18), null, z34 ? null : new a2(this, o10, 8));
                    } else {
                        if (o4 != j3 || z14 || z34) {
                            this.a2.m(org.telegram.messenger.hd.M0(2131750192, null), this.a, o4, new a2(this, o4, 9), (o4 == j3 || o4 == 2666000 || t10.x(a22) || t10 || z34) ? null : org.telegram.messenger.hd.M0(2131750283, null), z34 ? null : new a2(this, o4, 10));
                        }
                        if (j13 != j3 || z34) {
                            this.a2.m(org.telegram.messenger.hd.M0(2131749935, null), this.a, j13, new a2(this, j13, 11), null, z34 ? null : new a2(this, j13, 12));
                        }
                    }
                    tx0Var.g(i15, org.telegram.messenger.hd.M0(2131744961, null));
                    if (starGift.stars > 0) {
                        String M06 = org.telegram.messenger.hd.M0(2131749846, null);
                        String m10 = jg.g.m(starGift.stars + j11, ',', new StringBuilder("⭐️ "));
                        if (!n1() || z16) {
                            r14 = 0;
                        } else {
                            r14 = 0;
                            charSequence4 = org.telegram.ui.Components.kc.b(org.telegram.messenger.hd.H(',', "Gift2ButtonSell", (int) j10), new z1(this, 7), this.I0, null);
                        }
                        tx0Var.c(M06, dd.a1(false, TextUtils.concat(m10, " ", charSequence4), 0.8f, r14), r14, r14);
                    }
                    if (starGift.limited && !z16) {
                        dd.H0(tx0Var, this.a, starGift, this.I0);
                    }
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z16) {
                        tx0Var.b(tL_textWithEntities.text, tL_textWithEntities.entities);
                    }
                    if (z33 && z17 && !z16) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                        if (this.V2 == null) {
                            dVar2 = dVar;
                            i13 = 0;
                            this.V2 = new wp(0, new f7(dVar2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.I0)));
                        } else {
                            dVar2 = dVar;
                            i13 = 0;
                        }
                        spannableStringBuilder.setSpan(this.V2, i13, 1, 33);
                        if (j11 > 0) {
                            charSequence2 = null;
                            M02 = org.telegram.messenger.hd.M0(2131749874, null);
                        } else {
                            charSequence2 = null;
                            M02 = org.telegram.messenger.hd.M0(2131749873, null);
                        }
                        spannableStringBuilder.append((CharSequence) M02);
                        dVar2.setFilled(true);
                        dVar2.i(spannableStringBuilder, !this.W2, true);
                        dVar2.g(charSequence2, !this.W2);
                        dVar2.setOnClickListener(new y1(this, 16));
                    } else {
                        dVar2 = dVar;
                        if (this.j2 || this.R1 == null || this.y2 == null || D1() < 0 || this.y2.b(D1()) < 0) {
                            if ((starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                                z18 = true;
                                str4 = null;
                                dVar2.setFilled(true);
                                dVar2.i(org.telegram.messenger.hd.M0(2131747830, null), !this.W2, true);
                                dVar2.g(null, !this.W2);
                                dVar2.setOnClickListener(new y1(this, 14));
                            } else {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                                if (this.V2 == null) {
                                    i12 = 0;
                                    this.V2 = new wp(0, new f7(dVar2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.I0)));
                                } else {
                                    i12 = 0;
                                }
                                z18 = true;
                                spannableStringBuilder2.setSpan(this.V2, i12, 1, 33);
                                str4 = null;
                                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131750190, null));
                                dVar2.setFilled(true);
                                dVar2.i(spannableStringBuilder2, !this.W2, true);
                                dVar2.g(null, !this.W2);
                                dVar2.setOnClickListener(new y1(this, 13));
                            }
                            z20 = z9;
                            z21 = z33;
                        } else {
                            dVar2.setFilled(false);
                            int b10 = this.y2.b(D1());
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) org.telegram.messenger.hd.M0(2131749854, null));
                            Object obj = this.y2.get(b10);
                            if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                                z19 = true;
                            } else {
                                spannableStringBuilder3.append((CharSequence) " e");
                                z19 = true;
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.r5(document, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                            }
                            dVar2.i(spannableStringBuilder3, this.W2 ^ z19, z19);
                            dVar2.g(null, this.W2 ^ z19);
                            dVar2.setOnClickListener(new u2(this, b10, i16));
                        }
                    }
                    z18 = true;
                    str4 = null;
                    z20 = z9;
                    z21 = z33;
                }
            }
            dVar = dVar3;
            z17 = z11;
            tx0Var = this.a2;
            tx0Var.removeAllViews();
            if (peer2 == null) {
            }
            if (peer == null) {
            }
            TLRPC.User a222 = qp.s1(this.a).a2(Long.valueOf(o4));
            int i182 = 7;
            if (peer3 == null) {
            }
            tx0Var.g(i15, org.telegram.messenger.hd.M0(2131744961, null));
            if (starGift.stars > 0) {
            }
            if (starGift.limited) {
                dd.H0(tx0Var, this.a, starGift, this.I0);
            }
            if (tL_textWithEntities != null) {
                tx0Var.b(tL_textWithEntities.text, tL_textWithEntities.entities);
            }
            if (z33) {
            }
            dVar2 = dVar;
            if (this.j2) {
            }
            if (starGift instanceof TL_stars.TL_starGift) {
            }
            z18 = true;
            str4 = null;
            dVar2.setFilled(true);
            dVar2.i(org.telegram.messenger.hd.M0(2131747830, null), !this.W2, true);
            dVar2.g(null, !this.W2);
            dVar2.setOnClickListener(new y1(this, 14));
            z20 = z9;
            z21 = z33;
        } else {
            if (!z22) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique2.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            if (tL_messageActionStarGiftUnique2.name_hidden) {
                e22 = null;
            } else {
                qp s12 = qp.s1(this.a);
                TLRPC.Peer peer9 = tL_messageActionStarGiftUnique2.from_id;
                e22 = s12.e2(peer9 != null ? org.telegram.messenger.m5.o(peer9) : ijVar.Z0());
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique2.gift;
            boolean z37 = tL_messageActionStarGiftUnique2.refunded;
            k2(tL_starGiftUnique2, z37, e22, tL_messageActionStarGiftUnique2.message);
            z20 = tL_messageActionStarGiftUnique2.saved;
            starGift = tL_messageActionStarGiftUnique2.gift;
            boolean z38 = (tL_messageActionStarGiftUnique2.upgrade ^ true) == ijVar.Q3();
            if (ij.B0(ijVar.k) == e10) {
                z38 = false;
            }
            if (!this.F2 && !this.G2 && this.z2 != null && (B1 = B1()) != null) {
                this.F2 = true;
                ea.y(this.a, false).M(B1, new y3(this, i14));
            }
            if (this.I2 || (s6Var2 = this.H2) == null || !s6Var2.o || (tL_starGiftUnique = s6Var2.l) == null) {
                z23 = z38;
            } else {
                z23 = z38;
                if (starGift == null || tL_starGiftUnique.id != starGift.id) {
                    s6Var2.a();
                    this.H2 = null;
                    e7Var.b.setAlpha(1.0f);
                    e7Var.c.setAlpha(0.0f);
                }
            }
            z15 = z24;
            z16 = z37;
            dVar2 = dVar3;
            z21 = z23;
            tL_textWithEntities = null;
            z18 = true;
            str4 = null;
            z12 = false;
            z13 = false;
            peer3 = null;
        }
        if (this.d3) {
            dVar2.setFilled(z18);
            dVar2.i(org.telegram.messenger.hd.M0(2131749793, str4), false, z18);
            dVar2.setOnClickListener(new y1(this, 15));
        }
        String str6 = starGift == null ? null : starGift.owner_address;
        String str7 = starGift == null ? null : starGift.gift_address;
        boolean z39 = (starGift == null || starGift.host_id == null) ? false : true;
        w70 w70Var = this.Z1;
        if (z16) {
            w70Var.setVisibility(0);
            w70Var.setText(org.telegram.messenger.hd.M0(2131750044, null));
            org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.q7, this.I0);
        } else if (z39 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
            w70Var.setVisibility(0);
            w70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131750180, null), new b4(this, str7, 5)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.q5, this.I0);
        } else if (TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && z13 && !z15) {
            w70Var.setVisibility(0);
            if (z21) {
                M04 = org.telegram.messenger.hd.a0(null, null, (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? 2131750087 : 2131750086, org.telegram.messenger.m5.t(ij.B0(ijVar.k)));
            } else {
                M04 = org.telegram.messenger.hd.M0((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? 2131750179 : 2131750178, null);
            }
            w70Var.setText(M04);
            org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.q5, this.I0);
        } else {
            w70Var.setVisibility(8);
        }
        int i19 = 6;
        w70 w70Var2 = this.b2;
        if (!z39 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
            w70Var2.setVisibility(0);
            w70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131750180, null), new b4(this, str7, i19)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
        } else if (z12 || z16 || starGift == null || !K1(this.a, x1()) || peer3 != null) {
            w70Var2.setVisibility(8);
        } else {
            w70Var2.setVisibility(0);
            if (x1() >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (!z20) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new wp(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(z20 ? 2131750054 : 2131750057, null), new z1(this, i19)));
                w70Var2.setText(org.telegram.messenger.g0.I2(spannableStringBuilder4, true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            } else {
                w70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(z20 ? 2131750252 : 2131750253, null), new z1(this, i19)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            }
        }
        if (this.W2) {
            s2(0, false, null);
            this.j1.n0(1);
            this.W2 = false;
        }
        this.l1.setTitle(this.N2);
        v2();
    }

    public final void j1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        char c10;
        s6 s6Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        k7 k7Var;
        ai.d0 d0Var;
        int i7 = 0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = org.telegram.messenger.hd.M0(2131750386, null);
            c10 = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = org.telegram.messenger.hd.M0(2131750379, null);
            c10 = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            M0 = org.telegram.messenger.hd.M0(2131750387, null);
            c10 = 0;
        }
        if (!this.I2 && ((s6Var = this.H2) == null || !s6Var.o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.jc[] jcVarArr = new org.telegram.ui.Components.jc[1];
            Integer[] numArr = new Integer[1];
            String G1 = G1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                k7Var = this;
                d0Var = new ai.d0(this, zArr, starGiftAttribute2, jcVarArr, 5);
            } else {
                starGiftAttribute2 = starGiftAttribute;
                k7Var = this;
                d0Var = null;
            }
            jcVarArr[0] = (org.telegram.ui.Components.jc) ((qx0) k7Var.a2.e(M0, starGiftAttribute2.name, G1, d0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        x6 x6Var = new x6(getContext(), this.I0, new h2(this, i7));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        tx0 tx0Var = this.a2;
        tableRow.addView(new sx0(tx0Var, M0), layoutParams);
        tableRow.addView(new qx0(tx0Var, x6Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        tx0Var.addView(tableRow);
        s6 s6Var2 = this.H2;
        if (s6Var2 != null) {
            if (c10 == 0) {
                s6Var2.d = x6Var;
            }
            if (c10 == 1) {
                s6Var2.c = x6Var;
            }
            if (c10 == 2) {
                s6Var2.b = x6Var;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0312  */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27, types: [org.telegram.ui.Components.jc[], org.telegram.ui.Components.sx0[], org.telegram.ui.Components.wp[]] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j2(TL_stars.SavedStarGift savedStarGift, w9 w9Var) {
        long j3;
        int i7;
        String M0;
        int i10;
        CharSequence charSequence;
        String str;
        String a02;
        int i11;
        boolean z9;
        CharSequence charSequence2;
        TL_stars.StarGift starGift;
        ?? r13;
        TL_stars.StarGift starGift2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z10;
        fi.d dVar;
        int i12;
        ?? r12;
        TL_stars.StarGift starGift3;
        TLRPC.Document document;
        String str2;
        String str3;
        boolean z11;
        int i13;
        CharSequence charSequence3;
        String M02;
        String str4;
        String M03;
        CharSequence X2;
        CharSequence charSequence4;
        TL_stars.StarGift starGift4;
        ?? r14;
        s6 s6Var;
        if (savedStarGift == null) {
            return;
        }
        int i14 = this.a;
        long j10 = this.P1;
        this.w2 = K1(i14, j10);
        this.x2 = savedStarGift;
        this.y2 = w9Var;
        this.z2 = null;
        boolean z12 = this.I2;
        e7 e7Var = this.X1;
        if (!z12 && (s6Var = this.H2) != null && s6Var.o && s6Var.l != null) {
            s6Var.a();
            this.H2 = null;
            e7Var.b.setVisibility(0);
            e7Var.c.setVisibility(4);
        }
        this.W1.b(this.a, savedStarGift);
        String t6 = org.telegram.messenger.m5.t(j10);
        long o4 = org.telegram.messenger.m5.o(savedStarGift.from_id);
        boolean t10 = t10.t(qp.s1(this.a).a2(Long.valueOf(o4)));
        int currentTime = qp.s1(this.a).E6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
        long e10 = p10.i(this.a).e();
        if ((savedStarGift.flags & 2) == 0) {
            o4 = 2666000;
        }
        int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        boolean z13 = i15 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
        boolean z14 = savedStarGift.refunded;
        TL_stars.StarGift starGift5 = savedStarGift.gift;
        if (starGift5 instanceof TL_stars.TL_starGiftUnique) {
            str2 = starGift5.owner_address;
            str3 = starGift5.gift_address;
            z11 = starGift5.host_id != null;
            k2((TL_stars.TL_starGiftUnique) starGift5, z14, !savedStarGift.name_hidden ? qp.s1(this.a).e2(org.telegram.messenger.m5.o(savedStarGift.from_id)) : null, savedStarGift.message);
            i7 = i15;
        } else {
            boolean z15 = this.w2 && e10 == o4 && i15 >= 0;
            boolean M1 = M1(this.a, H1());
            C1();
            e7Var.f(starGift5, false, false, M1);
            e7Var.setShowOptions(p1());
            tx0 tx0Var = this.a2;
            tx0Var.removeAllViews();
            CharSequence charSequence5 = "";
            if (z15) {
                if (savedStarGift.gift_num == 0 || (starGift4 = savedStarGift.gift) == null || starGift4.title == null) {
                    j3 = e10;
                    str4 = null;
                    M03 = org.telegram.messenger.hd.M0(2131749939, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j3 = e10;
                    M03 = jg.g.m(savedStarGift.gift_num, ',', sb2);
                    str4 = null;
                }
                this.N2 = M03;
                if (z14) {
                    X2 = str4;
                } else {
                    if (savedStarGift.can_upgrade) {
                        charSequence4 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749996, str4));
                    } else {
                        long j11 = savedStarGift.convert_stars;
                        if (j11 > 0) {
                            charSequence4 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.H(',', "Gift2SelfInfoConvert", (int) j11));
                        } else {
                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131750003, null));
                        }
                    }
                    X2 = charSequence4;
                }
                e7Var.i(0, M03, X2, e2(savedStarGift.gift));
            } else {
                j3 = e10;
                if (!z13 || this.w2) {
                    boolean z16 = this.w2;
                    if (!z16 || savedStarGift.can_upgrade) {
                        i7 = i15;
                        if (savedStarGift.upgrade_stars > 0) {
                            String M04 = org.telegram.messenger.hd.M0(z16 ? 2131749940 : 2131749941, null);
                            this.N2 = M04;
                            e7Var.i(0, M04, z14 ? null : this.w2 ? org.telegram.messenger.hd.M0(2131750147, null) : null, e2(savedStarGift.gift));
                            if (j3 == o4 || z13) {
                                this.a2.m(org.telegram.messenger.hd.M0(2131750192, null), this.a, o4, new a2(this, o4, 4), (o4 != j3 || o4 == 2666000 || t10 || t10.x(qp.s1(this.a).a2(Long.valueOf(o4))) || z13) ? null : org.telegram.messenger.hd.M0(2131750283, null), new a2(this, o4, 5));
                            }
                            tx0Var.c(org.telegram.messenger.hd.M0(2131744961, null), org.telegram.messenger.hd.a0(null, null, 2131742784, org.telegram.messenger.hd.E0().s0().format(new Date(savedStarGift.date * 1000)), org.telegram.messenger.hd.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
                            String M05 = org.telegram.messenger.hd.M0(2131749846, null);
                            String m10 = jg.g.m(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
                            if (n1() || z14) {
                                r13 = 0;
                            } else {
                                r13 = 0;
                                charSequence5 = org.telegram.ui.Components.kc.b(org.telegram.messenger.hd.H(',', "Gift2ButtonSell", (int) savedStarGift.convert_stars), new z1(this, 7), this.I0, null);
                            }
                            tx0Var.c(M05, dd.a1(false, TextUtils.concat(m10, " ", charSequence5), 0.8f, r13), r13, r13);
                            starGift2 = savedStarGift.gift;
                            if (starGift2.limited && !z14) {
                                dd.H0(tx0Var, this.a, starGift2, this.I0);
                            }
                            tL_textWithEntities = savedStarGift.message;
                            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z14) {
                                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                                tx0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                            }
                            z10 = this.w2;
                            dVar = this.c2;
                            if (!z10 && savedStarGift.can_upgrade) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                                if (this.V2 == null) {
                                    i13 = 0;
                                    this.V2 = new wp(0, new f7(dVar, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.I0)));
                                } else {
                                    i13 = 0;
                                }
                                spannableStringBuilder.setSpan(this.V2, i13, 1, 33);
                                if (savedStarGift.upgrade_stars > 0) {
                                    charSequence3 = null;
                                    M02 = org.telegram.messenger.hd.M0(2131749874, null);
                                } else {
                                    charSequence3 = null;
                                    M02 = org.telegram.messenger.hd.M0(2131749873, null);
                                }
                                spannableStringBuilder.append((CharSequence) M02);
                                dVar.setFilled(true);
                                dVar.i(spannableStringBuilder, !this.W2, true);
                                dVar.g(charSequence3, !this.W2);
                                dVar.setOnClickListener(new y1(this, 8));
                            } else if (!this.j2 && z10 && this.R1 != null && this.y2 != null && D1() >= 0 && this.y2.b(D1()) >= 0) {
                                dVar.setFilled(false);
                                int b10 = this.y2.b(D1());
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.M0(2131749854, null));
                                Object obj = this.y2.get(b10);
                                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                                    r12 = 1;
                                } else {
                                    spannableStringBuilder2.append((CharSequence) " e");
                                    r12 = 1;
                                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.r5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                                }
                                dVar.i(spannableStringBuilder2, (this.W2 ? 1 : 0) ^ r12, r12);
                                dVar.g(null, (this.W2 ? 1 : 0) ^ r12);
                                dVar.setOnClickListener(new u2(this, b10, r12));
                            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                                dVar.setFilled(true);
                                dVar.i(org.telegram.messenger.hd.M0(2131747830, null), !this.W2, true);
                                dVar.g(null, !this.W2);
                                dVar.setOnClickListener(new y1(this, 11));
                            } else {
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                                if (this.V2 == null) {
                                    i12 = 0;
                                    this.V2 = new wp(0, new f7(dVar, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.I0)));
                                } else {
                                    i12 = 0;
                                }
                                spannableStringBuilder3.setSpan(this.V2, i12, 1, 33);
                                spannableStringBuilder3.append((CharSequence) org.telegram.messenger.hd.M0(2131750190, null));
                                dVar.setFilled(true);
                                dVar.i(spannableStringBuilder3, !this.W2, true);
                                dVar.g(null, !this.W2);
                                dVar.setOnClickListener(new y1(this, 10));
                            }
                            str2 = null;
                            str3 = null;
                            z11 = false;
                        }
                    } else {
                        i7 = i15;
                    }
                    if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                        M0 = org.telegram.messenger.hd.M0(z16 ? 2131749940 : 2131749941, null);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(savedStarGift.gift.title);
                        sb3.append(" #");
                        M0 = jg.g.m(savedStarGift.gift_num, ',', sb3);
                    }
                    this.N2 = M0;
                    if (z14 || !this.w2) {
                        i10 = 0;
                        charSequence = null;
                    } else {
                        if (!t10 && n1()) {
                            if (this.w2) {
                                a02 = org.telegram.messenger.hd.H(',', currentTime <= 0 ? z13 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z13 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                a02 = org.telegram.messenger.hd.K("Gift2Info2Out", (int) savedStarGift.convert_stars, ',', t6);
                            }
                            str = null;
                        } else if (this.w2) {
                            if (savedStarGift.unsaved) {
                                i11 = z13 ? 2131750172 : 2131750177;
                                str = null;
                            } else {
                                str = null;
                                i11 = z13 ? 2131750171 : 2131750176;
                            }
                            a02 = org.telegram.messenger.hd.M0(i11, str);
                        } else {
                            str = null;
                            a02 = org.telegram.messenger.hd.a0(null, null, (!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? 2131750165 : 2131750164, t6);
                        }
                        SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(a02);
                        if (t10 || !n1()) {
                            z9 = true;
                            charSequence2 = "";
                        } else {
                            z9 = true;
                            charSequence2 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131750109, str).replace(' ', (char) 160), new z1(this, 5)), true);
                        }
                        boolean z17 = z9;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        i10 = 0;
                        charSequenceArr[0] = X22;
                        charSequenceArr[z17 ? 1 : 0] = " ";
                        charSequenceArr[2] = charSequence2;
                        charSequence = TextUtils.concat(charSequenceArr);
                    }
                    e7Var.i(i10, M0, charSequence, e2(savedStarGift.gift));
                    if (j3 == o4) {
                    }
                    this.a2.m(org.telegram.messenger.hd.M0(2131750192, null), this.a, o4, new a2(this, o4, 4), (o4 != j3 || o4 == 2666000 || t10 || t10.x(qp.s1(this.a).a2(Long.valueOf(o4))) || z13) ? null : org.telegram.messenger.hd.M0(2131750283, null), new a2(this, o4, 5));
                    tx0Var.c(org.telegram.messenger.hd.M0(2131744961, null), org.telegram.messenger.hd.a0(null, null, 2131742784, org.telegram.messenger.hd.E0().s0().format(new Date(savedStarGift.date * 1000)), org.telegram.messenger.hd.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
                    String M052 = org.telegram.messenger.hd.M0(2131749846, null);
                    String m102 = jg.g.m(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
                    if (n1()) {
                    }
                    r13 = 0;
                    tx0Var.c(M052, dd.a1(false, TextUtils.concat(m102, " ", charSequence5), 0.8f, r13), r13, r13);
                    starGift2 = savedStarGift.gift;
                    if (starGift2.limited) {
                        dd.H0(tx0Var, this.a, starGift2, this.I0);
                    }
                    tL_textWithEntities = savedStarGift.message;
                    if (tL_textWithEntities != null) {
                        TLRPC.TL_textWithEntities tL_textWithEntities32 = savedStarGift.message;
                        tx0Var.b(tL_textWithEntities32.text, tL_textWithEntities32.entities);
                    }
                    z10 = this.w2;
                    dVar = this.c2;
                    if (!z10) {
                    }
                    if (!this.j2) {
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
                    }
                    dVar.setFilled(true);
                    dVar.i(org.telegram.messenger.hd.M0(2131747830, null), !this.W2, true);
                    dVar.g(null, !this.W2);
                    dVar.setOnClickListener(new y1(this, 11));
                    str2 = null;
                    str3 = null;
                    z11 = false;
                } else {
                    String M06 = org.telegram.messenger.hd.M0(2131749941, null);
                    this.N2 = M06;
                    e7Var.i(0, M06, null, d2(savedStarGift.gift.released_by));
                }
            }
            i7 = i15;
            if (j3 == o4) {
            }
            this.a2.m(org.telegram.messenger.hd.M0(2131750192, null), this.a, o4, new a2(this, o4, 4), (o4 != j3 || o4 == 2666000 || t10 || t10.x(qp.s1(this.a).a2(Long.valueOf(o4))) || z13) ? null : org.telegram.messenger.hd.M0(2131750283, null), new a2(this, o4, 5));
            tx0Var.c(org.telegram.messenger.hd.M0(2131744961, null), org.telegram.messenger.hd.a0(null, null, 2131742784, org.telegram.messenger.hd.E0().s0().format(new Date(savedStarGift.date * 1000)), org.telegram.messenger.hd.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
            String M0522 = org.telegram.messenger.hd.M0(2131749846, null);
            String m1022 = jg.g.m(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (n1()) {
            }
            r13 = 0;
            tx0Var.c(M0522, dd.a1(false, TextUtils.concat(m1022, " ", charSequence5), 0.8f, r13), r13, r13);
            starGift2 = savedStarGift.gift;
            if (starGift2.limited) {
            }
            tL_textWithEntities = savedStarGift.message;
            if (tL_textWithEntities != null) {
            }
            z10 = this.w2;
            dVar = this.c2;
            if (!z10) {
            }
            if (!this.j2) {
            }
            if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
            }
            dVar.setFilled(true);
            dVar.i(org.telegram.messenger.hd.M0(2131747830, null), !this.W2, true);
            dVar.g(null, !this.W2);
            dVar.setOnClickListener(new y1(this, 11));
            str2 = null;
            str3 = null;
            z11 = false;
        }
        boolean z18 = savedStarGift.refunded;
        w70 w70Var = this.Z1;
        if (z18) {
            w70Var.setVisibility(0);
            w70Var.setText(org.telegram.messenger.hd.M0(2131750044, null));
            org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.q7, this.I0);
        } else if (z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            w70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131750180, null), new b4(this, str3, 1)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            w70Var.setVisibility(0);
            org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.q5, this.I0);
        } else if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && this.w2 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            w70Var.setVisibility(0);
            w70Var.setText(org.telegram.messenger.hd.M0((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? 2131750179 : 2131750178, null));
            org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.q5, this.I0);
        } else {
            w70Var.setVisibility(8);
        }
        w70 w70Var2 = this.b2;
        if (!z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            w70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131750180, null), new b4(this, str3, 2)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            r14 = 0;
            w70Var2.setVisibility(0);
        } else if (this.w2 && K1(this.a, j10)) {
            int i16 = 6;
            if (i7 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new wp(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(!savedStarGift.unsaved ? 2131750054 : 2131750057, null), new z1(this, i16)));
                w70Var2.setText(org.telegram.messenger.g0.I2(spannableStringBuilder4, true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            } else {
                w70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(!savedStarGift.unsaved ? 2131750252 : 2131750253, null), new z1(this, i16)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            }
            r14 = 0;
            w70Var2.setVisibility(0);
        } else {
            r14 = 0;
            w70Var2.setVisibility(8);
        }
        if (this.W2) {
            s2(r14, r14, null);
            this.j1.n0(1);
            this.W2 = r14;
        }
        this.l1.setTitle(this.N2);
        v2();
    }

    @Override // org.telegram.ui.ActionBar.v2, org.telegram.ui.ActionBar.b2
    public org.telegram.ui.Components.hc k() {
        return new org.telegram.ui.Components.hc(this.h2, this.I0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x05cd, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r8).drop_original_details_stars >= r38) goto L193;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0342  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.view.View, int[], java.lang.CharSequence, java.lang.String, org.telegram.ui.ActionBar.n6, org.telegram.ui.Components.jc[], org.telegram.ui.Components.sx0[]] */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z9, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
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
        s6 s6Var;
        boolean z10;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        s6 s6Var2;
        ArrayList arrayList;
        boolean z11;
        Object obj;
        Object obj2;
        CharSequence V;
        CharSequence V2;
        TLRPC.Message message;
        ij ijVar;
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
        s6 s6Var3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        long o4 = org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id);
        long o10 = org.telegram.messenger.m5.o(tL_starGiftUnique.host_id);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.N2 = jg.g.m(tL_starGiftUnique.num, ',', sb2);
        boolean z12 = this.I2;
        e7 e7Var = this.X1;
        if (!z12 && (s6Var3 = this.H2) != null && s6Var3.o && (tL_starGiftUnique2 = s6Var3.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            s6Var3.a();
            this.H2 = null;
            e7Var.b.setAlpha(1.0f);
            e7Var.c.setAlpha(0.0f);
        } else if (z12 && this.H2 == null) {
            this.H2 = new s6(e7Var);
        }
        int i15 = 0;
        int i16 = 1;
        boolean z13 = this.a3 == null;
        boolean z14 = z13 && L1(this.a, o4);
        boolean z15 = z13 && L1(this.a, o10);
        boolean M1 = M1(this.a, H1());
        C1();
        e7Var.f(tL_starGiftUnique, z14, z15, M1);
        e7Var.setShowOptions(false);
        TextPaint textPaint = e7Var.G;
        final int i17 = 4;
        int i18 = 2;
        int i19 = 3;
        if (this.X2 != null) {
            if (this.Z2 != null) {
                e7Var.j(new y1(this, 29), this.Y2 == null ? null : new View.OnClickListener(this) { // from class: bi.v4
                    public final /* synthetic */ k7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                this.b.onBackPressed();
                                break;
                            case 1:
                                this.b.N1();
                                break;
                            case 2:
                                this.b.onBackPressed();
                                break;
                            case 3:
                                s6 s6Var4 = this.b.H2;
                                s6Var4.h.e();
                                s6Var4.i.e();
                                s6Var4.j.e();
                                s6Var4.k.e();
                                break;
                            default:
                                this.b.R1();
                                break;
                        }
                    }
                }, new y1(this, i15), true);
                org.telegram.ui.Wallet.h5 h5Var = this.Z2;
                org.telegram.ui.Wallet.c8 c8Var = h5Var.b.j0;
                e7Var.setWalletCard((c8Var == null || (nftitem2 = h5Var.a) == null || (str2 = nftitem2.address) == null || (b8Var = (org.telegram.ui.Wallet.b8) c8Var.f.get(str2)) == null || !b8Var.b()) ? false : true);
            } else {
                e7Var.j(new y1(this, i16), this.Y2 == null ? null : new y1(this, i18), new y1(this, i19), tL_starGiftUnique.host_id != null);
            }
            org.telegram.ui.Wallet.g5 g5Var = this.Y2;
            if (g5Var != null) {
                i14 = ((org.telegram.ui.ActionBar.f2) g5Var.c).currentAccount;
                boolean F = org.telegram.ui.Wallet.c8.F(i14, g5Var.a.slug);
                org.telegram.ui.Wallet.g5 g5Var2 = this.Y2;
                org.telegram.ui.Wallet.c8 c8Var2 = g5Var2.c.j0;
                boolean z16 = (c8Var2 == null || (nftitem = g5Var2.b) == null || (str = nftitem.address) == null || !str.equals(c8Var2.P0)) ? false : true;
                x5 x5Var = e7Var.J;
                x5Var.e(R.drawable.filled_card_color, org.telegram.messenger.hd.M0(z16 ? 2131743104 : 2131743110, null), false);
                x5Var.setAlpha((F || z16) ? 1.0f : 0.5f);
            }
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ("#" + org.telegram.messenger.hd.E(tL_starGiftUnique.num, ',')));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new org.telegram.messenger.t(qs.U2, 2, false), length, spannableStringBuilder.length(), 33);
        TL_wallet.walletTransaction wallettransaction = this.a3;
        if (wallettransaction != null) {
            charSequence = org.telegram.messenger.hd.M0(wallettransaction.incoming ? 2131743076 : 2131743075, null);
            i7 = 1;
        } else {
            if (tLObject != null) {
                i7 = 1;
                charSequence2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131743883, org.telegram.messenger.m5.u(tLObject)));
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
            ij.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
            spannable = ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        }
        e7Var.h(0, spannableStringBuilder, charSequence, d2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        ?? r11 = 0;
        this.b3 = null;
        tx0 tx0Var = this.a2;
        tx0Var.removeAllViews();
        if (z9) {
            j3 = 0;
            i10 = 0;
        } else {
            if (tL_starGiftUnique.host_id != null) {
                if (TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    i13 = 0;
                } else {
                    i13 = 0;
                    tx0Var.p(org.telegram.messenger.hd.M0(2131750181, null), tL_starGiftUnique.owner_address, new z1(this, i13));
                }
                if (o10 != 0) {
                    int i20 = i13;
                    i11 = i7;
                    this.b3 = ((qx0) this.a2.o(org.telegram.messenger.hd.M0(2131750182, null), this.a, o10, new a2(this, o10, i13)).getChildAt(i11)).getChildAt(i20);
                    i12 = i20;
                    obj3 = null;
                } else {
                    i10 = i13;
                    j3 = 0;
                }
            } else {
                i11 = i7;
                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    tx0Var.p(org.telegram.messenger.hd.M0(2131750085, null), tL_starGiftUnique.owner_address, new z1(this, i11));
                } else if (o4 == 0 && tL_starGiftUnique.owner_name != null) {
                    tx0Var.c(org.telegram.messenger.hd.M0(2131750085, null), tL_starGiftUnique.owner_name, null, null);
                } else if (o4 != 0) {
                    r11 = 0;
                    j3 = 0;
                    r13 = 0;
                    int i21 = i11;
                    this.b3 = ((qx0) this.a2.o(org.telegram.messenger.hd.M0(2131750085, null), this.a, o4, new a2(this, o4, i11)).getChildAt(i21 == true ? 1 : 0)).getChildAt(0);
                    r15 = i21;
                    j1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                    j1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                    j1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    if (!z9) {
                        if (this.z2 == null) {
                            tx0Var.c(org.telegram.messenger.hd.M0(2131750053, r11), org.telegram.messenger.hd.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + org.telegram.messenger.hd.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r11, r11);
                        } else if (this.E2) {
                            tx0Var.c(org.telegram.messenger.hd.M0(2131750053, r11), org.telegram.messenger.hd.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + org.telegram.messenger.hd.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r11, r11);
                        } else {
                            TextView textView = (TextView) ((qx0) tx0Var.c(org.telegram.messenger.hd.M0(2131750053, r11), "", r11, r11).getChildAt(r15)).getChildAt(r13);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                            b80 b80Var = new b80(textView, org.telegram.messenger.g0.L(90.0f), r13, this.I0);
                            int i22 = org.telegram.ui.ActionBar.k6.G6;
                            b80Var.a(org.telegram.ui.ActionBar.k6.r1(0.21f, org.telegram.ui.ActionBar.k6.w0(i22, this.I0)), org.telegram.ui.ActionBar.k6.r1(0.08f, org.telegram.ui.ActionBar.k6.w0(i22, this.I0)));
                            spannableStringBuilder3.setSpan(b80Var, r13, r15, 33);
                            textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                            if (!this.D2 && !this.E2 && (ijVar = this.z2) != null) {
                                this.D2 = r15;
                                int f12 = ijVar.f1();
                                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                tL_messages_getMessages.id.add(Integer.valueOf(f12));
                                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new j2(this, f12, r13));
                            }
                        }
                        if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                            org.telegram.messenger.r1 i23 = org.telegram.messenger.r1.i();
                            long j10 = tL_starGiftUnique.value_amount;
                            String str3 = tL_starGiftUnique.value_currency;
                            int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                            i23.getClass();
                            this.a2.e(org.telegram.messenger.hd.M0(2131749590, r11), rf.b.i("~", org.telegram.messenger.r1.g(str3, h, j10, r15)), org.telegram.messenger.hd.M0(2131749589, r11), new aa.s((Object) this, (Object) tL_starGiftUnique, org.telegram.messenger.r1.i().f(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 15), null);
                        }
                    }
                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                    if (stargiftattributeoriginaldetails != null) {
                        if ((stargiftattributeoriginaldetails.flags & r15) != 0) {
                            long o11 = org.telegram.messenger.m5.o(stargiftattributeoriginaldetails.sender_id);
                            SpannableString spannableString = new SpannableString(org.telegram.messenger.m5.l(p10.s0, o11));
                            spannableString.setSpan(new c5(this, o11), r13, spannableString.length(), 33);
                            obj = spannableString;
                        } else {
                            obj = r11;
                        }
                        Object obj4 = obj;
                        f10 = 14.0f;
                        long o12 = org.telegram.messenger.m5.o(stargiftattributeoriginaldetails.recipient_id);
                        SpannableString spannableString2 = new SpannableString(org.telegram.messenger.m5.l(p10.s0, o12));
                        spannableString2.setSpan(new d5(this, o12), r13, spannableString2.length(), 33);
                        if (stargiftattributeoriginaldetails.message != null) {
                            TextPaint textPaint2 = new TextPaint((int) r15);
                            textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                            ij.b(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false, 0);
                            obj2 = ij.C5(org.telegram.messenger.i6.m(spannableStringBuilder4, textPaint2.getFontMetricsInt(), r13, r11, r13), stargiftattributeoriginaldetails.message.entities, textPaint2.getFontMetricsInt(), r13);
                        } else {
                            obj2 = r11;
                        }
                        int i24 = r13;
                        Object replaceAll = org.telegram.messenger.hd.E0().C0().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                        if (stargiftattributeoriginaldetails.sender_id != stargiftattributeoriginaldetails.recipient_id) {
                            if (obj4 != null) {
                                if (obj2 == null) {
                                    Object[] objArr = new Object[3];
                                    objArr[i24] = obj4;
                                    objArr[r15] = spannableString2;
                                    objArr[2] = replaceAll;
                                    V2 = org.telegram.messenger.hd.V(r11, r11, 2131750385, objArr);
                                } else {
                                    Object[] objArr2 = new Object[4];
                                    objArr2[i24] = obj4;
                                    objArr2[r15] = spannableString2;
                                    objArr2[2] = replaceAll;
                                    objArr2[3] = obj2;
                                    V2 = org.telegram.messenger.hd.V(r11, r11, 2131750384, objArr2);
                                }
                            } else if (obj2 == null) {
                                Object[] objArr3 = new Object[2];
                                objArr3[i24] = spannableString2;
                                objArr3[r15] = replaceAll;
                                V2 = org.telegram.messenger.hd.V(r11, r11, 2131750383, objArr3);
                            } else {
                                Object[] objArr4 = new Object[3];
                                objArr4[i24] = spannableString2;
                                objArr4[r15] = replaceAll;
                                objArr4[2] = obj2;
                                V = org.telegram.messenger.hd.V(r11, r11, 2131750382, objArr4);
                                if (K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                                }
                                rx0 a10 = tx0Var.a(V);
                                a10.setFilled(r15);
                                xh.l lVar = (xh.l) a10.getChildAt(0);
                                lVar.setTextSize(r15, 12.0f);
                                lVar.setGravity(17);
                            }
                            V = V2;
                            if (K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                            }
                            rx0 a102 = tx0Var.a(V);
                            a102.setFilled(r15);
                            xh.l lVar2 = (xh.l) a102.getChildAt(0);
                            lVar2.setTextSize(r15, 12.0f);
                            lVar2.setGravity(17);
                        } else if (obj2 == null) {
                            Object[] objArr5 = new Object[2];
                            objArr5[i24] = obj4;
                            objArr5[r15] = replaceAll;
                            V = org.telegram.messenger.hd.V(r11, r11, 2131750381, objArr5);
                            if (K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                                TL_stars.SavedStarGift savedStarGift = this.x2;
                                if (savedStarGift == null || savedStarGift.drop_original_details_stars < j3) {
                                    ij ijVar2 = this.z2;
                                    if (ijVar2 != null && (message = ijVar2.k) != null) {
                                        TLRPC.MessageAction messageAction = message.action;
                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                        }
                                    }
                                }
                                LinearLayout linearLayout = new LinearLayout(getContext());
                                linearLayout.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
                                linearLayout.setOrientation(i24);
                                xh.l lVar3 = new xh.l(getContext());
                                org.telegram.ui.ActionBar.r6.V(lVar3, org.telegram.ui.ActionBar.k6.G6, this.I0);
                                org.telegram.ui.ActionBar.r6.H(lVar3, org.telegram.ui.ActionBar.k6.Uc, this.I0);
                                lVar3.setTextSize(r15, 12.0f);
                                lVar3.setGravity(3);
                                lVar3.setText(V);
                                linearLayout.addView(lVar3, c8.ha.p(-1, -2, 1.0f, 19));
                                ImageView imageView = new ImageView(getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                int i25 = org.telegram.ui.ActionBar.k6.Ci;
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i25, this.I0)), 6, 6);
                                org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i25);
                                org.telegram.ui.ActionBar.f6 f6Var = this.I0;
                                imageView.setBackground(a02);
                                org.telegram.ui.ActionBar.r6.k(imageView, a02, r11, L, f6Var);
                                imageView.setImageResource(R.drawable.menu_delete_old);
                                org.telegram.ui.ActionBar.r6.t(imageView, i25, this.I0, PorterDuff.Mode.SRC_IN);
                                c8.ka.a(imageView);
                                imageView.setOnClickListener(new r(7, this, V));
                                linearLayout.addView(imageView, c8.ha.q(32, 32, 0.0f, 21, 8, 0, 0, 0));
                                TableRow tableRow = new TableRow(getContext());
                                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                                layoutParams.span = 2;
                                tableRow.addView(new rx0(tx0Var, linearLayout, true), layoutParams);
                                tx0Var.addView(tableRow);
                            }
                            rx0 a1022 = tx0Var.a(V);
                            a1022.setFilled(r15);
                            xh.l lVar22 = (xh.l) a1022.getChildAt(0);
                            lVar22.setTextSize(r15, 12.0f);
                            lVar22.setGravity(17);
                        } else {
                            Object[] objArr6 = new Object[3];
                            objArr6[i24] = obj4;
                            objArr6[r15] = replaceAll;
                            objArr6[2] = obj2;
                            V2 = org.telegram.messenger.hd.V(r11, r11, 2131750380, objArr6);
                            V = V2;
                            if (K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                            }
                            rx0 a10222 = tx0Var.a(V);
                            a10222.setFilled(r15);
                            xh.l lVar222 = (xh.l) a10222.getChildAt(0);
                            lVar222.setTextSize(r15, 12.0f);
                            lVar222.setGravity(17);
                        }
                    } else {
                        f10 = 14.0f;
                    }
                    if (this.a3 != null) {
                        this.b3 = r11;
                        tx0Var.removeAllViews();
                        long e10 = p10.i(this.a).e();
                        this.a2.n(org.telegram.messenger.hd.M0(this.a3.incoming ? 2131743016 : 2131743041, r11), this.a, e10, new a2(this, e10, 3));
                        long abs = Math.abs(this.a3.fee);
                        if (abs > j3) {
                            TextView textView2 = new TextView(getContext());
                            textView2.setGravity(16);
                            textView2.setIncludeFontPadding(false);
                            textView2.setTextSize(1, f10);
                            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.G6, this.I0);
                            textView2.setText(org.telegram.ui.Wallet.y5.w0(this.a, abs, this.I0));
                            tx0Var.f(textView2, org.telegram.messenger.hd.M0(2131743122, r11));
                        }
                        if (this.a3.date != 0) {
                            tx0Var.c(org.telegram.messenger.hd.M0(2131743145, r11), org.telegram.messenger.hd.Q(this.a3.date), r11, r11);
                        }
                    }
                    s6Var = this.H2;
                    fi.d dVar = this.c2;
                    if (s6Var != null || !s6Var.o) {
                        if (this.a3 != null) {
                            dVar.setFilled(true);
                            dVar.i(org.telegram.messenger.hd.M0(2131747830, r11), !this.W2, true);
                            dVar.g(r11, !this.W2);
                            final int i26 = 0;
                            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: bi.v4
                                public final /* synthetic */ k7 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i26) {
                                        case 0:
                                            this.b.onBackPressed();
                                            break;
                                        case 1:
                                            this.b.N1();
                                            break;
                                        case 2:
                                            this.b.onBackPressed();
                                            break;
                                        case 3:
                                            s6 s6Var4 = this.b.H2;
                                            s6Var4.h.e();
                                            s6Var4.i.e();
                                            s6Var4.j.e();
                                            s6Var4.k.e();
                                            break;
                                        default:
                                            this.b.R1();
                                            break;
                                    }
                                }
                            });
                        } else if (!K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id)) && tL_starGiftUnique.resell_amount != null) {
                            final int i27 = 1;
                            dVar.setFilled(true);
                            l2(tL_starGiftUnique);
                            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: bi.v4
                                public final /* synthetic */ k7 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i27) {
                                        case 0:
                                            this.b.onBackPressed();
                                            break;
                                        case 1:
                                            this.b.N1();
                                            break;
                                        case 2:
                                            this.b.onBackPressed();
                                            break;
                                        case 3:
                                            s6 s6Var4 = this.b.H2;
                                            s6Var4.h.e();
                                            s6Var4.i.e();
                                            s6Var4.j.e();
                                            s6Var4.k.e();
                                            break;
                                        default:
                                            this.b.R1();
                                            break;
                                    }
                                }
                            });
                        } else if (!this.j2 || this.R1 == null || this.y2 == null || D1() < 0 || this.y2.b(D1()) < 0) {
                            dVar.setFilled(true);
                            dVar.i(org.telegram.messenger.hd.M0(2131747830, r11), !this.W2, true);
                            dVar.g(r11, !this.W2);
                            final int i28 = 2;
                            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: bi.v4
                                public final /* synthetic */ k7 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i28) {
                                        case 0:
                                            this.b.onBackPressed();
                                            break;
                                        case 1:
                                            this.b.N1();
                                            break;
                                        case 2:
                                            this.b.onBackPressed();
                                            break;
                                        case 3:
                                            s6 s6Var4 = this.b.H2;
                                            s6Var4.h.e();
                                            s6Var4.i.e();
                                            s6Var4.j.e();
                                            s6Var4.k.e();
                                            break;
                                        default:
                                            this.b.R1();
                                            break;
                                    }
                                }
                            });
                            this.l1.setTitle(this.N2);
                            s6Var2 = this.H2;
                            if (s6Var2 != null) {
                                return;
                            }
                            boolean z17 = this.I2;
                            z1 z1Var = new z1(this, 24);
                            z1 z1Var2 = new z1(this, 25);
                            ArrayList arrayList2 = s6Var2.f;
                            e7 e7Var2 = s6Var2.a;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = s6Var2.l;
                            if (tL_starGiftUnique3 != null) {
                                arrayList = arrayList2;
                                if (tL_starGiftUnique3.id == tL_starGiftUnique.id) {
                                    z11 = s6Var2.o;
                                    if (z11) {
                                        return;
                                    }
                                    e7Var.b.setAlpha(0.0f);
                                    e7Var.c.setAlpha(1.0f);
                                    dVar.i(org.telegram.messenger.hd.M0(2131749609, null), true, true);
                                    dVar.setFilled(true);
                                    final int i29 = 3;
                                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: bi.v4
                                        public final /* synthetic */ k7 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i29) {
                                                case 0:
                                                    this.b.onBackPressed();
                                                    break;
                                                case 1:
                                                    this.b.N1();
                                                    break;
                                                case 2:
                                                    this.b.onBackPressed();
                                                    break;
                                                case 3:
                                                    s6 s6Var4 = this.b.H2;
                                                    s6Var4.h.e();
                                                    s6Var4.i.e();
                                                    s6Var4.j.e();
                                                    s6Var4.k.e();
                                                    break;
                                                default:
                                                    this.b.R1();
                                                    break;
                                            }
                                        }
                                    });
                                    int length2 = ((k7) this.L2.d).K2.length - 1;
                                    pj0 pj0Var = this.k1;
                                    pj0Var.v0(length2);
                                    pj0Var.post(new z1(this, 26));
                                    return;
                                }
                            } else {
                                arrayList = arrayList2;
                            }
                            if (z17) {
                                org.telegram.ui.Components.l9 upgradeImageView = e7Var2.getUpgradeImageView();
                                v6 v6Var = e7Var2.c;
                                TL_stars.starGiftAttributeModel upgradeImageViewAttribute = e7Var2.getUpgradeImageViewAttribute();
                                TL_stars.starGiftAttributePattern upgradePatternAttribute = e7Var2.getUpgradePatternAttribute();
                                TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = e7Var2.getUpgradeBackdropAttribute();
                                TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                                s6Var2.o = true;
                                s6Var2.l = tL_starGiftUnique;
                                s6Var2.r = z1Var;
                                s6Var2.s = z1Var2;
                                s6Var2.t = (float) Math.random();
                                s6Var2.m = System.currentTimeMillis();
                                s6Var2.n = 0.0f;
                                s6Var2.p = false;
                                s6Var2.q = false;
                                s6Var2.o = true;
                                o6 o6Var = s6Var2.h;
                                if (o6Var != null) {
                                    o6Var.a();
                                }
                                q6 q6Var = new q6(v6Var, stargiftattributemodel2);
                                if (v6Var.isAttachedToWindow() && q6Var.c) {
                                    q6Var.d.P();
                                }
                                s6Var2.h = new o6(new l6(s6Var2, 0), s6Var2.e, new q6(upgradeImageView, upgradeImageViewAttribute), q6Var, 0.9f, s6Var2.t > 0.5f ? 3 : 2);
                                o6 o6Var2 = s6Var2.i;
                                if (o6Var2 != null) {
                                    o6Var2.a();
                                }
                                s6Var2.i = new o6(new l6(s6Var2, 0), s6Var2.g, new r6(upgradePatternAttribute), new r6(stargiftattributepattern), 1.0f, s6Var2.t > 0.5f ? 2 : 1);
                                o6 o6Var3 = s6Var2.j;
                                if (o6Var3 != null) {
                                    o6Var3.a();
                                }
                                s6Var2.j = new o6(new l6(s6Var2, 0), arrayList, new p6(upgradeBackdropAttribute), new p6(stargiftattributebackdrop), 0.5f, s6Var2.t > 0.5f ? 2 : 1);
                                o6 o6Var4 = s6Var2.k;
                                if (o6Var4 != null) {
                                    o6Var4.a();
                                }
                                s6Var2.k = new o6(new l6(s6Var2, 0), arrayList, new p6(upgradeBackdropAttribute), new p6(stargiftattributebackdrop), 1.25f, s6Var2.t > 0.5f ? 2 : 1);
                                s6Var2.b();
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                            }
                        } else {
                            dVar.setFilled(false);
                            int b10 = this.y2.b(D1());
                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                            spannableStringBuilder5.append((CharSequence) org.telegram.messenger.hd.M0(2131749854, r11));
                            Object obj5 = this.y2.get(b10);
                            if (!(obj5 instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj5).gift) == null || (document = starGift.getDocument()) == null) {
                                z10 = true;
                            } else {
                                spannableStringBuilder5.append((CharSequence) " e");
                                z10 = true;
                                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.r5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                            }
                            dVar.i(spannableStringBuilder5, this.W2 ^ z10, z10);
                            dVar.g(r11, this.W2 ^ z10);
                            dVar.setOnClickListener(new u2(this, b10, 3));
                        }
                    }
                    this.l1.setTitle(this.N2);
                    s6Var2 = this.H2;
                    if (s6Var2 != null) {
                    }
                }
                i12 = 0;
                obj3 = null;
            }
            j3 = 0;
            r15 = i11;
            r11 = obj3;
            r13 = i12;
            j1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            j1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            j1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            if (!z9) {
            }
            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
            if (stargiftattributeoriginaldetails != null) {
            }
            if (this.a3 != null) {
            }
            s6Var = this.H2;
            fi.d dVar2 = this.c2;
            if (s6Var != null) {
            }
            if (this.a3 != null) {
            }
            this.l1.setTitle(this.N2);
            s6Var2 = this.H2;
            if (s6Var2 != null) {
            }
        }
        r15 = i7;
        r13 = i10;
        j1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
        j1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        j1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z9) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
        }
        if (this.a3 != null) {
        }
        s6Var = this.H2;
        fi.d dVar22 = this.c2;
        if (s6Var != null) {
        }
        if (this.a3 != null) {
        }
        this.l1.setTitle(this.N2);
        s6Var2 = this.H2;
        if (s6Var2 != null) {
        }
    }

    public final void l1(LinearLayout linearLayout, int i7, int i10, int i11, String str, boolean z9) {
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i7);
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, f6Var, mode);
        linearLayout.addView(imageView, c8.ha.t(i10, i10, 16, i10 < 15 ? 1 : 0, 0, i10 < 15 ? 1 : 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i12 = org.telegram.ui.ActionBar.k6.r5;
        org.telegram.ui.ActionBar.r6.V(textView, i12, this.I0);
        textView.setText(str);
        linearLayout.addView(textView, c8.ha.t(-2, -2, 16, 4, 0, 0, 0));
        if (z9) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.msg_mini_topicarrow);
            org.telegram.ui.ActionBar.r6.t(imageView2, i12, this.I0, mode);
            linearLayout.addView(imageView2, c8.ha.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.a);
        boolean z9 = tL_starGiftUnique.resale_ton_only;
        fi.d dVar = this.c2;
        if (z9) {
            dVar.i(dd.s1(dd.V0(org.telegram.messenger.hd.a0(null, null, 2131746147, tL_starGiftUnique.getResellAmount(cg.b.b).d()), true), true), !this.W2, true);
            dVar.g(dd.T0(org.telegram.messenger.hd.H(',', "ResellGiftBuyEq", (int) resellAmount.a())), !this.W2);
        } else {
            dVar.i(dd.T0(org.telegram.messenger.hd.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.W2, true);
            dVar.g(null, !this.W2);
        }
    }

    public final void m1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            ea.y(this.a, false).P(x1());
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
            ea.y(this.a, false).P(x1());
            dismiss();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.x2;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.I2 = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.x2;
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
                j2(savedStarGift2, this.y2);
                this.g3 = null;
                this.I2 = false;
                w9 w9Var = this.y2;
                if (w9Var != null) {
                    w9Var.d();
                } else {
                    ea.y(this.a, false).P(this.P1);
                }
                org.telegram.messenger.g0.h3(runnable);
                return;
            }
        }
        if (this.y2 == null) {
            ea.y(this.a, false).P(x1());
        }
        this.I2 = true;
        this.x2 = null;
        this.w2 = false;
        ij ijVar = new ij(this.a, message, false, false);
        ijVar.M5();
        i2(ijVar, this.y2);
        this.g3 = null;
        this.I2 = false;
        org.telegram.messenger.g0.h3(runnable);
    }

    public final void m2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z9) {
        if (z9) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = p10.i(this.a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= TLObject.FLAG_12;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.X1.setWalletDisplayed(z9);
        w2();
    }

    public final boolean n1() {
        TLRPC.Peer peer;
        if (B1() == null) {
            return false;
        }
        ij ijVar = this.z2;
        if (ijVar != null) {
            TLRPC.MessageAction messageAction = ijVar.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!ijVar.Q3() || ((ij.B0(this.z2.k) > p10.i(this.a).e() ? 1 : (ij.B0(this.z2.k) == p10.i(this.a).e() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && L1(this.a, org.telegram.messenger.m5.o(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && qp.s1(this.a).E6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.z2.k.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift != null) {
                int currentTime = qp.s1(this.a).E6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                int i7 = this.a;
                long j3 = this.P1;
                if (L1(i7, j3)) {
                    int i10 = this.x2.flags;
                    if (((j3 < 0 ? 2048 : 8) & i10) != 0 && (i10 & 16) != 0 && (i10 & 2) != 0 && currentTime > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void n2() {
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
        this.u2.setText(org.telegram.messenger.hd.a0(null, null, 2131749832, jg.g.m(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131749834, null));
        if (o4 == p10.i(this.a).e() && !p10.i(this.a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.P2 == null) {
                this.P2 = new wp(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.P2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        fi.d dVar = this.c2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new y1(this, 27));
        this.X1.setWearPreview(qp.s1(this.a).e2(o4));
        s2(2, false, null);
        this.s2 = true;
    }

    public final boolean o1() {
        int i7;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null || H1.crafted || !L1(this.a, org.telegram.messenger.m5.o(H1.owner_id))) {
            return false;
        }
        ij ijVar = this.z2;
        if (ijVar == null) {
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i7 = savedStarGift.can_craft_at;
            }
        }
        TLRPC.Message message = ijVar.k;
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

    public final void o2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique H1 = H1();
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null || H1 == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = B1;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject u10 = hi.a3.u(this.I0, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new g2(this, charSequence, H1, tL_inputInvoiceStarGiftDropOriginalDetails, 1));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.a).c(this, qs.G3);
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        e7 e7Var;
        d6 d6Var;
        if (this.T2.c(4) && (e7Var = this.X1) != null && (d6Var = e7Var.M) != null) {
            if (d6Var.h0) {
                return;
            }
            if (d6Var.i0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.s2 || this.T2.c <= 0 || this.c2.Q || this.f3) {
            super.onBackPressed();
            return;
        }
        ij ijVar = this.z2;
        if (ijVar != null) {
            i2(ijVar, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift != null) {
                j2(savedStarGift, this.y2);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
                if (tL_starGiftUnique != null) {
                    h2(this.A2, tL_starGiftUnique, this.y2);
                }
            }
        }
        s2(0, true, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.a).n(this, qs.G3);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p1() {
        if (this.X2 == null && B1() != null) {
            ij ijVar = this.z2;
            if (ijVar != null) {
                TLRPC.Message message = ijVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TL_stars.StarGift starGift = tL_messageActionStarGift.gift;
                        if ((starGift instanceof TL_stars.TL_starGift) && !starGift.limited && starGift.availability_total <= 0 && !starGift.auction && !tL_messageActionStarGift.converted && !tL_messageActionStarGift.upgraded && !tL_messageActionStarGift.refunded && tL_messageActionStarGift.convert_stars > 0) {
                            boolean Q3 = ijVar.Q3();
                            boolean z9 = ij.B0(this.z2.k) == p10.i(this.a).e();
                            TLRPC.Peer peer = tL_messageActionStarGift.peer;
                            if (peer != null) {
                                return L1(this.a, org.telegram.messenger.m5.o(peer));
                            }
                            if (!Q3 || z9) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.x2;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (!(starGift2 instanceof TL_stars.TL_starGift) || starGift2.limited || starGift2.availability_total > 0 || starGift2.auction || savedStarGift.refunded || !L1(this.a, this.P1)) {
                    }
                }
            }
        }
        return false;
    }

    public final void p2(View view, CharSequence charSequence, boolean z9) {
        Layout layout;
        float primaryHorizontal;
        fi.m3 m3Var = this.q3;
        if ((m3Var != null && m3Var.V && this.r3 == view) || view == null) {
            return;
        }
        if (!z9) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof org.telegram.ui.ActionBar.k5)) {
                return;
            } else {
                layout = ((org.telegram.ui.ActionBar.k5) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            org.telegram.ui.Components.kc[] kcVarArr = (org.telegram.ui.Components.kc[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.kc.class);
            if (kcVarArr == null || kcVarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(kcVarArr[kcVarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
        } else {
            if (!(view instanceof org.telegram.ui.ActionBar.k5)) {
                return;
            }
            org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) view;
            primaryHorizontal = (k5Var.getRightDrawableWidth() / 2.0f) + k5Var.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        m5 m5Var = this.Q1;
        m5Var.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        fi.m3 m3Var2 = this.q3;
        if (m3Var2 != null) {
            m3Var2.f(true);
            this.q3 = null;
        }
        fi.m3 m3Var3 = new fi.m3(getContext(), 3);
        m3Var3.r(!z9);
        m3Var3.u(charSequence);
        m3Var3.p(0.0f, (iArr[0] + primaryHorizontal) - (org.telegram.messenger.g0.L(16.0f) + this.t0));
        m3Var3.setTranslationY(((iArr[1] - org.telegram.messenger.g0.L(100.0f)) - (view.getHeight() / 2.0f)) + org.telegram.messenger.g0.L((z9 ? 18 : 0) + 4.33f));
        m3Var3.d = 3000L;
        m3Var3.setPadding(org.telegram.messenger.g0.L(16.0f) + this.t0, 0, org.telegram.messenger.g0.L(16.0f) + this.t0, 0);
        m3Var3.q0 = new s2(m3Var3, 0);
        m3Var3.w();
        m5Var.addView(m3Var3, c8.ha.c(100.0f, -1));
        this.q3 = m3Var3;
        this.r3 = view;
    }

    public final void q1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        String M0 = org.telegram.messenger.hd.M0(2131750265, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131750266, null);
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747804, null), new o4(this, H1, 1));
        }
        jg.g.w(null, 2131752589, alertDialog$Builder, null);
    }

    public final void q2(int i7, Context context, boolean z9) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(64.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i10, this.I0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout, L2, N, null, f6Var);
        f10.addView(frameLayout, c8.ha.t(64, 64, 49, 0, 6, 0, 0));
        ch0 ch0Var = new ch0(context);
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        ch0Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(ch0Var, c8.ha.r(64, 64, 17));
        ch0Var.d();
        TextView b10 = c8.qa.b(context, 20.0f, org.telegram.ui.ActionBar.k6.G6, true, null);
        b10.setGravity(17);
        b10.setText(org.telegram.messenger.hd.M0(z9 ? 2131750004 : 2131749910, null));
        f10.addView(b10, c8.ha.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = c8.qa.b(context, 14.0f, org.telegram.ui.ActionBar.k6.F6, false, null);
        b11.setGravity(17);
        b11.setText(org.telegram.messenger.hd.a0(null, null, z9 ? 2131750005 : 2131749911, org.telegram.messenger.hd.c0(Math.max(10, i7))));
        f10.addView(b11, c8.ha.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, this.I0);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void r0() {
        fi.m3 m3Var = this.q3;
        if (m3Var != null) {
            m3Var.f(true);
            this.q3 = null;
        }
    }

    public final void r1(long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload, vf.b bVar, wg.f1 f1Var) {
        TL_wallet.nftItem nftitem = this.X2;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (nftitem == null || H1 == null || TextUtils.isEmpty(H1.slug)) {
            return;
        }
        bVar.d();
        q3 q3Var = new q3(this, bVar, f1Var, j3, H1, nftitem, 0);
        if (stargiftdepositpayload != null) {
            q3Var.a(stargiftdepositpayload);
            return;
        }
        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
        depositstargift.peer = qp.s1(this.a).j1(j3);
        depositstargift.slug = H1.slug;
        ConnectionsManager.getInstance(this.a).sendRequestTyped(depositstargift, new d3.b(1), new q2(this, bVar, f1Var, q3Var, 1));
    }

    public final void r2(boolean z9, org.telegram.ui.ActionBar.u1 u1Var, vf.b bVar, Runnable runnable) {
        bVar.d();
        p10 i7 = p10.i(this.a);
        TL_account.tmpPassword tmppassword = i7.y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.a).getCurrentTime() + 60) {
            i7.y = null;
            i7.v(false);
        }
        TL_account.tmpPassword tmppassword2 = i7.y;
        if (tmppassword2 == null) {
            V1(z9, bVar, runnable);
        } else {
            J1(tmppassword2.tmp_password, null, z9, new n3(this, z9, bVar, runnable, u1Var));
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        try {
            P(org.telegram.ui.ActionBar.k6.h5);
            e7 e7Var = this.X1;
            if (e7Var != null) {
                e7Var.l();
            }
            wp wpVar = this.V2;
            if (wpVar != null) {
                Drawable drawable = wpVar.c;
                if (drawable instanceof f7) {
                    ((f7) drawable).d.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.I0));
                    fi.d dVar = this.c2;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(final long j3, final c20 c20Var) {
        TLRPC.Message message;
        long o4;
        long j10;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.x2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            ij ijVar = this.z2;
            if (ijVar == null || (message = ijVar.k) == null) {
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
            o4 = this.P1;
        }
        if (j10 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = B1;
            transferstargift.to_id = qp.s1(this.a).j1(j3);
            final long j11 = o4;
            ConnectionsManager.getInstance(this.a).sendRequest(transferstargift, new RequestDelegate() { // from class: bi.v2
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    boolean z9 = tLObject instanceof TLRPC.Updates;
                    k7 k7Var = k7.this;
                    if (z9) {
                        qp.s1(k7Var.a).O3((TLRPC.Updates) tLObject, false);
                    }
                    org.telegram.messenger.g0.h3(new i3(k7Var, c20Var, tL_error, tLObject, j3, j11));
                }
            });
            return;
        }
        final long j12 = o4;
        ea y10 = ea.y(this.a, false);
        if (!y10.e) {
            y10.r(new w2(this, y10, j3, c20Var, 0));
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = B1;
        tL_inputInvoiceStarGiftTransfer.to_id = qp.s1(this.a).j1(j3);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject u10 = hi.a3.u(this.I0, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: bi.x2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final k7 k7Var = k7.this;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                final long j13 = j3;
                final long j14 = j12;
                final c20 c20Var2 = c20Var;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: bi.g3
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z9 = tLObject2 instanceof TLRPC.PaymentForm;
                        k7 k7Var2 = k7.this;
                        c20 c20Var3 = c20Var2;
                        if (!z9) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            c20Var3.a(tL_error2);
                            org.telegram.ui.Components.cc Y = k7Var2.k().Y(tL_error2);
                            Y.t = true;
                            Y.j();
                            return;
                        }
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                        int i7 = 0;
                        qp.s1(k7Var2.a).Y3(paymentForm.users, false);
                        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer2;
                        ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
                        int size = arrayList.size();
                        long j15 = 0;
                        while (i7 < size) {
                            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                            i7++;
                            j15 += tL_labeledPrice.amount;
                        }
                        ConnectionsManager.getInstance(k7Var2.a).sendRequest(tL_payments_sendStarsForm, new t2(k7Var2, j13, j14, c20Var3, j15));
                    }
                });
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s2(int i7, boolean z9, k1 k1Var) {
        int i10;
        fi.m3 m3Var;
        s6 s6Var;
        ValueAnimator valueAnimator = this.U2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U2 = null;
        }
        e7 e7Var = this.X1;
        if (i7 != 1) {
            org.telegram.messenger.g0.r(e7Var.l0);
        }
        if (!this.W2) {
            this.S2 = Float.valueOf(this.Q1.f());
        }
        g6 g6Var = this.T2;
        this.T2 = new g6(g6Var == null ? 0 : g6Var.c, i7);
        k5 k5Var = this.L2;
        int finalHeight = e7Var.getFinalHeight();
        int w12 = w1();
        if (this.T2.d(1)) {
            FrameLayout frameLayout = this.f2;
            if (frameLayout.getVisibility() == 0) {
                i10 = frameLayout.getMeasuredHeight();
                k5Var.H(finalHeight, w12 + i10);
                if (this.T2.c == 0 && (s6Var = this.H2) != null) {
                    s6Var.c();
                }
                int i11 = 3;
                h5 h5Var = this.v2;
                h5 h5Var2 = this.t2;
                h5 h5Var3 = this.k2;
                h5 h5Var4 = this.Y1;
                if (z9) {
                    this.T2.a = 1.0f;
                    P1();
                    h5Var4.setVisibility(i7 == 0 ? 0 : 8);
                    h5Var3.setVisibility(i7 == 1 ? 0 : 8);
                    h5Var2.setVisibility(i7 == 2 ? 0 : 8);
                    h5Var.setVisibility(i7 != 3 ? 8 : 0);
                    u2();
                    if (k1Var != null) {
                        k1Var.run();
                    }
                } else {
                    h5Var4.setVisibility(this.T2.b(0) ? 0 : 8);
                    h5Var3.setVisibility(this.T2.b(1) ? 0 : 8);
                    h5Var2.setVisibility(this.T2.b(2) ? 0 : 8);
                    h5Var.setVisibility(this.T2.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.U2 = ofFloat;
                    ofFloat.addUpdateListener(new ah.h(this, i11));
                    this.U2.addListener(new y4(this, i7, k1Var, r5));
                    this.U2.setInterpolator(xq.h);
                    this.U2.setDuration(320L);
                    this.U2.start();
                    g6 g6Var2 = this.T2;
                    org.telegram.ui.Components.l9[] l9VarArr = e7Var.d;
                    int i12 = g6Var2.b;
                    int i13 = g6Var2.c;
                    if (i12 != i13) {
                        zg0 B = l9VarArr[i12].getImageReceiver().B();
                        zg0 B2 = l9VarArr[i13].getImageReceiver().B();
                        if (B2 != null && B != null) {
                            B2.T(false, B.t());
                        }
                    }
                }
                m3Var = this.q3;
                if (m3Var == null) {
                    m3Var.f(true);
                    this.q3 = null;
                    return;
                }
                return;
            }
        }
        i10 = 0;
        k5Var.H(finalHeight, w12 + i10);
        if (this.T2.c == 0) {
            s6Var.c();
        }
        int i112 = 3;
        h5 h5Var5 = this.v2;
        h5 h5Var22 = this.t2;
        h5 h5Var32 = this.k2;
        h5 h5Var42 = this.Y1;
        if (z9) {
        }
        m3Var = this.q3;
        if (m3Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        ij ijVar;
        TLRPC.Message message;
        if (qp.s1(this.a).v2()) {
            org.telegram.ui.b.b(this.a);
            return;
        }
        if (this.A2 != null && this.B2 == null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
            u1Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.A2;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift, new j(2, this, u1Var));
        } else if (this.x2 == null && (ijVar = this.z2) != null && (message = ijVar.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
                        u1Var2.r(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new f2(this, tL_messageActionStarGift, u1Var2, 0));
                        return;
                    }
                    if (B1() != null) {
                        org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
                        u1Var3.r(500L);
                        ea.y(this.a, false).M(B1(), new ai.f1(2, this, u1Var3));
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
        fi.d dVar = this.c2;
        if (dVar.Q || (B1 = B1()) == null) {
            return;
        }
        ij ijVar = this.z2;
        String str = null;
        long j10 = 0;
        if (ijVar != null) {
            TLRPC.MessageAction messageAction = ijVar.k.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j3 = tL_messageActionStarGift.upgrade_stars;
            if (j3 <= 0) {
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift == null) {
                return;
            }
            j3 = savedStarGift.upgrade_stars;
            if (j3 <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
        }
        if (j3 > 0 || this.k3 != null) {
            dVar.setLoading(true);
            wo woVar = this.o2;
            if (j3 > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = woVar.a.q;
                upgradestargift.stargift = B1;
                ConnectionsManager.getInstance(this.a).sendRequest(upgradestargift, new j(4, this, B1));
                return;
            }
            int i7 = 0;
            ea y10 = ea.y(this.a, false);
            if (!y10.e) {
                y10.r(new a1.e(28, this, y10));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.k3.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = woVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = qp.s1(this.a).j1(this.P1);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.k3.invoice.prices;
            int size = arrayList.size();
            while (i7 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                i7++;
                j10 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new f0(this, str, B1, j10, 1));
        }
    }

    public final void t2(boolean z9) {
        boolean z10;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        qp.e1().edit().putInt("statusgiftpage", 3).apply();
        boolean M1 = M1(this.a, H1());
        boolean z11 = !M1;
        boolean M12 = M1(this.a, H1());
        fi.d dVar = this.c2;
        int i7 = 1;
        if (M12) {
            qp.s1(this.a).g5(x1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z10 = z11;
        } else {
            z10 = z11;
            long x12 = x1();
            if (x12 >= 0) {
                if (!p10.i(this.a).q()) {
                    org.telegram.ui.Components.cc P = k().P(R.raw.star_premium_2, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131750422, null), new z1(this, 2)));
                    P.t = true;
                    P.j();
                    return;
                }
            } else if (!z9) {
                qp s12 = qp.s1(this.a);
                dVar.setLoading(true);
                qp.s1(this.a).G0().a(x12, new b2(this, s12, x12, 0));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = H1.id;
            qp.s1(this.a).g5(x1(), tL_inputEmojiStatusCollectible, H1);
        }
        this.X1.I[1].e(!M1 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, org.telegram.messenger.hd.M0(!M1 ? 2131750421 : 2131750424, null), true);
        if (this.s2) {
            dismiss();
            return;
        }
        k1 k1Var = new k1(i7, this, z10);
        if (this.T2.c(0)) {
            k1Var.run();
        } else {
            s2(0, true, k1Var);
        }
        dVar.i(org.telegram.messenger.hd.M0(2131747830, null), !this.W2, true);
        dVar.g(null, !this.W2);
        dVar.setOnClickListener(new y1(this, 5));
    }

    public final void u2() {
        FrameLayout frameLayout = this.f2;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.h2;
        FrameLayout frameLayout3 = this.d2;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.T2.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.T2.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.T2.a(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    public final void v2() {
        boolean I1 = I1(false);
        f5 f5Var = this.R1;
        f5Var.setPosition(I1 ? 1 : 0);
        f5Var.D(false);
        if (this.y2 == null || I1(true) || this.y2.e() >= this.y2.c()) {
            return;
        }
        this.y2.a();
    }

    public final int w1() {
        if (this.T2.d(1)) {
            return this.k2.getMeasuredHeight();
        }
        if (this.T2.d(2)) {
            return this.t2.getMeasuredHeight();
        }
        if (this.T2.d(3)) {
            return this.v2.getMeasuredHeight();
        }
        if (this.T2.d(4)) {
            return 0;
        }
        return this.Y1.getMeasuredHeight();
    }

    public final void w2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        TL_wallet.nftItem nftitem = this.X2;
        LinearLayout linearLayout = this.q2;
        if (nftitem == null || H1 == null) {
            linearLayout.setVisibility(8);
            return;
        }
        this.Z1.setVisibility(8);
        this.b2.setVisibility(8);
        linearLayout.setVisibility(0);
        this.r2.a(H1.host_id != null, linearLayout.isAttachedToWindow());
    }

    public final long x1() {
        TLRPC.Peer peer;
        ij ijVar = this.z2;
        if (ijVar == null) {
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? org.telegram.messenger.m5.o(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.P1;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
            if (tL_starGiftUnique != null) {
                return org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id);
            }
            return 0L;
        }
        TLRPC.Message message = ijVar.k;
        if (message == null) {
            return 0L;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
            return peer2 != null ? org.telegram.messenger.m5.o(peer2) : ijVar.Q3() ? ij.B0(this.z2.k) : p10.i(this.a).e();
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

    public final TL_stars.StarGift y1() {
        ij ijVar = this.z2;
        if (ijVar != null) {
            TLRPC.Message message = ijVar.k;
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
            TL_stars.SavedStarGift savedStarGift = this.x2;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
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
        return jg.g.m(r0.num, ',', sb2);
    }
}
