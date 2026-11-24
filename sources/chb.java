// default package

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class chb extends b84 {
    public final Rect o;
    public final /* synthetic */ ehb p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chb(ehb ehbVar, ehb ehbVar2) {
        super(ehbVar2);
        this.p = ehbVar;
        this.o = new Rect();
    }

    @Override // b84
    public final int g(float f, float f2) {
        int i;
        ehb ehbVar = this.p;
        int childCount = ehbVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            xgb d = ehbVar.d(i2);
            if (d.k > 0 && (i = d.l) > 0) {
                if (f >= d.p && f < r5 + r3) {
                    if (f2 >= d.q && f2 < r2 + i) {
                        return i2;
                    }
                }
            }
        }
        return TLObject.FLAG_31;
    }

    @Override // b84
    public final void h(ArrayList arrayList) {
        ehb ehbVar = this.p;
        int childCount = ehbVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            xgb d = ehbVar.d(i);
            if (d.k > 0 && d.l > 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
    }

    @Override // b84
    public final void l(int i, u4 u4Var) {
        Rect rect = this.o;
        if (i >= 0) {
            ehb ehbVar = this.p;
            if (i < ehbVar.getChildCount()) {
                xgb d = ehbVar.d(i);
                int i2 = d.p;
                int i3 = d.q;
                rect.set(i2, i3, d.k + i2, d.l + i3);
                u4Var.h(rect);
                u4Var.i("android.widget.TextView");
                u4Var.a.setEnabled(true);
                wgb wgbVar = d.b;
                CharSequence text = wgbVar != null ? wgbVar.getText() : null;
                if (text == null || text.length() == 0) {
                    text = " ";
                }
                u4Var.o(text);
                TL_iv.pageTableCell pagetablecell = d.c;
                if (pagetablecell == null || !pagetablecell.header) {
                    return;
                }
                u4Var.k(true);
                return;
            }
        }
        rect.set(0, 0, 1, 1);
        u4Var.h(rect);
        u4Var.p(false);
        u4Var.j("");
    }
}
