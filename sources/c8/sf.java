package c8;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class sf implements rf {
    public final ArrayList a;

    public sf(Context context, qf qfVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        qfVar.getClass();
        arrayList.add(new vf(context, qfVar));
    }

    @Override // c8.rf
    public final void a(a8.xa xaVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((rf) obj).a(xaVar);
        }
    }
}
