// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class n5f implements f5f {
    public final ArrayList a;

    public n5f(Context context, b5f b5fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        b5fVar.getClass();
        arrayList.add(new k6f(context, b5fVar));
    }

    @Override // f5f
    public final void a(zhc zhcVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((f5f) obj).a(zhcVar);
        }
    }
}
