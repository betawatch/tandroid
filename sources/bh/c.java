package bh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.w8;
import wg.s;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class c extends pa {
    public final a b0;
    public TL_stories.PrepaidGiveaway c0;

    public c(Context context) {
        super(context, 0, 0, false);
        this.b0 = new a(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.c0;
    }

    @Override // org.telegram.ui.Cells.pa, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.S) {
            canvas.drawLine(hd.a0 ? 0.0f : g0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? g0.L(70.0f) : 0), getMeasuredHeight() - 1, k6.k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.c0 = prepaidGiveaway;
        boolean z9 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        w8 w8Var = this.E;
        if (z9) {
            w8Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.b0;
            aVar.f = valueOf;
            aVar.e = aVar.a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            w8Var.g(16);
            int i7 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i7 == 12) {
                w8Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                w8Var.i(-10703110, -12481584);
            } else {
                w8Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(s.g() * prepaidGiveaway.quantity);
            a aVar2 = this.b0;
            aVar2.f = valueOf2;
            aVar2.e = aVar2.a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.b.i(this.b0);
    }
}
