package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w5 implements oe.h, re.a {
    public final View a;
    public boolean b;
    public float c = 1.0f;
    public float d = 1.0f;
    public float e = 1.0f;

    public w5(View view) {
        this.a = view;
    }

    @Override // re.a
    public final void a() {
        View view = this.a;
        if (x5.g(view)) {
            return;
        }
        if (view instanceof y5) {
            ((y5) view).X();
        } else {
            view.setVisibility(8);
        }
        c(1.0f, 1.0f);
    }

    @Override // oe.h
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
        float min = Math.min(AndroidUtilities.lerp(0.6f, 1.0f, f7), f10);
        view.setScaleX(min);
        view.setScaleY(min);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w5) && ((w5) obj).a == this.a;
    }

    @Override // oe.h
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // oe.h
    public final int getWidth() {
        return x5.e(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
