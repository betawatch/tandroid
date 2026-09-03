package org.telegram.messenger;

import android.util.SparseArray;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ae implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ SparseArray c;

    public /* synthetic */ ae(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = sparseArray;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getDifference$352(this.c);
                break;
            default:
                this.b.lambda$getChannelDifference$339(this.c);
                break;
        }
    }
}
