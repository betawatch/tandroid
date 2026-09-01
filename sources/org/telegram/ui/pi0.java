package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pi0 extends f2.x {
    public final /* synthetic */ ti0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi0(ti0 ti0Var) {
        super(true);
        this.S = ti0Var;
    }

    @Override // f2.x
    public final boolean B1(int i10) {
        byte b10;
        ti0 ti0Var = this.S;
        MessageObject messageObject = (MessageObject) ti0Var.K.get((B() - 1) - i10);
        MessageObject.GroupedMessages l10 = ti0Var.l(messageObject);
        if (l10 != null) {
            MessageObject.GroupedMessagePosition position = l10.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = l10.posArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = l10.posArray.get(i11);
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

    @Override // f2.x
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            return !((org.telegram.ui.Cells.t1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // f2.j0, f2.w0
    public final int j(f2.j1 j1Var) {
        return B0(j1Var);
    }

    @Override // f2.w, f2.j0, f2.w0
    public final int k(f2.j1 j1Var) {
        return C0(j1Var);
    }

    @Override // f2.w, f2.j0, f2.w0
    public final int l(f2.j1 j1Var) {
        return D0(j1Var);
    }

    @Override // f2.w, f2.j0, f2.w0
    public final boolean y0() {
        return true;
    }
}
