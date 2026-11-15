package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ ju(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                yw ywVar = this.b;
                ywVar.Q1 = (Long) obj;
                ywVar.g5();
                break;
            default:
                yw.f0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
