package di;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.lp;
import org.telegram.ui.f31;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class xb extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Canvas c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Paint h;
    public final /* synthetic */ Bitmap n;
    public final /* synthetic */ Paint r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float v;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(context);
        this.a = i10;
        this.w = notificationCenterDelegate;
        this.b = z10;
        this.c = canvas;
        this.d = f7;
        this.e = f10;
        this.f = f11;
        this.h = paint;
        this.n = bitmap;
        this.r = paint2;
        this.s = f12;
        this.v = f13;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                pc pcVar = (pc) this.w;
                super.onDraw(canvas);
                boolean z10 = this.b;
                Paint paint = this.r;
                float f7 = this.f;
                float f10 = this.e;
                float f11 = this.d;
                if (z10) {
                    float f12 = pcVar.D2;
                    if (f12 > 0.0f) {
                        this.c.drawCircle(f11, f10, f7 * f12, this.h);
                    }
                    canvas.drawBitmap(this.n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - pcVar.D2) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.s, this.v);
                pcVar.i1.draw(canvas);
                canvas.restore();
                break;
            case 1:
                lp lpVar = (lp) this.w;
                super.onDraw(canvas);
                boolean z11 = this.b;
                Paint paint2 = this.r;
                float f13 = this.f;
                float f14 = this.e;
                float f15 = this.d;
                if (z11) {
                    float f16 = lpVar.S;
                    if (f16 > 0.0f) {
                        this.c.drawCircle(f15, f14, f13 * f16, this.h);
                    }
                    canvas.drawBitmap(this.n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - lpVar.S) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.s, this.v);
                lpVar.G.draw(canvas);
                canvas.restore();
                break;
            default:
                f31 f31Var = (f31) this.w;
                super.onDraw(canvas);
                boolean z12 = this.b;
                Paint paint3 = this.r;
                float f17 = this.f;
                float f18 = this.e;
                float f19 = this.d;
                if (z12) {
                    float f20 = f31Var.P;
                    if (f20 > 0.0f) {
                        this.c.drawCircle(f19, f18, f17 * f20, this.h);
                    }
                    canvas.drawBitmap(this.n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - f31Var.P) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.s, this.v);
                f31Var.F.draw(canvas);
                canvas.restore();
                break;
        }
    }
}
