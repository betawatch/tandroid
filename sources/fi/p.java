package fi;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
