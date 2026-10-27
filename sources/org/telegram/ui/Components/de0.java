package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class de0 extends a8.a1 {
    public final /* synthetic */ me0 a;

    public de0(me0 me0Var) {
        this.a = me0Var;
    }

    @Override // a8.a1
    public final void a(int i10, CharSequence charSequence) {
        FileLog.d("PasscodeView onAuthenticationError " + i10 + " \"" + ((Object) charSequence) + "\"");
        this.a.o(true);
    }

    @Override // a8.a1
    public final void b() {
        FileLog.d("PasscodeView onAuthenticationFailed");
        this.a.o(true);
    }

    @Override // a8.a1
    public final void c(androidx.biometric.s sVar) {
        FileLog.d("PasscodeView onAuthenticationSucceeded");
        this.a.n(true);
    }
}
