package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.ru0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class z extends ViewGroup implements ru0 {
    public boolean a;
    public androidx.emoji2.text.j b;
    public int c;
    public mg.c2 d;
    public Runnable e;

    public z(Context context) {
        super(context);
        this.a = false;
        this.b = null;
        this.c = 0;
        this.d = null;
        setWillNotDraw(false);
        setFocusable(true);
        setHapticFeedbackEnabled(true);
    }

    public static float s(Drawable drawable, float f7, float f10, float f11) {
        float intrinsicWidth = (drawable.getIntrinsicWidth() * f11) / drawable.getIntrinsicHeight();
        int i10 = (int) f7;
        int i11 = (int) f10;
        drawable.setBounds(i10, i11, ((int) intrinsicWidth) + i10, ((int) f11) + i11);
        return intrinsicWidth;
    }

    public static void t(int i10, int i11, Drawable drawable) {
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    public static void u(Drawable drawable, float f7, float f10) {
        int i10 = (int) f7;
        int i11 = (int) f10;
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    @Override // org.telegram.ui.Components.ru0
    public final void f(Runnable runnable) {
        this.e = runnable;
    }

    public int getBoundsLeft() {
        return 0;
    }

    public int getBoundsRight() {
        return getWidth();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View, org.telegram.ui.Cells.r9
    public void invalidate() {
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        super.invalidate();
    }

    public final void m() {
        this.a = false;
        androidx.emoji2.text.j jVar = this.b;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        mg.c2 c2Var = this.d;
        if (c2Var != null) {
            removeCallbacks(c2Var);
        }
    }

    public void p() {
        super.invalidate();
    }

    public boolean r() {
        return true;
    }

    public final void w() {
        if (this.a) {
            return;
        }
        this.a = true;
        if (this.d == null) {
            this.d = new mg.c2(this, 17);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
