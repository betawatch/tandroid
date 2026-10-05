package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class hi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretChatHelper b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ hi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
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
