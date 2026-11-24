// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hrb extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ krb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hrb(krb krbVar, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = krbVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        rc2 rc2Var;
        switch (this.a) {
            case 0:
                krb krbVar = this.b;
                if (krbVar.y <= 0.0f || krbVar.w == null) {
                    canvas2 = canvas;
                } else {
                    krbVar.x.reset();
                    float width = getWidth() / krbVar.r.getWidth();
                    krbVar.x.postScale(width, width);
                    krbVar.s.setLocalMatrix(krbVar.x);
                    krbVar.w.setAlpha((int) (krbVar.y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), krbVar.w);
                }
                if (krbVar.O && (rc2Var = krbVar.L) != null) {
                    rc2Var.c6 = krbVar.P;
                    rc2Var.invalidate();
                    krbVar.O = false;
                }
                super.dispatchDraw(canvas2);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                this.b.b(true);
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 1:
                krb krbVar = this.b;
                if (view != krbVar.K && view != krbVar.J) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                canvas.clipRect(0.0f, gm.R1(krbVar.M, 0.0f, krbVar.y), getWidth(), gm.R1(krbVar.N, getHeight(), krbVar.y));
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                this.b.d();
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 2:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                krb krbVar = this.b;
                krbVar.e();
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    ViewGroup viewGroup = krbVar.T;
                    if (childAt == viewGroup) {
                        float f = krbVar.U;
                        if (f > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    ViewGroup viewGroup2 = krbVar.R;
                    if (childAt == viewGroup2) {
                        float f2 = krbVar.S;
                        if (f2 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f2), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                        }
                    }
                    v29 v29Var = krbVar.Q;
                    if (childAt == v29Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(v29Var.getTotalWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
                    }
                }
                setMeasuredDimension(size, size2);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i, i2, i3, i4);
                krb krbVar = this.b;
                tl0.c(krbVar.F, krbVar.b);
                krbVar.G.d();
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }
}
