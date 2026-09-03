package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g1 extends f2.x {
    public final /* synthetic */ l1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(l1 l1Var) {
        super(true);
        this.S = l1Var;
    }

    @Override // f2.x
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

    @Override // f2.x
    public final boolean C1(View view) {
        return false;
    }

    @Override // f2.w, f2.j0, f2.w0
    public final boolean y0() {
        return false;
    }
}
