package fi;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class q extends v7.n {
    public final /* synthetic */ s a;

    public q(s sVar) {
        this.a = sVar;
    }

    @Override // v7.n
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        s sVar = this.a;
        bi.f0 f0Var = sVar.j;
        if (f0Var != null) {
            sVar.j = null;
            f0Var.run(Boolean.FALSE, null);
        }
    }

    @Override // v7.n
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override // v7.n
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        s sVar = this.a;
        bi.f0 f0Var = sVar.j;
        if (f0Var != null) {
            sVar.j = null;
            f0Var.run(Boolean.TRUE, tVar);
        }
    }
}
