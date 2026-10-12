package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ bw(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                yy yyVar = this.b;
                yyVar.O1 = (Long) obj;
                yyVar.R4();
                break;
            default:
                yy.a0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
