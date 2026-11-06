package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iu implements org.telegram.messenger.sr {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;

    public /* synthetic */ iu(ww wwVar, int i7) {
        this.a = i7;
        this.b = wwVar;
    }

    @Override // org.telegram.messenger.sr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                ww wwVar = this.b;
                wwVar.getClass();
                wwVar.U1 = i7 != 0;
                org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts", wwVar.U1).apply();
                wwVar.u3(false);
                break;
            default:
                ww wwVar2 = this.b;
                wwVar2.getClass();
                wwVar2.U1 = i7 != 0;
                org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts", wwVar2.U1).commit();
                wwVar2.u3(false);
                break;
        }
    }
}
