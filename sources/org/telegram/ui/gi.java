package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gi {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ rn d;

    public gi(rn rnVar, boolean z10, SparseArray sparseArray) {
        this.d = rnVar;
        this.b = z10;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        rn rnVar = this.d;
        int i11 = i10 - rnVar.w0.F;
        if (i11 < 0 || i11 >= rnVar.q6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) rnVar.q6.get(i11);
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
    public final void b(int i10, boolean z10, float f10, float f11) {
        f2.o1 K;
        rn rnVar = this.d;
        ArrayList arrayList = rnVar.q6;
        SparseArray[] sparseArrayArr = rnVar.S5;
        int i11 = i10 - rnVar.w0.F;
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
                        K = rnVar.t0.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.s1) {
                                rn.b2(rnVar, view, false, f10, f11);
                                return;
                            }
                        }
                        rnVar.x6(messageObject, false, true);
                        rnVar.dc();
                        rnVar.Wc(false);
                    }
                }
                this.a = false;
                K = rnVar.t0.K(i10);
                if (K != null) {
                }
                rnVar.x6(messageObject, false, true);
                rnVar.dc();
                rnVar.Wc(false);
            }
        }
    }
}
