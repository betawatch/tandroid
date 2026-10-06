package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class oi {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ yn d;

    public oi(yn ynVar, boolean z10, SparseArray sparseArray) {
        this.d = ynVar;
        this.b = z10;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        yn ynVar = this.d;
        int i11 = i10 - ynVar.y0.J;
        if (i11 < 0 || i11 >= ynVar.s6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) ynVar.s6.get(i11);
        if (messageObject.contentType != 0) {
            return false;
        }
        SparseArray sparseArray = this.c;
        boolean z10 = this.b;
        if (z10 || sparseArray.get(messageObject.getId(), null) != null) {
            return z10 && sparseArray.get(messageObject.getId(), null) != null;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10, boolean z10, float f7, float f10) {
        s4.c1 K;
        yn ynVar = this.d;
        ArrayList arrayList = ynVar.s6;
        SparseArray[] sparseArrayArr = ynVar.U5;
        int i11 = i10 - ynVar.y0.J;
        if (this.b) {
            z10 = !z10;
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        MessageObject messageObject = (MessageObject) arrayList.get(i11);
        if (!z10 || (sparseArrayArr[0].indexOfKey(messageObject.getId()) < 0 && sparseArrayArr[1].indexOfKey(messageObject.getId()) < 0)) {
            if ((z10 || sparseArrayArr[0].indexOfKey(messageObject.getId()) >= 0 || sparseArrayArr[1].indexOfKey(messageObject.getId()) >= 0) && messageObject.contentType == 0) {
                if (z10) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        this.a = true;
                        K = ynVar.v0.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.u1) {
                                yn.b2(ynVar, view, false, f7, f10);
                                return;
                            }
                        }
                        ynVar.x6(messageObject, false, true);
                        ynVar.cc();
                        ynVar.Vc(false);
                    }
                }
                this.a = false;
                K = ynVar.v0.K(i10);
                if (K != null) {
                }
                ynVar.x6(messageObject, false, true);
                ynVar.cc();
                ynVar.Vc(false);
            }
        }
    }
}
