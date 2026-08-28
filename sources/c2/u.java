package c2;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u {
    public ArrayList a;

    public u(int i9) {
        switch (i9) {
            case 2:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                new ArrayList();
                new ArrayList();
                break;
        }
    }

    public v a() {
        if (this.a == null) {
            return v.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new v(bundle, this.a);
    }

    public void b(StringBuilder sb2) {
        sb2.append(((Boolean) e2.c.k(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void c(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            b(sb2);
        }
    }
}
