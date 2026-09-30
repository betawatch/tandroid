package ei;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class p extends v7.p {
    public final /* synthetic */ r a;

    public p(r rVar) {
        this.a = rVar;
    }

    @Override // v7.p
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        r rVar = this.a;
        ai.m0 m0Var = rVar.j;
        if (m0Var != null) {
            rVar.j = null;
            m0Var.run(Boolean.FALSE, null);
        }
    }

    @Override // v7.p
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override // v7.p
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
