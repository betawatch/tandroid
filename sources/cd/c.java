package cd;

import java.util.Random;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends a {
    public final b b = new b(0);

    @Override // cd.a
    public final Random a() {
        Object obj = this.b.get();
        j.d(obj, "get(...)");
        return (Random) obj;
    }
}
