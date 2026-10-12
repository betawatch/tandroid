package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dj0 extends s4.t {
    public final /* synthetic */ hj0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj0(hj0 hj0Var) {
        super(true);
        this.S = hj0Var;
    }

    @Override // s4.t
    public final boolean B1(int i10) {
        byte b10;
        hj0 hj0Var = this.S;
        MessageObject messageObject = (MessageObject) hj0Var.N.get((B() - 1) - i10);
        MessageObject.GroupedMessages l4 = hj0Var.l(messageObject);
        if (l4 != null) {
            MessageObject.GroupedMessagePosition position = l4.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = l4.posArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = l4.posArray.get(i11);
                    if (groupedMessagePosition != position) {
                        byte b11 = groupedMessagePosition.minY;
                        byte b12 = position.minY;
                        if (b11 <= b12 && groupedMessagePosition.maxY >= b12) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // s4.t
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            return !((org.telegram.ui.Cells.u1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // s4.b0, s4.n0
    public final int j(s4.y0 y0Var) {
        return B0(y0Var);
    }

    @Override // s4.s, s4.b0, s4.n0
    public final int k(s4.y0 y0Var) {
        return C0(y0Var);
    }

    @Override // s4.s, s4.b0, s4.n0
    public final int l(s4.y0 y0Var) {
        return D0(y0Var);
    }

    @Override // s4.s, s4.b0, s4.n0
    public final boolean y0() {
        return true;
    }
}
