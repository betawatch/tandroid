package a8;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class q9 {
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
