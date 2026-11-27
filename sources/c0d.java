// default package

import android.graphics.Canvas;
import android.graphics.Picture;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class c0d extends d0d {
    public final Picture e;
    public boolean f;

    public c0d(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.e = new Picture();
    }

    @Override // d0d
    public final Canvas a() {
        this.f = true;
        return this.e.beginRecording(Math.max(1, this.c - this.a), Math.max(1, this.d - this.b));
    }

    @Override // d0d
    public final void b() {
        if (this.f) {
            d();
        }
    }

    @Override // d0d
    public final void c(Canvas canvas, float f) {
        Canvas canvas2;
        int save;
        if (this.f || f <= 0.0f) {
            return;
        }
        int i = this.b;
        int i2 = this.a;
        if (f < 1.0f) {
            canvas2 = canvas;
            save = canvas2.saveLayerAlpha(i2, i, this.c, this.d, Math.round(f * 255.0f));
        } else {
            canvas2 = canvas;
            save = canvas2.save();
        }
        canvas2.translate(i2, i);
        canvas2.drawPicture(this.e);
        canvas2.restoreToCount(save);
    }

    @Override // d0d
    public final void d() {
        this.e.endRecording();
        this.f = false;
    }
}
