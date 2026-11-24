// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nef implements mef {
    public final ArrayList a;

    public nef(Context context, gef gefVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        gefVar.getClass();
        arrayList.add(new xef(context, gefVar));
    }

    @Override // mef
    public final void a(qx qxVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((mef) obj).a(qxVar);
        }
    }
}
