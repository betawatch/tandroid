// default package

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class cd2 extends FrameLayout {
    public vec a;
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
        ofFloat.addUpdateListener(new uz1(this, (byte) 7));
        this.e.setInterpolator(s33.h);
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
        vec vecVar = this.a;
        if (vecVar != null) {
            vecVar.setPivotX(vecVar.getWidth() / 2.0f);
            this.a.setPivotY(0.0f);
            this.a.setScaleX(gl.R1(0.8f, 1.0f, f));
            this.a.setScaleY(gl.R1(0.8f, 1.0f, f));
        }
        setAlpha(f);
        invalidate();
    }

    public void setTabs(vec vecVar) {
        this.a = vecVar;
        addView(vecVar, nme.c(-1.0f, -1));
    }
}
