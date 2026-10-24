package c5;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class n {
    public ArrayList a;

    public p4.r a() {
        if (this.a == null) {
            return p4.r.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new p4.r(bundle, this.a);
    }
}
