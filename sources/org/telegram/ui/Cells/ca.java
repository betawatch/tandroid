package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class ca extends fa {
    public final ba u0;

    public ca(zh.o6 o6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.u0 = o6Var;
        this.h0 = f6Var;
    }

    @Override // org.telegram.ui.Cells.fa
    public final /* bridge */ /* synthetic */ void M(aa aaVar, aa aaVar2) {
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Md, this.h0);
        this.o.setColor(v02);
        this.p.setColor(v02);
        i(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override // org.telegram.ui.Cells.fa
    public final void j(int i10, v9 v9Var, boolean z10) {
        v9Var.b = this.u0.getStaticTextLayout();
        v9Var.c = 0.0f;
        v9Var.d = 0.0f;
        v9Var.a = 0;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int l(int i10, int i11, int i12, int i13, aa aaVar, boolean z10) {
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
    public final int n() {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override // org.telegram.ui.Cells.fa
    public final CharSequence t(aa aaVar, boolean z10) {
        return ((ba) aaVar).getText();
    }
}
