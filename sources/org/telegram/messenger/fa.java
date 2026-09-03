package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class fa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 c;

    public /* synthetic */ fa(int i10, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = i10;
        this.b = context;
        this.c = d2Var;
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
