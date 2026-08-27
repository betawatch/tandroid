package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class li0 extends f2.w0 {
    @Override // f2.w0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject.GroupedMessagePosition currentPosition;
        int i10 = 0;
        rect.bottom = 0;
        if (!(view instanceof org.telegram.ui.Cells.s1) || (currentMessagesGroup = (s1Var = (org.telegram.ui.Cells.s1) view).getCurrentMessagesGroup()) == null || (currentPosition = s1Var.getCurrentPosition()) == null || currentPosition.siblingHeights == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        float max = Math.max(point.x, point.y) * 0.5f;
        int extraInsetHeight = s1Var.getExtraInsetHeight();
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
                    round = org.telegram.messenger.y1.A(4.0f, (int) Math.ceil(max * groupedMessagePosition.ph), round);
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
