package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ns {
    public final org.telegram.ui.Cells.r2 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public ms d = null;

    public ns(org.telegram.ui.Cells.r2 r2Var) {
        this.a = r2Var;
    }

    public final void a(Canvas canvas, int i10) {
        ArrayList arrayList;
        canvas.clipRect(0, 0, i10, AndroidUtilities.dp(14.66f));
        RectF rectF = AndroidUtilities.rectTmp;
        float f7 = i10;
        rectF.set(0.0f, 0.0f, f7, AndroidUtilities.dp(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (LocaleController.isRTL) {
            canvas.translate(f7, 0.0f);
        }
        int dp = i10 - AndroidUtilities.dp(25.0f);
        int i11 = 0;
        while (true) {
            arrayList = this.c;
            if (i11 >= arrayList.size()) {
                break;
            }
            ms msVar = (ms) arrayList.get(i11);
            dp = org.telegram.messenger.em.v(4.0f, msVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-msVar.e, 0.0f);
                msVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                msVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + msVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            ms msVar2 = this.d;
            if (msVar2 == null || msVar2.a != size) {
                ms msVar3 = new ms();
                msVar3.a = size;
                t01 t01Var = new t01(hc.b.j(size, "+"), 10.0f, AndroidUtilities.bold());
                t01Var.s(this.a);
                msVar3.c = t01Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                t01 t01Var2 = msVar3.c;
                msVar3.e = dp2 + ((int) t01Var2.c);
                t01Var2.j();
                msVar3.d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n8, false);
                this.d = msVar3;
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
