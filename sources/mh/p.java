package mh;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p extends f7.n {
    public final /* synthetic */ r a;

    public p(r rVar) {
        this.a = rVar;
    }

    @Override // f7.n
    public final void a(int i9, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i9 + " \"" + ((Object) charSequence) + "\"");
        r rVar = this.a;
        bg.y0 y0Var = rVar.j;
        if (y0Var != null) {
            rVar.j = null;
            y0Var.run(Boolean.FALSE, null);
        }
    }

    @Override // f7.n
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override // f7.n
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        r rVar = this.a;
        bg.y0 y0Var = rVar.j;
        if (y0Var != null) {
            rVar.j = null;
            y0Var.run(Boolean.TRUE, tVar);
        }
    }
}
