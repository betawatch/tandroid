package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class ba implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 c;

    public /* synthetic */ ba(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.a = i10;
        this.b = context;
        this.c = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.lambda$convertToGigaGroup$267(this.b, this.c);
                break;
            case 1:
                MessagesController.lambda$convertToMegaGroup$262(this.b, this.c);
                break;
            default:
                SecretChatHelper.lambda$startSecretChat$24(this.b, this.c);
                break;
        }
    }
}
