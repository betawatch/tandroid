package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j5 extends LinearLayout {
    public final TextView a;
    public final ai.c0 b;
    public ImageView c;
    public ImageView d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public final ImageView n;
    public final /* synthetic */ m5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(m5 m5Var, Context context) {
        super(context);
        this.r = m5Var;
        setOrientation(0);
        int i3 = org.telegram.ui.ActionBar.k6.i6;
        e5 e5Var = m5Var.q1;
        setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i3, e5Var), 2, -1));
        ai.c0 c0Var = new ai.c0(this, context);
        this.b = c0Var;
        addView(c0Var, mf.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.c;
        int i10 = org.telegram.ui.ActionBar.k6.E8;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, e5Var, mode);
        c0Var.addView(this.c, mf.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(this.d, i10, e5Var, mode);
        this.d.setVisibility(8);
        c0Var.addView(this.d, mf.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e5Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, mf.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.r6.t(imageView4, org.telegram.ui.ActionBar.k6.h7, e5Var, PorterDuff.Mode.MULTIPLY);
        imageView4.setVisibility(8);
        addView(imageView4, mf.o(50, -1));
    }

    public final void a(int i3, boolean z10, boolean z11) {
        if (!z11) {
            this.c.setImageResource(i3);
            return;
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
            a(i3, false, false);
            return;
        }
        this.f = z10;
        this.d.setImageResource(i3);
        this.d.setVisibility(0);
        this.d.setAlpha(1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new dh.u(2, this, z10));
        this.h.addListener(new ai.e1(this, 23));
        this.h.setInterpolator(xq.h);
        this.h.setDuration(420L);
        this.h.start();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m5 m5Var = this.r;
        org.telegram.ui.ActionBar.f1 f1Var = m5Var.r1;
        if (f1Var != null && f1Var.isShowing()) {
            m5Var.r1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i3) {
        a(i3, true, false);
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        this.n.setVisibility(z10 ? 0 : 8);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
