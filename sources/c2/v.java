package c2;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class v {
    public ArrayList a = new ArrayList();

    public w a() {
        if (this.a == null) {
            return w.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new w(bundle, this.a);
    }

    public void b(StringBuilder sb) {
        sb.append(((Boolean) e2.c.g(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void c(StringBuilder sb) {
        while (!this.a.isEmpty()) {
            b(sb);
        }
    }
}
