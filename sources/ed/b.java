package ed;

import com.google.android.gms.common.api.internal.o1;
import java.util.Random;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
