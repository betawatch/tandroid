package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cs {
    public final org.telegram.ui.Cells.p2 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public bs d = null;

    public cs(org.telegram.ui.Cells.p2 p2Var) {
        this.a = p2Var;
    }

    public final void a(Canvas canvas, int i10) {
        ArrayList arrayList;
        canvas.clipRect(0, 0, i10, AndroidUtilities.dp(14.66f));
        RectF rectF = AndroidUtilities.rectTmp;
        float f9 = i10;
        rectF.set(0.0f, 0.0f, f9, AndroidUtilities.dp(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (LocaleController.isRTL) {
            canvas.translate(f9, 0.0f);
        }
        int dp = i10 - AndroidUtilities.dp(25.0f);
        int i11 = 0;
        while (true) {
            arrayList = this.c;
            if (i11 >= arrayList.size()) {
                break;
            }
            bs bsVar = (bs) arrayList.get(i11);
            dp = org.telegram.ui.b.u(4.0f, bsVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-bsVar.e, 0.0f);
                bsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                bsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + bsVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            bs bsVar2 = this.d;
            if (bsVar2 == null || bsVar2.a != size) {
                bs bsVar3 = new bs();
                bsVar3.a = size;
                zz0 zz0Var = new zz0(j7.l1.k(size, "+"), 10.0f, AndroidUtilities.bold());
                zz0Var.s(this.a);
                bsVar3.c = zz0Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                zz0 zz0Var2 = bsVar3.c;
                bsVar3.e = dp2 + ((int) zz0Var2.c);
                zz0Var2.j();
                bsVar3.d = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.n8, false);
                this.d = bsVar3;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.e, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.e, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.c.isEmpty();
    }
}
