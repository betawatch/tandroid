package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class a30 extends sa {
    public final /* synthetic */ int T1 = 0;
    public final LinearLayout U1;
    public c51 V1;

    public a30(Activity activity, org.telegram.ui.ActionBar.h6 h6Var, TLRPC.User user, TLObject tLObject, org.telegram.ui.ep epVar) {
        super(activity, null, false, false, 1, h6Var);
        O();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.U1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        org.telegram.ui.wv0 e12 = e1(activity, org.telegram.messenger.g0.L(60.0f), user);
        org.telegram.ui.wv0 e13 = e1(activity, org.telegram.messenger.g0.L(60.0f), tLObject);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.z6, h6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(e12, c8.ma.o(60, 60));
        linearLayout2.addView(imageView, c8.ma.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(e13, c8.ma.o(60, 60));
        frameLayout.addView(linearLayout2, c8.ma.e(-2, -2, 17));
        linearLayout.addView(frameLayout, c8.ma.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.hd.N0(2131749176, null));
        textView.setTextSize(1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        linearLayout.addView(textView, c8.ma.t(-1, -2, 17, 20, 0, 20, 6));
        String u10 = org.telegram.messenger.n5.u(user);
        String u11 = org.telegram.messenger.n5.u(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        org.telegram.messenger.f3.q(null, null, 2131749177, new Object[]{u10, u11}, textView2);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView2, i7, h6Var);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.66f), 1.0f);
        linearLayout.addView(textView2, c8.ma.t(-1, -2, 17, 24, 0, 24, 29));
        hi.e eVar = new hi.e(activity, h6Var, true);
        eVar.f();
        eVar.i(org.telegram.messenger.hd.a0(null, null, 2131749175, u11), false, true);
        eVar.setOnClickListener(new m8(16, this, epVar));
        linearLayout.addView(eVar, c8.ma.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        hi.e eVar2 = new hi.e(activity, h6Var, true);
        eVar2.f();
        eVar2.e();
        eVar2.i(org.telegram.messenger.hd.a0(null, null, 2131749178, u10), false, true);
        eVar2.setOnClickListener(new o0(this, 25));
        linearLayout.addView(eVar2, c8.ma.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        ek0 ek0Var = this.o1;
        int i10 = this.u0;
        ek0Var.setPadding(i10, 0, i10, 0);
        this.V1.O(false);
    }

    public static org.telegram.ui.wv0 e1(Context context, int i7, TLObject tLObject) {
        org.telegram.ui.wv0 wv0Var = new org.telegram.ui.wv0(context);
        wv0Var.setRoundRadius(i7 / 2);
        b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.l(tLObject);
        wv0Var.setImageDrawable(b9Var);
        wv0Var.setLayoutParams(new FrameLayout.LayoutParams(i7, i7));
        return wv0Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        switch (this.T1) {
            case 0:
                c51 c51Var = new c51(this.o1, getContext(), this.a, 0, true, new d(this, 15), this.J0);
                this.V1 = c51Var;
                c51Var.r = false;
                return c51Var;
            case 1:
                c51 c51Var2 = new c51(ek0Var, getContext(), this.a, 0, true, new org.telegram.ui.a5(this, 22), this.J0);
                this.V1 = c51Var2;
                return c51Var2;
            default:
                di.f0 f0Var = new di.f0(ek0Var, getContext(), this.a, 0, true, new bi.b(this, 15), this.J0, 0);
                this.V1 = f0Var;
                return f0Var;
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        switch (this.T1) {
            case 0:
                return "";
            case 1:
                return org.telegram.messenger.hd.N0(2131754943, null);
            default:
                return org.telegram.messenger.hd.N0(2131750848, null);
        }
    }

    public a30(Context context) {
        super(context, null, false, false, null);
        this.v1 = 0.1f;
        O();
        ek0 ek0Var = this.o1;
        int i7 = this.u0;
        ek0Var.setPadding(i7, 0, i7, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        di.ua uaVar = new di.ua(context, 70, 0, 0);
        frameLayout.addView(uaVar, c8.ma.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        vg.f fVar = mVar.b;
        fVar.z = org.telegram.ui.ActionBar.m6.Wk;
        fVar.A = org.telegram.ui.ActionBar.m6.Xk;
        fVar.b();
        mVar.setStarParticlesView(uaVar);
        frameLayout.addView(mVar, c8.ma.d(org.telegram.messenger.ls.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        linearLayout.addView(frameLayout, c8.ma.c(150.0f, -1));
        TextView textView = new TextView(context);
        i5.c.x(textView, 1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.U(textView, i10, this.J0);
        org.telegram.messenger.f3.k(textView, 17, null, 2131750848);
        TextView f10 = org.telegram.messenger.o10.f(linearLayout, textView, c8.ma.t(-2, -2, 1, 0, 2, 0, 0), context);
        f10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(f10, i10, this.J0);
        org.telegram.messenger.f3.k(f10, 17, null, 2131750847);
        linearLayout.addView(f10, c8.ma.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        hi.e eVar = new hi.e(context, this.J0, true);
        eVar.i(org.telegram.messenger.hd.N0(2131750857, null), false, true);
        eVar.setOnClickListener(new ah.d(this, 10));
        frameLayout2.addView(eVar, c8.ma.d(-1, 48.0f, org.telegram.messenger.ls.E1, 10.0f, 10.0f, 10.0f, 10.0f));
        int i11 = this.u0;
        frameLayout2.setPadding(i11, 0, i11, 0);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, frameLayout2, null);
        this.b.addView(frameLayout2, c8.ma.e(-1, -2, 87));
        ((di.f0) this.V1).O(false);
    }

    public a30(Context context, org.telegram.ui.ActionBar.h6 h6Var, fm0 fm0Var) {
        super(context, null, false, false, h6Var);
        O();
        this.v1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i7 = org.telegram.ui.ActionBar.m6.Fi;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + this.u0, 0, org.telegram.messenger.g0.L(6.0f) + this.u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        rh0 rh0Var = new rh0(getContext());
        rh0Var.setScaleType(ImageView.ScaleType.CENTER);
        rh0Var.setImageResource(R.drawable.large_ads_info);
        rh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(80.0f), org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        rh0Var.setBackground(L);
        org.telegram.ui.ActionBar.t6.j(rh0Var, L, M, null, h6Var);
        frameLayout.addView(rh0Var, c8.ma.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.N0(2131745629, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.o10.f(linearLayout, textView, c8.ma.t(-2, -2, 1, 22, 14, 22, 0), context);
        f10.setText(org.telegram.messenger.hd.N0(2131745630, null));
        org.telegram.ui.ActionBar.t6.U(f10, i10, h6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        linearLayout.addView(f10, c8.ma.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new org.telegram.ui.ih0(this, context, R.drawable.menu_privacy, org.telegram.messenger.hd.N0(2131745637, null), org.telegram.messenger.hd.N0(2131745638, null)), c8.ma.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean q10 = org.telegram.messenger.k10.i(this.a).q();
        linearLayout.addView(new org.telegram.ui.ih0(this, context, R.drawable.menu_feature_noads, org.telegram.messenger.hd.N0(2131745634, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(q10 ? 2131745635 : 2131745636, null), new org.telegram.ui.b80(this, q10, fm0Var, 9)), true)), c8.ma.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d7, view, h6Var);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.hd.N0(2131745631, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.U(textView2, i10, h6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, c8.ma.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131745632, null)), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131745633, null), new org.telegram.ui.ru0(this, 12)), true), "%1$s");
        m80 m80Var = new m80(context, null);
        m80Var.setText(K2);
        org.telegram.ui.ActionBar.t6.U(m80Var, i10, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, h6Var);
        m80Var.setTextSize(1, 14.0f);
        m80Var.setGravity(1);
        m80Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(m80Var, c8.ma.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.Ji, h6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.hd.N0(2131745628, null));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), 24.0f);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i7);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.t6.j(textView3, e10, M2, e11, h6Var);
        textView3.setOnClickListener(new org.telegram.ui.oy0(this, 3));
        linearLayout.addView(textView3, c8.ma.t(-1, 48, 0, 14, 22, 14, 14));
        this.V1.O(false);
    }
}
