package org.telegram.messenger;

import android.util.SparseArray;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class vd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ SparseArray c;

    public /* synthetic */ vd(MessagesController messagesController, SparseArray sparseArray, int i10) {
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
