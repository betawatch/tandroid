package ii;

import org.telegram.messenger.a8;
import org.telegram.ui.Components.zb0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p extends b8.l0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // b8.l0
    public final void a(int i3, CharSequence charSequence) {
        switch (this.a) {
            case 0:
                a8.b("BotBiometry onAuthenticationError " + i3 + " \"" + ((Object) charSequence) + "\"");
                r rVar = (r) this.b;
                ai.q4 q4Var = rVar.j;
                if (q4Var != null) {
                    rVar.j = null;
                    q4Var.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                a8.b("PasscodeView onAuthenticationError " + i3 + " \"" + ((Object) charSequence) + "\"");
                ((zb0) this.b).o(true);
                break;
        }
    }

    @Override // b8.l0
    public final void b() {
        switch (this.a) {
            case 0:
                a8.b("BotBiometry onAuthenticationFailed");
                break;
            default:
                a8.b("PasscodeView onAuthenticationFailed");
                ((zb0) this.b).o(true);
                break;
        }
    }

    @Override // b8.l0
    public final void c(androidx.biometric.u uVar) {
        switch (this.a) {
            case 0:
                a8.b("BotBiometry onAuthenticationSucceeded");
                r rVar = (r) this.b;
                ai.q4 q4Var = rVar.j;
                if (q4Var != null) {
                    rVar.j = null;
                    q4Var.a(Boolean.TRUE, uVar);
                    break;
                }
                break;
            default:
                a8.b("PasscodeView onAuthenticationSucceeded");
                ((zb0) this.b).n(true);
                break;
        }
    }
}
