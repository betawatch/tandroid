// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class j4f {
    public static final void a(StringBuilder sb, Iterator it, ahd ahdVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(ahd.a(entry.getKey()));
            sb.append(" : ");
            sb.append(ahd.a(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(ahd.a(entry2.getKey()));
                sb.append(" : ");
                sb.append(ahd.a(entry2.getValue()));
            }
        }
    }
}
