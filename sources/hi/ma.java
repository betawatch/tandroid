package hi;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class ma extends na {
    public final /* synthetic */ fi.p g;
    public final /* synthetic */ float h;

    public ma(fi.p pVar, float f10) {
        this.g = pVar;
        this.h = f10;
    }

    @Override // hi.na
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        fi.p pVar = this.g;
        float f11 = this.h;
        pVar.c(canvas, f11, f11, pow);
    }

    @Override // hi.na
    public final void e() {
        fi.p pVar = this.g;
        pVar.post(new fi.o(pVar, 1));
    }

    @Override // hi.na
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
