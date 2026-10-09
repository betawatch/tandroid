package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class mm0 extends uu0 {
    public final /* synthetic */ nn0 a;

    public mm0(nn0 nn0Var) {
        this.a = nn0Var;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final void B(int i10) {
        nn0 nn0Var = this.a;
        int i11 = nn0Var.S0;
        SecureDocument secureDocument = i11 == 1 ? nn0Var.j1 : i11 == 4 ? (SecureDocument) nn0Var.k1.get(i10) : i11 == 2 ? nn0Var.l1 : i11 == 3 ? nn0Var.m1 : (SecureDocument) nn0Var.i1.get(i10);
        ln0 ln0Var = (ln0) nn0Var.n1.remove(secureDocument);
        if (ln0Var == null) {
            return;
        }
        String m12 = nn0.m1(secureDocument);
        int i12 = nn0Var.S0;
        String str = null;
        if (i12 == 1) {
            nn0Var.j1 = null;
            str = sc.v.i("selfie", m12);
        } else if (i12 == 4) {
            str = sc.v.i("translation", m12);
        } else if (i12 == 2) {
            nn0Var.l1 = null;
            str = sc.v.i("front", m12);
        } else if (i12 == 3) {
            nn0Var.m1 = null;
            str = sc.v.i("reverse", m12);
        } else if (i12 == 0) {
            str = sc.v.i("files", m12);
        }
        if (str != null) {
            HashMap hashMap = nn0Var.x1;
            if (hashMap != null) {
                hashMap.remove(str);
            }
            HashMap hashMap2 = nn0Var.y1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
        }
        nn0Var.R1(nn0Var.S0);
        nn0Var.i0.removeView(ln0Var);
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        if (i10 < 0) {
            return null;
        }
        nn0 nn0Var = this.a;
        if (i10 >= nn0Var.i0.getChildCount()) {
            return null;
        }
        ln0 ln0Var = (ln0) nn0Var.i0.getChildAt(i10);
        int[] iArr = new int[2];
        ln0Var.c.getLocationInWindow(iArr);
        ev0 ev0Var = new ev0();
        ev0Var.b = iArr[0];
        ev0Var.c = iArr[1];
        ev0Var.d = nn0Var.i0;
        ImageReceiver imageReceiver = ln0Var.c.getImageReceiver();
        ev0Var.a = imageReceiver;
        ev0Var.e = imageReceiver.getBitmapSafe();
        return ev0Var;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final String a0() {
        return this.a.S0 == 1 ? LocaleController.formatString("PassportDeleteSelfieAlert", R.string.PassportDeleteSelfieAlert, new Object[0]) : LocaleController.formatString("PassportDeleteScanAlert", R.string.PassportDeleteScanAlert, new Object[0]);
    }
}
