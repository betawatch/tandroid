// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class i39 extends v79 {
    public final /* synthetic */ x46 a;
    public final /* synthetic */ o39 b;

    public i39(o39 o39Var, x46 x46Var) {
        this.b = o39Var;
        this.a = x46Var;
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int loadCount;
        o39 o39Var = this.b;
        if (o39Var.x && o39Var.y && !o39Var.w) {
            int M0 = this.a.M0();
            int b = o39Var.f.b() - 1;
            loadCount = o39Var.getLoadCount();
            if (M0 >= b - loadCount) {
                o39Var.c();
            }
        }
    }
}
