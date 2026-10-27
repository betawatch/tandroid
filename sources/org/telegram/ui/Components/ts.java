package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ts {
    public final org.telegram.ui.Cells.p2 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public ss d = null;

    public ts(org.telegram.ui.Cells.p2 p2Var) {
        this.a = p2Var;
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
            ss ssVar = (ss) arrayList.get(i11);
            dp = org.telegram.messenger.wh.z(4.0f, ssVar.g, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-ssVar.g, 0.0f);
                ssVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                ssVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + ssVar.g, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            ss ssVar2 = this.d;
            if (ssVar2 == null || ssVar2.a != size) {
                ss ssVar3 = new ss();
                ssVar3.a = size;
                r11 r11Var = new r11(ic.a.i(size, "+"), 10.0f, AndroidUtilities.bold());
                r11Var.s(this.a);
                ssVar3.c = r11Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                r11 r11Var2 = ssVar3.c;
                ssVar3.g = dp2 + ((int) r11Var2.c);
                r11Var2.j();
                int i12 = org.telegram.ui.ActionBar.y6.n8;
                ssVar3.f = i12;
                ssVar3.e = true;
                ssVar3.d = org.telegram.ui.ActionBar.y6.x0(null, i12, false);
                this.d = ssVar3;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.g, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.g, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.c.isEmpty();
    }
}
