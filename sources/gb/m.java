package gb;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
