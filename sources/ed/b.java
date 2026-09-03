package ed;

import com.google.android.gms.common.api.internal.o1;
import java.util.Random;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b extends a {
    public final o1 b = new o1(1);

    @Override // ed.a
    public final Random a() {
        Object obj = this.b.get();
        j.d(obj, "get(...)");
        return (Random) obj;
    }
}
