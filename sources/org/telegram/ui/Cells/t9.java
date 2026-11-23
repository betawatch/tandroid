package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class t9 extends w9 {
    public final s9 p0;

    public t9(fi.w7 w7Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.p0 = w7Var;
        this.g0 = h6Var;
    }

    @Override // org.telegram.ui.Cells.w9
    public final /* bridge */ /* synthetic */ void L(r9 r9Var, r9 r9Var2) {
    }

    public final void W(Canvas canvas) {
        Layout staticTextLayout = this.p0.getStaticTextLayout();
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.De, this.g0);
        this.o.setColor(w02);
        this.p.setColor(w02);
        h(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override // org.telegram.ui.Cells.w9
    public final void i(int i7, m9 m9Var, boolean z10) {
        m9Var.d = this.p0.getStaticTextLayout();
        m9Var.b = 0.0f;
        m9Var.c = 0.0f;
        m9Var.a = 0;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int k(int i7, int i10, int i11, int i12, r9 r9Var, boolean z10) {
        s9 s9Var = (s9) r9Var;
        if (i10 < 0) {
            i10 = 1;
        }
        Layout staticTextLayout = s9Var.getStaticTextLayout();
        if (i10 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i10 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        m9 m9Var = this.a0;
        Layout layout = (Layout) m9Var.d;
        if (layout != null) {
            int i13 = (int) (i7 - m9Var.c);
            int i14 = 0;
            while (true) {
                if (i14 >= layout.getLineCount()) {
                    i14 = -1;
                    break;
                }
                if (i10 > layout.getLineTop(i14) + i12 && i10 < layout.getLineBottom(i14) + i12) {
                    break;
                }
                i14++;
            }
            if (i14 >= 0) {
                try {
                    return m9Var.a + layout.getOffsetForHorizontal(i14, i13);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.w9
    public final int m() {
        Layout staticTextLayout = this.p0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override // org.telegram.ui.Cells.w9
    public final CharSequence s(r9 r9Var, boolean z10) {
        return ((s9) r9Var).getText();
    }
}
