// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class n3f implements x3f {
    public final ArrayList a;

    public n3f(Context context, g3f g3fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        g3fVar.getClass();
        arrayList.add(new q4f(context, g3fVar));
    }

    @Override // x3f
    public final void a(qx qxVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((x3f) obj).a(qxVar);
        }
    }
}
