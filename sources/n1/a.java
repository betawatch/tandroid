package n1;

import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import rd.l;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
