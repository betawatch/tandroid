package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class v {
    public static final v c = new v(new Bundle(), null);
    public final Bundle a;
    public List b;

    public v(Bundle bundle, ArrayList arrayList) {
        this.a = bundle;
        this.b = arrayList;
    }

    public static v b(Bundle bundle) {
        if (bundle != null) {
            return new v(bundle, null);
        }
        return null;
    }

    public final void a() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("controlCategories");
            this.b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.b);
    }

    public final boolean d() {
        a();
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        a();
        vVar.a();
        return this.b.equals(vVar.b);
    }

    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
