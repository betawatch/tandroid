package org.telegram.ui.Components.voip;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.s3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.a40;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class k extends FrameLayout {
    public int a;
    public a40 b;
    public r c;
    public s3 d;
    public boolean e;
    public final boolean f;

    public k(Context context, boolean z10) {
        super(context);
        this.f = z10;
    }

    public float getItemHeight() {
        return this.b != null ? r0.F() : getMeasuredHeight();
    }

    public s3 getParticipant() {
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
    public final void onMeasure(int i3, int i10) {
        if (this.f) {
            ((View) getParent()).getMeasuredWidth();
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(this.b.F(), TLObject.FLAG_30));
        } else {
            float f10 = x30.x5 ? 3.0f : 2.0f;
            float A = org.telegram.messenger.camera.q.A(14.0f, 2, org.telegram.messenger.g0.q.x) + (x30.x5 ? -org.telegram.messenger.g0.L(90.0f) : 0);
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((int) ((x30.y5 ? A / 2.0f : A / f10) + org.telegram.messenger.g0.L(4.0f)), TLObject.FLAG_30));
        }
    }

    public void setRenderer(r rVar) {
        this.c = rVar;
    }
}
