package ki;

import bi.m6;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.pc0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                m6 m6Var = qVar.j;
                if (m6Var != null) {
                    qVar.j = null;
                    m6Var.a(Boolean.FALSE, null);
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
                m6 m6Var = qVar.j;
                if (m6Var != null) {
                    qVar.j = null;
                    m6Var.a(Boolean.TRUE, uVar);
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
