package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class wd0 extends v7.o {
    public final /* synthetic */ ee0 a;

    public wd0(ee0 ee0Var) {
        this.a = ee0Var;
    }

    @Override // v7.o
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.a.m(true);
    }

    @Override // v7.o
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.a.m(true);
    }

    @Override // v7.o
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.a.k(true);
    }
}
