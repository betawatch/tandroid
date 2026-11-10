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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j31 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final org.telegram.ui.Components.v8 b;
    public final org.telegram.ui.Components.k9 c;
    public final org.telegram.ui.ActionBar.m5 d;
    public final TextView e;
    public final ImageView f;
    public final org.telegram.ui.Components.f5 h;
    public final org.telegram.ui.Components.f5 n;
    public int r;

    public j31(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = h6Var;
        setOrientation(0);
        this.b = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.d = m5Var;
        m5Var.setTextSize(15);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, h6Var);
        this.h = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(24.0f), 7, m5Var, false);
        this.n = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(24.0f), 7, m5Var, false);
        m5Var.addOnAttachStateChangeListener(new e5(this, 5));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setPadding(org.telegram.messenger.g0.L(6.66f), 0, org.telegram.messenger.g0.L(6.66f), 0);
        textView.setTextSize(1, 11.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gi, h6Var);
        int L = org.telegram.messenger.g0.L(10.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Ci;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(textView, d02, M, null, h6Var);
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.m6, h6Var, PorterDuff.Mode.SRC_IN);
        if (!org.telegram.messenger.id.a0) {
            m5Var.setGravity(19);
            addView(k9Var, c8.ha.t(28, 28, 19, 18, 0, 18, 0));
            addView(m5Var, c8.ha.q(0, -1, 1.0f, org.telegram.messenger.qs.E1, 0, 0, 18, 0));
            addView(textView, c8.ha.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
            addView(imageView, c8.ha.q(24, 24, 0.0f, 21, 0, 0, 12, 0));
            return;
        }
        m5Var.setGravity(21);
        imageView.setScaleX(-1.0f);
        addView(imageView, c8.ha.q(24, 24, 0.0f, 19, 12, 0, 0, 0));
        addView(textView, c8.ha.q(-2, 20, 0.0f, 16, 0, 0, 0, 0));
        addView(m5Var, c8.ha.q(0, -1, 1.0f, org.telegram.messenger.qs.E1, 18, 0, 0, 0));
        addView(k9Var, c8.ha.t(28, 28, 21, 18, 0, 18, 0));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ni));
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
        org.telegram.ui.Components.v8 v8Var = this.b;
        v8Var.r(f10);
        org.telegram.ui.Components.k9 k9Var = this.c;
        k9Var.getImageReceiver().d = i7;
        k9Var.e(f10, v8Var);
        String p10 = org.telegram.messenger.t10.p(f10);
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        m5Var.l(p10, false);
        Integer valueOf = Integer.valueOf(i7);
        org.telegram.ui.Components.f5 f5Var = this.h;
        f5Var.y = valueOf;
        Integer valueOf2 = Integer.valueOf(i7);
        org.telegram.ui.Components.f5 f5Var2 = this.n;
        f5Var2.y = valueOf2;
        int i10 = org.telegram.ui.ActionBar.m6.ni;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
        if (f10 != null) {
            long j3 = f10.bot_verification_icon;
            if (j3 != 0) {
                f5Var.j(j3, false);
                h = org.telegram.messenger.t10.h(f10);
                f5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
                if (h == null) {
                    f5Var2.j(h.longValue(), false);
                } else if (f10 == null || !f10.premium) {
                    f5Var2.g(null, false);
                } else {
                    f5Var2.g(getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate(), false);
                }
                if (f5Var.d()) {
                    f5Var = null;
                }
                m5Var.setLeftDrawable(f5Var);
                if (f5Var2.d()) {
                    f5Var2 = null;
                }
                m5Var.i(f5Var2);
                int i11 = org.telegram.messenger.yr.a0(i7).K;
                int i12 = i11 <= 0 ? 8 : 0;
                TextView textView = this.e;
                textView.setVisibility(i12);
                textView.setText(org.telegram.messenger.id.E(i11, ','));
            }
        }
        f5Var.g(null, false);
        h = org.telegram.messenger.t10.h(f10);
        f5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i10, h6Var)));
        if (h == null) {
        }
        if (f5Var.d()) {
        }
        m5Var.setLeftDrawable(f5Var);
        if (f5Var2.d()) {
        }
        m5Var.i(f5Var2);
        int i112 = org.telegram.messenger.yr.a0(i7).K;
        if (i112 <= 0) {
        }
        TextView textView2 = this.e;
        textView2.setVisibility(i12);
        textView2.setText(org.telegram.messenger.id.E(i112, ','));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        m5Var.setTextColor(w02);
        TextView textView = this.e;
        org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, h6Var), textView.getBackground());
        textView.invalidate();
        int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.m6, h6Var);
        int i10 = this.r;
        ImageView imageView = this.f;
        if (w03 != i10 || imageView.getColorFilter() == null) {
            this.r = w03;
            imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
        }
        int i11 = org.telegram.ui.ActionBar.m6.ni;
        this.n.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i11, h6Var)));
        try {
            org.telegram.ui.Components.f5 f5Var = this.h;
            if (f5Var != null) {
                f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i11, h6Var)));
                m5Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
