package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 b;

    public /* synthetic */ u6(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.a = i7;
        this.b = w2Var;
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
                w6 w6Var = (w6) this.b;
                pj0 pj0Var = w6Var.n1;
                ih.d.b(pj0Var, canvas, rectF, pj0Var, w6Var.b, qs.e4);
                break;
            default:
                org.telegram.ui.ActionBar.w2 w2Var = this.b;
                ViewGroup viewGroup = w2Var.b;
                if (viewGroup != null && viewGroup.getVisibility() == 0 && viewGroup.getParent() == w2Var.c) {
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
