package a8;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
