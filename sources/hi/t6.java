package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t6 implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2 b;

    public /* synthetic */ t6(org.telegram.ui.ActionBar.u2 u2Var, int i7) {
        this.a = i7;
        this.b = u2Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // eh.a
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // eh.a
    public final void d(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                v6 v6Var = (v6) this.b;
                uj0 uj0Var = v6Var.o1;
                ih.d.b(uj0Var, canvas, rectF, uj0Var, v6Var.b, ns.e4);
                break;
            default:
                org.telegram.ui.ActionBar.u2 u2Var = this.b;
                ViewGroup viewGroup = u2Var.b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == u2Var.c) {
                    canvas.save();
                    canvas.translate(viewGroup.getX(), viewGroup.getY());
                    viewGroup.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
        }
    }
}
