package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx b;

    public /* synthetic */ hu(cx cxVar, int i7) {
        this.a = i7;
        this.b = cxVar;
    }

    @Override // org.telegram.messenger.x10
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
