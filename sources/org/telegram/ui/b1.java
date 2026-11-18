package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class b1 extends v4.o0 {
    public final /* synthetic */ h1 a;

    public b1(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // v4.o0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        g1 g1Var = this.a.w;
        int i7 = 0;
        rect.bottom = 0;
        org.telegram.messenger.xi xiVar = view instanceof a2 ? (org.telegram.messenger.xi) g1Var.b.get(((a2) view).O) : view instanceof v2 ? (org.telegram.messenger.xi) g1Var.b.get(((v2) view).M) : null;
        if (xiVar == null || xiVar.m == null) {
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        float max = Math.max(point.x, point.y) * 0.5f;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= xiVar.m.length) {
                break;
            }
            i11 += (int) Math.ceil(r3[i10] * max);
            i10++;
        }
        int M = (org.telegram.messenger.g0.M(11.0f) * (xiVar.d - xiVar.c)) + i11;
        int size = g1Var.a.size();
        while (true) {
            if (i7 < size) {
                org.telegram.messenger.xi xiVar2 = (org.telegram.messenger.xi) g1Var.a.get(i7);
                byte b10 = xiVar2.c;
                byte b11 = xiVar.c;
                if (b10 == b11 && ((xiVar2.a != xiVar.a || xiVar2.b != xiVar.b || b10 != b11 || xiVar2.d != xiVar.d) && b10 == b11)) {
                    M = org.telegram.messenger.f3.B(4.0f, (int) Math.ceil(max * xiVar2.f), M);
                    break;
                }
                i7++;
            } else {
                break;
            }
        }
        rect.bottom = -M;
    }
}
