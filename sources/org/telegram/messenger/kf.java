package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class kf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ kf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.a = 2;
        this.b = messagesStorage;
        this.d = arrayList;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getDownloadQueue$188(this.c, this.d);
                break;
            case 1:
                this.b.lambda$putWallpapers$81(this.c, this.d);
                break;
            case 2:
                this.b.lambda$unpinAllDialogsExceptNew$250(this.d, this.c);
                break;
            default:
                this.b.lambda$putWidgetDialogs$169(this.c, this.d);
                break;
        }
    }

    public /* synthetic */ kf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = messagesStorage;
        this.c = i10;
        this.d = arrayList;
    }
}
