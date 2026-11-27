// default package

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
