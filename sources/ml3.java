// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ml3 extends LinearLayout {
    public float a;
    public Runnable b;
    public gu2 c;
    public boolean d;
    public ValueAnimator e;
    public final s09 f;
    public final TextView h;
    public final blb n;
    public int r;
    public int s;
    public final int w;

    public ml3(Context context) {
        super(context);
        this.r = -1;
        this.w = z8c.t0;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new w02((byte) 6));
        s09 s09Var = new s09(context);
        this.f = s09Var;
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(s09Var, qoe.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        s09Var.setOnClickListener(new sf3(this, (byte) 3));
        TextView textView = new TextView(context);
        this.h = textView;
        td4.x(textView, cmb.l9, null, 1, 20.0f);
        textView.setGravity(17);
        addView(textView, qoe.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        blb blbVar = new blb(context);
        this.n = blbVar;
        blbVar.setFactory(new jl3(context, (byte) 0));
        blbVar.setInAnimation(context, R.anim.alpha_in);
        blbVar.setOutAnimation(context, R.anim.alpha_out);
        addView(blbVar, qoe.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z) {
            String M0 = jb6.M0(2131747963, null);
            if (gm.O1() && !gm.N1()) {
                M0 = M0.replace('\n', ' ');
            }
            this.n.a(M0, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.a, 1.0f).setDuration(250L);
        this.e = duration;
        duration.setInterpolator(vt3.d);
        this.e.addUpdateListener(new kl3(this, (byte) 0));
        this.e.addListener(new ll3(this, (byte) 1));
        this.e.start();
    }

    public final void b() {
        int i;
        int i2 = 0;
        if ((getParent() instanceof View) && (((i = this.r) == 2 || i == 3 || i == 4) && ((View) getParent()).getPaddingTop() != 0)) {
            i2 = 0 - (getTop() / 2);
        }
        int i3 = this.r;
        if (i3 == 0 || i3 == 1) {
            i2 -= (int) ((1.0f - this.a) * (a.getCurrentActionBarHeight() / 2.0f));
        }
        float f = i2;
        this.f.setTranslationY(f);
        this.h.setTranslationY(f);
        this.n.setTranslationY(f);
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        b();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int size2;
        int i3 = this.r;
        if (i3 == 0 || i3 == 1) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size = (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom();
            } else {
                size = View.MeasureSpec.getSize(i2);
            }
            if (size == 0) {
                size = (gm.q.y - a.getCurrentActionBarHeight()) - gm.m;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((gm.L(320.0f) - size) * this.a) + size), TLObject.FLAG_30));
            return;
        }
        if (i3 != 2 && i3 != 3 && i3 != 4) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(166.0f), TLObject.FLAG_30));
            return;
        }
        if (getParent() instanceof View) {
            View view2 = (View) getParent();
            size2 = view2.getMeasuredHeight();
            if (view2.getPaddingTop() != 0) {
                size2 -= gm.m;
            }
        } else {
            size2 = View.MeasureSpec.getSize(i2);
        }
        if (size2 == 0) {
            size2 = (gm.q.y - a.getCurrentActionBarHeight()) - gm.m;
        }
        if (getParent() instanceof rm0) {
            size2 -= ((rm0) getParent()).f3;
        }
        ArrayList arrayList = oc7.r1(this.w).s;
        if (!arrayList.isEmpty()) {
            size2 = wi8.B(50.0f, (arrayList.size() + (arrayList.size() * gm.L(72.0f))) - 1, size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(gu2 gu2Var) {
        this.c = gu2Var;
    }
}
