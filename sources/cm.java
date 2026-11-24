// default package

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cm {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i = 0; i < arrayList.size(); i++) {
            ((bm) arrayList.get(i)).d.spanDrawn = false;
        }
    }

    public final void b(int i) {
        bm bmVar = (bm) this.a.remove(i);
        HashMap hashMap = this.b;
        em emVar = (em) hashMap.get(bmVar.c);
        if (emVar == null) {
            wn4.j("!!!");
            return;
        }
        ArrayList arrayList = emVar.b;
        arrayList.remove(bmVar);
        emVar.a();
        if (arrayList.isEmpty()) {
            hashMap.remove(bmVar.c);
            this.c.remove(emVar);
        }
        vl vlVar = bmVar.f;
        if (vlVar != null) {
            vlVar.n(bmVar);
        }
    }
}
