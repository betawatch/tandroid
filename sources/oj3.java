// default package

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oj3 extends jb8 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ nk3 b;

    public oj3(nk3 nk3Var, boolean[] zArr) {
        this.b = nk3Var;
        this.a = zArr;
    }

    @Override // jb8, pb8
    public final CharSequence C(int i) {
        nk3 nk3Var = this.b;
        if (i < 0 || i >= nk3Var.F2.size() || !((jo6) nk3Var.F2.get(i)).b) {
            return nk3Var.E2();
        }
        return null;
    }

    @Override // jb8, pb8
    public final void D() {
        int i;
        nk3 nk3Var = this.b;
        bda bdaVar = nk3Var.I2;
        if (bdaVar != null) {
            i = ((d) nk3Var).currentAccount;
            bdaVar.i(i, nk3Var.F2);
        }
    }

    @Override // jb8, pb8
    public final int H() {
        ArrayList arrayList = this.b.F2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // jb8, pb8
    public final boolean I() {
        return this.b.G2();
    }

    @Override // jb8, pb8
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        int i4;
        ArrayList arrayList;
        nk3 nk3Var = this.b;
        ArrayList arrayList2 = nk3Var.K2;
        if (nk3Var.D1 != null && (arrayList = nk3Var.F2) != null && !arrayList.isEmpty()) {
            jo6 jo6Var = (jo6) nk3Var.F2.get(0);
            ti3 ti3Var = nk3Var.D1;
            CharSequence charSequence = jo6Var.a;
            if (charSequence == null) {
                charSequence = "";
            }
            ti3Var.setFieldText(charSequence);
        }
        bda bdaVar = nk3Var.I2;
        if (bdaVar != null) {
            i4 = ((d) nk3Var).currentAccount;
            bdaVar.i(i4, nk3Var.F2);
        }
        if ((z && i2 == 0 && !z2) || nk3Var.E2 == null || arrayList2.isEmpty()) {
            PhotoViewer.r0().A(true, false);
            return;
        }
        nk3Var.L2 = z;
        nk3Var.M2 = i2;
        nk3Var.O2 = z2;
        ArrayList arrayList3 = new ArrayList();
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            arrayList3.add(bf7.a(((Long) arrayList2.get(i5)).longValue(), 0L));
        }
        PhotoViewer.r0().A(true, false);
        nk3Var.E2.q(nk3Var, arrayList3, nk3Var.D1.getFieldText(), false, z, i2, i3, null);
    }

    @Override // jb8, pb8
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        nk3 nk3Var = this.b;
        bda bdaVar = nk3Var.I2;
        bf0 f = bdaVar != null ? bdaVar.f(i) : null;
        if (f == null) {
            return null;
        }
        int[] iArr = new int[2];
        f.getLocationInWindow(iArr);
        qb8 qb8Var = new qb8();
        qb8Var.b = iArr[0];
        qb8Var.c = iArr[1];
        qb8Var.d = nk3Var.I2;
        ImageReceiver imageReceiver = f.getImageReceiver();
        qb8Var.a = imageReceiver;
        qb8Var.e = imageReceiver.p();
        qb8Var.k = f.getScaleX();
        qb8Var.h = new int[]{gm.L(6.0f), gm.L(6.0f), gm.L(6.0f), gm.L(6.0f)};
        return qb8Var;
    }

    @Override // jb8, pb8
    public final long a() {
        ArrayList arrayList = this.b.K2;
        if (arrayList.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayList.get(0)).longValue();
    }

    @Override // jb8, pb8
    public final boolean b() {
        nk3 nk3Var = this.b;
        ArrayList arrayList = nk3Var.K2;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                long longValue = ((Long) obj).longValue();
                if (!pg3.B(longValue) && nk3Var.getMessagesController().L1(longValue) <= 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // jb8, pb8
    public final CharSequence d0(int i) {
        nk3 nk3Var = this.b;
        ArrayList arrayList = nk3Var.F2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = nk3Var.F2.size();
        ArrayList arrayList2 = nk3Var.F2;
        if (size == 1) {
            return jb6.M0(((jo6) arrayList2.get(0)).b ? 2131753898 : 2131753913, null);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < size2) {
            Object obj = arrayList2.get(i4);
            i4++;
            if (((jo6) obj).b) {
                i2++;
            } else {
                i3++;
            }
        }
        return i2 == 0 ? jb6.G(size, "ShareSendPhotos", new Object[0]) : i3 == 0 ? jb6.G(size, "ShareSendVideos", new Object[0]) : jb6.G(size, "ShareSendItems", new Object[0]);
    }

    @Override // jb8, pb8
    public final void f(CharSequence charSequence) {
        nk3 nk3Var = this.b;
        ti3 ti3Var = nk3Var.D1;
        if (ti3Var != null) {
            ti3Var.setFieldText(charSequence);
        }
        ArrayList arrayList = nk3Var.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((jo6) obj).a = charSequence;
            }
        }
    }

    @Override // jb8, pb8
    public final boolean i() {
        TLRPC.User W1;
        nk3 nk3Var = this.b;
        ArrayList arrayList = nk3Var.K2;
        if (!arrayList.isEmpty()) {
            oc7 messagesController = nk3Var.getMessagesController();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Long l = (Long) obj;
                if (pg3.D(l.longValue()) && (W1 = messagesController.W1(l)) != null && !W1.bot && !m9c.D(W1)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // jb8, pb8
    public final jn5 k(int i) {
        bda bdaVar = this.b.I2;
        bf0 f = bdaVar != null ? bdaVar.f(i) : null;
        if (f != null) {
            return f.getImageReceiver().p();
        }
        return null;
    }

    @Override // jb8, pb8
    public final void r() {
        ti3 ti3Var;
        tc1 d0;
        PhotoViewer r0 = PhotoViewer.r0();
        CharSequence charSequence = null;
        if (r0.V0() && (d0 = r0.d0()) != null) {
            charSequence = d0.getText();
        }
        nk3 nk3Var = this.b;
        if (charSequence != null && (ti3Var = nk3Var.D1) != null) {
            ti3Var.setFieldText(charSequence);
        }
        ArrayList arrayList = nk3Var.F2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((jo6) obj).a = charSequence;
            }
        }
    }

    @Override // jb8, pb8
    public final boolean w(int i) {
        return this.a[i];
    }

    @Override // jb8, pb8
    public final int E(int i, rcc rccVar) {
        return i;
    }
}
