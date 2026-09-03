package j7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
