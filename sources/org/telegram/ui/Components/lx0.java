package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class lx0 extends k1.b {
    public final Rect o;
    public final /* synthetic */ nx0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx0(nx0 nx0Var, nx0 nx0Var2) {
        super(nx0Var2);
        this.p = nx0Var;
        this.o = new Rect();
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        int i7;
        nx0 nx0Var = this.p;
        int childCount = nx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            gx0 d = nx0Var.d(i10);
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
        nx0 nx0Var = this.p;
        int childCount = nx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            gx0 d = nx0Var.d(i7);
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
    public final void l(int i7, s0.d dVar) {
        Rect rect = this.o;
        if (i7 >= 0) {
            nx0 nx0Var = this.p;
            if (i7 < nx0Var.getChildCount()) {
                gx0 d = nx0Var.d(i7);
                int i10 = d.p;
                int i11 = d.q;
                rect.set(i10, i11, d.k + i10, d.l + i11);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.a.setEnabled(true);
                fx0 fx0Var = d.b;
                CharSequence text = fx0Var != null ? fx0Var.getText() : null;
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
