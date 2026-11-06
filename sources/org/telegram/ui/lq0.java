package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class lq0 extends org.telegram.ui.Components.wy0 {
    public boolean a;
    public float b;
    public NestedScrollView c;
    public FrameLayout d;

    public lq0(Context context) {
        super(context);
        this.a = false;
        this.b = 1.0f;
    }

    public final void b(int i7, boolean z9) {
        super.setVisibility(i7);
        if (this.a && z9) {
            this.c.setVisibility(i7);
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
    public void setAlpha(float f10) {
        this.b = f10;
        if (this.a) {
            this.c.setAlpha(f10);
        } else {
            super.setAlpha(f10);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.c = nestedScrollView;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        if (this.a) {
            this.c.invalidate();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        b(i7, true);
    }
}
