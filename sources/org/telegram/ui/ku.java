package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku implements org.telegram.messenger.sr {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ ku(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // org.telegram.messenger.sr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                yw ywVar = this.b;
                ywVar.getClass();
                ywVar.V1 = i7 != 0;
                org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts", ywVar.V1).apply();
                ywVar.u3(false);
                break;
            default:
                yw ywVar2 = this.b;
                ywVar2.getClass();
                ywVar2.V1 = i7 != 0;
                org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts", ywVar2.V1).commit();
                ywVar2.u3(false);
                break;
        }
    }
}
