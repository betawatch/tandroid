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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class m20 extends na {
    public final /* synthetic */ int P1 = 0;
    public final LinearLayout Q1;
    public l41 R1;

    public m20(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.User user, TLObject tLObject, org.telegram.ui.bp bpVar) {
        super(activity, null, false, false, 1, f6Var);
        N();
        LinearLayout linearLayout = new LinearLayout(activity);
        this.Q1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        org.telegram.ui.wv0 d12 = d1(activity, org.telegram.messenger.g0.L(60.0f), user);
        org.telegram.ui.wv0 d13 = d1(activity, org.telegram.messenger.g0.L(60.0f), tLObject);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.z6, f6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setClipChildren(false);
        linearLayout2.addView(d12, c8.ha.o(60, 60));
        linearLayout2.addView(imageView, c8.ha.t(24, 24, 16, 7, 0, 7, 0));
        linearLayout2.addView(d13, c8.ha.o(60, 60));
        frameLayout.addView(linearLayout2, c8.ha.e(-2, -2, 17));
        linearLayout.addView(frameLayout, c8.ha.t(-1, -2, 1, 0, 23, 0, 19));
        TextView textView = new TextView(activity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(org.telegram.messenger.id.M0(2131749370, null));
        textView.setTextSize(1, 20.0f);
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
        linearLayout.addView(textView, c8.ha.t(-1, -2, 17, 20, 0, 20, 6));
        String u10 = org.telegram.messenger.m5.u(user);
        String u11 = org.telegram.messenger.m5.u(tLObject);
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        org.telegram.messenger.k5.r(null, null, 2131749371, new Object[]{u10, u11}, textView2);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, i7, f6Var);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.66f), 1.0f);
        linearLayout.addView(textView2, c8.ha.t(-1, -2, 17, 24, 0, 24, 29));
        fi.d dVar = new fi.d(activity, f6Var, true);
        dVar.f();
        dVar.i(org.telegram.messenger.id.a0(null, null, 2131749369, u11), false, true);
        dVar.setOnClickListener(new lk(14, this, bpVar));
        linearLayout.addView(dVar, c8.ha.k(14.0f, 0.0f, 14.0f, 10.0f, -1, 48));
        fi.d dVar2 = new fi.d(activity, f6Var, true);
        dVar2.f();
        dVar2.e();
        dVar2.i(org.telegram.messenger.id.a0(null, null, 2131749372, u10), false, true);
        dVar2.setOnClickListener(new h0(this, 23));
        linearLayout.addView(dVar2, c8.ha.k(14.0f, 0.0f, 14.0f, 14.0f, -1, 48));
        pj0 pj0Var = this.k1;
        int i10 = this.t0;
        pj0Var.setPadding(i10, 0, i10, 0);
        this.R1.O(false);
    }

    public static org.telegram.ui.wv0 d1(Context context, int i7, TLObject tLObject) {
        org.telegram.ui.wv0 wv0Var = new org.telegram.ui.wv0(context);
        wv0Var.setRoundRadius(i7 / 2);
        w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.l(tLObject);
        wv0Var.setImageDrawable(w8Var);
        wv0Var.setLayoutParams(new FrameLayout.LayoutParams(i7, i7));
        return wv0Var;
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        switch (this.P1) {
            case 0:
                l41 l41Var = new l41(this.k1, getContext(), this.a, 0, true, new d(this, 14), this.I0);
                this.R1 = l41Var;
                l41Var.r = false;
                return l41Var;
            case 1:
                l41 l41Var2 = new l41(pj0Var, getContext(), this.a, 0, true, new org.telegram.ui.a5(this, 22), this.I0);
                this.R1 = l41Var2;
                return l41Var2;
            default:
                bi.o0 o0Var = new bi.o0(pj0Var, getContext(), this.a, 0, true, new ai.e(this, 3), this.I0, 0);
                this.R1 = o0Var;
                return o0Var;
        }
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        switch (this.P1) {
            case 0:
                return "";
            case 1:
                return org.telegram.messenger.id.M0(2131754943, null);
            default:
                return org.telegram.messenger.id.M0(2131750861, null);
        }
    }

    public m20(Context context) {
        super(context, null, false, false, null);
        this.r1 = 0.1f;
        N();
        pj0 pj0Var = this.k1;
        int i7 = this.t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        bi.gc gcVar = new bi.gc(context, 70, 0, 0);
        frameLayout.addView(gcVar, c8.ha.c(-1.0f, -1));
        vg.m mVar = new vg.m(context, 1, 2);
        vg.f fVar = mVar.b;
        fVar.z = org.telegram.ui.ActionBar.k6.Tk;
        fVar.A = org.telegram.ui.ActionBar.k6.Uk;
        fVar.b();
        mVar.setStarParticlesView(gcVar);
        frameLayout.addView(mVar, c8.ha.d(org.telegram.messenger.qs.A2, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        mVar.setPaused(false);
        linearLayout.addView(frameLayout, c8.ha.c(150.0f, -1));
        TextView textView = new TextView(context);
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i10, this.I0);
        org.telegram.messenger.k5.m(textView, 17, null, 2131750861);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-2, -2, 1, 0, 2, 0, 0), context);
        f10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(f10, i10, this.I0);
        org.telegram.messenger.k5.m(f10, 17, null, 2131750860);
        linearLayout.addView(f10, c8.ha.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        fi.d dVar = new fi.d(context, this.I0, true);
        dVar.i(org.telegram.messenger.id.M0(2131750870, null), false, true);
        dVar.setOnClickListener(new ah.d(this, 3));
        frameLayout2.addView(dVar, c8.ha.d(-1, 48.0f, org.telegram.messenger.qs.E1, 10.0f, 10.0f, 10.0f, 10.0f));
        int i11 = this.t0;
        frameLayout2.setPadding(i11, 0, i11, 0);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, frameLayout2, null);
        this.b.addView(frameLayout2, c8.ha.e(-1, -2, 87));
        ((bi.o0) this.R1).O(false);
    }

    public m20(Context context, org.telegram.ui.ActionBar.f6 f6Var, v80 v80Var) {
        super(context, null, false, false, f6Var);
        N();
        this.r1 = 0.2f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i7 = org.telegram.ui.ActionBar.k6.Ci;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + this.t0, 0, org.telegram.messenger.g0.L(6.0f) + this.t0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ch0 ch0Var = new ch0(getContext());
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        ch0Var.setImageResource(R.drawable.large_ads_info);
        ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(80.0f), org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        ch0Var.setBackground(L);
        org.telegram.ui.ActionBar.r6.k(ch0Var, L, N, null, f6Var);
        frameLayout.addView(ch0Var, c8.ha.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.id.M0(2131745828, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-2, -2, 1, 22, 14, 22, 0), context);
        f10.setText(org.telegram.messenger.id.M0(2131745829, null));
        org.telegram.ui.ActionBar.r6.V(f10, i10, f6Var);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        linearLayout.addView(f10, c8.ha.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new org.telegram.ui.sq0(this, context, R.drawable.menu_privacy, org.telegram.messenger.id.M0(2131745836, null), org.telegram.messenger.id.M0(2131745837, null)), c8.ha.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        boolean q10 = org.telegram.messenger.p10.i(this.a).q();
        linearLayout.addView(new org.telegram.ui.sq0(this, context, R.drawable.menu_feature_noads, org.telegram.messenger.id.M0(2131745833, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(q10 ? 2131745834 : 2131745835, null), new org.telegram.ui.g60(this, q10, v80Var, 10)), true)), c8.ha.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, f6Var);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.id.M0(2131745830, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(textView2, i10, f6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131745831, null)), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131745832, null), new org.telegram.ui.ru0(this, 12)), true), "%1$s");
        w70 w70Var = new w70(context, null);
        w70Var.setText(K2);
        org.telegram.ui.ActionBar.r6.V(w70Var, i10, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setGravity(1);
        w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(w70Var, c8.ha.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Gi, f6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.id.M0(2131745827, null));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.z5.e(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), 24.0f);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.n6 f11 = org.telegram.ui.ActionBar.r6.f(i7);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.r6.k(textView3, e10, N2, f11, f6Var);
        textView3.setOnClickListener(new org.telegram.ui.my0(this, 3));
        linearLayout.addView(textView3, c8.ha.t(-1, 48, 0, 14, 22, 14, 14));
        this.R1.O(false);
    }
}
