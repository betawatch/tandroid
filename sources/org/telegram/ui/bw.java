package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class bw extends UndoView {
    public final /* synthetic */ ww j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(ww wwVar, Activity activity) {
        super(activity);
        this.j0 = wwVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i7 = 0;
        while (true) {
            vw[] vwVarArr = this.j0.e0;
            if (i7 >= vwVarArr.length) {
                return true;
            }
            if (vwVarArr[i7].y.k()) {
                return false;
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void g(int i7, long j3) {
        if (i7 == 1 || i7 == 27) {
            ww wwVar = this.j0;
            wwVar.M4(true, true);
            if (wwVar.R1 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= wwVar.R1.size()) {
                        i10 = -1;
                        break;
                    } else if (((TLRPC.Dialog) wwVar.R1.get(i10)).id == j3) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) wwVar.R1.remove(i10);
                    wwVar.e0[0].d.f();
                    org.telegram.messenger.g0.h3(new q8(this, i10, dialog, 28));
                } else {
                    wwVar.M4(false, true);
                }
            }
            wwVar.z3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ww wwVar = this.j0;
        UndoView[] undoViewArr = wwVar.y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                wwVar.u1 = Math.max(0.0f, (org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight()) - f10);
                wwVar.k5();
            }
        }
    }
}
