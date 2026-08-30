package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.TextureView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                ph.u6 u6Var = xVar.n;
                if (u6Var != null) {
                    int i10 = u6Var.k0;
                    int i11 = this.b;
                    int i12 = this.c;
                    int i13 = this.d;
                    if (i10 != i11 || u6Var.l0 != i12 || u6Var.Q != i13) {
                        u6Var.k0 = i11;
                        u6Var.l0 = i12;
                        u6Var.Q = i13;
                        TextureView textureView = xVar.e;
                        if (textureView != null) {
                            textureView.requestLayout();
                            break;
                        }
                    }
                }
                break;
            case 2:
                vh.r3 r3Var = (vh.r3) this.e;
                KeyEvent.Callback A4 = r3Var.A4(this.b);
                if (A4 instanceof org.telegram.ui.Cells.l9) {
                    r3Var.k3.c0(this.c, this.d, (org.telegram.ui.Cells.l9) A4);
                    break;
                }
                break;
            default:
                vh.h3 h3Var = (vh.h3) this.e;
                vh.r3.K1(h3Var.b, this.b, this.c, this.d);
                break;
        }
    }
}
