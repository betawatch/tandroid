package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class fj {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SparseArray c;
    public final /* synthetic */ fo d;

    public fj(fo foVar, boolean z10, SparseArray sparseArray) {
        this.d = foVar;
        this.b = z10;
        this.c = sparseArray;
    }

    public final boolean a(int i10) {
        fo foVar = this.d;
        int i11 = i10 - foVar.A0.J;
        if (i11 < 0 || i11 >= foVar.u6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) foVar.u6.get(i11);
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
        s4.b1 K;
        fo foVar = this.d;
        ArrayList arrayList = foVar.u6;
        SparseArray[] sparseArrayArr = foVar.W5;
        int i11 = i10 - foVar.A0.J;
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
                        K = foVar.x0.K(i10);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof org.telegram.ui.Cells.u1) {
                                fo.c2(foVar, view, false, f7, f10);
                                return;
                            }
                        }
                        foVar.A6(messageObject, false, true);
                        foVar.hc();
                        foVar.ad(false);
                    }
                }
                this.a = false;
                K = foVar.x0.K(i10);
                if (K != null) {
                }
                foVar.A6(messageObject, false, true);
                foVar.hc();
                foVar.ad(false);
            }
        }
    }
}
