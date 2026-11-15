package ki;

import org.telegram.messenger.a8;
import org.telegram.ui.Components.fc0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class p extends a8.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // a8.m1
    public final void a(int i7, CharSequence charSequence) {
        switch (this.a) {
            case 0:
                a8.b("BotBiometry onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                r rVar = (r) this.b;
                bi.e4 e4Var = rVar.j;
                if (e4Var != null) {
                    rVar.j = null;
                    e4Var.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                a8.b("PasscodeView onAuthenticationError " + i7 + " \"" + ((Object) charSequence) + "\"");
                ((fc0) this.b).o(true);
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
                ((fc0) this.b).o(true);
                break;
        }
    }

    @Override // a8.m1
    public final void c(androidx.biometric.u uVar) {
        switch (this.a) {
            case 0:
                a8.b("BotBiometry onAuthenticationSucceeded");
                r rVar = (r) this.b;
                bi.e4 e4Var = rVar.j;
                if (e4Var != null) {
                    rVar.j = null;
                    e4Var.a(Boolean.TRUE, uVar);
                    break;
                }
                break;
            default:
                a8.b("PasscodeView onAuthenticationSucceeded");
                ((fc0) this.b).n(true);
                break;
        }
    }
}
