package n1;

import dd.l;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
