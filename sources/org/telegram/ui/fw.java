package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fw extends UndoView {
    public final /* synthetic */ bx k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(bx bxVar, Activity activity) {
        super(activity);
        this.k0 = bxVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i7 = 0;
        while (true) {
            ax[] axVarArr = this.k0.f0;
            if (i7 >= axVarArr.length) {
                return true;
            }
            if (axVarArr[i7].y.k()) {
                return false;
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void g(int i7, long j3) {
        if (i7 == 1 || i7 == 27) {
            bx bxVar = this.k0;
            bxVar.U4(true, true);
            if (bxVar.T1 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= bxVar.T1.size()) {
                        i10 = -1;
                        break;
                    } else if (((TLRPC.Dialog) bxVar.T1.get(i10)).id == j3) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) bxVar.T1.remove(i10);
                    bxVar.f0[0].d.f();
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.e21(this, i10, dialog, 1));
                } else {
                    bxVar.U4(false, true);
                }
            }
            bxVar.z3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        bx bxVar = this.k0;
        UndoView[] undoViewArr = bxVar.z0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                bxVar.w1 = Math.max(0.0f, (org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight()) - f10);
                bxVar.s5();
            }
        }
    }
}
