package gi;

import ai.q5;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        q5 q5Var = rVar.j;
        if (q5Var != null) {
            rVar.j = null;
            q5Var.run(Boolean.FALSE, null);
        }
    }

    @Override // v7.l
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override // v7.l
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        r rVar = this.a;
        q5 q5Var = rVar.j;
        if (q5Var != null) {
            rVar.j = null;
            q5Var.run(Boolean.TRUE, tVar);
        }
    }
}
