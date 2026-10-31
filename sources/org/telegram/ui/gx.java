package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gx extends UndoView {
    public final /* synthetic */ ay j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(ay ayVar, Activity activity) {
        super(activity);
        this.j0 = ayVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            zx[] zxVarArr = this.j0.e0;
            if (i10 >= zxVarArr.length) {
                return true;
            }
            if (zxVarArr[i10].y.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void g(int i10, long j10) {
        if (i10 == 1 || i10 == 27) {
            ay ayVar = this.j0;
            ayVar.L4(true, true);
            if (ayVar.R1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= ayVar.R1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) ayVar.R1.get(i11)).id == j10) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) ayVar.R1.remove(i11);
                    ayVar.e0[0].d.f();
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.ji0(this, i11, dialog, 15));
                } else {
                    ayVar.L4(false, true);
                }
            }
            ayVar.y3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ay ayVar = this.j0;
        UndoView[] undoViewArr = ayVar.y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                ayVar.u1 = Math.max(0.0f, (org.telegram.messenger.i0.L(8.0f) + getMeasuredHeight()) - f7);
                ayVar.j5();
            }
        }
    }
}
