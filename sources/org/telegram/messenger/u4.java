package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class u4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u4(int i10, String str, boolean z4) {
        this.b = i10;
        this.d = str;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ImageLoader.5.lambda$fileDidFailedUpload$3(this.b, (String) this.d, this.c);
                break;
            default:
                ((MessagesController) this.d).lambda$removeFolderTemporarily$479(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ u4(int i10, MessagesController messagesController, boolean z4) {
        this.d = messagesController;
        this.b = i10;
        this.c = z4;
    }
}
