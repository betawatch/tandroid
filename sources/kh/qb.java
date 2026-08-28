package kh;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class qb extends rb {
    public final /* synthetic */ ih.q g;
    public final /* synthetic */ float h;

    public qb(ih.q qVar, float f10) {
        this.g = qVar;
        this.h = f10;
    }

    @Override // kh.rb
    public final void a(Canvas canvas, float f10) {
        float pow = (float) Math.pow(f10, 16.0d);
        ih.q qVar = this.g;
        float f11 = this.h;
        qVar.c(canvas, f11, f11, pow);
    }

    @Override // kh.rb
    public final void e() {
        ih.q qVar = this.g;
        qVar.post(new ih.p(qVar, 1));
    }

    @Override // kh.rb
    public final void f(boolean z10) {
        ih.q qVar = this.g;
        qVar.w = true;
        qVar.invalidate();
        if (z10) {
            qVar.getLocationInWindow(new int[2]);
            LaunchActivity.b0((qVar.getWidth() / 2.0f) + r6[0], (qVar.getHeight() / 2.0f) + r6[1], 1.0f);
        }
    }
}
