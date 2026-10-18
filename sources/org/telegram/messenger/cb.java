package org.telegram.messenger;

import android.util.SparseArray;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class cb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ SparseArray c;

    public /* synthetic */ cb(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = sparseArray;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getDifference$351(this.c);
                break;
            default:
                this.b.lambda$getChannelDifference$338(this.c);
                break;
        }
    }
}
