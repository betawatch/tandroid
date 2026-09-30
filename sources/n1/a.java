package n1;

import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import rd.l;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class a extends j implements l {
    public static final a b = new a(1);

    @Override // rd.l
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "entry");
        return "  " + ((d) entry.getKey()).a + " = " + entry.getValue();
    }
}
