package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
