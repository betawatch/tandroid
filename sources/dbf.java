// default package

import android.util.LruCache;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dbf extends LruCache {
    public final /* synthetic */ wr6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbf(wr6 wr6Var) {
        super(20);
        this.a = wr6Var;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.a.g;
        Integer num = (Integer) obj;
        if (z) {
            fre.h(arrayList);
            arrayList.add(num);
        }
    }
}
