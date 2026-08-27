package nh;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class o extends e7.t {
    public final /* synthetic */ q b;

    public o(q qVar) {
        this.b = qVar;
    }

    @Override // e7.t
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        q qVar = this.b;
        cg.u0 u0Var = qVar.j;
        if (u0Var != null) {
            qVar.j = null;
            u0Var.run(Boolean.FALSE, null);
        }
    }

    @Override // e7.t
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override // e7.t
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        q qVar = this.b;
        cg.u0 u0Var = qVar.j;
        if (u0Var != null) {
            qVar.j = null;
            u0Var.run(Boolean.TRUE, tVar);
        }
    }
}
