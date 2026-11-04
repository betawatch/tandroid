package b8;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class t9 {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            c9.t tVar = (c9.t) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", tVar.a);
            bundle.putLong("event_timestamp", tVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
