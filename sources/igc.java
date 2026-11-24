// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class igc extends wgc {
    public boolean W;
    public final Path a0;
    public final /* synthetic */ jgc b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igc(jgc jgcVar, Context context) {
        super(context, null);
        this.b0 = jgcVar;
        this.a0 = new Path();
    }

    @Override // wgc
    public final boolean d(MotionEvent motionEvent) {
        Object b0 = ((bj6) this.b0).b0();
        if (b0 instanceof aj6) {
            return ((aj6) b0).X(motionEvent, false);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            Path path = this.a0;
            path.rewind();
            float N = gm.N(24.0f);
            RectF rectF = gm.P;
            rectF.set(0.0f, gm.m, getWidth(), getHeight());
            path.addRoundRect(rectF, N, N, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.W) {
            canvas.restore();
        }
    }

    @Override // wgc
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // wgc
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // wgc
    public final boolean h(MotionEvent motionEvent) {
        Object b0 = ((bj6) this.b0).b0();
        if (b0 instanceof aj6) {
            return ((aj6) b0).X(motionEvent, true);
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // wgc
    public final void s(View view, View view2, int i, int i2) {
        this.b0.Z();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setTabletLayout(boolean z) {
        if (this.W == z) {
            return;
        }
        this.W = z;
        invalidate();
    }

    @Override // wgc
    public final void t() {
        nk3 nk3Var;
        jgc jgcVar = this.b0;
        bj6 bj6Var = (bj6) jgcVar;
        if (bj6Var.F != null) {
            bj6Var.o0(bj6Var.c.getCurrentPosition(), true);
            bj6Var.p0(false, 0.0f);
        }
        bj6Var.c0();
        igc igcVar = bj6Var.c;
        if (igcVar != null) {
            int currentPosition = igcVar.getCurrentPosition();
            if (currentPosition != 3) {
                SparseArray sparseArray = bj6Var.a;
                hgc hgcVar = (hgc) sparseArray.get(3);
                if (hgcVar != null) {
                    d dVar = hgcVar.a;
                    if (hgcVar.c) {
                        dVar.onBecomeFullyHidden();
                    }
                    if (hgcVar.d) {
                        dVar.onPause();
                    }
                    dVar.onFragmentDestroy();
                    dVar.setParentLayout(null);
                }
                sparseArray.remove(3);
            }
            Integer num = bj6Var.I;
            if (num != null && currentPosition == 0 && (nk3Var = bj6Var.J) != null) {
                nk3Var.Q4(num.intValue());
                bj6Var.I = null;
            }
        }
        jgcVar.Z();
    }

    @Override // wgc
    public final void w(boolean z) {
        jgc jgcVar = this.b0;
        bj6 bj6Var = (bj6) jgcVar;
        boolean z2 = !z;
        if (bj6Var.F != null) {
            float positionAnimated = bj6Var.c.getPositionAnimated();
            bj6Var.p0(z2, positionAnimated);
            if (!z) {
                bj6Var.o0(Math.round(positionAnimated), true);
            }
        }
        bj6Var.g0();
        bj6Var.c0();
        bj6Var.b.invalidate();
        jgcVar.Z();
        jgcVar.checkSystemBarColors();
    }
}
