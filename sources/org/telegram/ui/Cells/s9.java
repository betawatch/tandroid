package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class s9 extends v9 {
    public final r9 p0;

    public s9(di.h8 h8Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.p0 = h8Var;
        this.g0 = g6Var;
    }

    @Override // org.telegram.ui.Cells.v9
    public final /* bridge */ /* synthetic */ void L(q9 q9Var, q9 q9Var2) {
    }

    public final void W(Canvas canvas) {
        Layout staticTextLayout = this.p0.getStaticTextLayout();
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ae, this.g0);
        this.o.setColor(w02);
        this.p.setColor(w02);
        h(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override // org.telegram.ui.Cells.v9
    public final void i(int i7, l9 l9Var, boolean z9) {
        l9Var.d = this.p0.getStaticTextLayout();
        l9Var.b = 0.0f;
        l9Var.c = 0.0f;
        l9Var.a = 0;
    }

    @Override // org.telegram.ui.Cells.v9
    public final int k(int i7, int i10, int i11, int i12, q9 q9Var, boolean z9) {
        r9 r9Var = (r9) q9Var;
        if (i10 < 0) {
            i10 = 1;
        }
        Layout staticTextLayout = r9Var.getStaticTextLayout();
        if (i10 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i10 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        l9 l9Var = this.a0;
        Layout layout = (Layout) l9Var.d;
        if (layout != null) {
            int i13 = (int) (i7 - l9Var.c);
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
                    return l9Var.a + layout.getOffsetForHorizontal(i14, i13);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.v9
    public final int m() {
        Layout staticTextLayout = this.p0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override // org.telegram.ui.Cells.v9
    public final CharSequence s(q9 q9Var, boolean z9) {
        return ((r9) q9Var).getText();
    }
}
