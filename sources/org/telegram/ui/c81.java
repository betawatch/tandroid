package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class c81 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ f81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c81(f81 f81Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = f81Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.a) {
            case 0:
                f81 f81Var = this.b;
                if (f81Var.y <= 0.0f || f81Var.w == null) {
                    canvas2 = canvas;
                } else {
                    f81Var.x.reset();
                    float width = getWidth() / f81Var.r.getWidth();
                    f81Var.x.postScale(width, width);
                    f81Var.s.setLocalMatrix(f81Var.x);
                    f81Var.w.setAlpha((int) (f81Var.y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), f81Var.w);
                }
                if (f81Var.N && (q1Var = f81Var.K) != null) {
                    q1Var.b6 = f81Var.O;
                    q1Var.invalidate();
                    f81Var.N = false;
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
                f81 f81Var = this.b;
                if (view != f81Var.J && view != f81Var.I) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(f81Var.L, 0.0f, f81Var.y), getWidth(), org.telegram.messenger.g0.T1(f81Var.M, getHeight(), f81Var.y));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                this.b.d();
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 2:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                f81 f81Var = this.b;
                f81Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = f81Var.S;
                    if (childAt == viewGroup) {
                        float f10 = f81Var.T;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    ViewGroup viewGroup2 = f81Var.Q;
                    if (childAt == viewGroup2) {
                        float f11 = f81Var.R;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    org.telegram.ui.Components.ii0 ii0Var = f81Var.P;
                    if (childAt == ii0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(ii0Var.getTotalWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                f81 f81Var = this.b;
                ih.d.c(f81Var.E, f81Var.b);
                f81Var.F.d();
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }
}
