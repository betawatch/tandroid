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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class s31 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int a;
    public final long b;
    public final org.telegram.ui.bn c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.ui.Cells.x3 e;
    public final Drawable f;
    public final SpannableString h;
    public final ImageView n;
    public final boolean[] r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s31(Context context, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.bn bnVar) {
        super(context);
        final int currentAccount = bnVar.getCurrentAccount();
        final long a10 = bnVar.a();
        boolean z10 = true;
        this.r = new boolean[1];
        this.a = currentAccount;
        this.b = a10;
        this.c = bnVar;
        this.d = h6Var;
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, z10, z10, false, 2);
        this.e = x3Var;
        x3Var.b(0.3f, 450L, nr.h);
        x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        x3Var.setTypeface(org.telegram.messenger.g0.o());
        x3Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        x3Var.setGravity(1);
        x3Var.setIgnoreRTL(!org.telegram.messenger.gd.a0);
        x3Var.n = false;
        final org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this;
        x3Var.setOnClickListener(new j70(ckVar, 22));
        addView(x3Var, c8.ma.d(-1, -1.0f, 3, 0.0f, 0.0f, 34.0f, 0.0f));
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
        imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.o31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7;
                int i10 = currentAccount;
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-a10));
                boolean q10 = org.telegram.messenger.j10.i(i10).q();
                org.telegram.ui.ck ckVar2 = org.telegram.ui.ck.this;
                if (!q10 && (O0 == null || !O0.autotranslation)) {
                    org.telegram.ui.bn bnVar2 = ckVar2.E;
                    i7 = ((org.telegram.ui.ActionBar.g2) bnVar2).currentAccount;
                    org.telegram.messenger.mp.u1(i7).g7.edit().putInt("dialog_show_translate_count" + bnVar2.a(), org.telegram.messenger.ks.W1).commit();
                    bnVar2.zd(true);
                    return;
                }
                int i11 = ckVar2.a;
                org.telegram.messenger.z00 z00Var = org.telegram.messenger.mp.u1(i11).v7;
                Context context2 = ckVar2.getContext();
                org.telegram.ui.ActionBar.h6 h6Var2 = ckVar2.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, context2, h6Var2);
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, h6Var2);
                LinearLayout linearLayout = new LinearLayout(ckVar2.getContext());
                linearLayout.setOrientation(1);
                r31 r31Var = new r31(ckVar2.getContext());
                r31Var.b = new d6(r31Var, 350L, nr.h);
                LinearLayout linearLayout2 = new LinearLayout(ckVar2.getContext());
                r31Var.addView(linearLayout2);
                linearLayout2.setOrientation(1);
                actionBarPopupWindow$ActionBarPopupWindowLayout.c = true;
                int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(linearLayout);
                org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, ckVar2.getContext(), ckVar2.d, true, false);
                y0Var.j(org.telegram.messenger.gd.N0(2131743710, null), R.drawable.msg_translate, null);
                long j3 = ckVar2.b;
                y0Var.setSubtext(b31.L0(b31.P0(z00Var.m(j3), null, null)));
                y0Var.setItemHeight(56);
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(0, ckVar2.getContext(), ckVar2.d, true, false);
                y0Var2.j(org.telegram.messenger.gd.N0(2131753753, null), R.drawable.ic_ab_back, null);
                y0Var2.setOnClickListener(new j70(actionBarPopupWindow$ActionBarPopupWindowLayout, 23));
                linearLayout.addView(y0Var2);
                linearLayout.addView(r31Var, c8.ma.o(-1, 420));
                String str = (String) z00Var.e.get(Long.valueOf(j3));
                b31.P0(str, null, null);
                boolean[] zArr = ckVar2.r;
                String P0 = b31.P0(str, zArr, null);
                String m10 = z00Var.m(j3);
                ArrayList o4 = org.telegram.messenger.z00.o(m10);
                ArrayList n10 = org.telegram.messenger.z00.n();
                linearLayout2.addView(new org.telegram.ui.ActionBar.d1(ckVar2.getContext(), h6Var2), c8.ma.o(-1, 8));
                y0Var.setOnClickListener(new bi.i5(new p31(ckVar2, new boolean[1], m10, linearLayout2, o4, str, z00Var, g1Var, n10), actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 16));
                int i12 = 0;
                if (org.telegram.messenger.j10.i(i11).q() && P0 != null) {
                    org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(0, ckVar2.getContext(), ckVar2.d, false, false);
                    String a02 = zArr[0] ? org.telegram.messenger.gd.a0(null, null, 2131751345, P0) : org.telegram.messenger.gd.a0(null, null, 2131751344, P0);
                    y0Var3.setMultiline(false);
                    y0Var3.j(hi.l3.b(a02, y0Var3.getTextView().getPaint()), R.drawable.msg_block2, null);
                    y0Var3.setOnClickListener(new fi.d0(ckVar2, str, z00Var, P0, g1Var, 12));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var3);
                }
                org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(0, ckVar2.getContext(), ckVar2.d, false, false);
                y0Var4.j(org.telegram.messenger.gd.N0(2131749132, null), R.drawable.msg_cancel, null);
                y0Var4.setOnClickListener(new st(ckVar2, z00Var, g1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var4);
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(new org.telegram.ui.ActionBar.d1(ckVar2.getContext(), h6Var2), c8.ma.o(-1, 8));
                m80 m80Var = new m80(ckVar2.getContext(), null);
                m80Var.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.33f));
                m80Var.setDisablePaddingsOffsetY(true);
                int i13 = org.telegram.ui.ActionBar.m6.j5;
                org.telegram.ui.ActionBar.t6.U(m80Var, i13, h6Var2);
                org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, h6Var2);
                m80Var.setEmojiColor(org.telegram.ui.ActionBar.m6.w0(i13, h6Var2));
                CharSequence concat = TextUtils.concat(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131752014, null)), " ", org.telegram.messenger.g0.x2(org.telegram.messenger.gd.N0(2131752013, null), new fm0(18, ckVar2, g1Var)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("🥚");
                spannableStringBuilder.setSpan(new y5(5197252827247841976L, m80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                spannableStringBuilder2.append((CharSequence) " ");
                m80Var.setText(hi.l3.b(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(concat, spannableStringBuilder2, "🥚 "), spannableStringBuilder, "🥚"), m80Var.getPaint()));
                int i14 = org.telegram.ui.ActionBar.m6.i6;
                org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i14, h6Var2), 0, 12);
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
                m80Var.setBackground(a03);
                org.telegram.ui.ActionBar.t6.j(m80Var, a03, null, M, h6Var2);
                m80Var.setOnClickListener(new q31(i12, ckVar2, g1Var));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m80Var);
                g1Var.e = true;
                g1Var.c = org.telegram.messenger.ks.x3;
                g1Var.setOutsideTouchable(true);
                g1Var.setClippingEnabled(true);
                g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                g1Var.setFocusable(true);
                g1Var.setInputMethodMode(2);
                g1Var.setSoftInputMode(0);
                ImageView imageView2 = ckVar2.n;
                g1Var.showAsDropDown(imageView2, 0, (-imageView2.getMeasuredHeight()) - org.telegram.messenger.g0.L(8.0f));
            }
        });
        addView(imageView, c8.ma.d(30, 30.0f, 21, 0.0f, 0.0f, 7.0f, 0.0f));
        updateColors();
    }

    public static void a(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, h6Var, false);
        j3.w0 = false;
        j3.v0 = false;
        org.telegram.ui.ActionBar.w2[] w2VarArr = new org.telegram.ui.ActionBar.w2[1];
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
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
        frameLayout.addView(linearLayout, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.cocoon_logo);
        linearLayout.addView(imageView, c8.ma.t(org.telegram.messenger.ks.Q1, org.telegram.messenger.ks.Q1, 49, 0, 33, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.cocoon_text);
        linearLayout.addView(imageView2, c8.ma.t(-2, -2, 49, 32, 12, 32, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(-4666897);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131752012, null));
        l41[] l41VarArr = (l41[]) W2.getSpans(0, W2.length(), l41.class);
        for (int i7 = 0; i7 < l41VarArr.length; i7++) {
            W2.setSpan(new ForegroundColorSpan(-1), W2.getSpanStart(l41VarArr[i7]), W2.getSpanEnd(l41VarArr[i7]), W2.getSpanFlags(l41VarArr[i7]));
        }
        textView.setText(W2);
        linearLayout.addView(textView, c8.ma.d(-1, -2.0f, 49, 32.0f, 14.0f, 32.0f, 20.0f));
        g10.addView(frameLayout, c8.ma.c(-2.0f, -1));
        g10.addView(new bi.t2(context, R.drawable.menu_privacy, org.telegram.messenger.gd.N0(2131752022, null), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131752024, null), new di.o9(w2VarArr, context, 1)), h6Var), c8.ma.t(-1, -2, 49, 32, 16, 32, 16));
        g10.addView(new bi.t2(context, R.drawable.msg_stats, org.telegram.messenger.gd.N0(2131752020, null), org.telegram.messenger.gd.N0(2131752021, null), h6Var), c8.ma.t(-1, -2, 49, 32, 0, 32, 16));
        g10.addView(new bi.t2(context, R.drawable.menu_gift, org.telegram.messenger.gd.N0(2131752017, null), org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131752019, null), new di.o9(w2VarArr, context, 2)), h6Var), c8.ma.t(-1, -2, 49, 32, 0, 32, 16));
        View view = new View(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view, h6Var);
        g10.addView(view, c8.ma.n(1.0f / org.telegram.messenger.g0.p, -1, 7, 24, 0, 24, 0));
        m80 m80Var = new m80(context, null);
        m80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.y6, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, h6Var);
        m80Var.setGravity(17);
        m80Var.setText(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131752016, null), new di.o9(w2VarArr, context, 3)));
        m80Var.setPadding(0, org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f));
        m80Var.setDisablePaddingsOffsetY(true);
        g10.addView(m80Var, c8.ma.t(-1, -2, 7, 32, 0, 32, 0));
        hi.e g11 = org.telegram.messenger.n10.g(24, context, h6Var, true);
        g11.setText(di.f6.t2(org.telegram.messenger.gd.N0(2131743645, null)));
        g11.setOnClickListener(new r2(w2VarArr, 2));
        g10.addView(g11, c8.ma.t(-1, 48, 7, 16, 0, 16, 16));
        j3.O = g10;
        w2VarArr[0] = j3;
        j3.O();
        w2VarArr[0].show();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ue));
    }

    public final void b() {
        int i7 = this.a;
        org.telegram.messenger.z00 z00Var = org.telegram.messenger.mp.u1(i7).v7;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
        long j3 = this.b;
        TLRPC.Chat O0 = u12.O0(Long.valueOf(-j3));
        boolean B = z00Var.B(j3);
        SpannableString spannableString = this.h;
        org.telegram.ui.Cells.x3 x3Var = this.e;
        if (B) {
            String P0 = b31.P0((String) z00Var.e.get(Long.valueOf(j3)), null, null);
            if (TextUtils.isEmpty(P0)) {
                x3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.gd.N0(2131745138, null)));
            } else {
                x3Var.setText(TextUtils.concat(spannableString, " ", org.telegram.messenger.gd.a0(null, null, 2131745137, P0)));
            }
        } else {
            String m10 = z00Var.m(j3);
            if (m10 == null) {
                m10 = "en";
            }
            boolean[] zArr = this.r;
            String P02 = b31.P0(m10, zArr, null);
            x3Var.setText(TextUtils.concat(spannableString, " ", zArr[0] ? org.telegram.messenger.gd.a0(null, null, 2131743709, P02) : org.telegram.messenger.gd.a0(null, null, 2131743708, P02)));
        }
        this.n.setImageResource((org.telegram.messenger.j10.i(i7).q() || (O0 != null && O0.autotranslation)) ? R.drawable.msg_mini_customize : R.drawable.msg_close);
    }

    public void setLeftMargin(float f10) {
        this.e.setTranslationX(f10 / 2.0f);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.Ye;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        int i10 = org.telegram.ui.ActionBar.m6.i6;
        int w03 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        int i11 = org.telegram.ui.ActionBar.m6.Ue;
        int w04 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
        if (this.y && w02 == this.s && w03 == this.w && w04 == this.x) {
            return;
        }
        this.y = true;
        this.s = w02;
        this.w = w03;
        this.x = w04;
        int w05 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        org.telegram.ui.Cells.x3 x3Var = this.e;
        x3Var.setTextColor(w05);
        int w06 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var) & 436207615;
        float L = org.telegram.messenger.g0.L(15.0f);
        int L2 = org.telegram.messenger.g0.L(3.0f);
        x3Var.setBackground(org.telegram.ui.ActionBar.m6.Y(L, w06, L2, L2, L2, L2));
        org.telegram.ui.Cells.y O = org.telegram.ui.ActionBar.m6.O(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), 0, 0);
        ImageView imageView = this.n;
        imageView.setBackground(O);
        int w07 = org.telegram.ui.ActionBar.m6.w0(i11, h6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w07, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), mode));
    }
}
