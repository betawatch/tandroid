package fi;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
