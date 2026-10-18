package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class de0 extends v7.l {
    public final /* synthetic */ le0 a;

    public de0(le0 le0Var) {
        this.a = le0Var;
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
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.a.m(true);
    }
}
