package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class gs {
    public final org.telegram.ui.Cells.r2 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public fs d = null;

    public gs(org.telegram.ui.Cells.r2 r2Var) {
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
            fs fsVar = (fs) arrayList.get(i11);
            dp = org.telegram.messenger.wl.v(4.0f, fsVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-fsVar.e, 0.0f);
                fsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                fsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + fsVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            fs fsVar2 = this.d;
            if (fsVar2 == null || fsVar2.a != size) {
                fs fsVar3 = new fs();
                fsVar3.a = size;
                f01 f01Var = new f01(i2.g.i(size, "+"), 10.0f, AndroidUtilities.bold());
                f01Var.s(this.a);
                fsVar3.c = f01Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                f01 f01Var2 = fsVar3.c;
                fsVar3.e = dp2 + ((int) f01Var2.c);
                f01Var2.j();
                fsVar3.d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.n8, false);
                this.d = fsVar3;
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
