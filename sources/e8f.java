// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class e8f implements o8f {
    public final ArrayList a;

    public e8f(Context context, y7f y7fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        y7fVar.getClass();
        arrayList.add(new h9f(context, y7fVar));
    }

    @Override // o8f
    public final void a(rx rxVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o8f) obj).a(rxVar);
        }
    }
}
