package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class aa extends da {
    public final z9 u0;

    public aa(ai.wa waVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.u0 = waVar;
        this.h0 = e6Var;
    }

    @Override // org.telegram.ui.Cells.da
    public final /* bridge */ /* synthetic */ void M(y9 y9Var, y9 y9Var2) {
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Md, this.h0);
        this.o.setColor(v02);
        this.p.setColor(v02);
        i(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override // org.telegram.ui.Cells.da
    public final void j(int i10, t9 t9Var, boolean z10) {
        t9Var.b = this.u0.getStaticTextLayout();
        t9Var.c = 0.0f;
        t9Var.d = 0.0f;
        t9Var.a = 0;
    }

    @Override // org.telegram.ui.Cells.da
    public final int l(int i10, int i11, int i12, int i13, y9 y9Var, boolean z10) {
        z9 z9Var = (z9) y9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = z9Var.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        t9 t9Var = this.a0;
        Layout layout = t9Var.b;
        if (layout != null) {
            int i14 = (int) (i10 - t9Var.d);
            int i15 = 0;
            while (true) {
                if (i15 >= layout.getLineCount()) {
                    i15 = -1;
                    break;
                }
                if (i11 > layout.getLineTop(i15) + i13 && i11 < layout.getLineBottom(i15) + i13) {
                    break;
                }
                i15++;
            }
            if (i15 >= 0) {
                try {
                    return t9Var.a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.da
    public final int n() {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override // org.telegram.ui.Cells.da
    public final CharSequence t(y9 y9Var, boolean z10) {
        return ((z9) y9Var).getText();
    }
}
