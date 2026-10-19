package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class v4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v4(int i10, String str, boolean z10) {
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
                ((MessagesController) this.d).lambda$removeFolderTemporarily$482(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ v4(int i10, MessagesController messagesController, boolean z10) {
        this.d = messagesController;
        this.b = i10;
        this.c = z10;
    }
}
