package org.telegram.messenger;

import android.util.SparseArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class rd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ SparseArray c;

    public /* synthetic */ rd(MessagesController messagesController, SparseArray sparseArray, int i9) {
        this.a = i9;
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
