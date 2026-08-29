package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class u9 extends x9 {
    public final t9 u0;

    public u9(lh.z7 z7Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.u0 = z7Var;
        this.h0 = c6Var;
    }

    @Override // org.telegram.ui.Cells.x9
    public final /* bridge */ /* synthetic */ void M(s9 s9Var, s9 s9Var2) {
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Md, this.h0);
        this.o.setColor(v02);
        this.p.setColor(v02);
        i(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override // org.telegram.ui.Cells.x9
    public final void j(int i10, n9 n9Var, boolean z10) {
        n9Var.b = this.u0.getStaticTextLayout();
        n9Var.c = 0.0f;
        n9Var.d = 0.0f;
        n9Var.a = 0;
    }

    @Override // org.telegram.ui.Cells.x9
    public final int l(int i10, int i11, int i12, int i13, s9 s9Var, boolean z10) {
        t9 t9Var = (t9) s9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = t9Var.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        n9 n9Var = this.a0;
        Layout layout = n9Var.b;
        if (layout != null) {
            int i14 = (int) (i10 - n9Var.d);
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
                    return n9Var.a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.x9
    public final int n() {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override // org.telegram.ui.Cells.x9
    public final CharSequence t(s9 s9Var, boolean z10) {
        return ((t9) s9Var).getText();
    }
}
