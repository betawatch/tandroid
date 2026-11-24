// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m28 extends r59 {
    public final /* synthetic */ boolean f3;
    public final /* synthetic */ w28 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m28(w28 w28Var, Context context, ylb ylbVar, int i) {
        super(context, ylbVar);
        this.g3 = w28Var;
        this.f3 = i;
    }

    @Override // r59
    public final Integer W0(int i) {
        w28 w28Var = this.g3;
        if ((i < w28Var.c0 || i >= w28Var.d0) && (i < w28Var.e0 || i >= w28Var.f0)) {
            return super.W0(i);
        }
        return 0;
    }

    @Override // r59, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        w28 w28Var = this.g3;
        c38 c38Var = w28Var.F;
        if (!w28Var.H || c38Var == null || w28Var.G == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(c38Var.getLeft() + w28Var.G.getLeft(), w28Var.G.getTop());
        c38Var.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        w28 w28Var = this.g3;
        w28Var.h();
        if (w28Var.L != null) {
            if (w28Var.K == null || !w28Var.b()) {
                return;
            }
            w28Var.K.l(false);
            return;
        }
        d38 d38Var = w28Var.q0;
        ava avaVar = this.f3 ? d38Var.c : d38Var.b;
        if (avaVar == null || !w28Var.b()) {
            return;
        }
        avaVar.a();
    }
}
