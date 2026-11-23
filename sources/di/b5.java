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
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.r10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rh0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class b5 extends FrameLayout {
    public final q4[] E;
    public final org.telegram.ui.Components.x5 F;
    public final r4 G;
    public final LinearLayout H;
    public final org.telegram.ui.Components.o6 I;
    public final org.telegram.ui.Components.o6 J;
    public final rh0 K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final LinearLayout O;
    public bi.g3[] P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public final FrameLayout T;
    public hi.l3 U;
    public final int[] V;
    public final int[] W;
    public final org.telegram.ui.ActionBar.h6 a;
    public int a0;
    public final a5 b;
    public long b0;
    public final ImageView c;
    public TLRPC.Document c0;
    public final ai.l0[] d;
    public String d0;
    public final ai.l0 e;
    public ArrayList e0;
    public final x4 f;
    public t10 f0;
    public r10 g0;
    public final v4 h;
    public Runnable h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public Runnable l0;
    public rh0 m0;
    public final z4[] n;
    public SpannableStringBuilder n0;
    public final xh.l r;
    public boolean s;
    public final LinearLayout w;
    public final LinearLayout x;
    public final q4[] y;

    /* JADX WARN: Multi-variable type inference failed */
    public b5(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7 = 6;
        this.V = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.W = new int[]{org.telegram.ui.ActionBar.m6.r1(0.08f, -1), org.telegram.ui.ActionBar.m6.r1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = h6Var;
        a5 a5Var = new a5();
        this.b = a5Var;
        Drawable g10 = i5.c.g(context, R.drawable.filled_forge);
        g10.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        a5Var.g = g10;
        setBackground(a5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        addView(frameLayout, c8.ma.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new p5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.m6.r1(0.08f, -1)));
        frameLayout.addView(imageView, c8.ma.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        Object[] objArr = 0;
        imageView.setOnClickListener(new o4(this, 0));
        c8.ra.a(imageView);
        View e10 = o10.e(context, R.drawable.msg_close);
        e10.setBackground(new p5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.m6.r1(0.08f, -1)));
        frameLayout.addView(e10, c8.ma.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        e10.setOnClickListener(new o4(this, 1));
        c8.ra.a(e10);
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(hd.N0(2131749741, null));
        addView(textView, c8.ma.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        addView(frameLayout2, c8.ma.e(-1, -1, ls.E1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.S = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, c8.ma.e(-1, -1, ls.E1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, c8.ma.e(-1, -1, ls.E1));
        xh.l lVar = new xh.l(context);
        this.r = lVar;
        lVar.setGravity(17);
        lVar.setTextSize(1, 13.0f);
        lVar.setTextColor(-1);
        frameLayout2.addView(lVar, c8.ma.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        int i10 = 2;
        layoutTransition.setDuration(2, 320L);
        int i11 = 3;
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        nr nrVar = nr.h;
        layoutTransition.setInterpolator(2, nrVar);
        layoutTransition.setInterpolator(3, nrVar);
        layoutTransition.setInterpolator(0, nrVar);
        layoutTransition.setInterpolator(1, nrVar);
        layoutTransition.setInterpolator(4, nrVar);
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
        layoutTransition2.setInterpolator(2, nrVar);
        layoutTransition2.setInterpolator(3, nrVar);
        layoutTransition2.setInterpolator(0, nrVar);
        layoutTransition2.setInterpolator(1, nrVar);
        layoutTransition2.setInterpolator(4, nrVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.y = new q4[4];
        this.E = new q4[4];
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout3 = this.w;
            q4[] q4VarArr = this.y;
            q4 q4Var = new q4(context);
            q4VarArr[i12] = q4Var;
            linearLayout3.addView(q4Var, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i12].setOnClickListener(new o4(this, i10));
        }
        for (int i13 = 0; i13 < 4; i13++) {
            LinearLayout linearLayout4 = this.w;
            q4[] q4VarArr2 = this.E;
            q4 q4Var2 = new q4(context);
            q4VarArr2[i13] = q4Var2;
            linearLayout4.addView(q4Var2, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.E[i13].setOnClickListener(new o4(this, i11));
        }
        this.n = new z4[4];
        this.d = new ai.l0[6];
        int i14 = 0;
        while (true) {
            int i15 = 5;
            if (i14 >= i7) {
                break;
            }
            ai.l0[] l0VarArr = this.d;
            Object[] objArr2 = i14 == 5;
            ai.l0 l0Var = new ai.l0(i15, context, (boolean) (objArr == true ? 1 : 0));
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new p5(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.m6.r1(0.08f, -1)));
            l0Var.addView(frameLayout5, c8.ma.d(-1, -1.0f, ls.E1, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
            q9Var.setImageResource(R.drawable.large_forge);
            q9Var.setAlpha(objArr2 != false ? 1.0f : 0.45f);
            frameLayout5.addView(q9Var, c8.ma.e(objArr2 != false ? 42 : 64, objArr2 == true ? 42 : 64, 17));
            if (objArr2 != false) {
                q9Var.setTranslationX(org.telegram.messenger.g0.L(-4.0f));
                w4 w4Var = new w4(context);
                l0Var.c = w4Var;
                w4Var.e = org.telegram.messenger.g0.L(37.0f);
                w4Var.a.setStrokeWidth(org.telegram.messenger.g0.N(4.66f));
                frameLayout5.addView(w4Var, c8.ma.e(90, 90, 17));
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
                l0Var.b = o6Var;
                o6Var.getDrawable().r(false, true);
                o6Var.setTypeface(org.telegram.messenger.g0.o());
                o6Var.setTextColor(-1);
                o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                o6Var.setGravity(17);
                o6Var.setText("0%");
                frameLayout5.addView(o6Var, c8.ma.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            l0VarArr[i14] = l0Var;
            i14++;
            i7 = 6;
        }
        this.e = this.d[5];
        x4 x4Var = new x4(context);
        this.f = x4Var;
        x4Var.setVisibility(8);
        x4Var.setAlpha(0.0f);
        addView(x4Var, c8.ma.d(ls.X4, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        v4 v4Var = new v4(context, this.d);
        this.h = v4Var;
        addView(v4Var, c8.ma.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.F = x5Var;
        x5Var.setTextSize(1, 12.0f);
        x5Var.setTypeface(org.telegram.messenger.g0.o());
        x5Var.setText(org.telegram.messenger.g0.I2(hd.N0(2131749737, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
        x5Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        x5Var.setGravity(17);
        x5Var.setTextColor(-1);
        x5Var.setAlpha(this.e0 != null ? 1.0f : 0.25f);
        x5Var.setBackground(new p5(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.m6.r1(0.08f, -1)));
        c8.ra.b(x5Var, 0.02f, 1.2f);
        this.R.addView(x5Var, c8.ma.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        x5Var.setOnClickListener(new ai.y2(16, this, h6Var));
        this.R.addView(this.w, c8.ma.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.R.addView(this.x, c8.ma.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.H = linearLayout5;
        linearLayout5.setOrientation(1);
        r4 r4Var = new r4();
        this.G = r4Var;
        linearLayout5.setBackground(r4Var);
        r4Var.a(org.telegram.ui.ActionBar.m6.r1(0.08f, -1), org.telegram.ui.ActionBar.m6.r1(0.08f, -1));
        c8.ra.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, c8.ma.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new o4(this, 4));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.I = o6Var2;
        o6Var2.setTypeface(org.telegram.messenger.g0.o());
        o6Var2.setGravity(17);
        o6Var2.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.75f, -1));
        o6Var2.setText(hd.N0(2131749780, null));
        o6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        linearLayout5.addView(o6Var2, c8.ma.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.J = o6Var3;
        o6Var3.getDrawable().r(true, false);
        o6Var3.setGravity(17);
        o6Var3.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.75f, -1));
        o6Var3.setText(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749749, "0%")));
        o6Var3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        linearLayout5.addView(o6Var3, c8.ma.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        rh0 rh0Var = new rh0(context);
        this.K = rh0Var;
        rh0Var.setAutoRepeat(true);
        rh0Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(rh0Var, c8.ma.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setGravity(17);
        textView2.setText(hd.N0(2131749757, null));
        linearLayout6.addView(textView2, c8.ma.t(-2, -2, 17, 0, 0, 0, 0));
        this.S.addView(linearLayout6, c8.ma.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.5f, -1));
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setGravity(17);
        TextView m10 = org.telegram.ui.Cells.c0.m(this.S, textView3, c8.ma.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.M = m10;
        m10.setTextSize(1, 13.0f);
        m10.setTextColor(-1);
        m10.setTypeface(org.telegram.messenger.g0.o());
        m10.setGravity(17);
        m10.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        m10.setBackground(new p5(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.m6.r1(0.08f, -1)));
        TextView m11 = org.telegram.ui.Cells.c0.m(this.S, m10, c8.ma.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        m11.setTextSize(1, 13.0f);
        m11.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.5f, -1));
        org.telegram.messenger.f3.k(m11, 17, null, 2131749758);
        TextView m12 = org.telegram.ui.Cells.c0.m(this.S, m11, c8.ma.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        m12.setText(hd.N0(2131749771, null));
        m12.setTextColor(-505270);
        m12.setTextSize(1, 20.0f);
        m12.setTypeface(org.telegram.messenger.g0.o());
        m12.setGravity(17);
        TextView m13 = org.telegram.ui.Cells.c0.m(this.T, m12, c8.ma.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.N = m13;
        m13.setTextColor(-17253);
        m13.setTextSize(1, 13.0f);
        m13.setGravity(17);
        this.T.addView(m13, c8.ma.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.O = linearLayout7;
        linearLayout7.setOrientation(0);
        this.T.addView(linearLayout7, c8.ma.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.P = null;
        d(true);
    }

    public final void a(int i7, long j3, TLRPC.Document document, String str) {
        z4[] z4VarArr;
        this.a0 = i7;
        this.b0 = j3;
        this.c0 = document;
        this.d0 = str;
        this.i0 = false;
        this.k0 = false;
        int i10 = 0;
        while (true) {
            z4VarArr = this.n;
            if (i10 >= z4VarArr.length) {
                break;
            }
            z4 z4Var = z4VarArr[i10];
            if (z4Var != null) {
                org.telegram.messenger.g0.E2(z4Var);
            }
            i10++;
        }
        v4 v4Var = this.h;
        View[] viewArr = v4Var.a;
        u4 u4Var = v4Var.I;
        if (u4Var != null) {
            u4Var.e = true;
            u4Var.l = false;
            u4Var.a.I = null;
            v4Var.I = null;
        }
        ValueAnimator valueAnimator = v4Var.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            v4Var.H = null;
        }
        v4Var.G = -1;
        v4Var.F = 0.0f;
        v4Var.w.clear();
        v4Var.x.clear();
        v4Var.y.clear();
        for (int i11 = 0; i11 < 6; i11++) {
            v4Var.E[i11] = 0.0f;
        }
        v4Var.removeAllViews();
        for (int i12 = 0; i12 < viewArr.length; i12++) {
            viewArr[i12].setAlpha(1.0f);
            viewArr[i12].setVisibility(0);
            v4Var.addView(viewArr[i12], c8.ma.e(ls.t1, ls.t1, 17));
        }
        Matrix.setIdentityM(v4Var.c, 0);
        v4Var.e = 0.0f;
        v4Var.d = 0.0f;
        v4Var.f = true;
        z4 z4Var2 = new z4(getContext());
        z4VarArr[0] = z4Var2;
        addView(z4Var2, c8.ma.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        z4 z4Var3 = new z4(getContext());
        z4VarArr[1] = z4Var3;
        addView(z4Var3, c8.ma.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        z4 z4Var4 = new z4(getContext());
        z4VarArr[2] = z4Var4;
        addView(z4Var4, c8.ma.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        z4 z4Var5 = new z4(getContext());
        z4VarArr[3] = z4Var5;
        addView(z4Var5, c8.ma.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i13 = 0; i13 < z4VarArr.length; i13++) {
            c8.ra.a(z4VarArr[i13]);
            z4VarArr[i13].setClickable(true);
            z4VarArr[i13].setOnClickListener(new o4(this, 5));
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
        x4 x4Var = this.f;
        x4Var.setVisibility(8);
        x4Var.setAlpha(0.0f);
        String N0 = hd.N0(2131749780, null);
        org.telegram.ui.Components.o6 o6Var = this.I;
        o6Var.setText(N0);
        o6Var.setTranslationY(0.0f);
        this.J.setAlpha(1.0f);
        org.telegram.messenger.v9.c(i7).j(j3, new p4(this, j3, j3, 0));
    }

    public final void b(q4 q4Var) {
        if (q4Var.d != null) {
            c(q4Var, org.telegram.messenger.g0.W2(hd.G(Math.round(q4Var.f * 100.0f), "GiftCraftBackdropChance", q4Var.d.name)));
        } else if (q4Var.e != null) {
            c(q4Var, org.telegram.messenger.g0.W2(hd.G(Math.round(q4Var.f * 100.0f), "GiftCraftSymbolChance", q4Var.e.name)));
        }
    }

    public final void c(q4 q4Var, SpannableStringBuilder spannableStringBuilder) {
        hi.l3 l3Var = this.U;
        if (l3Var != null) {
            l3Var.f(true);
            this.U = null;
        }
        if (this.i0 || this.k0) {
            return;
        }
        View view = q4Var.getParent() instanceof View ? (View) q4Var.getParent() : null;
        float x10 = q4Var.getX() + (view != null ? view.getX() : 0.0f);
        float y10 = q4Var.getY() + (view != null ? view.getY() : 0.0f);
        hi.l3 l3Var2 = new hi.l3(getContext(), 3);
        this.U = l3Var2;
        l3Var2.r(true);
        this.U.v(spannableStringBuilder);
        hi.l3 l3Var3 = this.U;
        l3Var3.h = hi.l3.a(l3Var3.getText(), this.U.getTextPaint());
        hi.l3 l3Var4 = this.U;
        l3Var4.L = Layout.Alignment.ALIGN_CENTER;
        l3Var4.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        addView(this.U, c8.ma.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.U.setTranslationY(y10 - org.telegram.messenger.g0.L(100.0f));
        this.U.p(0.0f, ((q4Var.getWidth() / 2.0f) + x10) - org.telegram.messenger.g0.L(2.0f));
        this.U.x();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x04bd, code lost:
    
        if (r4 != null) goto L187;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z10) {
        int i7;
        z4[] z4VarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i10;
        HashMap hashMap2;
        boolean z11;
        q4[] q4VarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        boolean z12;
        TL_stars.StarGift starGift;
        int i11;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        ai.l0 l0Var = this.e;
        org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) l0Var.b;
        boolean z13 = true;
        if (o6Var != null) {
            o6Var.c(Math.round(giftsSuccessChance) + "%", z10, true);
            w4 w4Var = (w4) l0Var.c;
            float f10 = giftsSuccessChance / 100.0f;
            w4Var.d = f10;
            if (!z10) {
                w4Var.b.e(true, f10);
            }
            w4Var.invalidate();
        }
        org.telegram.ui.Components.o6 o6Var2 = this.J;
        int i12 = 0;
        if (giftsSelectedCount <= 0) {
            if (this.n0 == null) {
                this.n0 = new SpannableStringBuilder("+");
                nq nqVar = new nq(R.drawable.filled_add_album, 0);
                nqVar.I = 0.65f;
                nqVar.J = 0.65f;
                SpannableStringBuilder spannableStringBuilder = this.n0;
                spannableStringBuilder.setSpan(nqVar, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.N0(2131749779, null));
            org.telegram.messenger.g0.M2(spannableStringBuilder2, this.n0, "+");
            o6Var2.setText(spannableStringBuilder2);
        } else {
            o6Var2.setText(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749749, ki.j.J0(getGiftsSuccessChance()))));
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
                spannableString.setSpan(new org.telegram.ui.Components.y5(this.c0, lVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                lVar.setText(TextUtils.concat(org.telegram.messenger.g0.W2(hd.N0(2131749745, null)), "\n", spannableString, " ", org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749744, this.d0, hd.E(firstGift.num, ',')))));
            } else {
                i7 = 3;
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new org.telegram.ui.Components.y5(this.c0, lVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                lVar.setText(TextUtils.concat(org.telegram.messenger.g0.W2(hd.N0(2131749743, null)), "\n", spannableString2, " ", org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749742, this.d0))));
            }
        } else {
            i7 = 3;
        }
        int[][] iArr3 = np.u1(this.a0).f7;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            z4VarArr = this.n;
            if (i15 >= z4VarArr.length) {
                break;
            }
            z4 z4Var = z4VarArr[i15];
            if (z4Var != null) {
                TL_stars.StarGift starGift2 = z4Var.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i16++;
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) y8.l(starGift2.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) y8.l(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i15++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        q4[] q4VarArr2 = this.y;
        if (isEmpty) {
            q4 q4Var = q4VarArr2[0];
            q4Var.a(null);
            q4Var.c(true, 0.0f);
            arrayList.add(q4Var);
            for (int i17 = 1; i17 < 4; i17++) {
                q4VarArr2[i17].setVisibility(8);
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
                    if (i20 >= z4VarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    z4 z4Var2 = z4VarArr[i20];
                    if (z4Var2 != null) {
                        TL_stars.StarGift starGift3 = z4Var2.h;
                        if ((starGift3 != null ? starGift3 : null) != null) {
                            if (starGift3 == null) {
                                starGift3 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) y8.l(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
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
                    q4 q4Var2 = q4VarArr2[i19];
                    q4Var2.a(stargiftattributebackdrop);
                    i10 = size;
                    int[] iArr4 = iArr3[Utilities.j(i16 - 1, iArr3.length - 1, 0)];
                    int i21 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    q4Var2.c(z14, iArr4[Utilities.j(i21, iArr4.length - 1, 0)] / 1000.0f);
                    arrayList.add(q4Var2);
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
                q4VarArr2[i22].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        q4[] q4VarArr3 = this.E;
        if (isEmpty2) {
            q4 q4Var3 = q4VarArr3[0];
            q4Var3.b(null);
            q4Var3.c(true, 0.0f);
            arrayList.add(q4Var3);
            for (int i23 = 1; i23 < 4; i23++) {
                q4VarArr3[i23].setVisibility(8);
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
                    if (i26 >= z4VarArr.length) {
                        q4VarArr = q4VarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    z4 z4Var3 = z4VarArr[i26];
                    if (z4Var3 != null) {
                        TL_stars.StarGift starGift4 = z4Var3.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) y8.l(starGift4.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                q4VarArr = q4VarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i26++;
                                    q4VarArr3 = q4VarArr;
                                }
                            }
                        }
                    }
                    q4VarArr = q4VarArr3;
                    i26++;
                    q4VarArr3 = q4VarArr;
                }
                if (stargiftattributepattern != null) {
                    int i27 = i24 + 1;
                    q4 q4Var4 = q4VarArr[i24];
                    q4Var4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.j(i16 - 1, iArr3.length - 1, 0)];
                    q4Var4.c(true, iArr5[Utilities.j(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f);
                    arrayList.add(q4Var4);
                    i24 = i27;
                }
                q4VarArr3 = q4VarArr;
            }
            q4[] q4VarArr4 = q4VarArr3;
            z11 = true;
            while (i24 < 4) {
                q4VarArr4[i24].setVisibility(8);
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
            q4 q4Var5 = (q4) arrayList.get(i28);
            if (!this.s || i28 < arrayList.size() / 2.0f) {
                linearLayout = this.w;
            }
            if (q4Var5.getParent() != linearLayout) {
                ViewParent parent = q4Var5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z15 = layoutTransition != null ? z11 : false;
                    i11 = i7;
                    if (z15) {
                        layoutTransition.disableTransitionType(i11);
                    }
                    viewGroup.removeView(q4Var5);
                    if (z15) {
                        layoutTransition.enableTransitionType(i11);
                    }
                    q4Var5.animate().cancel();
                    q4Var5.clearAnimation();
                    q4Var5.setTranslationX(0.0f);
                    q4Var5.setTranslationY(0.0f);
                    q4Var5.setTranslationZ(0.0f);
                    q4Var5.setAlpha(0.0f);
                    q4Var5.setScaleX(1.0f);
                    q4Var5.setScaleY(1.0f);
                    q4Var5.setRotation(0.0f);
                    q4Var5.setRotationX(0.0f);
                    q4Var5.setRotationY(0.0f);
                } else {
                    i11 = i7;
                }
                linearLayout.addView(q4Var5, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            } else {
                i11 = i7;
            }
            q4Var5.setVisibility(0);
            i28++;
            i7 = i11;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.F.animate().alpha(this.s ? 0.0f : this.e0 != null ? 1.0f : 0.25f);
        boolean z16 = z11;
        for (int i29 = 0; i29 < z4VarArr.length; i29++) {
            z4 z4Var4 = z4VarArr[i29];
            if (z4Var4 != null) {
                TL_stars.StarGift starGift5 = z4Var4.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null) {
                    int i30 = R.drawable.msg_close;
                    if (z16) {
                        int i31 = i29 + 1;
                        while (true) {
                            if (i31 >= z4VarArr.length) {
                                break;
                            }
                            z4 z4Var5 = z4VarArr[i31];
                            if (z4Var5 != null) {
                                starGift = z4Var5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i31++;
                        }
                        starGift = null;
                        z4 z4Var6 = z4VarArr[i29];
                        boolean z17 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : z11;
                        ImageView imageView = z4Var6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        z4Var6.n = z17;
                        if (z17) {
                            i30 = R.drawable.mini_replace2;
                        }
                        imageView.setImageResource(i30);
                        z12 = false;
                    } else {
                        ImageView imageView2 = z4Var4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        z12 = false;
                        z4Var4.n = false;
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
            z4[] z4VarArr = this.n;
            if (i7 >= z4VarArr.length) {
                return null;
            }
            z4 z4Var = z4VarArr[i7];
            if (z4Var != null) {
                TL_stars.StarGift starGift = z4Var.h;
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
            z4[] z4VarArr = this.n;
            if (i7 >= z4VarArr.length) {
                return i10;
            }
            z4 z4Var = z4VarArr[i7];
            if (z4Var != null) {
                TL_stars.StarGift starGift = z4Var.h;
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
            z4[] z4VarArr = this.n;
            if (i7 >= z4VarArr.length) {
                return i10;
            }
            z4 z4Var = z4VarArr[i7];
            if (z4Var != null) {
                TL_stars.StarGift starGift = z4Var.h;
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

    public void setOnAddGift(r10 r10Var) {
        this.g0 = r10Var;
    }

    public void setOnClose(Runnable runnable) {
        this.h0 = runnable;
    }

    public void setOnCraft(t10 t10Var) {
        this.f0 = t10Var;
    }
}
