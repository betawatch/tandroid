package org.telegram.messenger;

import android.util.SparseArray;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class ab implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ SparseArray c;

    public /* synthetic */ ab(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = sparseArray;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getChannelDifference$340(this.c);
                break;
            default:
                this.b.lambda$getDifference$353(this.c);
                break;
        }
    }
}
