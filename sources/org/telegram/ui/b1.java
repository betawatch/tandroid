package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b1 extends v4.n0 {
    public final /* synthetic */ h1 a;

    public b1(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // v4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        g1 g1Var = this.a.w;
        int i7 = 0;
        rect.bottom = 0;
        org.telegram.messenger.yi yiVar = view instanceof a2 ? (org.telegram.messenger.yi) g1Var.b.get(((a2) view).O) : view instanceof v2 ? (org.telegram.messenger.yi) g1Var.b.get(((v2) view).M) : null;
        if (yiVar == null || yiVar.m == null) {
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        float max = Math.max(point.x, point.y) * 0.5f;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= yiVar.m.length) {
                break;
            }
            i11 += (int) Math.ceil(r3[i10] * max);
            i10++;
        }
        int M = (org.telegram.messenger.g0.M(11.0f) * (yiVar.d - yiVar.c)) + i11;
        int size = g1Var.a.size();
        while (true) {
            if (i7 < size) {
                org.telegram.messenger.yi yiVar2 = (org.telegram.messenger.yi) g1Var.a.get(i7);
                byte b10 = yiVar2.c;
                byte b11 = yiVar.c;
                if (b10 == b11 && ((yiVar2.a != yiVar.a || yiVar2.b != yiVar.b || b10 != b11 || yiVar2.d != yiVar.d) && b10 == b11)) {
                    M = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max * yiVar2.f), M);
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
