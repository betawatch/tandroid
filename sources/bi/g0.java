package bi;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g0(Object obj, int i10, int i11, int i12, int i13) {
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
                i0 i0Var = (i0) ((h0) this.e).b;
                r9 r9Var = i0Var.n;
                if (r9Var != null) {
                    int i10 = r9Var.k0;
                    int i11 = this.b;
                    int i12 = this.c;
                    int i13 = this.d;
                    if (i10 != i11 || r9Var.l0 != i12 || r9Var.Q != i13) {
                        r9Var.k0 = i11;
                        r9Var.l0 = i12;
                        r9Var.Q = i13;
                        TextureView textureView = i0Var.e;
                        if (textureView != null) {
                            textureView.requestLayout();
                            break;
                        }
                    }
                }
                break;
            case 1:
                hi.z3 z3Var = (hi.z3) this.e;
                KeyEvent.Callback z42 = z3Var.z4(this.b);
                if (z42 instanceof org.telegram.ui.Cells.r9) {
                    z3Var.n3.c0(this.c, this.d, (org.telegram.ui.Cells.r9) z42);
                    break;
                }
                break;
            case 2:
                hi.o3 o3Var = (hi.o3) this.e;
                hi.z3.J1(o3Var.b, this.b, this.c, this.d);
                break;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.b, this.c, this.d);
                break;
        }
    }
}
