package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.v3;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.b50;
import org.telegram.ui.e50;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class k extends FrameLayout {
    public int a;
    public e50 b;
    public r c;
    public v3 d;
    public boolean e;
    public final boolean f;

    public k(Context context, boolean z10) {
        super(context);
        this.f = z10;
    }

    public float getItemHeight() {
        return this.b != null ? r0.F() : getMeasuredHeight();
    }

    public v3 getParticipant() {
        return this.d;
    }

    public r getRenderer() {
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
    public final void onMeasure(int i10, int i11) {
        if (this.f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.b.F(), TLObject.FLAG_30));
        } else {
            float f7 = b50.w5 ? 3.0f : 2.0f;
            float A = z20.A(14.0f, 2, org.telegram.messenger.i0.q.x) + (b50.w5 ? -org.telegram.messenger.i0.L(90.0f) : 0);
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) ((b50.x5 ? A / 2.0f : A / f7) + org.telegram.messenger.i0.L(4.0f)), TLObject.FLAG_30));
        }
    }

    public void setRenderer(r rVar) {
        this.c = rVar;
    }
}
