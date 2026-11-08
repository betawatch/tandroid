package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class b1 extends v4.m0 {
    public final /* synthetic */ h1 a;

    public b1(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // v4.m0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        g1 g1Var = this.a.w;
        int i7 = 0;
        rect.bottom = 0;
        org.telegram.messenger.aj ajVar = view instanceof a2 ? (org.telegram.messenger.aj) g1Var.b.get(((a2) view).N) : view instanceof v2 ? (org.telegram.messenger.aj) g1Var.b.get(((v2) view).L) : null;
        if (ajVar == null || ajVar.m == null) {
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        float max = Math.max(point.x, point.y) * 0.5f;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= ajVar.m.length) {
                break;
            }
            i11 += (int) Math.ceil(r3[i10] * max);
            i10++;
        }
        int M = (org.telegram.messenger.g0.M(11.0f) * (ajVar.d - ajVar.c)) + i11;
        int size = g1Var.a.size();
        while (true) {
            if (i7 < size) {
                org.telegram.messenger.aj ajVar2 = (org.telegram.messenger.aj) g1Var.a.get(i7);
                byte b10 = ajVar2.c;
                byte b11 = ajVar.c;
                if (b10 == b11 && ((ajVar2.a != ajVar.a || ajVar2.b != ajVar.b || b10 != b11 || ajVar2.d != ajVar.d) && b10 == b11)) {
                    M = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max * ajVar2.f), M);
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
