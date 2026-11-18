package ki;

import bi.l6;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.pc0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class o extends a8.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // a8.m1
    public final void a(int i7, CharSequence charSequence) {
        switch (this.a) {
            case 0:
                a8.b("BotBiometry onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                q qVar = (q) this.b;
                l6 l6Var = qVar.j;
                if (l6Var != null) {
                    qVar.j = null;
                    l6Var.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                a8.b("PasscodeView onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                ((pc0) this.b).o(true);
                break;
        }
    }

    @Override // a8.m1
    public final void b() {
        switch (this.a) {
            case 0:
                a8.b("BotBiometry onAuthenticationFailed");
                break;
            default:
                a8.b("PasscodeView onAuthenticationFailed");
                ((pc0) this.b).o(true);
                break;
        }
    }

    @Override // a8.m1
    public final void c(androidx.biometric.u uVar) {
        switch (this.a) {
            case 0:
                a8.b("BotBiometry onAuthenticationSucceeded");
                q qVar = (q) this.b;
                l6 l6Var = qVar.j;
                if (l6Var != null) {
                    qVar.j = null;
                    l6Var.a(Boolean.TRUE, uVar);
                    break;
                }
                break;
            default:
                a8.b("PasscodeView onAuthenticationSucceeded");
                ((pc0) this.b).n(true);
                break;
        }
    }
}
