// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class nj4 implements xr3 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ u23 b;

    public nj4(u23 u23Var, ArrayList arrayList) {
        this.b = u23Var;
        this.a = arrayList;
    }

    @Override // xr3
    public final void a(yla ylaVar, boolean z, float f, float f2) {
        ArrayList arrayList = ylaVar.k;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        ArrayList arrayList2 = this.a;
        arrayList2.add(ylaVar);
        if (arrayList2.size() == 2) {
            this.b.b();
        }
    }
}
