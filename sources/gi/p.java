package gi;

import ai.r5;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        r5 r5Var = rVar.j;
        if (r5Var != null) {
            rVar.j = null;
            r5Var.run(Boolean.FALSE, null);
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
        r5 r5Var = rVar.j;
        if (r5Var != null) {
            rVar.j = null;
            r5Var.run(Boolean.TRUE, tVar);
        }
    }
}
