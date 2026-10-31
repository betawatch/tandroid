package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class d41 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final int a;
    public final long b;
    public final org.telegram.ui.un c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final org.telegram.ui.Cells.y3 e;
    public final Drawable f;
    public final SpannableString h;
    public final ImageView n;
    public final boolean[] r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d41(Context context, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.un unVar) {
        super(context);
        final int currentAccount = unVar.getCurrentAccount();
        final long a2 = unVar.a();
        boolean z10 = true;
        this.r = new boolean[1];
        this.a = currentAccount;
        this.b = a2;
        this.c = unVar;
        this.d = p6Var;
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(context, z10, z10, false, 2);
        this.e = y3Var;
        y3Var.b(0.3f, 450L, gr.h);
        y3Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        y3Var.setTypeface(org.telegram.messenger.i0.o());
        y3Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        y3Var.setGravity(1);
        y3Var.setIgnoreRTL(!org.telegram.messenger.cd.X);
        y3Var.n = false;
        final org.telegram.ui.xk xkVar = (org.telegram.ui.xk) this;
        y3Var.setOnClickListener(new db0(xkVar, 21));
        addView(y3Var, w7.b6.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f = mutate;
        mutate.setBounds(0, org.telegram.messenger.i0.L(-6.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.a41
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10;
                int i11 = currentAccount;
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-a2));
                boolean q6 = org.telegram.messenger.d20.i(i11).q();
                org.telegram.ui.xk xkVar2 = org.telegram.ui.xk.this;
                if (!q6 && (L0 == null || !L0.autotranslation)) {
                    org.telegram.ui.un unVar2 = xkVar2.D;
                    i10 = ((org.telegram.ui.ActionBar.k2) unVar2).currentAccount;
                    org.telegram.messenger.vp.r1(i10).e7.edit().putInt("dialog_show_translate_count" + unVar2.a(), org.telegram.messenger.zs.W1).commit();
                    unVar2.ld(true);
                    return;
                }
                int i12 = xkVar2.a;
                org.telegram.messenger.t10 t10Var = org.telegram.messenger.vp.r1(i12).t7;
                Context context2 = xkVar2.getContext();
                org.telegram.ui.ActionBar.p6 p6Var2 = xkVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, context2, p6Var2);
                org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, p6Var2);
                LinearLayout linearLayout = new LinearLayout(xkVar2.getContext());
                linearLayout.setOrientation(1);
                c41 c41Var = new c41(xkVar2.getContext());
                c41Var.b = new t5(c41Var, 350L, gr.h);
                LinearLayout linearLayout2 = new LinearLayout(xkVar2.getContext());
                c41Var.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, xkVar2.getContext(), xkVar2.d, true, false);
                b1Var.j(org.telegram.messenger.cd.L0(2131743978, null), R.drawable.msg_translate, null);
                long j10 = xkVar2.b;
                b1Var.setSubtext(m31.K0(m31.O0(t10Var.m(j10), null, null)));
                b1Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
                org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(0, xkVar2.getContext(), xkVar2.d, true, false);
                b1Var2.j(org.telegram.messenger.cd.L0(2131753756, null), R.drawable.ic_ab_back, null);
                b1Var2.setOnClickListener(new db0(actionBarPopupWindow$ActionBarPopupWindowLayout, 22));
                linearLayout.addView(b1Var2);
                linearLayout.addView(c41Var, w7.b6.o(-1, 420));
                String str = (String) t10Var.e.get(Long.valueOf(j10));
                m31.O0(str, null, null);
                boolean[] zArr = xkVar2.r;
                String O0 = m31.O0(str, zArr, null);
                String m10 = t10Var.m(j10);
                ArrayList o10 = org.telegram.messenger.t10.o(m10);
                ArrayList n10 = org.telegram.messenger.t10.n();
                linearLayout2.addView(new org.telegram.ui.ActionBar.h1(xkVar2.getContext(), p6Var2), w7.b6.o(-1, 8));
                b1Var.setOnClickListener(new jg.w1(new b41(xkVar2, new boolean[1], m10, linearLayout2, o10, str, t10Var, k1Var, n10), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 13));
                if (org.telegram.messenger.d20.i(i12).q() && O0 != null) {
                    org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(0, xkVar2.getContext(), xkVar2.d, false, false);
                    String a02 = zArr[0] ? org.telegram.messenger.cd.a0(null, null, 2131751358, O0) : org.telegram.messenger.cd.a0(null, null, 2131751357, O0);
                    b1Var3.setMultiline(false);
                    b1Var3.j(vh.p2.b(a02, b1Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    b1Var3.setOnClickListener(new bi.c(xkVar2, str, t10Var, O0, k1Var, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var3);
                }
                org.telegram.ui.ActionBar.b1 b1Var4 = new org.telegram.ui.ActionBar.b1(0, xkVar2.getContext(), xkVar2.d, false, false);
                b1Var4.j(org.telegram.messenger.cd.L0(2131749334, null), R.drawable.msg_cancel, null);
                b1Var4.setOnClickListener(new ag.i(xkVar2, t10Var, k1Var, 22));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.h1(xkVar2.getContext(), p6Var2), w7.b6.o(-1, 8));
                p80 p80Var = new p80(xkVar2.getContext(), null);
                p80Var.setPadding(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.33f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.33f));
                p80Var.setDisablePaddingsOffsetY(true);
                int i13 = org.telegram.ui.ActionBar.t6.j5;
                org.telegram.ui.ActionBar.a7.V(p80Var, i13, p6Var2);
                org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var2);
                p80Var.setEmojiColor(org.telegram.ui.ActionBar.t6.w0(i13, p6Var2));
                CharSequence concat = TextUtils.concat(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131752026, null)), " ", org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(2131752025, null), new gi0(19, xkVar2, k1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new o5(5197252827247841976L, p80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                p80Var.setText(vh.p2.b(org.telegram.messenger.i0.J2(org.telegram.messenger.i0.J2(concat, spannableStringBuilder2, "🥚 "), spannableStringBuilder, "🥚"), p80Var.getPaint()));
                int i14 = org.telegram.ui.ActionBar.t6.i6;
                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i14, p6Var2), 0, 12);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
                p80Var.setBackground(a03);
                org.telegram.ui.ActionBar.a7.k(p80Var, a03, null, N, p6Var2);
                p80Var.setOnClickListener(new sr(21, xkVar2, k1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(p80Var);
                k1Var.e = true;
                k1Var.c = org.telegram.messenger.zs.x3;
                k1Var.setOutsideTouchable(true);
                k1Var.setClippingEnabled(true);
                k1Var.setAnimationStyle(R.style.PopupContextAnimation);
                k1Var.setFocusable(true);
                k1Var.setInputMethodMode(2);
                k1Var.setSoftInputMode(0);
                ImageView imageView2 = xkVar2.n;
                k1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - org.telegram.messenger.i0.L(8.0f));
            }
        });
        addView(imageView, w7.b6.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
        k10.v0 = false;
        k10.u0 = false;
        org.telegram.ui.ActionBar.z2[] z2VarArr = new org.telegram.ui.ActionBar.z2[1];
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(1);
        gradientDrawable.setColors(new int[]{-15982491, -16379606});
        gradientDrawable.setGradientRadius(org.telegram.messenger.i0.L(150.0f));
        float L = org.telegram.messenger.i0.L(12.0f);
        gradientDrawable.setCornerRadii(new float[]{L, L, L, L, 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, w7.b6.t(org.telegram.messenger.zs.Q1, org.telegram.messenger.zs.Q1, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, w7.b6.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131752024, null));
        x41[] x41VarArr = (x41[]) W2.getSpans(0, W2.length(), x41.class);
        for (int i10 = 0; i10 < x41VarArr.length; i10++) {
            W2.setSpan(new ForegroundColorSpan(-1), W2.getSpanStart(x41VarArr[i10]), W2.getSpanEnd(x41VarArr[i10]), W2.getSpanFlags(x41VarArr[i10]));
        }
        textView.setText(W2);
        linearLayout.addView(textView, w7.b6.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        f7.addView(frameLayout, w7.b6.c(-2.0f, -1));
        f7.addView(new org.telegram.ui.Cells.a5(context, R.drawable.menu_privacy, org.telegram.messenger.cd.L0(2131752034, null), org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752036, null), new y31(z2VarArr, context, 0)), p6Var), w7.b6.t(-1, -2, 49, 32, 16, 32, 16));
        f7.addView(new org.telegram.ui.Cells.a5(context, R.drawable.msg_stats, org.telegram.messenger.cd.L0(2131752032, null), org.telegram.messenger.cd.L0(2131752033, null), p6Var), w7.b6.t(-1, -2, 49, 32, 0, 32, 16));
        f7.addView(new org.telegram.ui.Cells.a5(context, R.drawable.menu_gift, org.telegram.messenger.cd.L0(2131752029, null), org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752031, null), new y31(z2VarArr, context, 1)), p6Var), w7.b6.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view, p6Var);
        f7.addView(view, w7.b6.n(1.0f / org.telegram.messenger.i0.p, -1, 7, 24, 0, 24, 0));
        p80 p80Var = new p80(context, null);
        p80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.y6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        p80Var.setGravity(17);
        p80Var.setText(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131752028, null), new y31(z2VarArr, context, 2)));
        p80Var.setPadding(0, org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f));
        p80Var.setDisablePaddingsOffsetY(true);
        f7.addView(p80Var, w7.b6.t(-1, -2, 7, 32, 0, 32, 0));
        vh.d i11 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        i11.setText(rh.e4.g2(org.telegram.messenger.cd.L0(2131743913, null)));
        i11.setOnClickListener(new j2(z2VarArr, 3));
        f7.addView(i11, w7.b6.t(-1, 48, 7, 16, 0, 16, 16));
        k10.N = f7;
        z2VarArr[0] = k10;
        k10.O();
        z2VarArr[0].show();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Re));
    }

    public final void b() {
        int i10 = this.a;
        org.telegram.messenger.t10 t10Var = org.telegram.messenger.vp.r1(i10).t7;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
        long j10 = this.b;
        TLRPC.Chat L0 = r12.L0(Long.valueOf(-j10));
        boolean B = t10Var.B(j10);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.y3 y3Var = this.e;
        if (B) {
            String O0 = m31.O0((String) t10Var.e.get(Long.valueOf(j10)), null, null);
            if (TextUtils.isEmpty(O0)) {
                y3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.cd.L0(2131745352, null)));
            } else {
                y3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.cd.a0(null, null, 2131745351, O0)));
            }
        } else {
            String m10 = t10Var.m(j10);
            if (m10 == null) {
                m10 = "en";
            }
            boolean[] zArr = this.r;
            String O02 = m31.O0(m10, zArr, null);
            y3Var.setText(TextUtils.concat(spannableString, " ", zArr[0] ? org.telegram.messenger.cd.a0(null, null, 2131743977, O02) : org.telegram.messenger.cd.a0(null, null, 2131743976, O02)));
        }
        this.n.setImageResource((org.telegram.messenger.d20.i(i10).q() || (L0 != null && L0.autotranslation)) ? R.drawable.msg_mini_customize : R.drawable.msg_close);
    }

    public void setLeftMargin(float f7) {
        this.e.setTranslationX(f7 / 2.0f);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.Ve;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        int i11 = org.telegram.ui.ActionBar.t6.i6;
        int w03 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        int i12 = org.telegram.ui.ActionBar.t6.Re;
        int w04 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
        if (this.y && w02 == this.s && w03 == this.w && w04 == this.x) {
            return;
        }
        this.y = true;
        this.s = w02;
        this.w = w03;
        this.x = w04;
        int w05 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        org.telegram.ui.Cells.y3 y3Var = this.e;
        y3Var.setTextColor(w05);
        int w06 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var) & 436207615;
        float L = org.telegram.messenger.i0.L(15.0f);
        int L2 = org.telegram.messenger.i0.L(3.0f);
        y3Var.setBackground(org.telegram.ui.ActionBar.t6.Y(L, w06, L2, L2, L2, L2));
        org.telegram.ui.Cells.y O = org.telegram.ui.ActionBar.t6.O(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 0, 0);
        ImageView imageView = this.n;
        imageView.setBackground(O);
        int w07 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w07, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), mode));
    }
}
