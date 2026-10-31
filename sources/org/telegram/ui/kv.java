package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;

    public /* synthetic */ kv(ay ayVar, int i10) {
        this.a = i10;
        this.b = ayVar;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ay ayVar = this.b;
                ayVar.O1 = (Long) obj;
                ayVar.f5();
                break;
            default:
                ay.e0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
