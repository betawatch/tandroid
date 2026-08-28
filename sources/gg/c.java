package gg;

import android.content.Context;
import android.graphics.Canvas;
import bg.u0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c extends va {
    public final a T;
    public TL_stories.PrepaidGiveaway U;

    public c(Context context) {
        super(context, 0, 0, false);
        this.T = new a(context);
    }

    @Override // org.telegram.ui.Cells.va
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public TL_stories.PrepaidGiveaway getPrepaidGiveaway() {
        return this.U;
    }

    @Override // org.telegram.ui.Cells.va, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.O) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, f6.k0);
        }
    }

    public void setImage(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.U = prepaidGiveaway;
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        z8 z8Var = this.A;
        if (z10) {
            z8Var.g(26);
            String valueOf = String.valueOf(((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars / 500);
            a aVar = this.T;
            aVar.f = valueOf;
            aVar.e = aVar.a.measureText(valueOf);
            aVar.invalidateSelf();
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            z8Var.g(16);
            int i9 = ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months;
            if (i9 == 12) {
                z8Var.i(-31392, -2796986);
            } else if (i9 == 6) {
                z8Var.i(-10703110, -12481584);
            } else {
                z8Var.i(-6631068, -11945404);
            }
            String valueOf2 = String.valueOf(u0.g() * prepaidGiveaway.quantity);
            a aVar2 = this.T;
            aVar2.f = valueOf2;
            aVar2.e = aVar2.a.measureText(valueOf2);
            aVar2.invalidateSelf();
        }
        this.b.i(this.T);
    }
}
