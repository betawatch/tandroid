package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.Layout;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class v9 extends y9 {
    public final u9 u0;

    public v9(nh.z7 z7Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.u0 = z7Var;
        this.h0 = f6Var;
    }

    @Override // org.telegram.ui.Cells.y9
    public final /* bridge */ /* synthetic */ void M(t9 t9Var, t9 t9Var2) {
    }

    public final void X(Canvas canvas) {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Md, this.h0);
        this.o.setColor(v02);
        this.p.setColor(v02);
        i(canvas, staticTextLayout, this.u, this.v, true, true, 0.0f);
    }

    @Override // org.telegram.ui.Cells.y9
    public final void j(int i10, o9 o9Var, boolean z4) {
        o9Var.b = this.u0.getStaticTextLayout();
        o9Var.c = 0.0f;
        o9Var.d = 0.0f;
        o9Var.a = 0;
    }

    @Override // org.telegram.ui.Cells.y9
    public final int l(int i10, int i11, int i12, int i13, t9 t9Var, boolean z4) {
        u9 u9Var = (u9) t9Var;
        if (i11 < 0) {
            i11 = 1;
        }
        Layout staticTextLayout = u9Var.getStaticTextLayout();
        if (i11 > staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) {
            i11 = (int) ((staticTextLayout.getLineBottom(staticTextLayout.getLineCount() - 1) + 0.0f) - 1.0f);
        }
        o9 o9Var = this.a0;
        Layout layout = o9Var.b;
        if (layout != null) {
            int i14 = (int) (i10 - o9Var.d);
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
                    return o9Var.a + layout.getOffsetForHorizontal(i15, i14);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.y9
    public final int n() {
        Layout staticTextLayout = this.u0.getStaticTextLayout();
        return staticTextLayout.getLineBottom(0) - staticTextLayout.getLineTop(0);
    }

    @Override // org.telegram.ui.Cells.y9
    public final CharSequence t(t9 t9Var, boolean z4) {
        return ((u9) t9Var).getText();
    }
}
