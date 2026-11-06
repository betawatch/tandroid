package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class is0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public boolean e;
    public vs0 f;
    public org.telegram.ui.Components.g5 h;
    public Drawable n;

    public is0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.a = k5Var;
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(15);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, f6Var);
        linearLayout.addView(k5Var, c8.ha.o(-1, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.y6, f6Var);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(textView, c8.ha.q(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, c8.ha.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, c8.ha.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.M6, f6Var, PorterDuff.Mode.SRC_ATOP);
        addView(imageView2, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(vs0 vs0Var, boolean z9) {
        boolean q10 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q();
        ImageView imageView = this.d;
        if (q10 && vs0Var.a == 12 && vs0Var.b == R.drawable.filled_premium_status2) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long h = org.telegram.messenger.t10.h(org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).f());
            b(h == null ? 0L : h.longValue(), false);
        } else {
            imageView.setVisibility(0);
            org.telegram.ui.Components.g5 g5Var = this.h;
            if (g5Var != null) {
                g5Var.b();
                this.h = null;
            }
        }
        this.f = vs0Var;
        this.a.l(vs0Var.c, false);
        this.b.setText(vs0Var.d);
        this.c.setImageResource(vs0Var.b);
        this.e = z9;
    }

    public final void b(long j3, boolean z9) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j3 != 0) {
            this.h.j(j3, z9);
            return;
        }
        if (this.n == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_prolfilestar).mutate();
            this.n = mutate;
            org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.v6, null, PorterDuff.Mode.SRC_IN);
        }
        this.h.g(this.n, z9);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - this.h.s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + this.h.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.v6, false)));
            this.h.draw(canvas);
        }
        if (this.e) {
            canvas.drawRect(org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
