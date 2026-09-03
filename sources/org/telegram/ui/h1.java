package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h1 extends f2.u0 {
    public final /* synthetic */ n1 a;

    public h1(n1 n1Var) {
        this.a = n1Var;
    }

    @Override // f2.u0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        int i10 = 0;
        rect.bottom = 0;
        boolean z4 = view instanceof g2;
        n1 n1Var = this.a;
        MessageObject.GroupedMessagePosition groupedMessagePosition = z4 ? (MessageObject.GroupedMessagePosition) n1Var.v.b.get(((g2) view).K) : view instanceof b3 ? (MessageObject.GroupedMessagePosition) n1Var.v.b.get(((b3) view).I) : null;
        if (groupedMessagePosition == null || groupedMessagePosition.siblingHeights == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        float max = Math.max(point.x, point.y) * 0.5f;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= groupedMessagePosition.siblingHeights.length) {
                break;
            }
            i12 += (int) Math.ceil(r3[i11] * max);
            i11++;
        }
        int dp2 = (AndroidUtilities.dp2(11.0f) * (groupedMessagePosition.maxY - groupedMessagePosition.minY)) + i12;
        int size = n1Var.v.a.size();
        while (true) {
            if (i10 < size) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) n1Var.v.a.get(i10);
                byte b10 = groupedMessagePosition2.minY;
                byte b11 = groupedMessagePosition.minY;
                if (b10 == b11 && ((groupedMessagePosition2.minX != groupedMessagePosition.minX || groupedMessagePosition2.maxX != groupedMessagePosition.maxX || b10 != b11 || groupedMessagePosition2.maxY != groupedMessagePosition.maxY) && b10 == b11)) {
                    dp2 = org.telegram.messenger.y3.z(4.0f, (int) Math.ceil(max * groupedMessagePosition2.ph), dp2);
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        rect.bottom = -dp2;
    }
}
