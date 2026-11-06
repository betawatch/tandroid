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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class a31 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final int a;
    public final long b;
    public final org.telegram.ui.an c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.ui.Cells.w3 e;
    public final Drawable f;
    public final SpannableString h;
    public final ImageView n;
    public final boolean[] r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a31(Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.an anVar) {
        super(context);
        final int currentAccount = anVar.getCurrentAccount();
        final long a10 = anVar.a();
        boolean z9 = true;
        this.r = new boolean[1];
        this.a = currentAccount;
        this.b = a10;
        this.c = anVar;
        this.d = f6Var;
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, z9, z9, false, 2);
        this.e = w3Var;
        w3Var.b(0.3f, 450L, xq.h);
        w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        w3Var.setTypeface(org.telegram.messenger.g0.o());
        w3Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        w3Var.setGravity(1);
        w3Var.setIgnoreRTL(!org.telegram.messenger.hd.a0);
        w3Var.n = false;
        final org.telegram.ui.bk bkVar = (org.telegram.ui.bk) this;
        w3Var.setOnClickListener(new la0(bkVar, 20));
        addView(w3Var, c8.ha.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_translate).mutate();
        this.f = mutate;
        mutate.setBounds(0, org.telegram.messenger.g0.L(-6.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(14.0f));
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        spannableString.setSpan(new ImageSpan(mutate, 0), 0, 1, 33);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.x21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7;
                int i10 = currentAccount;
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-a10));
                boolean q10 = org.telegram.messenger.p10.i(i10).q();
                org.telegram.ui.bk bkVar2 = org.telegram.ui.bk.this;
                if (!q10 && (M0 == null || !M0.autotranslation)) {
                    org.telegram.ui.an anVar2 = bkVar2.D;
                    i7 = ((org.telegram.ui.ActionBar.f2) anVar2).currentAccount;
                    org.telegram.messenger.qp.s1(i7).d7.edit().putInt("dialog_show_translate_count" + anVar2.a(), org.telegram.messenger.qs.W1).commit();
                    anVar2.vd(true);
                    return;
                }
                int i11 = bkVar2.a;
                org.telegram.messenger.f10 f10Var = org.telegram.messenger.qp.s1(i11).s7;
                Context context2 = bkVar2.getContext();
                org.telegram.ui.ActionBar.f6 f6Var2 = bkVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, context2, f6Var2);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, f6Var2);
                LinearLayout linearLayout = new LinearLayout(bkVar2.getContext());
                linearLayout.setOrientation(1);
                z21 z21Var = new z21(bkVar2.getContext());
                z21Var.b = new w5(z21Var, 350L, xq.h);
                LinearLayout linearLayout2 = new LinearLayout(bkVar2.getContext());
                z21Var.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, bkVar2.getContext(), bkVar2.d, true, false);
                z0Var.j(org.telegram.messenger.hd.M0(2131743954, null), R.drawable.msg_translate, null);
                long j3 = bkVar2.b;
                z0Var.setSubtext(k21.K0(k21.O0(f10Var.m(j3), null, null)));
                z0Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(0, bkVar2.getContext(), bkVar2.d, true, false);
                z0Var2.j(org.telegram.messenger.hd.M0(2131753756, null), R.drawable.ic_ab_back, null);
                z0Var2.setOnClickListener(new la0(actionBarPopupWindow$ActionBarPopupWindowLayout, 21));
                linearLayout.addView(z0Var2);
                linearLayout.addView(z21Var, c8.ha.o(-1, 420));
                String str = (String) f10Var.e.get(Long.valueOf(j3));
                k21.O0(str, null, null);
                boolean[] zArr = bkVar2.r;
                String O0 = k21.O0(str, zArr, null);
                String m10 = f10Var.m(j3);
                ArrayList o4 = org.telegram.messenger.f10.o(m10);
                ArrayList n10 = org.telegram.messenger.f10.n();
                linearLayout2.addView(new org.telegram.ui.ActionBar.d1(bkVar2.getContext(), f6Var2), c8.ha.o(-1, 8));
                z0Var.setOnClickListener(new bi.la(new y21(bkVar2, new boolean[1], m10, linearLayout2, o4, str, f10Var, g1Var, n10), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 13));
                if (org.telegram.messenger.p10.i(i11).q() && O0 != null) {
                    org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(0, bkVar2.getContext(), bkVar2.d, false, false);
                    String a02 = zArr[0] ? org.telegram.messenger.hd.a0(null, null, 2131751358, O0) : org.telegram.messenger.hd.a0(null, null, 2131751357, O0);
                    z0Var3.setMultiline(false);
                    z0Var3.j(fi.m3.b(a02, z0Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    z0Var3.setOnClickListener(new di.d0(bkVar2, str, f10Var, O0, g1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var3);
                }
                org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(0, bkVar2.getContext(), bkVar2.d, false, false);
                z0Var4.j(org.telegram.messenger.hd.M0(2131749324, null), R.drawable.msg_cancel, null);
                z0Var4.setOnClickListener(new td0(bkVar2, f10Var, g1Var, 2));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.d1(bkVar2.getContext(), f6Var2), c8.ha.o(-1, 8));
                w70 w70Var = new w70(bkVar2.getContext(), null);
                w70Var.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f));
                w70Var.setDisablePaddingsOffsetY(true);
                int i12 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.V(w70Var, i12, f6Var2);
                org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var2);
                w70Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(i12, f6Var2));
                CharSequence concat = TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131752026, null)), " ", org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131752025, null), new v80(26, bkVar2, g1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new r5(5197252827247841976L, w70Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                w70Var.setText(fi.m3.b(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(concat, spannableStringBuilder2, "🥚 "), spannableStringBuilder, "🥚"), w70Var.getPaint()));
                int i13 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i13, f6Var2), 0, 12);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
                w70Var.setBackground(a03);
                org.telegram.ui.ActionBar.r6.k(w70Var, a03, null, N, f6Var2);
                w70Var.setOnClickListener(new lk(28, bkVar2, g1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(w70Var);
                g1Var.e = true;
                g1Var.c = org.telegram.messenger.qs.x3;
                g1Var.setOutsideTouchable(true);
                g1Var.setClippingEnabled(true);
                g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                g1Var.setFocusable(true);
                g1Var.setInputMethodMode(2);
                g1Var.setSoftInputMode(0);
                ImageView imageView2 = bkVar2.n;
                g1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
            }
        });
        addView(imageView, c8.ha.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        l10.v0 = false;
        l10.u0 = false;
        org.telegram.ui.ActionBar.v2[] v2VarArr = new org.telegram.ui.ActionBar.v2[1];
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(1);
        gradientDrawable.setColors(new int[]{-15982491, -16379606});
        gradientDrawable.setGradientRadius(org.telegram.messenger.g0.L(150.0f));
        float L = org.telegram.messenger.g0.L(12.0f);
        gradientDrawable.setCornerRadii(new float[]{L, L, L, L, 0.0f, 0.0f, 0.0f, 0.0f});
        frameLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, c8.ha.t(org.telegram.messenger.qs.Q1, org.telegram.messenger.qs.Q1, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, c8.ha.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131752024, null));
        u31[] u31VarArr = (u31[]) X2.getSpans(0, X2.length(), u31.class);
        for (int i7 = 0; i7 < u31VarArr.length; i7++) {
            X2.setSpan(new ForegroundColorSpan(-1), X2.getSpanStart(u31VarArr[i7]), X2.getSpanEnd(u31VarArr[i7]), X2.getSpanFlags(u31VarArr[i7]));
        }
        textView.setText(X2);
        linearLayout.addView(textView, c8.ha.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        f10.addView(frameLayout, c8.ha.c(-2.0f, -1));
        f10.addView(new di.a4(context, R.drawable.menu_privacy, org.telegram.messenger.hd.M0(2131752034, null), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752036, null), new bi.xa(v2VarArr, context, 1)), f6Var), c8.ha.t(-1, -2, 49, 32, 16, 32, 16));
        f10.addView(new di.a4(context, R.drawable.msg_stats, org.telegram.messenger.hd.M0(2131752032, null), org.telegram.messenger.hd.M0(2131752033, null), f6Var), c8.ha.t(-1, -2, 49, 32, 0, 32, 16));
        f10.addView(new di.a4(context, R.drawable.menu_gift, org.telegram.messenger.hd.M0(2131752029, null), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752031, null), new bi.xa(v2VarArr, context, 2)), f6Var), c8.ha.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, f6Var);
        f10.addView(view, c8.ha.n(1.0f / org.telegram.messenger.g0.p, -1, 7, 24, 0, 24, 0));
        w70 w70Var = new w70(context, null);
        w70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.y6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        w70Var.setGravity(17);
        w70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131752028, null), new bi.xa(v2VarArr, context, 3)));
        w70Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        w70Var.setDisablePaddingsOffsetY(true);
        f10.addView(w70Var, c8.ha.t(-1, -2, 7, 32, 0, 32, 0));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        h.setText(bi.k7.g2(org.telegram.messenger.hd.M0(2131743889, null)));
        h.setOnClickListener(new i2(v2VarArr, 3));
        f10.addView(h, c8.ha.t(-1, 48, 7, 16, 0, 16, 16));
        l10.N = f10;
        v2VarArr[0] = l10;
        l10.N();
        v2VarArr[0].show();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Re));
    }

    public final void b() {
        int i7 = this.a;
        org.telegram.messenger.f10 f10Var = org.telegram.messenger.qp.s1(i7).s7;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        long j3 = this.b;
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j3));
        boolean B = f10Var.B(j3);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.w3 w3Var = this.e;
        if (B) {
            String O0 = k21.O0((String) f10Var.e.get(Long.valueOf(j3)), null, null);
            if (TextUtils.isEmpty(O0)) {
                w3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.hd.M0(2131745335, null)));
            } else {
                w3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.hd.a0(null, null, 2131745334, O0)));
            }
        } else {
            String m10 = f10Var.m(j3);
            if (m10 == null) {
                m10 = "en";
            }
            boolean[] zArr = this.r;
            String O02 = k21.O0(m10, zArr, null);
            w3Var.setText(TextUtils.concat(spannableString, " ", zArr[0] ? org.telegram.messenger.hd.a0(null, null, 2131743953, O02) : org.telegram.messenger.hd.a0(null, null, 2131743952, O02)));
        }
        this.n.setImageResource((org.telegram.messenger.p10.i(i7).q() || (M0 != null && M0.autotranslation)) ? R.drawable.msg_mini_customize : R.drawable.msg_close);
    }

    public void setLeftMargin(float f10) {
        this.e.setTranslationX(f10 / 2.0f);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.Ve;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Re;
        int w04 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
        if (this.y && w02 == this.s && w03 == this.w && w04 == this.x) {
            return;
        }
        this.y = true;
        this.s = w02;
        this.w = w03;
        this.x = w04;
        int w05 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        org.telegram.ui.Cells.w3 w3Var = this.e;
        w3Var.setTextColor(w05);
        int w06 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var) & 436207615;
        float L = org.telegram.messenger.g0.L(15.0f);
        int L2 = org.telegram.messenger.g0.L(3.0f);
        w3Var.setBackground(org.telegram.ui.ActionBar.k6.Y(L, w06, L2, L2, L2, L2));
        org.telegram.ui.Cells.y O = org.telegram.ui.ActionBar.k6.O(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), 0, 0);
        ImageView imageView = this.n;
        imageView.setBackground(O);
        int w07 = org.telegram.ui.ActionBar.k6.w0(i11, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w07, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), mode));
    }
}
