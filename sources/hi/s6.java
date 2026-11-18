package hi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s6 implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.x2 b;

    public /* synthetic */ s6(org.telegram.ui.ActionBar.x2 x2Var, int i7) {
        this.a = i7;
        this.b = x2Var;
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
                ck0 ck0Var = v6Var.o1;
                ih.d.b(ck0Var, canvas, rectF, ck0Var, v6Var.b, ks.e4);
                break;
            default:
                org.telegram.ui.ActionBar.x2 x2Var = this.b;
                ViewGroup viewGroup = x2Var.b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == x2Var.c) {
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
