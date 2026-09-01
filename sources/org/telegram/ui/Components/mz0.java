package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mz0 extends j1.b {
    public final Rect o;
    public final /* synthetic */ oz0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz0(oz0 oz0Var, oz0 oz0Var2) {
        super(oz0Var2);
        this.p = oz0Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        int i10;
        oz0 oz0Var = this.p;
        int childCount = oz0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            hz0 d = oz0Var.d(i11);
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
        oz0 oz0Var = this.p;
        int childCount = oz0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            hz0 d = oz0Var.d(i10);
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
            oz0 oz0Var = this.p;
            if (i10 < oz0Var.getChildCount()) {
                hz0 d = oz0Var.d(i10);
                int i11 = d.p;
                int i12 = d.q;
                rect.set(i11, i12, d.k + i11, d.l + i12);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.a.setEnabled(true);
                gz0 gz0Var = d.b;
                CharSequence text = gz0Var != null ? gz0Var.getText() : null;
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
