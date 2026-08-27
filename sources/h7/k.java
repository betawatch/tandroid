package h7;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class k {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            l8.s sVar = (l8.s) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", sVar.a);
            bundle.putLong("event_timestamp", sVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
