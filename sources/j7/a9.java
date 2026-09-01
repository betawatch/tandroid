package j7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a9 implements b9 {
    public final ArrayList a;

    public a9(Context context, z8 z8Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        z8Var.getClass();
        arrayList.add(new f9(context, z8Var));
    }

    @Override // j7.b9
    public final void a(b4.e0 e0Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((b9) obj).a(e0Var);
        }
    }
}
