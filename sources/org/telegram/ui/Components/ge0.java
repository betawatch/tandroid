package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
