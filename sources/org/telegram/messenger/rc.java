package org.telegram.messenger;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class rc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ rc(int i10, boolean[] zArr) {
        this.a = i10;
        this.b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.lambda$openByUserName$459(this.b);
                break;
            default:
                MessagesController.lambda$openApp$500(this.b);
                break;
        }
    }
}
