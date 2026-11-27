// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vab b;

    public /* synthetic */ ew7(vab vabVar, byte b) {
        this.a = b;
        this.b = vabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vab vabVar = this.b;
        switch (b) {
            case 0:
                tw7 tw7Var = vabVar.Y1;
                if (tw7Var != null) {
                    tw7Var.J0();
                    break;
                }
                break;
            default:
                vabVar.o2.q1.setVisibility(8);
                break;
        }
    }
}
