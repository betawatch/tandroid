package ci;

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
import b8.mf;
import b8.pf;
import b8.rf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
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
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.gg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class l6 extends org.telegram.ui.Components.ma implements cs {
    public static final /* synthetic */ int t3 = 0;
    public zi A2;
    public String B2;
    public TL_stars.TL_starGiftUnique C2;
    public boolean D2;
    public boolean E2;
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public u5 I2;
    public boolean J2;
    public s4 K2;
    public final int[] L2;
    public r4 M2;
    public int N2;
    public String O2;
    public ai.g6 P2;
    public final long Q1;
    public wp Q2;
    public final t4 R1;
    public boolean R2;
    public final n4 S1;
    public g4 S2;
    public final gz T1;
    public Float T2;
    public final View U1;
    public k5 U2;
    public ai.j2 V1;
    public ValueAnimator V2;
    public ai.j2 W1;
    public wp W2;
    public final q4 X1;
    public boolean X2;
    public final f6 Y1;
    public TL_wallet.nftItem Y2;
    public final p4 Z1;
    public org.telegram.ui.Wallet.e5 Z2;
    public final s70 a2;
    public org.telegram.ui.Wallet.f5 a3;
    public final rx0 b2;
    public TL_wallet.walletTransaction b3;
    public final s70 c2;
    public View c3;
    public final gi.d d2;
    public ai.a4 d3;
    public final FrameLayout e2;
    public boolean e3;
    public final s70 f2;
    public Boolean f3;
    public final FrameLayout g2;
    public boolean g3;
    public final View h2;
    public ArrayList h3;
    public final FrameLayout i2;
    public ArrayList i3;
    public h6 j2;
    public ArrayList j3;
    public boolean k2;
    public boolean k3;
    public final p4 l2;
    public TLRPC.PaymentForm l3;
    public final ii.j[] m2;
    public final wp[] m3;
    public final View n2;
    public final s1 n3;
    public final LinearLayout o2;
    public int o3;
    public final wo p2;
    public Boolean p3;
    public final TextView q2;
    public boolean q3;
    public final LinearLayout r2;
    public gi.l3 r3;
    public final wo s2;
    public View s3;
    public boolean t2;
    public final p4 u2;
    public final TextView v2;
    public final p4 w2;
    public boolean x2;
    public TL_stars.SavedStarGift y2;
    public w8 z2;

    public l6(Context context, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        super(context, null, false, false, e6Var);
        this.k2 = false;
        this.L2 = new int[2];
        this.N2 = -1;
        this.O2 = "";
        this.U2 = new k5(0, 0);
        this.X2 = true;
        this.m3 = new wp[1];
        this.n3 = new s1(this, 11);
        this.q3 = true;
        this.a = i3;
        this.Q1 = j10;
        this.s1 = Math.max(0.05f, org.telegram.messenger.g0.L(82.0f) / (org.telegram.messenger.g0.q.y + org.telegram.messenger.g0.m));
        this.x = true;
        this.b = new ai.o2(1, context, this);
        t4 t4Var = new t4(this, context);
        this.R1 = t4Var;
        n4 n4Var = new n4(this, context);
        this.S1 = n4Var;
        n4Var.setAdapter(new o4(0, context, this));
        v2();
        View view2 = new View(context);
        this.U1 = view2;
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        org.telegram.ui.ActionBar.r6.i(i10, view2, e6Var);
        FrameLayout.LayoutParams e10 = mf.e(-1, 50, 80);
        int i11 = this.u0;
        e10.rightMargin = i11;
        e10.leftMargin = i11;
        this.b.addView(view2, e10);
        this.b.addView(n4Var, mf.e(-1, -1, hs.E1));
        P(i10);
        org.telegram.messenger.g0.E2(this.l1);
        t4Var.addView(this.l1, mf.e(-1, -1, hs.E1));
        p4 p4Var = new p4(this, context, 0);
        this.Z1 = p4Var;
        p4Var.setOrientation(1);
        p4Var.setPadding(org.telegram.messenger.g0.L(14.0f) + this.u0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f) + this.u0, org.telegram.messenger.g0.L(68.0f));
        t4Var.addView(p4Var, mf.e(-1, -1, 55));
        s70 s70Var = new s70(context, e6Var);
        this.a2 = s70Var;
        int i12 = org.telegram.ui.ActionBar.k6.q5;
        org.telegram.ui.ActionBar.r6.V(s70Var, i12, e6Var);
        s70Var.setTextSize(1, 12.0f);
        s70Var.setGravity(17);
        s70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        s70Var.setDisablePaddingsOffsetY(true);
        p4Var.addView(s70Var, mf.t(-2, -2, 1, 4, -2, 4, 16));
        s70Var.setVisibility(8);
        rx0 rx0Var = new rx0(context, e6Var);
        this.b2 = rx0Var;
        p4Var.addView(rx0Var, mf.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        s70 s70Var2 = new s70(context, e6Var);
        this.c2 = s70Var2;
        org.telegram.ui.ActionBar.r6.V(s70Var2, i12, e6Var);
        s70Var2.setTextSize(1, 12.0f);
        s70Var2.setGravity(17);
        s70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.H(s70Var2, i13, e6Var);
        s70Var2.setDisablePaddingsOffsetY(true);
        s70Var2.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        p4Var.addView(s70Var2, mf.t(-2, -2, 1, 4, 2, 4, 8));
        s70Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.r2 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i14, e6Var), 21, 21);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(linearLayout, a02, null, N, e6Var);
        wo woVar = new wo(24, context, e6Var);
        this.s2 = woVar;
        int i15 = org.telegram.ui.ActionBar.k6.h7;
        int i16 = org.telegram.ui.ActionBar.k6.j7;
        int i17 = org.telegram.ui.ActionBar.k6.k7;
        woVar.b(i15, i16, i17);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(woVar, mf.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i18 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i18, e6Var);
        k2.p1.u(textView, 1, 14.0f, null, 2131750397);
        linearLayout.addView(textView, mf.t(-2, -2, 16, 9, 0, 0, 0));
        p4Var.addView(linearLayout, mf.t(-2, -2, 1, 0, -4, 0, 4));
        pf.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new r1(this, 19));
        linearLayout.setVisibility(8);
        p4 p4Var2 = new p4(this, context, 1);
        this.l2 = p4Var2;
        p4Var2.setOrientation(1);
        p4Var2.setPadding(org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(66.0f));
        t4Var.addView(p4Var2, mf.e(-1, -1, 55));
        ii.j[] jVarArr = {r9, r6, r6};
        this.m2 = jVarArr;
        ii.j jVar = new ii.j(context, e6Var, false);
        jVar.a(R.drawable.menu_feature_unique, bd.M0(2131749873, null), bd.M0(2131749583, null));
        p4Var2.addView(jVarArr[0], mf.o(-1, -2));
        ii.j jVar2 = new ii.j(context, e6Var, false);
        jVar2.a(R.drawable.menu_feature_tradable, bd.M0(2131749867, null), bd.M0(2131749581, null));
        p4Var2.addView(jVarArr[1], mf.o(-1, -2));
        ii.j jVar3 = new ii.j(context, e6Var, false);
        jVar3.a(R.drawable.menu_wear, bd.M0(2131749578, null), bd.M0(2131749579, null));
        p4Var2.addView(jVarArr[2], mf.o(-1, -2));
        View view3 = new View(context);
        this.n2 = view3;
        int i19 = org.telegram.ui.ActionBar.k6.d7;
        org.telegram.ui.ActionBar.r6.i(i19, view3, e6Var);
        p4Var2.addView(view3, mf.n(1.0f / org.telegram.messenger.g0.p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.o2 = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i14, e6Var), 6, 6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        linearLayout2.setBackground(a03);
        org.telegram.ui.ActionBar.r6.k(linearLayout2, a03, null, N2, e6Var);
        wo woVar2 = new wo(24, context, e6Var);
        this.p2 = woVar2;
        woVar2.b(i15, i16, i17);
        woVar2.setDrawUnchecked(true);
        woVar2.a(false, false);
        woVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(woVar2, mf.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.q2 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i18, e6Var);
        k2.p1.u(textView2, 1, 14.0f, null, 2131750405);
        linearLayout2.addView(textView2, mf.t(-2, -2, 16, 9, 0, 0, 0));
        p4Var2.addView(linearLayout2, mf.t(-2, -2, 1, 0, 0, 0, 4));
        pf.b(linearLayout2, 0.025f, 1.5f);
        p4 p4Var3 = new p4(this, context, 2);
        this.u2 = p4Var3;
        p4Var3.setOrientation(1);
        p4Var3.setPadding(org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(66.0f));
        t4Var.addView(p4Var3, mf.e(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.v2 = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i18, e6Var);
        textView3.setTextSize(1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        p4Var3.addView(textView3, mf.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView4, i18, e6Var);
        textView4.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.m(textView4, 17, null, 2131749842);
        p4Var3.addView(textView4, mf.t(-1, -2, 7, 20, 6, 20, 24));
        ii.j jVar4 = new ii.j(context, e6Var, false);
        jVar4.a(R.drawable.menu_feature_unique, bd.M0(2131749848, null), bd.M0(2131749849, null));
        p4Var3.addView(r6[0], mf.o(-1, -2));
        ii.j jVar5 = new ii.j(context, e6Var, false);
        jVar5.a(R.drawable.menu_feature_cover, bd.M0(2131749846, null), bd.M0(2131749847, null));
        p4Var3.addView(r6[1], mf.o(-1, -2));
        ii.j jVar6 = new ii.j(context, e6Var, false);
        ii.j[] jVarArr2 = {jVar4, jVar5, jVar6};
        jVar6.a(R.drawable.menu_verification, bd.M0(2131749844, null), bd.M0(2131749845, null));
        p4Var3.addView(jVarArr2[2], mf.o(-1, -2));
        p4 p4Var4 = new p4(this, context, 3);
        this.w2 = p4Var4;
        p4Var4.setOrientation(1);
        p4Var4.setPadding(org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f) + this.u0, org.telegram.messenger.g0.L(92.0f));
        t4Var.addView(p4Var4, mf.e(-1, -1, 55));
        ii.j jVar7 = new ii.j(context, e6Var, false);
        jVar7.a(R.drawable.menu_feature_unique, bd.M0(2131749793, null), bd.M0(2131749794, null));
        p4Var4.addView(r8[0], mf.o(-1, -2));
        ii.j jVar8 = new ii.j(context, e6Var, false);
        jVar8.a(R.drawable.menu_random, bd.M0(2131749791, null), bd.M0(2131749792, null));
        p4Var4.addView(r8[1], mf.o(-1, -2));
        ii.j jVar9 = new ii.j(context, e6Var, false);
        ii.j[] jVarArr3 = {jVar7, jVar8, jVar9};
        jVar9.a(R.drawable.menu_feature_affect, bd.M0(2131749789, null), bd.M0(2131749790, null));
        p4Var4.addView(jVarArr3[2], mf.o(-1, -2));
        p4Var.setAlpha(1.0f);
        p4Var2.setAlpha(0.0f);
        p4Var3.setAlpha(0.0f);
        p4Var4.setAlpha(0.0f);
        f6 f6Var = new f6(context, e6Var, new s1(this, 12), new r1(this, 20), new r1(this, 21), new r1(this, 22), new r1(this, 23), new r1(this, 24), new r1(this, 25), new r1(this, 26));
        this.Y1 = f6Var;
        f6Var.N.c.setOnClickListener(new r1(this, 17));
        int i20 = this.u0;
        f6Var.setPadding(i20, 0, i20, 0);
        t4Var.addView(f6Var, mf.e(-1, -2, 55));
        kg.y yVar = this.k1;
        this.H1 = true;
        yVar.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e2 = frameLayout;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout, e6Var);
        View view4 = new View(context);
        this.h2 = view4;
        org.telegram.ui.ActionBar.r6.i(i19, view4, e6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, mf.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.d2 = h;
        h.i(bd.M0(2131747839, null), false, true);
        h.g(null, false);
        FrameLayout.LayoutParams d = mf.d(-1, 48.0f, hs.E1, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = org.telegram.messenger.g0.L(14.0f) + this.u0;
        d.rightMargin = org.telegram.messenger.g0.L(14.0f) + this.u0;
        frameLayout.addView(h, d);
        t4Var.addView(frameLayout, mf.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.g2 = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout2, e6Var);
        s70 s70Var3 = new s70(context, null);
        this.f2 = s70Var3;
        s70Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var3, i13, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var3, i13, e6Var);
        s70Var3.setGravity(17);
        frameLayout2.addView(s70Var3, mf.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        t4Var.addView(frameLayout2, mf.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.l1.setOnScrollListener(new ai.j5(this, 7));
        linearLayout2.setOnClickListener(new r1(this, 18));
        gz gzVar = new gz(context);
        this.T1 = gzVar;
        t4Var.addView(gzVar, mf.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.i2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(6.0f) + this.u0, 0, org.telegram.messenger.g0.L(6.0f) + this.u0, 0);
        t4Var.addView(frameLayout3, mf.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        org.telegram.messenger.g0.E2(this.m1);
        t4Var.addView(this.m1, mf.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        q4 q4Var = new q4(context);
        this.X1 = q4Var;
        t4Var.addView(q4Var, mf.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        org.telegram.messenger.g0.m2(new ai.v2(q4Var, 10), 12.0f, 12, arrayList);
    }

    public static String A1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? bd.M0(2131750200, null) : starGift.title;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((TL_stars.TL_starGiftUnique) starGift).title);
        sb2.append(" #");
        return k2.p1.l(r3.num, ',', sb2);
    }

    public static String G1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return bd.M0(2131749627, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return bd.M0(2131749628, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return bd.M0(2131749630, null);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return bd.M0(2131749629, null);
        }
        if (!(starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
            return "";
        }
        int i3 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        return i3 <= 0 ? "<0.1%" : ii.k.J0(i3);
    }

    public static boolean K1(int i3, long j10) {
        return j10 >= 0 ? h10.i(i3).e() == j10 : org.telegram.messenger.t3.w(5, hp.s1(i3).M0(Long.valueOf(-j10)));
    }

    public static boolean L1(int i3, long j10) {
        if (j10 >= 0) {
            return h10.i(i3).e() == j10;
        }
        TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
        return M0 != null && M0.creator;
    }

    public static boolean M1(int i3, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long o10 = org.telegram.messenger.m5.o(peer);
        if (o10 == 0) {
            return false;
        }
        if (o10 > 0) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(o10));
            if (a22 != null) {
                TLRPC.EmojiStatus emojiStatus = a22.emoji_status;
                return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.id;
            }
        } else {
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-o10));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = M0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void c2(org.telegram.ui.ActionBar.d2 d2Var) {
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2();
        b2Var.a = true;
        T.showAsSheet(d2Var, b2Var);
    }

    public static void d1(l6 l6Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        s8 F;
        TLRPC.Message message;
        gi.d dVar = l6Var.d2;
        if (dVar.R) {
            return;
        }
        TL_stars.InputSavedStarGift B1 = l6Var.B1();
        zi ziVar = l6Var.A2;
        if (ziVar == null || (message = ziVar.k) == null) {
            TL_stars.SavedStarGift savedStarGift = l6Var.y2;
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
        if (l6Var.y2 == null || (F = e9.y(l6Var.a, false).F(l6Var.Q1, false)) == null) {
            z11 = false;
        } else {
            F.m(l6Var.y2, savestargift.unsave);
            z11 = true;
        }
        ConnectionsManager.getInstance(l6Var.a).sendRequest(savestargift, new d4(l6Var, z11, document2, z12, savestargift));
    }

    public static void e1(final l6 l6Var) {
        int i3;
        long o10;
        long j10;
        long j11;
        final long e10 = h10.i(l6Var.a).e();
        final TL_stars.InputSavedStarGift B1 = l6Var.B1();
        if (B1 == null) {
            return;
        }
        zi ziVar = l6Var.A2;
        if (ziVar != null) {
            i3 = ziVar.k.date;
            boolean Q3 = ziVar.Q3();
            TLRPC.Message message = l6Var.A2.k;
            if (message == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGift.peer;
            j11 = peer != null ? org.telegram.messenger.m5.o(peer) : Q3 ? zi.B0(message) : e10;
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            o10 = peer2 != null ? org.telegram.messenger.m5.o(peer2) : Q3 ? e10 : zi.B0(l6Var.A2.k);
            j10 = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = l6Var.y2;
            if (savedStarGift == null) {
                return;
            }
            i3 = savedStarGift.date;
            o10 = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? 2666000L : org.telegram.messenger.m5.o(savedStarGift.from_id);
            j10 = l6Var.y2.convert_stars;
            j11 = l6Var.Q1;
        }
        int max = Math.max(1, (hp.s1(l6Var.a).E6 - (ConnectionsManager.getInstance(l6Var.a).getCurrentTime() - i3)) / 86400);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l6Var.getContext(), l6Var.J0);
        String M0 = bd.M0(2131750234, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(bd.G(max, "Gift2ConvertText2", (l10.A(o10) || o10 == 2666000) ? bd.M0(2131744959, null) : org.telegram.messenger.m5.t(o10), bd.H(',', "Gift2ConvertStars", (int) j10)));
        final long j12 = j10;
        final long j13 = j11;
        alertDialog$Builder.k(bd.M0(2131750241, null), new org.telegram.ui.ActionBar.p1() { // from class: ci.a4
            @Override // org.telegram.ui.ActionBar.p1
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i10) {
                l6 l6Var2 = l6.this;
                TL_stars.InputSavedStarGift inputSavedStarGift = B1;
                long j14 = j13;
                long j15 = e10;
                long j16 = j12;
                org.telegram.ui.ActionBar.s1 s1Var3 = new org.telegram.ui.ActionBar.s1(3, org.telegram.messenger.t0.b, null);
                s1Var3.r(500L);
                TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
                convertstargift.stargift = inputSavedStarGift;
                ConnectionsManager.getInstance(l6Var2.a).sendRequest(convertstargift, new i2(l6Var2, s1Var3, j14, j15, j16));
            }
        });
        k2.p1.v(null, 2131752589, alertDialog$Builder, null);
    }

    public static void f1(l6 l6Var, org.telegram.ui.ActionBar.s1 s1Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            s1Var.dismiss();
            l6Var.H2 = true;
            l6Var.j2(savedStarGift, null);
            super.show();
            return;
        }
        s1Var.dismiss();
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T != null) {
            org.telegram.ui.Components.ac Q = org.telegram.ui.Components.fc.a0(T).Q(R.raw.error, 36, bd.M0(2131748560, null));
            Q.t = true;
            Q.j();
        }
    }

    public static SpannableStringBuilder f2(String str) {
        int i3;
        int i10;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf < 0 || indexOf2 < 0 || (i10 = indexOf2 - indexOf) <= 2) {
            indexOf = -1;
            i3 = 0;
        } else {
            i3 = i10 - 2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new k4(0), indexOf, i3 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void g1(l6 l6Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        l6Var.C2 = tL_starGiftUnique;
        l6Var.k2(tL_starGiftUnique, false, null, null);
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

    public static void h1(l6 l6Var, org.telegram.ui.ActionBar.s1 s1Var, zi ziVar) {
        s1Var.dismiss();
        l6Var.F2 = true;
        l6Var.i2(ziVar, null);
        super.show();
    }

    public static void i1(l6 l6Var, boolean z10) {
        int D1 = l6Var.D1();
        if (D1 < 0) {
            return;
        }
        int i3 = (z10 ? 1 : -1) + D1;
        int i10 = l6Var.N2;
        if (i10 >= 0 && (!z10 ? i10 < D1 : i10 > D1)) {
            i3 = i10;
        }
        w8 w8Var = l6Var.z2;
        Object obj = (w8Var == null || i3 < 0 || i3 >= w8Var.e()) ? null : l6Var.z2.get(i3);
        if (obj == null) {
            return;
        }
        if ((z10 ? l6Var.W1 : l6Var.V1) != null) {
            if (obj instanceof TL_stars.SavedStarGift) {
                if (u1((z10 ? l6Var.W1 : l6Var.V1).y2, (TL_stars.SavedStarGift) obj)) {
                    return;
                }
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                if (v1((z10 ? l6Var.W1 : l6Var.V1).C2, (TL_stars.TL_starGiftUnique) obj)) {
                    return;
                }
            }
        }
        ai.j2 j2Var = new ai.j2(l6Var, l6Var.getContext(), l6Var.a, l6Var.Q1, l6Var.J0, l6Var.R1.getRootView());
        if (obj instanceof TL_stars.SavedStarGift) {
            j2Var.j2((TL_stars.SavedStarGift) obj, l6Var.z2);
        } else if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            j2Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, l6Var.z2);
        }
        org.telegram.messenger.g0.E2(j2Var.b);
        if (z10) {
            l6Var.W1 = j2Var;
        } else {
            l6Var.V1 = j2Var;
        }
    }

    public static void k1(rx0 rx0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = bd.M0(2131750395, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = bd.M0(2131750388, null);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            M0 = bd.M0(2131750396, null);
        }
        String str = M0;
        Integer[] numArr = new Integer[1];
        rx0Var.e(str, starGiftAttribute.name, G1(starGiftAttribute.rarity, numArr), null, numArr[0]);
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
        long j10 = this.Q1;
        if (j10 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = hp.s1(this.a).j1(j10);
            zi ziVar = this.A2;
            if (ziVar == null || (message3 = ziVar.k) == null) {
                TL_stars.SavedStarGift savedStarGift = this.y2;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.C2 == null || TextUtils.isEmpty(this.B2)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.B2;
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
        zi ziVar2 = this.A2;
        if (ziVar2 != null && (message2 = ziVar2.k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & TLObject.FLAG_12) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                hp s12 = hp.s1(this.a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                tL_inputSavedStarGiftChat2.peer = s12.j1(peer != null ? org.telegram.messenger.m5.o(peer) : zi.B0(this.A2.k));
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (ziVar2 != null && (message = ziVar2.k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                hp s13 = hp.s1(this.a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                tL_inputSavedStarGiftChat3.peer = s13.j1(peer2 != null ? org.telegram.messenger.m5.o(peer2) : zi.B0(this.A2.k));
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        zi ziVar3 = this.A2;
        if (ziVar3 != null) {
            TLRPC.Message message4 = ziVar3.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = ziVar3.f1();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.y2;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.C2 == null || TextUtils.isEmpty(this.B2)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.B2;
        return tL_inputSavedStarGiftSlug2;
    }

    public final String C1() {
        TL_stars.StarGift y12 = y1();
        if (!(y12 instanceof TL_stars.TL_starGiftUnique) || y12.slug == null) {
            return null;
        }
        return hp.s1(this.a).V2 + "/nft/" + y12.slug;
    }

    public final int D1() {
        int indexOf;
        w8 w8Var = this.z2;
        if (w8Var == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.y2;
        if (savedStarGift != null) {
            indexOf = w8Var.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C2;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            indexOf = w8Var.indexOf(tL_starGiftUnique);
        }
        if (indexOf >= 0) {
            return indexOf;
        }
        TL_stars.StarGift y12 = y1();
        for (int i3 = 0; i3 < this.z2.e(); i3++) {
            Object obj = this.z2.get(i3);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.y2;
                if (savedStarGift2 != null) {
                    if (u1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                        return i3;
                    }
                }
                if (y12 != null) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                    if (y12 != starGift) {
                        if ((y12 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && y12.id == starGift.id) {
                        }
                    }
                    return i3;
                }
                continue;
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && v1(this.C2, (TL_stars.TL_starGiftUnique) obj)) {
                    return i3;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void E0(int i3) {
        super.E0(i3);
        org.telegram.messenger.g0.u3(this, 0, false, null);
    }

    public final TL_stars.SavedStarGift E1(boolean z10) {
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        int i3 = (z10 ? 1 : -1) + D1;
        int i10 = this.N2;
        if (i10 >= 0 && (!z10 ? i10 < D1 : i10 > D1)) {
            i3 = i10;
        }
        w8 w8Var = this.z2;
        Object obj = (w8Var == null || i3 < 0 || i3 >= w8Var.e()) ? null : this.z2.get(i3);
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
        int i3 = (z10 ? 1 : -1) + D1;
        int i10 = this.N2;
        if (i10 >= 0 && (!z10 ? i10 < D1 : i10 > D1)) {
            i3 = i10;
        }
        w8 w8Var = this.z2;
        Object obj = (w8Var == null || i3 < 0 || i3 >= w8Var.e()) ? null : this.z2.get(i3);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    @Override // org.telegram.ui.Components.ma, org.telegram.ui.ActionBar.t2
    public final boolean G() {
        if (this.U2.c(4)) {
            boolean z10 = this.Y1.N.i0;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean H() {
        if (this.U2.c(4) && this.Y1.N.i0) {
            return false;
        }
        return this.d0;
    }

    public final TL_stars.TL_starGiftUnique H1() {
        TL_stars.StarGift y12 = y1();
        if (y12 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) y12;
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean I(MotionEvent motionEvent) {
        if (this.U2.c(4)) {
            boolean z10 = this.Y1.N.i0;
        }
        return false;
    }

    public final boolean I1(boolean z10) {
        return (E1(z10) == null && F1(z10) == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, a3 a3Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null) {
            if (a3Var != null) {
                a3Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z10) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.q3;
            withdrawstargift.stargift = B1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = B1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftwithdrawalurl, new o3(this, a3Var, twoStepVerificationActivity, z10, 0));
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        r4 r4Var = new r4(this, 0);
        this.M2 = r4Var;
        return r4Var;
    }

    @Override // org.telegram.ui.Components.ma
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
        gi.d dVar = this.d2;
        if (dVar.R || H1 == null) {
            return;
        }
        if (this.C2 != null && this.D2) {
            e10 = this.Q1;
        }
        e10 = h10.i(this.a).e();
        dg.b bVar = H1.resale_ton_only ? dg.b.b : dg.b.a;
        if (this.C2 == null || !this.D2) {
            dVar.setLoading(true);
            long j10 = e10;
            e9.x(this.a, bVar).H(H1, j10, null, true, new z1(this, null, bVar, H1, j10, null, true));
        } else {
            ai.i1 i1Var = new ai.i1(getContext(), this.J0, H1, e10);
            i1Var.C1 = new x3(this, i1Var, H1, e10, bVar, 0);
            i1Var.show();
        }
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return this.O2;
    }

    public final void O1() {
        g4 g4Var = this.S2;
        if (g4Var != null && !g4Var.J) {
            g4Var.dismiss();
        }
        String C1 = C1();
        g4 g4Var2 = new g4(this, getContext(), C1, C1, this.J0);
        this.S2 = g4Var2;
        g4Var2.l2 = new c6.i(this, 10);
        g4Var2.show();
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
        this.Z1.setAlpha(this.U2.a(0));
        this.l2.setAlpha(this.U2.a(1));
        this.u2.setAlpha(this.U2.a(2));
        this.w2.setAlpha(this.U2.a(3));
        float a10 = 1.0f - this.U2.a(4);
        FrameLayout frameLayout = this.e2;
        frameLayout.setAlpha(a10);
        k5 k5Var = this.U2;
        f6 f6Var = this.Y1;
        f6Var.d(k5Var);
        ImageView imageView = f6Var.R;
        if (this.U2.c(0) && (H1 = H1()) != null && !H1.crafted && L1(this.a, org.telegram.messenger.m5.o(H1.owner_id))) {
            zi ziVar = this.A2;
            if (ziVar != null) {
                TLRPC.Message message = ziVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.y2;
                if (savedStarGift != null) {
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                    }
                }
            }
            imageView.setVisibility(r4);
            t4 t4Var = this.R1;
            float f10 = t4Var.f();
            this.X1.setAlpha(this.U2.a(0) * Utilities.l(org.telegram.messenger.g0.z1(f10 - r6.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f))));
            t4Var.g();
            t4Var.invalidate();
            frameLayout.setVisibility(this.U2.c(4) ? 8 : 0);
            u2();
        }
        int i3 = 8;
        imageView.setVisibility(i3);
        t4 t4Var2 = this.R1;
        float f102 = t4Var2.f();
        this.X1.setAlpha(this.U2.a(0) * Utilities.l(org.telegram.messenger.g0.z1(f102 - r6.getHeight(), 0.0f, org.telegram.messenger.g0.L(32.0f))));
        t4Var2.g();
        t4Var2.invalidate();
        frameLayout.setVisibility(this.U2.c(4) ? 8 : 0);
        u2();
    }

    public final void Q1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        int i3;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            org.telegram.ui.Components.fc.b0("NULL_ERROR");
            return;
        }
        int i10 = 1;
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getPassword(), new s3(this, twoStepVerificationActivity, z10, i10), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
            }
            org.telegram.ui.Components.fc.d0(tL_error);
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.t0();
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        String M0 = bd.M0(2131749908, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(getContext());
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((bd.a0 ? 5 : 3) | 48);
        textView.setText(org.telegram.messenger.g0.X2(bd.M0(2131749912, null)));
        linearLayout.addView(textView, mf.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(bd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), bd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, null, mode);
        TextView textView2 = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.V(textView2, i11, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((bd.a0 ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.g0.X2(bd.M0(2131749911, null)));
        if (bd.a0) {
            linearLayout2.addView(textView2, mf.o(-1, -2));
            linearLayout2.addView(imageView, mf.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, mf.o(-2, -2));
            linearLayout2.addView(textView2, mf.o(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(bd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), bd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        org.telegram.ui.ActionBar.r6.t(imageView2, i11, null, mode);
        TextView textView3 = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.V(textView3, i11, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((bd.a0 ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.g0.X2(bd.M0(2131749910, null)));
        if (bd.a0) {
            linearLayout3.addView(textView3, mf.o(-1, -2));
            i3 = 5;
            linearLayout3.addView(imageView2, mf.r(-2, -2, 5));
        } else {
            i3 = 5;
            linearLayout3.addView(imageView2, mf.o(-2, -2));
            linearLayout3.addView(textView3, mf.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(bd.M0(2131749907, null), new a3.j(this, 19));
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
        } else {
            TextView textView4 = new TextView(getContext());
            org.telegram.ui.ActionBar.r6.V(textView4, i11, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.k5.m(textView4, (bd.a0 ? i3 : 3) | 48, null, 2131749909);
            linearLayout.addView(textView4, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(bd.M0(2131747839, null), null);
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.showDialog(s1Var);
        } else {
            alertDialog$Builder.p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v39 */
    public final void R1() {
        int i3;
        CharSequence V;
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        TL_wallet.nftItem nftitem;
        String str5;
        org.telegram.ui.Wallet.e5 e5Var = this.Z2;
        if (e5Var == null) {
            return;
        }
        i3 = ((org.telegram.ui.ActionBar.d2) e5Var.c).currentAccount;
        if (!org.telegram.ui.Wallet.b8.F(i3, e5Var.a.slug)) {
            org.telegram.ui.Wallet.e5 e5Var2 = this.Z2;
            org.telegram.ui.Wallet.b8 b8Var = e5Var2.c.k0;
            if (b8Var == null || (nftitem = e5Var2.b) == null || (str5 = nftitem.address) == null || !str5.equals(b8Var.Q0)) {
                Context context = getContext();
                int i10 = this.a;
                org.telegram.ui.Components.fc k10 = k();
                org.telegram.ui.ActionBar.e6 e6Var = this.J0;
                TL_stars.TL_starGiftUnique H1 = H1();
                ArrayList arrayList = new ArrayList(((org.telegram.messenger.o0) hp.s1(i10).x7.m0.b).c);
                if (arrayList.isEmpty()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                boolean z10 = false;
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    String str6 = (String) arrayList.get(i11);
                    String str7 = "[^\\p{L}\\p{N}]";
                    String replaceAll = str6.replaceAll("[^\\p{L}\\p{N}]", "");
                    Locale locale = Locale.ROOT;
                    String lowerCase = replaceAll.toLowerCase(locale);
                    if (H1 == null || (str4 = H1.title) == null || !lowerCase.equals(str4.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(locale))) {
                        e9 y9 = e9.y(i10, z10);
                        y9.U();
                        ArrayList arrayList3 = y9.H;
                        int size2 = arrayList3.size();
                        ?? r22 = arrayList3;
                        ?? r32 = z10;
                        while (true) {
                            if (r32 >= size2) {
                                j10 = 0;
                                str = null;
                                break;
                            }
                            Object obj = r22.get(r32);
                            int i13 = r32 + 1;
                            Object obj2 = r22;
                            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                            if (starGift != null && (str3 = starGift.title) != null) {
                                str2 = str7;
                                if (lowerCase.equals(str3.replaceAll(str7, "").toLowerCase(Locale.ROOT))) {
                                    str = starGift.title;
                                    j10 = starGift.id;
                                    break;
                                }
                            } else {
                                str2 = str7;
                            }
                            r32 = i13;
                            r22 = obj2;
                            str7 = str2;
                        }
                    } else {
                        str = H1.title;
                        j10 = H1.gift_id;
                    }
                    if (str == null) {
                        str = str6.replaceAll("(?<=[a-z0-9])(?=[A-Z])", " ");
                    }
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new j4(new boolean[1], i10, context, e6Var, j10, str, str6), 0, spannableString.length(), 33);
                    arrayList2.add(spannableString);
                    z10 = false;
                    i11 = i12;
                    H1 = H1;
                }
                int i14 = z10 ? 1 : 0;
                if (arrayList2.size() == 1) {
                    Object[] objArr = new Object[1];
                    objArr[i14] = arrayList2.get(i14);
                    V = bd.V(null, null, 2131743117, objArr);
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int i15 = i14;
                    for (int i16 = 1; i15 < arrayList2.size() - i16; i16 = 1) {
                        if (i15 > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        spannableStringBuilder.append((CharSequence) arrayList2.get(i15));
                        i15++;
                    }
                    Object h = k2.p1.h(1, arrayList2);
                    Object[] objArr2 = new Object[2];
                    objArr2[i14] = spannableStringBuilder;
                    objArr2[1] = h;
                    V = bd.V(null, null, 2131743118, objArr2);
                }
                org.telegram.ui.Components.ac M = k10.M(context.getResources().getDrawable(R.drawable.filled_card_color_28).mutate(), V);
                org.telegram.ui.Components.fb fbVar = M.e;
                if (fbVar instanceof org.telegram.ui.Components.ib) {
                    TextView textView = ((org.telegram.ui.Components.ib) fbVar).b;
                    textView.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                    textView.setEllipsize(null);
                }
                M.j();
                return;
            }
        }
        org.telegram.ui.Wallet.e5 e5Var3 = this.Z2;
        dismiss();
        Objects.requireNonNull(e5Var3);
        org.telegram.messenger.g0.i3(new d1(e5Var3, 1), 250L);
    }

    public final void S1() {
        if (h10.i(this.a).q() && (M1(this.a, H1()) || this.R2)) {
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
        long o10 = org.telegram.messenger.m5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(H1.title);
        sb2.append(" #");
        this.v2.setText(bd.a0(null, null, 2131749841, k2.p1.l(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131749843, null));
        if (!h10.i(this.a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.Q2 == null) {
                this.Q2 = new wp(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.Q2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        gi.d dVar = this.d2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new r1(this, 4));
        this.Y1.setWearPreview(hp.s1(this.a).e2(o10));
        s2(2, true, null);
    }

    public final void T1(boolean z10) {
        int i3;
        zi ziVar = this.A2;
        int i10 = 0;
        if (ziVar != null) {
            TLRPC.Message message = ziVar.k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i3 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i3 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.y2;
            if (savedStarGift != null) {
                i3 = savedStarGift.can_craft_at;
            }
            i3 = 0;
        }
        int i11 = 1;
        if (i3 > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
            String M0 = bd.M0(2131749785, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = bd.a0(null, null, 2131749786, bd.x(i3, true));
            k2.p1.B(null, 2131747839, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(H1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getContext(), this.J0);
            String M02 = bd.M0(2131749800, null);
            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
            s1Var2.S = M02;
            s1Var2.U = bd.M0(2131749801, null);
            k2.p1.B(null, 2131747839, alertDialog$Builder2, null);
            return;
        }
        f6 f6Var = this.Y1;
        if (z10) {
            f6Var.N.a(this.a, H1.gift_id, H1.getDocument(), H1.title);
            if (o1()) {
                h5 h5Var = f6Var.N;
                TL_stars.TL_starGiftUnique H12 = H1();
                if (H12 == null) {
                    h5Var.getClass();
                } else {
                    while (true) {
                        f5[] f5VarArr = h5Var.n;
                        if (i10 >= f5VarArr.length) {
                            break;
                        }
                        f5 f5Var = f5VarArr[i10];
                        TL_stars.StarGift starGift = f5Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            f5Var.a(H12, true);
                            break;
                        }
                        i10++;
                    }
                    h5Var.d(true);
                }
            }
        }
        h5 h5Var2 = f6Var.N;
        h5 h5Var3 = f6Var.N;
        h5Var2.setOnCraft(new y1(this, i11));
        if (this.P2 == null) {
            ai.g6 g6Var = new ai.g6(this.a, H1.gift_id);
            this.P2 = g6Var;
            g6Var.a();
        }
        h5Var3.setOnAddGift(new z3(this, H1, i11));
        h5Var3.setOnClose(new s1(this, 23));
        s2(4, true, null);
    }

    public final void U1(long j10) {
        gi.l3 l3Var = this.r3;
        if (l3Var != null) {
            l3Var.f(true);
            this.r3 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T == null || l10.A(j10)) {
            return;
        }
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
            if (j10 == h10.i(this.a).e()) {
                bundle.putBoolean("my_profile", true);
            }
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putBoolean("open_gifts", true);
        T.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void V1(boolean z10, sf.b bVar, Runnable runnable) {
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        int i3 = z10 ? 3 : 2;
        l3 l3Var = new l3(this, twoStepVerificationActivity, z10, 0);
        twoStepVerificationActivity.a0 = i3;
        twoStepVerificationActivity.c0 = l3Var;
        twoStepVerificationActivity.b0 = z1();
        twoStepVerificationActivity.x0(new ai.k3(this, runnable, bVar, twoStepVerificationActivity, 15));
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
        int i3;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i10;
        org.telegram.ui.Components.ia iaVar;
        gg0 gg0Var;
        int i11;
        TLRPC.Message message2;
        TLRPC.Message message3;
        gi.l3 l3Var = this.r3;
        if (l3Var != null) {
            l3Var.f(true);
            this.r3 = null;
        }
        zi ziVar = this.A2;
        if (ziVar != null && (message3 = ziVar.k) != null) {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i3 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
                if (i3 <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                    Context context = getContext();
                    zi ziVar2 = this.A2;
                    if (ziVar2 != null && (message2 = ziVar2.k) != null) {
                        TLRPC.MessageAction messageAction2 = message2.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            i11 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                            q2(i11 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                            return;
                        }
                    }
                    TL_stars.SavedStarGift savedStarGift = this.y2;
                    i11 = savedStarGift != null ? savedStarGift.can_transfer_at : 0;
                    q2(i11 - ConnectionsManager.getInstance(this.a).getCurrentTime(), context, false);
                    return;
                }
                TL_stars.SavedStarGift savedStarGift2 = this.y2;
                if (savedStarGift2 != null) {
                    TL_stars.StarGift starGift = savedStarGift2.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        i10 = savedStarGift2.can_export_at;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
                        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                        Context context2 = getContext();
                        int i12 = this.a;
                        xg.e1[] e1VarArr = {new xg.e1(context2, i12, org.telegram.messenger.v1.a(i12).b(), 3, this.J0)};
                        xg.e1 e1Var = e1VarArr[0];
                        e1Var.s2 = bd.M0(2131749922, null);
                        iaVar = e1Var.m1;
                        if (iaVar != null) {
                            iaVar.setTitle(e1Var.O0());
                        }
                        gg0Var = e1Var.U1;
                        if (gg0Var != null) {
                            gg0Var.setText(e1Var.O0());
                        }
                        int max = currentTime <= i10 ? 0 : Math.max(1, Math.round(Math.max(0, i10 - currentTime) / 86400.0f));
                        xg.e1 e1Var2 = e1VarArr[0];
                        e1Var2.A2 = true;
                        e1Var2.B2 = max;
                        e1Var2.o1(false, true);
                        xg.e1 e1Var3 = e1VarArr[0];
                        e1Var3.u2 = new e4(this, currentTime, i10, max, e1VarArr, tL_starGiftUnique2);
                        e1Var3.show();
                        return;
                    }
                }
                zi ziVar3 = this.A2;
                if (ziVar3 == null || (message = ziVar3.k) == null) {
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
                        xg.e1[] e1VarArr2 = {new xg.e1(context22, i122, org.telegram.messenger.v1.a(i122).b(), 3, this.J0)};
                        xg.e1 e1Var4 = e1VarArr2[0];
                        e1Var4.s2 = bd.M0(2131749922, null);
                        iaVar = e1Var4.m1;
                        if (iaVar != null) {
                        }
                        gg0Var = e1Var4.U1;
                        if (gg0Var != null) {
                        }
                        if (currentTime2 <= i10) {
                        }
                        xg.e1 e1Var22 = e1VarArr2[0];
                        e1Var22.A2 = true;
                        e1Var22.B2 = max;
                        e1Var22.o1(false, true);
                        xg.e1 e1Var32 = e1VarArr2[0];
                        e1Var32.u2 = new e4(this, currentTime2, i10, max, e1VarArr2, tL_starGiftUnique22);
                        e1Var32.show();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        TL_stars.SavedStarGift savedStarGift3 = this.y2;
        i3 = savedStarGift3 != null ? savedStarGift3.can_transfer_at : 0;
        if (i3 <= ConnectionsManager.getInstance(this.a).getCurrentTime()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X1(long j10, long j11, boolean z10, u10 u10Var) {
        String str;
        TLRPC.Chat chat;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (j10 >= 0) {
            TLRPC.User a22 = hp.s1(this.a).a2(Long.valueOf(j10));
            str = l10.k(a22);
            chat = a22;
        } else {
            TLRPC.Chat M0 = hp.s1(this.a).M0(Long.valueOf(-j10));
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
        linearLayout.addView(new j5(getContext(), H1, chat), mf.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, this.J0);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.g0.X2(j11 > 0 ? bd.K("Gift2TransferPriceText", (int) j11, ',', z1(), org.telegram.messenger.m5.t(j10)) : bd.a0(null, null, 2131749921, z1(), str)));
        linearLayout.addView(textView, mf.t(-1, -2, 48, 24, 4, 24, 4));
        rx0 rx0Var = new rx0(getContext(), this.J0);
        k1(rx0Var, e9.l(H1.attributes, TL_stars.starGiftAttributeModel.class));
        k1(rx0Var, e9.l(H1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        k1(rx0Var, e9.l(H1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(H1.slug) && (H1.flags & 256) != 0) {
            org.telegram.messenger.r1 i3 = org.telegram.messenger.r1.i();
            long j12 = H1.value_amount;
            String str2 = H1.value_currency;
            int h = org.telegram.messenger.r1.i().h(H1.value_currency);
            i3.getClass();
            rx0Var.c(bd.M0(2131749599, null), t4.c.f("~", org.telegram.messenger.r1.g(str2, h, j12, true)), null, null);
        }
        linearLayout.addView(rx0Var, mf.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.k(j11 > 0 ? wb.T0(bd.a0(null, null, 2131749928, Integer.valueOf((int) j11))) : bd.M0(2131749929, null), new a1.c(u10Var, 13));
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.a1 = z10;
        s1Var.show();
    }

    public final void Y1(long j10, u10 u10Var) {
        TLRPC.Message message;
        long j11;
        TL_stars.SavedStarGift savedStarGift = this.y2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            zi ziVar = this.A2;
            if (ziVar == null || (message = ziVar.k) == null) {
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
                j11 = tL_messageActionStarGiftUnique.transfer_stars;
            }
        } else {
            j11 = savedStarGift.transfer_stars;
        }
        X1(j10, j11, true, u10Var);
    }

    @Override // org.telegram.ui.Components.ma
    public final boolean Z0() {
        return false;
    }

    public final void Z1() {
        TL_stars.InputSavedStarGift B1;
        long j10;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        gi.l3 l3Var = this.r3;
        if (l3Var != null) {
            l3Var.f(true);
            this.r3 = null;
        }
        if (this.V2 == null && (B1 = B1()) != null) {
            zi ziVar = this.A2;
            long j13 = this.Q1;
            if (ziVar != null) {
                TLRPC.MessageAction messageAction = ziVar.k.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                j11 = tL_messageActionStarGift.gift.id;
                j12 = tL_messageActionStarGift.upgrade_stars;
                z10 = tL_messageActionStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                z11 = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
                j10 = 0;
                z12 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                z13 = tL_messageActionStarGift.prepaid_upgrade ? org.telegram.messenger.m5.o(tL_messageActionStarGift.from_id) != this.A2.Z0() : tL_messageActionStarGift.upgrade_separate;
            } else {
                j10 = 0;
                TL_stars.SavedStarGift savedStarGift = this.y2;
                if (savedStarGift == null) {
                    return;
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                j11 = starGift.id;
                j12 = savedStarGift.upgrade_stars;
                z10 = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                z11 = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
                z12 = j13 < 0;
                TL_stars.SavedStarGift savedStarGift2 = this.y2;
                str = savedStarGift2.prepaid_upgrade_hash;
                z13 = savedStarGift2.upgrade_separate;
            }
            TextView textView = this.q2;
            if (z10) {
                textView.setText(bd.M0(z12 ? 2131750406 : 2131750407, null));
            } else if (z11) {
                textView.setText(bd.M0(2131750404, null));
            } else {
                textView.setText(bd.M0(2131750405, null));
            }
            boolean z14 = (z10 || j12 <= j10 || z13) ? false : true;
            wo woVar = this.p2;
            woVar.a(z14, false);
            ArrayList arrayList = this.h3;
            if (arrayList != null && (j12 > j10 || this.l3 != null)) {
                a2();
                return;
            }
            if (arrayList == null) {
                e9.y(this.a, false).K(j11, new k3(this, 2));
            }
            if (j12 > j10 || this.l3 != null) {
                return;
            }
            this.k3 = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = woVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = hp.s1(this.a).j1(j13);
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            JSONObject u10 = ii.a3.u(this.J0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new c4(this, 0));
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
        long j10;
        boolean z10;
        boolean z11;
        char c2;
        int i3;
        int i10;
        String M0;
        String M02;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        zi ziVar = this.A2;
        if (ziVar != null) {
            TLRPC.MessageAction messageAction = ziVar.k.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j10 = tL_messageActionStarGift.upgrade_stars;
            if (j10 <= 0) {
            }
            z10 = false;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.y2;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
            }
            z10 = false;
        }
        if (this.h3 != null) {
            if (j10 > 0 || this.l3 != null) {
                long j11 = 0;
                if (this.l3 != null) {
                    for (int i11 = 0; i11 < this.l3.invoice.prices.size(); i11++) {
                        j11 += this.l3.invoice.prices.get(i11).amount;
                    }
                }
                u5 u5Var = this.I2;
                f6 f6Var = this.Y1;
                if (u5Var == null) {
                    this.I2 = new u5(f6Var);
                }
                u5 u5Var2 = this.I2;
                ArrayList arrayList = this.h3;
                f6 f6Var2 = u5Var2.a;
                ArrayList arrayList2 = u5Var2.g;
                ArrayList arrayList3 = u5Var2.f;
                ArrayList arrayList4 = u5Var2.e;
                int size = arrayList4.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList4.get(i12);
                    i12++;
                    ((s5) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList m10 = e9.m(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = m10.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = m10.get(i13);
                    i13++;
                    s5 s5Var = new s5(f6Var2.c, (TL_stars.starGiftAttributeModel) obj2);
                    if (f6Var2.isAttachedToWindow() && s5Var.c) {
                        s5Var.d.P();
                    }
                    arrayList4.add(s5Var);
                }
                ArrayList m11 = e9.m(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = m11.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = m11.get(i14);
                    i14++;
                    arrayList3.add(new r5((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList m12 = e9.m(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = m12.size();
                int i15 = 0;
                while (i15 < size4) {
                    Object obj4 = m12.get(i15);
                    i15++;
                    arrayList2.add(new t5((TL_stars.starGiftAttributePattern) obj4));
                }
                f6Var.setPreviewingAttributes(this.h3);
                long j12 = this.Q1;
                if (z10) {
                    z11 = true;
                    f6Var.i(1, bd.M0(2131750070, null), bd.a0(null, null, 2131750071, org.telegram.messenger.m5.s(this.a, j12)), null);
                } else {
                    z11 = true;
                    f6Var.i(1, bd.M0(2131749859, null), bd.M0(2131749860, null), null);
                }
                gi.d dVar = this.d2;
                dVar.setFilled(z11);
                dVar.g(null, z11);
                if (j11 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
                    if (this.j3 != null) {
                        for (int i16 = 0; i16 < this.j3.size(); i16++) {
                            starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) this.j3.get(i16);
                            if (starGiftUpgradePrice.date >= currentTime) {
                                break;
                            }
                        }
                    }
                    starGiftUpgradePrice = null;
                    ArrayList arrayList5 = this.i3;
                    FrameLayout frameLayout = this.g2;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.f2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2("**" + bd.M0(2131749878, null) + "**", new s1(this, 3)), false, org.telegram.messenger.g0.L(0.6666667f), org.telegram.messenger.g0.L(0.66f)));
                    }
                    u2();
                    wp[] wpVarArr = this.m3;
                    if (z10) {
                        dVar.i(wb.U0(bd.a0(null, null, 2131750075, Long.valueOf(j11)), 1.13f, wpVarArr), true, true);
                    } else {
                        dVar.i(wb.U0(bd.a0(null, null, 2131749885, Long.valueOf(j11)), 1.13f, wpVarArr), true, true);
                    }
                } else {
                    dVar.i(bd.M0(2131751817, null), true, true);
                }
                dVar.setOnClickListener(new r1(this, 6));
                View view = this.n2;
                LinearLayout linearLayout = this.o2;
                if (z10) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    c2 = 0;
                } else {
                    c2 = 0;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                }
                ii.j[] jVarArr = this.m2;
                if (z10) {
                    ii.j jVar = jVarArr[c2];
                    String M03 = bd.M0(2131749873, null);
                    if (z10) {
                        char c10 = c2;
                        i10 = 1;
                        i3 = 2;
                        Object[] objArr = new Object[1];
                        objArr[c10] = org.telegram.messenger.m5.s(this.a, j12);
                        M0 = bd.a0(null, null, 2131750074, objArr);
                    } else {
                        i10 = 1;
                        i3 = 2;
                        M0 = bd.M0(2131749875, null);
                    }
                    jVar.a(R.drawable.menu_feature_unique, M03, M0);
                    ii.j jVar2 = jVarArr[i10];
                    String M04 = bd.M0(2131749870, null);
                    if (z10) {
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = org.telegram.messenger.m5.s(this.a, j12);
                        M02 = bd.a0(null, null, 2131750073, objArr2);
                    } else {
                        M02 = bd.M0(2131749872, null);
                    }
                    jVar2.a(R.drawable.menu_feature_transfer, M04, M02);
                    jVarArr[i3].a(R.drawable.menu_feature_tradable, bd.M0(2131749867, null), z10 ? bd.a0(null, null, 2131750072, org.telegram.messenger.m5.s(this.a, j12)) : bd.M0(2131749869, null));
                } else {
                    i3 = 2;
                    jVarArr[c2].a(R.drawable.menu_feature_unique, bd.M0(2131749873, null), bd.M0(2131749583, null));
                    jVarArr[1].a(R.drawable.menu_feature_tradable, bd.M0(2131749867, null), bd.M0(2131749581, null));
                    jVarArr[2].a(R.drawable.menu_wear, bd.M0(2131749578, null), bd.M0(2131749579, null));
                }
                org.telegram.messenger.g0.h3(new t1(this, j11, i3));
            }
        }
    }

    public final void b2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        if (this.Y2 == null || H1 == null || TextUtils.isEmpty(H1.slug)) {
            return;
        }
        Context context = getContext();
        int i3 = this.a;
        xg.e1[] e1VarArr = {new xg.e1(context, i3, org.telegram.messenger.v1.a(i3).b(), 3, this.J0)};
        xg.e1 e1Var = e1VarArr[0];
        e1Var.s2 = bd.M0(2131749922, null);
        org.telegram.ui.Components.ia iaVar = e1Var.m1;
        if (iaVar != null) {
            iaVar.setTitle(e1Var.O0());
        }
        gg0 gg0Var = e1Var.U1;
        if (gg0Var != null) {
            gg0Var.setText(e1Var.O0());
        }
        xg.e1 e1Var2 = e1VarArr[0];
        e1Var2.z2 = true;
        e1Var2.o1(false, true);
        xg.e1 e1Var3 = e1VarArr[0];
        e1Var3.u2 = new ai.o1(5, this, e1VarArr);
        e1Var3.show();
    }

    public final SpannableStringBuilder d2(TLRPC.Peer peer) {
        if (peer != null) {
            String r5 = org.telegram.messenger.m5.r(hp.s1(this.a).e2(org.telegram.messenger.m5.o(peer)));
            if (!TextUtils.isEmpty(r5)) {
                return org.telegram.messenger.g0.U2(bd.a0(null, null, 2131750051, t4.c.f("@", r5)), new m3(this, r5, 8));
            }
        }
        return null;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.G3) {
            if (this.z2 == ((v8) objArr[1])) {
                h5 h5Var = this.Y1.N;
                if (h5Var == null || !h5Var.i0) {
                    v2();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        if (this.U2.c(4) && this.Y1.N.i0) {
            return;
        }
        ai.g6 g6Var = this.P2;
        if (g6Var != null) {
            g6Var.b();
            this.P2 = null;
        }
        u5 u5Var = this.I2;
        if (u5Var != null) {
            u5Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return d2(starGift.released_by);
    }

    public final void h2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, w8 w8Var) {
        u5 u5Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.B2 = str;
        this.C2 = tL_starGiftUnique;
        this.z2 = w8Var;
        this.D2 = (tL_starGiftUnique.resell_amount == null || K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.J2 && (u5Var = this.I2) != null && u5Var.o && (tL_starGiftUnique2 = u5Var.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            u5Var.a();
            this.I2 = null;
            f6 f6Var = this.Y1;
            f6Var.b.setAlpha(1.0f);
            f6Var.c.setAlpha(0.0f);
        }
        this.X1.b(this.a, this.y2);
        k2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z10 = tL_starGiftUnique.host_id != null;
        TL_wallet.walletTransaction wallettransaction = this.b3;
        s70 s70Var = this.a2;
        if (wallettransaction != null || !z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            s70Var.setVisibility(8);
        } else {
            s70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(2131750189, null), new m3(this, str3, 3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            s70Var.setVisibility(0);
            org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.q5, this.J0);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.b3;
        s70 s70Var2 = this.c2;
        if (wallettransaction2 != null || z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            s70Var2.setVisibility(8);
        } else {
            s70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(2131750189, null), new m3(this, str3, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            s70Var2.setVisibility(0);
        }
        w2();
        if (this.D2) {
            l2(tL_starGiftUnique);
            this.d2.setOnClickListener(new r1(this, 12));
        }
        if (this.X2) {
            s2(0, false, null);
            this.k1.n0(1);
            this.X2 = false;
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
        r7 = org.telegram.messenger.bd.a0(null, null, 2131750173, r34);
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
    
        r7 = org.telegram.messenger.bd.a0(null, null, 2131750151, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x03eb, code lost:
    
        if (r24 == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x03ed, code lost:
    
        r7 = "Gift2InfoOutConverted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x03f2, code lost:
    
        r7 = org.telegram.messenger.bd.K(r7, (int) r9, ',', r34);
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
    
        r7 = org.telegram.messenger.bd.H(',', r7, (int) r9);
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
    /* JADX WARN: Type inference failed for: r14v30, types: [org.telegram.ui.Components.hc[], org.telegram.ui.Components.qx0[], org.telegram.ui.Components.wp[]] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i2(zi ziVar, w8 w8Var) {
        long j10;
        TLRPC.Peer peer;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.Peer peer2;
        long j11;
        long j12;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i3;
        boolean z12;
        boolean z13;
        boolean z14;
        TLRPC.Peer peer3;
        boolean z15;
        String str;
        boolean z16;
        boolean z17;
        String M0;
        gi.d dVar;
        boolean z18;
        String str2;
        String str3;
        char c2;
        CharSequence charSequence;
        int i10;
        CharSequence concat;
        int i11;
        rx0 rx0Var;
        gi.d dVar2;
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
        u5 u5Var;
        String M04;
        boolean z23;
        TLObject e22;
        boolean z24;
        u5 u5Var2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.InputSavedStarGift B1;
        if (ziVar == null || ziVar.k == null) {
            return;
        }
        this.x2 = false;
        this.y2 = null;
        this.A2 = ziVar;
        this.z2 = w8Var;
        this.X1.set(ziVar);
        long e10 = h10.i(this.a).e();
        boolean z25 = zi.B0(ziVar.k) == e10;
        TLRPC.MessageAction messageAction = ziVar.k.action;
        boolean z26 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        int i14 = 3;
        f6 f6Var = this.Y1;
        gi.d dVar3 = this.d2;
        if (z26 || (((z23 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
            if (!this.J2 && (u5Var = this.I2) != null && u5Var.o && u5Var.l != null) {
                u5Var.a();
                this.I2 = null;
                f6Var.b.setVisibility(0);
                f6Var.c.setVisibility(4);
            }
            boolean Q3 = z25 ? false : ziVar.Q3();
            TLRPC.Message message = ziVar.k;
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
                j10 = e10;
                long j13 = tL_messageActionStarGift.convert_stars;
                j12 = tL_messageActionStarGift.upgrade_stars;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageActionStarGift.message;
                TLRPC.Peer peer4 = tL_messageActionStarGift.from_id;
                TLRPC.Peer peer5 = tL_messageActionStarGift.peer;
                z15 = tL_messageActionStarGift.prepaid_upgrade;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                TLRPC.Peer peer6 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
                peer2 = peer4;
                peer = peer5;
                z10 = z28;
                i3 = tL_messageActionStarGift.gift_num;
                tL_textWithEntities = tL_textWithEntities2;
                peer3 = peer6;
                z13 = z27;
                z14 = z30;
                z11 = z29;
                starGift = starGift3;
                z12 = z31;
                j11 = j13;
            } else {
                j10 = e10;
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
                j11 = 0;
                j12 = 0;
                tL_textWithEntities = null;
                i3 = 0;
                z12 = false;
                z13 = false;
                z14 = false;
                peer3 = null;
                z15 = false;
                str = null;
            }
            long j14 = this.Q1;
            String t10 = org.telegram.messenger.m5.t(j14);
            z16 = z25;
            boolean z34 = Q3;
            boolean t11 = l10.t(hp.s1(this.a).a2(Long.valueOf(j14)));
            boolean z35 = peer != null && org.telegram.messenger.m5.o(peer) < 0;
            boolean M1 = M1(this.a, H1());
            C1();
            f6Var.f(starGift, false, false, M1);
            f6Var.setShowOptions(p1());
            CharSequence charSequence4 = "";
            int i16 = 2;
            if (z16) {
                if (i3 == 0 || starGift.title == null) {
                    z17 = z11;
                    str5 = null;
                    M03 = bd.M0(2131749948, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    z17 = z11;
                    sb2.append(starGift.title);
                    sb2.append(" #");
                    M03 = k2.p1.l(i3, ',', sb2);
                    str5 = null;
                }
                this.O2 = M03;
                if (z17) {
                    X2 = str5;
                } else {
                    if (z12) {
                        charSequence3 = org.telegram.messenger.g0.X2(bd.M0(2131750005, str5));
                    } else if (j11 > 0) {
                        charSequence3 = org.telegram.messenger.g0.X2(bd.H(',', z13 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j11));
                    } else {
                        X2 = org.telegram.messenger.g0.X2(bd.M0(2131750012, null));
                    }
                    X2 = charSequence3;
                }
                f6Var.i(0, M03, X2, e2(starGift));
            } else {
                z17 = z11;
                if (z35 && !this.x2) {
                    f6Var.i(0, bd.M0(2131749950, null), null, e2(starGift));
                } else if ((z34 || z12) && j12 > 0) {
                    String M05 = bd.M0(z34 ? 2131749945 : 2131749949, null);
                    this.O2 = M05;
                    f6Var.i(0, M05, z17 ? null : !z34 ? bd.M0(2131750156, null) : bd.a0(null, null, 2131750157, t10), e2(starGift));
                } else {
                    if (i3 == 0 || starGift.title == null) {
                        M0 = bd.M0(z34 ? 2131749945 : 2131749949, null);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(starGift.title);
                        sb3.append(" #");
                        M0 = k2.p1.l(i3, ',', sb3);
                    }
                    this.O2 = M0;
                    if (z17) {
                        dVar = dVar3;
                        z18 = z12;
                        concat = null;
                        i10 = 0;
                    } else {
                        if (!t11 && B1() != null) {
                            zi ziVar2 = this.A2;
                            if (ziVar2 != null) {
                                TLRPC.MessageAction messageAction3 = ziVar2.k.action;
                                if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                    boolean z36 = tL_messageActionStarGift2.peer != null;
                                    ziVar2.Q3();
                                    zi.B0(this.A2.k);
                                    h10.i(this.a).e();
                                    boolean z37 = z36;
                                    int currentTime = hp.s1(this.a).E6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.A2.k.date);
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
                                        str3 = bd.a0(null, null, (!z18 || j12 <= 0) ? 2131750174 : 2131750173, t10);
                                    } else {
                                        str2 = null;
                                        str3 = bd.M0(!z10 ? z35 ? 2131750181 : 2131750186 : z35 ? 2131750180 : 2131750185, null);
                                    }
                                }
                            } else {
                                dVar = dVar3;
                                z18 = z12;
                                TL_stars.SavedStarGift savedStarGift = this.y2;
                                if (savedStarGift != null) {
                                    int currentTime2 = hp.s1(this.a).E6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                                    if (L1(this.a, j14)) {
                                        int i17 = this.y2.flags;
                                        if (((j14 < 0 ? 2048 : 8) & i17) != 0) {
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
                            if (t11 && n1()) {
                                c2 = 1;
                                charSequence = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(bd.M0(2131750118, str2).replace(' ', (char) 160), new s1(this, 10)), true);
                            } else {
                                c2 = 1;
                                charSequence = "";
                            }
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i10 = 0;
                            charSequenceArr[0] = X22;
                            charSequenceArr[c2] = " ";
                            charSequenceArr[2] = charSequence;
                            concat = TextUtils.concat(charSequenceArr);
                        }
                        dVar = dVar3;
                        z18 = z12;
                        if (z34) {
                        }
                        SpannableStringBuilder X222 = org.telegram.messenger.g0.X2(str3);
                        if (t11) {
                        }
                        c2 = 1;
                        charSequence = "";
                        CharSequence[] charSequenceArr2 = new CharSequence[3];
                        i10 = 0;
                        charSequenceArr2[0] = X222;
                        charSequenceArr2[c2] = " ";
                        charSequenceArr2[2] = charSequence;
                        concat = TextUtils.concat(charSequenceArr2);
                    }
                    f6Var.i(i10, M0, concat, e2(starGift));
                    rx0Var = this.b2;
                    rx0Var.removeAllViews();
                    long o10 = peer2 == null ? org.telegram.messenger.m5.o(peer2) : z34 ? j10 : j14;
                    if (peer == null) {
                        j14 = org.telegram.messenger.m5.o(peer);
                    } else if (!z34) {
                        j14 = j10;
                    }
                    TLRPC.User a22 = hp.s1(this.a).a2(Long.valueOf(o10));
                    int i18 = 7;
                    if (peer3 == null) {
                        long o11 = org.telegram.messenger.m5.o(peer3);
                        this.b2.m(bd.M0(2131749944, null), this.a, o11, new t1(this, o11, i18), null, z35 ? null : new t1(this, o11, 8));
                    } else {
                        if (o10 != j10 || z15 || z35) {
                            this.b2.m(bd.M0(2131750201, null), this.a, o10, new t1(this, o10, 9), (o10 == j10 || o10 == 2666000 || l10.x(a22) || t11 || z35) ? null : bd.M0(2131750292, null), z35 ? null : new t1(this, o10, 10));
                        }
                        if (j14 != j10 || z35) {
                            this.b2.m(bd.M0(2131749944, null), this.a, j14, new t1(this, j14, 11), null, z35 ? null : new t1(this, j14, 12));
                        }
                    }
                    rx0Var.g(i15, bd.M0(2131744970, null));
                    if (starGift.stars > 0) {
                        String M06 = bd.M0(2131749855, null);
                        String l10 = k2.p1.l(starGift.stars + j12, ',', new StringBuilder("⭐️ "));
                        if (!n1() || z17) {
                            r14 = 0;
                        } else {
                            r14 = 0;
                            charSequence4 = org.telegram.ui.Components.ic.b(bd.H(',', "Gift2ButtonSell", (int) j11), new s1(this, 7), this.J0, null);
                        }
                        rx0Var.c(M06, wb.a1(false, TextUtils.concat(l10, " ", charSequence4), 0.8f, r14), r14, r14);
                    }
                    if (starGift.limited && !z17) {
                        wb.H0(rx0Var, this.a, starGift, this.J0);
                    }
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z17) {
                        rx0Var.b(tL_textWithEntities.text, tL_textWithEntities.entities);
                    }
                    if (z34 && z18 && !z17) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                        if (this.W2 == null) {
                            dVar2 = dVar;
                            i13 = 0;
                            this.W2 = new wp(0, new g6(dVar2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0)));
                        } else {
                            dVar2 = dVar;
                            i13 = 0;
                        }
                        spannableStringBuilder.setSpan(this.W2, i13, 1, 33);
                        if (j12 > 0) {
                            charSequence2 = null;
                            M02 = bd.M0(2131749883, null);
                        } else {
                            charSequence2 = null;
                            M02 = bd.M0(2131749882, null);
                        }
                        spannableStringBuilder.append((CharSequence) M02);
                        dVar2.setFilled(true);
                        dVar2.i(spannableStringBuilder, !this.X2, true);
                        dVar2.g(charSequence2, !this.X2);
                        dVar2.setOnClickListener(new r1(this, 16));
                    } else {
                        dVar2 = dVar;
                        if (this.k2 || this.S1 == null || this.z2 == null || D1() < 0 || this.z2.b(D1()) < 0) {
                            if ((starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                                z19 = true;
                                str4 = null;
                                dVar2.setFilled(true);
                                dVar2.i(bd.M0(2131747839, null), !this.X2, true);
                                dVar2.g(null, !this.X2);
                                dVar2.setOnClickListener(new r1(this, 14));
                            } else {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("^  ");
                                if (this.W2 == null) {
                                    i12 = 0;
                                    this.W2 = new wp(0, new g6(dVar2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0)));
                                } else {
                                    i12 = 0;
                                }
                                z19 = true;
                                spannableStringBuilder2.setSpan(this.W2, i12, 1, 33);
                                str4 = null;
                                spannableStringBuilder2.append((CharSequence) bd.M0(2131750199, null));
                                dVar2.setFilled(true);
                                dVar2.i(spannableStringBuilder2, !this.X2, true);
                                dVar2.g(null, !this.X2);
                                dVar2.setOnClickListener(new r1(this, 13));
                            }
                            z21 = z10;
                            z22 = z34;
                        } else {
                            dVar2.setFilled(false);
                            int b10 = this.z2.b(D1());
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) bd.M0(2131749863, null));
                            Object obj = this.z2.get(b10);
                            if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                                z20 = true;
                            } else {
                                spannableStringBuilder3.append((CharSequence) " e");
                                z20 = true;
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.p5(document, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
                            }
                            dVar2.i(spannableStringBuilder3, this.X2 ^ z20, z20);
                            dVar2.g(null, this.X2 ^ z20);
                            dVar2.setOnClickListener(new j2(this, b10, i16));
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
            rx0Var = this.b2;
            rx0Var.removeAllViews();
            if (peer2 == null) {
            }
            if (peer == null) {
            }
            TLRPC.User a222 = hp.s1(this.a).a2(Long.valueOf(o10));
            int i182 = 7;
            if (peer3 == null) {
            }
            rx0Var.g(i15, bd.M0(2131744970, null));
            if (starGift.stars > 0) {
            }
            if (starGift.limited) {
                wb.H0(rx0Var, this.a, starGift, this.J0);
            }
            if (tL_textWithEntities != null) {
                rx0Var.b(tL_textWithEntities.text, tL_textWithEntities.entities);
            }
            if (z34) {
            }
            dVar2 = dVar;
            if (this.k2) {
            }
            if (starGift instanceof TL_stars.TL_starGift) {
            }
            z19 = true;
            str4 = null;
            dVar2.setFilled(true);
            dVar2.i(bd.M0(2131747839, null), !this.X2, true);
            dVar2.g(null, !this.X2);
            dVar2.setOnClickListener(new r1(this, 14));
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
                hp s12 = hp.s1(this.a);
                TLRPC.Peer peer9 = tL_messageActionStarGiftUnique2.from_id;
                e22 = s12.e2(peer9 != null ? org.telegram.messenger.m5.o(peer9) : ziVar.Z0());
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique2.gift;
            boolean z38 = tL_messageActionStarGiftUnique2.refunded;
            k2(tL_starGiftUnique2, z38, e22, tL_messageActionStarGiftUnique2.message);
            z21 = tL_messageActionStarGiftUnique2.saved;
            starGift = tL_messageActionStarGiftUnique2.gift;
            boolean z39 = (tL_messageActionStarGiftUnique2.upgrade ^ true) == ziVar.Q3();
            if (zi.B0(ziVar.k) == e10) {
                z39 = false;
            }
            if (!this.G2 && !this.H2 && this.A2 != null && (B1 = B1()) != null) {
                this.G2 = true;
                e9.y(this.a, false).M(B1, new k3(this, i14));
            }
            if (this.J2 || (u5Var2 = this.I2) == null || !u5Var2.o || (tL_starGiftUnique = u5Var2.l) == null) {
                z24 = z39;
            } else {
                z24 = z39;
                if (starGift == null || tL_starGiftUnique.id != starGift.id) {
                    u5Var2.a();
                    this.I2 = null;
                    f6Var.b.setAlpha(1.0f);
                    f6Var.c.setAlpha(0.0f);
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
        if (this.e3) {
            dVar2.setFilled(z19);
            dVar2.i(bd.M0(2131749802, str4), false, z19);
            dVar2.setOnClickListener(new r1(this, 15));
        }
        String str6 = starGift == null ? null : starGift.owner_address;
        String str7 = starGift == null ? null : starGift.gift_address;
        boolean z40 = (starGift == null || starGift.host_id == null) ? false : true;
        s70 s70Var = this.a2;
        if (z17) {
            s70Var.setVisibility(0);
            s70Var.setText(bd.M0(2131750053, null));
            org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.q7, this.J0);
        } else if (z40 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
            s70Var.setVisibility(0);
            s70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(2131750189, null), new m3(this, str7, 5)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.q5, this.J0);
        } else if (TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && z14 && !z16) {
            s70Var.setVisibility(0);
            if (z22) {
                M04 = bd.a0(null, null, (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? 2131750096 : 2131750095, org.telegram.messenger.m5.t(zi.B0(ziVar.k)));
            } else {
                M04 = bd.M0((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? 2131750188 : 2131750187, null);
            }
            s70Var.setText(M04);
            org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.q5, this.J0);
        } else {
            s70Var.setVisibility(8);
        }
        int i19 = 6;
        s70 s70Var2 = this.c2;
        if (!z40 && !TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
            s70Var2.setVisibility(0);
            s70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(2131750189, null), new m3(this, str7, i19)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
        } else if (z13 || z17 || starGift == null || !K1(this.a, x1()) || peer3 != null) {
            s70Var2.setVisibility(8);
        } else {
            s70Var2.setVisibility(0);
            if (x1() >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (!z21) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new wp(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) org.telegram.messenger.g0.U2(bd.M0(z21 ? 2131750063 : 2131750066, null), new s1(this, i19)));
                s70Var2.setText(org.telegram.messenger.g0.I2(spannableStringBuilder4, true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            } else {
                s70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(z21 ? 2131750261 : 2131750262, null), new s1(this, i19)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            }
        }
        if (this.X2) {
            s2(0, false, null);
            this.k1.n0(1);
            this.X2 = false;
        }
        this.m1.setTitle(this.O2);
        v2();
    }

    public final void j1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        char c2;
        u5 u5Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        l6 l6Var;
        ai.z3 z3Var;
        int i3 = 0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = bd.M0(2131750395, null);
            c2 = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = bd.M0(2131750388, null);
            c2 = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            M0 = bd.M0(2131750396, null);
            c2 = 0;
        }
        if (!this.J2 && ((u5Var = this.I2) == null || !u5Var.o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.hc[] hcVarArr = new org.telegram.ui.Components.hc[1];
            Integer[] numArr = new Integer[1];
            String G1 = G1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                l6Var = this;
                z3Var = new ai.z3(this, zArr, starGiftAttribute2, hcVarArr, 7);
            } else {
                starGiftAttribute2 = starGiftAttribute;
                l6Var = this;
                z3Var = null;
            }
            hcVarArr[0] = (org.telegram.ui.Components.hc) ((ox0) l6Var.b2.e(M0, starGiftAttribute2.name, G1, z3Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        z5 z5Var = new z5(getContext(), this.J0, new y1(this, i3));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        rx0 rx0Var = this.b2;
        tableRow.addView(new qx0(rx0Var, M0), layoutParams);
        tableRow.addView(new ox0(rx0Var, z5Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        rx0Var.addView(tableRow);
        u5 u5Var2 = this.I2;
        if (u5Var2 != null) {
            if (c2 == 0) {
                u5Var2.d = z5Var;
            }
            if (c2 == 1) {
                u5Var2.c = z5Var;
            }
            if (c2 == 2) {
                u5Var2.b = z5Var;
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
    /* JADX WARN: Type inference failed for: r13v27, types: [org.telegram.ui.Components.hc[], org.telegram.ui.Components.qx0[], org.telegram.ui.Components.wp[]] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j2(TL_stars.SavedStarGift savedStarGift, w8 w8Var) {
        long j10;
        int i3;
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
        gi.d dVar;
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
        ?? r14;
        u5 u5Var;
        if (savedStarGift == null) {
            return;
        }
        int i14 = this.a;
        long j11 = this.Q1;
        this.x2 = K1(i14, j11);
        this.y2 = savedStarGift;
        this.z2 = w8Var;
        this.A2 = null;
        boolean z13 = this.J2;
        f6 f6Var = this.Y1;
        if (!z13 && (u5Var = this.I2) != null && u5Var.o && u5Var.l != null) {
            u5Var.a();
            this.I2 = null;
            f6Var.b.setVisibility(0);
            f6Var.c.setVisibility(4);
        }
        this.X1.b(this.a, savedStarGift);
        String t10 = org.telegram.messenger.m5.t(j11);
        long o10 = org.telegram.messenger.m5.o(savedStarGift.from_id);
        boolean t11 = l10.t(hp.s1(this.a).a2(Long.valueOf(o10)));
        int currentTime = hp.s1(this.a).E6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
        long e10 = h10.i(this.a).e();
        if ((savedStarGift.flags & 2) == 0) {
            o10 = 2666000;
        }
        int i15 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        boolean z14 = i15 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
        boolean z15 = savedStarGift.refunded;
        TL_stars.StarGift starGift5 = savedStarGift.gift;
        if (starGift5 instanceof TL_stars.TL_starGiftUnique) {
            str2 = starGift5.owner_address;
            str3 = starGift5.gift_address;
            z12 = starGift5.host_id != null;
            k2((TL_stars.TL_starGiftUnique) starGift5, z15, !savedStarGift.name_hidden ? hp.s1(this.a).e2(org.telegram.messenger.m5.o(savedStarGift.from_id)) : null, savedStarGift.message);
            i3 = i15;
        } else {
            boolean z16 = this.x2 && e10 == o10 && i15 >= 0;
            boolean M1 = M1(this.a, H1());
            C1();
            f6Var.f(starGift5, false, false, M1);
            f6Var.setShowOptions(p1());
            rx0 rx0Var = this.b2;
            rx0Var.removeAllViews();
            CharSequence charSequence5 = "";
            if (z16) {
                if (savedStarGift.gift_num == 0 || (starGift4 = savedStarGift.gift) == null || starGift4.title == null) {
                    j10 = e10;
                    str4 = null;
                    M03 = bd.M0(2131749948, null);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j10 = e10;
                    M03 = k2.p1.l(savedStarGift.gift_num, ',', sb2);
                    str4 = null;
                }
                this.O2 = M03;
                if (z15) {
                    X2 = str4;
                } else {
                    if (savedStarGift.can_upgrade) {
                        charSequence4 = org.telegram.messenger.g0.X2(bd.M0(2131750005, str4));
                    } else {
                        long j12 = savedStarGift.convert_stars;
                        if (j12 > 0) {
                            charSequence4 = org.telegram.messenger.g0.X2(bd.H(',', "Gift2SelfInfoConvert", (int) j12));
                        } else {
                            X2 = org.telegram.messenger.g0.X2(bd.M0(2131750012, null));
                        }
                    }
                    X2 = charSequence4;
                }
                f6Var.i(0, M03, X2, e2(savedStarGift.gift));
            } else {
                j10 = e10;
                if (!z14 || this.x2) {
                    boolean z17 = this.x2;
                    if (!z17 || savedStarGift.can_upgrade) {
                        i3 = i15;
                        if (savedStarGift.upgrade_stars > 0) {
                            String M04 = bd.M0(z17 ? 2131749949 : 2131749950, null);
                            this.O2 = M04;
                            f6Var.i(0, M04, z15 ? null : this.x2 ? bd.M0(2131750156, null) : null, e2(savedStarGift.gift));
                            if (j10 == o10 || z14) {
                                this.b2.m(bd.M0(2131750201, null), this.a, o10, new t1(this, o10, 4), (o10 != j10 || o10 == 2666000 || t11 || l10.x(hp.s1(this.a).a2(Long.valueOf(o10))) || z14) ? null : bd.M0(2131750292, null), new t1(this, o10, 5));
                            }
                            rx0Var.c(bd.M0(2131744970, null), bd.a0(null, null, 2131742793, bd.E0().s0().format(new Date(savedStarGift.date * 1000)), bd.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
                            String M05 = bd.M0(2131749855, null);
                            String l10 = k2.p1.l(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
                            if (n1() || z15) {
                                r13 = 0;
                            } else {
                                r13 = 0;
                                charSequence5 = org.telegram.ui.Components.ic.b(bd.H(',', "Gift2ButtonSell", (int) savedStarGift.convert_stars), new s1(this, 7), this.J0, null);
                            }
                            rx0Var.c(M05, wb.a1(false, TextUtils.concat(l10, " ", charSequence5), 0.8f, r13), r13, r13);
                            starGift2 = savedStarGift.gift;
                            if (starGift2.limited && !z15) {
                                wb.H0(rx0Var, this.a, starGift2, this.J0);
                            }
                            tL_textWithEntities = savedStarGift.message;
                            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text) && !z15) {
                                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                                rx0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                            }
                            z11 = this.x2;
                            dVar = this.d2;
                            if (!z11 && savedStarGift.can_upgrade) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                                if (this.W2 == null) {
                                    i13 = 0;
                                    this.W2 = new wp(0, new g6(dVar, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0)));
                                } else {
                                    i13 = 0;
                                }
                                spannableStringBuilder.setSpan(this.W2, i13, 1, 33);
                                if (savedStarGift.upgrade_stars > 0) {
                                    charSequence3 = null;
                                    M02 = bd.M0(2131749883, null);
                                } else {
                                    charSequence3 = null;
                                    M02 = bd.M0(2131749882, null);
                                }
                                spannableStringBuilder.append((CharSequence) M02);
                                dVar.setFilled(true);
                                dVar.i(spannableStringBuilder, !this.X2, true);
                                dVar.g(charSequence3, !this.X2);
                                dVar.setOnClickListener(new r1(this, 8));
                            } else if (!this.k2 && z11 && this.S1 != null && this.z2 != null && D1() >= 0 && this.z2.b(D1()) >= 0) {
                                dVar.setFilled(false);
                                int b10 = this.z2.b(D1());
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) bd.M0(2131749863, null));
                                Object obj = this.z2.get(b10);
                                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                                    r12 = 1;
                                } else {
                                    spannableStringBuilder2.append((CharSequence) " e");
                                    r12 = 1;
                                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                                }
                                dVar.i(spannableStringBuilder2, (this.X2 ? 1 : 0) ^ r12, r12);
                                dVar.g(null, (this.X2 ? 1 : 0) ^ r12);
                                dVar.setOnClickListener(new j2(this, b10, r12));
                            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                                dVar.setFilled(true);
                                dVar.i(bd.M0(2131747839, null), !this.X2, true);
                                dVar.g(null, !this.X2);
                                dVar.setOnClickListener(new r1(this, 11));
                            } else {
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                                if (this.W2 == null) {
                                    i12 = 0;
                                    this.W2 = new wp(0, new g6(dVar, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0)));
                                } else {
                                    i12 = 0;
                                }
                                spannableStringBuilder3.setSpan(this.W2, i12, 1, 33);
                                spannableStringBuilder3.append((CharSequence) bd.M0(2131750199, null));
                                dVar.setFilled(true);
                                dVar.i(spannableStringBuilder3, !this.X2, true);
                                dVar.g(null, !this.X2);
                                dVar.setOnClickListener(new r1(this, 10));
                            }
                            str2 = null;
                            str3 = null;
                            z12 = false;
                        }
                    } else {
                        i3 = i15;
                    }
                    if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                        M0 = bd.M0(z17 ? 2131749949 : 2131749950, null);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(savedStarGift.gift.title);
                        sb3.append(" #");
                        M0 = k2.p1.l(savedStarGift.gift_num, ',', sb3);
                    }
                    this.O2 = M0;
                    if (z15 || !this.x2) {
                        i10 = 0;
                        charSequence = null;
                    } else {
                        if (!t11 && n1()) {
                            if (this.x2) {
                                a02 = bd.H(',', currentTime <= 0 ? z14 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired" : z14 ? "Gift2Info3Channel" : "Gift2Info3", (int) savedStarGift.convert_stars);
                            } else {
                                a02 = bd.K("Gift2Info2Out", (int) savedStarGift.convert_stars, ',', t10);
                            }
                            str = null;
                        } else if (this.x2) {
                            if (savedStarGift.unsaved) {
                                i11 = z14 ? 2131750181 : 2131750186;
                                str = null;
                            } else {
                                str = null;
                                i11 = z14 ? 2131750180 : 2131750185;
                            }
                            a02 = bd.M0(i11, str);
                        } else {
                            str = null;
                            a02 = bd.a0(null, null, (!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? 2131750174 : 2131750173, t10);
                        }
                        SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(a02);
                        if (t11 || !n1()) {
                            z10 = true;
                            charSequence2 = "";
                        } else {
                            z10 = true;
                            charSequence2 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(bd.M0(2131750118, str).replace(' ', (char) 160), new s1(this, 5)), true);
                        }
                        boolean z18 = z10;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        i10 = 0;
                        charSequenceArr[0] = X22;
                        charSequenceArr[z18 ? 1 : 0] = " ";
                        charSequenceArr[2] = charSequence2;
                        charSequence = TextUtils.concat(charSequenceArr);
                    }
                    f6Var.i(i10, M0, charSequence, e2(savedStarGift.gift));
                    if (j10 == o10) {
                    }
                    this.b2.m(bd.M0(2131750201, null), this.a, o10, new t1(this, o10, 4), (o10 != j10 || o10 == 2666000 || t11 || l10.x(hp.s1(this.a).a2(Long.valueOf(o10))) || z14) ? null : bd.M0(2131750292, null), new t1(this, o10, 5));
                    rx0Var.c(bd.M0(2131744970, null), bd.a0(null, null, 2131742793, bd.E0().s0().format(new Date(savedStarGift.date * 1000)), bd.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
                    String M052 = bd.M0(2131749855, null);
                    String l102 = k2.p1.l(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
                    if (n1()) {
                    }
                    r13 = 0;
                    rx0Var.c(M052, wb.a1(false, TextUtils.concat(l102, " ", charSequence5), 0.8f, r13), r13, r13);
                    starGift2 = savedStarGift.gift;
                    if (starGift2.limited) {
                        wb.H0(rx0Var, this.a, starGift2, this.J0);
                    }
                    tL_textWithEntities = savedStarGift.message;
                    if (tL_textWithEntities != null) {
                        TLRPC.TL_textWithEntities tL_textWithEntities32 = savedStarGift.message;
                        rx0Var.b(tL_textWithEntities32.text, tL_textWithEntities32.entities);
                    }
                    z11 = this.x2;
                    dVar = this.d2;
                    if (!z11) {
                    }
                    if (!this.k2) {
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
                    }
                    dVar.setFilled(true);
                    dVar.i(bd.M0(2131747839, null), !this.X2, true);
                    dVar.g(null, !this.X2);
                    dVar.setOnClickListener(new r1(this, 11));
                    str2 = null;
                    str3 = null;
                    z12 = false;
                } else {
                    String M06 = bd.M0(2131749950, null);
                    this.O2 = M06;
                    f6Var.i(0, M06, null, d2(savedStarGift.gift.released_by));
                }
            }
            i3 = i15;
            if (j10 == o10) {
            }
            this.b2.m(bd.M0(2131750201, null), this.a, o10, new t1(this, o10, 4), (o10 != j10 || o10 == 2666000 || t11 || l10.x(hp.s1(this.a).a2(Long.valueOf(o10))) || z14) ? null : bd.M0(2131750292, null), new t1(this, o10, 5));
            rx0Var.c(bd.M0(2131744970, null), bd.a0(null, null, 2131742793, bd.E0().s0().format(new Date(savedStarGift.date * 1000)), bd.E0().p0().format(new Date(savedStarGift.date * 1000))), null, null);
            String M0522 = bd.M0(2131749855, null);
            String l1022 = k2.p1.l(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (n1()) {
            }
            r13 = 0;
            rx0Var.c(M0522, wb.a1(false, TextUtils.concat(l1022, " ", charSequence5), 0.8f, r13), r13, r13);
            starGift2 = savedStarGift.gift;
            if (starGift2.limited) {
            }
            tL_textWithEntities = savedStarGift.message;
            if (tL_textWithEntities != null) {
            }
            z11 = this.x2;
            dVar = this.d2;
            if (!z11) {
            }
            if (!this.k2) {
            }
            if (savedStarGift.gift instanceof TL_stars.TL_starGift) {
            }
            dVar.setFilled(true);
            dVar.i(bd.M0(2131747839, null), !this.X2, true);
            dVar.g(null, !this.X2);
            dVar.setOnClickListener(new r1(this, 11));
            str2 = null;
            str3 = null;
            z12 = false;
        }
        boolean z19 = savedStarGift.refunded;
        s70 s70Var = this.a2;
        if (z19) {
            s70Var.setVisibility(0);
            s70Var.setText(bd.M0(2131750053, null));
            org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.q7, this.J0);
        } else if (z12 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            s70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(2131750189, null), new m3(this, str3, 1)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            s70Var.setVisibility(0);
            org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.q5, this.J0);
        } else if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && this.x2 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            s70Var.setVisibility(0);
            s70Var.setText(bd.M0((tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? 2131750188 : 2131750187, null));
            org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.q5, this.J0);
        } else {
            s70Var.setVisibility(8);
        }
        s70 s70Var2 = this.c2;
        if (!z12 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            s70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(2131750189, null), new m3(this, str3, 2)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            r14 = 0;
            s70Var2.setVisibility(0);
        } else if (this.x2 && K1(this.a, j11)) {
            int i16 = 6;
            if (i3 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new wp(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) org.telegram.messenger.g0.U2(bd.M0(!savedStarGift.unsaved ? 2131750063 : 2131750066, null), new s1(this, i16)));
                s70Var2.setText(org.telegram.messenger.g0.I2(spannableStringBuilder4, true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            } else {
                s70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(!savedStarGift.unsaved ? 2131750261 : 2131750262, null), new s1(this, i16)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            }
            r14 = 0;
            s70Var2.setVisibility(0);
        } else {
            r14 = 0;
            s70Var2.setVisibility(8);
        }
        if (this.X2) {
            s2(r14, r14, null);
            this.k1.n0(1);
            this.X2 = r14;
        }
        this.m1.setTitle(this.O2);
        v2();
    }

    @Override // org.telegram.ui.ActionBar.t2, org.telegram.ui.ActionBar.z1
    public org.telegram.ui.Components.fc k() {
        return new org.telegram.ui.Components.fc(this.i2, this.J0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x05cd, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique) r8).drop_original_details_stars >= r38) goto L193;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0342  */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.view.View, int[], java.lang.CharSequence, java.lang.String, org.telegram.ui.ActionBar.n6, org.telegram.ui.Components.hc[], org.telegram.ui.Components.qx0[]] */
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
    public final void k2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        int i3;
        CharSequence charSequence;
        CharSequence charSequence2;
        Spannable spannable;
        long j10;
        int i10;
        ?? r15;
        ?? r13;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        float f10;
        u5 u5Var;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        u5 u5Var2;
        ArrayList arrayList;
        boolean z12;
        Object obj;
        Object obj2;
        CharSequence V;
        CharSequence V2;
        TLRPC.Message message;
        zi ziVar;
        int i11;
        int i12;
        Object obj3;
        int i13;
        int i14;
        TL_wallet.nftItem nftitem;
        String str;
        TL_wallet.nftItem nftitem2;
        String str2;
        org.telegram.ui.Wallet.a8 a8Var;
        u5 u5Var3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        long o10 = org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id);
        long o11 = org.telegram.messenger.m5.o(tL_starGiftUnique.host_id);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.O2 = k2.p1.l(tL_starGiftUnique.num, ',', sb2);
        boolean z13 = this.J2;
        f6 f6Var = this.Y1;
        if (!z13 && (u5Var3 = this.I2) != null && u5Var3.o && (tL_starGiftUnique2 = u5Var3.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            u5Var3.a();
            this.I2 = null;
            f6Var.b.setAlpha(1.0f);
            f6Var.c.setAlpha(0.0f);
        } else if (z13 && this.I2 == null) {
            this.I2 = new u5(f6Var);
        }
        int i15 = 0;
        int i16 = 1;
        boolean z14 = this.b3 == null;
        boolean z15 = z14 && L1(this.a, o10);
        boolean z16 = z14 && L1(this.a, o11);
        boolean M1 = M1(this.a, H1());
        C1();
        f6Var.f(tL_starGiftUnique, z15, z16, M1);
        f6Var.setShowOptions(false);
        TextPaint textPaint = f6Var.H;
        final int i17 = 4;
        int i18 = 2;
        int i19 = 3;
        if (this.Y2 != null) {
            if (this.a3 != null) {
                f6Var.j(new r1(this, 29), this.Z2 == null ? null : new View.OnClickListener(this) { // from class: ci.f4
                    public final /* synthetic */ l6 b;

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
                                u5 u5Var4 = this.b.I2;
                                u5Var4.h.e();
                                u5Var4.i.e();
                                u5Var4.j.e();
                                u5Var4.k.e();
                                break;
                            default:
                                this.b.R1();
                                break;
                        }
                    }
                }, new r1(this, i15), true);
                org.telegram.ui.Wallet.f5 f5Var = this.a3;
                org.telegram.ui.Wallet.b8 b8Var = f5Var.b.k0;
                f6Var.setWalletCard((b8Var == null || (nftitem2 = f5Var.a) == null || (str2 = nftitem2.address) == null || (a8Var = (org.telegram.ui.Wallet.a8) b8Var.f.get(str2)) == null || !a8Var.b()) ? false : true);
            } else {
                f6Var.j(new r1(this, i16), this.Z2 == null ? null : new r1(this, i18), new r1(this, i19), tL_starGiftUnique.host_id != null);
            }
            org.telegram.ui.Wallet.e5 e5Var = this.Z2;
            if (e5Var != null) {
                i14 = ((org.telegram.ui.ActionBar.d2) e5Var.c).currentAccount;
                boolean F = org.telegram.ui.Wallet.b8.F(i14, e5Var.a.slug);
                org.telegram.ui.Wallet.e5 e5Var2 = this.Z2;
                org.telegram.ui.Wallet.b8 b8Var2 = e5Var2.c.k0;
                boolean z17 = (b8Var2 == null || (nftitem = e5Var2.b) == null || (str = nftitem.address) == null || !str.equals(b8Var2.Q0)) ? false : true;
                ai.c0 c0Var = f6Var.K;
                c0Var.e(R.drawable.filled_card_color, bd.M0(z17 ? 2131743113 : 2131743119, null), false);
                c0Var.setAlpha((F || z17) ? 1.0f : 0.5f);
            }
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ("#" + bd.E(tL_starGiftUnique.num, ',')));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new org.telegram.messenger.t(hs.U2, 2, false), length, spannableStringBuilder.length(), 33);
        TL_wallet.walletTransaction wallettransaction = this.b3;
        if (wallettransaction != null) {
            charSequence = bd.M0(wallettransaction.incoming ? 2131743085 : 2131743084, null);
            i3 = 1;
        } else {
            if (tLObject != null) {
                i3 = 1;
                charSequence2 = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131743892, org.telegram.messenger.m5.u(tLObject)));
            } else {
                i3 = 1;
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
            zi.b(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false, 0);
            spannable = zi.C5(org.telegram.messenger.i6.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
        }
        f6Var.h(0, spannableStringBuilder, charSequence, d2(tL_starGiftUnique.released_by), null, tLObject, spannable);
        ?? r11 = 0;
        this.c3 = null;
        rx0 rx0Var = this.b2;
        rx0Var.removeAllViews();
        if (z10) {
            j10 = 0;
            i10 = 0;
        } else {
            if (tL_starGiftUnique.host_id != null) {
                if (TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    i13 = 0;
                } else {
                    i13 = 0;
                    rx0Var.p(bd.M0(2131750190, null), tL_starGiftUnique.owner_address, new s1(this, i13));
                }
                if (o11 != 0) {
                    int i20 = i13;
                    i11 = i3;
                    this.c3 = ((ox0) this.b2.o(bd.M0(2131750191, null), this.a, o11, new t1(this, o11, i13)).getChildAt(i11)).getChildAt(i20);
                    i12 = i20;
                    obj3 = null;
                } else {
                    i10 = i13;
                    j10 = 0;
                }
            } else {
                i11 = i3;
                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    rx0Var.p(bd.M0(2131750094, null), tL_starGiftUnique.owner_address, new s1(this, i11));
                } else if (o10 == 0 && tL_starGiftUnique.owner_name != null) {
                    rx0Var.c(bd.M0(2131750094, null), tL_starGiftUnique.owner_name, null, null);
                } else if (o10 != 0) {
                    r11 = 0;
                    j10 = 0;
                    r13 = 0;
                    int i21 = i11;
                    this.c3 = ((ox0) this.b2.o(bd.M0(2131750094, null), this.a, o10, new t1(this, o10, i11)).getChildAt(i21 == true ? 1 : 0)).getChildAt(0);
                    r15 = i21;
                    j1(e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
                    j1(e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                    j1(e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    if (!z10) {
                        if (this.A2 == null) {
                            rx0Var.c(bd.M0(2131750062, r11), bd.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + bd.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r11, r11);
                        } else if (this.F2) {
                            rx0Var.c(bd.M0(2131750062, r11), bd.H(',', "Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + bd.H(',', "Gift2QuantityIssued2", tL_starGiftUnique.availability_total), r11, r11);
                        } else {
                            TextView textView = (TextView) ((ox0) rx0Var.c(bd.M0(2131750062, r11), "", r11, r11).getChildAt(r15)).getChildAt(r13);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                            x70 x70Var = new x70(textView, org.telegram.messenger.g0.L(90.0f), r13, this.J0);
                            int i22 = org.telegram.ui.ActionBar.k6.G6;
                            x70Var.a(org.telegram.ui.ActionBar.k6.r1(0.21f, org.telegram.ui.ActionBar.k6.w0(i22, this.J0)), org.telegram.ui.ActionBar.k6.r1(0.08f, org.telegram.ui.ActionBar.k6.w0(i22, this.J0)));
                            spannableStringBuilder3.setSpan(x70Var, r13, r15, 33);
                            textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                            if (!this.E2 && !this.F2 && (ziVar = this.A2) != null) {
                                this.E2 = r15;
                                int f12 = ziVar.f1();
                                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                tL_messages_getMessages.id.add(Integer.valueOf(f12));
                                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new a2(this, f12, r13));
                            }
                        }
                        if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                            org.telegram.messenger.r1 i23 = org.telegram.messenger.r1.i();
                            long j11 = tL_starGiftUnique.value_amount;
                            String str3 = tL_starGiftUnique.value_currency;
                            int h = org.telegram.messenger.r1.i().h(tL_starGiftUnique.value_currency);
                            i23.getClass();
                            this.b2.e(bd.M0(2131749599, r11), t4.c.f("~", org.telegram.messenger.r1.g(str3, h, j11, r15)), bd.M0(2131749598, r11), new ai.k3(this, tL_starGiftUnique, org.telegram.messenger.r1.i().f(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 18), null);
                        }
                    }
                    stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                    if (stargiftattributeoriginaldetails != null) {
                        if ((stargiftattributeoriginaldetails.flags & r15) != 0) {
                            long o12 = org.telegram.messenger.m5.o(stargiftattributeoriginaldetails.sender_id);
                            SpannableString spannableString = new SpannableString(org.telegram.messenger.m5.l(h10.t0, o12));
                            spannableString.setSpan(new l4(this, o12), r13, spannableString.length(), 33);
                            obj = spannableString;
                        } else {
                            obj = r11;
                        }
                        Object obj4 = obj;
                        f10 = 14.0f;
                        long o13 = org.telegram.messenger.m5.o(stargiftattributeoriginaldetails.recipient_id);
                        SpannableString spannableString2 = new SpannableString(org.telegram.messenger.m5.l(h10.t0, o13));
                        spannableString2.setSpan(new m4(this, o13), r13, spannableString2.length(), 33);
                        if (stargiftattributeoriginaldetails.message != null) {
                            TextPaint textPaint2 = new TextPaint((int) r15);
                            textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                            zi.b(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false, 0);
                            obj2 = zi.C5(org.telegram.messenger.i6.m(spannableStringBuilder4, textPaint2.getFontMetricsInt(), r13, r11, r13), stargiftattributeoriginaldetails.message.entities, textPaint2.getFontMetricsInt(), r13);
                        } else {
                            obj2 = r11;
                        }
                        int i24 = r13;
                        Object replaceAll = bd.E0().C0().format(stargiftattributeoriginaldetails.date * 1000).replaceAll("\\.", "/");
                        if (stargiftattributeoriginaldetails.sender_id != stargiftattributeoriginaldetails.recipient_id) {
                            if (obj4 != null) {
                                if (obj2 == null) {
                                    Object[] objArr = new Object[3];
                                    objArr[i24] = obj4;
                                    objArr[r15] = spannableString2;
                                    objArr[2] = replaceAll;
                                    V2 = bd.V(r11, r11, 2131750394, objArr);
                                } else {
                                    Object[] objArr2 = new Object[4];
                                    objArr2[i24] = obj4;
                                    objArr2[r15] = spannableString2;
                                    objArr2[2] = replaceAll;
                                    objArr2[3] = obj2;
                                    V2 = bd.V(r11, r11, 2131750393, objArr2);
                                }
                            } else if (obj2 == null) {
                                Object[] objArr3 = new Object[2];
                                objArr3[i24] = spannableString2;
                                objArr3[r15] = replaceAll;
                                V2 = bd.V(r11, r11, 2131750392, objArr3);
                            } else {
                                Object[] objArr4 = new Object[3];
                                objArr4[i24] = spannableString2;
                                objArr4[r15] = replaceAll;
                                objArr4[2] = obj2;
                                V = bd.V(r11, r11, 2131750391, objArr4);
                                if (K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                                }
                                px0 a10 = rx0Var.a(V);
                                a10.setFilled(r15);
                                yh.l lVar = (yh.l) a10.getChildAt(0);
                                lVar.setTextSize(r15, 12.0f);
                                lVar.setGravity(17);
                            }
                            V = V2;
                            if (K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                            }
                            px0 a102 = rx0Var.a(V);
                            a102.setFilled(r15);
                            yh.l lVar2 = (yh.l) a102.getChildAt(0);
                            lVar2.setTextSize(r15, 12.0f);
                            lVar2.setGravity(17);
                        } else if (obj2 == null) {
                            Object[] objArr5 = new Object[2];
                            objArr5[i24] = obj4;
                            objArr5[r15] = replaceAll;
                            V = bd.V(r11, r11, 2131750390, objArr5);
                            if (K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                                TL_stars.SavedStarGift savedStarGift = this.y2;
                                if (savedStarGift == null || savedStarGift.drop_original_details_stars < j10) {
                                    zi ziVar2 = this.A2;
                                    if (ziVar2 != null && (message = ziVar2.k) != null) {
                                        TLRPC.MessageAction messageAction = message.action;
                                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                        }
                                    }
                                }
                                LinearLayout linearLayout = new LinearLayout(getContext());
                                linearLayout.setPadding(org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f), org.telegram.messenger.g0.L(12.66f), org.telegram.messenger.g0.L(9.33f));
                                linearLayout.setOrientation(i24);
                                yh.l lVar3 = new yh.l(getContext());
                                org.telegram.ui.ActionBar.r6.V(lVar3, org.telegram.ui.ActionBar.k6.G6, this.J0);
                                org.telegram.ui.ActionBar.r6.H(lVar3, org.telegram.ui.ActionBar.k6.Uc, this.J0);
                                lVar3.setTextSize(r15, 12.0f);
                                lVar3.setGravity(3);
                                lVar3.setText(V);
                                linearLayout.addView(lVar3, mf.p(-1, -2, 1.0f, 19));
                                ImageView imageView = new ImageView(getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER);
                                int i25 = org.telegram.ui.ActionBar.k6.Ci;
                                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i25, this.J0)), 6, 6);
                                org.telegram.ui.ActionBar.n6 L = org.telegram.ui.ActionBar.r6.L(0.1f, i25);
                                org.telegram.ui.ActionBar.e6 e6Var = this.J0;
                                imageView.setBackground(a02);
                                org.telegram.ui.ActionBar.r6.k(imageView, a02, r11, L, e6Var);
                                imageView.setImageResource(R.drawable.menu_delete_old);
                                org.telegram.ui.ActionBar.r6.t(imageView, i25, this.J0, PorterDuff.Mode.SRC_IN);
                                pf.a(imageView);
                                imageView.setOnClickListener(new ai.d(12, this, V));
                                linearLayout.addView(imageView, mf.q(32, 32, 0.0f, 21, 8, 0, 0, 0));
                                TableRow tableRow = new TableRow(getContext());
                                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                                layoutParams.span = 2;
                                tableRow.addView(new px0(rx0Var, linearLayout, true), layoutParams);
                                rx0Var.addView(tableRow);
                            }
                            px0 a1022 = rx0Var.a(V);
                            a1022.setFilled(r15);
                            yh.l lVar22 = (yh.l) a1022.getChildAt(0);
                            lVar22.setTextSize(r15, 12.0f);
                            lVar22.setGravity(17);
                        } else {
                            Object[] objArr6 = new Object[3];
                            objArr6[i24] = obj4;
                            objArr6[r15] = replaceAll;
                            objArr6[2] = obj2;
                            V2 = bd.V(r11, r11, 2131750389, objArr6);
                            V = V2;
                            if (K1(this.a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
                            }
                            px0 a10222 = rx0Var.a(V);
                            a10222.setFilled(r15);
                            yh.l lVar222 = (yh.l) a10222.getChildAt(0);
                            lVar222.setTextSize(r15, 12.0f);
                            lVar222.setGravity(17);
                        }
                    } else {
                        f10 = 14.0f;
                    }
                    if (this.b3 != null) {
                        this.c3 = r11;
                        rx0Var.removeAllViews();
                        long e10 = h10.i(this.a).e();
                        this.b2.n(bd.M0(this.b3.incoming ? 2131743025 : 2131743050, r11), this.a, e10, new t1(this, e10, 3));
                        long abs = Math.abs(this.b3.fee);
                        if (abs > j10) {
                            TextView textView2 = new TextView(getContext());
                            textView2.setGravity(16);
                            textView2.setIncludeFontPadding(false);
                            textView2.setTextSize(1, f10);
                            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.G6, this.J0);
                            textView2.setText(org.telegram.ui.Wallet.w5.w0(this.a, abs, this.J0));
                            rx0Var.f(textView2, bd.M0(2131743131, r11));
                        }
                        if (this.b3.date != 0) {
                            rx0Var.c(bd.M0(2131743154, r11), bd.Q(this.b3.date), r11, r11);
                        }
                    }
                    u5Var = this.I2;
                    gi.d dVar = this.d2;
                    if (u5Var != null || !u5Var.o) {
                        if (this.b3 != null) {
                            dVar.setFilled(true);
                            dVar.i(bd.M0(2131747839, r11), !this.X2, true);
                            dVar.g(r11, !this.X2);
                            final int i26 = 0;
                            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ci.f4
                                public final /* synthetic */ l6 b;

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
                                            u5 u5Var4 = this.b.I2;
                                            u5Var4.h.e();
                                            u5Var4.i.e();
                                            u5Var4.j.e();
                                            u5Var4.k.e();
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
                            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ci.f4
                                public final /* synthetic */ l6 b;

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
                                            u5 u5Var4 = this.b.I2;
                                            u5Var4.h.e();
                                            u5Var4.i.e();
                                            u5Var4.j.e();
                                            u5Var4.k.e();
                                            break;
                                        default:
                                            this.b.R1();
                                            break;
                                    }
                                }
                            });
                        } else if (!this.k2 || this.S1 == null || this.z2 == null || D1() < 0 || this.z2.b(D1()) < 0) {
                            dVar.setFilled(true);
                            dVar.i(bd.M0(2131747839, r11), !this.X2, true);
                            dVar.g(r11, !this.X2);
                            final int i28 = 2;
                            dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ci.f4
                                public final /* synthetic */ l6 b;

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
                                            u5 u5Var4 = this.b.I2;
                                            u5Var4.h.e();
                                            u5Var4.i.e();
                                            u5Var4.j.e();
                                            u5Var4.k.e();
                                            break;
                                        default:
                                            this.b.R1();
                                            break;
                                    }
                                }
                            });
                            this.m1.setTitle(this.O2);
                            u5Var2 = this.I2;
                            if (u5Var2 != null) {
                                return;
                            }
                            boolean z18 = this.J2;
                            s1 s1Var = new s1(this, 24);
                            s1 s1Var2 = new s1(this, 25);
                            ArrayList arrayList2 = u5Var2.f;
                            f6 f6Var2 = u5Var2.a;
                            TL_stars.TL_starGiftUnique tL_starGiftUnique3 = u5Var2.l;
                            if (tL_starGiftUnique3 != null) {
                                arrayList = arrayList2;
                                if (tL_starGiftUnique3.id == tL_starGiftUnique.id) {
                                    z12 = u5Var2.o;
                                    if (z12) {
                                        return;
                                    }
                                    f6Var.b.setAlpha(0.0f);
                                    f6Var.c.setAlpha(1.0f);
                                    dVar.i(bd.M0(2131749618, null), true, true);
                                    dVar.setFilled(true);
                                    final int i29 = 3;
                                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ci.f4
                                        public final /* synthetic */ l6 b;

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
                                                    u5 u5Var4 = this.b.I2;
                                                    u5Var4.h.e();
                                                    u5Var4.i.e();
                                                    u5Var4.j.e();
                                                    u5Var4.k.e();
                                                    break;
                                                default:
                                                    this.b.R1();
                                                    break;
                                            }
                                        }
                                    });
                                    int length2 = ((l6) this.M2.d).L2.length - 1;
                                    tj0 tj0Var = this.l1;
                                    tj0Var.v0(length2);
                                    tj0Var.post(new s1(this, 26));
                                    return;
                                }
                            } else {
                                arrayList = arrayList2;
                            }
                            if (z18) {
                                org.telegram.ui.Components.k9 upgradeImageView = f6Var2.getUpgradeImageView();
                                x5 x5Var = f6Var2.c;
                                TL_stars.starGiftAttributeModel upgradeImageViewAttribute = f6Var2.getUpgradeImageViewAttribute();
                                TL_stars.starGiftAttributePattern upgradePatternAttribute = f6Var2.getUpgradePatternAttribute();
                                TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = f6Var2.getUpgradeBackdropAttribute();
                                TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                                u5Var2.o = true;
                                u5Var2.l = tL_starGiftUnique;
                                u5Var2.r = s1Var;
                                u5Var2.s = s1Var2;
                                u5Var2.t = (float) Math.random();
                                u5Var2.m = System.currentTimeMillis();
                                u5Var2.n = 0.0f;
                                u5Var2.p = false;
                                u5Var2.q = false;
                                u5Var2.o = true;
                                q5 q5Var = u5Var2.h;
                                if (q5Var != null) {
                                    q5Var.a();
                                }
                                s5 s5Var = new s5(x5Var, stargiftattributemodel2);
                                if (x5Var.isAttachedToWindow() && s5Var.c) {
                                    s5Var.d.P();
                                }
                                u5Var2.h = new q5(new o5(u5Var2, 0), u5Var2.e, new s5(upgradeImageView, upgradeImageViewAttribute), s5Var, 0.9f, u5Var2.t > 0.5f ? 3 : 2);
                                q5 q5Var2 = u5Var2.i;
                                if (q5Var2 != null) {
                                    q5Var2.a();
                                }
                                u5Var2.i = new q5(new o5(u5Var2, 0), u5Var2.g, new t5(upgradePatternAttribute), new t5(stargiftattributepattern), 1.0f, u5Var2.t > 0.5f ? 2 : 1);
                                q5 q5Var3 = u5Var2.j;
                                if (q5Var3 != null) {
                                    q5Var3.a();
                                }
                                u5Var2.j = new q5(new o5(u5Var2, 0), arrayList, new r5(upgradeBackdropAttribute), new r5(stargiftattributebackdrop), 0.5f, u5Var2.t > 0.5f ? 2 : 1);
                                q5 q5Var4 = u5Var2.k;
                                if (q5Var4 != null) {
                                    q5Var4.a();
                                }
                                u5Var2.k = new q5(new o5(u5Var2, 0), arrayList, new r5(upgradeBackdropAttribute), new r5(stargiftattributebackdrop), 1.25f, u5Var2.t > 0.5f ? 2 : 1);
                                u5Var2.b();
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                            }
                        } else {
                            dVar.setFilled(false);
                            int b10 = this.z2.b(D1());
                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                            spannableStringBuilder5.append((CharSequence) bd.M0(2131749863, r11));
                            Object obj5 = this.z2.get(b10);
                            if (!(obj5 instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj5).gift) == null || (document = starGift.getDocument()) == null) {
                                z11 = true;
                            } else {
                                spannableStringBuilder5.append((CharSequence) " e");
                                z11 = true;
                                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.p5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                            }
                            dVar.i(spannableStringBuilder5, this.X2 ^ z11, z11);
                            dVar.g(r11, this.X2 ^ z11);
                            dVar.setOnClickListener(new j2(this, b10, 3));
                        }
                    }
                    this.m1.setTitle(this.O2);
                    u5Var2 = this.I2;
                    if (u5Var2 != null) {
                    }
                }
                i12 = 0;
                obj3 = null;
            }
            j10 = 0;
            r15 = i11;
            r11 = obj3;
            r13 = i12;
            j1(e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
            j1(e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            j1(e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            if (!z10) {
            }
            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
            if (stargiftattributeoriginaldetails != null) {
            }
            if (this.b3 != null) {
            }
            u5Var = this.I2;
            gi.d dVar2 = this.d2;
            if (u5Var != null) {
            }
            if (this.b3 != null) {
            }
            this.m1.setTitle(this.O2);
            u5Var2 = this.I2;
            if (u5Var2 != null) {
            }
        }
        r15 = i3;
        r13 = i10;
        j1(e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class));
        j1(e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        j1(e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z10) {
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) e9.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails != null) {
        }
        if (this.b3 != null) {
        }
        u5Var = this.I2;
        gi.d dVar22 = this.d2;
        if (u5Var != null) {
        }
        if (this.b3 != null) {
        }
        this.m1.setTitle(this.O2);
        u5Var2 = this.I2;
        if (u5Var2 != null) {
        }
    }

    public final void l1(LinearLayout linearLayout, int i3, int i10, int i11, String str, boolean z10) {
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i3);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, e6Var, mode);
        linearLayout.addView(imageView, mf.t(i10, i10, 16, i10 < 15 ? 1 : 0, 0, i10 < 15 ? 1 : 0, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i12 = org.telegram.ui.ActionBar.k6.r5;
        org.telegram.ui.ActionBar.r6.V(textView, i12, this.J0);
        textView.setText(str);
        linearLayout.addView(textView, mf.t(-2, -2, 16, 4, 0, 0, 0));
        if (z10) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.msg_mini_topicarrow);
            org.telegram.ui.ActionBar.r6.t(imageView2, i12, this.J0, mode);
            linearLayout.addView(imageView2, mf.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        dg.a resellAmount = tL_starGiftUnique.getResellAmount(dg.b.a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        gi.d dVar = this.d2;
        if (z10) {
            dVar.i(wb.s1(wb.V0(bd.a0(null, null, 2131746156, tL_starGiftUnique.getResellAmount(dg.b.b).d()), true), true), !this.X2, true);
            dVar.g(wb.T0(bd.H(',', "ResellGiftBuyEq", (int) resellAmount.a())), !this.X2);
        } else {
            dVar.i(wb.T0(bd.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.X2, true);
            dVar.g(null, !this.X2);
        }
    }

    public final void m1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            e9.y(this.a, false).P(x1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i3 = 0; i3 < updates.updates.size(); i3++) {
                    TLRPC.Update update2 = updates.updates.get(i3);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message == null) {
            e9.y(this.a, false).P(x1());
            dismiss();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.y2;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.J2 = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.y2;
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
                j2(savedStarGift2, this.z2);
                this.h3 = null;
                this.J2 = false;
                w8 w8Var = this.z2;
                if (w8Var != null) {
                    w8Var.d();
                } else {
                    e9.y(this.a, false).P(this.Q1);
                }
                org.telegram.messenger.g0.h3(runnable);
                return;
            }
        }
        if (this.z2 == null) {
            e9.y(this.a, false).P(x1());
        }
        this.J2 = true;
        this.y2 = null;
        this.x2 = false;
        zi ziVar = new zi(this.a, message, false, false);
        ziVar.M5();
        i2(ziVar, this.z2);
        this.h3 = null;
        this.J2 = false;
        org.telegram.messenger.g0.h3(runnable);
    }

    public final void m2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10) {
        if (z10) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = h10.i(this.a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= TLObject.FLAG_12;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.Y1.setWalletDisplayed(z10);
        w2();
    }

    public final boolean n1() {
        TLRPC.Peer peer;
        if (B1() == null) {
            return false;
        }
        zi ziVar = this.A2;
        if (ziVar != null) {
            TLRPC.MessageAction messageAction = ziVar.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!ziVar.Q3() || ((zi.B0(this.A2.k) > h10.i(this.a).e() ? 1 : (zi.B0(this.A2.k) == h10.i(this.a).e() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && L1(this.a, org.telegram.messenger.m5.o(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && hp.s1(this.a).E6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.A2.k.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.y2;
            if (savedStarGift != null) {
                int currentTime = hp.s1(this.a).E6 - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                int i3 = this.a;
                long j10 = this.Q1;
                if (L1(i3, j10)) {
                    int i10 = this.y2.flags;
                    if (((j10 < 0 ? 2048 : 8) & i10) != 0 && (i10 & 16) != 0 && (i10 & 2) != 0 && currentTime > 0) {
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
        long o10 = org.telegram.messenger.m5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(H1.title);
        sb2.append(" #");
        this.v2.setText(bd.a0(null, null, 2131749841, k2.p1.l(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131749843, null));
        if (o10 == h10.i(this.a).e() && !h10.i(this.a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.Q2 == null) {
                this.Q2 = new wp(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.Q2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        gi.d dVar = this.d2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new r1(this, 27));
        this.Y1.setWearPreview(hp.s1(this.a).e2(o10));
        s2(2, false, null);
        this.t2 = true;
    }

    public final boolean o1() {
        int i3;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null || H1.crafted || !L1(this.a, org.telegram.messenger.m5.o(H1.owner_id))) {
            return false;
        }
        zi ziVar = this.A2;
        if (ziVar == null) {
            TL_stars.SavedStarGift savedStarGift = this.y2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i3 = savedStarGift.can_craft_at;
            }
        }
        TLRPC.Message message = ziVar.k;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return false;
        }
        i3 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        return i3 > 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= i3;
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
        JSONObject u10 = ii.a3.u(this.J0, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new ai.q1(this, charSequence, H1, tL_inputInvoiceStarGiftDropOriginalDetails, 2));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.a).c(this, hs.G3);
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void onBackPressed() {
        f6 f6Var;
        h5 h5Var;
        if (this.U2.c(4) && (f6Var = this.Y1) != null && (h5Var = f6Var.N) != null) {
            if (h5Var.i0) {
                return;
            }
            if (h5Var.j0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.t2 || this.U2.c <= 0 || this.d2.R || this.g3) {
            super.onBackPressed();
            return;
        }
        zi ziVar = this.A2;
        if (ziVar != null) {
            i2(ziVar, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.y2;
            if (savedStarGift != null) {
                j2(savedStarGift, this.z2);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C2;
                if (tL_starGiftUnique != null) {
                    h2(this.B2, tL_starGiftUnique, this.z2);
                }
            }
        }
        s2(0, true, null);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.a).n(this, hs.G3);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p1() {
        if (this.Y2 == null && B1() != null) {
            zi ziVar = this.A2;
            if (ziVar != null) {
                TLRPC.Message message = ziVar.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TL_stars.StarGift starGift = tL_messageActionStarGift.gift;
                        if ((starGift instanceof TL_stars.TL_starGift) && !starGift.limited && starGift.availability_total <= 0 && !starGift.auction && !tL_messageActionStarGift.converted && !tL_messageActionStarGift.upgraded && !tL_messageActionStarGift.refunded && tL_messageActionStarGift.convert_stars > 0) {
                            boolean Q3 = ziVar.Q3();
                            boolean z10 = zi.B0(this.A2.k) == h10.i(this.a).e();
                            TLRPC.Peer peer = tL_messageActionStarGift.peer;
                            if (peer != null) {
                                return L1(this.a, org.telegram.messenger.m5.o(peer));
                            }
                            if (!Q3 || z10) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.y2;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (!(starGift2 instanceof TL_stars.TL_starGift) || starGift2.limited || starGift2.availability_total > 0 || starGift2.auction || savedStarGift.refunded || !L1(this.a, this.Q1)) {
                    }
                }
            }
        }
        return false;
    }

    public final void p2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        float primaryHorizontal;
        gi.l3 l3Var = this.r3;
        if ((l3Var != null && l3Var.W && this.s3 == view) || view == null) {
            return;
        }
        if (!z10) {
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
            org.telegram.ui.Components.ic[] icVarArr = (org.telegram.ui.Components.ic[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.ic.class);
            if (icVarArr == null || icVarArr.length <= 0) {
                return;
            }
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(icVarArr[icVarArr.length - 1])) + view.getPaddingLeft() + (r5.a() / 2.0f);
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
        t4 t4Var = this.R1;
        t4Var.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        gi.l3 l3Var2 = this.r3;
        if (l3Var2 != null) {
            l3Var2.f(true);
            this.r3 = null;
        }
        gi.l3 l3Var3 = new gi.l3(getContext(), 3);
        l3Var3.r(!z10);
        l3Var3.u(charSequence);
        l3Var3.p(0.0f, (iArr[0] + primaryHorizontal) - (org.telegram.messenger.g0.L(16.0f) + this.u0));
        l3Var3.setTranslationY(((iArr[1] - org.telegram.messenger.g0.L(100.0f)) - (view.getHeight() / 2.0f)) + org.telegram.messenger.g0.L((z10 ? 18 : 0) + 4.33f));
        l3Var3.d = 3000L;
        l3Var3.setPadding(org.telegram.messenger.g0.L(16.0f) + this.u0, 0, org.telegram.messenger.g0.L(16.0f) + this.u0, 0);
        l3Var3.r0 = new ai.i0(l3Var3, 1);
        l3Var3.w();
        t4Var.addView(l3Var3, mf.c(100.0f, -1));
        this.r3 = l3Var3;
        this.s3 = view;
    }

    public final void q1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String M0 = bd.M0(2131750274, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = bd.M0(2131750275, null);
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
            alertDialog$Builder.k(bd.M0(2131747813, null), new y3(this, H1, 1));
        }
        k2.p1.v(null, 2131752589, alertDialog$Builder, null);
    }

    public final void q2(int i3, Context context, boolean z10) {
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(64.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i10, this.J0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout, L2, N, null, e6Var);
        f10.addView(frameLayout, mf.t(64, 64, 49, 0, 6, 0, 0));
        fh0 fh0Var = new fh0(context);
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        fh0Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(fh0Var, mf.r(64, 64, 17));
        fh0Var.d();
        TextView b10 = rf.b(context, 20.0f, org.telegram.ui.ActionBar.k6.G6, true, null);
        b10.setGravity(17);
        b10.setText(bd.M0(z10 ? 2131750013 : 2131749919, null));
        f10.addView(b10, mf.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = rf.b(context, 14.0f, org.telegram.ui.ActionBar.k6.F6, false, null);
        b11.setGravity(17);
        b11.setText(bd.a0(null, null, z10 ? 2131750014 : 2131749920, bd.c0(Math.max(10, i3))));
        f10.addView(b11, mf.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, this.J0);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(bd.M0(2131747839, null), null);
        alertDialog$Builder.p();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void r0() {
        gi.l3 l3Var = this.r3;
        if (l3Var != null) {
            l3Var.f(true);
            this.r3 = null;
        }
    }

    public final void r1(long j10, TL_stars.starGiftDepositPayload stargiftdepositpayload, sf.b bVar, xg.e1 e1Var) {
        TL_wallet.nftItem nftitem = this.Y2;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (nftitem == null || H1 == null || TextUtils.isEmpty(H1.slug)) {
            return;
        }
        bVar.d();
        d3 d3Var = new d3(this, bVar, e1Var, j10, H1, nftitem, 0);
        if (stargiftdepositpayload != null) {
            d3Var.a(stargiftdepositpayload);
            return;
        }
        TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
        depositstargift.peer = hp.s1(this.a).j1(j10);
        depositstargift.slug = H1.slug;
        ConnectionsManager.getInstance(this.a).sendRequestTyped(depositstargift, new c3.b(1), new h2(this, bVar, e1Var, d3Var, 1));
    }

    public final void r2(boolean z10, org.telegram.ui.ActionBar.s1 s1Var, sf.b bVar, Runnable runnable) {
        bVar.d();
        h10 i3 = h10.i(this.a);
        TL_account.tmpPassword tmppassword = i3.y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.a).getCurrentTime() + 60) {
            i3.y = null;
            i3.v(false);
        }
        TL_account.tmpPassword tmppassword2 = i3.y;
        if (tmppassword2 == null) {
            V1(z10, bVar, runnable);
        } else {
            J1(tmppassword2.tmp_password, null, z10, new a3(this, z10, bVar, runnable, s1Var));
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            P(org.telegram.ui.ActionBar.k6.h5);
            f6 f6Var = this.Y1;
            if (f6Var != null) {
                f6Var.l();
            }
            wp wpVar = this.W2;
            if (wpVar != null) {
                Drawable drawable = wpVar.c;
                if (drawable instanceof g6) {
                    ((g6) drawable).d.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0));
                    gi.d dVar = this.d2;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(final long j10, final u10 u10Var) {
        TLRPC.Message message;
        long o10;
        long j11;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.y2;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            zi ziVar = this.A2;
            if (ziVar == null || (message = ziVar.k) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            o10 = org.telegram.messenger.m5.o(tL_messageActionStarGiftUnique.gift.owner_id);
            j11 = tL_messageActionStarGiftUnique.transfer_stars;
        } else {
            j11 = savedStarGift.transfer_stars;
            o10 = this.Q1;
        }
        if (j11 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = B1;
            transferstargift.to_id = hp.s1(this.a).j1(j10);
            final long j12 = o10;
            ConnectionsManager.getInstance(this.a).sendRequest(transferstargift, new RequestDelegate() { // from class: ci.k2
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    boolean z10 = tLObject instanceof TLRPC.Updates;
                    l6 l6Var = l6.this;
                    if (z10) {
                        hp.s1(l6Var.a).O3((TLRPC.Updates) tLObject, false);
                    }
                    org.telegram.messenger.g0.h3(new v2(l6Var, u10Var, tL_error, tLObject, j10, j12));
                }
            });
            return;
        }
        final long j13 = o10;
        e9 y9 = e9.y(this.a, false);
        if (!y9.e) {
            y9.r(new l2(this, y9, j10, u10Var, 0));
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = B1;
        tL_inputInvoiceStarGiftTransfer.to_id = hp.s1(this.a).j1(j10);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject u10 = ii.a3.u(this.J0, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: ci.m2
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final l6 l6Var = l6.this;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                final long j14 = j10;
                final long j15 = j13;
                final u10 u10Var2 = u10Var;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ci.t2
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.PaymentForm;
                        l6 l6Var2 = l6.this;
                        u10 u10Var3 = u10Var2;
                        if (!z10) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            u10Var3.a(tL_error2);
                            org.telegram.ui.Components.ac Y = l6Var2.k().Y(tL_error2);
                            Y.t = true;
                            Y.j();
                            return;
                        }
                        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                        int i3 = 0;
                        hp.s1(l6Var2.a).Y3(paymentForm.users, false);
                        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer2;
                        ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
                        int size = arrayList.size();
                        long j16 = 0;
                        while (i3 < size) {
                            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i3);
                            i3++;
                            j16 += tL_labeledPrice.amount;
                        }
                        ConnectionsManager.getInstance(l6Var2.a).sendRequest(tL_payments_sendStarsForm, new i2(l6Var2, j14, j15, u10Var3, j16));
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
    public final void s2(int i3, boolean z10, e1 e1Var) {
        int i10;
        gi.l3 l3Var;
        u5 u5Var;
        ValueAnimator valueAnimator = this.V2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V2 = null;
        }
        f6 f6Var = this.Y1;
        if (i3 != 1) {
            org.telegram.messenger.g0.r(f6Var.m0);
        }
        if (!this.X2) {
            this.T2 = Float.valueOf(this.R1.f());
        }
        k5 k5Var = this.U2;
        this.U2 = new k5(k5Var == null ? 0 : k5Var.c, i3);
        r4 r4Var = this.M2;
        int finalHeight = f6Var.getFinalHeight();
        int w12 = w1();
        if (this.U2.d(1)) {
            FrameLayout frameLayout = this.g2;
            if (frameLayout.getVisibility() == 0) {
                i10 = frameLayout.getMeasuredHeight();
                r4Var.H(finalHeight, w12 + i10);
                if (this.U2.c == 0 && (u5Var = this.I2) != null) {
                    u5Var.c();
                }
                int i11 = 3;
                p4 p4Var = this.w2;
                p4 p4Var2 = this.u2;
                p4 p4Var3 = this.l2;
                p4 p4Var4 = this.Z1;
                if (z10) {
                    this.U2.a = 1.0f;
                    P1();
                    p4Var4.setVisibility(i3 == 0 ? 0 : 8);
                    p4Var3.setVisibility(i3 == 1 ? 0 : 8);
                    p4Var2.setVisibility(i3 == 2 ? 0 : 8);
                    p4Var.setVisibility(i3 != 3 ? 8 : 0);
                    u2();
                    if (e1Var != null) {
                        e1Var.run();
                    }
                } else {
                    p4Var4.setVisibility(this.U2.b(0) ? 0 : 8);
                    p4Var3.setVisibility(this.U2.b(1) ? 0 : 8);
                    p4Var2.setVisibility(this.U2.b(2) ? 0 : 8);
                    p4Var.setVisibility(this.U2.b(3) ? 0 : 8);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.V2 = ofFloat;
                    ofFloat.addUpdateListener(new bh.f(this, i11));
                    this.V2.addListener(new h4(this, i3, e1Var, r5));
                    this.V2.setInterpolator(xq.h);
                    this.V2.setDuration(320L);
                    this.V2.start();
                    k5 k5Var2 = this.U2;
                    org.telegram.ui.Components.k9[] k9VarArr = f6Var.d;
                    int i12 = k5Var2.b;
                    int i13 = k5Var2.c;
                    if (i12 != i13) {
                        ch0 B = k9VarArr[i12].getImageReceiver().B();
                        ch0 B2 = k9VarArr[i13].getImageReceiver().B();
                        if (B2 != null && B != null) {
                            B2.T(false, B.t());
                        }
                    }
                }
                l3Var = this.r3;
                if (l3Var == null) {
                    l3Var.f(true);
                    this.r3 = null;
                    return;
                }
                return;
            }
        }
        i10 = 0;
        r4Var.H(finalHeight, w12 + i10);
        if (this.U2.c == 0) {
            u5Var.c();
        }
        int i112 = 3;
        p4 p4Var5 = this.w2;
        p4 p4Var22 = this.u2;
        p4 p4Var32 = this.l2;
        p4 p4Var42 = this.Z1;
        if (z10) {
        }
        l3Var = this.r3;
        if (l3Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
    public final void show() {
        zi ziVar;
        TLRPC.Message message;
        if (hp.s1(this.a).v2()) {
            org.telegram.ui.b.b(this.a);
            return;
        }
        if (this.B2 != null && this.C2 == null) {
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getContext(), null);
            s1Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.B2;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift, new ai.f3(4, this, s1Var));
        } else if (this.y2 == null && (ziVar = this.A2) != null && (message = ziVar.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, getContext(), null);
                        s1Var2.r(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new ai.r6(this, tL_messageActionStarGift, s1Var2, 1));
                        return;
                    }
                    if (B1() != null) {
                        org.telegram.ui.ActionBar.s1 s1Var3 = new org.telegram.ui.ActionBar.s1(3, getContext(), null);
                        s1Var3.r(500L);
                        e9.y(this.a, false).M(B1(), new ai.o1(6, this, s1Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t1() {
        TL_stars.InputSavedStarGift B1;
        long j10;
        gi.d dVar = this.d2;
        if (dVar.R || (B1 = B1()) == null) {
            return;
        }
        zi ziVar = this.A2;
        String str = null;
        long j11 = 0;
        if (ziVar != null) {
            TLRPC.MessageAction messageAction = ziVar.k.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j10 = tL_messageActionStarGift.upgrade_stars;
            if (j10 <= 0) {
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.y2;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
        }
        if (j10 > 0 || this.l3 != null) {
            dVar.setLoading(true);
            wo woVar = this.p2;
            if (j10 > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = woVar.a.q;
                upgradestargift.stargift = B1;
                ConnectionsManager.getInstance(this.a).sendRequest(upgradestargift, new ai.f3(6, this, B1));
                return;
            }
            int i3 = 0;
            e9 y9 = e9.y(this.a, false);
            if (!y9.e) {
                y9.r(new e0(5, this, y9));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.l3.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = woVar.a.q;
                tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = hp.s1(this.a).j1(this.Q1);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.l3.invoice.prices;
            int size = arrayList.size();
            while (i3 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i3);
                i3++;
                j11 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new a0(this, str, B1, j11, 1));
        }
    }

    public final void t2(boolean z10) {
        boolean z11;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        hp.e1().edit().putInt("statusgiftpage", 3).apply();
        boolean M1 = M1(this.a, H1());
        boolean z12 = !M1;
        boolean M12 = M1(this.a, H1());
        gi.d dVar = this.d2;
        int i3 = 1;
        if (M12) {
            hp.s1(this.a).g5(x1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z11 = z12;
        } else {
            z11 = z12;
            long x12 = x1();
            if (x12 >= 0) {
                if (!h10.i(this.a).q()) {
                    org.telegram.ui.Components.ac P = k().P(R.raw.star_premium_2, org.telegram.messenger.g0.x2(bd.M0(2131750431, null), new s1(this, 2)));
                    P.t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                hp s12 = hp.s1(this.a);
                dVar.setLoading(true);
                hp.s1(this.a).G0().a(x12, new u1(this, s12, x12, 0));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = H1.id;
            hp.s1(this.a).g5(x1(), tL_inputEmojiStatusCollectible, H1);
        }
        this.Y1.J[1].e(!M1 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, bd.M0(!M1 ? 2131750430 : 2131750433, null), true);
        if (this.t2) {
            dismiss();
            return;
        }
        e1 e1Var = new e1(i3, this, z11);
        if (this.U2.c(0)) {
            e1Var.run();
        } else {
            s2(0, true, e1Var);
        }
        dVar.i(bd.M0(2131747839, null), !this.X2, true);
        dVar.g(null, !this.X2);
        dVar.setOnClickListener(new r1(this, 5));
    }

    public final void u2() {
        FrameLayout frameLayout = this.g2;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.i2;
        FrameLayout frameLayout3 = this.e2;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.U2.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.U2.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.U2.a(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    public final void v2() {
        boolean I1 = I1(false);
        n4 n4Var = this.S1;
        n4Var.setPosition(I1 ? 1 : 0);
        n4Var.C(false);
        if (this.z2 == null || I1(true) || this.z2.e() >= this.z2.c()) {
            return;
        }
        this.z2.a();
    }

    public final int w1() {
        if (this.U2.d(1)) {
            return this.l2.getMeasuredHeight();
        }
        if (this.U2.d(2)) {
            return this.u2.getMeasuredHeight();
        }
        if (this.U2.d(3)) {
            return this.w2.getMeasuredHeight();
        }
        if (this.U2.d(4)) {
            return 0;
        }
        return this.Z1.getMeasuredHeight();
    }

    public final void w2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        TL_wallet.nftItem nftitem = this.Y2;
        LinearLayout linearLayout = this.r2;
        if (nftitem == null || H1 == null) {
            linearLayout.setVisibility(8);
            return;
        }
        this.a2.setVisibility(8);
        this.c2.setVisibility(8);
        linearLayout.setVisibility(0);
        this.s2.a(H1.host_id != null, linearLayout.isAttachedToWindow());
    }

    public final long x1() {
        TLRPC.Peer peer;
        zi ziVar = this.A2;
        if (ziVar == null) {
            TL_stars.SavedStarGift savedStarGift = this.y2;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? org.telegram.messenger.m5.o(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.Q1;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C2;
            if (tL_starGiftUnique != null) {
                return org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id);
            }
            return 0L;
        }
        TLRPC.Message message = ziVar.k;
        if (message == null) {
            return 0L;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
            return peer2 != null ? org.telegram.messenger.m5.o(peer2) : ziVar.Q3() ? zi.B0(this.A2.k) : h10.i(this.a).e();
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
        zi ziVar = this.A2;
        if (ziVar != null) {
            TLRPC.Message message = ziVar.k;
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
            TL_stars.SavedStarGift savedStarGift = this.y2;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C2;
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
        return k2.p1.l(r0.num, ',', sb2);
    }
}
