package bi;

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
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class d6 extends FrameLayout {
    public final q5[] D;
    public final org.telegram.ui.Components.q5 E;
    public final r5 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.j6 H;
    public final org.telegram.ui.Components.j6 I;
    public final ch0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public zh.y0[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public fi.m3 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.f6 a;
    public long a0;
    public final c6 b;
    public TLRPC.Document b0;
    public final ImageView c;
    public String c0;
    public final x5[] d;
    public ArrayList d0;
    public final x5 e;
    public x10 e0;
    public final z5 f;
    public v10 f0;
    public Runnable g0;
    public final w5 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public Runnable k0;
    public ch0 l0;
    public SpannableStringBuilder m0;
    public final b6[] n;
    public final xh.l r;
    public boolean s;
    public final LinearLayout w;
    public final LinearLayout x;
    public final q5[] y;

    /* JADX WARN: Multi-variable type inference failed */
    public d6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7 = 6;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.k6.r1(0.08f, -1), org.telegram.ui.ActionBar.k6.r1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = f6Var;
        c6 c6Var = new c6();
        this.b = c6Var;
        Drawable h = jg.g.h(context, R.drawable.filled_forge);
        h.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        c6Var.g = h;
        setBackground(c6Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, c8.ha.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new t6(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
        frameLayout.addView(imageView, c8.ha.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        imageView.setOnClickListener(new n5(this, 0));
        c8.ka.a(imageView);
        View e10 = org.telegram.messenger.camera.q.e(context, R.drawable.msg_close);
        e10.setBackground(new t6(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
        frameLayout.addView(e10, c8.ha.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        int i10 = 1;
        e10.setOnClickListener(new n5(this, i10));
        c8.ka.a(e10);
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(org.telegram.messenger.id.M0(2131749759, null));
        addView(textView, c8.ha.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        addView(frameLayout2, c8.ha.e(-1, -1, qs.E1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.R = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, c8.ha.e(-1, -1, qs.E1));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.S = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, c8.ha.e(-1, -1, qs.E1));
        xh.l lVar = new xh.l(context);
        this.r = lVar;
        lVar.setGravity(17);
        lVar.setTextSize(1, 13.0f);
        lVar.setTextColor(-1);
        frameLayout2.addView(lVar, c8.ha.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
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
        this.y = new q5[4];
        this.D = new q5[4];
        for (int i13 = 0; i13 < 4; i13++) {
            LinearLayout linearLayout3 = this.w;
            q5[] q5VarArr = this.y;
            q5 q5Var = new q5(context);
            q5VarArr[i13] = q5Var;
            linearLayout3.addView(q5Var, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i13].setOnClickListener(new n5(this, i11));
        }
        for (int i14 = 0; i14 < 4; i14++) {
            LinearLayout linearLayout4 = this.w;
            q5[] q5VarArr2 = this.D;
            q5 q5Var2 = new q5(context);
            q5VarArr2[i14] = q5Var2;
            linearLayout4.addView(q5Var2, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.D[i14].setOnClickListener(new n5(this, i12));
        }
        this.n = new b6[4];
        this.d = new x5[6];
        int i15 = 0;
        while (i15 < i7) {
            x5[] x5VarArr = this.d;
            int i16 = i15 == 5 ? i10 : 0;
            x5 x5Var = new x5((int) (objArr2 == true ? 1 : 0), context, (boolean) (objArr == true ? 1 : 0));
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new t6(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
            x5Var.addView(frameLayout5, c8.ha.d(-1, -1.0f, qs.E1, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            l9Var.setImageResource(R.drawable.large_forge);
            l9Var.setAlpha(i16 != 0 ? 1.0f : 0.45f);
            frameLayout5.addView(l9Var, c8.ha.e(i16 != 0 ? 42 : 64, i16 != 0 ? 42 : 64, 17));
            if (i16 != 0) {
                l9Var.setTranslationX(org.telegram.messenger.g0.L(-4.0f));
                y5 y5Var = new y5(context);
                x5Var.c = y5Var;
                y5Var.e = org.telegram.messenger.g0.L(37.0f);
                y5Var.a.setStrokeWidth(org.telegram.messenger.g0.N(4.66f));
                frameLayout5.addView(y5Var, c8.ha.e(90, 90, 17));
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
                x5Var.b = j6Var;
                j6Var.getDrawable().r(false, true);
                j6Var.setTypeface(org.telegram.messenger.g0.o());
                j6Var.setTextColor(-1);
                j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                j6Var.setGravity(17);
                j6Var.setText("0%");
                frameLayout5.addView(j6Var, c8.ha.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            x5VarArr[i15] = x5Var;
            i15++;
            i7 = 6;
            i10 = 1;
        }
        this.e = this.d[5];
        z5 z5Var = new z5(context);
        this.f = z5Var;
        int i17 = 8;
        z5Var.setVisibility(8);
        z5Var.setAlpha(0.0f);
        addView(z5Var, c8.ha.d(qs.X4, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        w5 w5Var = new w5(context, this.d);
        this.h = w5Var;
        addView(w5Var, c8.ha.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q5 q5Var3 = new org.telegram.ui.Components.q5(context);
        this.E = q5Var3;
        q5Var3.setTextSize(1, 12.0f);
        q5Var3.setTypeface(org.telegram.messenger.g0.o());
        q5Var3.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(2131749755, null), false, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
        q5Var3.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        q5Var3.setGravity(17);
        q5Var3.setTextColor(-1);
        q5Var3.setAlpha(this.d0 != null ? 1.0f : 0.25f);
        q5Var3.setBackground(new t6(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
        c8.ka.b(q5Var3, 0.02f, 1.2f);
        this.Q.addView(q5Var3, c8.ha.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        q5Var3.setOnClickListener(new r(i17, this, f6Var));
        this.Q.addView(this.w, c8.ha.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.Q.addView(this.x, c8.ha.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        r5 r5Var = new r5();
        this.F = r5Var;
        linearLayout5.setBackground(r5Var);
        r5Var.a(org.telegram.ui.ActionBar.k6.r1(0.08f, -1), org.telegram.ui.ActionBar.k6.r1(0.08f, -1));
        c8.ka.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, c8.ha.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new n5(this, 4));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.H = j6Var2;
        j6Var2.setTypeface(org.telegram.messenger.g0.o());
        j6Var2.setGravity(17);
        j6Var2.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
        j6Var2.setText(org.telegram.messenger.id.M0(2131749798, null));
        j6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        linearLayout5.addView(j6Var2, c8.ha.s(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.I = j6Var3;
        j6Var3.getDrawable().r(true, false);
        j6Var3.setGravity(17);
        j6Var3.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.75f, -1));
        j6Var3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749767, "0%")));
        j6Var3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        linearLayout5.addView(j6Var3, c8.ha.s(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ch0 ch0Var = new ch0(context);
        this.J = ch0Var;
        ch0Var.setAutoRepeat(true);
        ch0Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(ch0Var, c8.ha.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setGravity(17);
        textView2.setText(org.telegram.messenger.id.M0(2131749775, null));
        linearLayout6.addView(textView2, c8.ha.t(-2, -2, 17, 0, 0, 0, 0));
        this.R.addView(linearLayout6, c8.ha.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.5f, -1));
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setGravity(17);
        TextView i18 = org.telegram.ui.Cells.f1.i(this.R, textView3, c8.ha.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.L = i18;
        i18.setTextSize(1, 13.0f);
        i18.setTextColor(-1);
        i18.setTypeface(org.telegram.messenger.g0.o());
        i18.setGravity(17);
        i18.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        i18.setBackground(new t6(org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.k6.r1(0.08f, -1)));
        TextView i19 = org.telegram.ui.Cells.f1.i(this.R, i18, c8.ha.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        i19.setTextSize(1, 13.0f);
        i19.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.5f, -1));
        org.telegram.messenger.k5.m(i19, 17, null, 2131749776);
        TextView i20 = org.telegram.ui.Cells.f1.i(this.R, i19, c8.ha.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        i20.setText(org.telegram.messenger.id.M0(2131749789, null));
        i20.setTextColor(-505270);
        i20.setTextSize(1, 20.0f);
        i20.setTypeface(org.telegram.messenger.g0.o());
        i20.setGravity(17);
        TextView i21 = org.telegram.ui.Cells.f1.i(this.S, i20, c8.ha.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.M = i21;
        i21.setTextColor(-17253);
        i21.setTextSize(1, 13.0f);
        i21.setGravity(17);
        this.S.addView(i21, c8.ha.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, c8.ha.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.O = null;
        d(true);
    }

    public final void a(int i7, long j3, TLRPC.Document document, String str) {
        b6[] b6VarArr;
        this.W = i7;
        this.a0 = j3;
        this.b0 = document;
        this.c0 = str;
        this.h0 = false;
        this.j0 = false;
        int i10 = 0;
        while (true) {
            b6VarArr = this.n;
            if (i10 >= b6VarArr.length) {
                break;
            }
            b6 b6Var = b6VarArr[i10];
            if (b6Var != null) {
                org.telegram.messenger.g0.E2(b6Var);
            }
            i10++;
        }
        w5 w5Var = this.h;
        View[] viewArr = w5Var.a;
        v5 v5Var = w5Var.H;
        if (v5Var != null) {
            v5Var.e = true;
            v5Var.l = false;
            v5Var.a.H = null;
            w5Var.H = null;
        }
        ValueAnimator valueAnimator = w5Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            w5Var.G = null;
        }
        w5Var.F = -1;
        w5Var.E = 0.0f;
        w5Var.w.clear();
        w5Var.x.clear();
        w5Var.y.clear();
        for (int i11 = 0; i11 < 6; i11++) {
            w5Var.D[i11] = 0.0f;
        }
        w5Var.removeAllViews();
        for (int i12 = 0; i12 < viewArr.length; i12++) {
            viewArr[i12].setAlpha(1.0f);
            viewArr[i12].setVisibility(0);
            w5Var.addView(viewArr[i12], c8.ha.e(qs.t1, qs.t1, 17));
        }
        Matrix.setIdentityM(w5Var.c, 0);
        w5Var.e = 0.0f;
        w5Var.d = 0.0f;
        w5Var.f = true;
        b6 b6Var2 = new b6(getContext());
        b6VarArr[0] = b6Var2;
        addView(b6Var2, c8.ha.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        b6 b6Var3 = new b6(getContext());
        b6VarArr[1] = b6Var3;
        addView(b6Var3, c8.ha.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        b6 b6Var4 = new b6(getContext());
        b6VarArr[2] = b6Var4;
        addView(b6Var4, c8.ha.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        b6 b6Var5 = new b6(getContext());
        b6VarArr[3] = b6Var5;
        addView(b6Var5, c8.ha.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i13 = 0; i13 < b6VarArr.length; i13++) {
            c8.ka.a(b6VarArr[i13]);
            b6VarArr[i13].setClickable(true);
            b6VarArr[i13].setOnClickListener(new n5(this, 5));
        }
        d(false);
        this.h0 = false;
        FrameLayout frameLayout = this.Q;
        frameLayout.animate().cancel();
        frameLayout.setAlpha(1.0f);
        LinearLayout linearLayout = this.G;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        FrameLayout frameLayout2 = this.R;
        frameLayout2.animate().cancel();
        frameLayout2.setAlpha(0.0f);
        FrameLayout frameLayout3 = this.S;
        frameLayout3.animate().cancel();
        frameLayout3.setAlpha(0.0f);
        FrameLayout frameLayout4 = this.P;
        frameLayout4.animate().cancel();
        frameLayout4.setAlpha(1.0f);
        this.E.setAlpha(this.s ? 0.0f : this.d0 != null ? 1.0f : 0.25f);
        z5 z5Var = this.f;
        z5Var.setVisibility(8);
        z5Var.setAlpha(0.0f);
        String M0 = org.telegram.messenger.id.M0(2131749798, null);
        org.telegram.ui.Components.j6 j6Var = this.H;
        j6Var.setText(M0);
        j6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        org.telegram.messenger.w9.c(i7).j(j3, new o5(this, j3, j3, 0));
    }

    public final void b(q5 q5Var) {
        if (q5Var.d != null) {
            c(q5Var, org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(Math.round(q5Var.f * 100.0f), "GiftCraftBackdropChance", q5Var.d.name)));
        } else if (q5Var.e != null) {
            c(q5Var, org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(Math.round(q5Var.f * 100.0f), "GiftCraftSymbolChance", q5Var.e.name)));
        }
    }

    public final void c(q5 q5Var, SpannableStringBuilder spannableStringBuilder) {
        fi.m3 m3Var = this.T;
        if (m3Var != null) {
            m3Var.f(true);
            this.T = null;
        }
        if (this.h0 || this.j0) {
            return;
        }
        View view = q5Var.getParent() instanceof View ? (View) q5Var.getParent() : null;
        float x10 = q5Var.getX() + (view != null ? view.getX() : 0.0f);
        float y10 = q5Var.getY() + (view != null ? view.getY() : 0.0f);
        fi.m3 m3Var2 = new fi.m3(getContext(), 3);
        this.T = m3Var2;
        m3Var2.r(true);
        this.T.u(spannableStringBuilder);
        fi.m3 m3Var3 = this.T;
        m3Var3.h = fi.m3.a(m3Var3.getText(), this.T.getTextPaint());
        fi.m3 m3Var4 = this.T;
        m3Var4.K = Layout.Alignment.ALIGN_CENTER;
        m3Var4.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        addView(this.T, c8.ha.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.T.setTranslationY(y10 - org.telegram.messenger.g0.L(100.0f));
        this.T.p(0.0f, ((q5Var.getWidth() / 2.0f) + x10) - org.telegram.messenger.g0.L(2.0f));
        this.T.w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x04bd, code lost:
    
        if (r4 != null) goto L187;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z9) {
        int i7;
        b6[] b6VarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i10;
        HashMap hashMap2;
        boolean z10;
        q5[] q5VarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        boolean z11;
        TL_stars.StarGift starGift;
        int i11;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        x5 x5Var = this.e;
        org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) x5Var.b;
        boolean z12 = true;
        if (j6Var != null) {
            j6Var.c(Math.round(giftsSuccessChance) + "%", z9, true);
            y5 y5Var = (y5) x5Var.c;
            float f10 = giftsSuccessChance / 100.0f;
            y5Var.d = f10;
            if (!z9) {
                y5Var.b.e(true, f10);
            }
            y5Var.invalidate();
        }
        org.telegram.ui.Components.j6 j6Var2 = this.I;
        int i12 = 0;
        if (giftsSelectedCount <= 0) {
            if (this.m0 == null) {
                this.m0 = new SpannableStringBuilder("+");
                wp wpVar = new wp(R.drawable.filled_add_album, 0);
                wpVar.H = 0.65f;
                wpVar.I = 0.65f;
                SpannableStringBuilder spannableStringBuilder = this.m0;
                spannableStringBuilder.setSpan(wpVar, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131749797, null));
            org.telegram.messenger.g0.M2(spannableStringBuilder2, this.m0, "+");
            j6Var2.setText(spannableStringBuilder2);
        } else {
            j6Var2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749767, hi.j.J0(getGiftsSuccessChance()))));
        }
        int i13 = (giftsSelectedCount == 0 ? 0 : giftsSelectedCount < 4 ? 1 : 2) * 2;
        int[] iArr = this.V;
        int i14 = i13 + 1;
        this.F.a(iArr[i13], iArr[i14]);
        int[] iArr2 = this.U;
        this.b.a(iArr2[i13], iArr2[i14]);
        this.f.a(iArr[i14], iArr[i13]);
        if (this.b0 != null) {
            TL_stars.StarGift firstGift = getFirstGift();
            xh.l lVar = this.r;
            if (firstGift != null) {
                SpannableString spannableString = new SpannableString("x");
                i7 = 3;
                spannableString.setSpan(new org.telegram.ui.Components.r5(this.b0, lVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                lVar.setText(TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749763, null)), "\n", spannableString, " ", org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749762, this.c0, org.telegram.messenger.id.E(firstGift.num, ',')))));
            } else {
                i7 = 3;
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new org.telegram.ui.Components.r5(this.b0, lVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                lVar.setText(TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749761, null)), "\n", spannableString2, " ", org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749760, this.c0))));
            }
        } else {
            i7 = 3;
        }
        int[][] iArr3 = qp.s1(this.W).c7;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            b6VarArr = this.n;
            if (i15 >= b6VarArr.length) {
                break;
            }
            b6 b6Var = b6VarArr[i15];
            if (b6Var != null) {
                TL_stars.StarGift starGift2 = b6Var.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i16++;
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) ea.l(starGift2.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) ea.l(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i15++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        q5[] q5VarArr2 = this.y;
        if (isEmpty) {
            q5 q5Var = q5VarArr2[0];
            q5Var.a(null);
            q5Var.c(true, 0.0f);
            arrayList.add(q5Var);
            for (int i17 = 1; i17 < 4; i17++) {
                q5VarArr2[i17].setVisibility(8);
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
                boolean z13 = z12;
                while (true) {
                    if (i20 >= b6VarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    b6 b6Var2 = b6VarArr[i20];
                    if (b6Var2 != null) {
                        TL_stars.StarGift starGift3 = b6Var2.h;
                        if ((starGift3 != null ? starGift3 : null) != null) {
                            if (starGift3 == null) {
                                starGift3 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ea.l(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
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
                    q5 q5Var2 = q5VarArr2[i19];
                    q5Var2.a(stargiftattributebackdrop);
                    i10 = size;
                    int[] iArr4 = iArr3[Utilities.j(i16 - 1, iArr3.length - 1, 0)];
                    int i21 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    q5Var2.c(z13, iArr4[Utilities.j(i21, iArr4.length - 1, 0)] / 1000.0f);
                    arrayList.add(q5Var2);
                    i19++;
                } else {
                    i10 = size;
                    hashMap2 = hashMap4;
                }
                hashMap4 = hashMap2;
                size = i10;
                i12 = 0;
                z12 = true;
            }
            hashMap = hashMap4;
            for (int i22 = i19; i22 < 4; i22++) {
                q5VarArr2[i22].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        q5[] q5VarArr3 = this.D;
        if (isEmpty2) {
            q5 q5Var3 = q5VarArr3[0];
            q5Var3.b(null);
            q5Var3.c(true, 0.0f);
            arrayList.add(q5Var3);
            for (int i23 = 1; i23 < 4; i23++) {
                q5VarArr3[i23].setVisibility(8);
            }
            z10 = true;
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
                    if (i26 >= b6VarArr.length) {
                        q5VarArr = q5VarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    b6 b6Var3 = b6VarArr[i26];
                    if (b6Var3 != null) {
                        TL_stars.StarGift starGift4 = b6Var3.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) ea.l(starGift4.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                q5VarArr = q5VarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i26++;
                                    q5VarArr3 = q5VarArr;
                                }
                            }
                        }
                    }
                    q5VarArr = q5VarArr3;
                    i26++;
                    q5VarArr3 = q5VarArr;
                }
                if (stargiftattributepattern != null) {
                    int i27 = i24 + 1;
                    q5 q5Var4 = q5VarArr[i24];
                    q5Var4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.j(i16 - 1, iArr3.length - 1, 0)];
                    q5Var4.c(true, iArr5[Utilities.j(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f);
                    arrayList.add(q5Var4);
                    i24 = i27;
                }
                q5VarArr3 = q5VarArr;
            }
            q5[] q5VarArr4 = q5VarArr3;
            z10 = true;
            while (i24 < 4) {
                q5VarArr4[i24].setVisibility(8);
                i24++;
            }
        }
        this.s = arrayList.size() > 5 ? z10 : false;
        int i28 = 0;
        while (true) {
            int size3 = arrayList.size();
            linearLayout = this.x;
            if (i28 >= size3) {
                break;
            }
            q5 q5Var5 = (q5) arrayList.get(i28);
            if (!this.s || i28 < arrayList.size() / 2.0f) {
                linearLayout = this.w;
            }
            if (q5Var5.getParent() != linearLayout) {
                ViewParent parent = q5Var5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z14 = layoutTransition != null ? z10 : false;
                    i11 = i7;
                    if (z14) {
                        layoutTransition.disableTransitionType(i11);
                    }
                    viewGroup.removeView(q5Var5);
                    if (z14) {
                        layoutTransition.enableTransitionType(i11);
                    }
                    q5Var5.animate().cancel();
                    q5Var5.clearAnimation();
                    q5Var5.setTranslationX(0.0f);
                    q5Var5.setTranslationY(0.0f);
                    q5Var5.setTranslationZ(0.0f);
                    q5Var5.setAlpha(0.0f);
                    q5Var5.setScaleX(1.0f);
                    q5Var5.setScaleY(1.0f);
                    q5Var5.setRotation(0.0f);
                    q5Var5.setRotationX(0.0f);
                    q5Var5.setRotationY(0.0f);
                } else {
                    i11 = i7;
                }
                linearLayout.addView(q5Var5, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            } else {
                i11 = i7;
            }
            q5Var5.setVisibility(0);
            i28++;
            i7 = i11;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.E.animate().alpha(this.s ? 0.0f : this.d0 != null ? 1.0f : 0.25f);
        boolean z15 = z10;
        for (int i29 = 0; i29 < b6VarArr.length; i29++) {
            b6 b6Var4 = b6VarArr[i29];
            if (b6Var4 != null) {
                TL_stars.StarGift starGift5 = b6Var4.h;
                if (starGift5 == null) {
                    starGift5 = null;
                }
                if (starGift5 != null) {
                    int i30 = R.drawable.msg_close;
                    if (z15) {
                        int i31 = i29 + 1;
                        while (true) {
                            if (i31 >= b6VarArr.length) {
                                break;
                            }
                            b6 b6Var5 = b6VarArr[i31];
                            if (b6Var5 != null) {
                                starGift = b6Var5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i31++;
                        }
                        starGift = null;
                        b6 b6Var6 = b6VarArr[i29];
                        boolean z16 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : z10;
                        ImageView imageView = b6Var6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        b6Var6.n = z16;
                        if (z16) {
                            i30 = R.drawable.mini_replace2;
                        }
                        imageView.setImageResource(i30);
                        z11 = false;
                    } else {
                        ImageView imageView2 = b6Var4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        z11 = false;
                        b6Var4.n = false;
                        imageView2.setImageResource(R.drawable.msg_close);
                    }
                    z15 = z11;
                }
            }
        }
    }

    public TL_stars.StarGift getFirstGift() {
        int i7 = 0;
        while (true) {
            b6[] b6VarArr = this.n;
            if (i7 >= b6VarArr.length) {
                return null;
            }
            b6 b6Var = b6VarArr[i7];
            if (b6Var != null) {
                TL_stars.StarGift starGift = b6Var.h;
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
            b6[] b6VarArr = this.n;
            if (i7 >= b6VarArr.length) {
                return i10;
            }
            b6 b6Var = b6VarArr[i7];
            if (b6Var != null) {
                TL_stars.StarGift starGift = b6Var.h;
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
            b6[] b6VarArr = this.n;
            if (i7 >= b6VarArr.length) {
                return i10;
            }
            b6 b6Var = b6VarArr[i7];
            if (b6Var != null) {
                TL_stars.StarGift starGift = b6Var.h;
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

    public void setOnAddGift(v10 v10Var) {
        this.f0 = v10Var;
    }

    public void setOnClose(Runnable runnable) {
        this.g0 = runnable;
    }

    public void setOnCraft(x10 x10Var) {
        this.e0 = x10Var;
    }
}
