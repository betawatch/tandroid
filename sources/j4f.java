// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
