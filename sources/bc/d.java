package bc;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d implements Comparator, Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((c) obj).c, ((c) obj2).c);
    }
}
