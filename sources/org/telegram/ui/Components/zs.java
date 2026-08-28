package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zs extends EdgeEffect {
    public final int a;
    public final ys b;
    public final RecyclerView c;
    public final np d;
    public boolean e;

    public zs(RecyclerView recyclerView, int i9, ys ysVar) {
        super(recyclerView.getContext());
        this.d = new np(this, 7);
        this.c = recyclerView;
        this.a = i9;
        this.b = ysVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.e != b10) {
            this.e = b10;
            ys ysVar = this.b;
            if (ysVar != null) {
                ysVar.a(this.a, b10);
            }
        }
    }

    public final boolean b() {
        if (isFinished()) {
            return false;
        }
        return Build.VERSION.SDK_INT < 31 || getDistance() != 0.0f;
    }

    @Override // android.widget.EdgeEffect
    public final boolean draw(Canvas canvas) {
        boolean draw = super.draw(canvas);
        this.c.postOnAnimation(this.d);
        return draw;
    }

    @Override // android.widget.EdgeEffect
    public final void finish() {
        super.finish();
        a();
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i9) {
        super.onAbsorb(i9);
        a();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10) {
        super.onPull(f10);
        a();
    }

    @Override // android.widget.EdgeEffect
    public final float onPullDistance(float f10, float f11) {
        float onPullDistance = super.onPullDistance(f10, f11);
        a();
        return onPullDistance;
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        a();
    }

    @Override // android.widget.EdgeEffect
    public final void setSize(int i9, int i10) {
        super.setSize(i9, i10);
        a();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10, float f11) {
        super.onPull(f10, f11);
        a();
    }
}
