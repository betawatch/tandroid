package b6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c implements b {
    public final /* synthetic */ c8.a a;

    public c(c8.a aVar) {
        this.a = aVar;
    }

    @Override // b6.b
    public final void a(y5.a aVar) {
        boolean f10 = aVar.f();
        c8.a aVar2 = this.a;
        if (f10) {
            aVar2.i(null, aVar2.P);
            return;
        }
        n nVar = aVar2.H;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.a).onConnectionFailed(aVar);
        }
    }
}
