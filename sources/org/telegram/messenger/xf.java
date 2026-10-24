package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class xf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;

    public /* synthetic */ xf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.a = 1;
        this.b = messagesStorage;
        this.c = arrayList;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$putWallpapers$78(this.d, this.c);
                break;
            case 1:
                this.b.lambda$unpinAllDialogsExceptNew$247(this.c, this.d);
                break;
            case 2:
                this.b.lambda$getDownloadQueue$185(this.d, this.c);
                break;
            default:
                this.b.lambda$putWidgetDialogs$166(this.d, this.c);
                break;
        }
    }

    public /* synthetic */ xf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = messagesStorage;
        this.d = i10;
        this.c = arrayList;
    }
}
