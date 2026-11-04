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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class v21 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final int a;
    public final long b;
    public final org.telegram.ui.wm c;
    public final org.telegram.ui.ActionBar.e6 d;
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
    public v21(Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.wm wmVar) {
        super(context);
        final int currentAccount = wmVar.getCurrentAccount();
        final long a10 = wmVar.a();
        boolean z10 = true;
        this.r = new boolean[1];
        this.a = currentAccount;
        this.b = a10;
        this.c = wmVar;
        this.d = e6Var;
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, z10, z10, false, 2);
        this.e = w3Var;
        w3Var.b(0.3f, 450L, xq.h);
        w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        w3Var.setTypeface(org.telegram.messenger.g0.o());
        w3Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        w3Var.setGravity(1);
        w3Var.setIgnoreRTL(!org.telegram.messenger.bd.a0);
        w3Var.n = false;
        final org.telegram.ui.xj xjVar = (org.telegram.ui.xj) this;
        w3Var.setOnClickListener(new ga0(xjVar, 21));
        addView(w3Var, b8.mf.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
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
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.s21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3;
                int i10 = currentAccount;
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-a10));
                boolean q10 = org.telegram.messenger.h10.i(i10).q();
                org.telegram.ui.xj xjVar2 = org.telegram.ui.xj.this;
                if (!q10 && (M0 == null || !M0.autotranslation)) {
                    org.telegram.ui.wm wmVar2 = xjVar2.E;
                    i3 = ((org.telegram.ui.ActionBar.d2) wmVar2).currentAccount;
                    org.telegram.messenger.hp.s1(i3).d7.edit().putInt("dialog_show_translate_count" + wmVar2.a(), org.telegram.messenger.hs.W1).commit();
                    wmVar2.vd(true);
                    return;
                }
                int i11 = xjVar2.a;
                org.telegram.messenger.x00 x00Var = org.telegram.messenger.hp.s1(i11).s7;
                Context context2 = xjVar2.getContext();
                org.telegram.ui.ActionBar.e6 e6Var2 = xjVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, context2, e6Var2);
                org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, e6Var2);
                LinearLayout linearLayout = new LinearLayout(xjVar2.getContext());
                linearLayout.setOrientation(1);
                u21 u21Var = new u21(xjVar2.getContext());
                u21Var.b = new u5(u21Var, 350L, xq.h);
                LinearLayout linearLayout2 = new LinearLayout(xjVar2.getContext());
                u21Var.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, xjVar2.getContext(), xjVar2.d, true, false);
                y0Var.j(org.telegram.messenger.bd.M0(2131743963, null), R.drawable.msg_translate, null);
                long j10 = xjVar2.b;
                y0Var.setSubtext(f21.K0(f21.O0(x00Var.m(j10), null, null)));
                y0Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(0, xjVar2.getContext(), xjVar2.d, true, false);
                y0Var2.j(org.telegram.messenger.bd.M0(2131753756, null), R.drawable.ic_ab_back, null);
                y0Var2.setOnClickListener(new ga0(actionBarPopupWindow$ActionBarPopupWindowLayout, 22));
                linearLayout.addView(y0Var2);
                linearLayout.addView(u21Var, b8.mf.o(-1, 420));
                String str = (String) x00Var.e.get(Long.valueOf(j10));
                f21.O0(str, null, null);
                boolean[] zArr = xjVar2.r;
                String O0 = f21.O0(str, zArr, null);
                String m10 = x00Var.m(j10);
                ArrayList o10 = org.telegram.messenger.x00.o(m10);
                ArrayList n4 = org.telegram.messenger.x00.n();
                linearLayout2.addView(new org.telegram.ui.ActionBar.c1(xjVar2.getContext(), e6Var2), b8.mf.o(-1, 8));
                y0Var.setOnClickListener(new ai.h3(new t21(xjVar2, new boolean[1], m10, linearLayout2, o10, str, x00Var, f1Var, n4), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 15));
                if (org.telegram.messenger.h10.i(i11).q() && O0 != null) {
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, xjVar2.getContext(), xjVar2.d, false, false);
                    String a02 = zArr[0] ? org.telegram.messenger.bd.a0(null, null, 2131751358, O0) : org.telegram.messenger.bd.a0(null, null, 2131751357, O0);
                    y0Var3.setMultiline(false);
                    y0Var3.j(gi.l3.b(a02, y0Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    y0Var3.setOnClickListener(new ei.f0(xjVar2, str, x00Var, O0, f1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var3);
                }
                org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(0, xjVar2.getContext(), xjVar2.d, false, false);
                y0Var4.j(org.telegram.messenger.bd.M0(2131749333, null), R.drawable.msg_cancel, null);
                y0Var4.setOnClickListener(new ct(xjVar2, x00Var, f1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.c1(xjVar2.getContext(), e6Var2), b8.mf.o(-1, 8));
                s70 s70Var = new s70(xjVar2.getContext(), null);
                s70Var.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f));
                s70Var.setDisablePaddingsOffsetY(true);
                int i12 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.V(s70Var, i12, e6Var2);
                org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var2);
                s70Var.setEmojiColor(org.telegram.ui.ActionBar.k6.w0(i12, e6Var2));
                CharSequence concat = TextUtils.concat(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131752026, null)), " ", org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(2131752025, null), new p11(1, xjVar2, f1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new p5(5197252827247841976L, s70Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                s70Var.setText(gi.l3.b(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(concat, spannableStringBuilder2, "🥚 "), spannableStringBuilder, "🥚"), s70Var.getPaint()));
                int i13 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i13, e6Var2), 0, 12);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
                s70Var.setBackground(a03);
                org.telegram.ui.ActionBar.r6.k(s70Var, a03, null, N, e6Var2);
                s70Var.setOnClickListener(new ux0(4, (Object) xjVar2, (Object) f1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(s70Var);
                f1Var.e = true;
                f1Var.c = org.telegram.messenger.hs.x3;
                f1Var.setOutsideTouchable(true);
                f1Var.setClippingEnabled(true);
                f1Var.setAnimationStyle(R.style.PopupContextAnimation);
                f1Var.setFocusable(true);
                f1Var.setInputMethodMode(2);
                f1Var.setSoftInputMode(0);
                ImageView imageView2 = xjVar2.n;
                f1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
            }
        });
        addView(imageView, b8.mf.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
        l10.w0 = false;
        l10.v0 = false;
        org.telegram.ui.ActionBar.t2[] t2VarArr = new org.telegram.ui.ActionBar.t2[1];
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
        frameLayout.addView(linearLayout, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, b8.mf.t(org.telegram.messenger.hs.Q1, org.telegram.messenger.hs.Q1, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, b8.mf.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131752024, null));
        o31[] o31VarArr = (o31[]) X2.getSpans(0, X2.length(), o31.class);
        for (int i3 = 0; i3 < o31VarArr.length; i3++) {
            X2.setSpan(new ForegroundColorSpan(-1), X2.getSpanStart(o31VarArr[i3]), X2.getSpanEnd(o31VarArr[i3]), X2.getSpanFlags(o31VarArr[i3]));
        }
        textView.setText(X2);
        linearLayout.addView(textView, b8.mf.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        f10.addView(frameLayout, b8.mf.c(-2.0f, -1));
        f10.addView(new ai.d2(context, R.drawable.menu_privacy, org.telegram.messenger.bd.M0(2131752034, null), org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752036, null), new ci.v9(t2VarArr, context, 1)), e6Var), b8.mf.t(-1, -2, 49, 32, 16, 32, 16));
        f10.addView(new ai.d2(context, R.drawable.msg_stats, org.telegram.messenger.bd.M0(2131752032, null), org.telegram.messenger.bd.M0(2131752033, null), e6Var), b8.mf.t(-1, -2, 49, 32, 0, 32, 16));
        f10.addView(new ai.d2(context, R.drawable.menu_gift, org.telegram.messenger.bd.M0(2131752029, null), org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752031, null), new ci.v9(t2VarArr, context, 2)), e6Var), b8.mf.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, e6Var);
        f10.addView(view, b8.mf.n(1.0f / org.telegram.messenger.g0.p, -1, 7, 24, 0, 24, 0));
        s70 s70Var = new s70(context, null);
        s70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.y6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        s70Var.setGravity(17);
        s70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131752028, null), new ci.v9(t2VarArr, context, 3)));
        s70Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        s70Var.setDisablePaddingsOffsetY(true);
        f10.addView(s70Var, b8.mf.t(-1, -2, 7, 32, 0, 32, 0));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        h.setText(ci.l6.g2(org.telegram.messenger.bd.M0(2131743898, null)));
        h.setOnClickListener(new g2(t2VarArr, 3));
        f10.addView(h, b8.mf.t(-1, 48, 7, 16, 0, 16, 16));
        l10.O = f10;
        t2VarArr[0] = l10;
        l10.N();
        t2VarArr[0].show();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Re));
    }

    public final void b() {
        int i3 = this.a;
        org.telegram.messenger.x00 x00Var = org.telegram.messenger.hp.s1(i3).s7;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
        long j10 = this.b;
        TLRPC.Chat M0 = s12.M0(Long.valueOf(-j10));
        boolean B = x00Var.B(j10);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.w3 w3Var = this.e;
        if (B) {
            String O0 = f21.O0((String) x00Var.e.get(Long.valueOf(j10)), null, null);
            if (TextUtils.isEmpty(O0)) {
                w3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.bd.M0(2131745344, null)));
            } else {
                w3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.bd.a0(null, null, 2131745343, O0)));
            }
        } else {
            String m10 = x00Var.m(j10);
            if (m10 == null) {
                m10 = "en";
            }
            boolean[] zArr = this.r;
            String O02 = f21.O0(m10, zArr, null);
            w3Var.setText(TextUtils.concat(spannableString, " ", zArr[0] ? org.telegram.messenger.bd.a0(null, null, 2131743962, O02) : org.telegram.messenger.bd.a0(null, null, 2131743961, O02)));
        }
        this.n.setImageResource((org.telegram.messenger.h10.i(i3).q() || (M0 != null && M0.autotranslation)) ? R.drawable.msg_mini_customize : R.drawable.msg_close);
    }

    public void setLeftMargin(float f10) {
        this.e.setTranslationX(f10 / 2.0f);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.Ve;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Re;
        int w04 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
        if (this.y && w02 == this.s && w03 == this.w && w04 == this.x) {
            return;
        }
        this.y = true;
        this.s = w02;
        this.w = w03;
        this.x = w04;
        int w05 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        org.telegram.ui.Cells.w3 w3Var = this.e;
        w3Var.setTextColor(w05);
        int w06 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var) & 436207615;
        float L = org.telegram.messenger.g0.L(15.0f);
        int L2 = org.telegram.messenger.g0.L(3.0f);
        w3Var.setBackground(org.telegram.ui.ActionBar.k6.Y(L, w06, L2, L2, L2, L2));
        org.telegram.ui.Cells.y O = org.telegram.ui.ActionBar.k6.O(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 0, 0);
        ImageView imageView = this.n;
        imageView.setBackground(O);
        int w07 = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w07, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), mode));
    }
}
