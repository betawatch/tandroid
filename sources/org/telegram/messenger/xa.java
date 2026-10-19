package org.telegram.messenger;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class xa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ a0.h c;

    public /* synthetic */ xa(MessagesController messagesController, a0.h hVar, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processUpdateArray$409(this.c);
                break;
            case 1:
                this.b.lambda$processUpdateArray$410(this.c);
                break;
            default:
                this.b.lambda$getChannelDifference$339(this.c);
                break;
        }
    }
}
