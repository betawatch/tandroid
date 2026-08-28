package c2;

import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m {
    public final Bundle a;
    public final ArrayList b;
    public final ArrayList c;
    public final HashSet d;

    public m(String str, String str2) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        Bundle bundle = new Bundle();
        this.a = bundle;
        if (str == null) {
            throw new NullPointerException("id must not be null");
        }
        bundle.putString("id", str);
        if (str2 == null) {
            throw new NullPointerException("name must not be null");
        }
        bundle.putString("name", str2);
    }

    public final void a(ArrayList arrayList) {
        if (arrayList == null) {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            IntentFilter intentFilter = (IntentFilter) obj;
            if (intentFilter != null) {
                ArrayList arrayList2 = this.c;
                if (!arrayList2.contains(intentFilter)) {
                    arrayList2.add(intentFilter);
                }
            }
        }
    }

    public final n b() {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.c);
        Bundle bundle = this.a;
        bundle.putParcelableArrayList("controlFilters", arrayList);
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(this.b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>(this.d));
        return new n(bundle);
    }

    public m(n nVar) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        this.a = new Bundle(nVar.a);
        this.b = nVar.c();
        this.c = nVar.b();
        this.d = nVar.a();
    }
}
