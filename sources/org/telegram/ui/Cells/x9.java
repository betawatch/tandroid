package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class x9 extends aa {
    public final w9 u0;

    public x9(ih.d8 d8Var, org.telegram.ui.ActionBar.b6 b6Var) {
        this.u0 = d8Var;
        this.h0 = b6Var;
    }

    @Override // org.telegram.ui.Cells.aa
    public final /* bridge */ /* synthetic */ void M(v9 v9Var, v9 v9Var2) {
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Md, this.h0);
        this.o.setColor(v02);
        this.p.setColor(v02);
        i(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override // org.telegram.ui.Cells.aa
    public final void j(int i9, q9 q9Var, boolean z10) {
        q9Var.b = this.u0.getStaticTextLayout();
        q9Var.c = 0.0f;
        q9Var.d = 0.0f;
        q9Var.a = 0;
    }

    @Override // org.telegram.ui.Cells.aa
    public final int l(int i9, int i10, int i11, int i12, v9 v9Var, boolean z10) {
        w9 w9Var = (w9) v9Var;
        if (i10 < 0) {
            i10 = 1;
        }
        Layout staticTextLayout = w9Var.getStaticTextLayout();
        if (i10 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i10 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        q9 q9Var = this.a0;
        Layout layout = q9Var.b;
        if (layout != null) {
            int i13 = (int) (i9 - q9Var.d);
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
                    return q9Var.a + layout.getOffsetForHorizontal(i14, i13);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.aa
    public final int n() {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override // org.telegram.ui.Cells.aa
    public final CharSequence t(v9 v9Var, boolean z10) {
        return ((w9) v9Var).getText();
    }
}
