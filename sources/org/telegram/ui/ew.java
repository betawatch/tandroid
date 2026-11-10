package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ew extends UndoView {
    public final /* synthetic */ zw j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(zw zwVar, Activity activity) {
        super(activity);
        this.j0 = zwVar;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i7 = 0;
        while (true) {
            yw[] ywVarArr = this.j0.e0;
            if (i7 >= ywVarArr.length) {
                return true;
            }
            if (ywVarArr[i7].y.k()) {
                return false;
            }
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void g(int i7, long j3) {
        if (i7 == 1 || i7 == 27) {
            zw zwVar = this.j0;
            zwVar.M4(true, true);
            if (zwVar.S1 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= zwVar.S1.size()) {
                        i10 = -1;
                        break;
                    } else if (((TLRPC.Dialog) zwVar.S1.get(i10)).id == j3) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) zwVar.S1.remove(i10);
                    zwVar.e0[0].d.f();
                    org.telegram.messenger.g0.h3(new q8(this, i10, dialog, 28));
                } else {
                    zwVar.M4(false, true);
                }
            }
            zwVar.z3();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        zw zwVar = this.j0;
        UndoView[] undoViewArr = zwVar.y0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                zwVar.v1 = Math.max(0.0f, (org.telegram.messenger.g0.L(8.0f) + getMeasuredHeight()) - f10);
                zwVar.k5();
            }
        }
    }
}
