package hi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class i5 extends LinearLayout {
    public final TextView a;
    public final ai.k0 b;
    public ImageView c;
    public ImageView d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public final ImageView n;
    public final /* synthetic */ l5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(l5 l5Var, Context context) {
        super(context);
        this.r = l5Var;
        setOrientation(0);
        int i7 = org.telegram.ui.ActionBar.n6.i6;
        d5 d5Var = l5Var.q1;
        setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i7, d5Var), 2, -1));
        ai.k0 k0Var = new ai.k0(this, context);
        this.b = k0Var;
        addView(k0Var, c8.ma.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.c;
        int i10 = org.telegram.ui.ActionBar.n6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.u6.s(imageView2, i10, d5Var, mode);
        k0Var.addView(this.c, c8.ma.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.u6.s(this.d, i10, d5Var, mode);
        this.d.setVisibility(8);
        k0Var.addView(this.d, c8.ma.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.u6.U(textView, i10, d5Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, c8.ma.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.u6.s(imageView4, org.telegram.ui.ActionBar.n6.h7, d5Var, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, c8.ma.o(50, -1));
    }

    public final void a(int i7, boolean z10, boolean z11) {
        if (!z11) {
            this.c.setImageResource(i7);
            return;
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
            a(i7, false, false);
            return;
        }
        this.f = z10;
        this.d.setImageResource(i7);
        this.d.setVisibility(0);
        this.d.setAlpha(1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new ch.v(2, this, z10));
        this.h.addListener(new ai.j0(this, 23));
        this.h.setInterpolator(lr.h);
        this.h.setDuration(420L);
        this.h.start();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        l5 l5Var = this.r;
        org.telegram.ui.ActionBar.h1 h1Var = l5Var.r1;
        if (h1Var != null && h1Var.isShowing()) {
            l5Var.r1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i7) {
        a(i7, true, false);
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        this.n.setVisibility(z10 ? 0 : 8);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
