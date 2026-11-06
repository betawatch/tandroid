package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.s3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.c40;
import org.telegram.ui.f40;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class r extends FrameLayout {
    public int a;
    public f40 b;
    public y c;
    public s3 d;
    public boolean e;
    public final boolean f;

    public r(Context context, boolean z9) {
        super(context);
        this.f = z9;
    }

    public float getItemHeight() {
        return this.b != null ? r0.F() : getMeasuredHeight();
    }

    public s3 getParticipant() {
        return this.d;
    }

    public y getRenderer() {
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
    public final void onMeasure(int i7, int i10) {
        if (this.f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(this.b.F(), TLObject.FLAG_30));
        } else {
            float f10 = c40.w5 ? 3.0f : 2.0f;
            float A = org.telegram.messenger.camera.q.A(14.0f, 2, org.telegram.messenger.g0.q.x) + (c40.w5 ? -org.telegram.messenger.g0.L(90.0f) : 0);
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) ((c40.x5 ? A / 2.0f : A / f10) + org.telegram.messenger.g0.L(4.0f)), TLObject.FLAG_30));
        }
    }

    public void setRenderer(y yVar) {
        this.c = yVar;
    }
}
