package n1;

import dd.l;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a extends k implements l {
    public static final a b = new a(1);

    @Override // dd.l
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        j.e(entry, "entry");
        return "  " + ((d) entry.getKey()).a + " = " + entry.getValue();
    }
}
