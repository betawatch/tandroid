package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class jm0 extends ou0 {
    public final /* synthetic */ kn0 a;

    public jm0(kn0 kn0Var) {
        this.a = kn0Var;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final void B(int i10) {
        kn0 kn0Var = this.a;
        int i11 = kn0Var.S0;
        SecureDocument secureDocument = i11 == 1 ? kn0Var.j1 : i11 == 4 ? (SecureDocument) kn0Var.k1.get(i10) : i11 == 2 ? kn0Var.l1 : i11 == 3 ? kn0Var.m1 : (SecureDocument) kn0Var.i1.get(i10);
        in0 in0Var = (in0) kn0Var.n1.remove(secureDocument);
        if (in0Var == null) {
            return;
        }
        String n12 = kn0.n1(secureDocument);
        int i12 = kn0Var.S0;
        String str = null;
        if (i12 == 1) {
            kn0Var.j1 = null;
            str = sa.e.i("selfie", n12);
        } else if (i12 == 4) {
            str = sa.e.i("translation", n12);
        } else if (i12 == 2) {
            kn0Var.l1 = null;
            str = sa.e.i("front", n12);
        } else if (i12 == 3) {
            kn0Var.m1 = null;
            str = sa.e.i("reverse", n12);
        } else if (i12 == 0) {
            str = sa.e.i("files", n12);
        }
        if (str != null) {
            HashMap hashMap = kn0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = kn0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        kn0Var.S1(kn0Var.S0);
        kn0Var.i0.removeView(in0Var);
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        kn0 kn0Var = this.a;
        if (i10 >= kn0Var.i0.getChildCount()) {
            return null;
        }
        in0 in0Var = (in0) kn0Var.i0.getChildAt(i10);
        int[] iArr = new int[2];
        in0Var.c.getLocationInWindow(iArr);
        yu0 yu0Var = new yu0();
        yu0Var.b = iArr[0];
        yu0Var.c = iArr[1];
        yu0Var.d = kn0Var.i0;
        ImageReceiver imageReceiver = in0Var.c.getImageReceiver();
        yu0Var.a = imageReceiver;
        yu0Var.e = imageReceiver.getBitmapSafe();
        return yu0Var;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final String a0() {
        return this.a.S0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
