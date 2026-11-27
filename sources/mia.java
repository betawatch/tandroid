// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class mia extends wb2 {
    public final /* synthetic */ byte Ld = 1;

    public /* synthetic */ mia(Context context, int i) {
        super(context, i);
    }

    @Override // wb2
    public final int getParentWidth() {
        int i;
        int L;
        switch (this.Ld) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i = getMeasuredWidth();
                    L = hl.L(24.0f);
                } else {
                    i = hl.q.x;
                    L = hl.L(24.0f);
                }
                return i - L;
            default:
                return super.getParentWidth();
        }
    }

    @Override // android.view.View
    public final boolean isPressed() {
        byte b = this.Ld;
        return false;
    }

    public /* synthetic */ mia(Context context, int i, boolean z, rx6 rx6Var, vnb vnbVar) {
        super(context, i, z, rx6Var, vnbVar);
    }
}
