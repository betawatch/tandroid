package b8;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class bg implements ag {
    public final ArrayList a;

    public bg(Context context, zf zfVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        zfVar.getClass();
        arrayList.add(new mg(context, zfVar));
    }

    @Override // b8.ag
    public final void a(kg kgVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((ag) obj).a(kgVar);
        }
    }
}
