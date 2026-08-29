package j7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class ia implements ka {
    public final ArrayList a;

    public ia(Context context, ha haVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        haVar.getClass();
        arrayList.add(new ma(context, haVar));
    }

    @Override // j7.ka
    public final void a(ag.j2 j2Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ka) obj).a(j2Var);
        }
    }
}
