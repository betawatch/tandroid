package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class o6 extends LinearLayout {
    public final TextView a;
    public final n6 b;
    public ImageView c;
    public ImageView d;
    public float e;
    public boolean f;
    public ValueAnimator h;
    public final ImageView n;
    public final /* synthetic */ r6 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(r6 r6Var, Context context) {
        super(context);
        this.r = r6Var;
        setOrientation(0);
        int i10 = org.telegram.ui.ActionBar.i6.i6;
        e6 e6Var = r6Var.G1;
        setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(i10, e6Var), 2, -1));
        n6 n6Var = new n6(this, context);
        this.b = n6Var;
        addView(n6Var, w7.x5.t(-2, -2, 19, 16, 0, 16, 0));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.c;
        int i11 = org.telegram.ui.ActionBar.i6.E8;
        imageView2.setColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        n6Var.addView(this.c, w7.x5.e(-2, -2, 17));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setScaleType(scaleType);
        this.d.setColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        this.d.setVisibility(8);
        n6Var.addView(this.d, w7.x5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        textView.setTextSize(1, 16.0f);
        addView(textView, w7.x5.t(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView4 = new ImageView(context);
        this.n = imageView4;
        imageView4.setImageResource(R.drawable.msg_text_check);
        imageView4.setScaleType(scaleType);
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h7, e6Var), PorterDuff.Mode.MULTIPLY));
        imageView4.setVisibility(8);
        addView(imageView4, w7.x5.n(50, -1));
    }

    public final void a(int i10, boolean z10, boolean z11) {
        if (!z11) {
            this.c.setImageResource(i10);
            return;
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
            a(i10, false, false);
            return;
        }
        this.f = z10;
        this.d.setImageResource(i10);
        this.d.setVisibility(0);
        this.d.setAlpha(1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new ai.bb(1, this, z10));
        this.h.addListener(new ai.b(this, 15));
        this.h.setInterpolator(qr.h);
        this.h.setDuration(420L);
        this.h.start();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        r6 r6Var = this.r;
        org.telegram.ui.ActionBar.n1 n1Var = r6Var.H1;
        if (n1Var != null && n1Var.isShowing()) {
            r6Var.H1.d(true);
        }
        return super.performClick();
    }

    public void setIcon(int i10) {
        a(i10, true, false);
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        this.n.setVisibility(z10 ? 0 : 8);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
