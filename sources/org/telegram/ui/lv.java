package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv implements org.telegram.messenger.bs {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;

    public /* synthetic */ lv(ay ayVar, int i10) {
        this.a = i10;
        this.b = ayVar;
    }

    @Override // org.telegram.messenger.bs
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                ay ayVar = this.b;
                ayVar.getClass();
                ayVar.U1 = i10 != 0;
                org.telegram.messenger.vp.e1().edit().putBoolean("askAboutContacts", ayVar.U1).apply();
                ayVar.t3(false);
                break;
            default:
                ay ayVar2 = this.b;
                ayVar2.getClass();
                ayVar2.U1 = i10 != 0;
                org.telegram.messenger.vp.e1().edit().putBoolean("askAboutContacts", ayVar2.U1).commit();
                ayVar2.t3(false);
                break;
        }
    }
}
