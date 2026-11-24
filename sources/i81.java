// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class i81 extends h81 {
    public final ArrayList f;
    public final /* synthetic */ w81 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i81(w81 w81Var, int i) {
        super(i);
        this.h = w81Var;
        this.f = new ArrayList();
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return !(this instanceof r81);
    }

    @Override // h81
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        c81 c81Var = this.h.h;
        if (c81Var != null) {
            byte b = this.d;
            ArrayList arrayList3 = b == 1 ? c81Var.d : b == 2 ? c81Var.e : b == 3 ? c81Var.f : b == 5 ? c81Var.g : b == 4 ? c81Var.h : null;
            if (arrayList3 != null) {
                for (int i = 0; i < arrayList3.size(); i++) {
                    b81 b81Var = (b81) arrayList3.get(i);
                    p81 p81Var = new p81(2, true);
                    p81Var.d = b81Var;
                    arrayList2.add(p81Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
