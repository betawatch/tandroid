package c8;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
    public final void a(a8.wa waVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((rf) obj).a(waVar);
        }
    }
}
