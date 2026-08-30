package dg;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z1 extends f2.u0 {
    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject.GroupedMessagePosition currentPosition;
        int i10 = 0;
        rect.bottom = 0;
        if (!(view instanceof org.telegram.ui.Cells.t1) || (currentMessagesGroup = (t1Var = (org.telegram.ui.Cells.t1) view).getCurrentMessagesGroup()) == null || (currentPosition = t1Var.getCurrentPosition()) == null || currentPosition.siblingHeights == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        float max = Math.max(point.x, point.y) * 0.5f;
        int extraInsetHeight = t1Var.getExtraInsetHeight();
        int i11 = 0;
        while (true) {
            if (i11 >= currentPosition.siblingHeights.length) {
                break;
            }
            extraInsetHeight += (int) Math.ceil(r3[i11] * max);
            i11++;
        }
        int round = (Math.round(AndroidUtilities.density * 7.0f) * (currentPosition.maxY - currentPosition.minY)) + extraInsetHeight;
        int size = currentMessagesGroup.posArray.size();
        while (true) {
            if (i10 < size) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = currentMessagesGroup.posArray.get(i10);
                byte b10 = groupedMessagePosition.minY;
                byte b11 = currentPosition.minY;
                if (b10 == b11 && ((groupedMessagePosition.minX != currentPosition.minX || groupedMessagePosition.maxX != currentPosition.maxX || b10 != b11 || groupedMessagePosition.maxY != currentPosition.maxY) && b10 == b11)) {
                    round = org.telegram.messenger.y3.z(4.0f, (int) Math.ceil(max * groupedMessagePosition.ph), round);
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        rect.bottom = -round;
    }
}
