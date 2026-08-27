package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ry0 extends j1.b {
    public final Rect o;
    public final /* synthetic */ ty0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry0(ty0 ty0Var, ty0 ty0Var2) {
        super(ty0Var2);
        this.p = ty0Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        int i10;
        ty0 ty0Var = this.p;
        int childCount = ty0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            my0 d = ty0Var.d(i11);
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
        ty0 ty0Var = this.p;
        int childCount = ty0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            my0 d = ty0Var.d(i10);
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
            ty0 ty0Var = this.p;
            if (i10 < ty0Var.getChildCount()) {
                my0 d = ty0Var.d(i10);
                int i11 = d.p;
                int i12 = d.q;
                rect.set(i11, i12, d.k + i11, d.l + i12);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.a.setEnabled(true);
                ly0 ly0Var = d.b;
                CharSequence text = ly0Var != null ? ly0Var.getText() : null;
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
