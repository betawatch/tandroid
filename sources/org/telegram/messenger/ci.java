package org.telegram.messenger;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class ci implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretChatHelper b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 d;

    public /* synthetic */ ci(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.a = i10;
        this.b = secretChatHelper;
        this.c = context;
        this.d = c2Var;
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
