package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.i20;
import org.telegram.messenger.s3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.c40;
import org.telegram.ui.f40;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class r extends FrameLayout {
    public int a;
    public f40 b;
    public z c;
    public s3 d;
    public boolean e;
    public final boolean f;

    public r(Context context, boolean z10) {
        super(context);
        this.f = z10;
    }

    public float getItemHeight() {
        return this.b != null ? r0.F() : getMeasuredHeight();
    }

    public s3 getParticipant() {
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
            float f10 = c40.E5 ? 3.0f : 2.0f;
            float A = i20.A(14.0f, 2, org.telegram.messenger.g0.q.x) + (c40.E5 ? -org.telegram.messenger.g0.L(90.0f) : 0);
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) ((c40.F5 ? A / 2.0f : A / f10) + org.telegram.messenger.g0.L(4.0f)), TLObject.FLAG_30));
        }
    }

    public void setRenderer(z zVar) {
        this.c = zVar;
    }
}
