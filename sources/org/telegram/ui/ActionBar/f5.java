package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f5 implements te.f, we.a {
    public final View a;
    public boolean b;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e = 1.0f;

    public f5(View view) {
        this.a = view;
    }

    @Override // we.a
    public final void a() {
        View view = this.a;
        if (g5.h(view)) {
            return;
        }
        if (view instanceof h5) {
            ((h5) view).Y();
        } else {
            view.setVisibility(8);
        }
        c(1.0f, 1.0f);
    }

    @Override // te.f
    public final /* synthetic */ int b(boolean z10) {
        return 0;
    }

    public final void c(float f10, float f11) {
        float f12 = this.c;
        if (f12 == f10 && this.d == f11) {
            return;
        }
        View view = this.a;
        if (f12 == 1.0f) {
            this.e = view.getAlpha();
        }
        this.c = f10;
        this.d = f11;
        view.setAlpha(this.e * f10);
        float min = Math.min(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10), f11);
        view.setScaleX(min);
        view.setScaleY(min);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f5) && ((f5) obj).a == this.a;
    }

    @Override // te.f
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // te.f
    public final int getWidth() {
        return g5.f(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
