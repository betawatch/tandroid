// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
