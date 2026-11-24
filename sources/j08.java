// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class j08 extends o39 {
    public final /* synthetic */ boolean f3;
    public final /* synthetic */ t08 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j08(t08 t08Var, Context context, wjb wjbVar, int i) {
        super(context, wjbVar);
        this.g3 = t08Var;
        this.f3 = i;
    }

    @Override // o39
    public final Integer W0(int i) {
        t08 t08Var = this.g3;
        if ((i < t08Var.c0 || i >= t08Var.d0) && (i < t08Var.e0 || i >= t08Var.f0)) {
            return super.W0(i);
        }
        return 0;
    }

    @Override // o39, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        t08 t08Var = this.g3;
        z08 z08Var = t08Var.F;
        if (!t08Var.H || z08Var == null || t08Var.G == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(z08Var.getLeft() + t08Var.G.getLeft(), t08Var.G.getTop());
        z08Var.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        t08 t08Var = this.g3;
        t08Var.h();
        if (t08Var.L != null) {
            if (t08Var.K == null || !t08Var.b()) {
                return;
            }
            t08Var.K.l(false);
            return;
        }
        a18 a18Var = t08Var.q0;
        xsa xsaVar = this.f3 ? a18Var.c : a18Var.b;
        if (xsaVar == null || !t08Var.b()) {
            return;
        }
        xsaVar.a();
    }
}
