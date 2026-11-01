package bi;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
