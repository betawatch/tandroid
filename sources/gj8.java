// default package

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gj8 implements fd, ncc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ij8 b;

    public /* synthetic */ gj8(ij8 ij8Var, byte b) {
        this.a = b;
        this.b = ij8Var;
    }

    @Override // ncc
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        if (((b8c) obj).d == 1) {
            wkb wkbVar = (wkb) view;
            boolean z = !wkbVar.e.h;
            ij8 ij8Var = this.b;
            ij8Var.n = z;
            wkbVar.setChecked(z);
            ij8Var.d.g3.O(true);
            ij8Var.Y(true);
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        ij8 ij8Var = this.b;
        switch (b) {
            case 0:
                ij8Var.c0();
                break;
            default:
                ij8Var.finishFragment();
                break;
        }
    }
}
