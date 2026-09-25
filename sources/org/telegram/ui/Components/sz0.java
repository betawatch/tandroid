package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class sz0 extends j1.b {
    public final Rect o;
    public final /* synthetic */ uz0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(uz0 uz0Var, uz0 uz0Var2) {
        super(uz0Var2);
        this.p = uz0Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        int i10;
        uz0 uz0Var = this.p;
        int childCount = uz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            nz0 d = uz0Var.d(i11);
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
        uz0 uz0Var = this.p;
        int childCount = uz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            nz0 d = uz0Var.d(i10);
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
            uz0 uz0Var = this.p;
            if (i10 < uz0Var.getChildCount()) {
                nz0 d = uz0Var.d(i10);
                int i11 = d.p;
                int i12 = d.q;
                rect.set(i11, i12, d.k + i11, d.l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.a.setEnabled(true);
                mz0 mz0Var = d.b;
                CharSequence text = mz0Var != null ? mz0Var.getText() : null;
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
