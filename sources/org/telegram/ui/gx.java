package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class gx extends UndoView {
    public final /* synthetic */ cy f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(cy cyVar, Activity activity) {
        super(activity);
        this.f0 = cyVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ay[] ayVarArr = this.f0.e0;
            if (i10 >= ayVarArr.length) {
                return true;
            }
            if (ayVarArr[i10].x.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void h(int i10, long j10) {
        if (i10 == 1 || i10 == 27) {
            cy cyVar = this.f0;
            cyVar.z3 = 1;
            cyVar.y4(true, true);
            if (cyVar.R1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= cyVar.R1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) cyVar.R1.get(i11)).id == j10) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) cyVar.R1.remove(i11);
                    cyVar.e0[0].d.l();
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.y31(this, i11, dialog, 1));
                } else {
                    cyVar.y4(false, true);
                }
            }
            cyVar.m3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        cy cyVar = this.f0;
        UndoView[] undoViewArr = cyVar.y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                cyVar.u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                cyVar.V4();
            }
        }
    }
}
