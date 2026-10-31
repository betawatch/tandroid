package bb;

import android.os.Message;
import java.util.Comparator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long valueOf = Long.valueOf(((Message) obj).getWhen());
        Long valueOf2 = Long.valueOf(((Message) obj2).getWhen());
        if (valueOf == valueOf2) {
            return 0;
        }
        return valueOf.compareTo(valueOf2);
    }
}
