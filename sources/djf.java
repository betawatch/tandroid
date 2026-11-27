// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
