package d7;

import hg.k0;
import java.util.ArrayList;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class c {
    public final ArrayList a;

    public c(int i10) {
        switch (i10) {
            case 1:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                new ArrayList();
                new ArrayList();
                break;
        }
    }

    public void a(StringBuilder sb2) {
        sb2.append(((Boolean) k0.z(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void b(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            a(sb2);
        }
    }
}
