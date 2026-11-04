package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c1 extends u4.n0 {
    public final /* synthetic */ i1 a;

    public c1(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // u4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        h1 h1Var = this.a.w;
        int i3 = 0;
        rect.bottom = 0;
        org.telegram.messenger.ri riVar = view instanceof b2 ? (org.telegram.messenger.ri) h1Var.b.get(((b2) view).O) : view instanceof w2 ? (org.telegram.messenger.ri) h1Var.b.get(((w2) view).M) : null;
        if (riVar == null || riVar.m == null) {
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        float max = Math.max(point.x, point.y) * 0.5f;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= riVar.m.length) {
                break;
            }
            i11 += (int) Math.ceil(r3[i10] * max);
            i10++;
        }
        int M = (org.telegram.messenger.g0.M(11.0f) * (riVar.d - riVar.c)) + i11;
        int size = h1Var.a.size();
        while (true) {
            if (i3 < size) {
                org.telegram.messenger.ri riVar2 = (org.telegram.messenger.ri) h1Var.a.get(i3);
                byte b10 = riVar2.c;
                byte b11 = riVar.c;
                if (b10 == b11 && ((riVar2.a != riVar.a || riVar2.b != riVar.b || b10 != b11 || riVar2.d != riVar.d) && b10 == b11)) {
                    M = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max * riVar2.f), M);
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        rect.bottom = -M;
    }
}
