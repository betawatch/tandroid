package i7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class ha implements ja {
    public final ArrayList a;

    public ha(Context context, ga gaVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        gaVar.getClass();
        arrayList.add(new la(context, gaVar));
    }

    @Override // i7.ja
    public final void a(b6.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ja) obj).a(aVar);
        }
    }
}
