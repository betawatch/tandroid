package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Picture;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cb1 extends db1 {
    public final Picture e;
    public boolean f;

    public cb1(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        this.e = new Picture();
    }

    @Override // org.telegram.ui.Components.db1
    public final Canvas a() {
        this.f = true;
        return this.e.beginRecording(Math.max(1, this.c - this.a), Math.max(1, this.d - this.b));
    }

    @Override // org.telegram.ui.Components.db1
    public final boolean b(Canvas canvas) {
        return true;
    }

    @Override // org.telegram.ui.Components.db1
    public final void c() {
        if (this.f) {
            e();
        }
    }

    @Override // org.telegram.ui.Components.db1
    public final void d(Canvas canvas, float f7) {
        Canvas canvas2;
        int save;
        if (this.f || f7 <= 0.0f) {
            return;
        }
        int i10 = this.b;
        int i11 = this.a;
        if (f7 < 1.0f) {
            canvas2 = canvas;
            save = canvas2.saveLayerAlpha(i11, i10, this.c, this.d, Math.round(f7 * 255.0f));
        } else {
            canvas2 = canvas;
            save = canvas2.save();
        }
        canvas2.translate(i11, i10);
        canvas2.drawPicture(this.e);
        canvas2.restoreToCount(save);
    }

    @Override // org.telegram.ui.Components.db1
    public final void e() {
        this.e.endRecording();
        this.f = false;
    }

    @Override // org.telegram.ui.Components.db1
    public final boolean f() {
        return true;
    }
}
