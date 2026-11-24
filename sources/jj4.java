// default package

import android.widget.ImageView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sj4 b;

    public /* synthetic */ jj4(sj4 sj4Var, byte b) {
        this.a = b;
        this.b = sj4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object[] objArr = 0;
        byte b2 = 1;
        sj4 sj4Var = this.b;
        switch (b) {
            case 0:
                ImageView imageView = sj4Var.l;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    sj4Var.l.setImageDrawable(null);
                    break;
                }
                break;
            case 1:
                ImageView imageView2 = sj4Var.l;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    sj4Var.l.setImageDrawable(null);
                    break;
                }
                break;
            case 2:
                if (sj4Var.b() && sj4Var.c()) {
                    float f = sj4Var.M[0];
                    if (sj4Var.b.Z(f >= ((float) sj4Var.x) * 0.5f, f, sj4Var.G) && !sj4Var.u) {
                        sj4Var.u = true;
                        sj4Var.o(true);
                        if (!sj4Var.w) {
                            sj4Var.w = true;
                            gl.e3(sj4Var.P, 1500L);
                            break;
                        }
                    }
                }
                break;
            case 3:
                gl.d3(new jj4(sj4Var, objArr == true ? 1 : 0));
                break;
            default:
                sj4Var.getClass();
                gl.d3(new jj4(sj4Var, b2));
                break;
        }
    }
}
