package mh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class f4 extends FrameLayout {
    public final org.telegram.ui.Components.t5 B;
    public final v3 C;
    public final LinearLayout D;
    public final org.telegram.ui.Components.k6 E;
    public final org.telegram.ui.Components.k6 F;
    public final lj0 G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final LinearLayout K;
    public lh.x1[] L;
    public final FrameLayout M;
    public final FrameLayout N;
    public final FrameLayout O;
    public final FrameLayout P;
    public qh.f3 Q;
    public final int[] R;
    public final int[] S;
    public int T;
    public long U;
    public TLRPC.Document V;
    public String W;
    public final org.telegram.ui.ActionBar.g6 a;
    public ArrayList a0;
    public final e4 b;
    public Utilities.Callback3 b0;
    public final ImageView c;
    public Utilities.Callback2 c0;
    public final z3[] d;
    public Runnable d0;
    public final z3 e;
    public boolean e0;
    public final b4 f;
    public boolean f0;
    public boolean g0;
    public final y3 h;
    public Runnable h0;
    public lj0 i0;
    public SpannableStringBuilder j0;
    public final d4[] n;
    public final jh.s r;
    public boolean s;
    public final LinearLayout v;
    public final LinearLayout w;
    public final u3[] x;
    public final u3[] y;

    public f4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.R = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.S = new int[]{org.telegram.ui.ActionBar.k6.l1(0.08f, -1), org.telegram.ui.ActionBar.k6.l1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = g6Var;
        e4 e4Var = new e4();
        this.b = e4Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        e4Var.g = mutate;
        setBackground(e4Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.M = frameLayout;
        addView(frameLayout, k7.c6.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new s4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.l1(0.08f, -1)));
        frameLayout.addView(imageView, k7.c6.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new s3(this, 0));
        k7.e6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new s4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.l1(0.08f, -1)));
        frameLayout.addView(imageView2, k7.c6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView2.setOnClickListener(new s3(this, 1));
        k7.e6.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, k7.c6.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.N = frameLayout2;
        addView(frameLayout2, k7.c6.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.O = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, k7.c6.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.P = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, k7.c6.e(-1, -1, 119));
        jh.s sVar = new jh.s(context);
        this.r = sVar;
        sVar.setGravity(17);
        sVar.setTextSize(1, 13.0f);
        sVar.setTextColor(-1);
        frameLayout2.addView(sVar, k7.c6.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        int i10 = 2;
        layoutTransition.setDuration(2, 320L);
        int i11 = 3;
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        pr prVar = pr.h;
        layoutTransition.setInterpolator(2, prVar);
        layoutTransition.setInterpolator(3, prVar);
        layoutTransition.setInterpolator(0, prVar);
        layoutTransition.setInterpolator(1, prVar);
        layoutTransition.setInterpolator(4, prVar);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.w = linearLayout2;
        LayoutTransition layoutTransition2 = new LayoutTransition();
        layoutTransition2.setDuration(2, 320L);
        layoutTransition2.setDuration(3, 320L);
        layoutTransition2.setDuration(0, 320L);
        layoutTransition2.setDuration(1, 320L);
        layoutTransition2.setDuration(4, 320L);
        layoutTransition2.setInterpolator(2, prVar);
        layoutTransition2.setInterpolator(3, prVar);
        layoutTransition2.setInterpolator(0, prVar);
        layoutTransition2.setInterpolator(1, prVar);
        layoutTransition2.setInterpolator(4, prVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.x = new u3[4];
        this.y = new u3[4];
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout3 = this.v;
            u3[] u3VarArr = this.x;
            u3 u3Var = new u3(context);
            u3VarArr[i12] = u3Var;
            linearLayout3.addView(u3Var, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.x[i12].setOnClickListener(new s3(this, i10));
        }
        for (int i13 = 0; i13 < 4; i13++) {
            LinearLayout linearLayout4 = this.v;
            u3[] u3VarArr2 = this.y;
            u3 u3Var2 = new u3(context);
            u3VarArr2[i13] = u3Var2;
            linearLayout4.addView(u3Var2, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i13].setOnClickListener(new s3(this, i11));
        }
        this.n = new d4[4];
        this.d = new z3[6];
        int i14 = 0;
        for (int i15 = 6; i14 < i15; i15 = 6) {
            z3[] z3VarArr = this.d;
            boolean z4 = i14 == 5;
            z3 z3Var = new z3(context);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new s4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.l1(0.08f, -1)));
            z3Var.addView(frameLayout5, k7.c6.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            p9Var.setImageResource(R.drawable.large_forge);
            p9Var.setAlpha(z4 ? 1.0f : 0.45f);
            frameLayout5.addView(p9Var, k7.c6.e(z4 ? 42 : 64, z4 ? 42 : 64, 17));
            if (z4) {
                p9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                a4 a4Var = new a4(context);
                z3Var.b = a4Var;
                a4Var.e = AndroidUtilities.dp(37.0f);
                a4Var.a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout5.addView(a4Var, k7.c6.e(90, 90, 17));
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
                z3Var.a = k6Var;
                k6Var.getDrawable().o(false, true, false);
                k6Var.setTypeface(AndroidUtilities.bold());
                k6Var.setTextColor(-1);
                k6Var.setTextSize(AndroidUtilities.dp(14.0f));
                k6Var.setGravity(17);
                k6Var.setText("0%");
                frameLayout5.addView(k6Var, k7.c6.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            z3VarArr[i14] = z3Var;
            i14++;
        }
        this.e = this.d[5];
        b4 b4Var = new b4(context);
        this.f = b4Var;
        b4Var.setVisibility(8);
        b4Var.setAlpha(0.0f);
        addView(b4Var, k7.c6.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        y3 y3Var = new y3(context, this.d);
        this.h = y3Var;
        addView(y3Var, k7.c6.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(context);
        this.B = t5Var;
        t5Var.setTextSize(1, 12.0f);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        t5Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        t5Var.setGravity(17);
        t5Var.setTextColor(-1);
        t5Var.setAlpha(this.a0 != null ? 1.0f : 0.25f);
        t5Var.setBackground(new s4(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.k6.l1(0.08f, -1)));
        k7.e6.b(t5Var, 0.02f, 1.2f);
        this.N.addView(t5Var, k7.c6.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        t5Var.setOnClickListener(new dg.n(23, this, g6Var));
        this.N.addView(this.v, k7.c6.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.N.addView(this.w, k7.c6.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.D = linearLayout5;
        linearLayout5.setOrientation(1);
        v3 v3Var = new v3();
        this.C = v3Var;
        linearLayout5.setBackground(v3Var);
        v3Var.a(org.telegram.ui.ActionBar.k6.l1(0.08f, -1), org.telegram.ui.ActionBar.k6.l1(0.08f, -1));
        k7.e6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, k7.c6.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new s3(this, 4));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, false, false, false);
        this.E = k6Var2;
        k6Var2.setTypeface(AndroidUtilities.bold());
        k6Var2.setGravity(17);
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.l1(0.75f, -1));
        k6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        k6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(k6Var2, k7.c6.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var3 = new org.telegram.ui.Components.k6(context, false, false, false);
        this.F = k6Var3;
        k6Var3.getDrawable().o(true, false, false);
        k6Var3.setGravity(17);
        k6Var3.setTextColor(org.telegram.ui.ActionBar.k6.l1(0.75f, -1));
        k6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        k6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(k6Var3, k7.c6.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        lj0 lj0Var = new lj0(context);
        this.G = lj0Var;
        lj0Var.setAutoRepeat(true);
        lj0Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(lj0Var, k7.c6.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, k7.c6.t(-2, -2, 17, 0, 0, 0, 0));
        this.O.addView(linearLayout6, k7.c6.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.H = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.l1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView h = yh.h(this.O, textView3, k7.c6.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.I = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setGravity(17);
        h.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        h.setBackground(new s4(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.k6.l1(0.08f, -1)));
        TextView h9 = yh.h(this.O, h, k7.c6.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        h9.setTextSize(1, 13.0f);
        h9.setTextColor(org.telegram.ui.ActionBar.k6.l1(0.5f, -1));
        h9.setGravity(17);
        h9.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView h10 = yh.h(this.O, h9, k7.c6.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        h10.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        h10.setTextColor(-505270);
        h10.setTextSize(1, 20.0f);
        h10.setTypeface(AndroidUtilities.bold());
        h10.setGravity(17);
        TextView h11 = yh.h(this.P, h10, k7.c6.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.J = h11;
        h11.setTextColor(-17253);
        h11.setTextSize(1, 13.0f);
        h11.setGravity(17);
        this.P.addView(h11, k7.c6.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.K = linearLayout7;
        linearLayout7.setOrientation(0);
        this.P.addView(linearLayout7, k7.c6.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.L = null;
        d(true);
    }

    public final void a(int i10, long j10, TLRPC.Document document, String str) {
        d4[] d4VarArr;
        this.T = i10;
        this.U = j10;
        this.V = document;
        this.W = str;
        this.e0 = false;
        this.g0 = false;
        int i11 = 0;
        while (true) {
            d4VarArr = this.n;
            if (i11 >= d4VarArr.length) {
                break;
            }
            d4 d4Var = d4VarArr[i11];
            if (d4Var != null) {
                AndroidUtilities.removeFromParent(d4Var);
            }
            i11++;
        }
        y3 y3Var = this.h;
        View[] viewArr = y3Var.a;
        x3 x3Var = y3Var.E;
        if (x3Var != null) {
            x3Var.e = true;
            x3Var.l = false;
            x3Var.a.E = null;
            y3Var.E = null;
        }
        ValueAnimator valueAnimator = y3Var.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            y3Var.D = null;
        }
        y3Var.C = -1;
        y3Var.B = 0.0f;
        y3Var.v.clear();
        y3Var.w.clear();
        y3Var.x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            y3Var.y[i12] = 0.0f;
        }
        y3Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            y3Var.addView(viewArr[i13], k7.c6.e(108, 108, 17));
        }
        Matrix.setIdentityM(y3Var.c, 0);
        y3Var.e = 0.0f;
        y3Var.d = 0.0f;
        y3Var.f = true;
        d4 d4Var2 = new d4(getContext());
        d4VarArr[0] = d4Var2;
        addView(d4Var2, k7.c6.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        d4 d4Var3 = new d4(getContext());
        d4VarArr[1] = d4Var3;
        addView(d4Var3, k7.c6.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        d4 d4Var4 = new d4(getContext());
        d4VarArr[2] = d4Var4;
        addView(d4Var4, k7.c6.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        d4 d4Var5 = new d4(getContext());
        d4VarArr[3] = d4Var5;
        addView(d4Var5, k7.c6.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < d4VarArr.length; i14++) {
            k7.e6.a(d4VarArr[i14]);
            d4VarArr[i14].setClickable(true);
            d4VarArr[i14].setOnClickListener(new s3(this, 5));
        }
        d(false);
        this.e0 = false;
        FrameLayout frameLayout = this.N;
        frameLayout.animate().cancel();
        frameLayout.setAlpha(1.0f);
        LinearLayout linearLayout = this.D;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        FrameLayout frameLayout2 = this.O;
        frameLayout2.animate().cancel();
        frameLayout2.setAlpha(0.0f);
        FrameLayout frameLayout3 = this.P;
        frameLayout3.animate().cancel();
        frameLayout3.setAlpha(0.0f);
        FrameLayout frameLayout4 = this.M;
        frameLayout4.animate().cancel();
        frameLayout4.setAlpha(1.0f);
        this.B.setAlpha(this.s ? 0.0f : this.a0 != null ? 1.0f : 0.25f);
        b4 b4Var = this.f;
        b4Var.setVisibility(8);
        b4Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.k6 k6Var = this.E;
        k6Var.setText(string);
        k6Var.setTranslationY(0.0f);
        this.F.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j10, new t3(this, j10, j10, 0));
    }

    public final void b(u3 u3Var) {
        if (u3Var.d != null) {
            c(u3Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(u3Var.f * 100.0f), u3Var.d.name)));
        } else if (u3Var.e != null) {
            c(u3Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(u3Var.f * 100.0f), u3Var.e.name)));
        }
    }

    public final void c(u3 u3Var, SpannableStringBuilder spannableStringBuilder) {
        qh.f3 f3Var = this.Q;
        if (f3Var != null) {
            f3Var.e(true);
            this.Q = null;
        }
        if (this.e0 || this.g0) {
            return;
        }
        View view = u3Var.getParent() instanceof View ? (View) u3Var.getParent() : null;
        float x10 = u3Var.getX() + (view != null ? view.getX() : 0.0f);
        float y10 = u3Var.getY() + (view != null ? view.getY() : 0.0f);
        qh.f3 f3Var2 = new qh.f3(getContext(), 3);
        this.Q = f3Var2;
        f3Var2.q(true);
        this.Q.t(spannableStringBuilder);
        qh.f3 f3Var3 = this.Q;
        f3Var3.h = qh.f3.a(f3Var3.getText(), this.Q.getTextPaint());
        qh.f3 f3Var4 = this.Q;
        f3Var4.H = Layout.Alignment.ALIGN_CENTER;
        f3Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(this.Q, k7.c6.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.Q.setTranslationY(y10 - AndroidUtilities.dp(100.0f));
        this.Q.n(0.0f, ((u3Var.getWidth() / 2.0f) + x10) - AndroidUtilities.dp(2.0f));
        this.Q.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x04a9, code lost:
    
        if (r5 != null) goto L186;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z4) {
        d4[] d4VarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i10;
        HashMap hashMap2;
        u3[] u3VarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        TL_stars.StarGift starGift;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        z3 z3Var = this.e;
        org.telegram.ui.Components.k6 k6Var = z3Var.a;
        if (k6Var != null) {
            k6Var.c(Math.round(giftsSuccessChance) + "%", z4, true);
            a4 a4Var = z3Var.b;
            float f10 = giftsSuccessChance / 100.0f;
            a4Var.d = f10;
            if (!z4) {
                a4Var.b.d(f10, true);
            }
            a4Var.invalidate();
        }
        org.telegram.ui.Components.k6 k6Var2 = this.F;
        if (giftsSelectedCount <= 0) {
            if (this.j0 == null) {
                this.j0 = new SpannableStringBuilder("+");
                oq oqVar = new oq(R.drawable.filled_add_album, 0);
                oqVar.setScale(0.65f, 0.65f);
                SpannableStringBuilder spannableStringBuilder = this.j0;
                spannableStringBuilder.setSpan(oqVar, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.GiftCraftButtonEmpty));
            AndroidUtilities.replaceMultipleCharSequence("+", spannableStringBuilder2, this.j0);
            k6Var2.setText(spannableStringBuilder2);
        } else {
            k6Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, sh.j.G0(getGiftsSuccessChance()))));
        }
        int i11 = (giftsSelectedCount == 0 ? 0 : giftsSelectedCount < 4 ? 1 : 2) * 2;
        int[] iArr = this.S;
        int i12 = i11 + 1;
        this.C.a(iArr[i11], iArr[i12]);
        int[] iArr2 = this.R;
        this.b.a(iArr2[i11], iArr2[i12]);
        this.f.a(iArr[i12], iArr[i11]);
        if (this.V != null) {
            TL_stars.StarGift firstGift = getFirstGift();
            jh.s sVar = this.r;
            if (firstGift != null) {
                SpannableString spannableString = new SpannableString("x");
                spannableString.setSpan(new org.telegram.ui.Components.u5(this.V, sVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                sVar.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftText1)), "\n", spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftText2, this.W, LocaleController.formatNumber(firstGift.num, ',')))));
            } else {
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new org.telegram.ui.Components.u5(this.V, sVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                sVar.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftTextEmpty1)), "\n", spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftTextEmpty2, this.W))));
            }
        }
        int[][] iArr3 = MessagesController.getInstance(this.T).stargiftsCraftAttributesPermilles;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            d4VarArr = this.n;
            if (i13 >= d4VarArr.length) {
                break;
            }
            d4 d4Var = d4VarArr[i13];
            if (d4Var != null) {
                TL_stars.StarGift starGift2 = d4Var.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i14++;
                    TL_stars.StarGift starGift3 = starGift2 != null ? starGift2 : null;
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) t7.l(starGift3.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) t7.l(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i13++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        u3[] u3VarArr2 = this.x;
        if (isEmpty) {
            u3 u3Var = u3VarArr2[0];
            u3Var.a(null);
            u3Var.c(0.0f, true);
            arrayList.add(u3Var);
            for (int i15 = 1; i15 < 4; i15++) {
                u3VarArr2[i15].setVisibility(8);
            }
            hashMap = hashMap4;
        } else {
            ArrayList arrayList2 = new ArrayList(hashMap3.entrySet());
            Collections.sort(arrayList2, Map$Entry$-CC.comparingByValue());
            int size = arrayList2.size();
            int i16 = 0;
            int i17 = 0;
            while (i16 < size) {
                Object obj = arrayList2.get(i16);
                i16++;
                Map.Entry entry = (Map.Entry) obj;
                int intValue = ((Integer) entry.getKey()).intValue();
                int intValue2 = ((Integer) entry.getValue()).intValue();
                int i18 = 0;
                while (true) {
                    if (i18 >= d4VarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    d4 d4Var2 = d4VarArr[i18];
                    if (d4Var2 != null) {
                        TL_stars.StarGift starGift4 = d4Var2.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) t7.l(starGift4.attributes, TL_stars.starGiftAttributeBackdrop.class);
                            if (stargiftattributebackdrop.backdrop_id == intValue) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i18++;
                }
                if (stargiftattributebackdrop != null) {
                    u3 u3Var2 = u3VarArr2[i17];
                    u3Var2.a(stargiftattributebackdrop);
                    i10 = size;
                    int[] iArr4 = iArr3[Utilities.clamp(i14 - 1, iArr3.length - 1, 0)];
                    int i19 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    u3Var2.c(iArr4[Utilities.clamp(i19, iArr4.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(u3Var2);
                    i17++;
                } else {
                    i10 = size;
                    hashMap2 = hashMap4;
                }
                hashMap4 = hashMap2;
                size = i10;
            }
            hashMap = hashMap4;
            for (int i20 = i17; i20 < 4; i20++) {
                u3VarArr2[i20].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        u3[] u3VarArr3 = this.y;
        if (isEmpty2) {
            u3 u3Var3 = u3VarArr3[0];
            u3Var3.b(null);
            u3Var3.c(0.0f, true);
            arrayList.add(u3Var3);
            for (int i21 = 1; i21 < 4; i21++) {
                u3VarArr3[i21].setVisibility(8);
            }
        } else {
            ArrayList arrayList3 = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList3, Map$Entry$-CC.comparingByValue());
            int size2 = arrayList3.size();
            int i22 = 0;
            int i23 = 0;
            while (i23 < size2) {
                Object obj2 = arrayList3.get(i23);
                i23++;
                Map.Entry entry2 = (Map.Entry) obj2;
                long longValue = ((Long) entry2.getKey()).longValue();
                int intValue3 = ((Integer) entry2.getValue()).intValue();
                int i24 = 0;
                while (true) {
                    if (i24 >= d4VarArr.length) {
                        u3VarArr = u3VarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    d4 d4Var3 = d4VarArr[i24];
                    if (d4Var3 != null) {
                        TL_stars.StarGift starGift5 = d4Var3.h;
                        if ((starGift5 != null ? starGift5 : null) != null) {
                            if (starGift5 == null) {
                                starGift5 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) t7.l(starGift5.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                u3VarArr = u3VarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i24++;
                                    u3VarArr3 = u3VarArr;
                                }
                            }
                        }
                    }
                    u3VarArr = u3VarArr3;
                    i24++;
                    u3VarArr3 = u3VarArr;
                }
                if (stargiftattributepattern != null) {
                    int i25 = i22 + 1;
                    u3 u3Var4 = u3VarArr[i22];
                    u3Var4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.clamp(i14 - 1, iArr3.length - 1, 0)];
                    u3Var4.c(iArr5[Utilities.clamp(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(u3Var4);
                    i22 = i25;
                }
                u3VarArr3 = u3VarArr;
            }
            u3[] u3VarArr4 = u3VarArr3;
            while (i22 < 4) {
                u3VarArr4[i22].setVisibility(8);
                i22++;
            }
        }
        this.s = arrayList.size() > 5;
        int i26 = 0;
        while (true) {
            int size3 = arrayList.size();
            linearLayout = this.w;
            if (i26 >= size3) {
                break;
            }
            u3 u3Var5 = (u3) arrayList.get(i26);
            if (!this.s || i26 < arrayList.size() / 2.0f) {
                linearLayout = this.v;
            }
            if (u3Var5.getParent() != linearLayout) {
                ViewParent parent = u3Var5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z10 = layoutTransition != null;
                    if (z10) {
                        layoutTransition.disableTransitionType(3);
                    }
                    viewGroup.removeView(u3Var5);
                    if (z10) {
                        layoutTransition.enableTransitionType(3);
                    }
                    u3Var5.animate().cancel();
                    u3Var5.clearAnimation();
                    u3Var5.setTranslationX(0.0f);
                    u3Var5.setTranslationY(0.0f);
                    u3Var5.setTranslationZ(0.0f);
                    u3Var5.setAlpha(0.0f);
                    u3Var5.setScaleX(1.0f);
                    u3Var5.setScaleY(1.0f);
                    u3Var5.setRotation(0.0f);
                    u3Var5.setRotationX(0.0f);
                    u3Var5.setRotationY(0.0f);
                }
                linearLayout.addView(u3Var5, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            }
            u3Var5.setVisibility(0);
            i26++;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.B.animate().alpha(this.s ? 0.0f : this.a0 != null ? 1.0f : 0.25f);
        boolean z11 = true;
        for (int i27 = 0; i27 < d4VarArr.length; i27++) {
            d4 d4Var4 = d4VarArr[i27];
            if (d4Var4 != null) {
                TL_stars.StarGift starGift6 = d4Var4.h;
                if (starGift6 == null) {
                    starGift6 = null;
                }
                if (starGift6 != null) {
                    if (z11) {
                        int i28 = i27 + 1;
                        while (true) {
                            if (i28 >= d4VarArr.length) {
                                break;
                            }
                            d4 d4Var5 = d4VarArr[i28];
                            if (d4Var5 != null) {
                                starGift = d4Var5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i28++;
                        }
                        starGift = null;
                        d4 d4Var6 = d4VarArr[i27];
                        boolean z12 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : true;
                        ImageView imageView = d4Var6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        d4Var6.n = z12;
                        imageView.setImageResource(z12 ? R.drawable.mini_replace2 : R.drawable.msg_close);
                    } else {
                        ImageView imageView2 = d4Var4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        d4Var4.n = false;
                        imageView2.setImageResource(R.drawable.msg_close);
                    }
                    z11 = false;
                }
            }
        }
    }

    public TL_stars.StarGift getFirstGift() {
        int i10 = 0;
        while (true) {
            d4[] d4VarArr = this.n;
            if (i10 >= d4VarArr.length) {
                return null;
            }
            d4 d4Var = d4VarArr[i10];
            if (d4Var != null) {
                TL_stars.StarGift starGift = d4Var.h;
                if ((starGift != null ? starGift : null) != null) {
                    if (starGift != null) {
                        return starGift;
                    }
                    return null;
                }
            }
            i10++;
        }
    }

    public int getGiftsSelectedCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            d4[] d4VarArr = this.n;
            if (i10 >= d4VarArr.length) {
                return i11;
            }
            d4 d4Var = d4VarArr[i10];
            if (d4Var != null) {
                TL_stars.StarGift starGift = d4Var.h;
                if (starGift == null) {
                    starGift = null;
                }
                if (starGift != null) {
                    i11++;
                }
            }
            i10++;
        }
    }

    public int getGiftsSuccessChance() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            d4[] d4VarArr = this.n;
            if (i10 >= d4VarArr.length) {
                return i11;
            }
            d4 d4Var = d4VarArr[i10];
            if (d4Var != null) {
                TL_stars.StarGift starGift = d4Var.h;
                if ((starGift != null ? starGift : null) != null) {
                    if (starGift == null) {
                        starGift = null;
                    }
                    i11 += starGift.craft_chance_permille;
                }
            }
            i10++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setOnAddGift(Utilities.Callback2<Utilities.Callback<TL_stars.StarGift>, Boolean> callback2) {
        this.c0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.d0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.b0 = callback3;
    }
}
