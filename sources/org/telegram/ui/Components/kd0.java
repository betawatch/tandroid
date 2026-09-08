package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
    public final void c(androidx.biometric.t tVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.a.k(true);
    }
}
