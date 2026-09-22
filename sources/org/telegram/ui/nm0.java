package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class nm0 extends tu0 {
    public final /* synthetic */ on0 a;

    public nm0(on0 on0Var) {
        this.a = on0Var;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final void B(int i10) {
        on0 on0Var = this.a;
        int i11 = on0Var.S0;
        SecureDocument secureDocument = i11 == 1 ? on0Var.j1 : i11 == 4 ? (SecureDocument) on0Var.k1.get(i10) : i11 == 2 ? on0Var.l1 : i11 == 3 ? on0Var.m1 : (SecureDocument) on0Var.i1.get(i10);
        mn0 mn0Var = (mn0) on0Var.n1.remove(secureDocument);
        if (mn0Var == null) {
            return;
        }
        String n12 = on0.n1(secureDocument);
        int i12 = on0Var.S0;
        String str = null;
        if (i12 == 1) {
            on0Var.j1 = null;
            str = org.telegram.ui.Cells.q3.i("selfie", n12);
        } else if (i12 == 4) {
            str = org.telegram.ui.Cells.q3.i("translation", n12);
        } else if (i12 == 2) {
            on0Var.l1 = null;
            str = org.telegram.ui.Cells.q3.i("front", n12);
        } else if (i12 == 3) {
            on0Var.m1 = null;
            str = org.telegram.ui.Cells.q3.i("reverse", n12);
        } else if (i12 == 0) {
            str = org.telegram.ui.Cells.q3.i("files", n12);
        }
        if (str != null) {
            HashMap hashMap = on0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = on0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        on0Var.S1(on0Var.S0);
        on0Var.i0.removeView(mn0Var);
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        on0 on0Var = this.a;
        if (i10 >= on0Var.i0.getChildCount()) {
            return null;
        }
        mn0 mn0Var = (mn0) on0Var.i0.getChildAt(i10);
        int[] iArr = new int[2];
        mn0Var.c.getLocationInWindow(iArr);
        dv0 dv0Var = new dv0();
        dv0Var.b = iArr[0];
        dv0Var.c = iArr[1];
        dv0Var.d = on0Var.i0;
        ImageReceiver imageReceiver = mn0Var.c.getImageReceiver();
        dv0Var.a = imageReceiver;
        dv0Var.e = imageReceiver.getBitmapSafe();
        return dv0Var;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final String a0() {
        return this.a.S0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
