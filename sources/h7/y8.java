package h7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class y8 implements z8 {
    public final ArrayList a;

    public y8(Context context, x8 x8Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        x8Var.getClass();
        arrayList.add(new d9(context, x8Var));
    }

    @Override // h7.z8
    public final void a(ag.j2 j2Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((z8) obj).a(j2Var);
        }
    }
}
