package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class y9 extends ba {
    public final x9 p0;

    public y9(ai.xa xaVar, org.telegram.ui.ActionBar.e6 e6Var) {
        this.p0 = xaVar;
        this.g0 = e6Var;
    }

    @Override // org.telegram.ui.Cells.ba
    public final /* bridge */ /* synthetic */ void L(w9 w9Var, w9 w9Var2) {
    }

    public final void W(Canvas canvas) {
        Layout staticTextLayout = this.p0.getStaticTextLayout();
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Md, this.g0);
        this.o.setColor(w02);
        this.p.setColor(w02);
        h(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override // org.telegram.ui.Cells.ba
    public final void i(int i10, r9 r9Var, boolean z10) {
        r9Var.b = this.p0.getStaticTextLayout();
        r9Var.c = 0.0f;
        r9Var.d = 0.0f;
        r9Var.a = 0;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int k(int i10, int i11, int i12, int i13, w9 w9Var, boolean z10) {
        x9 x9Var = (x9) w9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = x9Var.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        r9 r9Var = this.a0;
        Layout layout = r9Var.b;
        if (layout != null) {
            int i14 = (int) (i10 - r9Var.d);
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
                    return r9Var.a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.ba
    public final int m() {
        Layout staticTextLayout = this.p0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override // org.telegram.ui.Cells.ba
    public final CharSequence s(w9 w9Var, boolean z10) {
        return ((x9) w9Var).getText();
    }
}
