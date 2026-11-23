package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.o10;
import org.telegram.messenger.u3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.f40;
import org.telegram.ui.i40;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class r extends FrameLayout {
    public int a;
    public i40 b;
    public y c;
    public u3 d;
    public boolean e;
    public final boolean f;

    public r(Context context, boolean z10) {
        super(context);
        this.f = z10;
    }

    public float getItemHeight() {
        return this.b != null ? r0.F() : getMeasuredHeight();
    }

    public u3 getParticipant() {
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
            float f10 = f40.E5 ? 3.0f : 2.0f;
            float B = o10.B(14.0f, 2, org.telegram.messenger.g0.q.x) + (f40.E5 ? -org.telegram.messenger.g0.L(90.0f) : 0);
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) ((f40.F5 ? B / 2.0f : B / f10) + org.telegram.messenger.g0.L(4.0f)), TLObject.FLAG_30));
        }
    }

    public void setRenderer(y yVar) {
        this.c = yVar;
    }
}
