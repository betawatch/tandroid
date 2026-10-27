package a8;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class r9 {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b9.u uVar = (b9.u) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", uVar.a);
            bundle.putLong("event_timestamp", uVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
