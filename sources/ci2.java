// default package

import android.content.ComponentName;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ci2 implements Comparable {
    public final qia a;
    public final ComponentName b;

    public ci2(qia qiaVar, ComponentName componentName) {
        this.a = qiaVar;
        this.b = componentName;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.m - ((ci2) obj).a.m;
    }
}
