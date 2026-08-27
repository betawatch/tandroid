package g7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z8 implements a9 {
    public final ArrayList a;

    public z8(Context context, y8 y8Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        y8Var.getClass();
        arrayList.add(new e9(context, y8Var));
    }

    @Override // g7.a9
    public final void a(b6.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((a9) obj).a(aVar);
        }
    }
}
