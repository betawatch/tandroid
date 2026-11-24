// default package

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cfb extends s64 {
    public final Rect o;
    public final /* synthetic */ efb p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfb(efb efbVar, efb efbVar2) {
        super(efbVar2);
        this.p = efbVar;
        this.o = new Rect();
    }

    @Override // s64
    public final int g(float f, float f2) {
        int i;
        efb efbVar = this.p;
        int childCount = efbVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            xeb d = efbVar.d(i2);
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

    @Override // s64
    public final void h(ArrayList arrayList) {
        efb efbVar = this.p;
        int childCount = efbVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            xeb d = efbVar.d(i);
            if (d.k > 0 && d.l > 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
    }

    @Override // s64
    public final void l(int i, u4 u4Var) {
        Rect rect = this.o;
        if (i >= 0) {
            efb efbVar = this.p;
            if (i < efbVar.getChildCount()) {
                xeb d = efbVar.d(i);
                int i2 = d.p;
                int i3 = d.q;
                rect.set(i2, i3, d.k + i2, d.l + i3);
                u4Var.h(rect);
                u4Var.i("android.widget.TextView");
                u4Var.a.setEnabled(true);
                web webVar = d.b;
                CharSequence text = webVar != null ? webVar.getText() : null;
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
