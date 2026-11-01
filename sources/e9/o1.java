package e9;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class o1 implements d9.t, Serializable {
    public final int a;

    public o1() {
        s.f(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // d9.t
    public final Object get() {
        return new ArrayList(this.a);
    }
}
