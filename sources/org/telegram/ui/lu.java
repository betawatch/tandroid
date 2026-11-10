package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lu implements org.telegram.messenger.sr {
    public final /* synthetic */ int a;
    public final /* synthetic */ zw b;

    public /* synthetic */ lu(zw zwVar, int i7) {
        this.a = i7;
        this.b = zwVar;
    }

    @Override // org.telegram.messenger.sr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                zw zwVar = this.b;
                zwVar.getClass();
                zwVar.V1 = i7 != 0;
                org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts", zwVar.V1).apply();
                zwVar.u3(false);
                break;
            default:
                zw zwVar2 = this.b;
                zwVar2.getClass();
                zwVar2.V1 = i7 != 0;
                org.telegram.messenger.qp.f1().edit().putBoolean("askAboutContacts", zwVar2.V1).commit();
                zwVar2.u3(false);
                break;
        }
    }
}
