package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ni {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ wn d;

    public ni(wn wnVar, boolean z10, SparseArray sparseArray) {
        this.d = wnVar;
        this.b = z10;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        wn wnVar = this.d;
        int i11 = i10 - wnVar.A0.J;
        if (i11 < 0 || i11 >= wnVar.u6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) wnVar.u6.get(i11);
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
        wn wnVar = this.d;
        ArrayList arrayList = wnVar.u6;
        SparseArray[] sparseArrayArr = wnVar.W5;
        int i11 = i10 - wnVar.A0.J;
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
                        K = wnVar.x0.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.u1) {
                                wn.b2(wnVar, view, false, f7, f10);
                                return;
                            }
                        }
                        wnVar.x6(messageObject, false, true);
                        wnVar.dc();
                        wnVar.Wc(false);
                    }
                }
                this.a = false;
                K = wnVar.x0.K(i10);
                if (K != null) {
                }
                wnVar.x6(messageObject, false, true);
                wnVar.dc();
                wnVar.Wc(false);
            }
        }
    }
}
