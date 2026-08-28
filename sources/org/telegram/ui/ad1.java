package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ad1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad1(dd1 dd1Var, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = dd1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.a) {
            case 0:
                dd1 dd1Var = this.b;
                if (dd1Var.x <= 0.0f || dd1Var.v == null) {
                    canvas2 = canvas;
                } else {
                    dd1Var.w.reset();
                    float width = getWidth() / dd1Var.r.getWidth();
                    dd1Var.w.postScale(width, width);
                    dd1Var.s.setLocalMatrix(dd1Var.w);
                    dd1Var.v.setAlpha((int) (dd1Var.x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), dd1Var.v);
                }
                if (dd1Var.J && (t1Var = dd1Var.G) != null) {
                    t1Var.G7 = dd1Var.K;
                    t1Var.invalidate();
                    dd1Var.J = false;
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 1:
                dd1 dd1Var = this.b;
                if (view != dd1Var.F && view != dd1Var.E) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(dd1Var.H, 0.0f, dd1Var.x), getWidth(), AndroidUtilities.lerp(dd1Var.I, getHeight(), dd1Var.x));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i9, i10, i11, i12);
                this.b.d();
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 2:
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                dd1 dd1Var = this.b;
                dd1Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = dd1Var.O;
                    if (childAt == viewGroup) {
                        float f10 = dd1Var.P;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    ViewGroup viewGroup2 = dd1Var.M;
                    if (childAt == viewGroup2) {
                        float f11 = dd1Var.N;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    org.telegram.ui.Components.uj0 uj0Var = dd1Var.L;
                    if (childAt == uj0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(uj0Var.getTotalWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i9, i10, i11, i12);
                dd1 dd1Var = this.b;
                og.d.c(dd1Var.A, dd1Var.b);
                dd1Var.B.d();
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }
}
