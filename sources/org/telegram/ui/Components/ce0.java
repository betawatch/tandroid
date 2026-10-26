package org.telegram.ui.Components;

import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ce0 extends a8.a1 {
    public final /* synthetic */ le0 a;

    public ce0(le0 le0Var) {
        this.a = le0Var;
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
