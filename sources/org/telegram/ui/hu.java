package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
