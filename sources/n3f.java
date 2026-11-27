// default package

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class n3f {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            q4d q4dVar = (q4d) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", q4dVar.a);
            bundle.putLong("event_timestamp", q4dVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
