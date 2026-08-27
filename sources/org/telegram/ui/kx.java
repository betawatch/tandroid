package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kx extends UndoView {
    public final /* synthetic */ gy b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(gy gyVar, Activity activity) {
        super(activity);
        this.b0 = gyVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            fy[] fyVarArr = this.b0.a0;
            if (i10 >= fyVarArr.length) {
                return true;
            }
            if (fyVarArr[i10].x.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void h(int i10, long j10) {
        if (i10 == 1 || i10 == 27) {
            gy gyVar = this.b0;
            gyVar.u3 = 1;
            gyVar.A4(true, true);
            if (gyVar.N1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= gyVar.N1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) gyVar.N1.get(i11)).id == j10) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) gyVar.N1.remove(i11);
                    gyVar.a0[0].d.l();
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.km(this, i11, dialog, 25));
                } else {
                    gyVar.A4(false, true);
                }
            }
            gyVar.o3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        gy gyVar = this.b0;
        UndoView[] undoViewArr = gyVar.u0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                gyVar.q1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f10);
                gyVar.X4();
            }
        }
    }
}
