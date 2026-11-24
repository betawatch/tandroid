// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hs1 extends i98 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ mu1 c;

    public hs1(mu1 mu1Var, ArrayList arrayList, boolean[] zArr) {
        this.c = mu1Var;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override // i98, o98
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.pb(i2, arrayList, z, z2);
    }

    @Override // i98, o98
    public final boolean T() {
        return false;
    }

    @Override // i98, o98
    public final jl5 k(int i) {
        return null;
    }

    @Override // i98, o98
    public final boolean w(int i) {
        return this.b[i];
    }

    @Override // i98, o98
    public final int D(int i, oac oacVar) {
        return i;
    }
}
