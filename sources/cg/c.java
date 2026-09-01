package cg;

import f2.q;
import java.util.ArrayList;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class c extends sl0 {
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
