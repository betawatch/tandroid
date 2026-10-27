package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gx extends UndoView {
    public final /* synthetic */ ey j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(ey eyVar, Activity activity) {
        super(activity);
        this.j0 = eyVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            dy[] dyVarArr = this.j0.e0;
            if (i10 >= dyVarArr.length) {
                return true;
            }
            if (dyVarArr[i10].x.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void g(int i10, long j10) {
        if (i10 == 1 || i10 == 27) {
            ey eyVar = this.j0;
            eyVar.z3 = 1;
            eyVar.I4(true, true);
            if (eyVar.R1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= eyVar.R1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) eyVar.R1.get(i11)).id == j10) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) eyVar.R1.remove(i11);
                    eyVar.e0[0].d.l();
                    AndroidUtilities.runOnUIThread(new fx(this, i11, dialog, 0));
                } else {
                    eyVar.I4(false, true);
                }
            }
            eyVar.w3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ey eyVar = this.j0;
        UndoView[] undoViewArr = eyVar.y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                eyVar.u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                eyVar.g5();
            }
        }
    }
}
