package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public class ba extends ea {
    public final aa u0;

    public ba(ai.wa waVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.u0 = waVar;
        this.h0 = f6Var;
    }

    @Override // org.telegram.ui.Cells.ea
    public final /* bridge */ /* synthetic */ void M(z9 z9Var, z9 z9Var2) {
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Md, this.h0);
        this.o.setColor(v02);
        this.p.setColor(v02);
        i(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override // org.telegram.ui.Cells.ea
    public final void j(int i10, u9 u9Var, boolean z10) {
        u9Var.b = this.u0.getStaticTextLayout();
        u9Var.c = 0.0f;
        u9Var.d = 0.0f;
        u9Var.a = 0;
    }

    @Override // org.telegram.ui.Cells.ea
    public final int l(int i10, int i11, int i12, int i13, z9 z9Var, boolean z10) {
        aa aaVar = (aa) z9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = aaVar.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        u9 u9Var = this.a0;
        Layout layout = u9Var.b;
        if (layout != null) {
            int i14 = (int) (i10 - u9Var.d);
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
                    return u9Var.a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.ea
    public final int n() {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override // org.telegram.ui.Cells.ea
    public final CharSequence t(z9 z9Var, boolean z10) {
        return ((aa) z9Var).getText();
    }
}
