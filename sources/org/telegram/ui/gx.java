package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gx extends xr0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ zx b;

    public gx(zx zxVar, boolean[] zArr) {
        this.b = zxVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final CharSequence C(int i10) {
        zx zxVar = this.b;
        if (i10 < 0 || i10 >= zxVar.D2.size() || !((org.telegram.messenger.ff) zxVar.D2.get(i10)).b) {
            return zx.w2(zxVar);
        }
        return null;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void D() {
        int i10;
        zx zxVar = this.b;
        org.telegram.ui.Components.tp0 tp0Var = zxVar.G2;
        if (tp0Var != null) {
            i10 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
            tp0Var.i(i10, zxVar.D2);
        }
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        zx zxVar = this.b;
        org.telegram.ui.Components.tp0 tp0Var = zxVar.G2;
        org.telegram.ui.Components.g9 f7 = tp0Var != null ? tp0Var.f(i10) : null;
        if (f7 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f7.getLocationInWindow(iArr);
        fs0 fs0Var = new fs0();
        fs0Var.b = iArr[0];
        fs0Var.c = iArr[1];
        fs0Var.d = zxVar.G2;
        ImageReceiver imageReceiver = f7.getImageReceiver();
        fs0Var.a = imageReceiver;
        fs0Var.e = imageReceiver.p();
        fs0Var.k = f7.getScaleX();
        fs0Var.h = new int[]{org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f)};
        return fs0Var;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final int H() {
        ArrayList arrayList = this.b.D2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean I() {
        return this.b.x3();
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final long a() {
        zx zxVar = this.b;
        if (zxVar.I2.isEmpty()) {
            return 0L;
        }
        return ((Long) zxVar.I2.get(0)).longValue();
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean b() {
        zx zxVar = this.b;
        if (zxVar.I2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = zxVar.I2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long longValue = ((Long) obj).longValue();
            if (org.telegram.messenger.o5.C(longValue) || zxVar.getMessagesController().M1(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final CharSequence c0(int i10) {
        zx zxVar = this.b;
        ArrayList arrayList = zxVar.D2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = zxVar.D2.size();
        if (size == 1) {
            return org.telegram.messenger.dd.L0(((org.telegram.messenger.ff) zxVar.D2.get(0)).b ? 2131753933 : 2131753948, null);
        }
        ArrayList arrayList2 = zxVar.D2;
        int size2 = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList2.get(i13);
            i13++;
            if (((org.telegram.messenger.ff) obj).b) {
                i11++;
            } else {
                i12++;
            }
        }
        return i11 == 0 ? org.telegram.messenger.dd.G(size, "ShareSendPhotos", new Object[0]) : i12 == 0 ? org.telegram.messenger.dd.G(size, "ShareSendVideos", new Object[0]) : org.telegram.messenger.dd.G(size, "ShareSendItems", new Object[0]);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void e(CharSequence charSequence) {
        zx zxVar = this.b;
        nw nwVar = zxVar.B1;
        if (nwVar != null) {
            nwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = zxVar.D2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((org.telegram.messenger.ff) obj).a = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean h() {
        TLRPC.User Z1;
        zx zxVar = this.b;
        if (zxVar.I2.isEmpty()) {
            return false;
        }
        org.telegram.messenger.wp messagesController = zxVar.getMessagesController();
        ArrayList arrayList = zxVar.I2;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (!org.telegram.messenger.o5.E(l4.longValue()) || (Z1 = messagesController.Z1(l4)) == null || Z1.bot || org.telegram.messenger.i20.B(Z1)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final org.telegram.messenger.lc j(int i10) {
        org.telegram.ui.Components.tp0 tp0Var = this.b.G2;
        org.telegram.ui.Components.g9 f7 = tp0Var != null ? tp0Var.f(i10) : null;
        if (f7 != null) {
            return f7.getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList;
        zx zxVar = this.b;
        ArrayList arrayList2 = zxVar.I2;
        if (zxVar.B1 != null && (arrayList = zxVar.D2) != null && !arrayList.isEmpty()) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) zxVar.D2.get(0);
            nw nwVar = zxVar.B1;
            CharSequence charSequence = ffVar.a;
            if (charSequence == null) {
                charSequence = "";
            }
            nwVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.tp0 tp0Var = zxVar.G2;
        if (tp0Var != null) {
            i13 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
            tp0Var.i(i13, zxVar.D2);
        }
        if ((z10 && i11 == 0 && !z11) || zxVar.C2 == null || arrayList2.isEmpty()) {
            PhotoViewer.v1().H0(true, false);
            return;
        }
        zxVar.J2 = z10;
        zxVar.K2 = i11;
        zxVar.M2 = z11;
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            arrayList3.add(org.telegram.messenger.hs.a(((Long) arrayList2.get(i14)).longValue(), 0L));
        }
        PhotoViewer.v1().H0(true, false);
        zxVar.C2.z(zxVar, arrayList3, zxVar.B1.getFieldText(), false, z10, i11, i12, null);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void s() {
        nw nwVar;
        org.telegram.ui.Components.nc h12;
        PhotoViewer v12 = PhotoViewer.v1();
        CharSequence charSequence = null;
        if (v12.U1() && (h12 = v12.h1()) != null) {
            charSequence = h12.getText();
        }
        zx zxVar = this.b;
        if (charSequence != null && (nwVar = zxVar.B1) != null) {
            nwVar.setFieldText(charSequence);
        }
        ArrayList arrayList = zxVar.D2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((org.telegram.messenger.ff) obj).a = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean x(int i10) {
        return this.a[i10];
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final int k(int i10, org.telegram.messenger.y20 y20Var) {
        return i10;
    }
}
