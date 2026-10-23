package e9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class o1 implements d9.u, Serializable {
    public final int a;

    public o1() {
        s.f(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // d9.u
    public final Object get() {
        return new ArrayList(this.a);
    }
}
