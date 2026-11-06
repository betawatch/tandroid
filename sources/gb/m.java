package gb;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
