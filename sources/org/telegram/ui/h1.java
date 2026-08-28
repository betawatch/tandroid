package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h1 extends f2.z {
    public final /* synthetic */ m1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(m1 m1Var) {
        super(true);
        this.S = m1Var;
    }

    @Override // f2.z
    public final boolean B1(int i9) {
        byte b10;
        m1 m1Var = this.S;
        ArrayList<TL_iv.PageBlock> arrayList = m1Var.s.items;
        MessageObject.GroupedMessagePosition groupedMessagePosition = (MessageObject.GroupedMessagePosition) m1Var.v.b.get(arrayList.get((arrayList.size() - i9) - 1));
        if (groupedMessagePosition.minX != groupedMessagePosition.maxX && (b10 = groupedMessagePosition.minY) == groupedMessagePosition.maxY && b10 != 0) {
            int size = m1Var.v.a.size();
            for (int i10 = 0; i10 < size; i10++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) m1Var.v.a.get(i10);
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

    @Override // f2.z
    public final boolean C1(View view) {
        return false;
    }

    @Override // f2.y, f2.m0, f2.z0
    public final boolean y0() {
        return false;
    }
}
