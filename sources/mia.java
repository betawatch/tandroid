// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
