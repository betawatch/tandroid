// default package

import android.util.LruCache;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class edf extends LruCache {
    public final /* synthetic */ xt6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edf(xt6 xt6Var) {
        super(20);
        this.a = xt6Var;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ArrayList arrayList = this.a.g;
        Integer num = (Integer) obj;
        if (z) {
            ite.h(arrayList);
            arrayList.add(num);
        }
    }
}
