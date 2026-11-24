// default package

import android.content.ComponentName;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
