package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements tk, org.telegram.ui.ActionBar.p1, qe.i, hj0, pi.n, hh.d, pi.m, org.telegram.ui.ActionBar.l0, zm, r4, ki {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;

    public /* synthetic */ kg(bi biVar, int i3) {
        this.a = i3;
        this.b = biVar;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        boolean u12;
        switch (this.a) {
            case 14:
                bi biVar = this.b;
                th thVar = biVar.t2;
                if (thVar != biVar.b2 && thVar != biVar.i2) {
                    if (!thVar.L(z10, i3, i10, 0L, biVar.f1())) {
                        biVar.y4 = true;
                        biVar.dismiss();
                        break;
                    }
                } else {
                    biVar.u1(z10, i3, 0, biVar.I2, biVar.f1());
                    break;
                }
                break;
            default:
                bi biVar2 = this.b;
                se seVar = biVar2.Z1;
                long j10 = seVar != null ? seVar.j() : 0L;
                ih ihVar = biVar2.D2;
                biVar2.I2 = j10;
                ihVar.setEffect(j10);
                th thVar2 = biVar2.t2;
                if (thVar2 == biVar2.b2 || thVar2 == biVar2.i2) {
                    u12 = biVar2.u1(z10, i3, i10, j10, biVar2.f1());
                } else {
                    if (!thVar2.L(z10, i3, i10, j10, biVar2.f1())) {
                        biVar2.dismiss();
                    }
                    u12 = false;
                }
                se seVar2 = biVar2.Z1;
                if (seVar2 != null) {
                    seVar2.g(!u12);
                    biVar2.Z1 = null;
                    break;
                }
                break;
        }
    }

    @Override // qe.i
    public void b(qe.j jVar) {
        this.b.i1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e9, code lost:
    
        if (r24 != 0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.zm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(TLRPC.MessageMedia messageMedia, Editable editable, th.d dVar, ArrayList arrayList, final boolean z10, final int i3, final long j10) {
        String str;
        ArrayList arrayList2;
        long j11;
        final long j12;
        final org.telegram.messenger.zi ziVar;
        final org.telegram.messenger.zi ziVar2;
        org.telegram.ui.wm wmVar;
        org.telegram.messenger.ej ejVar;
        long j13;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.a;
        bi biVar = this.b;
        switch (i14) {
            case 13:
                org.telegram.ui.wm wmVar2 = (org.telegram.ui.wm) biVar.X1;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (wmVar2.t7()) {
                    org.telegram.messenger.wy c2 = org.telegram.messenger.wy.c(null, null, null, null, null, null, null, null, null, null, wmVar2.k6, null, wmVar2.E5, wmVar2.m4, null, true, null, null, null, null, z10, i3, 0, 0, null, null, false, false);
                    c2.l = tL_messageMediaToDo;
                    c2.K = wmVar2.W8();
                    c2.Q = j10;
                    c2.R = wmVar2.h9();
                    c2.T = wmVar2.x5;
                    wmVar2.getSendMessagesHelper().r0(c2);
                    wmVar2.K6();
                    break;
                }
                break;
            default:
                org.telegram.ui.wm wmVar3 = (org.telegram.ui.wm) biVar.X1;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (wmVar3.t7()) {
                    long nextLong = Utilities.b.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        ArrayList W = wmVar3.getMediaDataController().W(charSequenceArr, true, true);
                        str = charSequenceArr[0].toString();
                        arrayList2 = W;
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    final th.f fVar = new th.f(dVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList);
                    final org.telegram.messenger.c accountInstance = wmVar3.getAccountInstance();
                    long j14 = wmVar3.k6;
                    org.telegram.messenger.zi ziVar3 = wmVar3.E5;
                    org.telegram.messenger.zi ziVar4 = wmVar3.m4;
                    final org.telegram.ui.mm mmVar = wmVar3.C5;
                    final org.telegram.messenger.zv W8 = wmVar3.W8();
                    final long h92 = wmVar3.h9();
                    final org.telegram.messenger.ej ejVar2 = wmVar3.x5;
                    org.telegram.messenger.p5 p5Var = org.telegram.messenger.yy.J;
                    if (dVar != null) {
                        final ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        j12 = j14;
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        ziVar = ziVar3;
                        final int[] iArr = new int[1];
                        SparseArray sparseArray = dVar.a;
                        int size = sparseArray.size();
                        int i15 = 0;
                        while (i15 < size) {
                            int i16 = size;
                            th.c cVar = (th.c) sparseArray.valueAt(i15);
                            org.telegram.messenger.zi ziVar5 = ziVar4;
                            int keyAt = sparseArray.keyAt(i15);
                            SparseArray sparseArray2 = sparseArray;
                            if (cVar instanceof uh.g) {
                                arrayList9.add(((uh.g) cVar).b);
                                arrayList10.add(Integer.valueOf(keyAt));
                            } else if (cVar instanceof uh.d) {
                                org.telegram.messenger.xy xyVar = ((uh.d) cVar).c;
                                xyVar.B = keyAt;
                                arrayList3.add(xyVar);
                            } else if (cVar instanceof uh.c) {
                                uh.c cVar2 = (uh.c) cVar;
                                String str2 = cVar2.b;
                                if (TextUtils.isEmpty(str2)) {
                                    Uri uri = cVar2.c;
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
                            i15++;
                            size = i16;
                            sparseArray = sparseArray2;
                            ziVar4 = ziVar5;
                        }
                        ziVar2 = ziVar4;
                        if (arrayList3.isEmpty()) {
                            i10 = 0;
                        } else {
                            iArr[0] = iArr[0] + 1;
                            i10 = 1;
                        }
                        if (arrayList4.isEmpty() && arrayList7.isEmpty()) {
                            i12 = i10;
                            i11 = 1;
                        } else {
                            i11 = 1;
                            iArr[0] = iArr[0] + 1;
                            i12 = 1;
                        }
                        if (arrayList9.isEmpty()) {
                            i13 = i12;
                        } else {
                            iArr[0] = iArr[0] + i11;
                            i13 = i11;
                        }
                        int i17 = i11;
                        wmVar = wmVar3;
                        accountInstance = accountInstance;
                        final org.telegram.messenger.ww wwVar = new org.telegram.messenger.ww(arrayList4, arrayList7, accountInstance, arrayList5, j12, ziVar, ziVar2, mmVar, z10, i3, W8, j10, h92, ejVar2, fVar, arrayList6, arrayList8);
                        W8 = W8;
                        Runnable runnable = new Runnable() { // from class: org.telegram.messenger.xw
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArrayList arrayList11 = arrayList3;
                                boolean isEmpty = arrayList11.isEmpty();
                                ww wwVar2 = wwVar;
                                if (isEmpty) {
                                    wwVar2.run();
                                    return;
                                }
                                int[] iArr2 = iArr;
                                int i18 = iArr2[0] - 1;
                                iArr2[0] = i18;
                                yy.X(accountInstance, arrayList11, j12, ziVar, ziVar2, null, mmVar, false, true, null, null, z10, i3, 0, false, null, W8, 0L, false, j10, h92, ejVar2, fVar, i18 > 0);
                                yy.J.c(new vs(wwVar2, 11));
                            }
                        };
                        fVar = fVar;
                        if (!arrayList9.isEmpty()) {
                            int i18 = iArr[0] - i17;
                            iArr[0] = i18;
                            j13 = h92;
                            ejVar = ejVar2;
                            org.telegram.messenger.hw hwVar = new org.telegram.messenger.hw(fVar, arrayList9, j12, accountInstance, "", i18 > 0 ? i17 : 0, arrayList10, null, ziVar, ziVar2, z10, i3, 0, null, W8, 0L, false, j10, runnable);
                            fVar = fVar;
                            accountInstance = accountInstance;
                            W8 = W8;
                            j11 = j10;
                            new Thread(hwVar).start();
                            break;
                        } else {
                            j11 = j10;
                            j13 = h92;
                            ejVar = ejVar2;
                            runnable.run();
                            break;
                        }
                    } else {
                        j11 = j10;
                        j12 = j14;
                        ziVar = ziVar3;
                        ziVar2 = ziVar4;
                        wmVar = wmVar3;
                        ejVar = ejVar2;
                        j13 = h92;
                    }
                    org.telegram.messenger.wy c10 = org.telegram.messenger.wy.c(null, null, null, null, null, null, null, null, fVar.a, null, j12, null, ziVar, ziVar2, null, true, null, null, null, null, z10, i3, 0, 0, null, null, false, false);
                    c10.b = fVar.d;
                    c10.L = true;
                    c10.w = fVar.e;
                    c10.K = W8;
                    c10.Q = j11;
                    c10.R = j13;
                    c10.T = ejVar;
                    c10.j = fVar;
                    org.telegram.messenger.yy.C(accountInstance.a).r0(c10);
                    wmVar.K6();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.tk
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.wm) this.b.X1).d(messageMedia, i3, z10, i10, 0L);
                break;
            case 12:
                ((org.telegram.ui.wm) this.b.X1).d(messageMedia, i3, z10, i10, j10);
                break;
            default:
                ((org.telegram.ui.wm) this.b.X1).d(messageMedia, i3, z10, i10, j10);
                break;
        }
    }

    @Override // pi.n
    public int e() {
        bi biVar = this.b;
        biVar.getClass();
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, biVar.J0);
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        TLRPC.User user;
        if (!(view instanceof uh)) {
            return false;
        }
        uh uhVar = (uh) view;
        bi biVar = this.b;
        if (biVar.N1 || (user = uhVar.b) == null) {
            return false;
        }
        biVar.k1(uhVar.c, user);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        bi biVar = this.b;
        biVar.y4 = true;
        biVar.dismiss();
    }

    @Override // org.telegram.ui.Components.ki
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
        bi biVar = this.b;
        ki kiVar = biVar.Q1;
        if (kiVar != null) {
            kiVar.h(arrayList, charSequence, z10, i3, i10, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if (d2Var == null || !(d2Var instanceof org.telegram.ui.wm)) {
            zh zhVar = biVar.U3;
            if (zhVar != null) {
                zhVar.R1(arrayList, charSequence, z10, i3, i10, j10, z11, j11);
                return;
            }
            return;
        }
        org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var;
        if (wmVar.t7()) {
            wmVar.B8(charSequence, null);
            org.telegram.messenger.c accountInstance = wmVar.getAccountInstance();
            CharSequence charSequence2 = charSequence != null ? charSequence : null;
            long j12 = wmVar.k6;
            org.telegram.messenger.zi ziVar = wmVar.E5;
            org.telegram.messenger.zi ziVar2 = wmVar.m4;
            org.telegram.messenger.zi ziVar3 = wmVar.G5;
            org.telegram.messenger.zv W8 = wmVar.W8();
            org.telegram.messenger.p5 p5Var = org.telegram.messenger.yy.J;
            new Thread(new org.telegram.messenger.hw(null, arrayList, j12, accountInstance, charSequence2, false, null, ziVar3, ziVar, ziVar2, z10, i3, i10, null, W8, j10, z11, j11, null)).start();
            wmVar.K6();
        }
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void i(int i3) {
        this.b.S2.getActionBarMenuOnItemClick().b(i3);
    }

    @Override // hh.d
    public int j(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        switch (this.a) {
            case 5:
                float f10 = org.telegram.messenger.lc.e(262144) ? 0.85f : 0.76f;
                int w02 = org.telegram.ui.ActionBar.k6.w0(z10 ? org.telegram.ui.ActionBar.k6.a7 : org.telegram.ui.ActionBar.k6.i5, e6Var);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var);
                bi biVar = this.b;
                return biVar.h4 ? i0.a.f(0.75f, w03, biVar.i4) : b8.cd.n(f10, w02, w03);
            case 6:
                if (this.b.h4) {
                    return 0;
                }
                return z10 ? 687865855 : -1;
            case 7:
                if (this.b.h4) {
                    return 0;
                }
                return z10 ? 352321535 : -1;
            default:
                bi biVar2 = this.b;
                if (biVar2.h4) {
                    if (org.telegram.messenger.g0.B(biVar2.i4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // pi.m
    public void l(int i3) {
        bi biVar = this.b;
        eh.g gVar = biVar.A4;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (x7.u.a(i3, 4)) {
            ri.a e10 = biVar.Y0.e();
            e10.b(biVar.b.getY(), biVar.b.getWidth(), biVar.b.getY() + biVar.b.getHeight());
            gVar.h(e10);
        }
        gVar.e(biVar.E4, biVar.b.getWidth(), biVar.b.getHeight());
    }

    @Override // qe.i
    public /* synthetic */ void a() {
    }
}
