package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zw b;

    public /* synthetic */ ku(zw zwVar, int i7) {
        this.a = i7;
        this.b = zwVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                zw zwVar = this.b;
                zwVar.P1 = (Long) obj;
                zwVar.g5();
                break;
            default:
                zw.f0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
