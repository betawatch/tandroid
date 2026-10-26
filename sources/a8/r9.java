package a8;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
