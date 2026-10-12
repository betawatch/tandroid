package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dy extends UndoView {
    public final /* synthetic */ yy f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(yy yyVar, Activity activity) {
        super(activity);
        this.f0 = yyVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            xy[] xyVarArr = this.f0.e0;
            if (i10 >= xyVarArr.length) {
                return true;
            }
            if (xyVarArr[i10].x.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void h(int i10, long j10) {
        if (i10 == 1 || i10 == 27) {
            yy yyVar = this.f0;
            yyVar.y3 = 1;
            yyVar.x4(true, true);
            if (yyVar.R1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= yyVar.R1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) yyVar.R1.get(i11)).id == j10) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) yyVar.R1.remove(i11);
                    yyVar.e0[0].d.l();
                    AndroidUtilities.runOnUIThread(new gm(this, i11, dialog, 27));
                } else {
                    yyVar.x4(false, true);
                }
            }
            yyVar.l3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        yy yyVar = this.f0;
        UndoView[] undoViewArr = yyVar.y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                yyVar.u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                yyVar.U4();
            }
        }
    }
}
