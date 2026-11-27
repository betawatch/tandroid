// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class djf implements cjf {
    public final ArrayList a;

    public djf(Context context, wif wifVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        wifVar.getClass();
        arrayList.add(new njf(context, wifVar));
    }

    @Override // cjf
    public final void a(rx rxVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((cjf) obj).a(rxVar);
        }
    }
}
