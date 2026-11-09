package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i31 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final org.telegram.ui.Components.w8 b;
    public final org.telegram.ui.Components.l9 c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final TextView e;
    public final ImageView f;
    public final org.telegram.ui.Components.g5 h;
    public final org.telegram.ui.Components.g5 n;
    public int r;

    public i31(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = g6Var;
        setOrientation(0);
        this.b = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var;
        l5Var.setTextSize(15);
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        this.h = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 7, l5Var, false);
        this.n = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 7, l5Var, false);
        l5Var.addOnAttachStateChangeListener(new e5(this, 5));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Gi, g6Var);
        int L = org.telegram.messenger.g0.L(10.0f);
        int i7 = org.telegram.ui.ActionBar.l6.Ci;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(textView, d02, M, null, g6Var);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.m6, g6Var, PorterDuff.Mode.SRC_IN);
        if (!org.telegram.messenger.id.a0) {
            l5Var.setGravity(19);
            addView(l9Var, c8.ha.t(28, 28, 19, 18, 0, 18, 0));
            addView(l5Var, c8.ha.q(0, -1, 1.0f, org.telegram.messenger.qs.E1, 0, 0, 18, 0));
            addView(textView, c8.ha.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(imageView, c8.ha.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
            return;
        }
        l5Var.setGravity(21);
        imageView.setScaleX(-1.0f);
        addView(imageView, c8.ha.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
        addView(textView, c8.ha.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(l5Var, c8.ha.q(0, -1, 1.0f, org.telegram.messenger.qs.E1, 18, 0, 0, 0));
        addView(l9Var, c8.ha.t(28, 28, 21, 18, 0, 18, 0));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.ni));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), TLObject.FLAG_30));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void set(int i7) {
        Long h;
        TLRPC.User f10 = org.telegram.messenger.p10.i(i7).f();
        org.telegram.ui.Components.w8 w8Var = this.b;
        w8Var.r(f10);
        org.telegram.ui.Components.l9 l9Var = this.c;
        l9Var.getImageReceiver().d = i7;
        l9Var.e(f10, w8Var);
        String p10 = org.telegram.messenger.t10.p(f10);
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        l5Var.l(p10, false);
        Integer valueOf = Integer.valueOf(i7);
        org.telegram.ui.Components.g5 g5Var = this.h;
        g5Var.y = valueOf;
        Integer valueOf2 = Integer.valueOf(i7);
        org.telegram.ui.Components.g5 g5Var2 = this.n;
        g5Var2.y = valueOf2;
        int i10 = org.telegram.ui.ActionBar.l6.ni;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i10, g6Var)));
        if (f10 != null) {
            long j3 = f10.bot_verification_icon;
            if (j3 != 0) {
                g5Var.j(j3, false);
                h = org.telegram.messenger.t10.h(f10);
                g5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i10, g6Var)));
                if (h == null) {
                    g5Var2.j(h.longValue(), false);
                } else if (f10 == null || !f10.premium) {
                    g5Var2.g(null, false);
                } else {
                    g5Var2.g(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
                }
                if (g5Var.d()) {
                    g5Var = null;
                }
                l5Var.setLeftDrawable(g5Var);
                if (g5Var2.d()) {
                    g5Var2 = null;
                }
                l5Var.i(g5Var2);
                int i11 = org.telegram.messenger.yr.a0(i7).K;
                int i12 = i11 <= 0 ? 8 : 0;
                TextView textView = this.e;
                textView.setVisibility(i12);
                textView.setText(org.telegram.messenger.id.E(i11, ','));
            }
        }
        g5Var.g(null, false);
        h = org.telegram.messenger.t10.h(f10);
        g5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i10, g6Var)));
        if (h == null) {
        }
        if (g5Var.d()) {
        }
        l5Var.setLeftDrawable(g5Var);
        if (g5Var2.d()) {
        }
        l5Var.i(g5Var2);
        int i112 = org.telegram.messenger.yr.a0(i7).K;
        if (i112 <= 0) {
        }
        TextView textView2 = this.e;
        textView2.setVisibility(i12);
        textView2.setText(org.telegram.messenger.id.E(i112, ','));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        l5Var.setTextColor(w02);
        TextView textView = this.e;
        org.telegram.ui.ActionBar.l6.C1(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.m6, g6Var);
        int i10 = this.r;
        ImageView imageView = this.f;
        if (w03 != i10 || imageView.getColorFilter() == null) {
            this.r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i11 = org.telegram.ui.ActionBar.l6.ni;
        this.n.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i11, g6Var)));
        try {
            org.telegram.ui.Components.g5 g5Var = this.h;
            if (g5Var != null) {
                g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i11, g6Var)));
                l5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
