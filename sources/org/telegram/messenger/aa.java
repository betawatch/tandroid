package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class aa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 c;

    public /* synthetic */ aa(int i10, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
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
