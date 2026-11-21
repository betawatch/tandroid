package ki;

import bi.p6;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.qc0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class n extends a8.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // a8.m1
    public final void a(int i7, CharSequence charSequence) {
        switch (this.a) {
            case 0:
                a8.b("BotBiometry onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                p pVar = (p) this.b;
                p6 p6Var = pVar.j;
                if (p6Var != null) {
                    pVar.j = null;
                    p6Var.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                a8.b("PasscodeView onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                ((qc0) this.b).o(true);
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
                ((qc0) this.b).o(true);
                break;
        }
    }

    @Override // a8.m1
    public final void c(androidx.biometric.u uVar) {
        switch (this.a) {
            case 0:
                a8.b("BotBiometry onAuthenticationSucceeded");
                p pVar = (p) this.b;
                p6 p6Var = pVar.j;
                if (p6Var != null) {
                    pVar.j = null;
                    p6Var.a(Boolean.TRUE, uVar);
                    break;
                }
                break;
            default:
                a8.b("PasscodeView onAuthenticationSucceeded");
                ((qc0) this.b).n(true);
                break;
        }
    }
}
