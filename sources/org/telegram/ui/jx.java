package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jx extends UndoView {
    public final /* synthetic */ fy b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(fy fyVar, Activity activity) {
        super(activity);
        this.b0 = fyVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ey[] eyVarArr = this.b0.a0;
            if (i10 >= eyVarArr.length) {
                return true;
            }
            if (eyVarArr[i10].x.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void h(int i10, long j10) {
        if (i10 == 1 || i10 == 27) {
            fy fyVar = this.b0;
            fyVar.u3 = 1;
            fyVar.A4(true, true);
            if (fyVar.N1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= fyVar.N1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) fyVar.N1.get(i11)).id == j10) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) fyVar.N1.remove(i11);
                    fyVar.a0[0].d.l();
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rm(this, i11, dialog, 25));
                } else {
                    fyVar.A4(false, true);
                }
            }
            fyVar.o3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        fy fyVar = this.b0;
        UndoView[] undoViewArr = fyVar.u0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                fyVar.q1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f9);
                fyVar.X4();
            }
        }
    }
}
