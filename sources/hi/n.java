package hi;

import bi.p5;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.ec0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class n extends a8.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // a8.l1
    public final void a(int i7, CharSequence charSequence) {
        switch (this.a) {
            case 0:
                a8.b("BotBiometry onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                p pVar = (p) this.b;
                p5 p5Var = pVar.j;
                if (p5Var != null) {
                    pVar.j = null;
                    p5Var.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                a8.b("PasscodeView onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                ((ec0) this.b).o(true);
                break;
        }
    }

    @Override // a8.l1
    public final void b() {
        switch (this.a) {
            case 0:
                a8.b("BotBiometry onAuthenticationFailed");
                break;
            default:
                a8.b("PasscodeView onAuthenticationFailed");
                ((ec0) this.b).o(true);
                break;
        }
    }

    @Override // a8.l1
    public final void c(androidx.biometric.u uVar) {
        switch (this.a) {
            case 0:
                a8.b("BotBiometry onAuthenticationSucceeded");
                p pVar = (p) this.b;
                p5 p5Var = pVar.j;
                if (p5Var != null) {
                    pVar.j = null;
                    p5Var.a(Boolean.TRUE, uVar);
                    break;
                }
                break;
            default:
                a8.b("PasscodeView onAuthenticationSucceeded");
                ((ec0) this.b).n(true);
                break;
        }
    }
}
