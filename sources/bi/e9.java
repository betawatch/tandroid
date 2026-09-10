package bi;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class e9 implements zg.g {
    public final /* synthetic */ i9 a;

    public e9(i9 i9Var) {
        this.a = i9Var;
    }

    @Override // zg.g
    public final void d(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        i9 i9Var = this.a;
        canvas.drawColor(i9Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            i9Var.l0.b(canvas, -3);
        }
    }

    @Override // zg.g
    public final void u(g.z zVar) {
        zVar.a(this.a.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        zVar.b(SharedConfig.chatBlurEnabled());
    }
}
