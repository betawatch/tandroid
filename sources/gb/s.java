package gb;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class s implements ib.b {
    public final /* synthetic */ int a;
    public final e.a b;

    public /* synthetic */ s(e.a aVar, int i7) {
        this.a = i7;
        this.b = aVar;
    }

    @Override // fd.a
    public final Object get() {
        int i7 = this.a;
        e.a aVar = this.b;
        switch (i7) {
            case 0:
                o9.g firebaseApp = (o9.g) aVar.a;
                kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
                q0 q0Var = q0.a;
                return q0.a(firebaseApp);
            default:
                return new jb.a((Context) aVar.a);
        }
    }
}
