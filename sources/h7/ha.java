package h7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ha implements ja {
    public final ArrayList a;

    public ha(Context context, ga gaVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        gaVar.getClass();
        arrayList.add(new la(context, gaVar));
    }

    @Override // h7.ja
    public final void a(a6.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((ja) obj).a(aVar);
        }
    }
}
