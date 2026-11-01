package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx b;

    public /* synthetic */ jv(zx zxVar, int i10) {
        this.a = i10;
        this.b = zxVar;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                zx zxVar = this.b;
                zxVar.O1 = (Long) obj;
                zxVar.g5();
                break;
            default:
                zx.f0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
