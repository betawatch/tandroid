package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ge0 extends v7.l {
    public final /* synthetic */ pe0 a;

    public ge0(pe0 pe0Var) {
        this.a = pe0Var;
    }

    @Override // v7.l
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.a.o(true);
    }

    @Override // v7.l
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.a.o(true);
    }

    @Override // v7.l
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.a.n(true);
    }
}
