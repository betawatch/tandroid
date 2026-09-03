package k7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class ja implements ia {
    public final ArrayList a;

    public ja(Context context, ha haVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        haVar.getClass();
        arrayList.add(new la(context, haVar));
    }

    @Override // k7.ia
    public final void a(f7.b bVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ia) obj).a(bVar);
        }
    }
}
