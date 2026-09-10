package di;

import bi.k6;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class s extends v7.n {
    public final /* synthetic */ u a;

    public s(u uVar) {
        this.a = uVar;
    }

    @Override // v7.n
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        u uVar = this.a;
        k6 k6Var = uVar.j;
        if (k6Var != null) {
            uVar.j = null;
            k6Var.run(Boolean.FALSE, null);
        }
    }

    @Override // v7.n
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override // v7.n
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        u uVar = this.a;
        k6 k6Var = uVar.j;
        if (k6Var != null) {
            uVar.j = null;
            k6Var.run(Boolean.TRUE, tVar);
        }
    }
}
