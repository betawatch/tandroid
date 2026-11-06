package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;

    public /* synthetic */ hu(ww wwVar, int i7) {
        this.a = i7;
        this.b = wwVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ww wwVar = this.b;
                wwVar.O1 = (Long) obj;
                wwVar.g5();
                break;
            default:
                ww.f0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
