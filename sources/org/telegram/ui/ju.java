package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ ju(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                yw ywVar = this.b;
                ywVar.P1 = (Long) obj;
                ywVar.g5();
                break;
            default:
                yw.f0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
