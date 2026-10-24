package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class g1 extends s4.t {
    public final /* synthetic */ l1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(l1 l1Var) {
        super(true);
        this.S = l1Var;
    }

    @Override // s4.t
    public final boolean B1(int i10) {
        byte b10;
        l1 l1Var = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = l1Var.s.items;
        MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) l1Var.v.b.get(arrayList.get((arrayList.size() - i10) - 1));
        if (groupedMessagePosition.minX != groupedMessagePosition.maxX && (b10 = groupedMessagePosition.minY) == groupedMessagePosition.maxY && b10 != 0) {
            int size = l1Var.v.a.size();
            for (int i11 = 0; i11 < size; i11++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) l1Var.v.a.get(i11);
                if (groupedMessagePosition2 != groupedMessagePosition) {
                    byte b11 = groupedMessagePosition2.minY;
                    byte b12 = groupedMessagePosition.minY;
                    if (b11 <= b12 && groupedMessagePosition2.maxY >= b12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // s4.t
    public final boolean C1(View view) {
        return false;
    }

    @Override // s4.s, s4.b0, s4.n0
    public final boolean y0() {
        return false;
    }
}
