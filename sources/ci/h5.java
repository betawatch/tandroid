package ci;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import j$.util.Map;
import j$.util.Map$Entry$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h5 extends FrameLayout {
    public final w4[] E;
    public final org.telegram.ui.Components.o5 F;
    public final x4 G;
    public final LinearLayout H;
    public final org.telegram.ui.Components.h6 I;
    public final org.telegram.ui.Components.h6 J;
    public final fh0 K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final LinearLayout O;
    public ai.q2[] P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public final FrameLayout T;
    public gi.l3 U;
    public final int[] V;
    public final int[] W;
    public final org.telegram.ui.ActionBar.e6 a;
    public int a0;
    public final g5 b;
    public long b0;
    public final ImageView c;
    public TLRPC.Document c0;
    public final ai.c0[] d;
    public String d0;
    public final ai.c0 e;
    public ArrayList e0;
    public final d5 f;
    public p10 f0;
    public n10 g0;
    public final b5 h;
    public Runnable h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public Runnable l0;
    public fh0 m0;
    public final f5[] n;
    public SpannableStringBuilder n0;
    public final yh.l r;
    public boolean s;
    public final LinearLayout w;
    public final LinearLayout x;
    public final w4[] y;

    /* JADX WARN: Multi-variable type inference failed */
    public h5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3 = 6;
        this.V = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.W = new int[]{org.telegram.ui.ActionBar.k6.r1(0.08f, -1), org.telegram.ui.ActionBar.k6.r1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = e6Var;
        g5 g5Var = new g5();
        this.b = g5Var;
        Drawable g7 = k2.p1.g(context, R.drawable.filled_forge);
        g7.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        g5Var.g = g7;
        setBackground(g5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        addView(frameLayout, mf.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new v5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
        frameLayout.addView(imageView, mf.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        Object[] objArr = 0;
        imageView.setOnClickListener(new u4(this, 0));
        pf.a(imageView);
        View e10 = org.telegram.messenger.camera.q.e(context, R.drawable.msg_close);
        e10.setBackground(new v5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
        frameLayout.addView(e10, mf.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        int i10 = 1;
        e10.setOnClickListener(new u4(this, i10));
        pf.a(e10);
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(bd.M0(2131749766, null));
        addView(textView, mf.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        addView(frameLayout2, mf.e(-1, -1, hs.E1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.S = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, mf.e(-1, -1, hs.E1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, mf.e(-1, -1, hs.E1));
        yh.l lVar = new yh.l(context);
        this.r = lVar;
        lVar.setGravity(17);
        lVar.setTextSize(1, 13.0f);
        lVar.setTextColor(-1);
        frameLayout2.addView(lVar, mf.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        int i11 = 2;
        layoutTransition.setDuration(2, 320L);
        int i12 = 3;
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        xq xqVar = xq.h;
        layoutTransition.setInterpolator(2, xqVar);
        layoutTransition.setInterpolator(3, xqVar);
        layoutTransition.setInterpolator(0, xqVar);
        layoutTransition.setInterpolator(1, xqVar);
        layoutTransition.setInterpolator(4, xqVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.x = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, xqVar);
        layoutTransition2.setInterpolator(3, xqVar);
        layoutTransition2.setInterpolator(0, xqVar);
        layoutTransition2.setInterpolator(1, xqVar);
        layoutTransition2.setInterpolator(4, xqVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.y = new w4[4];
        this.E = new w4[4];
        for (int i13 = 0; i13 < 4; i13++) {
            LinearLayout linearLayout3 = this.w;
            w4[] w4VarArr = this.y;
            w4 w4Var = new w4(context);
            w4VarArr[i13] = w4Var;
            linearLayout3.addView(w4Var, mf.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i13].setOnClickListener(new u4(this, i11));
        }
        for (int i14 = 0; i14 < 4; i14++) {
            LinearLayout linearLayout4 = this.w;
            w4[] w4VarArr2 = this.E;
            w4 w4Var2 = new w4(context);
            w4VarArr2[i14] = w4Var2;
            linearLayout4.addView(w4Var2, mf.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.E[i14].setOnClickListener(new u4(this, i12));
        }
        this.n = new f5[4];
        this.d = new ai.c0[6];
        int i15 = 0;
        while (i15 < i3) {
            ai.c0[] c0VarArr = this.d;
            int i16 = i15 == 5 ? i10 : 0;
            ai.c0 c0Var = new ai.c0(i10, context, (boolean) (objArr == true ? 1 : 0));
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new v5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
            c0Var.addView(frameLayout5, mf.d(-1, -1.0f, hs.E1, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9Var.setImageResource(R.drawable.large_forge);
            k9Var.setAlpha(i16 != 0 ? 1.0f : 0.45f);
            frameLayout5.addView(k9Var, mf.e(i16 != 0 ? 42 : 64, i16 != 0 ? 42 : 64, 17));
            if (i16 != 0) {
                k9Var.setTranslationX(org.telegram.messenger.g0.L(-4.0f));
                c5 c5Var = new c5(context);
                c0Var.c = c5Var;
                c5Var.e = org.telegram.messenger.g0.L(37.0f);
                c5Var.a.setStrokeWidth(org.telegram.messenger.g0.N(4.66f));
                frameLayout5.addView(c5Var, mf.e(90, 90, 17));
                org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
                c0Var.b = h6Var;
                h6Var.getDrawable().r(false, true);
                h6Var.setTypeface(org.telegram.messenger.g0.o());
                h6Var.setTextColor(-1);
                h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                h6Var.setGravity(17);
                h6Var.setText("0%");
                frameLayout5.addView(h6Var, mf.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            c0VarArr[i15] = c0Var;
            i15++;
            i3 = 6;
            i10 = 1;
        }
        this.e = this.d[5];
        d5 d5Var = new d5(context);
        this.f = d5Var;
        d5Var.setVisibility(8);
        d5Var.setAlpha(0.0f);
        addView(d5Var, mf.d(hs.X4, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        b5 b5Var = new b5(context, this.d);
        this.h = b5Var;
        addView(b5Var, mf.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.F = o5Var;
        o5Var.setTextSize(1, 12.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setText(org.telegram.messenger.g0.I2(bd.M0(2131749762, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
        o5Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        o5Var.setGravity(17);
        o5Var.setTextColor(-1);
        o5Var.setAlpha(this.e0 != null ? 1.0f : 0.25f);
        o5Var.setBackground(new v5(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
        pf.b(o5Var, 0.02f, 1.2f);
        this.R.addView(o5Var, mf.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        o5Var.setOnClickListener(new ai.d(13, this, e6Var));
        this.R.addView(this.w, mf.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.R.addView(this.x, mf.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.H = linearLayout5;
        linearLayout5.setOrientation(1);
        x4 x4Var = new x4();
        this.G = x4Var;
        linearLayout5.setBackground(x4Var);
        x4Var.a(org.telegram.ui.ActionBar.k6.r1(0.08f, -1), org.telegram.ui.ActionBar.k6.r1(0.08f, -1));
        pf.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, mf.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new u4(this, 4));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.I = h6Var2;
        h6Var2.setTypeface(org.telegram.messenger.g0.o());
        h6Var2.setGravity(17);
        h6Var2.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
        h6Var2.setText(bd.M0(2131749805, null));
        h6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        linearLayout5.addView(h6Var2, mf.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.J = h6Var3;
        h6Var3.getDrawable().r(true, false);
        h6Var3.setGravity(17);
        h6Var3.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
        h6Var3.setText(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749774, "0%")));
        h6Var3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        linearLayout5.addView(h6Var3, mf.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        fh0 fh0Var = new fh0(context);
        this.K = fh0Var;
        fh0Var.setAutoRepeat(true);
        fh0Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(fh0Var, mf.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setGravity(17);
        textView2.setText(bd.M0(2131749782, null));
        linearLayout6.addView(textView2, mf.t(-2, -2, 17, 0, 0, 0, 0));
        this.S.addView(linearLayout6, mf.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.5f, -1));
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setGravity(17);
        TextView m10 = org.telegram.ui.Cells.f1.m(this.S, textView3, mf.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.M = m10;
        m10.setTextSize(1, 13.0f);
        m10.setTextColor(-1);
        m10.setTypeface(org.telegram.messenger.g0.o());
        m10.setGravity(17);
        m10.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        m10.setBackground(new v5(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
        TextView m11 = org.telegram.ui.Cells.f1.m(this.S, m10, mf.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        m11.setTextSize(1, 13.0f);
        m11.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.5f, -1));
        org.telegram.messenger.k5.m(m11, 17, null, 2131749783);
        TextView m12 = org.telegram.ui.Cells.f1.m(this.S, m11, mf.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        m12.setText(bd.M0(2131749796, null));
        m12.setTextColor(-505270);
        m12.setTextSize(1, 20.0f);
        m12.setTypeface(org.telegram.messenger.g0.o());
        m12.setGravity(17);
        TextView m13 = org.telegram.ui.Cells.f1.m(this.T, m12, mf.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.N = m13;
        m13.setTextColor(-17253);
        m13.setTextSize(1, 13.0f);
        m13.setGravity(17);
        this.T.addView(m13, mf.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.O = linearLayout7;
        linearLayout7.setOrientation(0);
        this.T.addView(linearLayout7, mf.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.P = null;
        d(true);
    }

    public final void a(int i3, long j10, TLRPC.Document document, String str) {
        f5[] f5VarArr;
        this.a0 = i3;
        this.b0 = j10;
        this.c0 = document;
        this.d0 = str;
        this.i0 = false;
        this.k0 = false;
        int i10 = 0;
        while (true) {
            f5VarArr = this.n;
            if (i10 >= f5VarArr.length) {
                break;
            }
            f5 f5Var = f5VarArr[i10];
            if (f5Var != null) {
                org.telegram.messenger.g0.E2(f5Var);
            }
            i10++;
        }
        b5 b5Var = this.h;
        View[] viewArr = b5Var.a;
        a5 a5Var = b5Var.I;
        if (a5Var != null) {
            a5Var.e = true;
            a5Var.l = false;
            a5Var.a.I = null;
            b5Var.I = null;
        }
        ValueAnimator valueAnimator = b5Var.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            b5Var.H = null;
        }
        b5Var.G = -1;
        b5Var.F = 0.0f;
        b5Var.w.clear();
        b5Var.x.clear();
        b5Var.y.clear();
        for (int i11 = 0; i11 < 6; i11++) {
            b5Var.E[i11] = 0.0f;
        }
        b5Var.removeAllViews();
        for (int i12 = 0; i12 < viewArr.length; i12++) {
            viewArr[i12].setAlpha(1.0f);
            viewArr[i12].setVisibility(0);
            b5Var.addView(viewArr[i12], mf.e(hs.t1, hs.t1, 17));
        }
        Matrix.setIdentityM(b5Var.c, 0);
        b5Var.e = 0.0f;
        b5Var.d = 0.0f;
        b5Var.f = true;
        f5 f5Var2 = new f5(getContext());
        f5VarArr[0] = f5Var2;
        addView(f5Var2, mf.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        f5 f5Var3 = new f5(getContext());
        f5VarArr[1] = f5Var3;
        addView(f5Var3, mf.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        f5 f5Var4 = new f5(getContext());
        f5VarArr[2] = f5Var4;
        addView(f5Var4, mf.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        f5 f5Var5 = new f5(getContext());
        f5VarArr[3] = f5Var5;
        addView(f5Var5, mf.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i13 = 0; i13 < f5VarArr.length; i13++) {
            pf.a(f5VarArr[i13]);
            f5VarArr[i13].setClickable(true);
            f5VarArr[i13].setOnClickListener(new u4(this, 5));
        }
        d(false);
        this.i0 = false;
        FrameLayout frameLayout = this.R;
        frameLayout.animate().cancel();
        frameLayout.setAlpha(1.0f);
        LinearLayout linearLayout = this.H;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        FrameLayout frameLayout2 = this.S;
        frameLayout2.animate().cancel();
        frameLayout2.setAlpha(0.0f);
        FrameLayout frameLayout3 = this.T;
        frameLayout3.animate().cancel();
        frameLayout3.setAlpha(0.0f);
        FrameLayout frameLayout4 = this.Q;
        frameLayout4.animate().cancel();
        frameLayout4.setAlpha(1.0f);
        this.F.setAlpha(this.s ? 0.0f : this.e0 != null ? 1.0f : 0.25f);
        d5 d5Var = this.f;
        d5Var.setVisibility(8);
        d5Var.setAlpha(0.0f);
        String M0 = bd.M0(2131749805, null);
        org.telegram.ui.Components.h6 h6Var = this.I;
        h6Var.setText(M0);
        h6Var.setTranslationY(0.0f);
        this.J.setAlpha(1.0f);
        org.telegram.messenger.q9.c(i3).j(j10, new v4(this, j10, j10, 0));
    }

    public final void b(w4 w4Var) {
        if (w4Var.d != null) {
            c(w4Var, org.telegram.messenger.g0.X2(bd.G(Math.round(w4Var.f * 100.0f), "GiftCraftBackdropChance", w4Var.d.name)));
        } else if (w4Var.e != null) {
            c(w4Var, org.telegram.messenger.g0.X2(bd.G(Math.round(w4Var.f * 100.0f), "GiftCraftSymbolChance", w4Var.e.name)));
        }
    }

    public final void c(w4 w4Var, SpannableStringBuilder spannableStringBuilder) {
        gi.l3 l3Var = this.U;
        if (l3Var != null) {
            l3Var.f(true);
            this.U = null;
        }
        if (this.i0 || this.k0) {
            return;
        }
        View view = w4Var.getParent() instanceof View ? (View) w4Var.getParent() : null;
        float x10 = w4Var.getX() + (view != null ? view.getX() : 0.0f);
        float y9 = w4Var.getY() + (view != null ? view.getY() : 0.0f);
        gi.l3 l3Var2 = new gi.l3(getContext(), 3);
        this.U = l3Var2;
        l3Var2.r(true);
        this.U.u(spannableStringBuilder);
        gi.l3 l3Var3 = this.U;
        l3Var3.h = gi.l3.a(l3Var3.getText(), this.U.getTextPaint());
        gi.l3 l3Var4 = this.U;
        l3Var4.L = Layout.Alignment.ALIGN_CENTER;
        l3Var4.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        addView(this.U, mf.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.U.setTranslationY(y9 - org.telegram.messenger.g0.L(100.0f));
        this.U.p(0.0f, ((w4Var.getWidth() / 2.0f) + x10) - org.telegram.messenger.g0.L(2.0f));
        this.U.w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x04bd, code lost:
    
        if (r4 != null) goto L187;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z10) {
        int i3;
        f5[] f5VarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i10;
        HashMap hashMap2;
        boolean z11;
        w4[] w4VarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        boolean z12;
        TL_stars.StarGift starGift;
        int i11;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        ai.c0 c0Var = this.e;
        org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) c0Var.b;
        boolean z13 = true;
        if (h6Var != null) {
            h6Var.c(Math.round(giftsSuccessChance) + "%", z10, true);
            c5 c5Var = (c5) c0Var.c;
            float f10 = giftsSuccessChance / 100.0f;
            c5Var.d = f10;
            if (!z10) {
                c5Var.b.e(true, f10);
            }
            c5Var.invalidate();
        }
        org.telegram.ui.Components.h6 h6Var2 = this.J;
        int i12 = 0;
        if (giftsSelectedCount <= 0) {
            if (this.n0 == null) {
                this.n0 = new SpannableStringBuilder("+");
                wp wpVar = new wp(R.drawable.filled_add_album, 0);
                wpVar.I = 0.65f;
                wpVar.J = 0.65f;
                SpannableStringBuilder spannableStringBuilder = this.n0;
                spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bd.M0(2131749804, null));
            org.telegram.messenger.g0.M2(spannableStringBuilder2, this.n0, "+");
            h6Var2.setText(spannableStringBuilder2);
        } else {
            h6Var2.setText(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749774, ii.k.J0(getGiftsSuccessChance()))));
        }
        int i13 = (giftsSelectedCount == 0 ? 0 : giftsSelectedCount < 4 ? 1 : 2) * 2;
        int[] iArr = this.W;
        int i14 = i13 + 1;
        this.G.a(iArr[i13], iArr[i14]);
        int[] iArr2 = this.V;
        this.b.a(iArr2[i13], iArr2[i14]);
        this.f.a(iArr[i14], iArr[i13]);
        if (this.c0 != null) {
            TL_stars.StarGift firstGift = getFirstGift();
            yh.l lVar = this.r;
            if (firstGift != null) {
                SpannableString spannableString = new SpannableString("x");
                i3 = 3;
                spannableString.setSpan(new org.telegram.ui.Components.p5(this.c0, lVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                lVar.setText(TextUtils.concat(org.telegram.messenger.g0.X2(bd.M0(2131749770, null)), "\n", spannableString, " ", org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749769, this.d0, bd.E(firstGift.num, ',')))));
            } else {
                i3 = 3;
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new org.telegram.ui.Components.p5(this.c0, lVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                lVar.setText(TextUtils.concat(org.telegram.messenger.g0.X2(bd.M0(2131749768, null)), "\n", spannableString2, " ", org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749767, this.d0))));
            }
        } else {
            i3 = 3;
        }
        int[][] iArr3 = hp.s1(this.a0).c7;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            f5VarArr = this.n;
            if (i15 >= f5VarArr.length) {
                break;
            }
            f5 f5Var = f5VarArr[i15];
            if (f5Var != null) {
                TL_stars.StarGift starGift2 = f5Var.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i16++;
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) e9.l(starGift2.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) e9.l(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i15++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        w4[] w4VarArr2 = this.y;
        if (isEmpty) {
            w4 w4Var = w4VarArr2[0];
            w4Var.a(null);
            w4Var.c(true, 0.0f);
            arrayList.add(w4Var);
            for (int i17 = 1; i17 < 4; i17++) {
                w4VarArr2[i17].setVisibility(8);
            }
            hashMap = hashMap4;
        } else {
            ArrayList arrayList2 = new ArrayList(hashMap3.entrySet());
            Collections.sort(arrayList2, Map$Entry$-CC.comparingByValue());
            int size = arrayList2.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size) {
                Object obj = arrayList2.get(i18);
                i18++;
                Map.Entry entry = (Map.Entry) obj;
                int intValue = ((Integer) entry.getKey()).intValue();
                int intValue2 = ((Integer) entry.getValue()).intValue();
                int i20 = i12;
                boolean z14 = z13;
                while (true) {
                    if (i20 >= f5VarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    f5 f5Var2 = f5VarArr[i20];
                    if (f5Var2 != null) {
                        TL_stars.StarGift starGift3 = f5Var2.h;
                        if ((starGift3 != null ? starGift3 : null) != null) {
                            if (starGift3 == null) {
                                starGift3 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e9.l(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
                            if (stargiftattributebackdrop.backdrop_id == intValue) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i20++;
                }
                if (stargiftattributebackdrop != null) {
                    w4 w4Var2 = w4VarArr2[i19];
                    w4Var2.a(stargiftattributebackdrop);
                    i10 = size;
                    int[] iArr4 = iArr3[Utilities.j(i16 - 1, iArr3.length - 1, 0)];
                    int i21 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    w4Var2.c(z14, iArr4[Utilities.j(i21, iArr4.length - 1, 0)] / 1000.0f);
                    arrayList.add(w4Var2);
                    i19++;
                } else {
                    i10 = size;
                    hashMap2 = hashMap4;
                }
                hashMap4 = hashMap2;
                size = i10;
                i12 = 0;
                z13 = true;
            }
            hashMap = hashMap4;
            for (int i22 = i19; i22 < 4; i22++) {
                w4VarArr2[i22].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        w4[] w4VarArr3 = this.E;
        if (isEmpty2) {
            w4 w4Var3 = w4VarArr3[0];
            w4Var3.b(null);
            w4Var3.c(true, 0.0f);
            arrayList.add(w4Var3);
            for (int i23 = 1; i23 < 4; i23++) {
                w4VarArr3[i23].setVisibility(8);
            }
            z11 = true;
        } else {
            ArrayList arrayList3 = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList3, Map$Entry$-CC.comparingByValue());
            int size2 = arrayList3.size();
            int i24 = 0;
            int i25 = 0;
            while (i25 < size2) {
                Object obj2 = arrayList3.get(i25);
                i25++;
                Map.Entry entry2 = (Map.Entry) obj2;
                long longValue = ((Long) entry2.getKey()).longValue();
                int intValue3 = ((Integer) entry2.getValue()).intValue();
                int i26 = 0;
                while (true) {
                    if (i26 >= f5VarArr.length) {
                        w4VarArr = w4VarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    f5 f5Var3 = f5VarArr[i26];
                    if (f5Var3 != null) {
                        TL_stars.StarGift starGift4 = f5Var3.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) e9.l(starGift4.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                w4VarArr = w4VarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i26++;
                                    w4VarArr3 = w4VarArr;
                                }
                            }
                        }
                    }
                    w4VarArr = w4VarArr3;
                    i26++;
                    w4VarArr3 = w4VarArr;
                }
                if (stargiftattributepattern != null) {
                    int i27 = i24 + 1;
                    w4 w4Var4 = w4VarArr[i24];
                    w4Var4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.j(i16 - 1, iArr3.length - 1, 0)];
                    w4Var4.c(true, iArr5[Utilities.j(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f);
                    arrayList.add(w4Var4);
                    i24 = i27;
                }
                w4VarArr3 = w4VarArr;
            }
            w4[] w4VarArr4 = w4VarArr3;
            z11 = true;
            while (i24 < 4) {
                w4VarArr4[i24].setVisibility(8);
                i24++;
            }
        }
        this.s = arrayList.size() > 5 ? z11 : false;
        int i28 = 0;
        while (true) {
            int size3 = arrayList.size();
            linearLayout = this.x;
            if (i28 >= size3) {
                break;
            }
            w4 w4Var5 = (w4) arrayList.get(i28);
            if (!this.s || i28 < arrayList.size() / 2.0f) {
                linearLayout = this.w;
            }
            if (w4Var5.getParent() != linearLayout) {
                ViewParent parent = w4Var5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z15 = layoutTransition != null ? z11 : false;
                    i11 = i3;
                    if (z15) {
                        layoutTransition.disableTransitionType(i11);
                    }
                    viewGroup.removeView(w4Var5);
                    if (z15) {
                        layoutTransition.enableTransitionType(i11);
                    }
                    w4Var5.animate().cancel();
                    w4Var5.clearAnimation();
                    w4Var5.setTranslationX(0.0f);
                    w4Var5.setTranslationY(0.0f);
                    w4Var5.setTranslationZ(0.0f);
                    w4Var5.setAlpha(0.0f);
                    w4Var5.setScaleX(1.0f);
                    w4Var5.setScaleY(1.0f);
                    w4Var5.setRotation(0.0f);
                    w4Var5.setRotationX(0.0f);
                    w4Var5.setRotationY(0.0f);
                } else {
                    i11 = i3;
                }
                linearLayout.addView(w4Var5, mf.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            } else {
                i11 = i3;
            }
            w4Var5.setVisibility(0);
            i28++;
            i3 = i11;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.F.animate().alpha(this.s ? 0.0f : this.e0 != null ? 1.0f : 0.25f);
        boolean z16 = z11;
        for (int i29 = 0; i29 < f5VarArr.length; i29++) {
            f5 f5Var4 = f5VarArr[i29];
            if (f5Var4 != null) {
                TL_stars.StarGift starGift5 = f5Var4.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null) {
                    int i30 = R.drawable.msg_close;
                    if (z16) {
                        int i31 = i29 + 1;
                        while (true) {
                            if (i31 >= f5VarArr.length) {
                                break;
                            }
                            f5 f5Var5 = f5VarArr[i31];
                            if (f5Var5 != null) {
                                starGift = f5Var5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i31++;
                        }
                        starGift = null;
                        f5 f5Var6 = f5VarArr[i29];
                        boolean z17 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : z11;
                        ImageView imageView = f5Var6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        f5Var6.n = z17;
                        if (z17) {
                            i30 = R.drawable.mini_replace2;
                        }
                        imageView.setImageResource(i30);
                        z12 = false;
                    } else {
                        ImageView imageView2 = f5Var4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        z12 = false;
                        f5Var4.n = false;
                        imageView2.setImageResource(R.drawable.msg_close);
                    }
                    z16 = z12;
                }
            }
        }
    }

    public TL_stars.StarGift getFirstGift() {
        int i3 = 0;
        while (true) {
            f5[] f5VarArr = this.n;
            if (i3 >= f5VarArr.length) {
                return null;
            }
            f5 f5Var = f5VarArr[i3];
            if (f5Var != null) {
                TL_stars.StarGift starGift = f5Var.h;
                if ((starGift != null ? starGift : null) != null) {
                    if (starGift != null) {
                        return starGift;
                    }
                    return null;
                }
            }
            i3++;
        }
    }

    public int getGiftsSelectedCount() {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            f5[] f5VarArr = this.n;
            if (i3 >= f5VarArr.length) {
                return i10;
            }
            f5 f5Var = f5VarArr[i3];
            if (f5Var != null) {
                TL_stars.StarGift starGift = f5Var.h;
                if (starGift == null) {
                    starGift = null;
                }
                if (starGift != null) {
                    i10++;
                }
            }
            i3++;
        }
    }

    public int getGiftsSuccessChance() {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            f5[] f5VarArr = this.n;
            if (i3 >= f5VarArr.length) {
                return i10;
            }
            f5 f5Var = f5VarArr[i3];
            if (f5Var != null) {
                TL_stars.StarGift starGift = f5Var.h;
                if ((starGift != null ? starGift : null) != null) {
                    if (starGift == null) {
                        starGift = null;
                    }
                    i10 += starGift.craft_chance_permille;
                }
            }
            i3++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i10);
    }

    public void setOnAddGift(n10 n10Var) {
        this.g0 = n10Var;
    }

    public void setOnClose(Runnable runnable) {
        this.h0 = runnable;
    }

    public void setOnCraft(p10 p10Var) {
        this.f0 = p10Var;
    }
}
