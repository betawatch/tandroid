package bh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.v8;
import wg.r;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
            canvas.drawLine(id.a0 ? 0.0f : g0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (id.a0 ? g0.L(70.0f) : 0), getMeasuredHeight() - 1, m6.k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.c0 = prepaidGiveaway;
        boolean z9 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        v8 v8Var = this.E;
        if (z9) {
            v8Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.b0;
            aVar.f = valueOf;
            aVar.e = aVar.a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            v8Var.g(16);
            int i7 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i7 == 12) {
                v8Var.i(-31392, -2796986);
            } else if (i7 == 6) {
                v8Var.i(-10703110, -12481584);
            } else {
                v8Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(r.g() * prepaidGiveaway.quantity);
            a aVar2 = this.b0;
            aVar2.f = valueOf2;
            aVar2.e = aVar2.a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.b.i(this.b0);
    }
}
