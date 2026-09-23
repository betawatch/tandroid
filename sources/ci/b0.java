package ci;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                l8 l8Var = d0Var.n;
                if (l8Var != null) {
                    int i10 = l8Var.k0;
                    int i11 = this.b;
                    int i12 = this.c;
                    int i13 = this.d;
                    if (i10 != i11 || l8Var.l0 != i12 || l8Var.Q != i13) {
                        l8Var.k0 = i11;
                        l8Var.l0 = i12;
                        l8Var.Q = i13;
                        TextureView textureView = d0Var.e;
                        if (textureView != null) {
                            textureView.requestLayout();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ii.x3 x3Var = (ii.x3) this.e;
                KeyEvent.Callback A4 = x3Var.A4(this.b);
                if (A4 instanceof org.telegram.ui.Cells.q9) {
                    x3Var.n3.c0(this.c, this.d, (org.telegram.ui.Cells.q9) A4);
                    break;
                }
                break;
            case 2:
                ii.m3 m3Var = (ii.m3) this.e;
                ii.x3.K1(m3Var.b, this.b, this.c, this.d);
                break;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.b, this.c, this.d);
                break;
        }
    }
}
