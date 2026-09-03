package k7;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class w5 {
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
