package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class jl extends org.telegram.ui.Components.v9 {
    public final /* synthetic */ int G = 0;
    public Object H;
    public Object I;
    public Object J;

    public /* synthetic */ jl(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.G) {
            case 1:
                vh.h hVar = (vh.h) this.I;
                Path path = (Path) this.H;
                super.draw(canvas);
                if (((org.telegram.ui.Components.qo) this.J).h) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.a.getImageX(), this.a.getImageY(), this.a.getImageX2(), this.a.getImageY2());
                    path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    hVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    hVar.setBounds((int) this.a.getImageX(), (int) this.a.getImageY(), (int) this.a.getImageX2(), (int) this.a.getImageY2());
                    hVar.draw(canvas);
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

    @Override // org.telegram.ui.Components.v9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                float[] fArr = (float[]) this.J;
                vh.h hVar = (vh.h) this.I;
                Path path = (Path) this.H;
                super.onDraw(canvas);
                if (this.r) {
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    int[] roundRadius = this.a.getRoundRadius();
                    float f7 = roundRadius[0];
                    fArr[1] = f7;
                    fArr[0] = f7;
                    float f10 = roundRadius[1];
                    fArr[3] = f10;
                    fArr[2] = f10;
                    float f11 = roundRadius[2];
                    fArr[5] = f11;
                    fArr[4] = f11;
                    float f12 = roundRadius[3];
                    fArr[7] = f12;
                    fArr[6] = f12;
                    path.rewind();
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    hVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    hVar.setBounds(0, 0, getWidth(), getHeight());
                    hVar.draw(canvas);
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
                org.telegram.ui.Components.voip.h hVar2 = (org.telegram.ui.Components.voip.h) this.I;
                super.onDraw(canvas);
                org.telegram.ui.Components.a60 a60Var = (org.telegram.ui.Components.a60) this.J;
                if (a60Var.v0) {
                    int i10 = a60Var.Q0;
                    hVar2.f = i10;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f13 = i10;
                    rectF2.set(0.0f, 0.0f, f13, f13);
                    float width = rectF2.width() / 2.0f;
                    canvas.drawRoundRect(rectF2, width, width, (Paint) this.H);
                    rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                    hVar2.a(width, canvas, rectF2, null);
                    invalidate();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.voip.h hVar3 = (org.telegram.ui.Components.voip.h) this.I;
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.z50) this.J).f0) {
                    float min = Math.min(getWidth(), getHeight()) * 0.5f;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.drawRoundRect(rectF3, min, min, (Paint) this.H);
                    rectF3.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                    hVar3.f = getWidth();
                    hVar3.a(min, canvas, rectF3, null);
                    invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(org.telegram.ui.Components.qo qoVar, Context context, vh.h hVar) {
        super(context);
        this.J = qoVar;
        this.I = hVar;
        this.H = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(org.telegram.ui.Components.z50 z50Var, Context context, Paint paint) {
        super(context);
        this.J = z50Var;
        this.H = paint;
        this.I = new org.telegram.ui.Components.voip.h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(org.telegram.ui.Components.a60 a60Var, Context context, Paint paint) {
        super(context);
        this.J = a60Var;
        this.H = paint;
        this.I = new org.telegram.ui.Components.voip.h();
    }
}
