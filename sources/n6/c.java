package n6;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class c implements b {
    public final /* synthetic */ o8.a a;

    public c(o8.a aVar) {
        this.a = aVar;
    }

    @Override // n6.b
    public final void a(k6.a aVar) {
        boolean c10 = aVar.c();
        o8.a aVar2 = this.a;
        if (c10) {
            aVar2.b(null, aVar2.S);
            return;
        }
        m mVar = aVar2.K;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.a).onConnectionFailed(aVar);
        }
    }
}
