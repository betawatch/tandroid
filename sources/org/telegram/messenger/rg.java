package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.TextureView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                qh.x xVar = (qh.x) ((fg.s2) this.e).b;
                qh.s6 s6Var = xVar.n;
                if (s6Var != null) {
                    int i10 = s6Var.k0;
                    int i11 = this.b;
                    int i12 = this.c;
                    int i13 = this.d;
                    if (i10 != i11 || s6Var.l0 != i12 || s6Var.Q != i13) {
                        s6Var.k0 = i11;
                        s6Var.l0 = i12;
                        s6Var.Q = i13;
                        TextureView textureView = xVar.e;
                        if (textureView != null) {
                            textureView.requestLayout();
                            break;
                        }
                    }
                }
                break;
            case 2:
                wh.r3 r3Var = (wh.r3) this.e;
                KeyEvent.Callback A4 = r3Var.A4(this.b);
                if (A4 instanceof org.telegram.ui.Cells.l9) {
                    r3Var.k3.c0(this.c, this.d, (org.telegram.ui.Cells.l9) A4);
                    break;
                }
                break;
            default:
                wh.h3 h3Var = (wh.h3) this.e;
                wh.r3.K1(h3Var.b, this.b, this.c, this.d);
                break;
        }
    }
}
