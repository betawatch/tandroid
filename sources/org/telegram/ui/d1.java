package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d1 extends s4.m0 {
    public final /* synthetic */ j1 a;

    public d1(j1 j1Var) {
        this.a = j1Var;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        i1 i1Var = this.a.w;
        int i10 = 0;
        rect.bottom = 0;
        org.telegram.messenger.bj bjVar = view instanceof b2 ? (org.telegram.messenger.bj) i1Var.b.get(((b2) view).N) : view instanceof v2 ? (org.telegram.messenger.bj) i1Var.b.get(((v2) view).L) : null;
        if (bjVar == null || bjVar.m == null) {
            return;
        }
        Point point = org.telegram.messenger.i0.q;
        float max = Math.max(point.x, point.y) * 0.5f;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= bjVar.m.length) {
                break;
            }
            i12 += (int) Math.ceil(r3[i11] * max);
            i11++;
        }
        int M = (org.telegram.messenger.i0.M(11.0f) * (bjVar.d - bjVar.c)) + i12;
        int size = i1Var.a.size();
        while (true) {
            if (i10 < size) {
                org.telegram.messenger.bj bjVar2 = (org.telegram.messenger.bj) i1Var.a.get(i10);
                byte b10 = bjVar2.c;
                byte b11 = bjVar.c;
                if (b10 == b11 && ((bjVar2.a != bjVar.a || bjVar2.b != bjVar.b || b10 != b11 || bjVar2.d != bjVar.d) && b10 == b11)) {
                    M = org.telegram.messenger.m5.B(4.0f, (int) Math.ceil(max * bjVar2.f), M);
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        rect.bottom = -M;
    }
}
