package org.telegram.messenger.video;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoPlayerHolderBase b;

    public /* synthetic */ j(VideoPlayerHolderBase videoPlayerHolderBase, int i7) {
        this.a = i7;
        this.b = videoPlayerHolderBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$new$13();
                break;
            case 1:
                this.b.lambda$start$1();
                break;
            case 2:
                this.b.lambda$new$14();
                break;
            case 3:
                this.b.lambda$play$6();
                break;
            case 4:
                this.b.lambda$pause$4();
                break;
            default:
                this.b.lambda$loopBack$9();
                break;
        }
    }
}
