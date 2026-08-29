package h2;

import android.content.ComponentName;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements Comparable {
    public final g0.c a;
    public final ComponentName b;

    public a(g0.c cVar, ComponentName componentName) {
        this.a = cVar;
        this.b = componentName;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.m - ((a) obj).a.m;
    }
}
