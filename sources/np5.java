// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class np5 extends po5 {
    public final /* synthetic */ yo5 c;

    public np5(yo5 yo5Var) {
        this.c = yo5Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yo5 yo5Var = this.c;
        switch (yo5Var.d) {
            case 0:
                wq7 wq7Var = ((p99) yo5Var.e).e;
                yve.j(i, wq7Var.c);
                return new vq7(wq7Var, i);
            default:
                wq7 wq7Var2 = ((p99) yo5Var.e).e;
                yve.j(i, wq7Var2.c);
                return wq7Var2.a[i];
        }
    }

    @Override // jo5
    public final boolean m() {
        return this.c.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
