package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yr {
    public final org.telegram.ui.Cells.r2 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public xr d = null;

    public yr(org.telegram.ui.Cells.r2 r2Var) {
        this.a = r2Var;
    }

    public final void a(Canvas canvas, int i9) {
        ArrayList arrayList;
        canvas.clipRect(0, 0, i9, AndroidUtilities.dp(14.66f));
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = i9;
        rectF.set(0.0f, 0.0f, f10, AndroidUtilities.dp(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (LocaleController.isRTL) {
            canvas.translate(f10, 0.0f);
        }
        int dp = i9 - AndroidUtilities.dp(25.0f);
        int i10 = 0;
        while (true) {
            arrayList = this.c;
            if (i10 >= arrayList.size()) {
                break;
            }
            xr xrVar = (xr) arrayList.get(i10);
            dp = org.telegram.messenger.ll.w(4.0f, xrVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-xrVar.e, 0.0f);
                xrVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                xrVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + xrVar.e, 0.0f);
            }
            i10++;
        }
        if (i10 < arrayList.size()) {
            int size = arrayList.size() - i10;
            xr xrVar2 = this.d;
            if (xrVar2 == null || xrVar2.a != size) {
                xr xrVar3 = new xr();
                xrVar3.a = size;
                nz0 nz0Var = new nz0(j3.r0.l(size, "+"), 10.0f, AndroidUtilities.bold());
                nz0Var.s(this.a);
                xrVar3.c = nz0Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                nz0 nz0Var2 = xrVar3.c;
                xrVar3.e = dp2 + ((int) nz0Var2.c);
                nz0Var2.j();
                xrVar3.d = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.n8, false);
                this.d = xrVar3;
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
