package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xs {
    public final org.telegram.ui.Cells.s2 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public ws d = null;

    public xs(org.telegram.ui.Cells.s2 s2Var) {
        this.a = s2Var;
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
            ws wsVar = (ws) arrayList.get(i11);
            dp = org.telegram.messenger.bi.z(4.0f, wsVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-wsVar.e, 0.0f);
                wsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                wsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + wsVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            ws wsVar2 = this.d;
            if (wsVar2 == null || wsVar2.a != size) {
                ws wsVar3 = new ws();
                wsVar3.a = size;
                l11 l11Var = new l11(hg.c.h(size, "+"), 10.0f, AndroidUtilities.bold());
                l11Var.s(this.a);
                wsVar3.c = l11Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                l11 l11Var2 = wsVar3.c;
                wsVar3.e = dp2 + ((int) l11Var2.c);
                l11Var2.j();
                wsVar3.d = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.n8, false);
                this.d = wsVar3;
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
