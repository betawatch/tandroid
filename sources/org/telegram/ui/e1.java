package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class e1 extends s4.t {
    public final /* synthetic */ j1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(j1 j1Var) {
        super(true);
        this.S = j1Var;
    }

    @Override // s4.t
    public final boolean B1(int i10) {
        byte b10;
        j1 j1Var = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = j1Var.s.items;
        MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) j1Var.v.b.get(arrayList.get((arrayList.size() - i10) - 1));
        if (groupedMessagePosition.minX != groupedMessagePosition.maxX && (b10 = groupedMessagePosition.minY) == groupedMessagePosition.maxY && b10 != 0) {
            int size = j1Var.v.a.size();
            for (int i11 = 0; i11 < size; i11++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) j1Var.v.a.get(i11);
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

    @Override // s4.s, s4.c0, s4.o0
    public final boolean y0() {
        return false;
    }
}
