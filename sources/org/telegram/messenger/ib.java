package org.telegram.messenger;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class ib implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0.a b;
    public final /* synthetic */ int c;

    public /* synthetic */ ib(q0.a aVar, int i10, int i11) {
        this.a = i11;
        this.b = aVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.b, this.c);
                break;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.b, this.c);
                break;
        }
    }
}
