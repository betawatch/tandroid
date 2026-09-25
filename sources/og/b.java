package og;

import gg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.vl0;
import s4.o;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public abstract class b extends vl0 {
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
