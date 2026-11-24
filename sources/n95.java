// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class n95 extends FrameLayout {
    public int a;
    public pb5 b;
    public ha5 c;
    public rd2 d;
    public boolean e;
    public final boolean f;

    public n95(Context context, boolean z) {
        super(context);
        this.f = z;
    }

    public float getItemHeight() {
        return this.b != null ? r0.F() : getMeasuredHeight();
    }

    public rd2 getParticipant() {
        return this.d;
    }

    public ha5 getRenderer() {
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
            float f = g95.u5 ? 3.0f : 2.0f;
            float L = (gm.q.x - (gm.L(14.0f) << 1)) + (g95.u5 ? -gm.L(90.0f) : 0);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) ((g95.v5 ? L / 2.0f : L / f) + gm.L(4.0f)), TLObject.FLAG_30));
        }
    }

    public void setRenderer(ha5 ha5Var) {
        this.c = ha5Var;
    }
}
