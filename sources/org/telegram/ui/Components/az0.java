package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class az0 extends j1.b {
    public final Rect o;
    public final /* synthetic */ cz0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az0(cz0 cz0Var, cz0 cz0Var2) {
        super(cz0Var2);
        this.p = cz0Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f9, float f10) {
        int i10;
        cz0 cz0Var = this.p;
        int childCount = cz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            vy0 d = cz0Var.d(i11);
            if (d.k > 0 && (i10 = d.l) > 0) {
                if (f9 >= d.p && f9 < r6 + r4) {
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
        cz0 cz0Var = this.p;
        int childCount = cz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            vy0 d = cz0Var.d(i10);
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
            cz0 cz0Var = this.p;
            if (i10 < cz0Var.getChildCount()) {
                vy0 d = cz0Var.d(i10);
                int i11 = d.p;
                int i12 = d.q;
                rect.set(i11, i12, d.k + i11, d.l + i12);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.a.setEnabled(true);
                uy0 uy0Var = d.b;
                CharSequence text = uy0Var != null ? uy0Var.getText() : null;
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
