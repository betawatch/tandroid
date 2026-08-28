package org.telegram.ui.Components;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class py0 extends j1.b {
    public final Rect o;
    public final /* synthetic */ ry0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py0(ry0 ry0Var, ry0 ry0Var2) {
        super(ry0Var2);
        this.p = ry0Var;
        this.o = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        int i9;
        ry0 ry0Var = this.p;
        int childCount = ry0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ky0 d = ry0Var.d(i10);
            if (d.k > 0 && (i9 = d.l) > 0) {
                if (f10 >= d.p && f10 < r6 + r4) {
                    if (f11 >= d.q && f11 < r3 + i9) {
                        return i10;
                    }
                }
            }
        }
        return TLObject.FLAG_31;
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        ry0 ry0Var = this.p;
        int childCount = ry0Var.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ky0 d = ry0Var.d(i9);
            if (d.k > 0 && d.l > 0) {
                arrayList.add(Integer.valueOf(i9));
            }
        }
    }

    @Override // j1.b
    public final boolean k(int i9, int i10) {
        return false;
    }

    @Override // j1.b
    public final void l(int i9, s0.d dVar) {
        Rect rect = this.o;
        if (i9 >= 0) {
            ry0 ry0Var = this.p;
            if (i9 < ry0Var.getChildCount()) {
                ky0 d = ry0Var.d(i9);
                int i10 = d.p;
                int i11 = d.q;
                rect.set(i10, i11, d.k + i10, d.l + i11);
                dVar.h(rect);
                dVar.i("android.widget.TextView");
                dVar.a.setEnabled(true);
                jy0 jy0Var = d.b;
                CharSequence text = jy0Var != null ? jy0Var.getText() : null;
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
