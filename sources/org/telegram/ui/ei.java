package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ei {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ qn d;

    public ei(qn qnVar, boolean z10, SparseArray sparseArray) {
        this.d = qnVar;
        this.b = z10;
        this.c = sparseArray;
    }

    public final boolean a(int i9) {
        qn qnVar = this.d;
        int i10 = i9 - qnVar.w0.F;
        if (i10 < 0 || i10 >= qnVar.q6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) qnVar.q6.get(i10);
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
    public final void b(int i9, boolean z10, float f10, float f11) {
        f2.q1 K;
        qn qnVar = this.d;
        ArrayList arrayList = qnVar.q6;
        SparseArray[] sparseArrayArr = qnVar.S5;
        int i10 = i9 - qnVar.w0.F;
        if (this.b) {
            z10 = !z10;
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        MessageObject messageObject = (MessageObject) arrayList.get(i10);
        if (!z10 || (sparseArrayArr[0].indexOfKey(messageObject.getId()) < 0 && sparseArrayArr[1].indexOfKey(messageObject.getId()) < 0)) {
            if ((z10 || sparseArrayArr[0].indexOfKey(messageObject.getId()) >= 0 || sparseArrayArr[1].indexOfKey(messageObject.getId()) >= 0) && messageObject.contentType == 0) {
                if (z10) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        this.a = true;
                        K = qnVar.t0.K(i9);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.t1) {
                                qn.b2(qnVar, view, false, f10, f11);
                                return;
                            }
                        }
                        qnVar.x6(messageObject, false, true);
                        qnVar.dc();
                        qnVar.Wc(false);
                    }
                }
                this.a = false;
                K = qnVar.t0.K(i9);
                if (K != null) {
                }
                qnVar.x6(messageObject, false, true);
                qnVar.dc();
                qnVar.Wc(false);
            }
        }
    }
}
