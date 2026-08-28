package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hx extends UndoView {
    public final /* synthetic */ dy b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(dy dyVar, Activity activity) {
        super(activity);
        this.b0 = dyVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i9 = 0;
        while (true) {
            cy[] cyVarArr = this.b0.a0;
            if (i9 >= cyVarArr.length) {
                return true;
            }
            if (cyVarArr[i9].x.k()) {
                return false;
            }
            i9++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void h(int i9, long j10) {
        if (i9 == 1 || i9 == 27) {
            dy dyVar = this.b0;
            dyVar.u3 = 1;
            dyVar.A4(true, true);
            if (dyVar.N1 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= dyVar.N1.size()) {
                        i10 = -1;
                        break;
                    } else if (((TLRPC.Dialog) dyVar.N1.get(i10)).id == j10) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) dyVar.N1.remove(i10);
                    dyVar.a0[0].d.l();
                    AndroidUtilities.runOnUIThread(new rl(this, i10, dialog, 26));
                } else {
                    dyVar.A4(false, true);
                }
            }
            dyVar.o3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        dy dyVar = this.b0;
        UndoView[] undoViewArr = dyVar.u0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                dyVar.q1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f10);
                dyVar.X4();
            }
        }
    }
}
