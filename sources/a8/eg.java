package a8;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
