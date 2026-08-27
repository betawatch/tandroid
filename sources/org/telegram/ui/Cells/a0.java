package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.Components.wu0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class a0 extends ViewGroup implements wu0 {
    public boolean a;
    public androidx.emoji2.text.j b;
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
        int i10 = (int) f10;
        int i11 = (int) f11;
        drawable.setBounds(i10, i11, ((int) intrinsicWidth) + i10, ((int) f12) + i11);
        return intrinsicWidth;
    }

    public static void p(int i10, int i11, Drawable drawable) {
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    public static void q(Drawable drawable, float f10, float f11) {
        int i10 = (int) f10;
        int i11 = (int) f11;
        drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
    }

    @Override // org.telegram.ui.Components.wu0
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
        androidx.emoji2.text.j jVar = this.b;
        if (jVar != null) {
            removeCallbacks(jVar);
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

    public final void r() {
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
