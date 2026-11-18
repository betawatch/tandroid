package a8;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class t9 {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d9.t tVar = (d9.t) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", tVar.a);
            bundle.putLong("event_timestamp", tVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
