package d7;

import android.os.Bundle;
import hg.k0;
import java.util.ArrayList;
import p4.r;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class c {
    public ArrayList a;

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

    public r a() {
        if (this.a == null) {
            return r.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new r(bundle, this.a);
    }

    public void b(StringBuilder sb2) {
        sb2.append(((Boolean) k0.v(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void c(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            b(sb2);
        }
    }
}
