package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e5 implements te.f, we.a {
    public final View a;
    public boolean b;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e = 1.0f;

    public e5(View view) {
        this.a = view;
    }

    @Override // we.a
    public final void a() {
        View view = this.a;
        if (f5.h(view)) {
            return;
        }
        if (view instanceof g5) {
            ((g5) view).X();
        } else {
            view.setVisibility(8);
        }
        c(1.0f, 1.0f);
    }

    @Override // te.f
    public final /* synthetic */ int b(boolean z9) {
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
        return (obj instanceof e5) && ((e5) obj).a == this.a;
    }

    @Override // te.f
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // te.f
    public final int getWidth() {
        return f5.f(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
