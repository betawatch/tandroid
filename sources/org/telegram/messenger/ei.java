package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class ei implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretChatHelper b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 d;

    public /* synthetic */ ei(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a = i10;
        this.b = secretChatHelper;
        this.c = context;
        this.d = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$startSecretChat$27(this.c, this.d);
                break;
            default:
                this.b.lambda$startSecretChat$29(this.c, this.d);
                break;
        }
    }
}
