package di;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b0(Object obj, int i10, int i11, int i12, int i13) {
        this.a = i13;
        this.e = obj;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).b;
                o8 o8Var = d0Var.n;
                if (o8Var != null) {
                    int i10 = o8Var.k0;
                    int i11 = this.b;
                    int i12 = this.c;
                    int i13 = this.d;
                    if (i10 != i11 || o8Var.l0 != i12 || o8Var.Q != i13) {
                        o8Var.k0 = i11;
                        o8Var.l0 = i12;
                        o8Var.Q = i13;
                        TextureView textureView = d0Var.e;
                        if (textureView != null) {
                            textureView.requestLayout();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ji.v3 v3Var = (ji.v3) this.e;
                KeyEvent.Callback z42 = v3Var.z4(this.b);
                if (z42 instanceof org.telegram.ui.Cells.p9) {
                    v3Var.n3.c0(this.c, this.d, (org.telegram.ui.Cells.p9) z42);
                    break;
                }
                break;
            case 2:
                ji.k3 k3Var = (ji.k3) this.e;
                ji.v3.J1(k3Var.b, this.b, this.c, this.d);
                break;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.b, this.c, this.d);
                break;
        }
    }
}
