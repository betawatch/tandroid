package jh;

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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g4 extends FrameLayout {
    public final org.telegram.ui.Components.x5 A;
    public final w3 B;
    public final LinearLayout C;
    public final org.telegram.ui.Components.o6 D;
    public final org.telegram.ui.Components.o6 E;
    public final aj0 F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final LinearLayout J;
    public ih.y1[] K;
    public final FrameLayout L;
    public final FrameLayout M;
    public final FrameLayout N;
    public final FrameLayout O;
    public nh.t3 P;
    public final int[] Q;
    public final int[] R;
    public int S;
    public long T;
    public TLRPC.Document U;
    public String V;
    public ArrayList W;
    public final org.telegram.ui.ActionBar.c6 a;
    public Utilities.Callback3 a0;
    public final f4 b;
    public Utilities.Callback2 b0;
    public final ImageView c;
    public Runnable c0;
    public final a4[] d;
    public boolean d0;
    public final a4 e;
    public boolean e0;
    public final c4 f;
    public boolean f0;
    public Runnable g0;
    public final z3 h;
    public aj0 h0;
    public SpannableStringBuilder i0;
    public final e4[] n;
    public final gh.s r;
    public boolean s;
    public final LinearLayout v;
    public final LinearLayout w;
    public final v3[] x;
    public final v3[] y;

    public g4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.Q = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.R = new int[]{org.telegram.ui.ActionBar.g6.l1(0.08f, -1), org.telegram.ui.ActionBar.g6.l1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = c6Var;
        f4 f4Var = new f4();
        this.b = f4Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        f4Var.g = mutate;
        setBackground(f4Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        addView(frameLayout, i7.f6.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new t4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
        frameLayout.addView(imageView, i7.f6.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new t3(this, 0));
        i7.h6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new t4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
        frameLayout.addView(imageView2, i7.f6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView2.setOnClickListener(new t3(this, 1));
        i7.h6.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, i7.f6.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        addView(frameLayout2, i7.f6.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.N = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, i7.f6.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.O = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, i7.f6.e(-1, -1, 119));
        gh.s sVar = new gh.s(context);
        this.r = sVar;
        sVar.setGravity(17);
        sVar.setTextSize(1, 13.0f);
        sVar.setTextColor(-1);
        frameLayout2.addView(sVar, i7.f6.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
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
        jr jrVar = jr.h;
        layoutTransition.setInterpolator(2, jrVar);
        layoutTransition.setInterpolator(3, jrVar);
        layoutTransition.setInterpolator(0, jrVar);
        layoutTransition.setInterpolator(1, jrVar);
        layoutTransition.setInterpolator(4, jrVar);
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
        layoutTransition2.setInterpolator(2, jrVar);
        layoutTransition2.setInterpolator(3, jrVar);
        layoutTransition2.setInterpolator(0, jrVar);
        layoutTransition2.setInterpolator(1, jrVar);
        layoutTransition2.setInterpolator(4, jrVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.x = new v3[4];
        this.y = new v3[4];
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout3 = this.v;
            v3[] v3VarArr = this.x;
            v3 v3Var = new v3(context);
            v3VarArr[i12] = v3Var;
            linearLayout3.addView(v3Var, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.x[i12].setOnClickListener(new t3(this, i10));
        }
        for (int i13 = 0; i13 < 4; i13++) {
            LinearLayout linearLayout4 = this.v;
            v3[] v3VarArr2 = this.y;
            v3 v3Var2 = new v3(context);
            v3VarArr2[i13] = v3Var2;
            linearLayout4.addView(v3Var2, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i13].setOnClickListener(new t3(this, i11));
        }
        this.n = new e4[4];
        this.d = new a4[6];
        int i14 = 0;
        for (int i15 = 6; i14 < i15; i15 = 6) {
            a4[] a4VarArr = this.d;
            boolean z10 = i14 == 5;
            a4 a4Var = new a4(context);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new t4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
            a4Var.addView(frameLayout5, i7.f6.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
            t9Var.setImageResource(R.drawable.large_forge);
            t9Var.setAlpha(z10 ? 1.0f : 0.45f);
            frameLayout5.addView(t9Var, i7.f6.e(z10 ? 42 : 64, z10 ? 42 : 64, 17));
            if (z10) {
                t9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                b4 b4Var = new b4(context);
                a4Var.b = b4Var;
                b4Var.e = AndroidUtilities.dp(37.0f);
                b4Var.a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout5.addView(b4Var, i7.f6.e(90, 90, 17));
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
                a4Var.a = o6Var;
                o6Var.getDrawable().o(false, true, false);
                o6Var.setTypeface(AndroidUtilities.bold());
                o6Var.setTextColor(-1);
                o6Var.setTextSize(AndroidUtilities.dp(14.0f));
                o6Var.setGravity(17);
                o6Var.setText("0%");
                frameLayout5.addView(o6Var, i7.f6.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            a4VarArr[i14] = a4Var;
            i14++;
        }
        this.e = this.d[5];
        c4 c4Var = new c4(context);
        this.f = c4Var;
        c4Var.setVisibility(8);
        c4Var.setAlpha(0.0f);
        addView(c4Var, i7.f6.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        z3 z3Var = new z3(context, this.d);
        this.h = z3Var;
        addView(z3Var, i7.f6.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.A = x5Var;
        x5Var.setTextSize(1, 12.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        x5Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        x5Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        x5Var.setGravity(17);
        x5Var.setTextColor(-1);
        x5Var.setAlpha(this.W != null ? 1.0f : 0.25f);
        x5Var.setBackground(new t4(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
        i7.h6.b(x5Var, 0.02f, 1.2f);
        this.M.addView(x5Var, i7.f6.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        x5Var.setOnClickListener(new ag.n(23, this, c6Var));
        this.M.addView(this.v, i7.f6.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.M.addView(this.w, i7.f6.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.C = linearLayout5;
        linearLayout5.setOrientation(1);
        w3 w3Var = new w3();
        this.B = w3Var;
        linearLayout5.setBackground(w3Var);
        w3Var.a(org.telegram.ui.ActionBar.g6.l1(0.08f, -1), org.telegram.ui.ActionBar.g6.l1(0.08f, -1));
        i7.h6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, i7.f6.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new t3(this, 4));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.D = o6Var2;
        o6Var2.setTypeface(AndroidUtilities.bold());
        o6Var2.setGravity(17);
        o6Var2.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.75f, -1));
        o6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(o6Var2, i7.f6.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var3 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.E = o6Var3;
        o6Var3.getDrawable().o(true, false, false);
        o6Var3.setGravity(17);
        o6Var3.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.75f, -1));
        o6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        o6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(o6Var3, i7.f6.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        aj0 aj0Var = new aj0(context);
        this.F = aj0Var;
        aj0Var.setAutoRepeat(true);
        aj0Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(aj0Var, i7.f6.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, i7.f6.t(-2, -2, 17, 0, 0, 0, 0));
        this.N.addView(linearLayout6, i7.f6.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.G = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView h = th.h(this.N, textView3, i7.f6.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.H = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setGravity(17);
        h.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        h.setBackground(new t4(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.l1(0.08f, -1)));
        TextView h10 = th.h(this.N, h, i7.f6.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        h10.setTextSize(1, 13.0f);
        h10.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.5f, -1));
        h10.setGravity(17);
        h10.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView h11 = th.h(this.N, h10, i7.f6.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        h11.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        h11.setTextColor(-505270);
        h11.setTextSize(1, 20.0f);
        h11.setTypeface(AndroidUtilities.bold());
        h11.setGravity(17);
        TextView h12 = th.h(this.O, h11, i7.f6.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.I = h12;
        h12.setTextColor(-17253);
        h12.setTextSize(1, 13.0f);
        h12.setGravity(17);
        this.O.addView(h12, i7.f6.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.J = linearLayout7;
        linearLayout7.setOrientation(0);
        this.O.addView(linearLayout7, i7.f6.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.K = null;
        d(true);
    }

    public final void a(int i10, long j10, TLRPC.Document document, String str) {
        e4[] e4VarArr;
        this.S = i10;
        this.T = j10;
        this.U = document;
        this.V = str;
        this.d0 = false;
        this.f0 = false;
        int i11 = 0;
        while (true) {
            e4VarArr = this.n;
            if (i11 >= e4VarArr.length) {
                break;
            }
            e4 e4Var = e4VarArr[i11];
            if (e4Var != null) {
                AndroidUtilities.removeFromParent(e4Var);
            }
            i11++;
        }
        z3 z3Var = this.h;
        View[] viewArr = z3Var.a;
        y3 y3Var = z3Var.D;
        if (y3Var != null) {
            y3Var.e = true;
            y3Var.l = false;
            y3Var.a.D = null;
            z3Var.D = null;
        }
        ValueAnimator valueAnimator = z3Var.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            z3Var.C = null;
        }
        z3Var.B = -1;
        z3Var.A = 0.0f;
        z3Var.v.clear();
        z3Var.w.clear();
        z3Var.x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            z3Var.y[i12] = 0.0f;
        }
        z3Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            z3Var.addView(viewArr[i13], i7.f6.e(108, 108, 17));
        }
        Matrix.setIdentityM(z3Var.c, 0);
        z3Var.e = 0.0f;
        z3Var.d = 0.0f;
        z3Var.f = true;
        e4 e4Var2 = new e4(getContext());
        e4VarArr[0] = e4Var2;
        addView(e4Var2, i7.f6.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        e4 e4Var3 = new e4(getContext());
        e4VarArr[1] = e4Var3;
        addView(e4Var3, i7.f6.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        e4 e4Var4 = new e4(getContext());
        e4VarArr[2] = e4Var4;
        addView(e4Var4, i7.f6.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        e4 e4Var5 = new e4(getContext());
        e4VarArr[3] = e4Var5;
        addView(e4Var5, i7.f6.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < e4VarArr.length; i14++) {
            i7.h6.a(e4VarArr[i14]);
            e4VarArr[i14].setClickable(true);
            e4VarArr[i14].setOnClickListener(new t3(this, 5));
        }
        d(false);
        this.d0 = false;
        FrameLayout frameLayout = this.M;
        frameLayout.animate().cancel();
        frameLayout.setAlpha(1.0f);
        LinearLayout linearLayout = this.C;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        FrameLayout frameLayout2 = this.N;
        frameLayout2.animate().cancel();
        frameLayout2.setAlpha(0.0f);
        FrameLayout frameLayout3 = this.O;
        frameLayout3.animate().cancel();
        frameLayout3.setAlpha(0.0f);
        FrameLayout frameLayout4 = this.L;
        frameLayout4.animate().cancel();
        frameLayout4.setAlpha(1.0f);
        this.A.setAlpha(this.s ? 0.0f : this.W != null ? 1.0f : 0.25f);
        c4 c4Var = this.f;
        c4Var.setVisibility(8);
        c4Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.o6 o6Var = this.D;
        o6Var.setText(string);
        o6Var.setTranslationY(0.0f);
        this.E.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j10, new u3(this, j10, j10, 0));
    }

    public final void b(v3 v3Var) {
        if (v3Var.d != null) {
            c(v3Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(v3Var.f * 100.0f), v3Var.d.name)));
        } else if (v3Var.e != null) {
            c(v3Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(v3Var.f * 100.0f), v3Var.e.name)));
        }
    }

    public final void c(v3 v3Var, SpannableStringBuilder spannableStringBuilder) {
        nh.t3 t3Var = this.P;
        if (t3Var != null) {
            t3Var.e(true);
            this.P = null;
        }
        if (this.d0 || this.f0) {
            return;
        }
        View view = v3Var.getParent() instanceof View ? (View) v3Var.getParent() : null;
        float x4 = v3Var.getX() + (view != null ? view.getX() : 0.0f);
        float y8 = v3Var.getY() + (view != null ? view.getY() : 0.0f);
        nh.t3 t3Var2 = new nh.t3(getContext(), 3);
        this.P = t3Var2;
        t3Var2.q(true);
        this.P.t(spannableStringBuilder);
        nh.t3 t3Var3 = this.P;
        t3Var3.h = nh.t3.a(t3Var3.getText(), this.P.getTextPaint());
        nh.t3 t3Var4 = this.P;
        t3Var4.G = Layout.Alignment.ALIGN_CENTER;
        t3Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(this.P, i7.f6.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.P.setTranslationY(y8 - AndroidUtilities.dp(100.0f));
        this.P.n(0.0f, ((v3Var.getWidth() / 2.0f) + x4) - AndroidUtilities.dp(2.0f));
        this.P.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x04a9, code lost:
    
        if (r5 != null) goto L186;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z10) {
        e4[] e4VarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i10;
        HashMap hashMap2;
        v3[] v3VarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        TL_stars.StarGift starGift;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        a4 a4Var = this.e;
        org.telegram.ui.Components.o6 o6Var = a4Var.a;
        if (o6Var != null) {
            o6Var.c(Math.round(giftsSuccessChance) + "%", z10, true);
            b4 b4Var = a4Var.b;
            float f9 = giftsSuccessChance / 100.0f;
            b4Var.d = f9;
            if (!z10) {
                b4Var.b.d(f9, true);
            }
            b4Var.invalidate();
        }
        org.telegram.ui.Components.o6 o6Var2 = this.E;
        if (giftsSelectedCount <= 0) {
            if (this.i0 == null) {
                this.i0 = new SpannableStringBuilder("+");
                iq iqVar = new iq(R.drawable.filled_add_album, 0);
                iqVar.setScale(0.65f, 0.65f);
                SpannableStringBuilder spannableStringBuilder = this.i0;
                spannableStringBuilder.setSpan(iqVar, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.GiftCraftButtonEmpty));
            AndroidUtilities.replaceMultipleCharSequence("+", spannableStringBuilder2, this.i0);
            o6Var2.setText(spannableStringBuilder2);
        } else {
            o6Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, ph.j.G0(getGiftsSuccessChance()))));
        }
        int i11 = (giftsSelectedCount == 0 ? 0 : giftsSelectedCount < 4 ? 1 : 2) * 2;
        int[] iArr = this.R;
        int i12 = i11 + 1;
        this.B.a(iArr[i11], iArr[i12]);
        int[] iArr2 = this.Q;
        this.b.a(iArr2[i11], iArr2[i12]);
        this.f.a(iArr[i12], iArr[i11]);
        if (this.U != null) {
            TL_stars.StarGift firstGift = getFirstGift();
            gh.s sVar = this.r;
            if (firstGift != null) {
                SpannableString spannableString = new SpannableString("x");
                spannableString.setSpan(new org.telegram.ui.Components.y5(this.U, sVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                sVar.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftText1)), "\n", spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftText2, this.V, LocaleController.formatNumber(firstGift.num, ',')))));
            } else {
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new org.telegram.ui.Components.y5(this.U, sVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                sVar.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftTextEmpty1)), "\n", spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftTextEmpty2, this.V))));
            }
        }
        int[][] iArr3 = MessagesController.getInstance(this.S).stargiftsCraftAttributesPermilles;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            e4VarArr = this.n;
            if (i13 >= e4VarArr.length) {
                break;
            }
            e4 e4Var = e4VarArr[i13];
            if (e4Var != null) {
                TL_stars.StarGift starGift2 = e4Var.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i14++;
                    TL_stars.StarGift starGift3 = starGift2 != null ? starGift2 : null;
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) s7.l(starGift3.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) s7.l(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i13++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        v3[] v3VarArr2 = this.x;
        if (isEmpty) {
            v3 v3Var = v3VarArr2[0];
            v3Var.a(null);
            v3Var.c(0.0f, true);
            arrayList.add(v3Var);
            for (int i15 = 1; i15 < 4; i15++) {
                v3VarArr2[i15].setVisibility(8);
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
                    if (i18 >= e4VarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    e4 e4Var2 = e4VarArr[i18];
                    if (e4Var2 != null) {
                        TL_stars.StarGift starGift4 = e4Var2.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) s7.l(starGift4.attributes, TL_stars.starGiftAttributeBackdrop.class);
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
                    v3 v3Var2 = v3VarArr2[i17];
                    v3Var2.a(stargiftattributebackdrop);
                    i10 = size;
                    int[] iArr4 = iArr3[Utilities.clamp(i14 - 1, iArr3.length - 1, 0)];
                    int i19 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    v3Var2.c(iArr4[Utilities.clamp(i19, iArr4.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(v3Var2);
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
                v3VarArr2[i20].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        v3[] v3VarArr3 = this.y;
        if (isEmpty2) {
            v3 v3Var3 = v3VarArr3[0];
            v3Var3.b(null);
            v3Var3.c(0.0f, true);
            arrayList.add(v3Var3);
            for (int i21 = 1; i21 < 4; i21++) {
                v3VarArr3[i21].setVisibility(8);
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
                    if (i24 >= e4VarArr.length) {
                        v3VarArr = v3VarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    e4 e4Var3 = e4VarArr[i24];
                    if (e4Var3 != null) {
                        TL_stars.StarGift starGift5 = e4Var3.h;
                        if ((starGift5 != null ? starGift5 : null) != null) {
                            if (starGift5 == null) {
                                starGift5 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) s7.l(starGift5.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                v3VarArr = v3VarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i24++;
                                    v3VarArr3 = v3VarArr;
                                }
                            }
                        }
                    }
                    v3VarArr = v3VarArr3;
                    i24++;
                    v3VarArr3 = v3VarArr;
                }
                if (stargiftattributepattern != null) {
                    int i25 = i22 + 1;
                    v3 v3Var4 = v3VarArr[i22];
                    v3Var4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.clamp(i14 - 1, iArr3.length - 1, 0)];
                    v3Var4.c(iArr5[Utilities.clamp(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(v3Var4);
                    i22 = i25;
                }
                v3VarArr3 = v3VarArr;
            }
            v3[] v3VarArr4 = v3VarArr3;
            while (i22 < 4) {
                v3VarArr4[i22].setVisibility(8);
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
            v3 v3Var5 = (v3) arrayList.get(i26);
            if (!this.s || i26 < arrayList.size() / 2.0f) {
                linearLayout = this.v;
            }
            if (v3Var5.getParent() != linearLayout) {
                ViewParent parent = v3Var5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z11 = layoutTransition != null;
                    if (z11) {
                        layoutTransition.disableTransitionType(3);
                    }
                    viewGroup.removeView(v3Var5);
                    if (z11) {
                        layoutTransition.enableTransitionType(3);
                    }
                    v3Var5.animate().cancel();
                    v3Var5.clearAnimation();
                    v3Var5.setTranslationX(0.0f);
                    v3Var5.setTranslationY(0.0f);
                    v3Var5.setTranslationZ(0.0f);
                    v3Var5.setAlpha(0.0f);
                    v3Var5.setScaleX(1.0f);
                    v3Var5.setScaleY(1.0f);
                    v3Var5.setRotation(0.0f);
                    v3Var5.setRotationX(0.0f);
                    v3Var5.setRotationY(0.0f);
                }
                linearLayout.addView(v3Var5, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            }
            v3Var5.setVisibility(0);
            i26++;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.A.animate().alpha(this.s ? 0.0f : this.W != null ? 1.0f : 0.25f);
        boolean z12 = true;
        for (int i27 = 0; i27 < e4VarArr.length; i27++) {
            e4 e4Var4 = e4VarArr[i27];
            if (e4Var4 != null) {
                TL_stars.StarGift starGift6 = e4Var4.h;
                if (starGift6 == null) {
                    starGift6 = null;
                }
                if (starGift6 != null) {
                    if (z12) {
                        int i28 = i27 + 1;
                        while (true) {
                            if (i28 >= e4VarArr.length) {
                                break;
                            }
                            e4 e4Var5 = e4VarArr[i28];
                            if (e4Var5 != null) {
                                starGift = e4Var5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i28++;
                        }
                        starGift = null;
                        e4 e4Var6 = e4VarArr[i27];
                        boolean z13 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : true;
                        ImageView imageView = e4Var6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        e4Var6.n = z13;
                        imageView.setImageResource(z13 ? R.drawable.mini_replace2 : R.drawable.msg_close);
                    } else {
                        ImageView imageView2 = e4Var4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        e4Var4.n = false;
                        imageView2.setImageResource(R.drawable.msg_close);
                    }
                    z12 = false;
                }
            }
        }
    }

    public TL_stars.StarGift getFirstGift() {
        int i10 = 0;
        while (true) {
            e4[] e4VarArr = this.n;
            if (i10 >= e4VarArr.length) {
                return null;
            }
            e4 e4Var = e4VarArr[i10];
            if (e4Var != null) {
                TL_stars.StarGift starGift = e4Var.h;
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
            e4[] e4VarArr = this.n;
            if (i10 >= e4VarArr.length) {
                return i11;
            }
            e4 e4Var = e4VarArr[i10];
            if (e4Var != null) {
                TL_stars.StarGift starGift = e4Var.h;
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
            e4[] e4VarArr = this.n;
            if (i10 >= e4VarArr.length) {
                return i11;
            }
            e4 e4Var = e4VarArr[i10];
            if (e4Var != null) {
                TL_stars.StarGift starGift = e4Var.h;
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
        this.b0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.c0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.a0 = callback3;
    }
}
