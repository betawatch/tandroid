package h6;

import android.util.LruCache;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class r extends LruCache {
    public final /* synthetic */ c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(c cVar) {
        super(20);
        this.a = cVar;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z9, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.a.g;
        Integer num = (Integer) obj;
        if (z9) {
            q6.m.g(arrayList);
            arrayList.add(num);
        }
    }
}
