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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class j31 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 a;
    public final org.telegram.ui.Components.b9 b;
    public final org.telegram.ui.Components.q9 c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final TextView e;
    public final ImageView f;
    public final org.telegram.ui.Components.m5 h;
    public final org.telegram.ui.Components.m5 n;
    public int r;

    public j31(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.a = i6Var;
        setOrientation(0);
        this.b = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTextSize(15);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        this.h = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 7, n5Var, false);
        this.n = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 7, n5Var, false);
        n5Var.addOnAttachStateChangeListener(new e5(this, 5));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        int L = org.telegram.messenger.g0.L(10.0f);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(textView, d02, M, null, i6Var);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.m6, i6Var, PorterDuff.Mode.SRC_IN);
        if (!org.telegram.messenger.gd.a0) {
            n5Var.setGravity(19);
            addView(q9Var, c8.ma.t(28, 28, 19, 18, 0, 18, 0));
            addView(n5Var, c8.ma.q(0, -1, 1.0f, org.telegram.messenger.ks.E1, 0, 0, 18, 0));
            addView(textView, c8.ma.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(imageView, c8.ma.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
            return;
        }
        n5Var.setGravity(21);
        imageView.setScaleX(-1.0f);
        addView(imageView, c8.ma.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
        addView(textView, c8.ma.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(n5Var, c8.ma.q(0, -1, 1.0f, org.telegram.messenger.ks.E1, 18, 0, 0, 0));
        addView(q9Var, c8.ma.t(28, 28, 21, 18, 0, 18, 0));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.qi));
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
        Long i10;
        TLRPC.User f10 = org.telegram.messenger.j10.i(i7).f();
        org.telegram.ui.Components.b9 b9Var = this.b;
        b9Var.r(f10);
        org.telegram.ui.Components.q9 q9Var = this.c;
        q9Var.getImageReceiver().d = i7;
        q9Var.f(f10, b9Var);
        String q10 = org.telegram.messenger.o10.q(f10);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.l(q10, false);
        Integer valueOf = Integer.valueOf(i7);
        org.telegram.ui.Components.m5 m5Var = this.h;
        m5Var.y = valueOf;
        Integer valueOf2 = Integer.valueOf(i7);
        org.telegram.ui.Components.m5 m5Var2 = this.n;
        m5Var2.y = valueOf2;
        int i11 = org.telegram.ui.ActionBar.n6.qi;
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i11, i6Var)));
        if (f10 != null) {
            long j3 = f10.bot_verification_icon;
            if (j3 != 0) {
                m5Var.j(j3, false);
                i10 = org.telegram.messenger.o10.i(f10);
                m5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i11, i6Var)));
                if (i10 == null) {
                    m5Var2.j(i10.longValue(), false);
                } else if (f10 == null || !f10.premium) {
                    m5Var2.g(null, false);
                } else {
                    m5Var2.g(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
                }
                if (m5Var.d()) {
                    m5Var = null;
                }
                n5Var.setLeftDrawable(m5Var);
                if (m5Var2.d()) {
                    m5Var2 = null;
                }
                n5Var.i(m5Var2);
                int i12 = org.telegram.messenger.tr.a0(i7).L;
                int i13 = i12 <= 0 ? 8 : 0;
                TextView textView = this.e;
                textView.setVisibility(i13);
                textView.setText(org.telegram.messenger.gd.E(i12, ','));
            }
        }
        m5Var.g(null, false);
        i10 = org.telegram.messenger.o10.i(f10);
        m5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i11, i6Var)));
        if (i10 == null) {
        }
        if (m5Var.d()) {
        }
        n5Var.setLeftDrawable(m5Var);
        if (m5Var2.d()) {
        }
        n5Var.i(m5Var2);
        int i122 = org.telegram.messenger.tr.a0(i7).L;
        if (i122 <= 0) {
        }
        TextView textView2 = this.e;
        textView2.setVisibility(i13);
        textView2.setText(org.telegram.messenger.gd.E(i122, ','));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.setTextColor(w02);
        TextView textView = this.e;
        org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.m6, i6Var);
        int i10 = this.r;
        ImageView imageView = this.f;
        if (w03 != i10 || imageView.getColorFilter() == null) {
            this.r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i11 = org.telegram.ui.ActionBar.n6.qi;
        this.n.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i11, i6Var)));
        try {
            org.telegram.ui.Components.m5 m5Var = this.h;
            if (m5Var != null) {
                m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i11, i6Var)));
                n5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
