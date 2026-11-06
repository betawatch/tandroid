package a8;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
