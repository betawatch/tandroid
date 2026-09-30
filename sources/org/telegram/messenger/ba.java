package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class ba implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 c;

    public /* synthetic */ ba(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.a = i10;
        this.b = context;
        this.c = a2Var;
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
