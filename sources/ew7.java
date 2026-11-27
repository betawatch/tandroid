// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
