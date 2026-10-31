package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n5 implements fe.i, ie.a {
    public final View a;
    public boolean b;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e = 1.0f;

    public n5(View view) {
        this.a = view;
    }

    @Override // ie.a
    public final void a() {
        View view = this.a;
        if (o5.h(view)) {
            return;
        }
        if (view instanceof p5) {
            ((p5) view).X();
        } else {
            view.setVisibility(8);
        }
        c(1.0f, 1.0f);
    }

    @Override // fe.i
    public final /* synthetic */ int b(boolean z10) {
        return 0;
    }

    public final void c(float f7, float f10) {
        float f11 = this.c;
        if (f11 == f7 && this.d == f10) {
            return;
        }
        View view = this.a;
        if (f11 == 1.0f) {
            this.e = view.getAlpha();
        }
        this.c = f7;
        this.d = f10;
        view.setAlpha(this.e * f7);
        float min = Math.min(org.telegram.messenger.i0.T1(0.6f, 1.0f, f7), f10);
        view.setScaleX(min);
        view.setScaleY(min);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n5) && ((n5) obj).a == this.a;
    }

    @Override // fe.i
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // fe.i
    public final int getWidth() {
        return o5.f(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
