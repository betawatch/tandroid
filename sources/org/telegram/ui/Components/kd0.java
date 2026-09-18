package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class kd0 extends v7.n {
    public final /* synthetic */ sd0 a;

    public kd0(sd0 sd0Var) {
        this.a = sd0Var;
    }

    @Override // v7.n
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.a.m(true);
    }

    @Override // v7.n
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.a.m(true);
    }

    @Override // v7.n
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.a.k(true);
    }
}
