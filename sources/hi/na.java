package hi;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class na extends oa {
    public final /* synthetic */ fi.p g;
    public final /* synthetic */ float h;

    public na(fi.p pVar, float f10) {
        this.g = pVar;
        this.h = f10;
    }

    @Override // hi.oa
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        fi.p pVar = this.g;
        float f11 = this.h;
        pVar.c(canvas, f11, f11, pow);
    }

    @Override // hi.oa
    public final void e() {
        fi.p pVar = this.g;
        pVar.post(new fi.o(pVar, 1));
    }

    @Override // hi.oa
    public final void f(boolean z10) {
        fi.p pVar = this.g;
        pVar.x = true;
        pVar.invalidate();
        if (z10) {
            pVar.getLocationInWindow(new int[2]);
            LaunchActivity.b0((pVar.getWidth() / 2.0f) + r6[0], (pVar.getHeight() / 2.0f) + r6[1], 1.0f);
        }
    }
}
