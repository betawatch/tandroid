// default package

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dv6 {
    public final Bundle a;
    public final ArrayList b;
    public final ArrayList c;
    public final HashSet d;

    public dv6(String str, String str2) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        Bundle bundle = new Bundle();
        this.a = bundle;
        if (str == null) {
            p3d.h("id must not be null");
            throw null;
        }
        bundle.putString("id", str);
        if (str2 != null) {
            bundle.putString("name", str2);
        } else {
            p3d.h("name must not be null");
            throw null;
        }
    }

    public final void a(ArrayList arrayList) {
        if (arrayList == null) {
            lq5.j("filters must not be null");
            return;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            IntentFilter intentFilter = (IntentFilter) obj;
            if (intentFilter != null) {
                ArrayList arrayList2 = this.c;
                if (!arrayList2.contains(intentFilter)) {
                    arrayList2.add(intentFilter);
                }
            }
        }
    }

    public final ev6 b() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.c);
        Bundle bundle = this.a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new ev6(bundle);
    }

    public dv6(ev6 ev6Var) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        this.a = new Bundle(ev6Var.a);
        this.b = ev6Var.c();
        this.c = ev6Var.b();
        this.d = ev6Var.a();
    }
}
