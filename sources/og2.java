// default package

import android.content.ComponentName;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class og2 implements Comparable {
    public final oga a;
    public final ComponentName b;

    public og2(oga ogaVar, ComponentName componentName) {
        this.a = ogaVar;
        this.b = componentName;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.m - ((og2) obj).a.m;
    }
}
