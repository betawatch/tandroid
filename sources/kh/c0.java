package kh;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c0(Object obj, int i9, int i10, int i11, int i12) {
        this.a = i12;
        this.e = obj;
        this.b = i9;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) ((d0) this.e).b;
                a8 a8Var = e0Var.n;
                if (a8Var != null) {
                    int i9 = a8Var.k0;
                    int i10 = this.b;
                    int i11 = this.c;
                    int i12 = this.d;
                    if (i9 != i10 || a8Var.l0 != i11 || a8Var.Q != i12) {
                        a8Var.k0 = i10;
                        a8Var.l0 = i11;
                        a8Var.Q = i12;
                        TextureView textureView = e0Var.e;
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
                qh.o3 o3Var = (qh.o3) this.e;
                KeyEvent.Callback A4 = o3Var.A4(this.b);
                if (A4 instanceof org.telegram.ui.Cells.m9) {
                    o3Var.j3.c0(this.c, this.d, (org.telegram.ui.Cells.m9) A4);
                    break;
                }
                break;
            default:
                qh.e3 e3Var = (qh.e3) this.e;
                qh.o3.K1(e3Var.b, this.b, this.c, this.d);
                break;
        }
    }
}
