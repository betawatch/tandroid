package gb;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
