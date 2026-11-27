// default package

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fo4 {
    public final /* synthetic */ byte a;
    public final List b;
    public final boolean c;

    public fo4(ArrayList arrayList, boolean z) {
        this.a = (byte) 1;
        if (arrayList.isEmpty()) {
            this.b = Collections.EMPTY_LIST;
        } else {
            this.b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.c = z;
    }

    public static fo4 a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList.add(bundle2 != null ? new ev6(bundle2) : null);
            }
        }
        return new fo4(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.b;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                    } else {
                        ev6 ev6Var = (ev6) list.get(i);
                        if (ev6Var != null && ev6Var.e()) {
                            i++;
                        }
                    }
                }
                sb.append(z);
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public fo4() {
        this.a = (byte) 0;
        this.c = true;
        this.b = Collections.singletonList(null);
    }

    public fo4(ArrayList arrayList) {
        this.a = (byte) 0;
        this.c = false;
        this.b = arrayList;
    }
}
