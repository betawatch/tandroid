package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jx0 extends j1.b {
    public final Rect o;
    public final /* synthetic */ lx0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx0(lx0 lx0Var, lx0 lx0Var2) {
        super(lx0Var2);
        this.p = lx0Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        int i3;
        lx0 lx0Var = this.p;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ex0 d = lx0Var.d(i10);
            if (d.k > 0 && (i3 = d.l) > 0) {
                if (f10 >= d.p && f10 < r6 + r4) {
                    if (f11 >= d.q && f11 < r3 + i3) {
                        return i10;
                    }
                }
            }
        }
        return TLObject.FLAG_31;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        lx0 lx0Var = this.p;
        int childCount = lx0Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ex0 d = lx0Var.d(i3);
            if (d.k > 0 && d.l > 0) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
    }

    @Override // j1.b
    public final boolean k(int i3, int i10) {
        return false;
    }

    @Override // j1.b
    public final void l(int i3, s0.d dVar) {
        Rect rect = this.o;
        if (i3 >= 0) {
            lx0 lx0Var = this.p;
            if (i3 < lx0Var.getChildCount()) {
                ex0 d = lx0Var.d(i3);
                int i10 = d.p;
                int i11 = d.q;
                rect.set(i10, i11, d.k + i10, d.l + i11);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.a.setEnabled(true);
                dx0 dx0Var = d.b;
                CharSequence text = dx0Var != null ? dx0Var.getText() : null;
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
