// default package

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
