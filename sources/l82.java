// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l82 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t82 b;

    public /* synthetic */ l82(t82 t82Var, byte b) {
        this.a = b;
        this.b = t82Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        t82 t82Var = this.b;
        switch (b) {
            case 0:
                t82Var.h.requestFocus();
                break;
            case 1:
                t82Var.h.setFocusableInTouchMode(true);
                break;
            case 2:
                t82Var.finishFragment();
                break;
            case 3:
                if (t82Var.Q && !t82Var.P) {
                    t82Var.P = true;
                    jn7.e().k(99, 512);
                    t82Var.c.setVisibility(0);
                    t82Var.c.setLayerType(2, null);
                    t82Var.i0(t82Var.R.e);
                    t82Var.R.a(true, true);
                    break;
                }
                break;
            case 4:
                m01.u(t82Var.getParentActivity(), "https://t.me/stickers");
                break;
            case 5:
                m01.u(t82Var.getParentActivity(), ob6.M0(2131752381, null));
                break;
            default:
                t82Var.d0(false);
                break;
        }
    }
}
