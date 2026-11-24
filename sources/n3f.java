// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
