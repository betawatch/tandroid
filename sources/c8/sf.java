package c8;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
