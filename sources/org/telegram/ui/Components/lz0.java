package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class lz0 extends j1.b {
    public final Rect o;
    public final /* synthetic */ nz0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz0(nz0 nz0Var, nz0 nz0Var2) {
        super(nz0Var2);
        this.p = nz0Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        int i10;
        nz0 nz0Var = this.p;
        int childCount = nz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            gz0 d = nz0Var.d(i11);
            if (d.k > 0 && (i10 = d.l) > 0) {
                if (f10 >= d.p && f10 < r6 + r4) {
                    if (f11 >= d.q && f11 < r3 + i10) {
                        return i11;
                    }
                }
            }
        }
        return TLObject.FLAG_31;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        nz0 nz0Var = this.p;
        int childCount = nz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            gz0 d = nz0Var.d(i10);
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
    public final void l(int i10, s0.d dVar) {
        Rect rect = this.o;
        if (i10 >= 0) {
            nz0 nz0Var = this.p;
            if (i10 < nz0Var.getChildCount()) {
                gz0 d = nz0Var.d(i10);
                int i11 = d.p;
                int i12 = d.q;
                rect.set(i11, i12, d.k + i11, d.l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.a.setEnabled(true);
                fz0 fz0Var = d.b;
                CharSequence text = fz0Var != null ? fz0Var.getText() : null;
                if (text == null || text.length() == 0) {
                    text = " ";
                }
                dVar.o(text);
                TL_iv.pageTableCell pagetablecell = d.c;
                if (pagetablecell == null || !pagetablecell.header) {
                    return;
                }
                dVar.k(true);
                return;
            }
        }
        rect.set(0, 0, 1, 1);
        dVar.h(rect);
        dVar.p(false);
        dVar.j("");
    }
}
