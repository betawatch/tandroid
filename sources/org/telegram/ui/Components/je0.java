package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class je0 extends v7.l {
    public final /* synthetic */ re0 a;

    public je0(re0 re0Var) {
        this.a = re0Var;
    }

    @Override // v7.l
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.a.n(true);
    }

    @Override // v7.l
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.a.n(true);
    }

    @Override // v7.l
    public final void c(androidx.biometric.u uVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.a.m(true);
    }
}
