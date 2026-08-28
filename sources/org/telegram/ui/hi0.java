package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hi0 extends f2.z {
    public final /* synthetic */ li0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi0(li0 li0Var) {
        super(true);
        this.S = li0Var;
    }

    @Override // f2.z
    public final boolean B1(int i9) {
        byte b10;
        li0 li0Var = this.S;
        MessageObject messageObject = (MessageObject) li0Var.J.get((B() - 1) - i9);
        MessageObject.GroupedMessages l10 = li0Var.l(messageObject);
        if (l10 != null) {
            MessageObject.GroupedMessagePosition position = l10.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = l10.posArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = l10.posArray.get(i10);
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

    @Override // f2.z
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            return !((org.telegram.ui.Cells.t1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // f2.m0, f2.z0
    public final int j(f2.n1 n1Var) {
        return B0(n1Var);
    }

    @Override // f2.y, f2.m0, f2.z0
    public final int k(f2.n1 n1Var) {
        return C0(n1Var);
    }

    @Override // f2.y, f2.m0, f2.z0
    public final int l(f2.n1 n1Var) {
        return D0(n1Var);
    }

    @Override // f2.y, f2.m0, f2.z0
    public final boolean y0() {
        return true;
    }
}
