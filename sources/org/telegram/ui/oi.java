package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class oi {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ zn d;

    public oi(zn znVar, boolean z4, SparseArray sparseArray) {
        this.d = znVar;
        this.b = z4;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        zn znVar = this.d;
        int i11 = i10 - znVar.x0.G;
        if (i11 < 0 || i11 >= znVar.r6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) znVar.r6.get(i11);
        if (messageObject.contentType != 0) {
            return false;
        }
        SparseArray sparseArray = this.c;
        boolean z4 = this.b;
        if (z4 || sparseArray.get(messageObject.getId(), null) != null) {
            return z4 && sparseArray.get(messageObject.getId(), null) != null;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10, boolean z4, float f10, float f11) {
        f2.l1 K;
        zn znVar = this.d;
        ArrayList arrayList = znVar.r6;
        SparseArray[] sparseArrayArr = znVar.T5;
        int i11 = i10 - znVar.x0.G;
        if (this.b) {
            z4 = !z4;
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        MessageObject messageObject = (MessageObject) arrayList.get(i11);
        if (!z4 || (sparseArrayArr[0].indexOfKey(messageObject.getId()) < 0 && sparseArrayArr[1].indexOfKey(messageObject.getId()) < 0)) {
            if ((z4 || sparseArrayArr[0].indexOfKey(messageObject.getId()) >= 0 || sparseArrayArr[1].indexOfKey(messageObject.getId()) >= 0) && messageObject.contentType == 0) {
                if (z4) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        this.a = true;
                        K = znVar.u0.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.s1) {
                                zn.b2(znVar, view, false, f10, f11);
                                return;
                            }
                        }
                        znVar.x6(messageObject, false, true);
                        znVar.dc();
                        znVar.Wc(false);
                    }
                }
                this.a = false;
                K = znVar.u0.K(i10);
                if (K != null) {
                }
                znVar.x6(messageObject, false, true);
                znVar.dc();
                znVar.Wc(false);
            }
        }
    }
}
