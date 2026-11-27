// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class iw2 extends n8 {
    public final /* synthetic */ nw2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw2(nw2 nw2Var, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = nw2Var;
    }

    @Override // n8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        rw2 rw2Var = this.o.a;
        rw2Var.k = null;
        rw2Var.K = false;
        if (rw2Var.R) {
            rw2Var.b();
        }
    }
}
