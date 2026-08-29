package nh;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c0(Object obj, int i10, int i11, int i12, int i13) {
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
                d0 d0Var = (d0) ((cg.v2) this.e).b;
                o7 o7Var = d0Var.n;
                if (o7Var != null) {
                    int i10 = o7Var.k0;
                    int i11 = this.b;
                    int i12 = this.c;
                    int i13 = this.d;
                    if (i10 != i11 || o7Var.l0 != i12 || o7Var.Q != i13) {
                        o7Var.k0 = i11;
                        o7Var.l0 = i12;
                        o7Var.Q = i13;
                        TextureView textureView = d0Var.e;
                        if (textureView != null) {
                            textureView.requestLayout();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.b, this.c, this.d);
                break;
            case 2:
                th.p3 p3Var = (th.p3) this.e;
                KeyEvent.Callback A4 = p3Var.A4(this.b);
                if (A4 instanceof org.telegram.ui.Cells.j9) {
                    p3Var.j3.c0(this.c, this.d, (org.telegram.ui.Cells.j9) A4);
                    break;
                }
                break;
            default:
                th.f3 f3Var = (th.f3) this.e;
                th.p3.K1(f3Var.b, this.b, this.c, this.d);
                break;
        }
    }
}
