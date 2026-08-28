package gh;

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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i4 extends FrameLayout {
    public final org.telegram.ui.Components.s5 A;
    public final y3 B;
    public final LinearLayout C;
    public final org.telegram.ui.Components.j6 D;
    public final org.telegram.ui.Components.j6 E;
    public final pi0 F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final LinearLayout J;
    public fh.f2[] K;
    public final FrameLayout L;
    public final FrameLayout M;
    public final FrameLayout N;
    public final FrameLayout O;
    public kh.x3 P;
    public final int[] Q;
    public final int[] R;
    public int S;
    public long T;
    public TLRPC.Document U;
    public String V;
    public ArrayList W;
    public final org.telegram.ui.ActionBar.b6 a;
    public Utilities.Callback3 a0;
    public final h4 b;
    public Utilities.Callback2 b0;
    public final ImageView c;
    public Runnable c0;
    public final c4[] d;
    public boolean d0;
    public final c4 e;
    public boolean e0;
    public final e4 f;
    public boolean f0;
    public Runnable g0;
    public final b4 h;
    public pi0 h0;
    public SpannableStringBuilder i0;
    public final g4[] n;
    public final dh.u r;
    public boolean s;
    public final LinearLayout v;
    public final LinearLayout w;
    public final x3[] x;
    public final x3[] y;

    public i4(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.Q = new int[]{-14861233, -15787732, -11327734, -14742773, -14527649, -15920861};
        this.R = new int[]{org.telegram.ui.ActionBar.f6.l1(0.08f, -1), org.telegram.ui.ActionBar.f6.l1(0.08f, -1), -294362, -3914963, -13519030, -12613223};
        this.a = b6Var;
        h4 h4Var = new h4();
        this.b = h4Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_forge).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        h4Var.g = mutate;
        setBackground(h4Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        addView(frameLayout, g7.e6.e(-1, 60, 55));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.outline_question_mark);
        imageView.setBackground(new w4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.f6.l1(0.08f, -1)));
        frameLayout.addView(imageView, g7.e6.d(32, 32.0f, 51, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView.setOnClickListener(new v3(this, 0));
        g7.g6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setBackground(new w4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.f6.l1(0.08f, -1)));
        frameLayout.addView(imageView2, g7.e6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        imageView2.setOnClickListener(new v3(this, 1));
        g7.g6.a(imageView2);
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.GiftCraftTitle));
        addView(textView, g7.e6.d(-1, -2.0f, 49, 0.0f, 20.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        addView(frameLayout2, g7.e6.e(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.N = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, g7.e6.e(-1, -1, 119));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.O = frameLayout4;
        frameLayout4.setAlpha(0.0f);
        addView(frameLayout4, g7.e6.e(-1, -1, 119));
        dh.u uVar = new dh.u(context);
        this.r = uVar;
        uVar.setGravity(17);
        uVar.setTextSize(1, 13.0f);
        uVar.setTextColor(-1);
        frameLayout2.addView(uVar, g7.e6.d(-1, -2.0f, 49, 32.0f, 244.0f, 32.0f, 84.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        int i9 = 2;
        layoutTransition.setDuration(2, 320L);
        int i10 = 3;
        layoutTransition.setDuration(3, 320L);
        layoutTransition.setDuration(0, 320L);
        layoutTransition.setDuration(1, 320L);
        layoutTransition.setDuration(4, 320L);
        gr grVar = gr.h;
        layoutTransition.setInterpolator(2, grVar);
        layoutTransition.setInterpolator(3, grVar);
        layoutTransition.setInterpolator(0, grVar);
        layoutTransition.setInterpolator(1, grVar);
        layoutTransition.setInterpolator(4, grVar);
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
        layoutTransition2.setInterpolator(2, grVar);
        layoutTransition2.setInterpolator(3, grVar);
        layoutTransition2.setInterpolator(0, grVar);
        layoutTransition2.setInterpolator(1, grVar);
        layoutTransition2.setInterpolator(4, grVar);
        linearLayout2.setLayoutTransition(layoutTransition2);
        linearLayout2.setOrientation(0);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        this.x = new x3[4];
        this.y = new x3[4];
        for (int i11 = 0; i11 < 4; i11++) {
            LinearLayout linearLayout3 = this.v;
            x3[] x3VarArr = this.x;
            x3 x3Var = new x3(context);
            x3VarArr[i11] = x3Var;
            linearLayout3.addView(x3Var, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.x[i11].setOnClickListener(new v3(this, i9));
        }
        for (int i12 = 0; i12 < 4; i12++) {
            LinearLayout linearLayout4 = this.v;
            x3[] x3VarArr2 = this.y;
            x3 x3Var2 = new x3(context);
            x3VarArr2[i12] = x3Var2;
            linearLayout4.addView(x3Var2, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            this.y[i12].setOnClickListener(new v3(this, i10));
        }
        this.n = new g4[4];
        this.d = new c4[6];
        int i13 = 0;
        for (int i14 = 6; i13 < i14; i14 = 6) {
            c4[] c4VarArr = this.d;
            boolean z10 = i13 == 5;
            c4 c4Var = new c4(context);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(new w4(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.f6.l1(0.08f, -1)));
            c4Var.addView(frameLayout5, g7.e6.d(-1, -1.0f, 119, 2.0f, 2.0f, 2.0f, 2.0f));
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            o9Var.setImageResource(R.drawable.large_forge);
            o9Var.setAlpha(z10 ? 1.0f : 0.45f);
            frameLayout5.addView(o9Var, g7.e6.e(z10 ? 42 : 64, z10 ? 42 : 64, 17));
            if (z10) {
                o9Var.setTranslationX(AndroidUtilities.dp(-4.0f));
                d4 d4Var = new d4(context);
                c4Var.b = d4Var;
                d4Var.e = AndroidUtilities.dp(37.0f);
                d4Var.a.setStrokeWidth(AndroidUtilities.dpf2(4.66f));
                frameLayout5.addView(d4Var, g7.e6.e(90, 90, 17));
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
                c4Var.a = j6Var;
                j6Var.getDrawable().o(false, true, false);
                j6Var.setTypeface(AndroidUtilities.bold());
                j6Var.setTextColor(-1);
                j6Var.setTextSize(AndroidUtilities.dp(14.0f));
                j6Var.setGravity(17);
                j6Var.setText("0%");
                frameLayout5.addView(j6Var, g7.e6.d(-1, 16.0f, 55, 12.0f, 80.0f, 12.0f, 0.0f));
            }
            c4VarArr[i13] = c4Var;
            i13++;
        }
        this.e = this.d[5];
        e4 e4Var = new e4(context);
        this.f = e4Var;
        e4Var.setVisibility(8);
        e4Var.setAlpha(0.0f);
        addView(e4Var, g7.e6.d(300, 300.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        b4 b4Var = new b4(context, this.d);
        this.h = b4Var;
        addView(b4Var, g7.e6.d(-1, 300.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.A = s5Var;
        s5Var.setTextSize(1, 12.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
        s5Var.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        s5Var.setGravity(17);
        s5Var.setTextColor(-1);
        s5Var.setAlpha(this.W != null ? 1.0f : 0.25f);
        s5Var.setBackground(new w4(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.f6.l1(0.08f, -1)));
        g7.g6.b(s5Var, 0.02f, 1.2f);
        this.M.addView(s5Var, g7.e6.d(-2, 27.0f, 49, 32.0f, 412.0f, 32.0f, 84.0f));
        s5Var.setOnClickListener(new bg.u1(19, this, b6Var));
        this.M.addView(this.v, g7.e6.d(-2, 54.0f, 49, 32.0f, 340.0f, 32.0f, 84.0f));
        this.M.addView(this.w, g7.e6.d(-2, 54.0f, 49, 32.0f, 394.0f, 32.0f, 84.0f));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.C = linearLayout5;
        linearLayout5.setOrientation(1);
        y3 y3Var = new y3();
        this.B = y3Var;
        linearLayout5.setBackground(y3Var);
        y3Var.a(org.telegram.ui.ActionBar.f6.l1(0.08f, -1), org.telegram.ui.ActionBar.f6.l1(0.08f, -1));
        g7.g6.b(linearLayout5, 0.02f, 1.2f);
        addView(linearLayout5, g7.e6.d(-1, -2.0f, 87, 20.0f, 0.0f, 20.0f, 18.0f));
        linearLayout5.setOnClickListener(new v3(this, 4));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.D = j6Var2;
        j6Var2.setTypeface(AndroidUtilities.bold());
        j6Var2.setGravity(17);
        j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.75f, -1));
        j6Var2.setText(LocaleController.getString(R.string.GiftCraftButton));
        j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        linearLayout5.addView(j6Var2, g7.e6.r(-1, 18, 55, 16.0f, 7.33f, 16.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.E = j6Var3;
        j6Var3.getDrawable().o(true, false, false);
        j6Var3.setGravity(17);
        j6Var3.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.75f, -1));
        j6Var3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, "0%")));
        j6Var3.setTextSize(AndroidUtilities.dp(12.0f));
        linearLayout5.addView(j6Var3, g7.e6.r(-1, 14, 55, 16.0f, 2.66f, 16.0f, 7.66f));
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setGravity(17);
        pi0 pi0Var = new pi0(context);
        this.F = pi0Var;
        pi0Var.setAutoRepeat(true);
        pi0Var.f(R.raw.gift_crafting, 30, 30, null);
        linearLayout6.addView(pi0Var, g7.e6.t(30, 30, 17, 0, 0, 4, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.GiftCraftProgressTitle));
        linearLayout6.addView(textView2, g7.e6.t(-2, -2, 17, 0, 0, 0, 0));
        this.N.addView(linearLayout6, g7.e6.d(-1, -2.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.G = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.5f, -1));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(17);
        TextView g10 = org.telegram.ui.Cells.j2.g(this.N, textView3, g7.e6.d(-1, -2.0f, 49, 0.0f, 383.0f, 0.0f, 0.0f), context);
        this.H = g10;
        g10.setTextSize(1, 13.0f);
        g10.setTextColor(-1);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setGravity(17);
        g10.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
        g10.setBackground(new w4(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.f6.l1(0.08f, -1)));
        TextView g11 = org.telegram.ui.Cells.j2.g(this.N, g10, g7.e6.d(-2, 27.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f), context);
        g11.setTextSize(1, 13.0f);
        g11.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.5f, -1));
        g11.setGravity(17);
        g11.setText(LocaleController.getString(R.string.GiftCraftProgressText));
        TextView g12 = org.telegram.ui.Cells.j2.g(this.N, g11, g7.e6.d(-1, -2.0f, 81, 42.0f, 0.0f, 42.0f, 24.0f), context);
        g12.setText(LocaleController.getString(R.string.GiftCraftFailedTitle));
        g12.setTextColor(-505270);
        g12.setTextSize(1, 20.0f);
        g12.setTypeface(AndroidUtilities.bold());
        g12.setGravity(17);
        TextView g13 = org.telegram.ui.Cells.j2.g(this.O, g12, g7.e6.d(-1, -2.0f, 55, 32.0f, 352.0f, 32.0f, 0.0f), context);
        this.I = g13;
        g13.setTextColor(-17253);
        g13.setTextSize(1, 13.0f);
        g13.setGravity(17);
        this.O.addView(g13, g7.e6.d(-1, -2.0f, 55, 32.0f, 383.0f, 32.0f, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.J = linearLayout7;
        linearLayout7.setOrientation(0);
        this.O.addView(linearLayout7, g7.e6.d(-2, -2.0f, 49, 0.0f, 250.0f, 0.0f, 0.0f));
        this.K = null;
        d(true);
    }

    public final void a(int i9, long j10, TLRPC.Document document, String str) {
        g4[] g4VarArr;
        this.S = i9;
        this.T = j10;
        this.U = document;
        this.V = str;
        this.d0 = false;
        this.f0 = false;
        int i10 = 0;
        while (true) {
            g4VarArr = this.n;
            if (i10 >= g4VarArr.length) {
                break;
            }
            g4 g4Var = g4VarArr[i10];
            if (g4Var != null) {
                AndroidUtilities.removeFromParent(g4Var);
            }
            i10++;
        }
        b4 b4Var = this.h;
        View[] viewArr = b4Var.a;
        a4 a4Var = b4Var.D;
        if (a4Var != null) {
            a4Var.e = true;
            a4Var.l = false;
            a4Var.a.D = null;
            b4Var.D = null;
        }
        ValueAnimator valueAnimator = b4Var.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            b4Var.C = null;
        }
        b4Var.B = -1;
        b4Var.A = 0.0f;
        b4Var.v.clear();
        b4Var.w.clear();
        b4Var.x.clear();
        for (int i11 = 0; i11 < 6; i11++) {
            b4Var.y[i11] = 0.0f;
        }
        b4Var.removeAllViews();
        for (int i12 = 0; i12 < viewArr.length; i12++) {
            viewArr[i12].setAlpha(1.0f);
            viewArr[i12].setVisibility(0);
            b4Var.addView(viewArr[i12], g7.e6.e(108, 108, 17));
        }
        Matrix.setIdentityM(b4Var.c, 0);
        b4Var.e = 0.0f;
        b4Var.d = 0.0f;
        b4Var.f = true;
        g4 g4Var2 = new g4(getContext());
        g4VarArr[0] = g4Var2;
        addView(g4Var2, g7.e6.d(76, 76.0f, 49, -117.0f, 74.0f, 0.0f, 0.0f));
        g4 g4Var3 = new g4(getContext());
        g4VarArr[1] = g4Var3;
        addView(g4Var3, g7.e6.d(76, 76.0f, 49, -117.0f, 149.0f, 0.0f, 0.0f));
        g4 g4Var4 = new g4(getContext());
        g4VarArr[2] = g4Var4;
        addView(g4Var4, g7.e6.d(76, 76.0f, 49, 117.0f, 74.0f, 0.0f, 0.0f));
        g4 g4Var5 = new g4(getContext());
        g4VarArr[3] = g4Var5;
        addView(g4Var5, g7.e6.d(76, 76.0f, 49, 117.0f, 149.0f, 0.0f, 0.0f));
        for (int i13 = 0; i13 < g4VarArr.length; i13++) {
            g7.g6.a(g4VarArr[i13]);
            g4VarArr[i13].setClickable(true);
            g4VarArr[i13].setOnClickListener(new v3(this, 5));
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
        e4 e4Var = this.f;
        e4Var.setVisibility(8);
        e4Var.setAlpha(0.0f);
        String string = LocaleController.getString(R.string.GiftCraftButton);
        org.telegram.ui.Components.j6 j6Var = this.D;
        j6Var.setText(string);
        j6Var.setTranslationY(0.0f);
        this.E.setAlpha(1.0f);
        GiftAuctionController.getInstance(i9).requestAuctionUpgrades(j10, new w3(this, j10, j10, 0));
    }

    public final void b(x3 x3Var) {
        if (x3Var.d != null) {
            c(x3Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftBackdropChance", Math.round(x3Var.f * 100.0f), x3Var.d.name)));
        } else if (x3Var.e != null) {
            c(x3Var, AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSymbolChance", Math.round(x3Var.f * 100.0f), x3Var.e.name)));
        }
    }

    public final void c(x3 x3Var, SpannableStringBuilder spannableStringBuilder) {
        kh.x3 x3Var2 = this.P;
        if (x3Var2 != null) {
            x3Var2.e(true);
            this.P = null;
        }
        if (this.d0 || this.f0) {
            return;
        }
        View view = x3Var.getParent() instanceof View ? (View) x3Var.getParent() : null;
        float x10 = x3Var.getX() + (view != null ? view.getX() : 0.0f);
        float y10 = x3Var.getY() + (view != null ? view.getY() : 0.0f);
        kh.x3 x3Var3 = new kh.x3(getContext(), 3);
        this.P = x3Var3;
        x3Var3.q(true);
        this.P.t(spannableStringBuilder);
        kh.x3 x3Var4 = this.P;
        x3Var4.h = kh.x3.a(x3Var4.getText(), this.P.getTextPaint());
        kh.x3 x3Var5 = this.P;
        x3Var5.G = Layout.Alignment.ALIGN_CENTER;
        x3Var5.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(this.P, g7.e6.d(-1, 100.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.P.setTranslationY(y10 - AndroidUtilities.dp(100.0f));
        this.P.n(0.0f, ((x3Var.getWidth() / 2.0f) + x10) - AndroidUtilities.dp(2.0f));
        this.P.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x04aa, code lost:
    
        if (r5 != null) goto L186;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z10) {
        g4[] g4VarArr;
        HashMap hashMap;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop;
        int i9;
        HashMap hashMap2;
        x3[] x3VarArr;
        TL_stars.starGiftAttributePattern stargiftattributepattern;
        LinearLayout linearLayout;
        TL_stars.StarGift starGift;
        int giftsSelectedCount = getGiftsSelectedCount();
        float giftsSuccessChance = getGiftsSuccessChance() / 10.0f;
        c4 c4Var = this.e;
        org.telegram.ui.Components.j6 j6Var = c4Var.a;
        if (j6Var != null) {
            j6Var.c(Math.round(giftsSuccessChance) + "%", z10, true);
            d4 d4Var = c4Var.b;
            float f10 = giftsSuccessChance / 100.0f;
            d4Var.d = f10;
            if (!z10) {
                d4Var.b.d(f10, true);
            }
            d4Var.invalidate();
        }
        org.telegram.ui.Components.j6 j6Var2 = this.E;
        if (giftsSelectedCount <= 0) {
            if (this.i0 == null) {
                this.i0 = new SpannableStringBuilder("+");
                eq eqVar = new eq(R.drawable.filled_add_album, 0);
                eqVar.setScale(0.65f, 0.65f);
                SpannableStringBuilder spannableStringBuilder = this.i0;
                spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.GiftCraftButtonEmpty));
            AndroidUtilities.replaceMultipleCharSequence("+", spannableStringBuilder2, this.i0);
            j6Var2.setText(spannableStringBuilder2);
        } else {
            j6Var2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftSuccessChance, mh.l.F0(getGiftsSuccessChance()))));
        }
        int i10 = (giftsSelectedCount == 0 ? 0 : giftsSelectedCount < 4 ? 1 : 2) * 2;
        int[] iArr = this.R;
        int i11 = i10 + 1;
        this.B.a(iArr[i10], iArr[i11]);
        int[] iArr2 = this.Q;
        this.b.a(iArr2[i10], iArr2[i11]);
        this.f.a(iArr[i11], iArr[i10]);
        if (this.U != null) {
            TL_stars.StarGift firstGift = getFirstGift();
            dh.u uVar = this.r;
            if (firstGift != null) {
                SpannableString spannableString = new SpannableString("x");
                spannableString.setSpan(new org.telegram.ui.Components.t5(this.U, uVar.getPaint().getFontMetricsInt()), 0, spannableString.length(), 33);
                uVar.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftText1)), "\n", spannableString, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftText2, this.V, LocaleController.formatNumber(firstGift.num, ',')))));
            } else {
                SpannableString spannableString2 = new SpannableString("x");
                spannableString2.setSpan(new org.telegram.ui.Components.t5(this.U, uVar.getPaint().getFontMetricsInt()), 0, spannableString2.length(), 33);
                uVar.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftTextEmpty1)), "\n", spannableString2, " ", AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftTextEmpty2, this.V))));
            }
        }
        int[][] iArr3 = MessagesController.getInstance(this.S).stargiftsCraftAttributesPermilles;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            g4VarArr = this.n;
            if (i12 >= g4VarArr.length) {
                break;
            }
            g4 g4Var = g4VarArr[i12];
            if (g4Var != null) {
                TL_stars.StarGift starGift2 = g4Var.h;
                if ((starGift2 != null ? starGift2 : null) != null) {
                    i13++;
                    TL_stars.StarGift starGift3 = starGift2 != null ? starGift2 : null;
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) v7.l(starGift3.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) v7.l(starGift3.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    hashMap3.put(Integer.valueOf(stargiftattributebackdrop2.backdrop_id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap3, Integer.valueOf(stargiftattributebackdrop2.backdrop_id), 0)).intValue() + 1));
                    hashMap4.put(Long.valueOf(stargiftattributepattern2.document.id), Integer.valueOf(((Integer) Map.-EL.getOrDefault(hashMap4, Long.valueOf(stargiftattributepattern2.document.id), 0)).intValue() + 1));
                }
            }
            i12++;
        }
        boolean isEmpty = hashMap3.isEmpty();
        x3[] x3VarArr2 = this.x;
        if (isEmpty) {
            x3 x3Var = x3VarArr2[0];
            x3Var.a(null);
            x3Var.c(0.0f, true);
            arrayList.add(x3Var);
            for (int i14 = 1; i14 < 4; i14++) {
                x3VarArr2[i14].setVisibility(8);
            }
            hashMap = hashMap4;
        } else {
            ArrayList arrayList2 = new ArrayList(hashMap3.entrySet());
            Collections.sort(arrayList2, Map$Entry$-CC.comparingByValue());
            int size = arrayList2.size();
            int i15 = 0;
            int i16 = 0;
            while (i15 < size) {
                Object obj = arrayList2.get(i15);
                i15++;
                Map.Entry entry = (Map.Entry) obj;
                int intValue = ((Integer) entry.getKey()).intValue();
                int intValue2 = ((Integer) entry.getValue()).intValue();
                int i17 = 0;
                while (true) {
                    if (i17 >= g4VarArr.length) {
                        stargiftattributebackdrop = null;
                        break;
                    }
                    g4 g4Var2 = g4VarArr[i17];
                    if (g4Var2 != null) {
                        TL_stars.StarGift starGift4 = g4Var2.h;
                        if ((starGift4 != null ? starGift4 : null) != null) {
                            if (starGift4 == null) {
                                starGift4 = null;
                            }
                            stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v7.l(starGift4.attributes, TL_stars.starGiftAttributeBackdrop.class);
                            if (stargiftattributebackdrop.backdrop_id == intValue) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i17++;
                }
                if (stargiftattributebackdrop != null) {
                    x3 x3Var2 = x3VarArr2[i16];
                    x3Var2.a(stargiftattributebackdrop);
                    i9 = size;
                    int[] iArr4 = iArr3[Utilities.clamp(i13 - 1, iArr3.length - 1, 0)];
                    int i18 = intValue2 - 1;
                    hashMap2 = hashMap4;
                    x3Var2.c(iArr4[Utilities.clamp(i18, iArr4.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(x3Var2);
                    i16++;
                } else {
                    i9 = size;
                    hashMap2 = hashMap4;
                }
                hashMap4 = hashMap2;
                size = i9;
            }
            hashMap = hashMap4;
            for (int i19 = i16; i19 < 4; i19++) {
                x3VarArr2[i19].setVisibility(8);
            }
        }
        boolean isEmpty2 = hashMap.isEmpty();
        x3[] x3VarArr3 = this.y;
        if (isEmpty2) {
            x3 x3Var3 = x3VarArr3[0];
            x3Var3.b(null);
            x3Var3.c(0.0f, true);
            arrayList.add(x3Var3);
            for (int i20 = 1; i20 < 4; i20++) {
                x3VarArr3[i20].setVisibility(8);
            }
        } else {
            ArrayList arrayList3 = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList3, Map$Entry$-CC.comparingByValue());
            int size2 = arrayList3.size();
            int i21 = 0;
            int i22 = 0;
            while (i22 < size2) {
                Object obj2 = arrayList3.get(i22);
                i22++;
                Map.Entry entry2 = (Map.Entry) obj2;
                long longValue = ((Long) entry2.getKey()).longValue();
                int intValue3 = ((Integer) entry2.getValue()).intValue();
                int i23 = 0;
                while (true) {
                    if (i23 >= g4VarArr.length) {
                        x3VarArr = x3VarArr3;
                        stargiftattributepattern = null;
                        break;
                    }
                    g4 g4Var3 = g4VarArr[i23];
                    if (g4Var3 != null) {
                        TL_stars.StarGift starGift5 = g4Var3.h;
                        if ((starGift5 != null ? starGift5 : null) != null) {
                            if (starGift5 == null) {
                                starGift5 = null;
                            }
                            TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) v7.l(starGift5.attributes, TL_stars.starGiftAttributePattern.class);
                            if (stargiftattributepattern3 != null) {
                                x3VarArr = x3VarArr3;
                                if (stargiftattributepattern3.document.id == longValue) {
                                    stargiftattributepattern = stargiftattributepattern3;
                                    break;
                                } else {
                                    i23++;
                                    x3VarArr3 = x3VarArr;
                                }
                            }
                        }
                    }
                    x3VarArr = x3VarArr3;
                    i23++;
                    x3VarArr3 = x3VarArr;
                }
                if (stargiftattributepattern != null) {
                    int i24 = i21 + 1;
                    x3 x3Var4 = x3VarArr[i21];
                    x3Var4.b(stargiftattributepattern);
                    int[] iArr5 = iArr3[Utilities.clamp(i13 - 1, iArr3.length - 1, 0)];
                    x3Var4.c(iArr5[Utilities.clamp(intValue3 - 1, iArr5.length - 1, 0)] / 1000.0f, true);
                    arrayList.add(x3Var4);
                    i21 = i24;
                }
                x3VarArr3 = x3VarArr;
            }
            x3[] x3VarArr4 = x3VarArr3;
            while (i21 < 4) {
                x3VarArr4[i21].setVisibility(8);
                i21++;
            }
        }
        this.s = arrayList.size() > 5;
        int i25 = 0;
        while (true) {
            int size3 = arrayList.size();
            linearLayout = this.w;
            if (i25 >= size3) {
                break;
            }
            x3 x3Var5 = (x3) arrayList.get(i25);
            if (!this.s || i25 < arrayList.size() / 2.0f) {
                linearLayout = this.v;
            }
            if (x3Var5.getParent() != linearLayout) {
                ViewParent parent = x3Var5.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                    boolean z11 = layoutTransition != null;
                    if (z11) {
                        layoutTransition.disableTransitionType(3);
                    }
                    viewGroup.removeView(x3Var5);
                    if (z11) {
                        layoutTransition.enableTransitionType(3);
                    }
                    x3Var5.animate().cancel();
                    x3Var5.clearAnimation();
                    x3Var5.setTranslationX(0.0f);
                    x3Var5.setTranslationY(0.0f);
                    x3Var5.setTranslationZ(0.0f);
                    x3Var5.setAlpha(0.0f);
                    x3Var5.setScaleX(1.0f);
                    x3Var5.setScaleY(1.0f);
                    x3Var5.setRotation(0.0f);
                    x3Var5.setRotationX(0.0f);
                    x3Var5.setRotationY(0.0f);
                }
                linearLayout.addView(x3Var5, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, 48, 54));
            }
            x3Var5.setVisibility(0);
            i25++;
        }
        linearLayout.animate().alpha(this.s ? 1.0f : 0.0f);
        this.A.animate().alpha(this.s ? 0.0f : this.W != null ? 1.0f : 0.25f);
        boolean z12 = true;
        for (int i26 = 0; i26 < g4VarArr.length; i26++) {
            g4 g4Var4 = g4VarArr[i26];
            if (g4Var4 != null) {
                TL_stars.StarGift starGift6 = g4Var4.h;
                if (starGift6 == null) {
                    starGift6 = null;
                }
                if (starGift6 != null) {
                    if (z12) {
                        int i27 = i26 + 1;
                        while (true) {
                            if (i27 >= g4VarArr.length) {
                                break;
                            }
                            g4 g4Var5 = g4VarArr[i27];
                            if (g4Var5 != null) {
                                starGift = g4Var5.h;
                                if ((starGift != null ? starGift : null) != null) {
                                }
                            }
                            i27++;
                        }
                        starGift = null;
                        g4 g4Var6 = g4VarArr[i26];
                        boolean z13 = (starGift == null || TextUtils.isEmpty(starGift.gift_address)) ? false : true;
                        ImageView imageView = g4Var6.f;
                        imageView.setScaleX(0.8f);
                        imageView.setScaleY(0.8f);
                        g4Var6.n = z13;
                        imageView.setImageResource(z13 ? R.drawable.mini_replace2 : R.drawable.msg_close);
                    } else {
                        ImageView imageView2 = g4Var4.f;
                        imageView2.setScaleX(0.8f);
                        imageView2.setScaleY(0.8f);
                        g4Var4.n = false;
                        imageView2.setImageResource(R.drawable.msg_close);
                    }
                    z12 = false;
                }
            }
        }
    }

    public TL_stars.StarGift getFirstGift() {
        int i9 = 0;
        while (true) {
            g4[] g4VarArr = this.n;
            if (i9 >= g4VarArr.length) {
                return null;
            }
            g4 g4Var = g4VarArr[i9];
            if (g4Var != null) {
                TL_stars.StarGift starGift = g4Var.h;
                if ((starGift != null ? starGift : null) != null) {
                    if (starGift != null) {
                        return starGift;
                    }
                    return null;
                }
            }
            i9++;
        }
    }

    public int getGiftsSelectedCount() {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            g4[] g4VarArr = this.n;
            if (i9 >= g4VarArr.length) {
                return i10;
            }
            g4 g4Var = g4VarArr[i9];
            if (g4Var != null) {
                TL_stars.StarGift starGift = g4Var.h;
                if (starGift == null) {
                    starGift = null;
                }
                if (starGift != null) {
                    i10++;
                }
            }
            i9++;
        }
    }

    public int getGiftsSuccessChance() {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            g4[] g4VarArr = this.n;
            if (i9 >= g4VarArr.length) {
                return i10;
            }
            g4 g4Var = g4VarArr[i9];
            if (g4Var != null) {
                TL_stars.StarGift starGift = g4Var.h;
                if ((starGift != null ? starGift : null) != null) {
                    if (starGift == null) {
                        starGift = null;
                    }
                    i10 += starGift.craft_chance_permille;
                }
            }
            i9++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), i10);
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
