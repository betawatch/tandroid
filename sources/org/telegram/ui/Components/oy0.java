package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class oy0 extends j1.b {
    public final Rect o;
    public final /* synthetic */ qy0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy0(qy0 qy0Var, qy0 qy0Var2) {
        super(qy0Var2);
        this.p = qy0Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        int i10;
        qy0 qy0Var = this.p;
        int childCount = qy0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            jy0 d = qy0Var.d(i11);
            if (d.k > 0 && (i10 = d.l) > 0) {
                if (f7 >= d.p && f7 < r6 + r4) {
                    if (f10 >= d.q && f10 < r3 + i10) {
                        return i11;
                    }
                }
            }
        }
        return TLObject.FLAG_31;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        qy0 qy0Var = this.p;
        int childCount = qy0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            jy0 d = qy0Var.d(i10);
            if (d.k > 0 && d.l > 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        return false;
    }

    @Override // j1.b
    public final void l(int i10, s0.c cVar) {
        Rect rect = this.o;
        if (i10 >= 0) {
            qy0 qy0Var = this.p;
            if (i10 < qy0Var.getChildCount()) {
                jy0 d = qy0Var.d(i10);
                int i11 = d.p;
                int i12 = d.q;
                rect.set(i11, i12, d.k + i11, d.l + i12);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.a.setEnabled(true);
                iy0 iy0Var = d.b;
                CharSequence text = iy0Var != null ? iy0Var.getText() : null;
                if (text == null || text.length() == 0) {
                    text = " ";
                }
                cVar.o(text);
                TL_iv.pageTableCell pagetablecell = d.c;
                if (pagetablecell == null || !pagetablecell.header) {
                    return;
                }
                cVar.k(true);
                return;
            }
        }
        rect.set(0, 0, 1, 1);
        cVar.h(rect);
        cVar.p(false);
        cVar.j("");
    }
}
