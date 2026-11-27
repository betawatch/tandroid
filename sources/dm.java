// default package

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dm {
    public ArrayList a;
    public HashMap b;
    public ArrayList c;

    public final void a() {
        ArrayList arrayList = this.a;
        for (int i = 0; i < arrayList.size(); i++) {
            ((cm) arrayList.get(i)).d.spanDrawn = false;
        }
    }

    public final void b(int i) {
        cm cmVar = (cm) this.a.remove(i);
        HashMap hashMap = this.b;
        fm fmVar = (fm) hashMap.get(cmVar.c);
        if (fmVar == null) {
            xi4.l("!!!");
            return;
        }
        ArrayList arrayList = fmVar.b;
        arrayList.remove(cmVar);
        fmVar.a();
        if (arrayList.isEmpty()) {
            hashMap.remove(cmVar.c);
            this.c.remove(fmVar);
        }
        wl wlVar = cmVar.f;
        if (wlVar != null) {
            wlVar.n(cmVar);
        }
    }
}
