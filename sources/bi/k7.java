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
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.pg0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class k7 extends org.telegram.ui.Components.ma implements ls {
    public static final /* synthetic */ int v3 = 0;
    public TL_stars.SavedStarGift A2;
    public w9 B2;
    public ij C2;
    public String D2;
    public TL_stars.TL_starGiftUnique E2;
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public s6 K2;
    public boolean L2;
    public l5 M2;
    public final int[] N2;
    public k5 O2;
    public int P2;
    public String Q2;
    public zh.k3 R2;
    public final long S1;
    public wp S2;
    public final m5 T1;
    public boolean T2;
    public final f5 U1;
    public x4 U2;
    public final jz V1;
    public Float V2;
    public final View W1;
    public g6 W2;
    public i5 X1;
    public ValueAnimator X2;
    public i5 Y1;
    public wp Y2;
    public final j5 Z1;
    public boolean Z2;
    public final e7 a2;
    public TL_wallet.nftItem a3;
    public final h5 b2;
    public org.telegram.ui.Wallet.h5 b3;
    public final w70 c2;
    public org.telegram.ui.Wallet.i5 c3;
    public final tx0 d2;
    public TL_wallet.walletTransaction d3;
    public final w70 e2;
    public View e3;
    public final fi.d f2;
    public zh.p1 f3;
    public final FrameLayout g2;
    public boolean g3;
    public final w70 h2;
    public Boolean h3;
    public final FrameLayout i2;
    public boolean i3;
    public final View j2;
    public ArrayList j3;
    public final FrameLayout k2;
    public ArrayList k3;
    public g7 l2;
    public ArrayList l3;
    public boolean m2;
    public boolean m3;
    public final h5 n2;
    public TLRPC.PaymentForm n3;
    public final hi.i[] o2;
    public final wp[] o3;
    public final View p2;
    public final z1 p3;
    public final LinearLayout q2;
    public int q3;
    public final wo r2;
    public Boolean r3;
    public final TextView s2;
    public boolean s3;
    public final LinearLayout t2;
    public fi.m3 t3;
    public final wo u2;
    public View u3;
    public boolean v2;
    public final h5 w2;
    public final TextView x2;
    public final h5 y2;
    public boolean z2;

    public k7(Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, View view) {
        super(context, null, false, false, h6Var);
        int i10 = 0;
        this.m2 = false;
        this.N2 = new int[2];
        this.P2 = -1;
        this.Q2 = "";
        this.W2 = new g6(0, 0);
        this.Z2 = true;
        this.o3 = new wp[1];
        this.p3 = new z1(this, 11);
        this.s3 = true;
        this.a = i7;
        this.S1 = j3;
        this.u1 = Math.max(0.05f, org.telegram.messenger.g0.L(82.0f) / (org.telegram.messenger.g0.q.y + org.telegram.messenger.g0.m));
        this.x = true;
        this.b = new e5(i10, context, this);
        m5 m5Var = new m5(this, context);
        this.T1 = m5Var;
        f5 f5Var = new f5(this, context);
        this.U1 = f5Var;
        f5Var.setAdapter(new g5(i10, context, this));
        v2();
        View view2 = new View(context);
        this.W1 = view2;
        int i11 = org.telegram.ui.ActionBar.m6.h5;
        org.telegram.ui.ActionBar.t6.h(i11, view2, h6Var);
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, 50, 80);
        int i12 = this.t0;
        e10.rightMargin = i12;
        e10.leftMargin = i12;
        this.b.addView(view2, e10);
        this.b.addView(f5Var, c8.ha.e(-1, -1, qs.E1));
        P(i11);
        org.telegram.messenger.g0.E2(this.n1);
        m5Var.addView(this.n1, c8.ha.e(-1, -1, qs.E1));
        h5 h5Var = new h5(this, context, 0);
        this.b2 = h5Var;
        h5Var.setOrientation(1);
        h5Var.setPadding(org.telegram.messenger.g0.L(14.0f) + this.t0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f) + this.t0, org.telegram.messenger.g0.L(68.0f));
        m5Var.addView(h5Var, c8.ha.e(-1, -1, 55));
        w70 w70Var = new w70(context, h6Var);
        this.c2 = w70Var;
        int i13 = org.telegram.ui.ActionBar.m6.q5;
        org.telegram.ui.ActionBar.t6.U(w70Var, i13, h6Var);
        w70Var.setTextSize(1, 12.0f);
        w70Var.setGravity(17);
        w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.Uc, h6Var);
        w70Var.setDisablePaddingsOffsetY(true);
        h5Var.addView(w70Var, c8.ha.t(-2, -2, 1, 4, -2, 4, 16));
        w70Var.setVisibility(8);
        tx0 tx0Var = new tx0(context, h6Var);
        this.d2 = tx0Var;
        h5Var.addView(tx0Var, c8.ha.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        w70 w70Var2 = new w70(context, h6Var);
        this.e2 = w70Var2;
        org.telegram.ui.ActionBar.t6.U(w70Var2, i13, h6Var);
        w70Var2.setTextSize(1, 12.0f);
        w70Var2.setGravity(17);
        w70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        int i14 = org.telegram.ui.ActionBar.m6.Ci;
        org.telegram.ui.ActionBar.t6.G(w70Var2, i14, h6Var);
        w70Var2.setDisablePaddingsOffsetY(true);
        w70Var2.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        h5Var.addView(w70Var2, c8.ha.t(-2, -2, 1, 4, 2, 4, 8));
        w70Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.t2 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setOrientation(0);
        int i15 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i15, h6Var), 21, 21);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i15);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(linearLayout, a02, null, M, h6Var);
        wo woVar = new wo(24, context, h6Var);
        this.u2 = woVar;
        int i16 = org.telegram.ui.ActionBar.m6.h7;
        int i17 = org.telegram.ui.ActionBar.m6.j7;
        int i18 = org.telegram.ui.ActionBar.m6.k7;
        woVar.b(i16, i17, i18);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(woVar, c8.ha.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i19 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(textView, i19, h6Var);
        jg.g.v(textView, 1, 14.0f, null, 2131750389);
        linearLayout.addView(textView, c8.ha.t(-2, -2, 16, 9, 0, 0, 0));
        h5Var.addView(linearLayout, c8.ha.t(-2, -2, 1, 0, -4, 0, 4));
        c8.ka.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new y1(this, 19));
        linearLayout.setVisibility(8);
        h5 h5Var2 = new h5(this, context, 1);
        this.n2 = h5Var2;
        h5Var2.setOrientation(1);
        h5Var2.setPadding(org.telegram.messenger.g0.L(4.0f) + this.t0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f) + this.t0, org.telegram.messenger.g0.L(66.0f));
        m5Var.addView(h5Var2, c8.ha.e(-1, -1, 55));
        hi.i[] iVarArr = {r9, r6, r6};
        this.o2 = iVarArr;
        hi.i iVar = new hi.i(context, h6Var, false);
        iVar.a(R.drawable.menu_feature_unique, org.telegram.messenger.id.M0(2131749865, null), org.telegram.messenger.id.M0(2131749575, null));
        h5Var2.addView(iVarArr[0], c8.ha.o(-1, -2));
        hi.i iVar2 = new hi.i(context, h6Var, false);
        iVar2.a(R.drawable.menu_feature_tradable, org.telegram.messenger.id.M0(2131749859, null), org.telegram.messenger.id.M0(2131749573, null));
        h5Var2.addView(iVarArr[1], c8.ha.o(-1, -2));
        hi.i iVar3 = new hi.i(context, h6Var, false);
        iVar3.a(R.drawable.menu_wear, org.telegram.messenger.id.M0(2131749570, null), org.telegram.messenger.id.M0(2131749571, null));
        h5Var2.addView(iVarArr[2], c8.ha.o(-1, -2));
        View view3 = new View(context);
        this.p2 = view3;
        int i20 = org.telegram.ui.ActionBar.m6.d7;
        org.telegram.ui.ActionBar.t6.h(i20, view3, h6Var);
        h5Var2.addView(view3, c8.ha.n(1.0f / org.telegram.messenger.g0.p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.q2 = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i15, h6Var), 6, 6);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i15);
        linearLayout2.setBackground(a03);
        org.telegram.ui.ActionBar.t6.j(linearLayout2, a03, null, M2, h6Var);
        wo woVar2 = new wo(24, context, h6Var);
        this.r2 = woVar2;
        woVar2.b(i16, i17, i18);
        woVar2.setDrawUnchecked(true);
        woVar2.a(false, false);
        woVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(woVar2, c8.ha.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.s2 = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, i19, h6Var);
        jg.g.v(textView2, 1, 14.0f, null, 2131750397);
        linearLayout2.addView(textView2, c8.ha.t(-2, -2, 16, 9, 0, 0, 0));
        h5Var2.addView(linearLayout2, c8.ha.t(-2, -2, 1, 0, 0, 0, 4));
        c8.ka.b(linearLayout2, 0.025f, 1.5f);
        h5 h5Var3 = new h5(this, context, 2);
        this.w2 = h5Var3;
        h5Var3.setOrientation(1);
        h5Var3.setPadding(org.telegram.messenger.g0.L(4.0f) + this.t0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) + this.t0, org.telegram.messenger.g0.L(66.0f));
        m5Var.addView(h5Var3, c8.ha.e(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.x2 = textView3;
        org.telegram.ui.ActionBar.t6.U(textView3, i19, h6Var);
        textView3.setTextSize(1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        h5Var3.addView(textView3, c8.ha.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView4, i19, h6Var);
        textView4.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.m(textView4, 17, null, 2131749834);
        h5Var3.addView(textView4, c8.ha.t(-1, -2, 7, 20, 6, 20, 24));
        hi.i iVar4 = new hi.i(context, h6Var, false);
        iVar4.a(R.drawable.menu_feature_unique, org.telegram.messenger.id.M0(2131749840, null), org.telegram.messenger.id.M0(2131749841, null));
        h5Var3.addView(r6[0], c8.ha.o(-1, -2));
        hi.i iVar5 = new hi.i(context, h6Var, false);
        iVar5.a(R.drawable.menu_feature_cover, org.telegram.messenger.id.M0(2131749838, null), org.telegram.messenger.id.M0(2131749839, null));
        h5Var3.addView(r6[1], c8.ha.o(-1, -2));
        hi.i iVar6 = new hi.i(context, h6Var, false);
        hi.i[] iVarArr2 = {iVar4, iVar5, iVar6};
        iVar6.a(R.drawable.menu_verification, org.telegram.messenger.id.M0(2131749836, null), org.telegram.messenger.id.M0(2131749837, null));
        h5Var3.addView(iVarArr2[2], c8.ha.o(-1, -2));
        h5 h5Var4 = new h5(this, context, 3);
        this.y2 = h5Var4;
        h5Var4.setOrientation(1);
        h5Var4.setPadding(org.telegram.messenger.g0.L(4.0f) + this.t0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f) + this.t0, org.telegram.messenger.g0.L(92.0f));
        m5Var.addView(h5Var4, c8.ha.e(-1, -1, 55));
        hi.i iVar7 = new hi.i(context, h6Var, false);
        iVar7.a(R.drawable.menu_feature_unique, org.telegram.messenger.id.M0(2131749785, null), org.telegram.messenger.id.M0(2131749786, null));
        h5Var4.addView(r6[0], c8.ha.o(-1, -2));
        hi.i iVar8 = new hi.i(context, h6Var, false);
        iVar8.a(R.drawable.menu_random, org.telegram.messenger.id.M0(2131749783, null), org.telegram.messenger.id.M0(2131749784, null));
        h5Var4.addView(r6[1], c8.ha.o(-1, -2));
        hi.i iVar9 = new hi.i(context, h6Var, false);
        hi.i[] iVarArr3 = {iVar7, iVar8, iVar9};
        iVar9.a(R.drawable.menu_feature_affect, org.telegram.messenger.id.M0(2131749781, null), org.telegram.messenger.id.M0(2131749782, null));
        h5Var4.addView(iVarArr3[2], c8.ha.o(-1, -2));
        h5Var.setAlpha(1.0f);
        h5Var2.setAlpha(0.0f);
        h5Var3.setAlpha(0.0f);
        h5Var4.setAlpha(0.0f);
        e7 e7Var = new e7(context, h6Var, new z1(this, 12), new y1(this, 20), new y1(this, 21), new y1(this, 22), new y1(this, 23), new y1(this, 24), new y1(this, 25), new y1(this, 26));
        this.a2 = e7Var;
        e7Var.M.c.setOnClickListener(new y1(this, 17));
        int i21 = this.t0;
        e7Var.setPadding(i21, 0, i21, 0);
        m5Var.addView(e7Var, c8.ha.e(-1, -2, 55));
        jg.b0 b0Var = this.m1;
        this.J1 = true;
        b0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g2 = frameLayout;
        org.telegram.ui.ActionBar.t6.h(i11, frameLayout, h6Var);
        View view4 = new View(context);
        this.j2 = view4;
        org.telegram.ui.ActionBar.t6.h(i20, view4, h6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        this.f2 = h;
        h.i(org.telegram.messenger.id.M0(2131747831, null), false, true);
        h.g(null, false);
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, qs.E1, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = org.telegram.messenger.g0.L(14.0f) + this.t0;
        d.rightMargin = org.telegram.messenger.g0.L(14.0f) + this.t0;
        frameLayout.addView(h, d);
        m5Var.addView(frameLayout, c8.ha.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i2 = frameLayout2;
        org.telegram.ui.ActionBar.t6.h(i11, frameLayout2, h6Var);
        w70 w70Var3 = new w70(context, null);
        this.h2 = w70Var3;
        w70Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var3, i14, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var3, i14, h6Var);
        w70Var3.setGravity(17);
        frameLayout2.addView(w70Var3, c8.ha.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        m5Var.addView(frameLayout2, c8.ha.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.n1.setOnScrollListener(new ai.b(this, 4));
        linearLayout2.setOnClickListener(new y1(this, 18));
        jz jzVar = new jz(context);
        this.V1 = jzVar;
        m5Var.addView(jzVar, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(6.0f) + this.t0, 0, org.telegram.messenger.g0.L(6.0f) + this.t0, 0);
        m5Var.addView(frameLayout3, c8.ha.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        org.telegram.messenger.g0.E2(this.o1);
        m5Var.addView(this.o1, c8.ha.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        j5 j5Var = new j5(context);
        this.Z1 = j5Var;
        m5Var.addView(j5Var, c8.ha.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        org.telegram.messenger.g0.m2(new ai.i(j5Var, 6), 12.0f, 12, arrayList);
    }

    public static String F1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return org.telegram.messenger.id.M0(2131749619, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return org.telegram.messenger.id.M0(2131749620, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return org.telegram.messenger.id.M0(2131749622, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return org.telegram.messenger.id.M0(2131749621, null);
        }
        if (!(starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
            return "";
        }
        int i7 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        return i7 <= 0 ? "<0.1%" : hi.j.J0(i7);
    }

    public static boolean J1(int i7, long j3) {
        return j3 >= 0 ? p10.i(i7).e() == j3 : org.telegram.messenger.t3.w(5, qp.s1(i7).M0(Long.valueOf(-j3)));
    }

    public static boolean K1(int i7, long j3) {
        if (j3 >= 0) {
            return p10.i(i7).e() == j3;
        }
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
        return M0 != null && M0.creator;
    }

    public static boolean L1(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
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

    public static void b2(org.telegram.ui.ActionBar.f2 f2Var) {
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
        fi.d dVar = k7Var.f2;
        if (dVar.Q) {
            return;
        }
        TL_stars.InputSavedStarGift A1 = k7Var.A1();
        ij ijVar = k7Var.C2;
        if (ijVar == null || (message = ijVar.k) == null) {
            TL_stars.SavedStarGift savedStarGift = k7Var.A2;
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
        savestargift.stargift = A1;
        if (k7Var.A2 == null || (F = ea.y(k7Var.a, false).F(k7Var.S1, false)) == null) {
            z10 = false;
        } else {
            F.m(k7Var.A2, savestargift.unsave);
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
        final TL_stars.InputSavedStarGift A1 = k7Var.A1();
        if (A1 == null) {
            return;
        }
        ij ijVar = k7Var.C2;
        if (ijVar != null) {
            i7 = ijVar.k.date;
            boolean P3 = ijVar.P3();
            TLRPC.Message message = k7Var.C2.k;
            if (message == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGift.peer;
            j10 = peer != null ? org.telegram.messenger.m5.o(peer) : P3 ? ij.B0(message) : e10;
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            o4 = peer2 != null ? org.telegram.messenger.m5.o(peer2) : P3 ? e10 : ij.B0(k7Var.C2.k);
            j3 = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = k7Var.A2;
            if (savedStarGift == null) {
                return;
            }
            i7 = savedStarGift.date;
            o4 = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? 2666000L : org.telegram.messenger.m5.o(savedStarGift.from_id);
            j3 = k7Var.A2.convert_stars;
            j10 = k7Var.S1;
        }
        int max = Math.max(1, (qp.s1(k7Var.a).E6 - (ConnectionsManager.getInstance(k7Var.a).getCurrentTime() - i7)) / 86400);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
        String M0 = org.telegram.messenger.id.M0(2131750226, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(max, "Gift2ConvertText2", (t10.A(o4) || o4 == 2666000) ? org.telegram.messenger.id.M0(2131744949, null) : org.telegram.messenger.m5.t(o4), org.telegram.messenger.id.H(',', "Gift2ConvertStars", (int) j3)));
        final long j11 = j3;
        final long j12 = j10;
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131750233, null), new org.telegram.ui.ActionBar.r1() { // from class: bi.q4
            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                k7 k7Var2 = k7.this;
                TL_stars.InputSavedStarGift inputSavedStarGift = A1;
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

    public static SpannableStringBuilder e2(String str) {
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

    public static void f1(k7 k7Var, org.telegram.ui.ActionBar.u1 u1Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            u1Var.dismiss();
            k7Var.J2 = true;
            k7Var.i2(savedStarGift, null);
            super.show();
            return;
        }
        u1Var.dismiss();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null) {
            org.telegram.ui.Components.bc Q = org.telegram.ui.Components.gc.a0(T).Q(R.raw.error, 36, org.telegram.messenger.id.M0(2131748552, null));
            Q.t = true;
            Q.j();
        }
    }

    public static SpannableStringBuilder f2(String str) {
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

    public static void g1(k7 k7Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        k7Var.E2 = tL_starGiftUnique;
        k7Var.j2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static void h1(k7 k7Var, org.telegram.ui.ActionBar.u1 u1Var, ij ijVar) {
        u1Var.dismiss();
        k7Var.H2 = true;
        k7Var.h2(ijVar, null);
        super.show();
    }

    public static void j1(tx0 tx0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = org.telegram.messenger.id.M0(2131750387, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = org.telegram.messenger.id.M0(2131750380, null);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            M0 = org.telegram.messenger.id.M0(2131750388, null);
        }
        String str = M0;
        Integer[] numArr = new Integer[1];
        tx0Var.e(str, starGiftAttribute.name, F1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static boolean t1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
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

    public static boolean u1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique != null) {
            return tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
        }
        return false;
    }

    public static String z1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? org.telegram.messenger.id.M0(2131750192, null) : starGift.title;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb2.append(" #");
        return jg.g.m(r3.num, ',', sb2);
    }

    public final TL_stars.InputSavedStarGift A1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j3 = this.S1;
        if (j3 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = qp.s1(this.a).j1(j3);
            ij ijVar = this.C2;
            if (ijVar == null || (message3 = ijVar.k) == null) {
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.E2 == null || TextUtils.isEmpty(this.D2)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.D2;
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
        ij ijVar2 = this.C2;
        if (ijVar2 != null && (message2 = ijVar2.k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & TLObject.FLAG_12) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                qp s12 = qp.s1(this.a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                tL_inputSavedStarGiftChat2.peer = s12.j1(peer != null ? org.telegram.messenger.m5.o(peer) : ij.B0(this.C2.k));
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
                tL_inputSavedStarGiftChat3.peer = s13.j1(peer2 != null ? org.telegram.messenger.m5.o(peer2) : ij.B0(this.C2.k));
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        ij ijVar3 = this.C2;
        if (ijVar3 != null) {
            TLRPC.Message message4 = ijVar3.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = ijVar3.e1();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.A2;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.E2 == null || TextUtils.isEmpty(this.D2)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.D2;
        return tL_inputSavedStarGiftSlug2;
    }

    public final String B1() {
        TL_stars.StarGift x12 = x1();
        if (!(x12 instanceof TL_stars.TL_starGiftUnique) || x12.slug == null) {
            return null;
        }
        return qp.s1(this.a).U2 + "/nft/" + x12.slug;
    }

    public final int C1() {
        int indexOf;
        w9 w9Var = this.B2;
        if (w9Var == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift != null) {
            indexOf = w9Var.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = w9Var.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift x12 = x1();
        for (int i7 = 0; i7 < this.B2.e(); i7++) {
            Object obj = this.B2.get(i7);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.A2;
                if (savedStarGift2 != null) {
                    if (t1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                        return i7;
                    }
                }
                if (x12 != null) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (x12 != starGift) {
                        if ((x12 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && x12.id == starGift.id) {
                        }
                    }
                    return i7;
                }
                continue;
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && u1(this.E2, (TL_stars.TL_starGiftUnique) obj)) {
                    return i7;
                }
            }
        }
        return -1;
    }

    public final TL_stars.SavedStarGift D1(boolean z9) {
        int C1 = C1();
        if (C1 < 0) {
            return null;
        }
        int i7 = (z9 ? 1 : -1) + C1;
        int i10 = this.P2;
        if (i10 >= 0 && (!z9 ? i10 < C1 : i10 > C1)) {
            i7 = i10;
        }
        w9 w9Var = this.B2;
        Object obj = (w9Var == null || i7 < 0 || i7 >= w9Var.e()) ? null : this.B2.get(i7);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void E0(int i7) {
        super.E0(i7);
        org.telegram.messenger.g0.u3(this, 0, false, null);
    }

    public final TL_stars.TL_starGiftUnique E1(boolean z9) {
        int C1 = C1();
        if (C1 < 0) {
            return null;
        }
        int i7 = (z9 ? 1 : -1) + C1;
        int i10 = this.P2;
        if (i10 >= 0 && (!z9 ? i10 < C1 : i10 > C1)) {
            i7 = i10;
        }
        w9 w9Var = this.B2;
        Object obj = (w9Var == null || i7 < 0 || i7 >= w9Var.e()) ? null : this.B2.get(i7);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.ma, org.telegram.ui.ActionBar.w2
    public final boolean G() {
        if (this.W2.c(4)) {
            boolean z9 = this.a2.M.h0;
        }
        return false;
    }

    public final TL_stars.TL_starGiftUnique G1() {
        TL_stars.StarGift x12 = x1();
        if (x12 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) x12;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean H() {
        if (this.W2.c(4) && this.a2.M.h0) {
            return false;
        }
        return this.c0;
    }

    public final boolean H1(boolean z9) {
        return (D1(z9) == null && E1(z9) == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean I(MotionEvent motionEvent) {
        if (this.W2.c(4)) {
            boolean z9 = this.a2.M.h0;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, n3 n3Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift A1 = A1();
        if (A1 == null) {
            if (n3Var != null) {
                n3Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z9) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.s3;
            withdrawstargift.stargift = A1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = A1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftwithdrawalurl, new d4(this, n3Var, twoStepVerificationActivity, z9, 0));
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        k5 k5Var = new k5(this, 0);
        this.O2 = k5Var;
        return k5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r4 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M1() {
        long e10;
        TL_stars.TL_starGiftUnique G1 = G1();
        fi.d dVar = this.f2;
        if (dVar.Q || G1 == null) {
            return;
        }
        if (this.E2 != null && this.F2) {
            e10 = this.S1;
        }
        e10 = p10.i(this.a).e();
        cg.b bVar = G1.resale_ton_only ? cg.b.b : cg.b.a;
        if (this.E2 == null || !this.F2) {
            dVar.setLoading(true);
            long j3 = e10;
            ea.x(this.a, bVar).H(G1, j3, null, true, new i2(this, null, bVar, G1, j3, null, true));
        } else {
            zh.h0 h0Var = new zh.h0(getContext(), this.I0, G1, e10);
            h0Var.E1 = new n4(this, h0Var, G1, e10, bVar, 0);
            h0Var.show();
        }
    }

    @Override // org.telegram.ui.Components.ma
    public final int N0() {
        return org.telegram.messenger.g0.L(12.0f);
    }

    public final void N1() {
        x4 x4Var = this.U2;
        if (x4Var != null && !x4Var.I) {
            x4Var.dismiss();
        }
        String B1 = B1();
        x4 x4Var2 = new x4(this, getContext(), B1, B1, this.I0);
        this.U2 = x4Var2;
        x4Var2.n2 = new cb.c(this, 11);
        x4Var2.show();
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return this.Q2;
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
    public final void O1() {
        TL_stars.TL_starGiftUnique G1;
        this.b2.setAlpha(this.W2.a(0));
        this.n2.setAlpha(this.W2.a(1));
        this.w2.setAlpha(this.W2.a(2));
        this.y2.setAlpha(this.W2.a(3));
        float a10 = 1.0f - this.W2.a(4);
        FrameLayout frameLayout = this.g2;
        frameLayout.setAlpha(a10);
        g6 g6Var = this.W2;
        e7 e7Var = this.a2;
        e7Var.d(g6Var);
        ImageView imageView = e7Var.Q;
        if (this.W2.c(0) && (G1 = G1()) != null && !G1.crafted && K1(this.a, org.telegram.messenger.m5.o(G1.owner_id))) {
            ij ijVar = this.C2;
            if (ijVar != null) {
                TLRPC.Message message = ijVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    }
                }
            }
            imageView.setVisibility(r4);
            m5 m5Var = this.T1;
            float f10 = m5Var.f();
            this.Z1.setAlpha(this.W2.a(0) * Utilities.l(org.telegram.messenger.g0.z1(f10 - r6.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f))));
            m5Var.g();
            m5Var.invalidate();
            frameLayout.setVisibility(this.W2.c(4) ? 8 : 0);
            u2();
        }
        int i7 = 8;
        imageView.setVisibility(i7);
        m5 m5Var2 = this.T1;
        float f102 = m5Var2.f();
        this.Z1.setAlpha(this.W2.a(0) * Utilities.l(org.telegram.messenger.g0.z1(f102 - r6.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f))));
        m5Var2.g();
        m5Var2.invalidate();
        frameLayout.setVisibility(this.W2.c(4) ? 8 : 0);
        u2();
    }

    public final void P1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9) {
        int i7;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            org.telegram.ui.Components.gc.b0("NULL_ERROR");
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
            org.telegram.ui.Components.gc.d0(tL_error);
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.t0();
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = org.telegram.messenger.id.M0(2131749900, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(getContext());
        int i11 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(textView, i11, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
        textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749904, null)));
        linearLayout.addView(textView, c8.ha.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView, i11, null, mode);
        TextView textView2 = new TextView(getContext());
        org.telegram.ui.ActionBar.t6.U(textView2, i11, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749903, null)));
        if (org.telegram.messenger.id.a0) {
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
        imageView2.setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        org.telegram.ui.ActionBar.t6.s(imageView2, i11, null, mode);
        TextView textView3 = new TextView(getContext());
        org.telegram.ui.ActionBar.t6.U(textView3, i11, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749902, null)));
        if (org.telegram.messenger.id.a0) {
            linearLayout3.addView(textView3, c8.ha.o(-1, -2));
            i7 = 5;
            linearLayout3.addView(imageView2, c8.ha.r(-2, -2, 5));
        } else {
            i7 = 5;
            linearLayout3.addView(imageView2, c8.ha.o(-2, -2));
            linearLayout3.addView(textView3, c8.ha.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131749899, null), new a3.l(this, 23));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        } else {
            TextView textView4 = new TextView(getContext());
            org.telegram.ui.ActionBar.t6.U(textView4, i11, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.k5.m(textView4, (org.telegram.messenger.id.a0 ? i7 : 3) | 48, null, 2131749901);
            linearLayout.addView(textView4, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747831, null), null);
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
    public final void Q1() {
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
        org.telegram.ui.Wallet.h5 h5Var = this.b3;
        if (h5Var == null) {
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.f2) h5Var.c).currentAccount;
        if (!org.telegram.ui.Wallet.d8.F(i7, h5Var.a.slug)) {
            org.telegram.ui.Wallet.h5 h5Var2 = this.b3;
            org.telegram.ui.Wallet.d8 d8Var = h5Var2.c.j0;
            if (d8Var == null || (nftitem = h5Var2.b) == null || (str5 = nftitem.address) == null || !str5.equals(d8Var.P0)) {
                Context context = getContext();
                int i11 = this.a;
                org.telegram.ui.Components.gc k10 = k();
                org.telegram.ui.ActionBar.h6 h6Var = this.I0;
                TL_stars.TL_starGiftUnique G1 = G1();
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
                    if (G1 == null || (str4 = G1.title) == null || !lowerCase.equals(str4.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(locale))) {
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
                        spannableString.setSpan(new a5(new boolean[1], i11, context, h6Var, j3, str9, str6), 0, spannableString.length(), 33);
                        arrayList2.add(spannableString);
                        z9 = 0;
                        i12 = i13;
                    } else {
                        str3 = G1.title;
                        j10 = G1.gift_id;
                        i10 = i11;
                    }
                    str = str3;
                    j3 = j10;
                    if (str != null) {
                    }
                    String str92 = str;
                    SpannableString spannableString2 = new SpannableString(str92);
                    i11 = i10;
                    spannableString2.setSpan(new a5(new boolean[1], i11, context, h6Var, j3, str92, str6), 0, spannableString2.length(), 33);
                    arrayList2.add(spannableString2);
                    z9 = 0;
                    i12 = i13;
                }
                int i16 = z9;
                if (arrayList2.size() == 1) {
                    Object[] objArr = new Object[1];
                    objArr[i16] = arrayList2.get(i16);
                    V = org.telegram.messenger.id.V(null, null, 2131743107, objArr);
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
                    V = org.telegram.messenger.id.V(null, null, 2131743108, spannableStringBuilder, jg.g.i(1, arrayList2));
                }
                org.telegram.ui.Components.bc M = k10.M(context.getResources().getDrawable(R.drawable.filled_card_color_28).mutate(), V);
                org.telegram.ui.Components.fb fbVar = M.e;
                if (fbVar instanceof org.telegram.ui.Components.jb) {
                    TextView textView = ((org.telegram.ui.Components.jb) fbVar).b;
                    textView.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                    textView.setEllipsize(null);
                }
                M.j();
                return;
            }
        }
        org.telegram.ui.Wallet.h5 h5Var3 = this.b3;
        dismiss();
        Objects.requireNonNull(h5Var3);
        org.telegram.messenger.g0.i3(new a3.f(h5Var3, 21), 250L);
    }

    public final void R1() {
        if (p10.i(this.a).q() && (L1(this.a, G1()) || this.T2)) {
            t2(false);
            return;
        }
        TL_stars.TL_starGiftUnique G1 = G1();
        if (G1 == null) {
            return;
        }
        TLRPC.Peer peer = G1.owner_id;
        if (peer == null) {
            peer = G1.host_id;
        }
        long o4 = org.telegram.messenger.m5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(G1.title);
        sb2.append(" #");
        this.x2.setText(org.telegram.messenger.id.a0(null, null, 2131749833, jg.g.m(G1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131749835, null));
        if (!p10.i(this.a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.S2 == null) {
                this.S2 = new wp(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.S2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        fi.d dVar = this.f2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new y1(this, 4));
        this.a2.setWearPreview(qp.s1(this.a).e2(o4));
        s2(2, true, null);
    }

    public final void S1(boolean z9) {
        int i7;
        ij ijVar = this.C2;
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
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                i7 = savedStarGift.can_craft_at;
            }
            i7 = 0;
        }
        int i11 = 1;
        if (i7 > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
            String M0 = org.telegram.messenger.id.M0(2131749777, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131749778, org.telegram.messenger.id.x(i7, true));
            jg.g.C(null, 2131747831, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique G1 = G1();
        if (G1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(G1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getContext(), this.I0);
            String M02 = org.telegram.messenger.id.M0(2131749792, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
            u1Var2.R = M02;
            u1Var2.T = org.telegram.messenger.id.M0(2131749793, null);
            jg.g.C(null, 2131747831, alertDialog$Builder2, null);
            return;
        }
        e7 e7Var = this.a2;
        if (z9) {
            e7Var.M.a(this.a, G1.gift_id, G1.getDocument(), G1.title);
            if (n1()) {
                d6 d6Var = e7Var.M;
                TL_stars.TL_starGiftUnique G12 = G1();
                if (G12 == null) {
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
                            b6Var.a(G12, true);
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
        if (this.R2 == null) {
            zh.k3 k3Var = new zh.k3(this.a, G1.gift_id);
            this.R2 = k3Var;
            k3Var.a();
        }
        d6Var3.setOnAddGift(new p4(this, G1, i11));
        d6Var3.setOnClose(new z1(this, 23));
        s2(4, true, null);
    }

    public final void T1(long j3) {
        fi.m3 m3Var = this.t3;
        if (m3Var != null) {
            m3Var.f(true);
            this.t3 = null;
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

    public final void U1(boolean z9, vf.b bVar, Runnable runnable) {
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        int i7 = z9 ? 3 : 2;
        ab.j jVar = new ab.j(this, twoStepVerificationActivity, z9, 1);
        twoStepVerificationActivity.Z = i7;
        twoStepVerificationActivity.b0 = jVar;
        twoStepVerificationActivity.a0 = y1();
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
    public final void V1() {
        int i7;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i10;
        org.telegram.ui.Components.ia iaVar;
        pg0 pg0Var;
        int i11;
        TLRPC.Message message2;
        TLRPC.Message message3;
        fi.m3 m3Var = this.t3;
        if (m3Var != null) {
            m3Var.f(true);
            this.t3 = null;
        }
        ij ijVar = this.C2;
        if (ijVar != null && (message3 = ijVar.k) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i7 <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                    Context context = getContext();
                    ij ijVar2 = this.C2;
                    if (ijVar2 != null && (message2 = ijVar2.k) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i11 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            q2(i11 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.A2;
                    i11 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    q2(i11 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                    return;
                }
                TL_stars.SavedStarGift savedStarGift2 = this.A2;
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
                        f1Var.u2 = org.telegram.messenger.id.M0(2131749914, null);
                        iaVar = f1Var.o1;
                        if (iaVar != null) {
                            iaVar.setTitle(f1Var.O0());
                        }
                        pg0Var = f1Var.W1;
                        if (pg0Var != null) {
                            pg0Var.setText(f1Var.O0());
                        }
                        int max = currentTime <= i10 ? 0 : Math.max(1, Math.round(Math.max(0, i10 - currentTime) / 86400.0f));
                        wg.f1 f1Var2 = f1VarArr[0];
                        f1Var2.C2 = true;
                        f1Var2.D2 = max;
                        f1Var2.o1(false, true);
                        wg.f1 f1Var3 = f1VarArr[0];
                        f1Var3.w2 = new u4(this, currentTime, i10, max, f1VarArr, tL_starGiftUnique2);
                        f1Var3.show();
                        return;
                    }
                }
                ij ijVar3 = this.C2;
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
                        f1Var4.u2 = org.telegram.messenger.id.M0(2131749914, null);
                        iaVar = f1Var4.o1;
                        if (iaVar != null) {
                        }
                        pg0Var = f1Var4.W1;
                        if (pg0Var != null) {
                        }
                        if (currentTime2 <= i10) {
                        }
                        wg.f1 f1Var22 = f1VarArr2[0];
                        f1Var22.C2 = true;
                        f1Var22.D2 = max;
                        f1Var22.o1(false, true);
                        wg.f1 f1Var32 = f1VarArr2[0];
                        f1Var32.w2 = new u4(this, currentTime2, i10, max, f1VarArr2, tL_starGiftUnique22);
                        f1Var32.show();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift3 = this.A2;
        i7 = savedStarGift3 != null ? savedStarGift3.can_transfer_at : 0;
        if (i7 <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W1(long j3, long j10, boolean z9, c20 c20Var) {
        String str;
        TLRPC.Chat chat;
        TL_stars.TL_starGiftUnique G1 = G1();
        if (G1 == null) {
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
        linearLayout.addView(new f6(getContext(), G1, chat), c8.ha.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, this.I0);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.g0.X2(j10 > 0 ? org.telegram.messenger.id.K("Gift2TransferPriceText", (int) j10, ',', y1(), org.telegram.messenger.m5.t(j3)) : org.telegram.messenger.id.a0(null, null, 2131749913, y1(), str)));
        linearLayout.addView(textView, c8.ha.t(-1, -2, 48, 24, 4, 24, 4));
        tx0 tx0Var = new tx0(getContext(), this.I0);
        j1(tx0Var, ea.l(G1.attributes, TL_stars.starGiftAttributeModel.class));
        j1(tx0Var, ea.l(G1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        j1(tx0Var, ea.l(G1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(G1.slug) && (G1.flags & 256) != 0) {
            org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
            long j11 = G1.value_amount;
            String str2 = G1.value_currency;
            int h = org.telegram.messenger.r1.i().h(G1.value_currency);
            i7.getClass();
            tx0Var.c(org.telegram.messenger.id.M0(2131749591, null), rf.b.i("~", org.telegram.messenger.r1.g(str2, h, j11, true)), null, null);
        }
        linearLayout.addView(tx0Var, c8.ha.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(j10 > 0 ? dd.T0(org.telegram.messenger.id.a0(null, null, 2131749920, Integer.valueOf((int) j10))) : org.telegram.messenger.id.M0(2131749921, null), new a1.c(c20Var, 12));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.X0 = z9;
        u1Var.show();
    }

    public final void X1(long j3, c20 c20Var) {
        TLRPC.Message message;
        long j10;
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            ij ijVar = this.C2;
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
        W1(j3, j10, true, c20Var);
    }

    public final void Y1() {
        TL_stars.InputSavedStarGift A1;
        long j3;
        long j10;
        long j11;
        boolean z9;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        fi.m3 m3Var = this.t3;
        if (m3Var != null) {
            m3Var.f(true);
            this.t3 = null;
        }
        if (this.X2 == null && (A1 = A1()) != null) {
            ij ijVar = this.C2;
            long j12 = this.S1;
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
                z12 = tL_messageActionStarGift.prepaid_upgrade ? org.telegram.messenger.m5.o(tL_messageActionStarGift.from_id) != this.C2.Z0() : tL_messageActionStarGift.upgrade_separate;
            } else {
                j3 = 0;
                TL_stars.SavedStarGift savedStarGift = this.A2;
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
                TL_stars.SavedStarGift savedStarGift2 = this.A2;
                str = savedStarGift2.prepaid_upgrade_hash;
                z12 = savedStarGift2.upgrade_separate;
            }
            TextView textView = this.s2;
            if (z9) {
                textView.setText(org.telegram.messenger.id.M0(z11 ? 2131750398 : 2131750399, null));
            } else if (z10) {
                textView.setText(org.telegram.messenger.id.M0(2131750396, null));
            } else {
                textView.setText(org.telegram.messenger.id.M0(2131750397, null));
            }
            boolean z13 = (z9 || j11 <= j3 || z12) ? false : true;
            wo woVar = this.r2;
            woVar.a(z13, false);
            ArrayList arrayList = this.j3;
            if (arrayList != null && (j11 > j3 || this.n3 != null)) {
                Z1();
                return;
            }
            if (arrayList == null) {
                ea.y(this.a, false).K(j10, new y3(this, 2));
            }
            if (j11 > j3 || this.n3 != null) {
                return;
            }
            this.m3 = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = woVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = A1;
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

    @Override // org.telegram.ui.Components.ma
    public final boolean Z0() {
        return false;
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
    public final void Z1() {
        long j3;
        boolean z9;
        boolean z10;
        char c10;
        int i7;
        int i10;
        String M0;
        String M02;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        ij ijVar = this.C2;
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
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift == null) {
                return;
            }
            j3 = savedStarGift.upgrade_stars;
            if (j3 <= 0) {
            }
            z9 = false;
        }
        if (this.j3 != null) {
            if (j3 > 0 || this.n3 != null) {
                long j10 = 0;
                if (this.n3 != null) {
                    for (int i11 = 0; i11 < this.n3.invoice.prices.size(); i11++) {
                        j10 += this.n3.invoice.prices.get(i11).amount;
                    }
                }
                s6 s6Var = this.K2;
                e7 e7Var = this.a2;
                if (s6Var == null) {
                    this.K2 = new s6(e7Var);
                }
                s6 s6Var2 = this.K2;
                ArrayList arrayList = this.j3;
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
                e7Var.setPreviewingAttributes(this.j3);
                long j11 = this.S1;
                if (z9) {
                    z10 = true;
                    e7Var.i(1, org.telegram.messenger.id.M0(2131750062, null), org.telegram.messenger.id.a0(null, null, 2131750063, org.telegram.messenger.m5.s(this.a, j11)), null);
                } else {
                    z10 = true;
                    e7Var.i(1, org.telegram.messenger.id.M0(2131749851, null), org.telegram.messenger.id.M0(2131749852, null), null);
                }
                fi.d dVar = this.f2;
                dVar.setFilled(z10);
                dVar.g(null, z10);
                if (j10 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                    if (this.l3 != null) {
                        for (int i16 = 0; i16 < this.l3.size(); i16++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) this.l3.get(i16);
                            if (starGiftUpgradePrice.date >= currentTime) {
                                break;
                            }
                        }
                    }
                    starGiftUpgradePrice = null;
                    ArrayList arrayList5 = this.k3;
                    FrameLayout frameLayout = this.i2;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.h2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2("**" + org.telegram.messenger.id.M0(2131749870, null) + "**", new z1(this, 3)), false, org.telegram.messenger.g0.L(0.6666667f), org.telegram.messenger.g0.L(0.66f)));
                    }
                    u2();
                    wp[] wpVarArr = this.o3;
                    if (z9) {
                        dVar.i(dd.U0(org.telegram.messenger.id.a0(null, null, 2131750067, Long.valueOf(j10)), 1.13f, wpVarArr), true, true);
                    } else {
                        dVar.i(dd.U0(org.telegram.messenger.id.a0(null, null, 2131749877, Long.valueOf(j10)), 1.13f, wpVarArr), true, true);
                    }
                } else {
                    dVar.i(org.telegram.messenger.id.M0(2131751817, null), true, true);
                }
                dVar.setOnClickListener(new y1(this, 6));
                View view = this.p2;
                LinearLayout linearLayout = this.q2;
                if (z9) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    c10 = 0;
                } else {
                    c10 = 0;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                }
                hi.i[] iVarArr = this.o2;
                if (z9) {
                    hi.i iVar = iVarArr[c10];
                    String M03 = org.telegram.messenger.id.M0(2131749865, null);
                    if (z9) {
                        char c11 = c10;
                        i10 = 1;
                        i7 = 2;
                        Object[] objArr = new Object[1];
                        objArr[c11] = org.telegram.messenger.m5.s(this.a, j11);
                        M0 = org.telegram.messenger.id.a0(null, null, 2131750066, objArr);
                    } else {
                        i10 = 1;
                        i7 = 2;
                        M0 = org.telegram.messenger.id.M0(2131749867, null);
                    }
                    iVar.a(R.drawable.menu_feature_unique, M03, M0);
                    hi.i iVar2 = iVarArr[i10];
                    String M04 = org.telegram.messenger.id.M0(2131749862, null);
                    if (z9) {
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = org.telegram.messenger.m5.s(this.a, j11);
                        M02 = org.telegram.messenger.id.a0(null, null, 2131750065, objArr2);
                    } else {
                        M02 = org.telegram.messenger.id.M0(2131749864, null);
                    }
                    iVar2.a(R.drawable.menu_feature_transfer, M04, M02);
                    iVarArr[i7].a(R.drawable.menu_feature_tradable, org.telegram.messenger.id.M0(2131749859, null), z9 ? org.telegram.messenger.id.a0(null, null, 2131750064, org.telegram.messenger.m5.s(this.a, j11)) : org.telegram.messenger.id.M0(2131749861, null));
                } else {
                    i7 = 2;
                    iVarArr[c10].a(R.drawable.menu_feature_unique, org.telegram.messenger.id.M0(2131749865, null), org.telegram.messenger.id.M0(2131749575, null));
                    iVarArr[1].a(R.drawable.menu_feature_tradable, org.telegram.messenger.id.M0(2131749859, null), org.telegram.messenger.id.M0(2131749573, null));
                    iVarArr[2].a(R.drawable.menu_wear, org.telegram.messenger.id.M0(2131749570, null), org.telegram.messenger.id.M0(2131749571, null));
                }
                org.telegram.messenger.g0.h3(new a2(this, j10, i7));
            }
        }
    }

    public final void a2() {
        TL_stars.TL_starGiftUnique G1 = G1();
        if (this.a3 == null || G1 == null || TextUtils.isEmpty(G1.slug)) {
            return;
        }
        Context context = getContext();
        int i7 = this.a;
        int i10 = 1;
        wg.f1[] f1VarArr = {new wg.f1(context, i7, org.telegram.messenger.v1.a(i7).b(), 3, this.I0)};
        wg.f1 f1Var = f1VarArr[0];
        f1Var.u2 = org.telegram.messenger.id.M0(2131749914, null);
        org.telegram.ui.Components.ia iaVar = f1Var.o1;
        if (iaVar != null) {
            iaVar.setTitle(f1Var.O0());
        }
        pg0 pg0Var = f1Var.W1;
        if (pg0Var != null) {
            pg0Var.setText(f1Var.O0());
        }
        wg.f1 f1Var2 = f1VarArr[0];
        f1Var2.B2 = true;
        f1Var2.o1(false, true);
        wg.f1 f1Var3 = f1VarArr[0];
        f1Var3.w2 = new ai.f1(i10, this, f1VarArr);
        f1Var3.show();
    }

    public final SpannableStringBuilder c2(TLRPC.Peer peer) {
        if (peer != null) {
            String r10 = org.telegram.messenger.m5.r(qp.s1(this.a).e2(org.telegram.messenger.m5.o(peer)));
            if (!TextUtils.isEmpty(r10)) {
                return org.telegram.messenger.g0.U2(org.telegram.messenger.id.a0(null, null, 2131750043, rf.b.i("@", r10)), new b4(this, r10, 8));
            }
        }
        return null;
    }

    public final SpannableStringBuilder d2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return c2(starGift.released_by);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.G3) {
            if (this.B2 == ((v9) objArr[1])) {
                d6 d6Var = this.a2.M;
                if (d6Var == null || !d6Var.h0) {
                    v2();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        if (this.W2.c(4) && this.a2.M.h0) {
            return;
        }
        zh.k3 k3Var = this.R2;
        if (k3Var != null) {
            k3Var.b();
            this.R2 = null;
        }
        s6 s6Var = this.K2;
        if (s6Var != null) {
            s6Var.a();
        }
        super.dismiss();
    }

    public final void g2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, w9 w9Var) {
        s6 s6Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.D2 = str;
        this.E2 = tL_starGiftUnique;
        this.B2 = w9Var;
        this.F2 = (tL_starGiftUnique.resell_amount == null || J1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.L2 && (s6Var = this.K2) != null && s6Var.o && (tL_starGiftUnique2 = s6Var.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            s6Var.a();
            this.K2 = null;
            e7 e7Var = this.a2;
            e7Var.b.setAlpha(1.0f);
            e7Var.c.setAlpha(0.0f);
        }
        this.Z1.b(this.a, this.A2);
        j2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z9 = tL_starGiftUnique.host_id != null;
        TL_wallet.walletTransaction wallettransaction = this.d3;
        w70 w70Var = this.c2;
        if (wallettransaction != null || !z9 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            w70Var.setVisibility(8);
        } else {
            w70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750181, null), new b4(this, str3, 3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            w70Var.setVisibility(0);
            org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.q5, this.I0);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.d3;
        w70 w70Var2 = this.e2;
        if (wallettransaction2 != null || z9 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            w70Var2.setVisibility(8);
        } else {
            w70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750181, null), new b4(this, str3, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            w70Var2.setVisibility(0);
        }
        w2();
        if (this.F2) {
            k2(tL_starGiftUnique);
            this.f2.setOnClickListener(new y1(this, 12));
        }
        if (this.Z2) {
            s2(0, false, null);
            this.m1.n0(1);
            this.Z2 = false;
        }
        v2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:322:0x0367, code lost:
    
        if (K1(r58.a, org.telegram.messenger.m5.o(r8)) != false) goto L167;
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
        r7 = org.telegram.messenger.id.a0(null, null, 2131750165, r34);
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
    
        r7 = org.telegram.messenger.id.a0(null, null, 2131750143, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x03eb, code lost:
    
        if (r24 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x03ed, code lost:
    
        r7 = "Gift2InfoOutConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x03f2, code lost:
    
        r7 = org.telegram.messenger.id.K(r7, (int) r9, ',', r34);
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
    
        r7 = org.telegram.messenger.id.H(',', r7, (int) r9);
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
    /* JADX WARN: Type inference failed for: r14v30, types: [org.telegram.ui.Components.ic[], org.telegram.ui.Components.sx0[], org.telegram.ui.Components.wp[]] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h2(ij ijVar, w9 w9Var) {
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
        TL_stars.InputSavedStarGift A1;
        if (ijVar == null || ijVar.k == null) {
            return;
        }
        this.z2 = false;
        this.A2 = null;
        this.C2 = ijVar;
        this.B2 = w9Var;
        this.Z1.set(ijVar);
        long e10 = p10.i(this.a).e();
        boolean z24 = ij.B0(ijVar.k) == e10;
        TLRPC.MessageAction messageAction = ijVar.k.action;
        boolean z25 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        int i14 = 3;
        e7 e7Var = this.a2;
        fi.d dVar3 = this.f2;
        if (z25 || (((z22 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
            if (!this.L2 && (s6Var = this.K2) != null && s6Var.o && s6Var.l != null) {
                s6Var.a();
                this.K2 = null;
                e7Var.b.setVisibility(0);
                e7Var.c.setVisibility(4);
            }
            boolean P3 = z24 ? false : ijVar.P3();
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
            long j13 = this.S1;
            String t6 = org.telegram.messenger.m5.t(j13);
            z15 = z24;
            boolean z33 = P3;
            boolean t10 = t10.t(qp.s1(this.a).a2(Long.valueOf(j13)));
            boolean z34 = peer != null && org.telegram.messenger.m5.o(peer) < 0;
            boolean L1 = L1(this.a, G1());
            B1();
            e7Var.f(starGift, false, false, L1);
            e7Var.setShowOptions(o1());
            CharSequence charSequence4 = "";
            int i16 = 2;
            if (z15) {
                if (i7 == 0 || starGift.title == null) {
                    z16 = z10;
                    str5 = null;
                    M03 = org.telegram.messenger.id.M0(2131749940, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    z16 = z10;
                    sb2.append(starGift.title);
                    sb2.append(" #");
                    M03 = jg.g.m(i7, ',', sb2);
                    str5 = null;
                }
                this.Q2 = M03;
                if (z16) {
                    X2 = str5;
                } else {
                    if (z11) {
                        charSequence3 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749997, str5));
                    } else if (j10 > 0) {
                        charSequence3 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.H(',', z12 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j10));
                    } else {
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131750004, null));
                    }
                    X2 = charSequence3;
                }
                e7Var.i(0, M03, X2, d2(starGift));
            } else {
                z16 = z10;
                if (z34 && !this.z2) {
                    e7Var.i(0, org.telegram.messenger.id.M0(2131749942, null), null, d2(starGift));
                } else if ((z33 || z11) && j11 > 0) {
                    String M05 = org.telegram.messenger.id.M0(z33 ? 2131749937 : 2131749941, null);
                    this.Q2 = M05;
                    e7Var.i(0, M05, z16 ? null : !z33 ? org.telegram.messenger.id.M0(2131750148, null) : org.telegram.messenger.id.a0(null, null, 2131750149, t6), d2(starGift));
                } else {
                    if (i7 == 0 || starGift.title == null) {
                        M0 = org.telegram.messenger.id.M0(z33 ? 2131749937 : 2131749941, null);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift.title);
                        sb3.append(" #");
                        M0 = jg.g.m(i7, ',', sb3);
                    }
                    this.Q2 = M0;
                    if (z16) {
                        dVar = dVar3;
                        z17 = z11;
                        concat = null;
                        i10 = 0;
                    } else {
                        if (!t10 && A1() != null) {
                            ij ijVar2 = this.C2;
                            if (ijVar2 != null) {
                                TLRPC.MessageAction messageAction3 = ijVar2.k.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z35 = tL_messageActionStarGift2.peer != null;
                                    ijVar2.P3();
                                    ij.B0(this.C2.k);
                                    p10.i(this.a).e();
                                    boolean z36 = z35;
                                    int currentTime = qp.s1(this.a).E6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.C2.k.date);
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
                                        str3 = org.telegram.messenger.id.a0(null, null, (!z17 || j11 <= 0) ? 2131750166 : 2131750165, t6);
                                    } else {
                                        str2 = null;
                                        str3 = org.telegram.messenger.id.M0(!z9 ? z34 ? 2131750173 : 2131750178 : z34 ? 2131750172 : 2131750177, null);
                                    }
                                }
                            } else {
                                dVar = dVar3;
                                z17 = z11;
                                TL_stars.SavedStarGift savedStarGift = this.A2;
                                if (savedStarGift != null) {
                                    int currentTime2 = qp.s1(this.a).E6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                                    if (K1(this.a, j13)) {
                                        int i17 = this.A2.flags;
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
                            if (t10 && m1()) {
                                c10 = 1;
                                charSequence = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750110, str2).replace(' ', (char) 160), new z1(this, 10)), true);
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
                    e7Var.i(i10, M0, concat, d2(starGift));
                    tx0Var = this.d2;
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
                        this.d2.m(org.telegram.messenger.id.M0(2131749936, null), this.a, o10, new a2(this, o10, i18), null, z34 ? null : new a2(this, o10, 8));
                    } else {
                        if (o4 != j3 || z14 || z34) {
                            this.d2.m(org.telegram.messenger.id.M0(2131750193, null), this.a, o4, new a2(this, o4, 9), (o4 == j3 || o4 == 2666000 || t10.x(a22) || t10 || z34) ? null : org.telegram.messenger.id.M0(2131750284, null), z34 ? null : new a2(this, o4, 10));
                        }
                        if (j13 != j3 || z34) {
                            this.d2.m(org.telegram.messenger.id.M0(2131749936, null), this.a, j13, new a2(this, j13, 11), null, z34 ? null : new a2(this, j13, 12));
                        }
                    }
                    tx0Var.g(i15, org.telegram.messenger.id.M0(2131744960, null));
                    if (starGift.stars > 0) {
                        String M06 = org.telegram.messenger.id.M0(2131749847, null);
                        String m10 = jg.g.m(starGift.stars + j11, ',', new StringBuilder("⭐️ "));
                        if (!m1() || z16) {
                            r14 = 0;
                        } else {
                            r14 = 0;
                            charSequence4 = org.telegram.ui.Components.jc.b(org.telegram.messenger.id.H(',', "Gift2ButtonSell", (int) j10), new z1(this, 7), this.I0, null);
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
                        if (this.Y2 == null) {
                            dVar2 = dVar;
                            i13 = 0;
                            this.Y2 = new wp(0, new f7(dVar2, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.I0)));
                        } else {
                            dVar2 = dVar;
                            i13 = 0;
                        }
                        spannableStringBuilder.setSpan(this.Y2, i13, 1, 33);
                        if (j11 > 0) {
                            charSequence2 = null;
                            M02 = org.telegram.messenger.id.M0(2131749875, null);
                        } else {
                            charSequence2 = null;
                            M02 = org.telegram.messenger.id.M0(2131749874, null);
                        }
                        spannableStringBuilder.append((CharSequence) M02);
                        dVar2.setFilled(true);
                        dVar2.i(spannableStringBuilder, !this.Z2, true);
                        dVar2.g(charSequence2, !this.Z2);
                        dVar2.setOnClickListener(new y1(this, 16));
                    } else {
                        dVar2 = dVar;
                        if (this.m2 || this.U1 == null || this.B2 == null || C1() < 0 || this.B2.b(C1()) < 0) {
                            if ((starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                                z18 = true;
                                str4 = null;
                                dVar2.setFilled(true);
                                dVar2.i(org.telegram.messenger.id.M0(2131747831, null), !this.Z2, true);
                                dVar2.g(null, !this.Z2);
                                dVar2.setOnClickListener(new y1(this, 14));
                            } else {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                                if (this.Y2 == null) {
                                    i12 = 0;
                                    this.Y2 = new wp(0, new f7(dVar2, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.I0)));
                                } else {
                                    i12 = 0;
                                }
                                z18 = true;
                                spannableStringBuilder2.setSpan(this.Y2, i12, 1, 33);
                                str4 = null;
                                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131750191, null));
                                dVar2.setFilled(true);
                                dVar2.i(spannableStringBuilder2, !this.Z2, true);
                                dVar2.g(null, !this.Z2);
                                dVar2.setOnClickListener(new y1(this, 13));
                            }
                            z20 = z9;
                            z21 = z33;
                        } else {
                            dVar2.setFilled(false);
                            int b10 = this.B2.b(C1());
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) org.telegram.messenger.id.M0(2131749855, null));
                            Object obj = this.B2.get(b10);
                            if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                                z19 = true;
                            } else {
                                spannableStringBuilder3.append((CharSequence) " e");
                                z19 = true;
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.q5(document, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                            }
                            dVar2.i(spannableStringBuilder3, this.Z2 ^ z19, z19);
                            dVar2.g(null, this.Z2 ^ z19);
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
            tx0Var = this.d2;
            tx0Var.removeAllViews();
            if (peer2 == null) {
            }
            if (peer == null) {
            }
            TLRPC.User a222 = qp.s1(this.a).a2(Long.valueOf(o4));
            int i182 = 7;
            if (peer3 == null) {
            }
            tx0Var.g(i15, org.telegram.messenger.id.M0(2131744960, null));
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
            if (this.m2) {
            }
            if (starGift instanceof TL_stars.TL_starGift) {
            }
            z18 = true;
            str4 = null;
            dVar2.setFilled(true);
            dVar2.i(org.telegram.messenger.id.M0(2131747831, null), !this.Z2, true);
            dVar2.g(null, !this.Z2);
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
            j2(tL_starGiftUnique2, z37, e22, tL_messageActionStarGiftUnique2.message);
            z20 = tL_messageActionStarGiftUnique2.saved;
            starGift = tL_messageActionStarGiftUnique2.gift;
            boolean z38 = (tL_messageActionStarGiftUnique2.upgrade ^ true) == ijVar.P3();
            if (ij.B0(ijVar.k) == e10) {
                z38 = false;
            }
            if (!this.I2 && !this.J2 && this.C2 != null && (A1 = A1()) != null) {
                this.I2 = true;
                ea.y(this.a, false).M(A1, new y3(this, i14));
            }
            if (this.L2 || (s6Var2 = this.K2) == null || !s6Var2.o || (tL_starGiftUnique = s6Var2.l) == null) {
                z23 = z38;
            } else {
                z23 = z38;
                if (starGift == null || tL_starGiftUnique.id != starGift.id) {
                    s6Var2.a();
                    this.K2 = null;
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
        if (this.g3) {
            dVar2.setFilled(z18);
            dVar2.i(org.telegram.messenger.id.M0(2131749794, str4), false, z18);
            dVar2.setOnClickListener(new y1(this, 15));
        }
        String str6 = starGift == null ? null : starGift.owner_address;
        String str7 = starGift == null ? null : starGift.gift_address;
        boolean z39 = (starGift == null || starGift.host_id == null) ? false : true;
        w70 w70Var = this.c2;
        if (z16) {
            w70Var.setVisibility(0);
            w70Var.setText(org.telegram.messenger.id.M0(2131750045, null));
            org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.q7, this.I0);
        } else if (z39 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
            w70Var.setVisibility(0);
            w70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750181, null), new b4(this, str7, 5)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.q5, this.I0);
        } else if (TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && z13 && !z15) {
            w70Var.setVisibility(0);
            if (z21) {
                M04 = org.telegram.messenger.id.a0(null, null, (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? 2131750088 : 2131750087, org.telegram.messenger.m5.t(ij.B0(ijVar.k)));
            } else {
                M04 = org.telegram.messenger.id.M0((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? 2131750180 : 2131750179, null);
            }
            w70Var.setText(M04);
            org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.q5, this.I0);
        } else {
            w70Var.setVisibility(8);
        }
        int i19 = 6;
        w70 w70Var2 = this.e2;
        if (!z39 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
            w70Var2.setVisibility(0);
            w70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750181, null), new b4(this, str7, i19)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
        } else if (z12 || z16 || starGift == null || !J1(this.a, w1()) || peer3 != null) {
            w70Var2.setVisibility(8);
        } else {
            w70Var2.setVisibility(0);
            if (w1() >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (!z20) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new wp(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(z20 ? 2131750055 : 2131750058, null), new z1(this, i19)));
                w70Var2.setText(org.telegram.messenger.g0.I2(spannableStringBuilder4, true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            } else {
                w70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(z20 ? 2131750253 : 2131750254, null), new z1(this, i19)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            }
        }
        if (this.Z2) {
            s2(0, false, null);
            this.m1.n0(1);
            this.Z2 = false;
        }
        this.o1.setTitle(this.Q2);
        v2();
    }

    public final void i1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        char c10;
        s6 s6Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        k7 k7Var;
        ai.d0 d0Var;
        int i7 = 0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = org.telegram.messenger.id.M0(2131750387, null);
            c10 = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = org.telegram.messenger.id.M0(2131750380, null);
            c10 = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            M0 = org.telegram.messenger.id.M0(2131750388, null);
            c10 = 0;
        }
        if (!this.L2 && ((s6Var = this.K2) == null || !s6Var.o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.ic[] icVarArr = new org.telegram.ui.Components.ic[1];
            Integer[] numArr = new Integer[1];
            String F1 = F1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                k7Var = this;
                d0Var = new ai.d0(this, zArr, starGiftAttribute2, icVarArr, 5);
            } else {
                starGiftAttribute2 = starGiftAttribute;
                k7Var = this;
                d0Var = null;
            }
            icVarArr[0] = (org.telegram.ui.Components.ic) ((qx0) k7Var.d2.e(M0, starGiftAttribute2.name, F1, d0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        x6 x6Var = new x6(getContext(), this.I0, new h2(this, i7));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        tx0 tx0Var = this.d2;
        tableRow.addView(new sx0(tx0Var, M0), layoutParams);
        tableRow.addView(new qx0(tx0Var, x6Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        tx0Var.addView(tableRow);
        s6 s6Var2 = this.K2;
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
    /* JADX WARN: Type inference failed for: r13v27, types: [org.telegram.ui.Components.ic[], org.telegram.ui.Components.sx0[], org.telegram.ui.Components.wp[]] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i2(TL_stars.SavedStarGift savedStarGift, w9 w9Var) {
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
        long j10 = this.S1;
        this.z2 = J1(i14, j10);
        this.A2 = savedStarGift;
        this.B2 = w9Var;
        this.C2 = null;
        boolean z12 = this.L2;
        e7 e7Var = this.a2;
        if (!z12 && (s6Var = this.K2) != null && s6Var.o && s6Var.l != null) {
            s6Var.a();
            this.K2 = null;
            e7Var.b.setVisibility(0);
            e7Var.c.setVisibility(4);
        }
        this.Z1.b(this.a, savedStarGift);
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
            j2((TL_stars.TL_starGiftUnique) starGift5, z14, !savedStarGift.name_hidden ? qp.s1(this.a).e2(org.telegram.messenger.m5.o(savedStarGift.from_id)) : null, savedStarGift.message);
            i7 = i15;
        } else {
            boolean z15 = this.z2 && e10 == o4 && i15 >= 0;
            boolean L1 = L1(this.a, G1());
            B1();
            e7Var.f(starGift5, false, false, L1);
            e7Var.setShowOptions(o1());
            tx0 tx0Var = this.d2;
            tx0Var.removeAllViews();
            CharSequence charSequence5 = "";
            if (z15) {
                if (savedStarGift.gift_num == 0 || (starGift4 = savedStarGift.gift) == null || starGift4.title == null) {
                    j3 = e10;
                    str4 = null;
                    M03 = org.telegram.messenger.id.M0(2131749940, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j3 = e10;
                    M03 = jg.g.m(savedStarGift.gift_num, ',', sb2);
                    str4 = null;
                }
                this.Q2 = M03;
                if (z14) {
                    X2 = str4;
                } else {
                    if (savedStarGift.can_upgrade) {
                        charSequence4 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749997, str4));
                    } else {
                        long j11 = savedStarGift.convert_stars;
                        if (j11 > 0) {
                            charSequence4 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.H(',', "Gift2SelfInfoConvert", (int) j11));
                        } else {
                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131750004, null));
                        }
                    }
                    X2 = charSequence4;
                }
                e7Var.i(0, M03, X2, d2(savedStarGift.gift));
            } else {
                j3 = e10;
                if (!z13 || this.z2) {
                    boolean z16 = this.z2;
                    if (!z16 || savedStarGift.can_upgrade) {
                        i7 = i15;
                        if (savedStarGift.upgrade_stars > 0) {
                            String M04 = org.telegram.messenger.id.M0(z16 ? 2131749941 : 2131749942, null);
                            this.Q2 = M04;
                            e7Var.i(0, M04, z14 ? null : this.z2 ? org.telegram.messenger.id.M0(2131750148, null) : null, d2(savedStarGift.gift));
                            if (j3 == o4 || z13) {
                                this.d2.m(org.telegram.messenger.id.M0(2131750193, null), this.a, o4, new a2(this, o4, 4), (o4 != j3 || o4 == 2666000 || t10 || t10.x(qp.s1(this.a).a2(Long.valueOf(o4))) || z13) ? null : org.telegram.messenger.id.M0(2131750284, null), new a2(this, o4, 5));
                            }
                            tx0Var.c(org.telegram.messenger.id.M0(2131744960, null), org.telegram.messenger.id.a0(null, null, 2131742783, org.telegram.messenger.id.E0().s0().format(new Date(savedStarGift.date * 1000)), org.telegram.messenger.id.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
                            String M05 = org.telegram.messenger.id.M0(2131749847, null);
                            String m10 = jg.g.m(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
                            if (m1() || z14) {
                                r13 = 0;
                            } else {
                                r13 = 0;
                                charSequence5 = org.telegram.ui.Components.jc.b(org.telegram.messenger.id.H(',', "Gift2ButtonSell", (int) savedStarGift.convert_stars), new z1(this, 7), this.I0, null);
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
                            z10 = this.z2;
                            dVar = this.f2;
                            if (!z10 && savedStarGift.can_upgrade) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                                if (this.Y2 == null) {
                                    i13 = 0;
                                    this.Y2 = new wp(0, new f7(dVar, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.I0)));
                                } else {
                                    i13 = 0;
                                }
                                spannableStringBuilder.setSpan(this.Y2, i13, 1, 33);
                                if (savedStarGift.upgrade_stars > 0) {
                                    charSequence3 = null;
                                    M02 = org.telegram.messenger.id.M0(2131749875, null);
                                } else {
                                    charSequence3 = null;
                                    M02 = org.telegram.messenger.id.M0(2131749874, null);
                                }
                                spannableStringBuilder.append((CharSequence) M02);
                                dVar.setFilled(true);
                                dVar.i(spannableStringBuilder, !this.Z2, true);
                                dVar.g(charSequence3, !this.Z2);
                                dVar.setOnClickListener(new y1(this, 8));
                            } else if (!this.m2 && z10 && this.U1 != null && this.B2 != null && C1() >= 0 && this.B2.b(C1()) >= 0) {
                                dVar.setFilled(false);
                                int b10 = this.B2.b(C1());
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131749855, null));
                                Object obj = this.B2.get(b10);
                                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                                    r12 = 1;
                                } else {
                                    spannableStringBuilder2.append((CharSequence) " e");
                                    r12 = 1;
                                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.q5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                                }
                                dVar.i(spannableStringBuilder2, (this.Z2 ? 1 : 0) ^ r12, r12);
                                dVar.g(null, (this.Z2 ? 1 : 0) ^ r12);
                                dVar.setOnClickListener(new u2(this, b10, r12));
                            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                                dVar.setFilled(true);
                                dVar.i(org.telegram.messenger.id.M0(2131747831, null), !this.Z2, true);
                                dVar.g(null, !this.Z2);
                                dVar.setOnClickListener(new y1(this, 11));
                            } else {
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                                if (this.Y2 == null) {
                                    i12 = 0;
                                    this.Y2 = new wp(0, new f7(dVar, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.I0)));
                                } else {
                                    i12 = 0;
                                }
                                spannableStringBuilder3.setSpan(this.Y2, i12, 1, 33);
                                spannableStringBuilder3.append((CharSequence) org.telegram.messenger.id.M0(2131750191, null));
                                dVar.setFilled(true);
                                dVar.i(spannableStringBuilder3, !this.Z2, true);
                                dVar.g(null, !this.Z2);
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
                        M0 = org.telegram.messenger.id.M0(z16 ? 2131749941 : 2131749942, null);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(savedStarGift.gift.title);
                        sb3.append(" #");
                        M0 = jg.g.m(savedStarGift.gift_num, ',', sb3);
                    }
                    this.Q2 = M0;
                    if (z14 || !this.z2) {
                        i10 = 0;
                        charSequence = null;
                    } else {
                        if (!t10 && m1()) {
                            if (this.z2) {
                                a02 = org.telegram.messenger.id.H(',', currentTime <= 0 ? z13 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z13 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                a02 = org.telegram.messenger.id.K("Gift2Info2Out", (int) savedStarGift.convert_stars, ',', t6);
                            }
                            str = null;
                        } else if (this.z2) {
                            if (savedStarGift.unsaved) {
                                i11 = z13 ? 2131750173 : 2131750178;
                                str = null;
                            } else {
                                str = null;
                                i11 = z13 ? 2131750172 : 2131750177;
                            }
                            a02 = org.telegram.messenger.id.M0(i11, str);
                        } else {
                            str = null;
                            a02 = org.telegram.messenger.id.a0(null, null, (!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? 2131750166 : 2131750165, t6);
                        }
                        SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(a02);
                        if (t10 || !m1()) {
                            z9 = true;
                            charSequence2 = "";
                        } else {
                            z9 = true;
                            charSequence2 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750110, str).replace(' ', (char) 160), new z1(this, 5)), true);
                        }
                        boolean z17 = z9;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        i10 = 0;
                        charSequenceArr[0] = X22;
                        charSequenceArr[z17 ? 1 : 0] = " ";
                        charSequenceArr[2] = charSequence2;
                        charSequence = TextUtils.concat(charSequenceArr);
                    }
                    e7Var.i(i10, M0, charSequence, d2(savedStarGift.gift));
                    if (j3 == o4) {
                    }
                    this.d2.m(org.telegram.messenger.id.M0(2131750193, null), this.a, o4, new a2(this, o4, 4), (o4 != j3 || o4 == 2666000 || t10 || t10.x(qp.s1(this.a).a2(Long.valueOf(o4))) || z13) ? null : org.telegram.messenger.id.M0(2131750284, null), new a2(this, o4, 5));
                    tx0Var.c(org.telegram.messenger.id.M0(2131744960, null), org.telegram.messenger.id.a0(null, null, 2131742783, org.telegram.messenger.id.E0().s0().format(new Date(savedStarGift.date * 1000)), org.telegram.messenger.id.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
                    String M052 = org.telegram.messenger.id.M0(2131749847, null);
                    String m102 = jg.g.m(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
                    if (m1()) {
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
                    z10 = this.z2;
                    dVar = this.f2;
                    if (!z10) {
                    }
                    if (!this.m2) {
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
                    }
                    dVar.setFilled(true);
                    dVar.i(org.telegram.messenger.id.M0(2131747831, null), !this.Z2, true);
                    dVar.g(null, !this.Z2);
                    dVar.setOnClickListener(new y1(this, 11));
                    str2 = null;
                    str3 = null;
                    z11 = false;
                } else {
                    String M06 = org.telegram.messenger.id.M0(2131749942, null);
                    this.Q2 = M06;
                    e7Var.i(0, M06, null, c2(savedStarGift.gift.released_by));
                }
            }
            i7 = i15;
            if (j3 == o4) {
            }
            this.d2.m(org.telegram.messenger.id.M0(2131750193, null), this.a, o4, new a2(this, o4, 4), (o4 != j3 || o4 == 2666000 || t10 || t10.x(qp.s1(this.a).a2(Long.valueOf(o4))) || z13) ? null : org.telegram.messenger.id.M0(2131750284, null), new a2(this, o4, 5));
            tx0Var.c(org.telegram.messenger.id.M0(2131744960, null), org.telegram.messenger.id.a0(null, null, 2131742783, org.telegram.messenger.id.E0().s0().format(new Date(savedStarGift.date * 1000)), org.telegram.messenger.id.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
            String M0522 = org.telegram.messenger.id.M0(2131749847, null);
            String m1022 = jg.g.m(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (m1()) {
            }
            r13 = 0;
            tx0Var.c(M0522, dd.a1(false, TextUtils.concat(m1022, " ", charSequence5), 0.8f, r13), r13, r13);
            starGift2 = savedStarGift.gift;
            if (starGift2.limited) {
            }
            tL_textWithEntities = savedStarGift.message;
            if (tL_textWithEntities != null) {
            }
            z10 = this.z2;
            dVar = this.f2;
            if (!z10) {
            }
            if (!this.m2) {
            }
            if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
            }
            dVar.setFilled(true);
            dVar.i(org.telegram.messenger.id.M0(2131747831, null), !this.Z2, true);
            dVar.g(null, !this.Z2);
            dVar.setOnClickListener(new y1(this, 11));
            str2 = null;
            str3 = null;
            z11 = false;
        }
        boolean z18 = savedStarGift.refunded;
        w70 w70Var = this.c2;
        if (z18) {
            w70Var.setVisibility(0);
            w70Var.setText(org.telegram.messenger.id.M0(2131750045, null));
            org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.q7, this.I0);
        } else if (z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            w70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750181, null), new b4(this, str3, 1)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            w70Var.setVisibility(0);
            org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.q5, this.I0);
        } else if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && this.z2 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            w70Var.setVisibility(0);
            w70Var.setText(org.telegram.messenger.id.M0((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? 2131750180 : 2131750179, null));
            org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.q5, this.I0);
        } else {
            w70Var.setVisibility(8);
        }
        w70 w70Var2 = this.e2;
        if (!z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            w70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750181, null), new b4(this, str3, 2)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            r14 = 0;
            w70Var2.setVisibility(0);
        } else if (this.z2 && J1(this.a, j10)) {
            int i16 = 6;
            if (i7 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new wp(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(!savedStarGift.unsaved ? 2131750055 : 2131750058, null), new z1(this, i16)));
                w70Var2.setText(org.telegram.messenger.g0.I2(spannableStringBuilder4, true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            } else {
                w70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(!savedStarGift.unsaved ? 2131750253 : 2131750254, null), new z1(this, i16)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            }
            r14 = 0;
            w70Var2.setVisibility(0);
        } else {
            r14 = 0;
            w70Var2.setVisibility(8);
        }
        if (this.Z2) {
            s2(r14, r14, null);
            this.m1.n0(1);
            this.Z2 = r14;
        }
        this.o1.setTitle(this.Q2);
        v2();
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
    /* JADX WARN: Type inference failed for: r11v7, types: [android.view.View, int[], java.lang.CharSequence, java.lang.String, org.telegram.ui.ActionBar.p6, org.telegram.ui.Components.ic[], org.telegram.ui.Components.sx0[]] */
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
    public final void j2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z9, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
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
        org.telegram.ui.Wallet.c8 c8Var;
        s6 s6Var3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        long o4 = org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id);
        long o10 = org.telegram.messenger.m5.o(tL_starGiftUnique.host_id);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.Q2 = jg.g.m(tL_starGiftUnique.num, ',', sb2);
        boolean z12 = this.L2;
        e7 e7Var = this.a2;
        if (!z12 && (s6Var3 = this.K2) != null && s6Var3.o && (tL_starGiftUnique2 = s6Var3.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            s6Var3.a();
            this.K2 = null;
            e7Var.b.setAlpha(1.0f);
            e7Var.c.setAlpha(0.0f);
        } else if (z12 && this.K2 == null) {
            this.K2 = new s6(e7Var);
        }
        int i15 = 0;
        int i16 = 1;
        boolean z13 = this.d3 == null;
        boolean z14 = z13 && K1(this.a, o4);
        boolean z15 = z13 && K1(this.a, o10);
        boolean L1 = L1(this.a, G1());
        B1();
        e7Var.f(tL_starGiftUnique, z14, z15, L1);
        e7Var.setShowOptions(false);
        TextPaint textPaint = e7Var.G;
        final int i17 = 4;
        int i18 = 2;
        int i19 = 3;
        if (this.a3 != null) {
            if (this.c3 != null) {
                e7Var.j(new y1(this, 29), this.b3 == null ? null : new View.OnClickListener(this) { // from class: bi.v4
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
                                this.b.M1();
                                break;
                            case 2:
                                this.b.onBackPressed();
                                break;
                            case 3:
                                s6 s6Var4 = this.b.K2;
                                s6Var4.h.e();
                                s6Var4.i.e();
                                s6Var4.j.e();
                                s6Var4.k.e();
                                break;
                            default:
                                this.b.Q1();
                                break;
                        }
                    }
                }, new y1(this, i15), true);
                org.telegram.ui.Wallet.i5 i5Var = this.c3;
                org.telegram.ui.Wallet.d8 d8Var = i5Var.b.j0;
                e7Var.setWalletCard((d8Var == null || (nftitem2 = i5Var.a) == null || (str2 = nftitem2.address) == null || (c8Var = (org.telegram.ui.Wallet.c8) d8Var.f.get(str2)) == null || !c8Var.b()) ? false : true);
            } else {
                e7Var.j(new y1(this, i16), this.b3 == null ? null : new y1(this, i18), new y1(this, i19), tL_starGiftUnique.host_id != null);
            }
            org.telegram.ui.Wallet.h5 h5Var = this.b3;
            if (h5Var != null) {
                i14 = ((org.telegram.ui.ActionBar.f2) h5Var.c).currentAccount;
                boolean F = org.telegram.ui.Wallet.d8.F(i14, h5Var.a.slug);
                org.telegram.ui.Wallet.h5 h5Var2 = this.b3;
                org.telegram.ui.Wallet.d8 d8Var2 = h5Var2.c.j0;
                boolean z16 = (d8Var2 == null || (nftitem = h5Var2.b) == null || (str = nftitem.address) == null || !str.equals(d8Var2.P0)) ? false : true;
                x5 x5Var = e7Var.J;
                x5Var.e(R.drawable.filled_card_color, org.telegram.messenger.id.M0(z16 ? 2131743103 : 2131743109, null), false);
                x5Var.setAlpha((F || z16) ? 1.0f : 0.5f);
            }
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ("#" + org.telegram.messenger.id.E(tL_starGiftUnique.num, ',')));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new org.telegram.messenger.t(qs.U2, 2, false), length, spannableStringBuilder.length(), 33);
        TL_wallet.walletTransaction wallettransaction = this.d3;
        if (wallettransaction != null) {
            charSequence = org.telegram.messenger.id.M0(wallettransaction.incoming ? 2131743075 : 2131743074, null);
            i7 = 1;
        } else {
            if (tLObject != null) {
                i7 = 1;
                charSequence2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131743882, org.telegram.messenger.m5.u(tLObject)));
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
            spannable = ij.B5(org.telegram.messenger.i6.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        }
        e7Var.h(0, spannableStringBuilder, charSequence, c2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        ?? r11 = 0;
        this.e3 = null;
        tx0 tx0Var = this.d2;
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
                    tx0Var.p(org.telegram.messenger.id.M0(2131750182, null), tL_starGiftUnique.owner_address, new z1(this, i13));
                }
                if (o10 != 0) {
                    int i20 = i13;
                    i11 = i7;
                    this.e3 = ((qx0) this.d2.o(org.telegram.messenger.id.M0(2131750183, null), this.a, o10, new a2(this, o10, i13)).getChildAt(i11)).getChildAt(i20);
                    i12 = i20;
                    obj3 = null;
                } else {
                    i10 = i13;
                    j3 = 0;
                }
            } else {
                i11 = i7;
                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    tx0Var.p(org.telegram.messenger.id.M0(2131750086, null), tL_starGiftUnique.owner_address, new z1(this, i11));
                } else if (o4 == 0 && tL_starGiftUnique.owner_name != null) {
                    tx0Var.c(org.telegram.messenger.id.M0(2131750086, null), tL_starGiftUnique.owner_name, null, null);
                } else if (o4 != 0) {
                    r11 = 0;
                    j3 = 0;
                    r13 = 0;
                    int i21 = i11;
                    this.e3 = ((qx0) this.d2.o(org.telegram.messenger.id.M0(2131750086, null), this.a, o4, new a2(this, o4, i11)).getChildAt(i21 == true ? 1 : 0)).getChildAt(0);
                    r15 = i21;
                    i1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                    i1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                    i1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    if (!z9) {
                        if (this.C2 == null) {
                            tx0Var.c(org.telegram.messenger.id.M0(2131750054, r11), org.telegram.messenger.id.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + org.telegram.messenger.id.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r11, r11);
                        } else if (this.H2) {
                            tx0Var.c(org.telegram.messenger.id.M0(2131750054, r11), org.telegram.messenger.id.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + org.telegram.messenger.id.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r11, r11);
                        } else {
                            TextView textView = (TextView) ((qx0) tx0Var.c(org.telegram.messenger.id.M0(2131750054, r11), "", r11, r11).getChildAt(r15)).getChildAt(r13);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                            b80 b80Var = new b80(textView, org.telegram.messenger.g0.L(90.0f), r13, this.I0);
                            int i22 = org.telegram.ui.ActionBar.m6.G6;
                            b80Var.a(org.telegram.ui.ActionBar.m6.r1(0.21f, org.telegram.ui.ActionBar.m6.w0(i22, this.I0)), org.telegram.ui.ActionBar.m6.r1(0.08f, org.telegram.ui.ActionBar.m6.w0(i22, this.I0)));
                            spannableStringBuilder3.setSpan(b80Var, r13, r15, 33);
                            textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                            if (!this.G2 && !this.H2 && (ijVar = this.C2) != null) {
                                this.G2 = r15;
                                int e12 = ijVar.e1();
                                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                tL_messages_getMessages.id.add(Integer.valueOf(e12));
                                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new j2(this, e12, r13));
                            }
                        }
                        if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                            org.telegram.messenger.r1 i23 = org.telegram.messenger.r1.i();
                            long j10 = tL_starGiftUnique.value_amount;
                            String str3 = tL_starGiftUnique.value_currency;
                            int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                            i23.getClass();
                            this.d2.e(org.telegram.messenger.id.M0(2131749591, r11), rf.b.i("~", org.telegram.messenger.r1.g(str3, h, j10, r15)), org.telegram.messenger.id.M0(2131749590, r11), new aa.s((Object) this, (Object) tL_starGiftUnique, org.telegram.messenger.r1.i().f(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 15), null);
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
                            obj2 = ij.B5(org.telegram.messenger.i6.m(spannableStringBuilder4, textPaint2.getFontMetricsInt(), r13, r11, r13), stargiftattributeoriginaldetails.message.entities, textPaint2.getFontMetricsInt(), r13);
                        } else {
                            obj2 = r11;
                        }
                        int i24 = r13;
                        Object replaceAll = org.telegram.messenger.id.E0().C0().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                        if (stargiftattributeoriginaldetails.sender_id != stargiftattributeoriginaldetails.recipient_id) {
                            if (obj4 != null) {
                                if (obj2 == null) {
                                    Object[] objArr = new Object[3];
                                    objArr[i24] = obj4;
                                    objArr[r15] = spannableString2;
                                    objArr[2] = replaceAll;
                                    V2 = org.telegram.messenger.id.V(r11, r11, 2131750386, objArr);
                                } else {
                                    Object[] objArr2 = new Object[4];
                                    objArr2[i24] = obj4;
                                    objArr2[r15] = spannableString2;
                                    objArr2[2] = replaceAll;
                                    objArr2[3] = obj2;
                                    V2 = org.telegram.messenger.id.V(r11, r11, 2131750385, objArr2);
                                }
                            } else if (obj2 == null) {
                                Object[] objArr3 = new Object[2];
                                objArr3[i24] = spannableString2;
                                objArr3[r15] = replaceAll;
                                V2 = org.telegram.messenger.id.V(r11, r11, 2131750384, objArr3);
                            } else {
                                Object[] objArr4 = new Object[3];
                                objArr4[i24] = spannableString2;
                                objArr4[r15] = replaceAll;
                                objArr4[2] = obj2;
                                V = org.telegram.messenger.id.V(r11, r11, 2131750383, objArr4);
                                if (J1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                                }
                                rx0 a10 = tx0Var.a(V);
                                a10.setFilled(r15);
                                xh.l lVar = (xh.l) a10.getChildAt(0);
                                lVar.setTextSize(r15, 12.0f);
                                lVar.setGravity(17);
                            }
                            V = V2;
                            if (J1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
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
                            V = org.telegram.messenger.id.V(r11, r11, 2131750382, objArr5);
                            if (J1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                                TL_stars.SavedStarGift savedStarGift = this.A2;
                                if (savedStarGift == null || savedStarGift.drop_original_details_stars < j3) {
                                    ij ijVar2 = this.C2;
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
                                org.telegram.ui.ActionBar.t6.U(lVar3, org.telegram.ui.ActionBar.m6.G6, this.I0);
                                org.telegram.ui.ActionBar.t6.G(lVar3, org.telegram.ui.ActionBar.m6.Uc, this.I0);
                                lVar3.setTextSize(r15, 12.0f);
                                lVar3.setGravity(3);
                                lVar3.setText(V);
                                linearLayout.addView(lVar3, c8.ha.p(-1, -2, 1.0f, 19));
                                ImageView imageView = new ImageView(getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                int i25 = org.telegram.ui.ActionBar.m6.Ci;
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i25, this.I0)), 6, 6);
                                org.telegram.ui.ActionBar.p6 K = org.telegram.ui.ActionBar.t6.K(0.1f, i25);
                                org.telegram.ui.ActionBar.h6 h6Var = this.I0;
                                imageView.setBackground(a02);
                                org.telegram.ui.ActionBar.t6.j(imageView, a02, r11, K, h6Var);
                                imageView.setImageResource(R.drawable.menu_delete_old);
                                org.telegram.ui.ActionBar.t6.s(imageView, i25, this.I0, PorterDuff.Mode.SRC_IN);
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
                            V2 = org.telegram.messenger.id.V(r11, r11, 2131750381, objArr6);
                            V = V2;
                            if (J1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
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
                    if (this.d3 != null) {
                        this.e3 = r11;
                        tx0Var.removeAllViews();
                        long e10 = p10.i(this.a).e();
                        this.d2.n(org.telegram.messenger.id.M0(this.d3.incoming ? 2131743015 : 2131743040, r11), this.a, e10, new a2(this, e10, 3));
                        long abs = Math.abs(this.d3.fee);
                        if (abs > j3) {
                            TextView textView2 = new TextView(getContext());
                            textView2.setGravity(16);
                            textView2.setIncludeFontPadding(false);
                            textView2.setTextSize(1, f10);
                            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.G6, this.I0);
                            textView2.setText(org.telegram.ui.Wallet.z5.w0(this.a, abs, this.I0));
                            tx0Var.f(textView2, org.telegram.messenger.id.M0(2131743121, r11));
                        }
                        if (this.d3.date != 0) {
                            tx0Var.c(org.telegram.messenger.id.M0(2131743144, r11), org.telegram.messenger.id.Q(this.d3.date), r11, r11);
                        }
                    }
                    s6Var = this.K2;
                    fi.d dVar = this.f2;
                    if (s6Var != null || !s6Var.o) {
                        if (this.d3 != null) {
                            dVar.setFilled(true);
                            dVar.i(org.telegram.messenger.id.M0(2131747831, r11), !this.Z2, true);
                            dVar.g(r11, !this.Z2);
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
                                            this.b.M1();
                                            break;
                                        case 2:
                                            this.b.onBackPressed();
                                            break;
                                        case 3:
                                            s6 s6Var4 = this.b.K2;
                                            s6Var4.h.e();
                                            s6Var4.i.e();
                                            s6Var4.j.e();
                                            s6Var4.k.e();
                                            break;
                                        default:
                                            this.b.Q1();
                                            break;
                                    }
                                }
                            });
                        } else if (!J1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id)) && tL_starGiftUnique.resell_amount != null) {
                            final int i27 = 1;
                            dVar.setFilled(true);
                            k2(tL_starGiftUnique);
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
                                            this.b.M1();
                                            break;
                                        case 2:
                                            this.b.onBackPressed();
                                            break;
                                        case 3:
                                            s6 s6Var4 = this.b.K2;
                                            s6Var4.h.e();
                                            s6Var4.i.e();
                                            s6Var4.j.e();
                                            s6Var4.k.e();
                                            break;
                                        default:
                                            this.b.Q1();
                                            break;
                                    }
                                }
                            });
                        } else if (!this.m2 || this.U1 == null || this.B2 == null || C1() < 0 || this.B2.b(C1()) < 0) {
                            dVar.setFilled(true);
                            dVar.i(org.telegram.messenger.id.M0(2131747831, r11), !this.Z2, true);
                            dVar.g(r11, !this.Z2);
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
                                            this.b.M1();
                                            break;
                                        case 2:
                                            this.b.onBackPressed();
                                            break;
                                        case 3:
                                            s6 s6Var4 = this.b.K2;
                                            s6Var4.h.e();
                                            s6Var4.i.e();
                                            s6Var4.j.e();
                                            s6Var4.k.e();
                                            break;
                                        default:
                                            this.b.Q1();
                                            break;
                                    }
                                }
                            });
                            this.o1.setTitle(this.Q2);
                            s6Var2 = this.K2;
                            if (s6Var2 != null) {
                                return;
                            }
                            boolean z17 = this.L2;
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
                                    dVar.i(org.telegram.messenger.id.M0(2131749610, null), true, true);
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
                                                    this.b.M1();
                                                    break;
                                                case 2:
                                                    this.b.onBackPressed();
                                                    break;
                                                case 3:
                                                    s6 s6Var4 = this.b.K2;
                                                    s6Var4.h.e();
                                                    s6Var4.i.e();
                                                    s6Var4.j.e();
                                                    s6Var4.k.e();
                                                    break;
                                                default:
                                                    this.b.Q1();
                                                    break;
                                            }
                                        }
                                    });
                                    int length2 = ((k7) this.O2.d).N2.length - 1;
                                    pj0 pj0Var = this.n1;
                                    pj0Var.v0(length2);
                                    pj0Var.post(new z1(this, 26));
                                    return;
                                }
                            } else {
                                arrayList = arrayList2;
                            }
                            if (z17) {
                                org.telegram.ui.Components.k9 upgradeImageView = e7Var2.getUpgradeImageView();
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
                            int b10 = this.B2.b(C1());
                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                            spannableStringBuilder5.append((CharSequence) org.telegram.messenger.id.M0(2131749855, r11));
                            Object obj5 = this.B2.get(b10);
                            if (!(obj5 instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj5).gift) == null || (document = starGift.getDocument()) == null) {
                                z10 = true;
                            } else {
                                spannableStringBuilder5.append((CharSequence) " e");
                                z10 = true;
                                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.q5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                            }
                            dVar.i(spannableStringBuilder5, this.Z2 ^ z10, z10);
                            dVar.g(r11, this.Z2 ^ z10);
                            dVar.setOnClickListener(new u2(this, b10, 3));
                        }
                    }
                    this.o1.setTitle(this.Q2);
                    s6Var2 = this.K2;
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
            i1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            i1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            i1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            if (!z9) {
            }
            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
            if (stargiftattributeoriginaldetails != null) {
            }
            if (this.d3 != null) {
            }
            s6Var = this.K2;
            fi.d dVar2 = this.f2;
            if (s6Var != null) {
            }
            if (this.d3 != null) {
            }
            this.o1.setTitle(this.Q2);
            s6Var2 = this.K2;
            if (s6Var2 != null) {
            }
        }
        r15 = i7;
        r13 = i10;
        i1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
        i1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        i1(ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z9) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
        }
        if (this.d3 != null) {
        }
        s6Var = this.K2;
        fi.d dVar22 = this.f2;
        if (s6Var != null) {
        }
        if (this.d3 != null) {
        }
        this.o1.setTitle(this.Q2);
        s6Var2 = this.K2;
        if (s6Var2 != null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, org.telegram.ui.ActionBar.b2
    public org.telegram.ui.Components.gc k() {
        return new org.telegram.ui.Components.gc(this.k2, this.I0);
    }

    public final void k1(LinearLayout linearLayout, int i7, int i10, int i11, String str, boolean z9) {
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i7);
        org.telegram.ui.ActionBar.h6 h6Var = this.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView, i11, h6Var, mode);
        linearLayout.addView(imageView, c8.ha.t(i10, i10, 16, i10 < 15 ? 1 : 0, 0, i10 < 15 ? 1 : 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i12 = org.telegram.ui.ActionBar.m6.r5;
        org.telegram.ui.ActionBar.t6.U(textView, i12, this.I0);
        textView.setText(str);
        linearLayout.addView(textView, c8.ha.t(-2, -2, 16, 4, 0, 0, 0));
        if (z9) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.msg_mini_topicarrow);
            org.telegram.ui.ActionBar.t6.s(imageView2, i12, this.I0, mode);
            linearLayout.addView(imageView2, c8.ha.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void k2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.a);
        boolean z9 = tL_starGiftUnique.resale_ton_only;
        fi.d dVar = this.f2;
        if (z9) {
            dVar.i(dd.s1(dd.V0(org.telegram.messenger.id.a0(null, null, 2131746146, tL_starGiftUnique.getResellAmount(cg.b.b).d()), true), true), !this.Z2, true);
            dVar.g(dd.T0(org.telegram.messenger.id.H(',', "ResellGiftBuyEq", (int) resellAmount.a())), !this.Z2);
        } else {
            dVar.i(dd.T0(org.telegram.messenger.id.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.Z2, true);
            dVar.g(null, !this.Z2);
        }
    }

    public final void l1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            ea.y(this.a, false).P(w1());
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
            ea.y(this.a, false).P(w1());
            dismiss();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.L2 = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.A2;
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
                i2(savedStarGift2, this.B2);
                this.j3 = null;
                this.L2 = false;
                w9 w9Var = this.B2;
                if (w9Var != null) {
                    w9Var.d();
                } else {
                    ea.y(this.a, false).P(this.S1);
                }
                org.telegram.messenger.g0.h3(runnable);
                return;
            }
        }
        if (this.B2 == null) {
            ea.y(this.a, false).P(w1());
        }
        this.L2 = true;
        this.A2 = null;
        this.z2 = false;
        ij ijVar = new ij(this.a, message, false, false);
        ijVar.L5();
        h2(ijVar, this.B2);
        this.j3 = null;
        this.L2 = false;
        org.telegram.messenger.g0.h3(runnable);
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z9) {
        if (z9) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = p10.i(this.a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= TLObject.FLAG_12;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.a2.setWalletDisplayed(z9);
        w2();
    }

    public final boolean m1() {
        TLRPC.Peer peer;
        if (A1() == null) {
            return false;
        }
        ij ijVar = this.C2;
        if (ijVar != null) {
            TLRPC.MessageAction messageAction = ijVar.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!ijVar.P3() || ((ij.B0(this.C2.k) > p10.i(this.a).e() ? 1 : (ij.B0(this.C2.k) == p10.i(this.a).e() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && K1(this.a, org.telegram.messenger.m5.o(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && qp.s1(this.a).E6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.C2.k.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                int currentTime = qp.s1(this.a).E6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                int i7 = this.a;
                long j3 = this.S1;
                if (K1(i7, j3)) {
                    int i10 = this.A2.flags;
                    if (((j3 < 0 ? 2048 : 8) & i10) != 0 && (i10 & 16) != 0 && (i10 & 2) != 0 && currentTime > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void m2(boolean z9) {
        int C1 = C1();
        if (C1 < 0) {
            return;
        }
        int i7 = (z9 ? 1 : -1) + C1;
        int i10 = this.P2;
        if (i10 >= 0 && (!z9 ? i10 < C1 : i10 > C1)) {
            i7 = i10;
        }
        w9 w9Var = this.B2;
        Object obj = (w9Var == null || i7 < 0 || i7 >= w9Var.e()) ? null : this.B2.get(i7);
        if (obj == null) {
            return;
        }
        if ((z9 ? this.Y1 : this.X1) != null) {
            if (obj instanceof TL_stars.SavedStarGift) {
                if (t1((z9 ? this.Y1 : this.X1).A2, (TL_stars.SavedStarGift) obj)) {
                    return;
                }
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                if (u1((z9 ? this.Y1 : this.X1).E2, (TL_stars.TL_starGiftUnique) obj)) {
                    return;
                }
            }
        }
        i5 i5Var = new i5(this, getContext(), this.a, this.S1, this.I0, this.T1.getRootView());
        if (obj instanceof TL_stars.SavedStarGift) {
            i5Var.i2((TL_stars.SavedStarGift) obj, this.B2);
        } else if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            i5Var.g2(tL_starGiftUnique.slug, tL_starGiftUnique, this.B2);
        }
        org.telegram.messenger.g0.E2(i5Var.b);
        if (z9) {
            this.Y1 = i5Var;
        } else {
            this.X1 = i5Var;
        }
    }

    public final boolean n1() {
        int i7;
        TL_stars.TL_starGiftUnique G1 = G1();
        if (G1 == null || G1.crafted || !K1(this.a, org.telegram.messenger.m5.o(G1.owner_id))) {
            return false;
        }
        ij ijVar = this.C2;
        if (ijVar == null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
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

    public final void n2() {
        TL_stars.TL_starGiftUnique G1 = G1();
        if (G1 == null) {
            return;
        }
        TLRPC.Peer peer = G1.owner_id;
        if (peer == null) {
            peer = G1.host_id;
        }
        long o4 = org.telegram.messenger.m5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(G1.title);
        sb2.append(" #");
        this.x2.setText(org.telegram.messenger.id.a0(null, null, 2131749833, jg.g.m(G1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131749835, null));
        if (o4 == p10.i(this.a).e() && !p10.i(this.a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.S2 == null) {
                this.S2 = new wp(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.S2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        fi.d dVar = this.f2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new y1(this, 27));
        this.a2.setWearPreview(qp.s1(this.a).e2(o4));
        s2(2, false, null);
        this.v2 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o1() {
        if (this.a3 == null && A1() != null) {
            ij ijVar = this.C2;
            if (ijVar != null) {
                TLRPC.Message message = ijVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TL_stars.StarGift starGift = tL_messageActionStarGift.gift;
                        if ((starGift instanceof TL_stars.TL_starGift) && !starGift.limited && starGift.availability_total <= 0 && !starGift.auction && !tL_messageActionStarGift.converted && !tL_messageActionStarGift.upgraded && !tL_messageActionStarGift.refunded && tL_messageActionStarGift.convert_stars > 0) {
                            boolean P3 = ijVar.P3();
                            boolean z9 = ij.B0(this.C2.k) == p10.i(this.a).e();
                            TLRPC.Peer peer = tL_messageActionStarGift.peer;
                            if (peer != null) {
                                return K1(this.a, org.telegram.messenger.m5.o(peer));
                            }
                            if (!P3 || z9) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (!(starGift2 instanceof TL_stars.TL_starGift) || starGift2.limited || starGift2.availability_total > 0 || starGift2.auction || savedStarGift.refunded || !K1(this.a, this.S1)) {
                    }
                }
            }
        }
        return false;
    }

    public final void o2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique G1 = G1();
        TL_stars.InputSavedStarGift A1 = A1();
        if (A1 == null || G1 == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = A1;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject u10 = hi.a3.u(this.I0, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new g2(this, charSequence, G1, tL_inputInvoiceStarGiftDropOriginalDetails, 1));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.a).c(this, qs.G3);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        e7 e7Var;
        d6 d6Var;
        if (this.W2.c(4) && (e7Var = this.a2) != null && (d6Var = e7Var.M) != null) {
            if (d6Var.h0) {
                return;
            }
            if (d6Var.i0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.v2 || this.W2.c <= 0 || this.f2.Q || this.i3) {
            super.onBackPressed();
            return;
        }
        ij ijVar = this.C2;
        if (ijVar != null) {
            h2(ijVar, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                i2(savedStarGift, this.B2);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
                if (tL_starGiftUnique != null) {
                    g2(this.D2, tL_starGiftUnique, this.B2);
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

    public final void p1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        String M0 = org.telegram.messenger.id.M0(2131750266, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131750267, null);
        TL_stars.TL_starGiftUnique G1 = G1();
        if (G1 != null && !TextUtils.isEmpty(G1.slug)) {
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747805, null), new o4(this, G1, 1));
        }
        jg.g.w(null, 2131752589, alertDialog$Builder, null);
    }

    public final void p2(View view, CharSequence charSequence, boolean z9) {
        Layout layout;
        float primaryHorizontal;
        fi.m3 m3Var = this.t3;
        if ((m3Var != null && m3Var.V && this.u3 == view) || view == null) {
            return;
        }
        if (!z9) {
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
            org.telegram.ui.Components.jc[] jcVarArr = (org.telegram.ui.Components.jc[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.jc.class);
            if (jcVarArr == null || jcVarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(jcVarArr[jcVarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
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
        m5 m5Var2 = this.T1;
        m5Var2.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        fi.m3 m3Var2 = this.t3;
        if (m3Var2 != null) {
            m3Var2.f(true);
            this.t3 = null;
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
        m5Var2.addView(m3Var3, c8.ha.c(100.0f, -1));
        this.t3 = m3Var3;
        this.u3 = view;
    }

    public final void q1(long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload, vf.b bVar, wg.f1 f1Var) {
        TL_wallet.nftItem nftitem = this.a3;
        TL_stars.TL_starGiftUnique G1 = G1();
        if (nftitem == null || G1 == null || TextUtils.isEmpty(G1.slug)) {
            return;
        }
        bVar.d();
        q3 q3Var = new q3(this, bVar, f1Var, j3, G1, nftitem, 0);
        if (stargiftdepositpayload != null) {
            q3Var.a(stargiftdepositpayload);
            return;
        }
        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
        depositstargift.peer = qp.s1(this.a).j1(j3);
        depositstargift.slug = G1.slug;
        ConnectionsManager.getInstance(this.a).sendRequestTyped(depositstargift, new d3.b(1), new q2(this, bVar, f1Var, q3Var, 1));
    }

    public final void q2(int i7, Context context, boolean z9) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(64.0f);
        int i10 = org.telegram.ui.ActionBar.m6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i10, this.I0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.h6 h6Var = this.I0;
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(frameLayout, L2, M, null, h6Var);
        f10.addView(frameLayout, c8.ha.t(64, 64, 49, 0, 6, 0, 0));
        ch0 ch0Var = new ch0(context);
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        ch0Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(ch0Var, c8.ha.r(64, 64, 17));
        ch0Var.d();
        TextView b10 = c8.qa.b(context, 20.0f, org.telegram.ui.ActionBar.m6.G6, true, null);
        b10.setGravity(17);
        b10.setText(org.telegram.messenger.id.M0(z9 ? 2131750005 : 2131749911, null));
        f10.addView(b10, c8.ha.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = c8.qa.b(context, 14.0f, org.telegram.ui.ActionBar.m6.F6, false, null);
        b11.setGravity(17);
        b11.setText(org.telegram.messenger.id.a0(null, null, z9 ? 2131750006 : 2131749912, org.telegram.messenger.id.c0(Math.max(10, i7))));
        f10.addView(b11, c8.ha.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, this.I0);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void r0() {
        fi.m3 m3Var = this.t3;
        if (m3Var != null) {
            m3Var.f(true);
            this.t3 = null;
        }
    }

    public final void r1(final long j3, final c20 c20Var) {
        TLRPC.Message message;
        long o4;
        long j10;
        TL_stars.InputSavedStarGift A1 = A1();
        if (A1 == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            ij ijVar = this.C2;
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
            o4 = this.S1;
        }
        if (j10 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = A1;
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
        long j12 = o4;
        ea y10 = ea.y(this.a, false);
        if (!y10.e) {
            y10.r(new w2(this, y10, j3, c20Var, 0));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = A1;
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new x2(this, tL_inputInvoiceStarGiftTransfer, j3, j12, c20Var));
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
            U1(z9, bVar, runnable);
        } else {
            I1(tmppassword2.tmp_password, null, z9, new n3(this, z9, bVar, runnable, u1Var));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            P(org.telegram.ui.ActionBar.m6.h5);
            e7 e7Var = this.a2;
            if (e7Var != null) {
                e7Var.l();
            }
            wp wpVar = this.Y2;
            if (wpVar != null) {
                Drawable drawable = wpVar.c;
                if (drawable instanceof f7) {
                    ((f7) drawable).d.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.I0));
                    fi.d dVar = this.f2;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1() {
        TL_stars.InputSavedStarGift A1;
        long j3;
        fi.d dVar = this.f2;
        if (dVar.Q || (A1 = A1()) == null) {
            return;
        }
        ij ijVar = this.C2;
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
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift == null) {
                return;
            }
            j3 = savedStarGift.upgrade_stars;
            if (j3 <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
        }
        if (j3 > 0 || this.n3 != null) {
            dVar.setLoading(true);
            wo woVar = this.r2;
            if (j3 > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = woVar.a.q;
                upgradestargift.stargift = A1;
                ConnectionsManager.getInstance(this.a).sendRequest(upgradestargift, new j(4, this, A1));
                return;
            }
            int i7 = 0;
            ea y10 = ea.y(this.a, false);
            if (!y10.e) {
                y10.r(new a1.e(28, this, y10));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.n3.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = woVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = A1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = qp.s1(this.a).j1(this.S1);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.n3.invoice.prices;
            int size = arrayList.size();
            while (i7 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                i7++;
                j10 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new f0(this, str, A1, j10, 1));
        }
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
        ValueAnimator valueAnimator = this.X2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.X2 = null;
        }
        e7 e7Var = this.a2;
        if (i7 != 1) {
            org.telegram.messenger.g0.r(e7Var.l0);
        }
        if (!this.Z2) {
            this.V2 = Float.valueOf(this.T1.f());
        }
        g6 g6Var = this.W2;
        this.W2 = new g6(g6Var == null ? 0 : g6Var.c, i7);
        k5 k5Var = this.O2;
        int finalHeight = e7Var.getFinalHeight();
        int v12 = v1();
        if (this.W2.d(1)) {
            FrameLayout frameLayout = this.i2;
            if (frameLayout.getVisibility() == 0) {
                i10 = frameLayout.getMeasuredHeight();
                k5Var.H(finalHeight, v12 + i10);
                if (this.W2.c == 0 && (s6Var = this.K2) != null) {
                    s6Var.c();
                }
                int i11 = 3;
                h5 h5Var = this.y2;
                h5 h5Var2 = this.w2;
                h5 h5Var3 = this.n2;
                h5 h5Var4 = this.b2;
                if (z9) {
                    this.W2.a = 1.0f;
                    O1();
                    h5Var4.setVisibility(i7 == 0 ? 0 : 8);
                    h5Var3.setVisibility(i7 == 1 ? 0 : 8);
                    h5Var2.setVisibility(i7 == 2 ? 0 : 8);
                    h5Var.setVisibility(i7 != 3 ? 8 : 0);
                    u2();
                    if (k1Var != null) {
                        k1Var.run();
                    }
                } else {
                    h5Var4.setVisibility(this.W2.b(0) ? 0 : 8);
                    h5Var3.setVisibility(this.W2.b(1) ? 0 : 8);
                    h5Var2.setVisibility(this.W2.b(2) ? 0 : 8);
                    h5Var.setVisibility(this.W2.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.X2 = ofFloat;
                    ofFloat.addUpdateListener(new ah.h(this, i11));
                    this.X2.addListener(new y4(this, i7, k1Var, r5));
                    this.X2.setInterpolator(wq.h);
                    this.X2.setDuration(320L);
                    this.X2.start();
                    g6 g6Var2 = this.W2;
                    org.telegram.ui.Components.k9[] k9VarArr = e7Var.d;
                    int i12 = g6Var2.b;
                    int i13 = g6Var2.c;
                    if (i12 != i13) {
                        zg0 B = k9VarArr[i12].getImageReceiver().B();
                        zg0 B2 = k9VarArr[i13].getImageReceiver().B();
                        if (B2 != null && B != null) {
                            B2.T(false, B.t());
                        }
                    }
                }
                m3Var = this.t3;
                if (m3Var == null) {
                    m3Var.f(true);
                    this.t3 = null;
                    return;
                }
                return;
            }
        }
        i10 = 0;
        k5Var.H(finalHeight, v12 + i10);
        if (this.W2.c == 0) {
            s6Var.c();
        }
        int i112 = 3;
        h5 h5Var5 = this.y2;
        h5 h5Var22 = this.w2;
        h5 h5Var32 = this.n2;
        h5 h5Var42 = this.b2;
        if (z9) {
        }
        m3Var = this.t3;
        if (m3Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        ij ijVar;
        TLRPC.Message message;
        if (qp.s1(this.a).v2()) {
            org.telegram.ui.b.b(this.a);
            return;
        }
        if (this.D2 != null && this.E2 == null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
            u1Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.D2;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift, new j(2, this, u1Var));
        } else if (this.A2 == null && (ijVar = this.C2) != null && (message = ijVar.k) != null) {
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
                    if (A1() != null) {
                        org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
                        u1Var3.r(500L);
                        ea.y(this.a, false).M(A1(), new ai.f1(2, this, u1Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t2(boolean z9) {
        boolean z10;
        TL_stars.TL_starGiftUnique G1 = G1();
        if (G1 == null) {
            return;
        }
        qp.e1().edit().putInt("statusgiftpage", 3).apply();
        boolean L1 = L1(this.a, G1());
        boolean z11 = !L1;
        boolean L12 = L1(this.a, G1());
        fi.d dVar = this.f2;
        int i7 = 1;
        if (L12) {
            qp.s1(this.a).g5(w1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z10 = z11;
        } else {
            z10 = z11;
            long w12 = w1();
            if (w12 >= 0) {
                if (!p10.i(this.a).q()) {
                    org.telegram.ui.Components.bc P = k().P(R.raw.star_premium_2, org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131750423, null), new z1(this, 2)));
                    P.t = true;
                    P.j();
                    return;
                }
            } else if (!z9) {
                qp s12 = qp.s1(this.a);
                dVar.setLoading(true);
                qp.s1(this.a).G0().a(w12, new b2(this, s12, w12, 0));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = G1.id;
            qp.s1(this.a).g5(w1(), tL_inputEmojiStatusCollectible, G1);
        }
        this.a2.I[1].e(!L1 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, org.telegram.messenger.id.M0(!L1 ? 2131750422 : 2131750425, null), true);
        if (this.v2) {
            dismiss();
            return;
        }
        k1 k1Var = new k1(i7, this, z10);
        if (this.W2.c(0)) {
            k1Var.run();
        } else {
            s2(0, true, k1Var);
        }
        dVar.i(org.telegram.messenger.id.M0(2131747831, null), !this.Z2, true);
        dVar.g(null, !this.Z2);
        dVar.setOnClickListener(new y1(this, 5));
    }

    public final void u2() {
        FrameLayout frameLayout = this.i2;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.k2;
        FrameLayout frameLayout3 = this.g2;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.W2.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.W2.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.W2.a(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    public final int v1() {
        if (this.W2.d(1)) {
            return this.n2.getMeasuredHeight();
        }
        if (this.W2.d(2)) {
            return this.w2.getMeasuredHeight();
        }
        if (this.W2.d(3)) {
            return this.y2.getMeasuredHeight();
        }
        if (this.W2.d(4)) {
            return 0;
        }
        return this.b2.getMeasuredHeight();
    }

    public final void v2() {
        boolean H1 = H1(false);
        f5 f5Var = this.U1;
        f5Var.setPosition(H1 ? 1 : 0);
        f5Var.D(false);
        if (this.B2 == null || H1(true) || this.B2.e() >= this.B2.c()) {
            return;
        }
        this.B2.a();
    }

    public final long w1() {
        TLRPC.Peer peer;
        ij ijVar = this.C2;
        if (ijVar == null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? org.telegram.messenger.m5.o(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.S1;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
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
            return peer2 != null ? org.telegram.messenger.m5.o(peer2) : ijVar.P3() ? ij.B0(this.C2.k) : p10.i(this.a).e();
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

    public final void w2() {
        TL_stars.TL_starGiftUnique G1 = G1();
        TL_wallet.nftItem nftitem = this.a3;
        LinearLayout linearLayout = this.t2;
        if (nftitem == null || G1 == null) {
            linearLayout.setVisibility(8);
            return;
        }
        this.c2.setVisibility(8);
        this.e2.setVisibility(8);
        linearLayout.setVisibility(0);
        this.u2.a(G1.host_id != null, linearLayout.isAttachedToWindow());
    }

    public final TL_stars.StarGift x1() {
        ij ijVar = this.C2;
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
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final String y1() {
        TL_stars.StarGift x12 = x1();
        if (!(x12 instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) x12).title);
        sb2.append(" #");
        return jg.g.m(r0.num, ',', sb2);
    }
}
