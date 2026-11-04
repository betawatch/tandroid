package mi;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class z3 {
    public final ArrayList a;

    public /* synthetic */ z3(ArrayList arrayList) {
        this.a = arrayList;
    }

    public void a(StringBuilder sb2) {
        sb2.append(((Boolean) org.telegram.ui.Cells.f1.o(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void b(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            a(sb2);
        }
    }

    public tf.f c(int i3) {
        return (tf.f) this.a.get(i3);
    }

    public z3(tf.f fVar) {
        ArrayList arrayList = new ArrayList(1);
        this.a = arrayList;
        arrayList.add(fVar);
    }

    public z3() {
        this.a = new ArrayList();
    }
}
