package c5;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class m {
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
        sb2.append(((Boolean) hc.b.z(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void c(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            b(sb2);
        }
    }
}
