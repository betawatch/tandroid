package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vc0 extends e7.t {
    public final /* synthetic */ dd0 b;

    public vc0(dd0 dd0Var) {
        this.b = dd0Var;
    }

    @Override // e7.t
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.b.m(true);
    }

    @Override // e7.t
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.b.m(true);
    }

    @Override // e7.t
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.b.k(true);
    }
}
