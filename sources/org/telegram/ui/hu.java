package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx b;

    public /* synthetic */ hu(cx cxVar, int i7) {
        this.a = i7;
        this.b = cxVar;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                cx cxVar = this.b;
                cxVar.Q1 = (Long) obj;
                cxVar.o5();
                break;
            default:
                cx.C0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
