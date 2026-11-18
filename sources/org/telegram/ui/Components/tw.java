package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class tw extends g.p {
    public final /* synthetic */ ry c;

    public tw(ry ryVar) {
        this.c = ryVar;
    }

    @Override // g.p
    public final int i(int i7) {
        ry ryVar = this.c;
        bx bxVar = ryVar.S;
        sw swVar = ryVar.R;
        v4.i0 adapter = ryVar.Q.getAdapter();
        qx qxVar = ryVar.T;
        if (adapter == qxVar) {
            int d = qxVar.d(i7);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return swVar.J;
            }
        } else if ((ryVar.e0 && i7 == 0) || i7 == bxVar.d || i7 == bxVar.c || i7 == bxVar.f || bxVar.r.indexOfKey(i7) >= 0 || bxVar.w.indexOfKey(i7) >= 0) {
            return swVar.J;
        }
        return 1;
    }
}
