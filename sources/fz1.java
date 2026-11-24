// default package

import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fz1 implements b42, ed, j79, e39, nw4, ml0, mw4, m7, j62, gj, e12 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x02 b;

    public /* synthetic */ fz1(x02 x02Var, byte b) {
        this.a = b;
        this.b = x02Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ec, code lost:
    
        if (r23 != 0) goto L56;
     */
    /* JADX WARN: Type inference failed for: r1v20, types: [d2a] */
    @Override // j62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(TLRPC.MessageMedia messageMedia, Editable editable, ud8 ud8Var, ArrayList arrayList, final boolean z, final int i, final long j) {
        String str;
        ArrayList arrayList2;
        final long j2;
        u47 u47Var;
        final k27 k27Var;
        mu1 mu1Var;
        final k27 k27Var2;
        final j1a j1aVar;
        long j3;
        long j4;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b = this.a;
        x02 x02Var = this.b;
        switch (b) {
            case 13:
                mu1 mu1Var2 = (mu1) x02Var.Z1;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (mu1Var2.l5()) {
                    x3a c = x3a.c(null, null, null, null, null, null, null, null, null, null, mu1Var2.l6, null, mu1Var2.F5, mu1Var2.m4, null, true, null, null, null, null, z, i, 0, 0, null, null, false, false);
                    c.l = tL_messageMediaToDo;
                    c.K = mu1Var2.Q6();
                    c.Q = j;
                    c.R = mu1Var2.c7();
                    c.T = mu1Var2.y5;
                    mu1Var2.getSendMessagesHelper().q0(c);
                    mu1Var2.z4();
                    break;
                }
                break;
            default:
                mu1 mu1Var3 = (mu1) x02Var.Z1;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (mu1Var3.l5()) {
                    long nextLong = Utilities.b.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        ArrayList Y = mu1Var3.getMediaDataController().Y(charSequenceArr, true, true);
                        str = charSequenceArr[0].toString();
                        arrayList2 = Y;
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    final we8 we8Var = new we8(ud8Var, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList);
                    final j5 accountInstance = mu1Var3.getAccountInstance();
                    long j5 = mu1Var3.l6;
                    k27 k27Var3 = mu1Var3.F5;
                    k27 k27Var4 = mu1Var3.m4;
                    final bu1 bu1Var = mu1Var3.D5;
                    j1a Q6 = mu1Var3.Q6();
                    final long c7 = mu1Var3.c7();
                    final u47 u47Var2 = mu1Var3.y5;
                    co3 co3Var = z3a.J;
                    if (ud8Var != null) {
                        final ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        j2 = j5;
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        k27Var = k27Var3;
                        final int[] iArr = new int[1];
                        SparseArray sparseArray = ud8Var.a;
                        int size = sparseArray.size();
                        int i6 = 0;
                        while (i6 < size) {
                            int i7 = size;
                            ld8 ld8Var = (ld8) sparseArray.valueAt(i6);
                            mu1 mu1Var4 = mu1Var3;
                            int keyAt = sparseArray.keyAt(i6);
                            SparseArray sparseArray2 = sparseArray;
                            if (ld8Var instanceof td8) {
                                arrayList9.add(((td8) ld8Var).b);
                                arrayList10.add(Integer.valueOf(keyAt));
                            } else if (ld8Var instanceof pd8) {
                                y3a y3aVar = ((pd8) ld8Var).c;
                                y3aVar.B = keyAt;
                                arrayList3.add(y3aVar);
                            } else if (ld8Var instanceof od8) {
                                od8 od8Var = (od8) ld8Var;
                                String str2 = od8Var.b;
                                if (TextUtils.isEmpty(str2)) {
                                    Uri uri = od8Var.c;
                                    if (uri != null) {
                                        arrayList7.add(uri);
                                        arrayList8.add(Integer.valueOf(keyAt));
                                    }
                                } else {
                                    arrayList4.add(str2);
                                    arrayList5.add(str2);
                                    arrayList6.add(Integer.valueOf(keyAt));
                                }
                            }
                            i6++;
                            size = i7;
                            mu1Var3 = mu1Var4;
                            sparseArray = sparseArray2;
                        }
                        mu1 mu1Var5 = mu1Var3;
                        if (arrayList3.isEmpty()) {
                            i2 = 0;
                        } else {
                            iArr[0] = iArr[0] + 1;
                            i2 = 1;
                        }
                        if (arrayList4.isEmpty() && arrayList7.isEmpty()) {
                            i4 = i2;
                            i3 = 1;
                        } else {
                            i3 = 1;
                            iArr[0] = iArr[0] + 1;
                            i4 = 1;
                        }
                        if (arrayList9.isEmpty()) {
                            i5 = i4;
                        } else {
                            iArr[0] = iArr[0] + i3;
                            i5 = i3;
                        }
                        mu1Var = mu1Var5;
                        accountInstance = accountInstance;
                        final c2a c2aVar = new c2a(arrayList4, arrayList7, accountInstance, arrayList5, j2, k27Var, k27Var4, bu1Var, z, i, Q6, j, c7, u47Var2, we8Var, arrayList6, arrayList8);
                        k27Var2 = k27Var4;
                        j1aVar = Q6;
                        ?? r1 = new Runnable() { // from class: d2a
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArrayList arrayList11 = arrayList3;
                                boolean isEmpty = arrayList11.isEmpty();
                                c2a c2aVar2 = c2aVar;
                                if (isEmpty) {
                                    c2aVar2.run();
                                    return;
                                }
                                int[] iArr2 = iArr;
                                int i8 = iArr2[0] - 1;
                                iArr2[0] = i8;
                                z3a.W(accountInstance, arrayList11, j2, k27Var, k27Var2, null, bu1Var, false, true, null, null, z, i, 0, false, null, j1aVar, 0L, false, j, c7, u47Var2, we8Var, i8 > 0);
                                z3a.J.c(new zk9(c2aVar2, (byte) 27));
                            }
                        };
                        we8Var = we8Var;
                        if (!arrayList9.isEmpty()) {
                            int i8 = iArr[0] - 1;
                            iArr[0] = i8;
                            j3 = c7;
                            u47Var = u47Var2;
                            p1a p1aVar = new p1a(we8Var, arrayList9, j2, accountInstance, "", i8 > 0, arrayList10, null, k27Var, k27Var2, z, i, 0, null, j1aVar, 0L, false, j, r1);
                            we8Var = we8Var;
                            accountInstance = accountInstance;
                            k27Var2 = k27Var2;
                            j1aVar = j1aVar;
                            j4 = j;
                            new Thread(p1aVar).start();
                            break;
                        } else {
                            j4 = j;
                            j3 = c7;
                            u47Var = u47Var2;
                            r1.run();
                            break;
                        }
                    } else {
                        j2 = j5;
                        u47Var = u47Var2;
                        k27Var = k27Var3;
                        mu1Var = mu1Var3;
                        k27Var2 = k27Var4;
                        j1aVar = Q6;
                        j3 = c7;
                        j4 = j;
                    }
                    x3a c2 = x3a.c(null, null, null, null, null, null, null, null, we8Var.a, null, j2, null, k27Var, k27Var2, null, true, null, null, null, null, z, i, 0, 0, null, null, false, false);
                    c2.b = we8Var.d;
                    c2.L = true;
                    c2.w = we8Var.e;
                    c2.K = j1aVar;
                    c2.Q = j4;
                    c2.R = j3;
                    c2.T = u47Var;
                    c2.j = we8Var;
                    z3a.B(accountInstance.a).q0(c2);
                    mu1Var.z4();
                    break;
                }
                break;
        }
    }

    @Override // b42
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        byte b = this.a;
        x02 x02Var = this.b;
        switch (b) {
            case 0:
                ((mu1) x02Var.Z1).b(messageMedia, i, z, i2, 0L);
                break;
            case 12:
                ((mu1) x02Var.Z1).b(messageMedia, i, z, i2, j);
                break;
            default:
                ((mu1) x02Var.Z1).b(messageMedia, i, z, i2, j);
                break;
        }
    }

    @Override // e39
    public final boolean d(int i, View view) {
        TLRPC.User user;
        if (!(view instanceof q02)) {
            return false;
        }
        q02 q02Var = (q02) view;
        x02 x02Var = this.b;
        if (x02Var.P1 || (user = q02Var.b) == null) {
            return false;
        }
        x02Var.f1(q02Var.c, user);
        return true;
    }

    @Override // j79
    public final void f(k79 k79Var) {
        this.b.d1();
    }

    @Override // e12
    public final void g(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        x02 x02Var = this.b;
        e12 e12Var = x02Var.S1;
        if (e12Var != null) {
            e12Var.g(arrayList, editable, z, i, i2, j, z2, j2);
            return;
        }
        d dVar = x02Var.Z1;
        if (dVar == null || !(dVar instanceof mu1)) {
            v02 v02Var = x02Var.W3;
            if (v02Var != null) {
                v02Var.R0(arrayList, editable, z, i, i2, j, z2, j2);
                return;
            }
            return;
        }
        mu1 mu1Var = (mu1) dVar;
        if (mu1Var.l5()) {
            mu1Var.y6(editable, null);
            j5 accountInstance = mu1Var.getAccountInstance();
            Editable editable2 = editable != null ? editable : null;
            long j3 = mu1Var.l6;
            k27 k27Var = mu1Var.F5;
            k27 k27Var2 = mu1Var.m4;
            k27 k27Var3 = mu1Var.H5;
            j1a Q6 = mu1Var.Q6();
            co3 co3Var = z3a.J;
            new Thread(new p1a(null, arrayList, j3, accountInstance, editable2, false, null, k27Var3, k27Var, k27Var2, z, i, i2, null, Q6, j, z2, j2, null)).start();
            mu1Var.z4();
        }
    }

    @Override // m7
    public final void h(int i) {
        this.b.U2.getActionBarMenuOnItemClick().b(i);
    }

    @Override // nw4
    public final int i() {
        return bkb.v0(bkb.c6, this.b.J0);
    }

    @Override // mw4
    public final void j(int i) {
        x02 x02Var = this.b;
        cq3 cq3Var = x02Var.C4;
        if (Build.VERSION.SDK_INT < 31 || cq3Var == null) {
            return;
        }
        if (fod.a(i, 4)) {
            zw4 e = x02Var.X0.e();
            e.b(x02Var.b.getY(), x02Var.b.getWidth(), x02Var.b.getY() + x02Var.b.getHeight());
            cq3Var.h(e);
        }
        cq3Var.e(x02Var.F4, x02Var.b.getWidth(), x02Var.b.getHeight());
    }

    @Override // ml0
    public final int k(wjb wjbVar, boolean z) {
        byte b = this.a;
        x02 x02Var = this.b;
        switch (b) {
            case 5:
                float f = e66.e(262144) ? 0.85f : 0.76f;
                int v0 = bkb.v0(z ? bkb.Z6 : bkb.h5, wjbVar);
                int v02 = bkb.v0(bkb.c6, wjbVar);
                return x02Var.j4 ? bm2.f(0.75f, v02, x02Var.k4) : nod.m(f, v0, v02);
            case 6:
                if (x02Var.j4) {
                    return 0;
                }
                return z ? 687865855 : -1;
            case 7:
                if (x02Var.j4) {
                    return 0;
                }
                return z ? 352321535 : -1;
            default:
                if (x02Var.j4) {
                    if (gl.B(x02Var.k4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        boolean p1;
        switch (this.a) {
            case 14:
                x02 x02Var = this.b;
                p02 p02Var = x02Var.v2;
                if (p02Var != x02Var.d2 && p02Var != x02Var.k2) {
                    if (!p02Var.M(z, i, i2, 0L, x02Var.a1())) {
                        x02Var.A4 = true;
                        x02Var.dismiss();
                        break;
                    }
                } else {
                    x02Var.p1(z, i, 0, x02Var.K2, x02Var.a1());
                    break;
                }
                break;
            default:
                x02 x02Var2 = this.b;
                bx1 bx1Var = x02Var2.b2;
                long i3 = bx1Var != null ? bx1Var.i() : 0L;
                e02 e02Var = x02Var2.F2;
                x02Var2.K2 = i3;
                e02Var.setEffect(i3);
                p02 p02Var2 = x02Var2.v2;
                if (p02Var2 == x02Var2.d2 || p02Var2 == x02Var2.k2) {
                    p1 = x02Var2.p1(z, i, i2, i3, x02Var2.a1());
                } else {
                    if (!p02Var2.M(z, i, i2, i3, x02Var2.a1())) {
                        x02Var2.dismiss();
                    }
                    p1 = false;
                }
                bx1 bx1Var2 = x02Var2.b2;
                if (bx1Var2 != null) {
                    bx1Var2.f(!p1);
                    x02Var2.b2 = null;
                    break;
                }
                break;
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        x02 x02Var = this.b;
        x02Var.A4 = true;
        x02Var.dismiss();
    }

    @Override // j79
    public final void c() {
    }
}
