package org.telegram.messenger;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class xa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0.a b;
    public final /* synthetic */ int c;

    public /* synthetic */ xa(q0.a aVar, int i10, int i11) {
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
