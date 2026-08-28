package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qc0 extends f7.n {
    public final /* synthetic */ yc0 a;

    public qc0(yc0 yc0Var) {
        this.a = yc0Var;
    }

    @Override // f7.n
    public final void a(int i9, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i9 + " \"" + ((Object) charSequence) + "\"");
        this.a.m(true);
    }

    @Override // f7.n
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.a.m(true);
    }

    @Override // f7.n
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.a.k(true);
    }
}
