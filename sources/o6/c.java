package o6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c implements b {
    public final /* synthetic */ p8.a a;

    public c(p8.a aVar) {
        this.a = aVar;
    }

    @Override // o6.b
    public final void a(l6.a aVar) {
        boolean c10 = aVar.c();
        p8.a aVar2 = this.a;
        if (c10) {
            aVar2.j(null, aVar2.S);
            return;
        }
        m mVar = aVar2.K;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.a).onConnectionFailed(aVar);
        }
    }
}
