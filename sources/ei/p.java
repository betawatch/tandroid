package ei;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class p extends v7.n {
    public final /* synthetic */ r a;

    public p(r rVar) {
        this.a = rVar;
    }

    @Override // v7.n
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        r rVar = this.a;
        ai.m0 m0Var = rVar.j;
        if (m0Var != null) {
            rVar.j = null;
            m0Var.run(Boolean.FALSE, null);
        }
    }

    @Override // v7.n
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override // v7.n
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        r rVar = this.a;
        ai.m0 m0Var = rVar.j;
        if (m0Var != null) {
            rVar.j = null;
            m0Var.run(Boolean.TRUE, sVar);
        }
    }
}
