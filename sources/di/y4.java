package di;

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
import j$.util.Map;
import j$.util.Map$Entry$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class y4 extends FrameLayout {
    public final n4[] E;
    public final org.telegram.ui.Components.o5 F;
    public final o4 G;
    public final LinearLayout H;
    public final org.telegram.ui.Components.h6 I;
    public final org.telegram.ui.Components.h6 J;
    public final fh0 K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final LinearLayout O;
    public bi.i2[] P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public final FrameLayout T;
    public hi.l3 U;
    public final int[] V;
    public final int[] W;
    public final org.telegram.ui.ActionBar.e6 a;
    public int a0;
    public final x4 b;
    public long b0;
    public final ImageView c;
    public TLRPC.Document c0;
    public final ai.j0[] d;
    public String d0;
    public final ai.j0 e;
    public ArrayList e0;
    public final u4 f;
    public u10 f0;
    public s10 g0;
    public final s4 h;
    public Runnable h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public Runnable l0;
    public fh0 m0;
    public final w4[] n;
    public SpannableStringBuilder n0;
    public final xh.l r;
    public boolean s;
    public final LinearLayout w;
    public final LinearLayout x;
    public final n4[] y;

    /* JADX WARN: Multi-variable type inference failed */
    public y4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i7 = 6;
        this.V = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.W = new int[]{org.telegram.ui.ActionBar.j6.r1(0.08f, -1), org.telegram.ui.ActionBar.j6.r1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = e6Var;
        x4 x4Var = new x4();
        this.b = x4Var;
        Drawable g10 = i5.c.g(context, R.drawable.filled_forge);
        g10.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        x4Var.g = g10;
        setBackground(x4Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        addView(frameLayout, c8.ja.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new m5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.j6.r1(0.08f, -1)));
        frameLayout.addView(imageView, c8.ja.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        Object[] objArr = 0;
        imageView.setOnClickListener(new l4(this, 0));
        c8.na.a(imageView);
        View e10 = i20.e(context, R.drawable.msg_close);
        e10.setBackground(new m5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.j6.r1(0.08f, -1)));
        frameLayout.addView(e10, c8.ja.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        int i10 = 1;
        e10.setOnClickListener(new l4(this, i10));
        c8.na.a(e10);
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(hd.M0(2131749758, null));
        addView(textView, c8.ja.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        addView(frameLayout2, c8.ja.e(-1, -1, ns.E1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.S = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, c8.ja.e(-1, -1, ns.E1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, c8.ja.e(-1, -1, ns.E1));
        xh.l lVar = new xh.l(context);
        this.r = lVar;
        lVar.setGravity(17);
        lVar.setTextSize(1, 13.0f);
        lVar.setTextColor(-1);
        frameLayout2.addView(lVar, c8.ja.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        int i11 = 2;
        layoutTransition.setDuration(2, 320L);
        int i12 = 3;
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        int i13 = 4;
        layoutTransition.setDuration(4, 320L);
        er erVar = er.h;
        layoutTransition.setInterpolator(2, erVar);
        layoutTransition.setInterpolator(3, erVar);
        layoutTransition.setInterpolator(0, erVar);
        layoutTransition.setInterpolator(1, erVar);
        layoutTransition.setInterpolator(4, erVar);
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
        layoutTransition2.setInterpolator(2, erVar);
        layoutTransition2.setInterpolator(3, erVar);
        layoutTransition2.setInterpolator(0, erVar);
        layoutTransition2.setInterpolator(1, erVar);
        layoutTransition2.setInterpolator(4, erVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.y = new n4[4];
        this.E = new n4[4];
        for (int i14 = 0; i14 < 4; i14++) {
            LinearLayout linearLayout3 = this.w;
            n4[] n4VarArr = this.y;
            n4 n4Var = new n4(context);
            n4VarArr[i14] = n4Var;
            linearLayout3.addView(n4Var, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i14].setOnClickListener(new l4(this, i11));
        }
        for (int i15 = 0; i15 < 4; i15++) {
            LinearLayout linearLayout4 = this.w;
            n4[] n4VarArr2 = this.E;
            n4 n4Var2 = new n4(context);
            n4VarArr2[i15] = n4Var2;
            linearLayout4.addView(n4Var2, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.E[i15].setOnClickListener(new l4(this, i12));
        }
        this.n = new w4[4];
        this.d = new ai.j0[6];
        int i16 = 0;
        while (i16 < i7) {
            ai.j0[] j0VarArr = this.d;
            int i17 = i16 == 5 ? i10 : 0;
            ai.j0 j0Var = new ai.j0(i13, context, (boolean) (objArr == true ? 1 : 0));
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new m5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.j6.r1(0.08f, -1)));
            j0Var.addView(frameLayout5, c8.ja.d(-1, -1.0f, ns.E1, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
            i9Var.setImageResource(R.drawable.large_forge);
            i9Var.setAlpha(i17 != 0 ? 1.0f : 0.45f);
            frameLayout5.addView(i9Var, c8.ja.e(i17 != 0 ? 42 : 64, i17 != 0 ? 42 : 64, 17));
            if (i17 != 0) {
                i9Var.setTranslationX(org.telegram.messenger.g0.L(-4.0f));
                t4 t4Var = new t4(context);
                j0Var.c = t4Var;
                t4Var.e = org.telegram.messenger.g0.L(37.0f);
                t4Var.a.setStrokeWidth(org.telegram.messenger.g0.N(4.66f));
                frameLayout5.addView(t4Var, c8.ja.e(90, 90, 17));
                org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
                j0Var.b = h6Var;
                h6Var.getDrawable().r(false, true);
                h6Var.setTypeface(org.telegram.messenger.g0.o());
                h6Var.setTextColor(-1);
                h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                h6Var.setGravity(17);
                h6Var.setText("0%");
                frameLayout5.addView(h6Var, c8.ja.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            j0VarArr[i16] = j0Var;
            i16++;
            i7 = 6;
            i13 = 4;
            i10 = 1;
        }
        this.e = this.d[5];
        u4 u4Var = new u4(context);
        this.f = u4Var;
        u4Var.setVisibility(8);
        u4Var.setAlpha(0.0f);
        addView(u4Var, c8.ja.d(ns.X4, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        s4 s4Var = new s4(context, this.d);
        this.h = s4Var;
        addView(s4Var, c8.ja.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.F = o5Var;
        o5Var.setTextSize(1, 12.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setText(org.telegram.messenger.g0.I2(hd.M0(2131749754, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
        o5Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        o5Var.setGravity(17);
        o5Var.setTextColor(-1);
        o5Var.setAlpha(this.e0 != null ? 1.0f : 0.25f);
        o5Var.setBackground(new m5(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.j6.r1(0.08f, -1)));
        c8.na.b(o5Var, 0.02f, 1.2f);
        this.R.addView(o5Var, c8.ja.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        o5Var.setOnClickListener(new ai.t2(15, this, e6Var));
        this.R.addView(this.w, c8.ja.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.R.addView(this.x, c8.ja.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.H = linearLayout5;
        linearLayout5.setOrientation(1);
        o4 o4Var = new o4();
        this.G = o4Var;
        linearLayout5.setBackground(o4Var);
        o4Var.a(org.telegram.ui.ActionBar.j6.r1(0.08f, -1), org.telegram.ui.ActionBar.j6.r1(0.08f, -1));
        c8.na.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, c8.ja.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new l4(this, 4));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.I = h6Var2;
        h6Var2.setTypeface(org.telegram.messenger.g0.o());
        h6Var2.setGravity(17);
        h6Var2.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.75f, -1));
        h6Var2.setText(hd.M0(2131749797, null));
        h6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        linearLayout5.addView(h6Var2, c8.ja.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.J = h6Var3;
        h6Var3.getDrawable().r(true, false);
        h6Var3.setGravity(17);
        h6Var3.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.75f, -1));
        h6Var3.setText(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749766, "0%")));
        h6Var3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        linearLayout5.addView(h6Var3, c8.ja.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        fh0 fh0Var = new fh0(context);
        this.K = fh0Var;
        fh0Var.setAutoRepeat(true);
        fh0Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(fh0Var, c8.ja.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setGravity(17);
        textView2.setText(hd.M0(2131749774, null));
        linearLayout6.addView(textView2, c8.ja.t(-2, -2, 17, 0, 0, 0, 0));
        this.S.addView(linearLayout6, c8.ja.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.5f, -1));
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setGravity(17);
        TextView k10 = org.telegram.ui.Cells.y0.k(this.S, textView3, c8.ja.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.M = k10;
        k10.setTextSize(1, 13.0f);
        k10.setTextColor(-1);
        k10.setTypeface(org.telegram.messenger.g0.o());
        k10.setGravity(17);
        k10.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        k10.setBackground(new m5(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.j6.r1(0.08f, -1)));
        TextView k11 = org.telegram.ui.Cells.y0.k(this.S, k10, c8.ja.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        k11.setTextSize(1, 13.0f);
        k11.setTextColor(org.telegram.ui.ActionBar.j6.r1(0.5f, -1));
        org.telegram.messenger.k5.l(k11, 17, null, 2131749775);
        TextView k12 = org.telegram.ui.Cells.y0.k(this.S, k11, c8.ja.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        k12.setText(hd.M0(2131749788, null));
        k12.setTextColor(-505270);
        k12.setTextSize(1, 20.0f);
        k12.setTypeface(org.telegram.messenger.g0.o());
        k12.setGravity(17);
        TextView k13 = org.telegram.ui.Cells.y0.k(this.T, k12, c8.ja.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.N = k13;
        k13.setTextColor(-17253);
        k13.setTextSize(1, 13.0f);
        k13.setGravity(17);
        this.T.addView(k13, c8.ja.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.O = linearLayout7;
        linearLayout7.setOrientation(0);
        this.T.addView(linearLayout7, c8.ja.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.P = null;
        d(true);
    }

    public final void a(int i7, long j3, TLRPC.Document document, String str) {
        w4[] w4VarArr;
        this.a0 = i7;
        this.b0 = j3;
        this.c0 = document;
        this.d0 = str;
        this.i0 = false;
        this.k0 = false;
        int i10 = 0;
        while (true) {
            w4VarArr = this.n;
            if (i10 >= w4VarArr.length) {
                break;
            }
            w4 w4Var = w4VarArr[i10];
            if (w4Var != null) {
                org.telegram.messenger.g0.E2(w4Var);
            }
            i10++;
        }
        s4 s4Var = this.h;
        View[] viewArr = s4Var.a;
        r4 r4Var = s4Var.I;
        if (r4Var != null) {
            r4Var.e = true;
            r4Var.l = false;
            r4Var.a.I = null;
            s4Var.I = null;
        }
        ValueAnimator valueAnimator = s4Var.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            s4Var.H = null;
        }
        s4Var.G = -1;
        s4Var.F = 0.0f;
        s4Var.w.clear();
        s4Var.x.clear();
        s4Var.y.clear();
        for (int i11 = 0; i11 < 6; i11++) {
            s4Var.E[i11] = 0.0f;
        }
        s4Var.removeAllViews();
        for (int i12 = 0; i12 < viewArr.length; i12++) {
            viewArr[i12].setAlpha(1.0f);
            viewArr[i12].setVisibility(0);
            s4Var.addView(viewArr[i12], c8.ja.e(ns.t1, ns.t1, 17));
        }
        Matrix.setIdentityM(s4Var.c, 0);
        s4Var.e = 0.0f;
        s4Var.d = 0.0f;
        s4Var.f = true;
        w4 w4Var2 = new w4(getContext());
        w4VarArr[0] = w4Var2;
        addView(w4Var2, c8.ja.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        w4 w4Var3 = new w4(getContext());
        w4VarArr[1] = w4Var3;
        addView(w4Var3, c8.ja.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        w4 w4Var4 = new w4(getContext());
        w4VarArr[2] = w4Var4;
        addView(w4Var4, c8.ja.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        w4 w4Var5 = new w4(getContext());
        w4VarArr[3] = w4Var5;
        addView(w4Var5, c8.ja.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i13 = 0; i13 < w4VarArr.length; i13++) {
            c8.na.a(w4VarArr[i13]);
            w4VarArr[i13].setClickable(true);
            w4VarArr[i13].setOnClickListener(new l4(this, 5));
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
        u4 u4Var = this.f;
        u4Var.setVisibility(8);
        u4Var.setAlpha(0.0f);
        String M0 = hd.M0(2131749797, null);
        org.telegram.ui.Components.h6 h6Var = this.I;
        h6Var.setText(M0);
        h6Var.setTranslationY(0.0f);
        this.J.setAlpha(1.0f);
        org.telegram.messenger.v9.c(i7).j(j3, new m4(this, j3, j3, 0));
    }

    public final void b(n4 n4Var) {
        if (n4Var.d != null) {
            c(n4Var, org.telegram.messenger.g0.X2(hd.G(Math.round(n4Var.f * 100.0f), "GiftCraftBackdropChance", n4Var.d.name)));
        } else if (n4Var.e != null) {
            c(n4Var, org.telegram.messenger.g0.X2(hd.G(Math.round(n4Var.f * 100.0f), "GiftCraftSymbolChance", n4Var.e.name)));
        }
    }

    public final void c(n4 n4Var, SpannableStringBuilder spannableStringBuilder) {
        hi.l3 l3Var = this.U;
        if (l3Var != null) {
            l3Var.f(true);
            this.U = null;
        }
        if (this.i0 || this.k0) {
            return;
        }
        View view = n4Var.getParent() instanceof View ? (View) n4Var.getParent() : null;
        float x10 = n4Var.getX() + (view != null ? view.getX() : 0.0f);
        float y10 = n4Var.getY() + (view != null ? view.getY() : 0.0f);
        hi.l3 l3Var2 = new hi.l3(getContext(), 3);
        this.U = l3Var2;
        l3Var2.r(true);
        this.U.u(spannableStringBuilder);
        hi.l3 l3Var3 = this.U;
        l3Var3.h = hi.l3.a(l3Var3.getText(), this.U.getTextPaint());
        hi.l3 l3Var4 = this.U;
        l3Var4.L = Layout.Alignment.ALIGN_CENTER;
        l3Var4.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        addView(this.U, c8.ja.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.U.setTranslationY(y10 - org.telegram.messenger.g0.L(100.0f));
        this.U.p(0.0f, ((n4Var.getWidth() / 2.0f) + x10) - org.telegram.messenger.g0.L(2.0f));
        this.U.w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x04bd, code lost:
    
        if (r4 != null) goto L187;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z10) {
        int i7;
        w4[] w4VarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i10;
        HashMap hashMap2;
        boolean z11;
        n4[] n4VarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        boolean z12;
        TL_stars.StarGift starGift;
        int i11;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        ai.j0 j0Var = this.e;
        org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) j0Var.b;
        boolean z13 = true;
        if (h6Var != null) {
            h6Var.c(Math.round(giftsSuccessChance) + "%", z10, true);
            t4 t4Var = (t4) j0Var.c;
            float f10 = giftsSuccessChance / 100.0f;
            t4Var.d = f10;
            if (!z10) {
                t4Var.b.e(true, f10);
            }
            t4Var.invalidate();
        }
        org.telegram.ui.Components.h6 h6Var2 = this.J;
        int i12 = 0;
        if (giftsSelectedCount <= 0) {
            if (this.n0 == null) {
                this.n0 = new SpannableStringBuilder("+");
                eq eqVar = new eq(R.drawable.filled_add_album, 0);
                eqVar.I = 0.65f;
                eqVar.J = 0.65f;
                SpannableStringBuilder spannableStringBuilder = this.n0;
                spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.M0(2131749796, null));
            org.telegram.messenger.g0.M2(spannableStringBuilder2, this.n0, "+");
            h6Var2.setText(spannableStringBuilder2);
        } else {
            h6Var2.setText(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749766, ki.k.J0(getGiftsSuccessChance()))));
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
            xh.l lVar = this.r;
            if (firstGift != null) {
                SpannableString spannableString = new SpannableString("x");
                i7 = 3;
                spannableString.setSpan(new org.telegram.ui.Components.p5(this.c0, lVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                lVar.setText(TextUtils.concat(org.telegram.messenger.g0.X2(hd.M0(2131749762, null)), "\n", spannableString, " ", org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749761, this.d0, hd.E(firstGift.num, ',')))));
            } else {
                i7 = 3;
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new org.telegram.ui.Components.p5(this.c0, lVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                lVar.setText(TextUtils.concat(org.telegram.messenger.g0.X2(hd.M0(2131749760, null)), "\n", spannableString2, " ", org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749759, this.d0))));
            }
        } else {
            i7 = 3;
        }
        int[][] iArr3 = np.s1(this.a0).d7;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            w4VarArr = this.n;
            if (i15 >= w4VarArr.length) {
                break;
            }
            w4 w4Var = w4VarArr[i15];
            if (w4Var != null) {
                TL_stars.StarGift starGift2 = w4Var.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i16++;
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) v8.l(starGift2.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) v8.l(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i15++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        n4[] n4VarArr2 = this.y;
        if (isEmpty) {
            n4 n4Var = n4VarArr2[0];
            n4Var.a(null);
            n4Var.c(true, 0.0f);
            arrayList.add(n4Var);
            for (int i17 = 1; i17 < 4; i17++) {
                n4VarArr2[i17].setVisibility(8);
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
                    if (i20 >= w4VarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    w4 w4Var2 = w4VarArr[i20];
                    if (w4Var2 != null) {
                        TL_stars.StarGift starGift3 = w4Var2.h;
                        if ((starGift3 != null ? starGift3 : null) != null) {
                            if (starGift3 == null) {
                                starGift3 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v8.l(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
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
                    n4 n4Var2 = n4VarArr2[i19];
                    n4Var2.a(stargiftattributebackdrop);
                    i10 = size;
                    int[] iArr4 = iArr3[Utilities.j(i16 - 1, iArr3.length - 1, 0)];
                    int i21 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    n4Var2.c(z14, iArr4[Utilities.j(i21, iArr4.length - 1, 0)] / 1000.0f);
                    arrayList.add(n4Var2);
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
                n4VarArr2[i22].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        n4[] n4VarArr3 = this.E;
        if (isEmpty2) {
            n4 n4Var3 = n4VarArr3[0];
            n4Var3.b(null);
            n4Var3.c(true, 0.0f);
            arrayList.add(n4Var3);
            for (int i23 = 1; i23 < 4; i23++) {
                n4VarArr3[i23].setVisibility(8);
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
                    if (i26 >= w4VarArr.length) {
                        n4VarArr = n4VarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    w4 w4Var3 = w4VarArr[i26];
                    if (w4Var3 != null) {
                        TL_stars.StarGift starGift4 = w4Var3.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) v8.l(starGift4.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                n4VarArr = n4VarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i26++;
                                    n4VarArr3 = n4VarArr;
                                }
                            }
                        }
                    }
                    n4VarArr = n4VarArr3;
                    i26++;
                    n4VarArr3 = n4VarArr;
                }
                if (stargiftattributepattern != null) {
                    int i27 = i24 + 1;
                    n4 n4Var4 = n4VarArr[i24];
                    n4Var4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.j(i16 - 1, iArr3.length - 1, 0)];
                    n4Var4.c(true, iArr5[Utilities.j(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f);
                    arrayList.add(n4Var4);
                    i24 = i27;
                }
                n4VarArr3 = n4VarArr;
            }
            n4[] n4VarArr4 = n4VarArr3;
            z11 = true;
            while (i24 < 4) {
                n4VarArr4[i24].setVisibility(8);
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
            n4 n4Var5 = (n4) arrayList.get(i28);
            if (!this.s || i28 < arrayList.size() / 2.0f) {
                linearLayout = this.w;
            }
            if (n4Var5.getParent() != linearLayout) {
                ViewParent parent = n4Var5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z15 = layoutTransition != null ? z11 : false;
                    i11 = i7;
                    if (z15) {
                        layoutTransition.disableTransitionType(i11);
                    }
                    viewGroup.removeView(n4Var5);
                    if (z15) {
                        layoutTransition.enableTransitionType(i11);
                    }
                    n4Var5.animate().cancel();
                    n4Var5.clearAnimation();
                    n4Var5.setTranslationX(0.0f);
                    n4Var5.setTranslationY(0.0f);
                    n4Var5.setTranslationZ(0.0f);
                    n4Var5.setAlpha(0.0f);
                    n4Var5.setScaleX(1.0f);
                    n4Var5.setScaleY(1.0f);
                    n4Var5.setRotation(0.0f);
                    n4Var5.setRotationX(0.0f);
                    n4Var5.setRotationY(0.0f);
                } else {
                    i11 = i7;
                }
                linearLayout.addView(n4Var5, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            } else {
                i11 = i7;
            }
            n4Var5.setVisibility(0);
            i28++;
            i7 = i11;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.F.animate().alpha(this.s ? 0.0f : this.e0 != null ? 1.0f : 0.25f);
        boolean z16 = z11;
        for (int i29 = 0; i29 < w4VarArr.length; i29++) {
            w4 w4Var4 = w4VarArr[i29];
            if (w4Var4 != null) {
                TL_stars.StarGift starGift5 = w4Var4.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null) {
                    int i30 = R.drawable.msg_close;
                    if (z16) {
                        int i31 = i29 + 1;
                        while (true) {
                            if (i31 >= w4VarArr.length) {
                                break;
                            }
                            w4 w4Var5 = w4VarArr[i31];
                            if (w4Var5 != null) {
                                starGift = w4Var5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i31++;
                        }
                        starGift = null;
                        w4 w4Var6 = w4VarArr[i29];
                        boolean z17 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : z11;
                        ImageView imageView = w4Var6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        w4Var6.n = z17;
                        if (z17) {
                            i30 = R.drawable.mini_replace2;
                        }
                        imageView.setImageResource(i30);
                        z12 = false;
                    } else {
                        ImageView imageView2 = w4Var4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        z12 = false;
                        w4Var4.n = false;
                        imageView2.setImageResource(R.drawable.msg_close);
                    }
                    z16 = z12;
                }
            }
        }
    }

    public TL_stars.StarGift getFirstGift() {
        int i7 = 0;
        while (true) {
            w4[] w4VarArr = this.n;
            if (i7 >= w4VarArr.length) {
                return null;
            }
            w4 w4Var = w4VarArr[i7];
            if (w4Var != null) {
                TL_stars.StarGift starGift = w4Var.h;
                if ((starGift != null ? starGift : null) != null) {
                    if (starGift != null) {
                        return starGift;
                    }
                    return null;
                }
            }
            i7++;
        }
    }

    public int getGiftsSelectedCount() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            w4[] w4VarArr = this.n;
            if (i7 >= w4VarArr.length) {
                return i10;
            }
            w4 w4Var = w4VarArr[i7];
            if (w4Var != null) {
                TL_stars.StarGift starGift = w4Var.h;
                if (starGift == null) {
                    starGift = null;
                }
                if (starGift != null) {
                    i10++;
                }
            }
            i7++;
        }
    }

    public int getGiftsSuccessChance() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            w4[] w4VarArr = this.n;
            if (i7 >= w4VarArr.length) {
                return i10;
            }
            w4 w4Var = w4VarArr[i7];
            if (w4Var != null) {
                TL_stars.StarGift starGift = w4Var.h;
                if ((starGift != null ? starGift : null) != null) {
                    if (starGift == null) {
                        starGift = null;
                    }
                    i10 += starGift.craft_chance_permille;
                }
            }
            i7++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setOnAddGift(s10 s10Var) {
        this.g0 = s10Var;
    }

    public void setOnClose(Runnable runnable) {
        this.h0 = runnable;
    }

    public void setOnCraft(u10 u10Var) {
        this.f0 = u10Var;
    }
}
