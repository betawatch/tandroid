// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wab b;

    public /* synthetic */ ew7(wab wabVar, byte b) {
        this.a = b;
        this.b = wabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wab wabVar = this.b;
        switch (b) {
            case 0:
                tw7 tw7Var = wabVar.Y1;
                if (tw7Var != null) {
                    tw7Var.J0();
                    break;
                }
                break;
            default:
                wabVar.o2.q1.setVisibility(8);
                break;
        }
    }
}
