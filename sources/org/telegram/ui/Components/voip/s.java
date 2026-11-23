package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.m10;
import org.telegram.messenger.u3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.e40;
import org.telegram.ui.h40;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class s extends FrameLayout {
    public int a;
    public h40 b;
    public z c;
    public u3 d;
    public boolean e;
    public final boolean f;

    public s(Context context, boolean z10) {
        super(context);
        this.f = z10;
    }

    public float getItemHeight() {
        return this.b != null ? r0.F() : getMeasuredHeight();
    }

    public u3 getParticipant() {
        return this.d;
    }

    public z getRenderer() {
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
            float f10 = e40.E5 ? 3.0f : 2.0f;
            float B = m10.B(14.0f, 2, org.telegram.messenger.g0.q.x) + (e40.E5 ? -org.telegram.messenger.g0.L(90.0f) : 0);
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) ((e40.F5 ? B / 2.0f : B / f10) + org.telegram.messenger.g0.L(4.0f)), TLObject.FLAG_30));
        }
    }

    public void setRenderer(z zVar) {
        this.c = zVar;
    }
}
