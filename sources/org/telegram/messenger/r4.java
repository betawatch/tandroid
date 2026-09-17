package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r4(int i10, String str, boolean z10) {
        this.b = i10;
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

    public /* synthetic */ r4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.b = i10;
        this.c = z10;
    }
}
