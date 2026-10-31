package bi;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class j4 {
    public final ArrayList a;

    public j4(ArrayList arrayList) {
        this.a = arrayList;
    }

    public void a(StringBuilder sb2) {
        sb2.append(((Boolean) i0.a.v(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void b(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            a(sb2);
        }
    }

    public hf.f c(int i10) {
        return (hf.f) this.a.get(i10);
    }

    public j4(hf.f fVar) {
        ArrayList arrayList = new ArrayList(1);
        this.a = arrayList;
        arrayList.add(fVar);
    }

    public j4() {
        this.a = new ArrayList();
    }
}
