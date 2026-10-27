package a8;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class eg implements dg {
    public final ArrayList a;

    public eg(Context context, cg cgVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        cgVar.getClass();
        arrayList.add(new pg(context, cgVar));
    }

    @Override // a8.dg
    public final void a(ng ngVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((dg) obj).a(ngVar);
        }
    }
}
