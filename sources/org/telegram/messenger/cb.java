package org.telegram.messenger;

import android.util.SparseArray;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
