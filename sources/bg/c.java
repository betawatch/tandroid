package bg;

import f2.q;
import java.util.ArrayList;
import org.telegram.ui.Components.ql0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class c extends ql0 {
    public final a c = new a();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        a aVar = this.c;
        aVar.c = arrayList;
        aVar.d = arrayList2;
        q.c(aVar, true).b(this);
    }
}
