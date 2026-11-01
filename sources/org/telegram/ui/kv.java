package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv implements org.telegram.messenger.cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx b;

    public /* synthetic */ kv(zx zxVar, int i10) {
        this.a = i10;
        this.b = zxVar;
    }

    @Override // org.telegram.messenger.cs
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                zx zxVar = this.b;
                zxVar.getClass();
                zxVar.U1 = i10 != 0;
                org.telegram.messenger.wp.e1().edit().putBoolean("askAboutContacts", zxVar.U1).apply();
                zxVar.u3(false);
                break;
            default:
                zx zxVar2 = this.b;
                zxVar2.getClass();
                zxVar2.U1 = i10 != 0;
                org.telegram.messenger.wp.e1().edit().putBoolean("askAboutContacts", zxVar2.U1).commit();
                zxVar2.u3(false);
                break;
        }
    }
}
