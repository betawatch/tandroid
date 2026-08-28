package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.uu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class a0 extends ViewGroup implements uu0 {
    public boolean a;
    public androidx.emoji2.text.i b;
    public int c;
    public m.i3 d;
    public Runnable e;

    public a0(Context context) {
        super(context);
        this.a = false;
        this.b = null;
        this.c = 0;
        this.d = null;
        setWillNotDraw(false);
        setFocusable(true);
        setHapticFeedbackEnabled(true);
    }

    public static float n(Drawable drawable, float f10, float f11, float f12) {
        float intrinsicWidth = (drawable.getIntrinsicWidth() * f12) / drawable.getIntrinsicHeight();
        int i9 = (int) f10;
        int i10 = (int) f11;
        drawable.setBounds(i9, i10, ((int) intrinsicWidth) + i9, ((int) f12) + i10);
        return intrinsicWidth;
    }

    public static void o(int i9, int i10, Drawable drawable) {
        drawable.setBounds(i9, i10, drawable.getIntrinsicWidth() + i9, drawable.getIntrinsicHeight() + i10);
    }

    public static void p(Drawable drawable, float f10, float f11) {
        int i9 = (int) f10;
        int i10 = (int) f11;
        drawable.setBounds(i9, i10, drawable.getIntrinsicWidth() + i9, drawable.getIntrinsicHeight() + i10);
    }

    @Override // org.telegram.ui.Components.uu0
    public final void g(Runnable runnable) {
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

    @Override // android.view.View
    public void invalidate() {
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        super.invalidate();
    }

    public final void k() {
        this.a = false;
        androidx.emoji2.text.i iVar = this.b;
        if (iVar != null) {
            removeCallbacks(iVar);
        }
        m.i3 i3Var = this.d;
        if (i3Var != null) {
            removeCallbacks(i3Var);
        }
    }

    public void l() {
        super.invalidate();
    }

    public boolean m() {
        return true;
    }

    public final void q() {
        if (this.a) {
            return;
        }
        this.a = true;
        if (this.d == null) {
            this.d = new m.i3(this, 4);
        }
        postDelayed(this.d, ViewConfiguration.getTapTimeout());
    }
}
