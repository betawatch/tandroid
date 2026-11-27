// default package

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
