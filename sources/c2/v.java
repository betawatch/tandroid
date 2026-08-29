package c2;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public void b(StringBuilder sb2) {
        sb2.append(((Boolean) com.google.android.recaptcha.internal.a.j(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void c(StringBuilder sb2) {
        while (!this.a.isEmpty()) {
            b(sb2);
        }
    }
}
