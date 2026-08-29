package org.telegram.messenger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class ab implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0.a b;
    public final /* synthetic */ int c;

    public /* synthetic */ ab(q0.a aVar, int i10, int i11) {
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
