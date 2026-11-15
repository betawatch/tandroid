package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class dw extends UndoView {
    public final /* synthetic */ yw k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw(yw ywVar, Activity activity) {
        super(activity);
        this.k0 = ywVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i7 = 0;
        while (true) {
            xw[] xwVarArr = this.k0.f0;
            if (i7 >= xwVarArr.length) {
                return true;
            }
            if (xwVarArr[i7].y.k()) {
                return false;
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void g(int i7, long j3) {
        if (i7 == 1 || i7 == 27) {
            yw ywVar = this.k0;
            ywVar.M4(true, true);
            if (ywVar.T1 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= ywVar.T1.size()) {
                        i10 = -1;
                        break;
                    } else if (((TLRPC.Dialog) ywVar.T1.get(i10)).id == j3) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) ywVar.T1.remove(i10);
                    ywVar.f0[0].d.f();
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.u11(this, i10, dialog, 1));
                } else {
                    ywVar.M4(false, true);
                }
            }
            ywVar.z3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        yw ywVar = this.k0;
        UndoView[] undoViewArr = ywVar.z0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                ywVar.w1 = Math.max(0.0f, (org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight()) - f10);
                ywVar.k5();
            }
        }
    }
}
