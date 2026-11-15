package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ts extends EdgeEffect {
    public final int a;
    public final rs b;
    public final RecyclerView c;
    public final fo d;
    public boolean e;

    public ts(RecyclerView recyclerView, int i7, rs rsVar) {
        super(recyclerView.getContext());
        this.d = new fo(this, 9);
        this.c = recyclerView;
        this.a = i7;
        this.b = rsVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.e != b10) {
            this.e = b10;
            rs rsVar = this.b;
            if (rsVar != null) {
                rsVar.a(this.a, b10);
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
    public final void onAbsorb(int i7) {
        super.onAbsorb(i7);
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
    public final void setSize(int i7, int i10) {
        super.setSize(i7, i10);
        a();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10, float f11) {
        super.onPull(f10, f11);
        a();
    }
}
