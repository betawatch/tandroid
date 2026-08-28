package f7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a9 implements b9 {
    public final ArrayList a;

    public a9(Context context, z8 z8Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        z8Var.getClass();
        arrayList.add(new f9(context, z8Var));
    }

    @Override // f7.b9
    public final void a(a6.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((b9) obj).a(aVar);
        }
    }
}
