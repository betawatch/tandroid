package bh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.t8;
import wg.q;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c extends pa {
    public final a c0;
    public TL_stories.PrepaidGiveaway d0;

    public c(Context context) {
        super(context, 0, 0, false);
        this.c0 = new a(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.d0;
    }

    @Override // org.telegram.ui.Cells.pa, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.T) {
            canvas.drawLine(hd.a0 ? 0.0f : g0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? g0.L(70.0f) : 0), getMeasuredHeight() - 1, j6.k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.d0 = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        t8 t8Var = this.F;
        if (z10) {
            t8Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.c0;
            aVar.f = valueOf;
            aVar.e = aVar.a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            t8Var.g(16);
            int i7 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i7 == 12) {
                t8Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                t8Var.i(-10703110, -12481584);
            } else {
                t8Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(q.g() * prepaidGiveaway.quantity);
            a aVar2 = this.c0;
            aVar2.f = valueOf2;
            aVar2.e = aVar2.a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.b.i(this.c0);
    }
}
