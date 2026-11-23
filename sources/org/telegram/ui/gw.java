package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class gw extends UndoView {
    public final /* synthetic */ cx k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(cx cxVar, Activity activity) {
        super(activity);
        this.k0 = cxVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i7 = 0;
        while (true) {
            bx[] bxVarArr = this.k0.f0;
            if (i7 >= bxVarArr.length) {
                return true;
            }
            if (bxVarArr[i7].y.k()) {
                return false;
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void g(int i7, long j3) {
        if (i7 == 1 || i7 == 27) {
            cx cxVar = this.k0;
            cxVar.U4(true, true);
            if (cxVar.T1 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= cxVar.T1.size()) {
                        i10 = -1;
                        break;
                    } else if (((TLRPC.Dialog) cxVar.T1.get(i10)).id == j3) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) cxVar.T1.remove(i10);
                    cxVar.f0[0].d.f();
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.f21(this, i10, dialog, 1));
                } else {
                    cxVar.U4(false, true);
                }
            }
            cxVar.z3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        cx cxVar = this.k0;
        UndoView[] undoViewArr = cxVar.z0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                cxVar.w1 = Math.max(0.0f, (org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight()) - f10);
                cxVar.s5();
            }
        }
    }
}
