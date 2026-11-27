// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
