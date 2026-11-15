package c8;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
