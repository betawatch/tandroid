package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class et extends EdgeEffect {
    public final int a;
    public final dt b;
    public final RecyclerView c;
    public final rp d;
    public boolean e;

    public et(RecyclerView recyclerView, int i10, dt dtVar) {
        super(recyclerView.getContext());
        this.d = new rp(this, 7);
        this.c = recyclerView;
        this.a = i10;
        this.b = dtVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.e != b10) {
            this.e = b10;
            dt dtVar = this.b;
            if (dtVar != null) {
                dtVar.a(this.a, b10);
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
    public final void onAbsorb(int i10) {
        super.onAbsorb(i10);
        a();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f9) {
        super.onPull(f9);
        a();
    }

    @Override // android.widget.EdgeEffect
    public final float onPullDistance(float f9, float f10) {
        float onPullDistance = super.onPullDistance(f9, f10);
        a();
        return onPullDistance;
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        a();
    }

    @Override // android.widget.EdgeEffect
    public final void setSize(int i10, int i11) {
        super.setSize(i10, i11);
        a();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f9, float f10) {
        super.onPull(f9, f10);
        a();
    }
}
