package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class is {
    public final org.telegram.ui.Cells.r2 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public hs d = null;

    public is(org.telegram.ui.Cells.r2 r2Var) {
        this.a = r2Var;
    }

    public final void a(Canvas canvas, int i10) {
        ArrayList arrayList;
        canvas.clipRect(0, 0, i10, AndroidUtilities.dp(14.66f));
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = i10;
        rectF.set(0.0f, 0.0f, f10, AndroidUtilities.dp(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (LocaleController.isRTL) {
            canvas.translate(f10, 0.0f);
        }
        int dp = i10 - AndroidUtilities.dp(25.0f);
        int i11 = 0;
        while (true) {
            arrayList = this.c;
            if (i11 >= arrayList.size()) {
                break;
            }
            hs hsVar = (hs) arrayList.get(i11);
            dp = org.telegram.ui.b.t(4.0f, hsVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-hsVar.e, 0.0f);
                hsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                hsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + hsVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            hs hsVar2 = this.d;
            if (hsVar2 == null || hsVar2.a != size) {
                hs hsVar3 = new hs();
                hsVar3.a = size;
                l01 l01Var = new l01(l.d.j(size, "+"), 10.0f, AndroidUtilities.bold());
                l01Var.s(this.a);
                hsVar3.c = l01Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                l01 l01Var2 = hsVar3.c;
                hsVar3.e = dp2 + ((int) l01Var2.c);
                l01Var2.j();
                hsVar3.d = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.n8, false);
                this.d = hsVar3;
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
