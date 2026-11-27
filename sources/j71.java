// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class j71 extends i71 {
    public final ArrayList f;
    public final /* synthetic */ w71 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j71(w71 w71Var, int i) {
        super(i);
        this.h = w71Var;
        this.f = new ArrayList();
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return !(this instanceof r71);
    }

    @Override // i71
    public void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        d71 d71Var = this.h.h;
        if (d71Var != null) {
            byte b = this.d;
            ArrayList arrayList3 = b == 1 ? d71Var.d : b == 2 ? d71Var.e : b == 3 ? d71Var.f : b == 5 ? d71Var.g : b == 4 ? d71Var.h : null;
            if (arrayList3 != null) {
                for (int i = 0; i < arrayList3.size(); i++) {
                    c71 c71Var = (c71) arrayList3.get(i);
                    p71 p71Var = new p71(2, true);
                    p71Var.d = c71Var;
                    arrayList2.add(p71Var);
                }
            }
        }
        E(arrayList, arrayList2);
    }
}
