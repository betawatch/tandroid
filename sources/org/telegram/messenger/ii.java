package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class ii implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretChatHelper b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ii(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = secretChatHelper;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$resendMessages$14(this.c);
                break;
            default:
                this.b.lambda$processPendingEncMessages$0(this.c);
                break;
        }
    }
}
