package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cq0 extends org.telegram.ui.Components.vy0 {
    public boolean a;
    public float b;
    public NestedScrollView c;
    public FrameLayout d;

    public cq0(Context context) {
        super(context);
        this.a = false;
        this.b = 1.0f;
    }

    public final void b(int i3, boolean z10) {
        super.setVisibility(i3);
        if (this.a && z10) {
            this.c.setVisibility(i3);
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
    public void setVisibility(int i3) {
        b(i3, true);
    }
}
