package og;

import gg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.ll0;
import s4.o;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class b extends ll0 {
    public final g c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.c;
        gVar.c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).b(this);
    }
}
