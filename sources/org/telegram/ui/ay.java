package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ay extends UndoView {
    public final /* synthetic */ wy f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(wy wyVar, Activity activity) {
        super(activity);
        this.f0 = wyVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i10 = 0;
        while (true) {
            vy[] vyVarArr = this.f0.e0;
            if (i10 >= vyVarArr.length) {
                return true;
            }
            if (vyVarArr[i10].x.k()) {
                return false;
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void h(int i10, long j3) {
        if (i10 == 1 || i10 == 27) {
            wy wyVar = this.f0;
            wyVar.y3 = 1;
            wyVar.A4(true, true);
            if (wyVar.R1 != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= wyVar.R1.size()) {
                        i11 = -1;
                        break;
                    } else if (((TLRPC.Dialog) wyVar.R1.get(i11)).id == j3) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) wyVar.R1.remove(i11);
                    wyVar.e0[0].d.l();
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.my(this, i11, dialog, 23));
                } else {
                    wyVar.A4(false, true);
                }
            }
            wyVar.o3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        wy wyVar = this.f0;
        UndoView[] undoViewArr = wyVar.y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                wyVar.u1 = Math.max(0.0f, (AndroidUtilities.dp(8.0f) + getMeasuredHeight()) - f7);
                wyVar.X4();
            }
        }
    }
}
