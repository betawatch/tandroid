package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vx0 extends k1.b {
    public final Rect o;
    public final /* synthetic */ xx0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx0(xx0 xx0Var, xx0 xx0Var2) {
        super(xx0Var2);
        this.p = xx0Var;
        this.o = new Rect();
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        int i7;
        xx0 xx0Var = this.p;
        int childCount = xx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            qx0 d = xx0Var.d(i10);
            if (d.k > 0 && (i7 = d.l) > 0) {
                if (f10 >= d.p && f10 < r6 + r4) {
                    if (f11 >= d.q && f11 < r3 + i7) {
                        return i10;
                    }
                }
            }
        }
        return TLObject.FLAG_31;
    }

    @Override // k1.b
    public final void h(ArrayList arrayList) {
        xx0 xx0Var = this.p;
        int childCount = xx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            qx0 d = xx0Var.d(i7);
            if (d.k > 0 && d.l > 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
    }

    @Override // k1.b
    public final boolean k(int i7, int i10) {
        return false;
    }

    @Override // k1.b
    public final void l(int i7, s0.c cVar) {
        Rect rect = this.o;
        if (i7 >= 0) {
            xx0 xx0Var = this.p;
            if (i7 < xx0Var.getChildCount()) {
                qx0 d = xx0Var.d(i7);
                int i10 = d.p;
                int i11 = d.q;
                rect.set(i10, i11, d.k + i10, d.l + i11);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.a.setEnabled(true);
                px0 px0Var = d.b;
                CharSequence text = px0Var != null ? px0Var.getText() : null;
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
