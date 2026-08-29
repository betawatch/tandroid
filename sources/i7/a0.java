package i7;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a0 {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m8.t tVar = (m8.t) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", tVar.a);
            bundle.putLong("event_timestamp", tVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
