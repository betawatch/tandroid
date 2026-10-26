package o6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
