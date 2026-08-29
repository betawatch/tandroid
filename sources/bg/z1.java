package bg;

import android.view.View;
import java.util.ArrayList;
import nh.f5;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z1 extends f2.x {
    public final /* synthetic */ f5 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(f5 f5Var) {
        super(true);
        this.S = f5Var;
    }

    @Override // f2.x
    public final boolean B1(int i10) {
        MessageObject.GroupedMessagePosition position;
        byte b10;
        f5 f5Var = this.S;
        ArrayList arrayList = f5Var.o0;
        int size = (arrayList.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = f5Var.p0;
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

    @Override // f2.w, f2.j0, f2.w0
    public final boolean y0() {
        return false;
    }
}
