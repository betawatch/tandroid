package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class da implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 c;

    public /* synthetic */ da(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.a = i10;
        this.b = context;
        this.c = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.lambda$convertToMegaGroup$261(this.b, this.c);
                break;
            case 1:
                MessagesController.lambda$convertToGigaGroup$266(this.b, this.c);
                break;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.b, this.c);
                break;
        }
    }
}
