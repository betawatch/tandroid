package n7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class vf implements uf {
    public final ArrayList a;

    public vf(Context context, tf tfVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        tfVar.getClass();
        arrayList.add(new yf(context, tfVar));
    }

    @Override // n7.uf
    public final void a(b4.e0 e0Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((uf) obj).a(e0Var);
        }
    }
}
