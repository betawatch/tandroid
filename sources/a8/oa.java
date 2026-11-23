package a8;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class oa implements ta {
    public final ArrayList a;

    public oa(Context context, na naVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        naVar.getClass();
        arrayList.add(new za(context, naVar));
    }

    @Override // a8.ta
    public final void a(xa xaVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((ta) obj).a(xaVar);
        }
    }
}
