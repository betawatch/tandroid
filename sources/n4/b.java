package n4;

import android.media.AudioAttributes;
import m.f3;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class b extends f3 {
    @Override // m.f3
    public final a f() {
        return new c(((AudioAttributes.Builder) this.b).build());
    }

    @Override // m.f3
    public final f3 p(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
        return this;
    }

    @Override // m.f3
    public final void q(int i10) {
        ((AudioAttributes.Builder) this.b).setUsage(i10);
    }
}
