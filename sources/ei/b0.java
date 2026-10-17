package ei;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                a8 a8Var = d0Var.n;
                if (a8Var != null) {
                    int i10 = a8Var.k0;
                    int i11 = this.b;
                    int i12 = this.c;
                    int i13 = this.d;
                    if (i10 != i11 || a8Var.l0 != i12 || a8Var.Q != i13) {
                        a8Var.k0 = i11;
                        a8Var.l0 = i12;
                        a8Var.Q = i13;
                        TextureView textureView = d0Var.e;
                        if (textureView != null) {
                            textureView.requestLayout();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ki.w3 w3Var = (ki.w3) this.e;
                KeyEvent.Callback B4 = w3Var.B4(this.b);
                if (B4 instanceof org.telegram.ui.Cells.m9) {
                    w3Var.l3.b0(this.c, this.d, (org.telegram.ui.Cells.m9) B4);
                    break;
                }
                break;
            case 2:
                ki.l3 l3Var = (ki.l3) this.e;
                ki.w3.L1(l3Var.b, this.b, this.c, this.d);
                break;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.b, this.c, this.d);
                break;
        }
    }
}
