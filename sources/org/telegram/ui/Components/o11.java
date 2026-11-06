package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o11 implements org.telegram.messenger.pc, org.telegram.messenger.oc {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.messenger.v10 c;

    public /* synthetic */ o11(String str, String str2, org.telegram.messenger.v10 v10Var) {
        this.a = str;
        this.b = str2;
        this.c = v10Var;
    }

    @Override // org.telegram.messenger.pc
    public void a(String str) {
        e21.J0(this.a, str, this.b, this.c);
    }

    @Override // org.telegram.messenger.oc
    public void r(Exception exc) {
        e21.J0(this.a, "en", this.b, this.c);
    }
}
