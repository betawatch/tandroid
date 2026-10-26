package hi;

import bi.m5;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class w extends a8.a1 {
    public final /* synthetic */ y a;

    public w(y yVar) {
        this.a = yVar;
    }

    @Override // a8.a1
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("BotBiometry onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        y yVar = this.a;
        m5 m5Var = yVar.j;
        if (m5Var != null) {
            yVar.j = null;
            m5Var.run(Boolean.FALSE, null);
        }
    }

    @Override // a8.a1
    public final void b() {
        FileLog.d("BotBiometry onAuthenticationFailed");
    }

    @Override // a8.a1
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("BotBiometry onAuthenticationSucceeded");
        y yVar = this.a;
        m5 m5Var = yVar.j;
        if (m5Var != null) {
            yVar.j = null;
            m5Var.run(Boolean.TRUE, sVar);
        }
    }
}
