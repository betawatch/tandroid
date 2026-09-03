package cg;

import f2.q;
import java.util.ArrayList;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class c extends rl0 {
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
