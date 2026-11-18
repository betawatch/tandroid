package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ux0 extends k1.b {
    public final Rect o;
    public final /* synthetic */ wx0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux0(wx0 wx0Var, wx0 wx0Var2) {
        super(wx0Var2);
        this.p = wx0Var;
        this.o = new Rect();
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        int i7;
        wx0 wx0Var = this.p;
        int childCount = wx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            px0 d = wx0Var.d(i10);
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
        wx0 wx0Var = this.p;
        int childCount = wx0Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            px0 d = wx0Var.d(i7);
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
            wx0 wx0Var = this.p;
            if (i7 < wx0Var.getChildCount()) {
                px0 d = wx0Var.d(i7);
                int i10 = d.p;
                int i11 = d.q;
                rect.set(i10, i11, d.k + i10, d.l + i11);
                cVar.h(rect);
                cVar.i("android.widget.TextView");
                cVar.a.setEnabled(true);
                ox0 ox0Var = d.b;
                CharSequence text = ox0Var != null ? ox0Var.getText() : null;
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
