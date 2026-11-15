package a8;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
