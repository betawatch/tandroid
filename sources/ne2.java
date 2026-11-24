// default package

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class ne2 extends FrameLayout {
    public vgc a;
    public float b;
    public boolean c;
    public float d;
    public ValueAnimator e;

    public abstract void a(boolean z);

    public final void b(boolean z) {
        this.c = z;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            this.e = null;
            valueAnimator.cancel();
        }
        if (z) {
            setVisibility(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d, z ? 1.0f : 0.0f);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new et1(this, (byte) 9));
        this.e.setInterpolator(d53.h);
        this.e.setDuration(320L);
        this.e.addListener(new y7((byte) 19, (Object) this, z));
        this.e.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.b);
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.c;
    }

    public void setShown(float f) {
        this.b = f;
        vgc vgcVar = this.a;
        if (vgcVar != null) {
            vgcVar.setPivotX(vgcVar.getWidth() / 2.0f);
            this.a.setPivotY(0.0f);
            this.a.setScaleX(gm.R1(0.8f, 1.0f, f));
            this.a.setScaleY(gm.R1(0.8f, 1.0f, f));
        }
        setAlpha(f);
        invalidate();
    }

    public void setTabs(vgc vgcVar) {
        this.a = vgcVar;
        addView(vgcVar, qoe.c(-1.0f, -1));
    }
}
