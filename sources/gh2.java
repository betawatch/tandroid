// default package

import android.content.ComponentName;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
