package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class hw extends g.p {
    public final /* synthetic */ gy c;

    public hw(gy gyVar) {
        this.c = gyVar;
    }

    @Override // g.p
    public final int i(int i7) {
        gy gyVar = this.c;
        pw pwVar = gyVar.R;
        gw gwVar = gyVar.Q;
        v4.g0 adapter = gyVar.P.getAdapter();
        gx gxVar = gyVar.S;
        if (adapter == gxVar) {
            int d = gxVar.d(i7);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return gwVar.J;
            }
        } else if ((gyVar.d0 && i7 == 0) || i7 == pwVar.d || i7 == pwVar.c || i7 == pwVar.f || pwVar.r.indexOfKey(i7) >= 0 || pwVar.w.indexOfKey(i7) >= 0) {
            return gwVar.J;
        }
        return 1;
    }
}
