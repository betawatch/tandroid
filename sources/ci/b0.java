package ci;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                ii.w3 w3Var = (ii.w3) this.e;
                KeyEvent.Callback A4 = w3Var.A4(this.b);
                if (A4 instanceof org.telegram.ui.Cells.p9) {
                    w3Var.n3.c0(this.c, this.d, (org.telegram.ui.Cells.p9) A4);
                    break;
                }
                break;
            case 2:
                ii.l3 l3Var = (ii.l3) this.e;
                ii.w3.K1(l3Var.b, this.b, this.c, this.d);
                break;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.b, this.c, this.d);
                break;
        }
    }
}
