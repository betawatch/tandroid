// default package

import android.content.ComponentName;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class gh2 implements Comparable {
    public final hka a;
    public final ComponentName b;

    public gh2(hka hkaVar, ComponentName componentName) {
        this.a = hkaVar;
        this.b = componentName;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.m - ((gh2) obj).a.m;
    }
}
