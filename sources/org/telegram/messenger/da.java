package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class da implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 c;

    public /* synthetic */ da(int i10, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.a = i10;
        this.b = context;
        this.c = c2Var;
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
