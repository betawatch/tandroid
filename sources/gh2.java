// default package

import android.content.ComponentName;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
