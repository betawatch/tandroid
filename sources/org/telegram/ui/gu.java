package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements org.telegram.messenger.kr {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw b;

    public /* synthetic */ gu(uw uwVar, int i3) {
        this.a = i3;
        this.b = uwVar;
    }

    @Override // org.telegram.messenger.kr
    public final void a(int i3) {
        switch (this.a) {
            case 0:
                uw uwVar = this.b;
                uwVar.getClass();
                uwVar.V1 = i3 != 0;
                org.telegram.messenger.hp.f1().edit().putBoolean("askAboutContacts", uwVar.V1).apply();
                uwVar.u3(false);
                break;
            default:
                uw uwVar2 = this.b;
                uwVar2.getClass();
                uwVar2.V1 = i3 != 0;
                org.telegram.messenger.hp.f1().edit().putBoolean("askAboutContacts", uwVar2.V1).commit();
                uwVar2.u3(false);
                break;
        }
    }
}
