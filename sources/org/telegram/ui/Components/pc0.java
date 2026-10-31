package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pc0 extends v7.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pc0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // v7.l
    public final void a(int i10, CharSequence charSequence) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.f8.b("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
                ((zc0) this.b).o(true);
                break;
            default:
                org.telegram.messenger.f8.b("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
                xh.n nVar = (xh.n) this.b;
                rh.s6 s6Var = nVar.j;
                if (s6Var != null) {
                    nVar.j = null;
                    s6Var.a(Boolean.FALSE, null);
                    break;
                }
                break;
        }
    }

    @Override // v7.l
    public final void b() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.f8.b("PasscodeView onAuthenticationFailed");
                ((zc0) this.b).o(true);
                break;
            default:
                org.telegram.messenger.f8.b("BotBiometry onAuthenticationFailed");
                break;
        }
    }

    @Override // v7.l
    public final void c(androidx.biometric.t tVar) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.f8.b("PasscodeView onAuthenticationSucceeded");
                ((zc0) this.b).n(true);
                break;
            default:
                org.telegram.messenger.f8.b("BotBiometry onAuthenticationSucceeded");
                xh.n nVar = (xh.n) this.b;
                rh.s6 s6Var = nVar.j;
                if (s6Var != null) {
                    nVar.j = null;
                    s6Var.a(Boolean.TRUE, tVar);
                    break;
                }
                break;
        }
    }
}
