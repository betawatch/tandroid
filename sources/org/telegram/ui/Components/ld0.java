package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ld0 extends com.google.android.gms.internal.play_billing.s1 {
    public final /* synthetic */ vd0 a;

    public ld0(vd0 vd0Var) {
        this.a = vd0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.s1
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.a.m(true);
    }

    @Override // com.google.android.gms.internal.play_billing.s1
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.a.m(true);
    }

    @Override // com.google.android.gms.internal.play_billing.s1
    public final void c(androidx.biometric.v vVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.a.k(true);
    }
}
