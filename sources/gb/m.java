package gb;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class m implements ib.b {
    public final /* synthetic */ int a;
    public final d9.o b;

    public /* synthetic */ m(d9.o oVar, int i7) {
        this.a = i7;
        this.b = oVar;
    }

    @Override // fd.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new l((ua.b) this.b.a);
            default:
                return new jb.a((Context) this.b.a);
        }
    }
}
