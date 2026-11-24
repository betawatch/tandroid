// default package

import android.widget.ImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tl4 b;

    public /* synthetic */ nl4(tl4 tl4Var, byte b) {
        this.a = b;
        this.b = tl4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object[] objArr = 0;
        byte b2 = 1;
        tl4 tl4Var = this.b;
        switch (b) {
            case 0:
                ImageView imageView = tl4Var.l;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    tl4Var.l.setImageDrawable(null);
                    break;
                }
                break;
            case 1:
                ImageView imageView2 = tl4Var.l;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    tl4Var.l.setImageDrawable(null);
                    break;
                }
                break;
            case 2:
                if (tl4Var.b() && tl4Var.c()) {
                    float f = tl4Var.M[0];
                    if (tl4Var.b.F(f >= ((float) tl4Var.x) * 0.5f, f, tl4Var.G) && !tl4Var.u) {
                        tl4Var.u = true;
                        tl4Var.o(true);
                        if (!tl4Var.w) {
                            tl4Var.w = true;
                            gm.d3(tl4Var.P, 1500L);
                            break;
                        }
                    }
                }
                break;
            case 3:
                gm.c3(new nl4(tl4Var, objArr == true ? 1 : 0));
                break;
            default:
                tl4Var.getClass();
                gm.c3(new nl4(tl4Var, b2));
                break;
        }
    }
}
