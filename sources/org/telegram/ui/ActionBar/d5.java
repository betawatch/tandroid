package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d5 implements qe.f, te.a {
    public final View a;
    public boolean b;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e = 1.0f;

    public d5(View view) {
        this.a = view;
    }

    @Override // te.a
    public final void a() {
        View view = this.a;
        if (e5.h(view)) {
            return;
        }
        if (view instanceof f5) {
            ((f5) view).X();
        } else {
            view.setVisibility(8);
        }
        c(1.0f, 1.0f);
    }

    @Override // qe.f
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
        return (obj instanceof d5) && ((d5) obj).a == this.a;
    }

    @Override // qe.f
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // qe.f
    public final int getWidth() {
        return e5.f(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
