package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lk extends org.telegram.ui.Components.k9 {
    public final /* synthetic */ int H = 0;
    public Object I;
    public Object J;
    public Object K;

    public /* synthetic */ lk(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.H) {
            case 1:
                yh.f fVar = (yh.f) this.J;
                Path path = (Path) this.I;
                super.draw(canvas);
                if (((org.telegram.ui.Components.yn) this.K).h) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    ImageReceiver imageReceiver = this.a;
                    rectF.set(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), this.a.A());
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                    ImageReceiver imageReceiver2 = this.a;
                    fVar.setBounds((int) imageReceiver2.L0, (int) imageReceiver2.M0, (int) imageReceiver2.y(), (int) this.a.A());
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

    @Override // org.telegram.ui.Components.k9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                float[] fArr = (float[]) this.K;
                yh.f fVar = (yh.f) this.J;
                Path path = (Path) this.I;
                super.onDraw(canvas);
                if (this.r) {
                    canvas.save();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    int[] iArr = this.a.X0;
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
                org.telegram.ui.Components.voip.g gVar = (org.telegram.ui.Components.voip.g) this.J;
                super.onDraw(canvas);
                org.telegram.ui.Components.k40 k40Var = (org.telegram.ui.Components.k40) this.K;
                if (k40Var.x0) {
                    int i3 = k40Var.X0;
                    gVar.f = i3;
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f14 = i3;
                    rectF2.set(0.0f, 0.0f, f14, f14);
                    float width = rectF2.width() / 2.0f;
                    canvas.drawRoundRect(rectF2, width, width, (Paint) this.I);
                    rectF2.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    gVar.a(width, canvas, rectF2, null);
                    invalidate();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.voip.g gVar2 = (org.telegram.ui.Components.voip.g) this.J;
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.j40) this.K).m0) {
                    float min = Math.min(getWidth(), getHeight()) * 0.5f;
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.drawRoundRect(rectF3, min, min, (Paint) this.I);
                    rectF3.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    gVar2.f = getWidth();
                    gVar2.a(min, canvas, rectF3, null);
                    invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(org.telegram.ui.Components.yn ynVar, Context context, yh.f fVar) {
        super(context);
        this.K = ynVar;
        this.J = fVar;
        this.I = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(org.telegram.ui.Components.j40 j40Var, Context context, Paint paint) {
        super(context);
        this.K = j40Var;
        this.I = paint;
        this.J = new org.telegram.ui.Components.voip.g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(org.telegram.ui.Components.k40 k40Var, Context context, Paint paint) {
        super(context);
        this.K = k40Var;
        this.I = paint;
        this.J = new org.telegram.ui.Components.voip.g();
    }
}
