package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class pk extends org.telegram.ui.Components.l9 {
    public final /* synthetic */ int G = 0;
    public Object H;
    public Object I;
    public Object J;

    public /* synthetic */ pk(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.G) {
            case 1:
                xh.f fVar = (xh.f) this.I;
                Path path = (Path) this.H;
                super.draw(canvas);
                if (((org.telegram.ui.Components.zn) this.J).h) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    ImageReceiver imageReceiver = this.a;
                    rectF.set(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), this.a.A());
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    ImageReceiver imageReceiver2 = this.a;
                    fVar.setBounds((int) imageReceiver2.K0, (int) imageReceiver2.L0, (int) imageReceiver2.y(), (int) this.a.A());
                    fVar.draw(canvas);
                    invalidate();
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                float[] fArr = (float[]) this.J;
                xh.f fVar = (xh.f) this.I;
                Path path = (Path) this.H;
                super.onDraw(canvas);
                if (this.r) {
                    canvas.save();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    int[] iArr = this.a.W0;
                    float f10 = iArr[0];
                    fArr[1] = f10;
                    fArr[0] = f10;
                    float f11 = iArr[1];
                    fArr[3] = f11;
                    fArr[2] = f11;
                    float f12 = iArr[2];
                    fArr[5] = f12;
                    fArr[4] = f12;
                    float f13 = iArr[3];
                    fArr[7] = f13;
                    fArr[6] = f13;
                    path.rewind();
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    fVar.setBounds(0, 0, getWidth(), getHeight());
                    fVar.draw(canvas);
                    canvas.restore();
                    invalidate();
                    break;
                }
                break;
            case 1:
            default:
                super.onDraw(canvas);
                break;
            case 2:
                org.telegram.ui.Components.voip.n nVar = (org.telegram.ui.Components.voip.n) this.I;
                super.onDraw(canvas);
                org.telegram.ui.Components.o40 o40Var = (org.telegram.ui.Components.o40) this.J;
                if (o40Var.w0) {
                    int i7 = o40Var.W0;
                    nVar.f = i7;
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f14 = i7;
                    rectF2.set(0.0f, 0.0f, f14, f14);
                    float width = rectF2.width() / 2.0f;
                    canvas.drawRoundRect(rectF2, width, width, (Paint) this.H);
                    rectF2.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    nVar.a(width, canvas, rectF2, null);
                    invalidate();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.voip.n nVar2 = (org.telegram.ui.Components.voip.n) this.I;
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.n40) this.J).m0) {
                    float min = Math.min(getWidth(), getHeight()) * 0.5f;
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.drawRoundRect(rectF3, min, min, (Paint) this.H);
                    rectF3.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    nVar2.f = getWidth();
                    nVar2.a(min, canvas, rectF3, null);
                    invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(org.telegram.ui.Components.zn znVar, Context context, xh.f fVar) {
        super(context);
        this.J = znVar;
        this.I = fVar;
        this.H = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(org.telegram.ui.Components.n40 n40Var, Context context, Paint paint) {
        super(context);
        this.J = n40Var;
        this.H = paint;
        this.I = new org.telegram.ui.Components.voip.n();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(org.telegram.ui.Components.o40 o40Var, Context context, Paint paint) {
        super(context);
        this.J = o40Var;
        this.H = paint;
        this.I = new org.telegram.ui.Components.voip.n();
    }
}
