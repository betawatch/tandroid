package n1;

import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import ld.l;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends j implements l {
    public static final a b = new a(1);

    @Override // ld.l
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "entry");
        return "  " + ((d) entry.getKey()).a + " = " + entry.getValue();
    }
}
