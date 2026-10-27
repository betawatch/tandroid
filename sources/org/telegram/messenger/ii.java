package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
