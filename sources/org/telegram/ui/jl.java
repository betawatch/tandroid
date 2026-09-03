package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jl extends org.telegram.ui.Components.p9 {
    public final /* synthetic */ int D = 0;
    public Object E;
    public Object F;
    public Object G;

    public /* synthetic */ jl(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.D) {
            case 1:
                jh.k kVar = (jh.k) this.F;
                Path path = (Path) this.E;
                super.draw(canvas);
                if (((org.telegram.ui.Components.oo) this.G).h) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.a.getImageX(), this.a.getImageY(), this.a.getImageX2(), this.a.getImageY2());
                    path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    kVar.setBounds((int) this.a.getImageX(), (int) this.a.getImageY(), (int) this.a.getImageX2(), (int) this.a.getImageY2());
                    kVar.draw(canvas);
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

    @Override // org.telegram.ui.Components.p9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.D) {
            case 0:
                float[] fArr = (float[]) this.G;
                jh.k kVar = (jh.k) this.F;
                Path path = (Path) this.E;
                super.onDraw(canvas);
                if (this.r) {
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    int[] roundRadius = this.a.getRoundRadius();
                    float f10 = roundRadius[0];
                    fArr[1] = f10;
                    fArr[0] = f10;
                    float f11 = roundRadius[1];
                    fArr[3] = f11;
                    fArr[2] = f11;
                    float f12 = roundRadius[2];
                    fArr[5] = f12;
                    fArr[4] = f12;
                    float f13 = roundRadius[3];
                    fArr[7] = f13;
                    fArr[6] = f13;
                    path.rewind();
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    kVar.h(i0.a.k(-1, (int) (Color.alpha(-1) * 0.325f)));
                    kVar.setBounds(0, 0, getWidth(), getHeight());
                    kVar.draw(canvas);
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
                org.telegram.ui.Components.voip.h hVar = (org.telegram.ui.Components.voip.h) this.F;
                super.onDraw(canvas);
                org.telegram.ui.Components.z50 z50Var = (org.telegram.ui.Components.z50) this.G;
                if (z50Var.p0) {
                    int i10 = z50Var.K0;
                    hVar.f = i10;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f14 = i10;
                    rectF2.set(0.0f, 0.0f, f14, f14);
                    float width = rectF2.width() / 2.0f;
                    canvas.drawRoundRect(rectF2, width, width, (Paint) this.E);
                    rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                    hVar.a(width, canvas, rectF2, null);
                    invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(org.telegram.ui.Components.oo ooVar, Context context, jh.k kVar) {
        super(context);
        this.G = ooVar;
        this.F = kVar;
        this.E = new Path();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(org.telegram.ui.Components.z50 z50Var, Context context, Paint paint) {
        super(context);
        this.G = z50Var;
        this.E = paint;
        this.F = new org.telegram.ui.Components.voip.h();
    }
}
