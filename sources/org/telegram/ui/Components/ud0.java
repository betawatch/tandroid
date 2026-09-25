package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ud0 extends v7.p {
    public final /* synthetic */ ce0 a;

    public ud0(ce0 ce0Var) {
        this.a = ce0Var;
    }

    @Override // v7.p
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.a.m(true);
    }

    @Override // v7.p
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.a.m(true);
    }

    @Override // v7.p
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.a.k(true);
    }
}
