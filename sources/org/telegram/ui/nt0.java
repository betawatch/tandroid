package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nt0 extends org.telegram.ui.Components.j01 {
    public boolean a;
    public float b;
    public NestedScrollView c;
    public FrameLayout d;

    public nt0(Context context) {
        super(context);
        this.a = false;
        this.b = 1.0f;
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (this.a && z10) {
            this.c.setVisibility(i10);
        }
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.a ? this.b : super.getAlpha();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null || getParent() != this.d) {
            return;
        }
        this.a = true;
        this.c.setVisibility(getVisibility());
        this.c.setAlpha(this.b);
        super.setAlpha(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a) {
            this.a = false;
            this.c.setVisibility(8);
            super.setAlpha(this.b);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        this.b = f9;
        if (this.a) {
            this.c.setAlpha(f9);
        } else {
            super.setAlpha(f9);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.c = nestedScrollView;
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        if (this.a) {
            this.c.invalidate();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
