package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xt extends EdgeEffect {
    public final int a;
    public final vt b;
    public final RecyclerView c;
    public final bq d;
    public boolean e;

    public xt(RecyclerView recyclerView, int i10, vt vtVar) {
        super(recyclerView.getContext());
        this.d = new bq(this, 8);
        this.c = recyclerView;
        this.a = i10;
        this.b = vtVar;
    }

    public final void a() {
        boolean b10 = b();
        if (this.e != b10) {
            this.e = b10;
            vt vtVar = this.b;
            if (vtVar != null) {
                vtVar.a(this.a, b10);
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
    public final void onPull(float f7) {
        super.onPull(f7);
        a();
    }

    @Override // android.widget.EdgeEffect
    public final float onPullDistance(float f7, float f10) {
        float onPullDistance = super.onPullDistance(f7, f10);
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
    public final void onPull(float f7, float f10) {
        super.onPull(f7, f10);
        a();
    }
}
