package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fw extends qq0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ zw b;

    public fw(zw zwVar, boolean[] zArr) {
        this.b = zwVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final CharSequence C(int i7) {
        zw zwVar = this.b;
        if (i7 < 0 || i7 >= zwVar.E2.size() || !((org.telegram.messenger.gf) zwVar.E2.get(i7)).b) {
            return zw.w2(zwVar);
        }
        return null;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void D() {
        int i7;
        zw zwVar = this.b;
        org.telegram.ui.Components.po0 po0Var = zwVar.H2;
        if (po0Var != null) {
            i7 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
            po0Var.i(i7, zwVar.E2);
        }
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        zw zwVar = this.b;
        org.telegram.ui.Components.po0 po0Var = zwVar.H2;
        org.telegram.ui.Components.k9 f10 = po0Var != null ? po0Var.f(i7) : null;
        if (f10 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f10.getLocationInWindow(iArr);
        zq0 zq0Var = new zq0();
        zq0Var.b = iArr[0];
        zq0Var.c = iArr[1];
        zq0Var.d = zwVar.H2;
        ImageReceiver imageReceiver = f10.getImageReceiver();
        zq0Var.a = imageReceiver;
        zq0Var.e = imageReceiver.p();
        zq0Var.k = f10.getScaleX();
        zq0Var.h = new int[]{org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f)};
        return zq0Var;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final int H() {
        ArrayList arrayList = this.b.E2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean I() {
        return this.b.x3();
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final long a() {
        zw zwVar = this.b;
        if (zwVar.J2.isEmpty()) {
            return 0L;
        }
        return ((Long) zwVar.J2.get(0)).longValue();
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean b() {
        zw zwVar = this.b;
        if (zwVar.J2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = zwVar.J2;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            long longValue = ((Long) obj).longValue();
            if (org.telegram.messenger.m5.C(longValue) || zwVar.getMessagesController().N1(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final CharSequence c0(int i7) {
        zw zwVar = this.b;
        ArrayList arrayList = zwVar.E2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = zwVar.E2.size();
        if (size == 1) {
            return org.telegram.messenger.id.M0(((org.telegram.messenger.gf) zwVar.E2.get(0)).b ? 2131753933 : 2131753948, null);
        }
        ArrayList arrayList2 = zwVar.E2;
        int size2 = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size2) {
            Object obj = arrayList2.get(i12);
            i12++;
            if (((org.telegram.messenger.gf) obj).b) {
                i10++;
            } else {
                i11++;
            }
        }
        return i10 == 0 ? org.telegram.messenger.id.G(size, "ShareSendPhotos", new Object[0]) : i11 == 0 ? org.telegram.messenger.id.G(size, "ShareSendVideos", new Object[0]) : org.telegram.messenger.id.G(size, "ShareSendItems", new Object[0]);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void e(CharSequence charSequence) {
        zw zwVar = this.b;
        mv mvVar = zwVar.C1;
        if (mvVar != null) {
            mvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = zwVar.E2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.gf) obj).a = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean h() {
        TLRPC.User a22;
        zw zwVar = this.b;
        if (zwVar.J2.isEmpty()) {
            return false;
        }
        org.telegram.messenger.qp messagesController = zwVar.getMessagesController();
        ArrayList arrayList = zwVar.J2;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Long l10 = (Long) obj;
            if (!org.telegram.messenger.m5.E(l10.longValue()) || (a22 = messagesController.a2(l10)) == null || a22.bot || org.telegram.messenger.t10.B(a22)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Components.po0 po0Var = this.b.H2;
        org.telegram.ui.Components.k9 f10 = po0Var != null ? po0Var.f(i7) : null;
        if (f10 != null) {
            return f10.getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList;
        zw zwVar = this.b;
        ArrayList arrayList2 = zwVar.J2;
        if (zwVar.C1 != null && (arrayList = zwVar.E2) != null && !arrayList.isEmpty()) {
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) zwVar.E2.get(0);
            mv mvVar = zwVar.C1;
            CharSequence charSequence = gfVar.a;
            if (charSequence == null) {
                charSequence = "";
            }
            mvVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.po0 po0Var = zwVar.H2;
        if (po0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
            po0Var.i(i12, zwVar.E2);
        }
        if ((z9 && i10 == 0 && !z10) || zwVar.D2 == null || arrayList2.isEmpty()) {
            PhotoViewer.p1().z0(true, false);
            return;
        }
        zwVar.K2 = z9;
        zwVar.L2 = i10;
        zwVar.N2 = z10;
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            arrayList3.add(org.telegram.messenger.xr.a(((Long) arrayList2.get(i13)).longValue(), 0L));
        }
        PhotoViewer.p1().z0(true, false);
        zwVar.D2.y(zwVar, arrayList3, zwVar.C1.getFieldText(), false, z9, i10, i11, null);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void s() {
        mv mvVar;
        org.telegram.ui.Components.tc a12;
        PhotoViewer p12 = PhotoViewer.p1();
        CharSequence charSequence = null;
        if (p12.P1() && (a12 = p12.a1()) != null) {
            charSequence = a12.getText();
        }
        zw zwVar = this.b;
        if (charSequence != null && (mvVar = zwVar.C1) != null) {
            mvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = zwVar.E2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((org.telegram.messenger.gf) obj).a = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean x(int i7) {
        return this.a[i7];
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        return i7;
    }
}
