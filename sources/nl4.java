// default package

import android.widget.ImageView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xl4 b;

    public /* synthetic */ nl4(xl4 xl4Var, byte b) {
        this.a = b;
        this.b = xl4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object[] objArr = 0;
        byte b2 = 1;
        xl4 xl4Var = this.b;
        switch (b) {
            case 0:
                ImageView imageView = xl4Var.n;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    xl4Var.n.setImageDrawable(null);
                    break;
                }
                break;
            case 1:
                ImageView imageView2 = xl4Var.n;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    xl4Var.n.setImageDrawable(null);
                    break;
                }
                break;
            case 2:
                if (xl4Var.b() && xl4Var.c()) {
                    float f = xl4Var.S[0];
                    if (xl4Var.b.G(f >= ((float) xl4Var.A) * 0.5f, f, xl4Var.J) && !xl4Var.x) {
                        xl4Var.x = true;
                        xl4Var.q(true);
                        if (!xl4Var.z) {
                            xl4Var.z = true;
                            hl.d3(xl4Var.V, 1500L);
                            break;
                        }
                    }
                }
                break;
            case 3:
                hl.c3(new nl4(xl4Var, objArr == true ? 1 : 0));
                break;
            default:
                xl4Var.getClass();
                hl.c3(new nl4(xl4Var, b2));
                break;
        }
    }
}
