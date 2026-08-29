package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hi {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ tn d;

    public hi(tn tnVar, boolean z10, SparseArray sparseArray) {
        this.d = tnVar;
        this.b = z10;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        tn tnVar = this.d;
        int i11 = i10 - tnVar.w0.F;
        if (i11 < 0 || i11 >= tnVar.q6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) tnVar.q6.get(i11);
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
    public final void b(int i10, boolean z10, float f9, float f10) {
        f2.n1 K;
        tn tnVar = this.d;
        ArrayList arrayList = tnVar.q6;
        SparseArray[] sparseArrayArr = tnVar.S5;
        int i11 = i10 - tnVar.w0.F;
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
                        K = tnVar.t0.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.s1) {
                                tn.b2(tnVar, view, false, f9, f10);
                                return;
                            }
                        }
                        tnVar.x6(messageObject, false, true);
                        tnVar.dc();
                        tnVar.Wc(false);
                    }
                }
                this.a = false;
                K = tnVar.t0.K(i10);
                if (K != null) {
                }
                tnVar.x6(messageObject, false, true);
                tnVar.dc();
                tnVar.Wc(false);
            }
        }
    }
}
