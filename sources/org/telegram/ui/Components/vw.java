package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class vw extends g.p {
    public final /* synthetic */ ty c;

    public vw(ty tyVar) {
        this.c = tyVar;
    }

    @Override // g.p
    public final int i(int i7) {
        ty tyVar = this.c;
        dx dxVar = tyVar.S;
        uw uwVar = tyVar.R;
        v4.i0 adapter = tyVar.Q.getAdapter();
        sx sxVar = tyVar.T;
        if (adapter == sxVar) {
            int d = sxVar.d(i7);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return uwVar.J;
            }
        } else if ((tyVar.e0 && i7 == 0) || i7 == dxVar.d || i7 == dxVar.c || i7 == dxVar.f || dxVar.r.indexOfKey(i7) >= 0 || dxVar.w.indexOfKey(i7) >= 0) {
            return uwVar.J;
        }
        return 1;
    }
}
