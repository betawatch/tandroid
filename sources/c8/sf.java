package c8;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
    public final void a(a8.wa waVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((rf) obj).a(waVar);
        }
    }
}
