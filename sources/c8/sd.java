package c8;

import java.lang.ref.Reference;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class sd {
    public static void a(ArrayList arrayList, Object obj) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj2 = ((Reference) arrayList.get(size)).get();
            if (obj2 == null || obj2 == obj) {
                arrayList.remove(size);
                return;
            }
        }
    }
}
