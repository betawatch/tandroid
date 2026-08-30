package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class w9 extends z9 {
    public final v9 u0;

    public w9(nh.z7 z7Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.u0 = z7Var;
        this.h0 = f6Var;
    }

    @Override // org.telegram.ui.Cells.z9
    public final /* bridge */ /* synthetic */ void M(u9 u9Var, u9 u9Var2) {
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Md, this.h0);
        this.o.setColor(v02);
        this.p.setColor(v02);
        i(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override // org.telegram.ui.Cells.z9
    public final void j(int i10, p9 p9Var, boolean z4) {
        p9Var.b = this.u0.getStaticTextLayout();
        p9Var.c = 0.0f;
        p9Var.d = 0.0f;
        p9Var.a = 0;
    }

    @Override // org.telegram.ui.Cells.z9
    public final int l(int i10, int i11, int i12, int i13, u9 u9Var, boolean z4) {
        v9 v9Var = (v9) u9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = v9Var.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        p9 p9Var = this.a0;
        Layout layout = p9Var.b;
        if (layout != null) {
            int i14 = (int) (i10 - p9Var.d);
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
                    return p9Var.a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.z9
    public final int n() {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override // org.telegram.ui.Cells.z9
    public final CharSequence t(u9 u9Var, boolean z4) {
        return ((v9) u9Var).getText();
    }
}
