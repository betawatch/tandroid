package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r4(int i9, String str, boolean z10) {
        this.b = i9;
        this.d = str;
        this.c = z10;
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

    public /* synthetic */ r4(int i9, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.b = i9;
        this.c = z10;
    }
}
