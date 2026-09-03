package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.TextureView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class rg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rg(Object obj, int i10, int i11, int i12, int i13) {
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
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.b, this.c, this.d);
                break;
            case 1:
                ph.x xVar = (ph.x) ((eg.t2) this.e).b;
                ph.t6 t6Var = xVar.n;
                if (t6Var != null) {
                    int i10 = t6Var.k0;
                    int i11 = this.b;
                    int i12 = this.c;
                    int i13 = this.d;
                    if (i10 != i11 || t6Var.l0 != i12 || t6Var.Q != i13) {
                        t6Var.k0 = i11;
                        t6Var.l0 = i12;
                        t6Var.Q = i13;
                        TextureView textureView = xVar.e;
                        if (textureView != null) {
                            textureView.requestLayout();
                            break;
                        }
                    }
                }
                break;
            case 2:
                vh.s3 s3Var = (vh.s3) this.e;
                KeyEvent.Callback z4 = s3Var.z4(this.b);
                if (z4 instanceof org.telegram.ui.Cells.k9) {
                    s3Var.k3.c0(this.c, this.d, (org.telegram.ui.Cells.k9) z4);
                    break;
                }
                break;
            default:
                vh.i3 i3Var = (vh.i3) this.e;
                vh.s3.J1(i3Var.b, this.b, this.c, this.d);
                break;
        }
    }
}
