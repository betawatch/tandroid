package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class md0 extends com.google.android.gms.internal.play_billing.s1 {
    public final /* synthetic */ wd0 a;

    public md0(wd0 wd0Var) {
        this.a = wd0Var;
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
    public final void c(androidx.biometric.u uVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.a.k(true);
    }
}
