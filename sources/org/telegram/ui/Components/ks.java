package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ks {
    public final org.telegram.ui.Cells.s2 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public js d = null;

    public ks(org.telegram.ui.Cells.s2 s2Var) {
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
            js jsVar = (js) arrayList.get(i11);
            dp = org.telegram.messenger.bi.y(4.0f, jsVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-jsVar.e, 0.0f);
                jsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                jsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + jsVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            js jsVar2 = this.d;
            if (jsVar2 == null || jsVar2.a != size) {
                js jsVar3 = new js();
                jsVar3.a = size;
                f11 f11Var = new f11(hg.c.h(size, "+"), 10.0f, AndroidUtilities.bold());
                f11Var.s(this.a);
                jsVar3.c = f11Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                f11 f11Var2 = jsVar3.c;
                jsVar3.e = dp2 + ((int) f11Var2.c);
                f11Var2.j();
                jsVar3.d = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.n8, false);
                this.d = jsVar3;
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
