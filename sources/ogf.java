// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ogf implements ngf {
    public final ArrayList a;

    public ogf(Context context, hgf hgfVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        hgfVar.getClass();
        arrayList.add(new ygf(context, hgfVar));
    }

    @Override // ngf
    public final void a(ry ryVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ngf) obj).a(ryVar);
        }
    }
}
