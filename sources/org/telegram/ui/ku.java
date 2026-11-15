package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku implements org.telegram.messenger.pr {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ ku(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // org.telegram.messenger.pr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                yw ywVar = this.b;
                ywVar.getClass();
                ywVar.W1 = i7 != 0;
                org.telegram.messenger.np.f1().edit().putBoolean("askAboutContacts", ywVar.W1).apply();
                ywVar.u3(false);
                break;
            default:
                yw ywVar2 = this.b;
                ywVar2.getClass();
                ywVar2.W1 = i7 != 0;
                org.telegram.messenger.np.f1().edit().putBoolean("askAboutContacts", ywVar2.W1).commit();
                ywVar2.u3(false);
                break;
        }
    }
}
