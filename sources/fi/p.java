package fi;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class p extends v7.l {
    public final /* synthetic */ r a;

    public p(r rVar) {
        this.a = rVar;
    }

    @Override // v7.l
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        r rVar = this.a;
        bi.f0 f0Var = rVar.j;
        if (f0Var != null) {
            rVar.j = null;
            f0Var.run(Boolean.FALSE, null);
        }
    }

    @Override // v7.l
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override // v7.l
    public final void c(androidx.biometric.u uVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        r rVar = this.a;
        bi.f0 f0Var = rVar.j;
        if (f0Var != null) {
            rVar.j = null;
            f0Var.run(Boolean.TRUE, uVar);
        }
    }
}
