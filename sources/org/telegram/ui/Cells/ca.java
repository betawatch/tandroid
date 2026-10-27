package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class ca extends fa {
    public final ba p0;

    public ca(di.o8 o8Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.p0 = o8Var;
        this.g0 = u6Var;
    }

    @Override // org.telegram.ui.Cells.fa
    public final /* bridge */ /* synthetic */ void L(aa aaVar, aa aaVar2) {
    }

    public final void W(Canvas canvas) {
        Layout staticTextLayout = this.p0.getStaticTextLayout();
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Md, this.g0);
        this.o.setColor(w02);
        this.p.setColor(w02);
        h(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override // org.telegram.ui.Cells.fa
    public final void i(int i10, v9 v9Var, boolean z10) {
        v9Var.b = this.p0.getStaticTextLayout();
        v9Var.c = 0.0f;
        v9Var.d = 0.0f;
        v9Var.a = 0;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int k(int i10, int i11, int i12, int i13, aa aaVar, boolean z10) {
        ba baVar = (ba) aaVar;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = baVar.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        v9 v9Var = this.a0;
        Layout layout = v9Var.b;
        if (layout != null) {
            int i14 = (int) (i10 - v9Var.d);
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
                    return v9Var.a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int m() {
        Layout staticTextLayout = this.p0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override // org.telegram.ui.Cells.fa
    public final CharSequence s(aa aaVar, boolean z10) {
        return ((ba) aaVar).getText();
    }
}
