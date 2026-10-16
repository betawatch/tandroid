package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class us {
    public final org.telegram.ui.Cells.s2 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public ts d = null;

    public us(org.telegram.ui.Cells.s2 s2Var) {
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
            ts tsVar = (ts) arrayList.get(i11);
            dp = org.telegram.messenger.sk.z(4.0f, tsVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-tsVar.e, 0.0f);
                tsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                tsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + tsVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            ts tsVar2 = this.d;
            if (tsVar2 == null || tsVar2.a != size) {
                ts tsVar3 = new ts();
                tsVar3.a = size;
                i11 i11Var = new i11(i2.d.j(size, "+"), 10.0f, AndroidUtilities.bold());
                i11Var.s(this.a);
                tsVar3.c = i11Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                i11 i11Var2 = tsVar3.c;
                tsVar3.e = dp2 + ((int) i11Var2.c);
                i11Var2.j();
                tsVar3.d = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.n8, false);
                this.d = tsVar3;
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
