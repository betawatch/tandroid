package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
