package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jm0 extends iu0 {
    public final /* synthetic */ kn0 a;

    public jm0(kn0 kn0Var) {
        this.a = kn0Var;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
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
            str = org.telegram.ui.Components.b10.j("selfie", n12);
        } else if (i12 == 4) {
            str = org.telegram.ui.Components.b10.j("translation", n12);
        } else if (i12 == 2) {
            kn0Var.l1 = null;
            str = org.telegram.ui.Components.b10.j("front", n12);
        } else if (i12 == 3) {
            kn0Var.m1 = null;
            str = org.telegram.ui.Components.b10.j("reverse", n12);
        } else if (i12 == 0) {
            str = org.telegram.ui.Components.b10.j("files", n12);
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
        kn0Var.T1(kn0Var.S0);
        kn0Var.i0.removeView(in0Var);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
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
        su0 su0Var = new su0();
        su0Var.b = iArr[0];
        su0Var.c = iArr[1];
        su0Var.d = kn0Var.i0;
        ImageReceiver imageReceiver = in0Var.c.getImageReceiver();
        su0Var.a = imageReceiver;
        su0Var.e = imageReceiver.getBitmapSafe();
        return su0Var;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final String b0() {
        return this.a.S0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
