package k7;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class x5 {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            o8.s sVar = (o8.s) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", sVar.a);
            bundle.putLong("event_timestamp", sVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
