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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class z5 extends FrameLayout {
    public final org.telegram.ui.Components.b6 E;
    public final o5 F;
    public final LinearLayout G;
    public final org.telegram.ui.Components.s6 H;
    public final org.telegram.ui.Components.s6 I;
    public final ak0 J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public zh.g1[] O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public fi.v3 T;
    public final int[] U;
    public final int[] V;
    public int W;
    public final org.telegram.ui.ActionBar.u6 a;
    public long a0;
    public final y5 b;
    public TLRPC.Document b0;
    public final ImageView c;
    public String c0;
    public final t5[] d;
    public ArrayList d0;
    public final t5 e;
    public Utilities.Callback3 e0;
    public final v5 f;
    public Utilities.Callback2 f0;
    public Runnable g0;
    public final s5 h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public Runnable k0;
    public ak0 l0;
    public SpannableStringBuilder m0;
    public final x5[] n;
    public final xh.n r;
    public boolean s;
    public final LinearLayout v;
    public final LinearLayout w;
    public final n5[] x;
    public final n5[] y;

    public z5(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10 = 6;
        this.U = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.V = new int[]{org.telegram.ui.ActionBar.y6.o1(0.08f, -1), org.telegram.ui.ActionBar.y6.o1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = u6Var;
        y5 y5Var = new y5();
        this.b = y5Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        y5Var.g = mutate;
        setBackground(y5Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        addView(frameLayout, gb1.i(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new p6(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.y6.o1(0.08f, -1)));
        frameLayout.addView(imageView, gb1.h(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new k5(this, 0));
        gb1.b(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new p6(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.y6.o1(0.08f, -1)));
        frameLayout.addView(imageView2, gb1.h(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        int i11 = 1;
        imageView2.setOnClickListener(new k5(this, i11));
        gb1.b(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, gb1.h(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        addView(frameLayout2, gb1.i(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.R = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, gb1.i(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.S = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, gb1.i(-1, -1, 119));
        xh.n nVar = new xh.n(context);
        this.r = nVar;
        nVar.setGravity(17);
        nVar.setTextSize(1, 13.0f);
        nVar.setTextColor(-1);
        frameLayout2.addView(nVar, gb1.h(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        int i12 = 2;
        layoutTransition.setDuration(2, 320L);
        int i13 = 3;
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        ds dsVar = ds.h;
        layoutTransition.setInterpolator(2, dsVar);
        layoutTransition.setInterpolator(3, dsVar);
        layoutTransition.setInterpolator(0, dsVar);
        layoutTransition.setInterpolator(1, dsVar);
        layoutTransition.setInterpolator(4, dsVar);
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
        layoutTransition2.setInterpolator(2, dsVar);
        layoutTransition2.setInterpolator(3, dsVar);
        layoutTransition2.setInterpolator(0, dsVar);
        layoutTransition2.setInterpolator(1, dsVar);
        layoutTransition2.setInterpolator(4, dsVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.x = new n5[4];
        this.y = new n5[4];
        for (int i14 = 0; i14 < 4; i14++) {
            LinearLayout linearLayout3 = this.v;
            n5[] n5VarArr = this.x;
            n5 n5Var = new n5(context);
            n5VarArr[i14] = n5Var;
            linearLayout3.addView(n5Var, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.x[i14].setOnClickListener(new k5(this, i12));
        }
        for (int i15 = 0; i15 < 4; i15++) {
            LinearLayout linearLayout4 = this.v;
            n5[] n5VarArr2 = this.y;
            n5 n5Var2 = new n5(context);
            n5VarArr2[i15] = n5Var2;
            linearLayout4.addView(n5Var2, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i15].setOnClickListener(new k5(this, i13));
        }
        this.n = new x5[4];
        this.d = new t5[6];
        int i16 = 0;
        while (i16 < i10) {
            t5[] t5VarArr = this.d;
            int i17 = i16 == 5 ? i11 : 0;
            t5 t5Var = new t5(context);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new p6(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.y6.o1(0.08f, -1)));
            t5Var.addView(frameLayout5, gb1.h(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            y9Var.setImageResource(R.drawable.large_forge);
            y9Var.setAlpha(i17 != 0 ? 1.0f : 0.45f);
            frameLayout5.addView(y9Var, gb1.i(i17 != 0 ? 42 : 64, i17 != 0 ? 42 : 64, 17));
            if (i17 != 0) {
                y9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                u5 u5Var = new u5(context);
                t5Var.b = u5Var;
                u5Var.e = AndroidUtilities.dp(37.0f);
                u5Var.a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout5.addView(u5Var, gb1.i(90, 90, 17));
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, false, false);
                t5Var.a = s6Var;
                s6Var.getDrawable().r(false, true);
                s6Var.setTypeface(AndroidUtilities.bold());
                s6Var.setTextColor(-1);
                s6Var.setTextSize(AndroidUtilities.dp(14.0f));
                s6Var.setGravity(17);
                s6Var.setText("0%");
                frameLayout5.addView(s6Var, gb1.h(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            t5VarArr[i16] = t5Var;
            i16++;
            i10 = 6;
            i11 = 1;
        }
        this.e = this.d[5];
        v5 v5Var = new v5(context);
        this.f = v5Var;
        int i18 = 8;
        v5Var.setVisibility(8);
        v5Var.setAlpha(0.0f);
        addView(v5Var, gb1.h(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        s5 s5Var = new s5(context, this.d);
        this.h = s5Var;
        addView(s5Var, gb1.h(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(context);
        this.E = b6Var;
        b6Var.setTextSize(1, 12.0f);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        b6Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        b6Var.setGravity(17);
        b6Var.setTextColor(-1);
        b6Var.setAlpha(this.d0 != null ? 1.0f : 0.25f);
        b6Var.setBackground(new p6(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.y6.o1(0.08f, -1)));
        gb1.c(b6Var, 0.02f, 1.2f);
        this.Q.addView(b6Var, gb1.h(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        b6Var.setOnClickListener(new q(i18, this, u6Var));
        this.Q.addView(this.v, gb1.h(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.Q.addView(this.w, gb1.h(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.G = linearLayout5;
        linearLayout5.setOrientation(1);
        o5 o5Var = new o5();
        this.F = o5Var;
        linearLayout5.setBackground(o5Var);
        o5Var.a(org.telegram.ui.ActionBar.y6.o1(0.08f, -1), org.telegram.ui.ActionBar.y6.o1(0.08f, -1));
        gb1.c(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, gb1.h(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new k5(this, 4));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, false, false);
        this.H = s6Var2;
        s6Var2.setTypeface(AndroidUtilities.bold());
        s6Var2.setGravity(17);
        s6Var2.setTextColor(org.telegram.ui.ActionBar.y6.o1(0.75f, -1));
        s6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(s6Var2, gb1.v(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var3 = new org.telegram.ui.Components.s6(context, false, false, false);
        this.I = s6Var3;
        s6Var3.getDrawable().r(true, false);
        s6Var3.setGravity(17);
        s6Var3.setTextColor(org.telegram.ui.ActionBar.y6.o1(0.75f, -1));
        s6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        s6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(s6Var3, gb1.v(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        ak0 ak0Var = new ak0(context);
        this.J = ak0Var;
        ak0Var.setAutoRepeat(true);
        ak0Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(ak0Var, gb1.x(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, gb1.x(-2, -2, 17, 0, 0, 0, 0));
        this.R.addView(linearLayout6, gb1.h(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.y6.o1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView k10 = org.telegram.ui.d3.k(this.R, textView3, gb1.h(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.L = k10;
        k10.setTextSize(1, 13.0f);
        k10.setTextColor(-1);
        k10.setTypeface(AndroidUtilities.bold());
        k10.setGravity(17);
        k10.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        k10.setBackground(new p6(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.y6.o1(0.08f, -1)));
        TextView k11 = org.telegram.ui.d3.k(this.R, k10, gb1.h(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        k11.setTextSize(1, 13.0f);
        k11.setTextColor(org.telegram.ui.ActionBar.y6.o1(0.5f, -1));
        k11.setGravity(17);
        k11.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView k12 = org.telegram.ui.d3.k(this.R, k11, gb1.h(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        k12.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        k12.setTextColor(-505270);
        k12.setTextSize(1, 20.0f);
        k12.setTypeface(AndroidUtilities.bold());
        k12.setGravity(17);
        TextView k13 = org.telegram.ui.d3.k(this.S, k12, gb1.h(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.M = k13;
        k13.setTextColor(-17253);
        k13.setTextSize(1, 13.0f);
        k13.setGravity(17);
        this.S.addView(k13, gb1.h(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.N = linearLayout7;
        linearLayout7.setOrientation(0);
        this.S.addView(linearLayout7, gb1.h(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.O = null;
        d(true);
    }

    public final void a(int i10, long j10, TLRPC.Document document, String str) {
        x5[] x5VarArr;
        this.W = i10;
        this.a0 = j10;
        this.b0 = document;
        this.c0 = str;
        this.h0 = false;
        this.j0 = false;
        int i11 = 0;
        while (true) {
            x5VarArr = this.n;
            if (i11 >= x5VarArr.length) {
                break;
            }
            x5 x5Var = x5VarArr[i11];
            if (x5Var != null) {
                AndroidUtilities.removeFromParent(x5Var);
            }
            i11++;
        }
        s5 s5Var = this.h;
        View[] viewArr = s5Var.a;
        r5 r5Var = s5Var.H;
        if (r5Var != null) {
            r5Var.e = true;
            r5Var.l = false;
            r5Var.a.H = null;
            s5Var.H = null;
        }
        ValueAnimator valueAnimator = s5Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            s5Var.G = null;
        }
        s5Var.F = -1;
        s5Var.E = 0.0f;
        s5Var.v.clear();
        s5Var.w.clear();
        s5Var.x.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            s5Var.y[i12] = 0.0f;
        }
        s5Var.removeAllViews();
        for (int i13 = 0; i13 < viewArr.length; i13++) {
            viewArr[i13].setAlpha(1.0f);
            viewArr[i13].setVisibility(0);
            s5Var.addView(viewArr[i13], gb1.i(108, 108, 17));
        }
        Matrix.setIdentityM(s5Var.c, 0);
        s5Var.e = 0.0f;
        s5Var.d = 0.0f;
        s5Var.f = true;
        x5 x5Var2 = new x5(getContext());
        x5VarArr[0] = x5Var2;
        addView(x5Var2, gb1.h(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        x5 x5Var3 = new x5(getContext());
        x5VarArr[1] = x5Var3;
        addView(x5Var3, gb1.h(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        x5 x5Var4 = new x5(getContext());
        x5VarArr[2] = x5Var4;
        addView(x5Var4, gb1.h(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        x5 x5Var5 = new x5(getContext());
        x5VarArr[3] = x5Var5;
        addView(x5Var5, gb1.h(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i14 = 0; i14 < x5VarArr.length; i14++) {
            gb1.b(x5VarArr[i14]);
            x5VarArr[i14].setClickable(true);
            x5VarArr[i14].setOnClickListener(new k5(this, 5));
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
        v5 v5Var = this.f;
        v5Var.setVisibility(8);
        v5Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.s6 s6Var = this.H;
        s6Var.setText(string);
        s6Var.setTranslationY(0.0f);
        this.I.setAlpha(1.0f);
        GiftAuctionController.getInstance(i10).requestAuctionUpgrades(j10, new l5(this, j10, j10, 0));
    }

    public final void b(n5 n5Var) {
        if (n5Var.d != null) {
            c(n5Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(n5Var.f * 100.0f), n5Var.d.name)));
        } else if (n5Var.e != null) {
            c(n5Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(n5Var.f * 100.0f), n5Var.e.name)));
        }
    }

    public final void c(n5 n5Var, SpannableStringBuilder spannableStringBuilder) {
        fi.v3 v3Var = this.T;
        if (v3Var != null) {
            v3Var.e(true);
            this.T = null;
        }
        if (this.h0 || this.j0) {
            return;
        }
        View view = n5Var.getParent() instanceof View ? (View) n5Var.getParent() : null;
        float x9 = n5Var.getX() + (view != null ? view.getX() : 0.0f);
        float y3 = n5Var.getY() + (view != null ? view.getY() : 0.0f);
        fi.v3 v3Var2 = new fi.v3(getContext(), 3);
        this.T = v3Var2;
        v3Var2.p(true);
        this.T.s(spannableStringBuilder);
        fi.v3 v3Var3 = this.T;
        v3Var3.h = fi.v3.a(v3Var3.getText(), this.T.getTextPaint());
        fi.v3 v3Var4 = this.T;
        v3Var4.K = Layout.Alignment.ALIGN_CENTER;
        v3Var4.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(this.T, gb1.h(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.T.setTranslationY(y3 - AndroidUtilities.dp(100.0f));
        this.T.m(0.0f, ((n5Var.getWidth() / 2.0f) + x9) - AndroidUtilities.dp(2.0f));
        this.T.u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x04a9, code lost:
    
        if (r5 != null) goto L185;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z10) {
        int i10;
        x5[] x5VarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i11;
        HashMap hashMap2;
        boolean z11;
        n5[] n5VarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        boolean z12;
        TL_stars.StarGift starGift;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        t5 t5Var = this.e;
        org.telegram.ui.Components.s6 s6Var = t5Var.a;
        if (s6Var != null) {
            s6Var.c(Math.round(giftsSuccessChance) + "%", z10, true);
            u5 u5Var = t5Var.b;
            float f7 = giftsSuccessChance / 100.0f;
            u5Var.d = f7;
            if (!z10) {
                u5Var.b.d(f7, true);
            }
            u5Var.invalidate();
        }
        org.telegram.ui.Components.s6 s6Var2 = this.I;
        int i12 = 0;
        if (giftsSelectedCount <= 0) {
            if (this.m0 == null) {
                this.m0 = new SpannableStringBuilder("+");
                zq zqVar = new zq(R.drawable.filled_add_album, 0);
                zqVar.setScale(0.65f, 0.65f);
                SpannableStringBuilder spannableStringBuilder = this.m0;
                spannableStringBuilder.setSpan(zqVar, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.GiftCraftButtonEmpty));
            AndroidUtilities.replaceMultipleCharSequence("+", spannableStringBuilder2, this.m0);
            s6Var2.setText(spannableStringBuilder2);
        } else {
            s6Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, hi.k.F0(getGiftsSuccessChance()))));
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
            xh.n nVar = this.r;
            if (firstGift != null) {
                SpannableString spannableString = new SpannableString("x");
                spannableString.setSpan(new org.telegram.ui.Components.c6(this.b0, nVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                i10 = 4;
                nVar.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftText1)), "\n", spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftText2, this.c0, LocaleController.formatNumber(firstGift.num, ',')))));
            } else {
                i10 = 4;
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new org.telegram.ui.Components.c6(this.b0, nVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                nVar.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftTextEmpty1)), "\n", spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftTextEmpty2, this.c0))));
            }
        } else {
            i10 = 4;
        }
        int[][] iArr3 = MessagesController.getInstance(this.W).stargiftsCraftAttributesPermilles;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            x5VarArr = this.n;
            if (i15 >= x5VarArr.length) {
                break;
            }
            x5 x5Var = x5VarArr[i15];
            if (x5Var != null) {
                TL_stars.StarGift starGift2 = x5Var.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i16++;
                    TL_stars.StarGift starGift3 = starGift2 != null ? starGift2 : null;
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) ca.l(starGift3.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) ca.l(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i15++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        n5[] n5VarArr2 = this.x;
        if (isEmpty) {
            n5 n5Var = n5VarArr2[0];
            n5Var.a(null);
            n5Var.c(0.0f, true);
            arrayList.add(n5Var);
            int i17 = 1;
            for (int i18 = i10; i17 < i18; i18 = 4) {
                n5VarArr2[i17].setVisibility(8);
                i17++;
            }
            hashMap = hashMap4;
        } else {
            ArrayList arrayList2 = new ArrayList(hashMap3.entrySet());
            Collections.sort(arrayList2, Map$Entry$-CC.comparingByValue());
            int size = arrayList2.size();
            int i19 = 0;
            int i20 = 0;
            while (i19 < size) {
                Object obj = arrayList2.get(i19);
                i19++;
                Map.Entry entry = (Map.Entry) obj;
                int intValue = ((Integer) entry.getKey()).intValue();
                int intValue2 = ((Integer) entry.getValue()).intValue();
                int i21 = i12;
                while (true) {
                    if (i21 >= x5VarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    x5 x5Var2 = x5VarArr[i21];
                    if (x5Var2 != null) {
                        TL_stars.StarGift starGift4 = x5Var2.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ca.l(starGift4.attributes, TL_stars.starGiftAttributeBackdrop.class);
                            if (stargiftattributebackdrop.backdrop_id == intValue) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i21++;
                }
                if (stargiftattributebackdrop != null) {
                    n5 n5Var2 = n5VarArr2[i20];
                    n5Var2.a(stargiftattributebackdrop);
                    i11 = size;
                    int[] iArr4 = iArr3[Utilities.clamp(i16 - 1, iArr3.length - 1, 0)];
                    int i22 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    n5Var2.c(iArr4[Utilities.clamp(i22, iArr4.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(n5Var2);
                    i20++;
                } else {
                    i11 = size;
                    hashMap2 = hashMap4;
                }
                hashMap4 = hashMap2;
                size = i11;
                i12 = 0;
            }
            hashMap = hashMap4;
            for (int i23 = i20; i23 < 4; i23++) {
                n5VarArr2[i23].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        n5[] n5VarArr3 = this.y;
        if (isEmpty2) {
            n5 n5Var3 = n5VarArr3[0];
            n5Var3.b(null);
            n5Var3.c(0.0f, true);
            arrayList.add(n5Var3);
            for (int i24 = 1; i24 < 4; i24++) {
                n5VarArr3[i24].setVisibility(8);
            }
            z11 = true;
        } else {
            ArrayList arrayList3 = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList3, Map$Entry$-CC.comparingByValue());
            int size2 = arrayList3.size();
            int i25 = 0;
            int i26 = 0;
            while (i26 < size2) {
                Object obj2 = arrayList3.get(i26);
                i26++;
                Map.Entry entry2 = (Map.Entry) obj2;
                long longValue = ((Long) entry2.getKey()).longValue();
                int intValue3 = ((Integer) entry2.getValue()).intValue();
                int i27 = 0;
                while (true) {
                    if (i27 >= x5VarArr.length) {
                        n5VarArr = n5VarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    x5 x5Var3 = x5VarArr[i27];
                    if (x5Var3 != null) {
                        TL_stars.StarGift starGift5 = x5Var3.h;
                        if ((starGift5 != null ? starGift5 : null) != null) {
                            if (starGift5 == null) {
                                starGift5 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) ca.l(starGift5.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                n5VarArr = n5VarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i27++;
                                    n5VarArr3 = n5VarArr;
                                }
                            }
                        }
                    }
                    n5VarArr = n5VarArr3;
                    i27++;
                    n5VarArr3 = n5VarArr;
                }
                if (stargiftattributepattern != null) {
                    int i28 = i25 + 1;
                    n5 n5Var4 = n5VarArr[i25];
                    n5Var4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.clamp(i16 - 1, iArr3.length - 1, 0)];
                    n5Var4.c(iArr5[Utilities.clamp(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(n5Var4);
                    i25 = i28;
                }
                n5VarArr3 = n5VarArr;
            }
            n5[] n5VarArr4 = n5VarArr3;
            z11 = true;
            while (i25 < 4) {
                n5VarArr4[i25].setVisibility(8);
                i25++;
            }
        }
        this.s = arrayList.size() > 5 ? z11 : false;
        int i29 = 0;
        while (true) {
            int size3 = arrayList.size();
            linearLayout = this.w;
            if (i29 >= size3) {
                break;
            }
            n5 n5Var5 = (n5) arrayList.get(i29);
            if (!this.s || i29 < arrayList.size() / 2.0f) {
                linearLayout = this.v;
            }
            if (n5Var5.getParent() != linearLayout) {
                ViewParent parent = n5Var5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z13 = layoutTransition != null ? z11 : false;
                    if (z13) {
                        layoutTransition.disableTransitionType(3);
                    }
                    viewGroup.removeView(n5Var5);
                    if (z13) {
                        layoutTransition.enableTransitionType(3);
                    }
                    n5Var5.animate().cancel();
                    n5Var5.clearAnimation();
                    n5Var5.setTranslationX(0.0f);
                    n5Var5.setTranslationY(0.0f);
                    n5Var5.setTranslationZ(0.0f);
                    n5Var5.setAlpha(0.0f);
                    n5Var5.setScaleX(1.0f);
                    n5Var5.setScaleY(1.0f);
                    n5Var5.setRotation(0.0f);
                    n5Var5.setRotationX(0.0f);
                    n5Var5.setRotationY(0.0f);
                }
                linearLayout.addView(n5Var5, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            }
            n5Var5.setVisibility(0);
            i29++;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.E.animate().alpha(this.s ? 0.0f : this.d0 != null ? 1.0f : 0.25f);
        boolean z14 = z11;
        for (int i30 = 0; i30 < x5VarArr.length; i30++) {
            x5 x5Var4 = x5VarArr[i30];
            if (x5Var4 != null) {
                TL_stars.StarGift starGift6 = x5Var4.h;
                if (starGift6 == null) {
                    starGift6 = null;
                }
                if (starGift6 != null) {
                    if (z14) {
                        int i31 = i30 + 1;
                        while (true) {
                            if (i31 >= x5VarArr.length) {
                                break;
                            }
                            x5 x5Var5 = x5VarArr[i31];
                            if (x5Var5 != null) {
                                starGift = x5Var5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i31++;
                        }
                        starGift = null;
                        x5 x5Var6 = x5VarArr[i30];
                        boolean z15 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : z11;
                        ImageView imageView = x5Var6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        x5Var6.n = z15;
                        imageView.setImageResource(z15 ? R.drawable.mini_replace2 : R.drawable.msg_close);
                        z12 = false;
                    } else {
                        ImageView imageView2 = x5Var4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        z12 = false;
                        x5Var4.n = false;
                        imageView2.setImageResource(R.drawable.msg_close);
                    }
                    z14 = z12;
                }
            }
        }
    }

    public TL_stars.StarGift getFirstGift() {
        int i10 = 0;
        while (true) {
            x5[] x5VarArr = this.n;
            if (i10 >= x5VarArr.length) {
                return null;
            }
            x5 x5Var = x5VarArr[i10];
            if (x5Var != null) {
                TL_stars.StarGift starGift = x5Var.h;
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
            x5[] x5VarArr = this.n;
            if (i10 >= x5VarArr.length) {
                return i11;
            }
            x5 x5Var = x5VarArr[i10];
            if (x5Var != null) {
                TL_stars.StarGift starGift = x5Var.h;
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
            x5[] x5VarArr = this.n;
            if (i10 >= x5VarArr.length) {
                return i11;
            }
            x5 x5Var = x5VarArr[i10];
            if (x5Var != null) {
                TL_stars.StarGift starGift = x5Var.h;
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
        this.f0 = callback2;
    }

    public void setOnClose(Runnable runnable) {
        this.g0 = runnable;
    }

    public void setOnCraft(Utilities.Callback3<ArrayList<TL_stars.StarGift>, Utilities.Callback2<TL_stars.StarGift, Runnable>, Runnable> callback3) {
        this.e0 = callback3;
    }
}
