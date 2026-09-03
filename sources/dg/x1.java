package dg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import ph.o4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x1 extends f2.x {
    public final /* synthetic */ o4 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(o4 o4Var) {
        super(true);
        this.S = o4Var;
    }

    @Override // f2.x
    public final boolean B1(int i10) {
        MessageObject.GroupedMessagePosition position;
        byte b10;
        o4 o4Var = this.S;
        ArrayList arrayList = o4Var.p0;
        int size = (arrayList.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = o4Var.q0;
        if (groupedMessages != null && size >= 0 && size < arrayList.size() && (position = groupedMessages.getPosition((MessageObject) arrayList.get(size))) != null && position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
            int size2 = groupedMessages.posArray.size();
            for (int i11 = 0; i11 < size2; i11++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = groupedMessages.posArray.get(i11);
                if (groupedMessagePosition != position) {
                    byte b11 = groupedMessagePosition.minY;
                    byte b12 = position.minY;
                    if (b11 <= b12 && groupedMessagePosition.maxY >= b12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // f2.x
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            return !((org.telegram.ui.Cells.s1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // f2.w, f2.i0, f2.v0
    public final boolean y0() {
        return false;
    }
}
