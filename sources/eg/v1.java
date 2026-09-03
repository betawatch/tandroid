package eg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import qh.n4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class v1 extends f2.x {
    public final /* synthetic */ n4 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(n4 n4Var) {
        super(true);
        this.S = n4Var;
    }

    @Override // f2.x
    public final boolean B1(int i10) {
        MessageObject.GroupedMessagePosition position;
        byte b10;
        n4 n4Var = this.S;
        ArrayList arrayList = n4Var.p0;
        int size = (arrayList.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = n4Var.q0;
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
        if (view instanceof org.telegram.ui.Cells.t1) {
            return !((org.telegram.ui.Cells.t1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override // f2.w, f2.j0, f2.w0
    public final boolean y0() {
        return false;
    }
}
