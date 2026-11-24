// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class b71 extends a71 {
    public final ArrayList f;
    public final /* synthetic */ o71 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b71(o71 o71Var, int i) {
        super(i);
        this.h = o71Var;
        this.f = new ArrayList();
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return !(this instanceof j71);
    }

    @Override // a71
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        v61 v61Var = this.h.h;
        if (v61Var != null) {
            byte b = this.d;
            ArrayList arrayList3 = b == 1 ? v61Var.d : b == 2 ? v61Var.e : b == 3 ? v61Var.f : b == 5 ? v61Var.g : b == 4 ? v61Var.h : null;
            if (arrayList3 != null) {
                for (int i = 0; i < arrayList3.size(); i++) {
                    u61 u61Var = (u61) arrayList3.get(i);
                    h71 h71Var = new h71(2, true);
                    h71Var.d = u61Var;
                    arrayList2.add(h71Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
