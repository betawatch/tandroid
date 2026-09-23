package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class gi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretChatHelper b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ gi(SecretChatHelper secretChatHelper, ArrayList arrayList, int i10) {
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
