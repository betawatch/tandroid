// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fh6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ph6 b;

    public /* synthetic */ fh6(ph6 ph6Var, byte b) {
        this.a = b;
        this.b = ph6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ph6 ph6Var = this.b;
        switch (b) {
            case 0:
                mh6 mh6Var = ph6Var.a;
                qh6 qh6Var = ph6Var.h0;
                mh6 mh6Var2 = ph6Var.b;
                if (mh6Var2 != null) {
                    if (qh6Var.d0) {
                        mh6Var.clearFocus();
                        mh6Var2.clearFocus();
                    } else if (mh6Var.length() != 0) {
                        mh6Var2.requestFocus();
                        if (!ph6Var.U) {
                            mh6Var2.setSelection(mh6Var2.length());
                        }
                        qh6Var.M1(mh6Var2);
                    } else {
                        mh6Var.requestFocus();
                        qh6Var.M1(mh6Var);
                    }
                }
                if (qh6Var.G == 0) {
                    ph6Var.s();
                    break;
                }
                break;
            case 1:
                ph6Var.postDelayed(new fh6(ph6Var, (byte) 2), 200L);
                break;
            case 2:
                ph6Var.h(null);
                break;
            case 3:
                ph6Var.t(true);
                break;
            default:
                ph6Var.h0.M1(ph6Var.b);
                break;
        }
    }
}
