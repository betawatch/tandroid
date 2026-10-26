package fi;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                w7 w7Var = d0Var.n;
                if (w7Var != null) {
                    int i10 = w7Var.k0;
                    int i11 = this.b;
                    int i12 = this.c;
                    int i13 = this.d;
                    if (i10 != i11 || w7Var.l0 != i12 || w7Var.Q != i13) {
                        w7Var.k0 = i11;
                        w7Var.l0 = i12;
                        w7Var.Q = i13;
                        TextureView textureView = d0Var.e;
                        if (textureView != null) {
                            textureView.requestLayout();
                            break;
                        }
                    }
                }
                break;
            case 1:
                li.v3 v3Var = (li.v3) this.e;
                KeyEvent.Callback G4 = v3Var.G4(this.b);
                if (G4 instanceof org.telegram.ui.Cells.r9) {
                    v3Var.v3.b0(this.c, this.d, (org.telegram.ui.Cells.r9) G4);
                    break;
                }
                break;
            case 2:
                li.l3 l3Var = (li.l3) this.e;
                li.v3.Q1(l3Var.b, this.b, this.c, this.d);
                break;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$214(this.b, this.c, this.d);
                break;
        }
    }
}
