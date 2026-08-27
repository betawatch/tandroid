package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class t9 extends w9 {
    public final s9 u0;

    public t9(jh.z7 z7Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.u0 = z7Var;
        this.h0 = c6Var;
    }

    @Override // org.telegram.ui.Cells.w9
    public final /* bridge */ /* synthetic */ void M(r9 r9Var, r9 r9Var2) {
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Md, this.h0);
        this.o.setColor(v02);
        this.p.setColor(v02);
        i(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override // org.telegram.ui.Cells.w9
    public final void j(int i10, m9 m9Var, boolean z10) {
        m9Var.b = this.u0.getStaticTextLayout();
        m9Var.c = 0.0f;
        m9Var.d = 0.0f;
        m9Var.a = 0;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int l(int i10, int i11, int i12, int i13, r9 r9Var, boolean z10) {
        s9 s9Var = (s9) r9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = s9Var.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        m9 m9Var = this.a0;
        Layout layout = m9Var.b;
        if (layout != null) {
            int i14 = (int) (i10 - m9Var.d);
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
                    return m9Var.a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int n() {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override // org.telegram.ui.Cells.w9
    public final CharSequence t(r9 r9Var, boolean z10) {
        return ((s9) r9Var).getText();
    }
}
