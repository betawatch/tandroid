package bi;

import android.graphics.Canvas;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class wd extends xd {
    public final /* synthetic */ zh.k g;
    public final /* synthetic */ float h;

    public wd(zh.k kVar, float f7) {
        this.g = kVar;
        this.h = f7;
    }

    @Override // bi.xd
    public final void a(Canvas canvas, float f7) {
        float pow = (float) Math.pow(f7, 16.0d);
        zh.k kVar = this.g;
        float f10 = this.h;
        kVar.c(canvas, f10, f10, pow);
    }

    @Override // bi.xd
    public final void e() {
        zh.k kVar = this.g;
        kVar.post(new vd(kVar, 0));
    }

    @Override // bi.xd
    public final void f(boolean z10) {
        zh.k kVar = this.g;
        kVar.w = true;
        kVar.invalidate();
        if (z10) {
            kVar.getLocationInWindow(new int[2]);
            LaunchActivity.b0((kVar.getWidth() / 2.0f) + r6[0], (kVar.getHeight() / 2.0f) + r6[1], 1.0f);
        }
    }
}
