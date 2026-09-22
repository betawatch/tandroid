package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class hw0 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ mw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hw0(mw0 mw0Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = mw0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.a) {
            case 0:
                mw0 mw0Var = this.b;
                if (mw0Var.y <= 0.0f || mw0Var.w == null) {
                    canvas2 = canvas;
                } else {
                    mw0Var.x.reset();
                    float width = getWidth() / mw0Var.s.getWidth();
                    mw0Var.x.postScale(width, width);
                    mw0Var.v.setLocalMatrix(mw0Var.x);
                    mw0Var.w.setAlpha((int) (mw0Var.y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), mw0Var.w);
                }
                if (mw0Var.O && (t1Var = mw0Var.L) != null) {
                    t1Var.L7 = mw0Var.P;
                    t1Var.invalidate();
                    mw0Var.O = false;
                }
                super.dispatchDraw(canvas2);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                this.b.c(true);
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 1:
                mw0 mw0Var = this.b;
                if (view != mw0Var.K && view != mw0Var.J) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(mw0Var.M, 0.0f, mw0Var.y), getWidth(), AndroidUtilities.lerp(mw0Var.N, getHeight(), mw0Var.y));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.b.d();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                mw0 mw0Var = this.b;
                mw0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = mw0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = mw0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    ViewGroup viewGroup2 = mw0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = mw0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    org.telegram.ui.Components.fk0 fk0Var = mw0Var.Q;
                    if (childAt == fk0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(fk0Var.getTotalWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                mw0 mw0Var = this.b;
                gh.d.c(mw0Var.F, mw0Var.c);
                mw0Var.G.d();
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }
}
