// default package

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class cy4 extends vac {
    public final cy2 c0;
    public TL_stories.PrepaidGiveaway d0;

    public cy4(Context context) {
        super(context, 0, 0, false);
        this.c0 = new cy2(context);
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.d0;
    }

    @Override // vac, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.T) {
            canvas.drawLine(ob6.a0 ? 0.0f : hl.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(70.0f) : 0), getMeasuredHeight() - 1, aob.j0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.d0 = prepaidGiveaway;
        boolean z = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        cy2 cy2Var = this.c0;
        rb0 rb0Var = this.F;
        if (z) {
            rb0Var.f(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            cy2Var.c = valueOf;
            cy2Var.e = cy2Var.b.measureText(valueOf);
            cy2Var.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            rb0Var.f(16);
            int i = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i == 12) {
                rb0Var.h(-31392, -2796986);
            } else if (i == 6) {
                rb0Var.h(-10703110, -12481584);
            } else {
                rb0Var.h(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(on0.h() * prepaidGiveaway.quantity);
            cy2Var.c = valueOf2;
            cy2Var.e = cy2Var.b.measureText(valueOf2);
            cy2Var.invalidateSelf();
        }
        this.b.i(cy2Var);
    }
}
