package ed;

import com.google.android.gms.common.api.internal.o1;
import java.util.Random;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
