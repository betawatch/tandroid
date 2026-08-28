package g7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ja implements ia {
    public final ArrayList a;

    public ja(Context context, ha haVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        haVar.getClass();
        arrayList.add(new la(context, haVar));
    }

    @Override // g7.ia
    public final void a(g5.b bVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((ia) obj).a(bVar);
        }
    }
}
