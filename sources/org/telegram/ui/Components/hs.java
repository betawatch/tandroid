package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class hs {
    public final org.telegram.ui.Cells.s2 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public gs d = null;

    public hs(org.telegram.ui.Cells.s2 s2Var) {
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
            gs gsVar = (gs) arrayList.get(i11);
            dp = org.telegram.messenger.rk.x(4.0f, gsVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-gsVar.e, 0.0f);
                gsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                gsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + gsVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            gs gsVar2 = this.d;
            if (gsVar2 == null || gsVar2.a != size) {
                gs gsVar3 = new gs();
                gsVar3.a = size;
                u01 u01Var = new u01(hg.k0.h(size, "+"), 10.0f, AndroidUtilities.bold());
                u01Var.s(this.a);
                gsVar3.c = u01Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                u01 u01Var2 = gsVar3.c;
                gsVar3.e = dp2 + ((int) u01Var2.c);
                u01Var2.j();
                gsVar3.d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n8, false);
                this.d = gsVar3;
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
