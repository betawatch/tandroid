// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class e8f implements o8f {
    public final ArrayList a;

    public e8f(Context context, y7f y7fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        y7fVar.getClass();
        arrayList.add(new h9f(context, y7fVar));
    }

    @Override // o8f
    public final void a(rx rxVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o8f) obj).a(rxVar);
        }
    }
}
