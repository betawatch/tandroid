package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mi {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ xn d;

    public mi(xn xnVar, boolean z4, SparseArray sparseArray) {
        this.d = xnVar;
        this.b = z4;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        xn xnVar = this.d;
        int i11 = i10 - xnVar.x0.G;
        if (i11 < 0 || i11 >= xnVar.r6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) xnVar.r6.get(i11);
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
        f2.m1 K;
        xn xnVar = this.d;
        ArrayList arrayList = xnVar.r6;
        SparseArray[] sparseArrayArr = xnVar.T5;
        int i11 = i10 - xnVar.x0.G;
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
                        K = xnVar.u0.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.t1) {
                                xn.b2(xnVar, view, false, f10, f11);
                                return;
                            }
                        }
                        xnVar.x6(messageObject, false, true);
                        xnVar.dc();
                        xnVar.Wc(false);
                    }
                }
                this.a = false;
                K = xnVar.u0.K(i10);
                if (K != null) {
                }
                xnVar.x6(messageObject, false, true);
                xnVar.dc();
                xnVar.Wc(false);
            }
        }
    }
}
