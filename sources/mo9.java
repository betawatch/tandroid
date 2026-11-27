// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qo9 b;

    public /* synthetic */ mo9(qo9 qo9Var, byte b) {
        this.a = b;
        this.b = qo9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qo9 qo9Var = this.b;
        switch (b) {
            case 0:
                qo9Var.c();
                break;
            default:
                qo9Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(k43.h).setDuration(280L).start();
                qo9Var.c = System.currentTimeMillis();
                qo9Var.invalidate();
                try {
                    qo9Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                hl.d3(qo9Var.h, 59500L);
                break;
        }
    }
}
