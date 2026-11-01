package hg;

import java.util.ArrayList;
import org.telegram.ui.Components.tk0;
import s4.n;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class c extends tk0 {
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
