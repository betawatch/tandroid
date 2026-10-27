package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class fa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 c;

    public /* synthetic */ fa(int i10, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = i10;
        this.b = context;
        this.c = e2Var;
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
