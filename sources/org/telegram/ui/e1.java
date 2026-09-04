package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class e1 extends s4.n0 {
    public final /* synthetic */ k1 a;

    public e1(k1 k1Var) {
        this.a = k1Var;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int i10 = 0;
        rect.bottom = 0;
        boolean z10 = view instanceof d2;
        k1 k1Var = this.a;
        MessageObject.GroupedMessagePosition groupedMessagePosition = z10 ? (MessageObject.GroupedMessagePosition) k1Var.v.b.get(((d2) view).N) : view instanceof x2 ? (MessageObject.GroupedMessagePosition) k1Var.v.b.get(((x2) view).L) : null;
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
        int size = k1Var.v.a.size();
        while (true) {
            if (i10 < size) {
                MessageObject.GroupedMessagePosition groupedMessagePosition2 = (MessageObject.GroupedMessagePosition) k1Var.v.a.get(i10);
                byte b10 = groupedMessagePosition2.minY;
                byte b11 = groupedMessagePosition.minY;
                if (b10 == b11 && ((groupedMessagePosition2.minX != groupedMessagePosition.minX || groupedMessagePosition2.maxX != groupedMessagePosition.maxX || b10 != b11 || groupedMessagePosition2.maxY != groupedMessagePosition.maxY) && b10 == b11)) {
                    dp2 = org.telegram.messenger.w1.z(4.0f, (int) Math.ceil(max * groupedMessagePosition2.ph), dp2);
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
