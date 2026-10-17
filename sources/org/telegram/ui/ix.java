package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ix extends UndoView {
    public final /* synthetic */ ey f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix(ey eyVar, Activity activity) {
        super(activity);
        this.f0 = eyVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            dy[] dyVarArr = this.f0.e0;
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
    public final void h(int i10, long j10) {
        if (i10 == 1 || i10 == 27) {
            ey eyVar = this.f0;
            eyVar.z3 = 1;
            eyVar.y4(true, true);
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.w31(this, i11, dialog, 1));
                } else {
                    eyVar.y4(false, true);
                }
            }
            eyVar.m3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ey eyVar = this.f0;
        UndoView[] undoViewArr = eyVar.y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                eyVar.u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                eyVar.V4();
            }
        }
    }
}
