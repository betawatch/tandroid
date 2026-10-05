package ei;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class q extends v7.o {
    public final /* synthetic */ s a;

    public q(s sVar) {
        this.a = sVar;
    }

    @Override // v7.o
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        s sVar = this.a;
        ai.m0 m0Var = sVar.j;
        if (m0Var != null) {
            sVar.j = null;
            m0Var.run(Boolean.FALSE, null);
        }
    }

    @Override // v7.o
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override // v7.o
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        s sVar2 = this.a;
        ai.m0 m0Var = sVar2.j;
        if (m0Var != null) {
            sVar2.j = null;
            m0Var.run(Boolean.TRUE, sVar);
        }
    }
}
