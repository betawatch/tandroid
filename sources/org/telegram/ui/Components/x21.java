package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x21 implements org.telegram.messenger.rc, org.telegram.messenger.qc {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.messenger.k20 c;

    public /* synthetic */ x21(String str, String str2, org.telegram.messenger.k20 k20Var) {
        this.a = str;
        this.b = str2;
        this.c = k20Var;
    }

    @Override // org.telegram.messenger.rc
    public void a(String str) {
        n31.J0(this.a, str, this.b, this.c);
    }

    @Override // org.telegram.messenger.qc
    public void p(Exception exc) {
        n31.J0(this.a, "en", this.b, this.c);
    }
}
