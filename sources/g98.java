// default package

import android.content.Context;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class g98 extends ajb {
    public boolean a;
    public float b;
    public NestedScrollView c;
    public FrameLayout d;

    public g98(Context context) {
        super(context);
        this.a = false;
        this.b = 1.0f;
    }

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (this.a && z) {
            this.c.setVisibility(i);
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
    public void setAlpha(float f) {
        this.b = f;
        if (this.a) {
            this.c.setAlpha(f);
        } else {
            super.setAlpha(f);
        }
    }

    public void setContainer(FrameLayout frameLayout) {
        this.d = frameLayout;
    }

    public void setScrollView(NestedScrollView nestedScrollView) {
        this.c = nestedScrollView;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (this.a) {
            this.c.invalidate();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        b(i, true);
    }
}
