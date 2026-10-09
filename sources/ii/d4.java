package ii;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class d4 {
    public ArrayList a = new ArrayList();

    public p4.r a() {
        if (this.a == null) {
            return p4.r.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new p4.r(bundle, this.a);
    }

    public void b(StringBuilder sb2) {
        sb2.append(((Boolean) hg.c.x(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void c(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            b(sb2);
        }
    }
}
