package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fx extends UndoView {
    public final /* synthetic */ zx j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(zx zxVar, Activity activity) {
        super(activity);
        this.j0 = zxVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            yx[] yxVarArr = this.j0.e0;
            if (i10 >= yxVarArr.length) {
                return true;
            }
            if (yxVarArr[i10].y.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void g(int i10, long j10) {
        if (i10 == 1 || i10 == 27) {
            zx zxVar = this.j0;
            zxVar.M4(true, true);
            if (zxVar.R1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= zxVar.R1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) zxVar.R1.get(i11)).id == j10) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) zxVar.R1.remove(i11);
                    zxVar.e0[0].d.f();
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.ki0(this, i11, dialog, 15));
                } else {
                    zxVar.M4(false, true);
                }
            }
            zxVar.z3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        zx zxVar = this.j0;
        UndoView[] undoViewArr = zxVar.y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                zxVar.u1 = Math.max(0.0f, (org.telegram.messenger.i0.L(8.0f) + getMeasuredHeight()) - f7);
                zxVar.k5();
            }
        }
    }
}
