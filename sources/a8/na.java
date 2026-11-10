package a8;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class na implements sa {
    public final ArrayList a;

    public na(Context context, ma maVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        maVar.getClass();
        arrayList.add(new ya(context, maVar));
    }

    @Override // a8.sa
    public final void a(wa waVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((sa) obj).a(waVar);
        }
    }
}
