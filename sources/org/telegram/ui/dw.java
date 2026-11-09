package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class dw extends UndoView {
    public final /* synthetic */ yw j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw(yw ywVar, Activity activity) {
        super(activity);
        this.j0 = ywVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i7 = 0;
        while (true) {
            xw[] xwVarArr = this.j0.e0;
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
            yw ywVar = this.j0;
            ywVar.M4(true, true);
            if (ywVar.S1 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= ywVar.S1.size()) {
                        i10 = -1;
                        break;
                    } else if (((TLRPC.Dialog) ywVar.S1.get(i10)).id == j3) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) ywVar.S1.remove(i10);
                    ywVar.e0[0].d.f();
                    org.telegram.messenger.g0.h3(new q8(this, i10, dialog, 28));
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
        yw ywVar = this.j0;
        UndoView[] undoViewArr = ywVar.y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                ywVar.v1 = Math.max(0.0f, (org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight()) - f10);
                ywVar.k5();
            }
        }
    }
}
