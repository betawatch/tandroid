package md;

import com.google.android.gms.common.api.internal.o1;
import java.util.Random;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends a {
    public final o1 b = new o1(2);

    @Override // md.a
    public final Random a() {
        Object obj = this.b.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
