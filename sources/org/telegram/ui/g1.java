package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g1 extends f2.y0 {
    public final /* synthetic */ m1 a;

    public g1(m1 m1Var) {
        this.a = m1Var;
    }

    @Override // f2.y0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        int i9 = 0;
        rect.bottom = 0;
        boolean z10 = view instanceof f2;
        m1 m1Var = this.a;
        MessageObject.GroupedMessagePosition groupedMessagePosition = z10 ? (MessageObject.GroupedMessagePosition) m1Var.v.b.get(((f2) view).J) : view instanceof a3 ? (MessageObject.GroupedMessagePosition) m1Var.v.b.get(((a3) view).H) : null;
        if (groupedMessagePosition == null || groupedMessagePosition.siblingHeights == null) {
            return;
        }
        Point point = AndroidUtilities.displaySize;
        float max = Math.max(point.x, point.y) * 0.5f;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= groupedMessagePosition.siblingHeights.length) {
                break;
            }
            i11 += (int) Math.ceil(r3[i10] * max);
            i10++;
        }
        int dp2 = (AndroidUtilities.dp2(11.0f) * (groupedMessagePosition.maxY - groupedMessagePosition.minY)) + i11;
        int size = m1Var.v.a.size();
        while (true) {
            if (i9 < size) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) m1Var.v.a.get(i9);
                byte b10 = groupedMessagePosition2.minY;
                byte b11 = groupedMessagePosition.minY;
                if (b10 == b11 && ((groupedMessagePosition2.minX != groupedMessagePosition.minX || groupedMessagePosition2.maxX != groupedMessagePosition.maxX || b10 != b11 || groupedMessagePosition2.maxY != groupedMessagePosition.maxY) && b10 == b11)) {
                    dp2 = org.telegram.messenger.l0.A(4.0f, (int) Math.ceil(max * groupedMessagePosition2.ph), dp2);
                    break;
                }
                i9++;
            } else {
                break;
            }
        }
        rect.bottom = -dp2;
    }
}
