package h7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class ja implements ia {
    public final ArrayList a;

    public ja(Context context, ha haVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        haVar.getClass();
        arrayList.add(new la(context, haVar));
    }

    @Override // h7.ia
    public final void a(g5.b bVar) {
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
