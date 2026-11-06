package gb;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
