package hg;

import java.util.ArrayList;
import org.telegram.ui.Components.sk0;
import s4.n;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class c extends sk0 {
    public final a c = new a();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        a aVar = this.c;
        aVar.c = arrayList;
        aVar.d = arrayList2;
        n.c(aVar, true).c(this);
    }
}
