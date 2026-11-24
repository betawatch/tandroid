// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class o75 extends FrameLayout {
    public int a;
    public r95 b;
    public h85 c;
    public gc2 d;
    public boolean e;
    public final boolean f;

    public o75(Context context, boolean z) {
        super(context);
        this.f = z;
    }

    public float getItemHeight() {
        return this.b != null ? r0.F() : getMeasuredHeight();
    }

    public gc2 getParticipant() {
        return this.d;
    }

    public h85 getRenderer() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.b.F(), TLObject.FLAG_30));
        } else {
            float f = h75.u5 ? 3.0f : 2.0f;
            float L = (gl.q.x - (gl.L(14.0f) << 1)) + (h75.u5 ? -gl.L(90.0f) : 0);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) ((h75.v5 ? L / 2.0f : L / f) + gl.L(4.0f)), TLObject.FLAG_30));
        }
    }

    public void setRenderer(h85 h85Var) {
        this.c = h85Var;
    }
}
