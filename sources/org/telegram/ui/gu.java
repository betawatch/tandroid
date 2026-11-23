package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx b;

    public /* synthetic */ gu(bx bxVar, int i7) {
        this.a = i7;
        this.b = bxVar;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                bx bxVar = this.b;
                bxVar.Q1 = (Long) obj;
                bxVar.o5();
                break;
            default:
                bx.C0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
