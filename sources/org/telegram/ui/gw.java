package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gw extends oq0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ bx b;

    public gw(bx bxVar, boolean[] zArr) {
        this.b = bxVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final CharSequence C(int i7) {
        bx bxVar = this.b;
        if (i7 < 0 || i7 >= bxVar.F2.size() || !((org.telegram.messenger.ef) bxVar.F2.get(i7)).b) {
            return bx.x2(bxVar);
        }
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void D() {
        int i7;
        bx bxVar = this.b;
        org.telegram.ui.Components.dp0 dp0Var = bxVar.I2;
        if (dp0Var != null) {
            i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
            dp0Var.i(i7, bxVar.F2);
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        bx bxVar = this.b;
        org.telegram.ui.Components.dp0 dp0Var = bxVar.I2;
        org.telegram.ui.Components.p9 f10 = dp0Var != null ? dp0Var.f(i7) : null;
        if (f10 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f10.getLocationInWindow(iArr);
        wq0 wq0Var = new wq0();
        wq0Var.b = iArr[0];
        wq0Var.c = iArr[1];
        wq0Var.d = bxVar.I2;
        ImageReceiver imageReceiver = f10.getImageReceiver();
        wq0Var.a = imageReceiver;
        wq0Var.e = imageReceiver.p();
        wq0Var.k = f10.getScaleX();
        wq0Var.h = new int[]{org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f)};
        return wq0Var;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int H() {
        ArrayList arrayList = this.b.F2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean I() {
        return this.b.x3();
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final long a() {
        bx bxVar = this.b;
        if (bxVar.K2.isEmpty()) {
            return 0L;
        }
        return ((Long) bxVar.K2.get(0)).longValue();
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean b() {
        bx bxVar = this.b;
        if (bxVar.K2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = bxVar.K2;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            long longValue = ((Long) obj).longValue();
            if (org.telegram.messenger.n5.C(longValue) || bxVar.getMessagesController().P1(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final CharSequence c0(int i7) {
        bx bxVar = this.b;
        ArrayList arrayList = bxVar.F2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = bxVar.F2.size();
        if (size == 1) {
            return org.telegram.messenger.gd.N0(((org.telegram.messenger.ef) bxVar.F2.get(0)).b ? 2131753930 : 2131753945, null);
        }
        ArrayList arrayList2 = bxVar.F2;
        int size2 = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size2) {
            Object obj = arrayList2.get(i12);
            i12++;
            if (((org.telegram.messenger.ef) obj).b) {
                i10++;
            } else {
                i11++;
            }
        }
        return i10 == 0 ? org.telegram.messenger.gd.G(size, "ShareSendPhotos", new Object[0]) : i11 == 0 ? org.telegram.messenger.gd.G(size, "ShareSendVideos", new Object[0]) : org.telegram.messenger.gd.G(size, "ShareSendItems", new Object[0]);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void e(CharSequence charSequence) {
        bx bxVar = this.b;
        mv mvVar = bxVar.D1;
        if (mvVar != null) {
            mvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = bxVar.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.ef) obj).a = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean h() {
        TLRPC.User c22;
        bx bxVar = this.b;
        if (bxVar.K2.isEmpty()) {
            return false;
        }
        org.telegram.messenger.mp messagesController = bxVar.getMessagesController();
        ArrayList arrayList = bxVar.K2;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Long l10 = (Long) obj;
            if (!org.telegram.messenger.n5.E(l10.longValue()) || (c22 = messagesController.c2(l10)) == null || c22.bot || org.telegram.messenger.n10.C(c22)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.messenger.hc j(int i7) {
        org.telegram.ui.Components.dp0 dp0Var = this.b.I2;
        org.telegram.ui.Components.p9 f10 = dp0Var != null ? dp0Var.f(i7) : null;
        if (f10 != null) {
            return f10.getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        int i12;
        ArrayList arrayList;
        bx bxVar = this.b;
        ArrayList arrayList2 = bxVar.K2;
        if (bxVar.D1 != null && (arrayList = bxVar.F2) != null && !arrayList.isEmpty()) {
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) bxVar.F2.get(0);
            mv mvVar = bxVar.D1;
            CharSequence charSequence = efVar.a;
            if (charSequence == null) {
                charSequence = "";
            }
            mvVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.dp0 dp0Var = bxVar.I2;
        if (dp0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
            dp0Var.i(i12, bxVar.F2);
        }
        if ((z10 && i10 == 0 && !z11) || bxVar.E2 == null || arrayList2.isEmpty()) {
            PhotoViewer.p1().z0(true, false);
            return;
        }
        bxVar.L2 = z10;
        bxVar.M2 = i10;
        bxVar.O2 = z11;
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            arrayList3.add(org.telegram.messenger.sr.a(((Long) arrayList2.get(i13)).longValue(), 0L));
        }
        PhotoViewer.p1().z0(true, false);
        bxVar.E2.z(bxVar, arrayList3, bxVar.D1.getFieldText(), false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void s() {
        mv mvVar;
        org.telegram.ui.Components.yc b12;
        PhotoViewer p12 = PhotoViewer.p1();
        CharSequence charSequence = null;
        if (p12.Q1() && (b12 = p12.b1()) != null) {
            charSequence = b12.getText();
        }
        bx bxVar = this.b;
        if (charSequence != null && (mvVar = bxVar.D1) != null) {
            mvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = bxVar.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.ef) obj).a = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean x(int i7) {
        return this.a[i7];
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int k(int i7, org.telegram.messenger.d20 d20Var) {
        return i7;
    }
}
