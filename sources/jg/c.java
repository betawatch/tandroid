package jg;

import android.content.Context;
import android.graphics.Canvas;
import eg.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.e9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c extends sa {
    public final a T;
    public TL_stories.PrepaidGiveaway U;

    public c(Context context) {
        super(context, 0, 0, false);
        this.T = new a(context);
    }

    @Override // org.telegram.ui.Cells.sa
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.U;
    }

    @Override // org.telegram.ui.Cells.sa, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.O) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, g6.k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.U = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        e9 e9Var = this.A;
        if (z10) {
            e9Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.T;
            aVar.f = valueOf;
            aVar.e = aVar.a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            e9Var.g(16);
            int i10 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i10 == 12) {
                e9Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                e9Var.i(-10703110, -12481584);
            } else {
                e9Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(q0.g() * prepaidGiveaway.quantity);
            a aVar2 = this.T;
            aVar2.f = valueOf2;
            aVar2.e = aVar2.a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.b.i(this.T);
    }
}
