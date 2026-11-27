// default package

import android.content.Context;
import android.graphics.Canvas;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class crc extends in {
    public final /* synthetic */ byte s;
    public final /* synthetic */ frc w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ crc(frc frcVar, Context context, byte b) {
        super(context, false, true, true, true, true);
        this.s = b;
        this.w = frcVar;
    }

    public final /* synthetic */ void e(Canvas canvas) {
        super.onDraw(canvas);
    }

    public final /* synthetic */ void f(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // in, android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.s;
        byte b2 = 16;
        frc frcVar = this.w;
        switch (b) {
            case 0:
                float c = getDrawable().c();
                float a = frcVar.a();
                float min = (((c > 0.0f ? Math.min(1.0f, frcVar.V / c) : 1.0f) - a) * frcVar.U) + a;
                frcVar.b = min;
                int save = canvas.save();
                canvas.scale(min, min, 0.0f, getHeight() / 2.0f);
                float e = (1.0f - frcVar.U) * frcVar.g0.e(false, frcVar.e0);
                hn drawable = getDrawable();
                Objects.requireNonNull(drawable);
                frcVar.c(e, new ftb(drawable, b2), new vlc(this, canvas, (byte) 14));
                canvas.restoreToCount(save);
                break;
            default:
                float e2 = (1.0f - frcVar.U) * frcVar.g0.e(false, frcVar.e0);
                hn drawable2 = getDrawable();
                Objects.requireNonNull(drawable2);
                frcVar.c(e2, new ftb(drawable2, b2), new vlc(this, canvas, (byte) 15));
                break;
        }
    }
}
