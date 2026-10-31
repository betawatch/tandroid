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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig implements wk, org.telegram.ui.ActionBar.u1, fe.l, ik0, ei.o, wg.c, ei.n, org.telegram.ui.ActionBar.o0, in, q4, ji {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;

    public /* synthetic */ ig(bi biVar, int i10) {
        this.a = i10;
        this.b = biVar;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        boolean t12;
        switch (this.a) {
            case 14:
                bi biVar = this.b;
                uh uhVar = biVar.s2;
                if (uhVar != biVar.a2 && uhVar != biVar.h2) {
                    if (!uhVar.J(z10, i10, i11, 0L, biVar.e1())) {
                        biVar.x4 = true;
                        biVar.dismiss();
                        break;
                    }
                } else {
                    biVar.t1(z10, i10, 0, biVar.H2, biVar.e1());
                    break;
                }
                break;
            default:
                bi biVar2 = this.b;
                pe peVar = biVar2.Y1;
                long j10 = peVar != null ? peVar.j() : 0L;
                ih ihVar = biVar2.C2;
                biVar2.H2 = j10;
                ihVar.setEffect(j10);
                uh uhVar2 = biVar2.s2;
                if (uhVar2 == biVar2.a2 || uhVar2 == biVar2.h2) {
                    t12 = biVar2.t1(z10, i10, i11, j10, biVar2.e1());
                } else {
                    if (!uhVar2.J(z10, i10, i11, j10, biVar2.e1())) {
                        biVar2.dismiss();
                    }
                    t12 = false;
                }
                pe peVar2 = biVar2.Y1;
                if (peVar2 != null) {
                    peVar2.g(!t12);
                    biVar2.Y1 = null;
                    break;
                }
                break;
        }
    }

    @Override // fe.l
    public void b(fe.m mVar) {
        this.b.h1();
    }

    @Override // ei.o
    public int c() {
        bi biVar = this.b;
        biVar.getClass();
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, biVar.I0);
    }

    @Override // org.telegram.ui.Components.wk
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.un) this.b.W1).d(messageMedia, i10, z10, i11, 0L);
                break;
            case 12:
                ((org.telegram.ui.un) this.b.W1).d(messageMedia, i10, z10, i11, j10);
                break;
            default:
                ((org.telegram.ui.un) this.b.W1).d(messageMedia, i10, z10, i11, j10);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e9, code lost:
    
        if (r24 != 0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.in
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(TLRPC.MessageMedia messageMedia, Editable editable, ih.g gVar, ArrayList arrayList, final boolean z10, final int i10, final long j10) {
        String str;
        ArrayList arrayList2;
        long j11;
        final long j12;
        final org.telegram.messenger.jj jjVar;
        final org.telegram.messenger.jj jjVar2;
        org.telegram.ui.un unVar;
        org.telegram.messenger.oj ojVar;
        long j13;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.a;
        bi biVar = this.b;
        switch (i15) {
            case 13:
                org.telegram.ui.un unVar2 = (org.telegram.ui.un) biVar.W1;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (unVar2.n7()) {
                    org.telegram.messenger.oz c10 = org.telegram.messenger.oz.c(null, null, null, null, null, null, null, null, null, null, unVar2.j6, null, unVar2.D5, unVar2.l4, null, true, null, null, null, null, z10, i10, 0, 0, null, null, false, false);
                    c10.l = tL_messageMediaToDo;
                    c10.K = unVar2.P8();
                    c10.Q = j10;
                    c10.R = unVar2.a9();
                    c10.T = unVar2.w5;
                    unVar2.getSendMessagesHelper().r0(c10);
                    unVar2.F6();
                    break;
                }
                break;
            default:
                org.telegram.ui.un unVar3 = (org.telegram.ui.un) biVar.W1;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (unVar3.n7()) {
                    long nextLong = Utilities.b.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        ArrayList W = unVar3.getMediaDataController().W(charSequenceArr, true, true);
                        str = charSequenceArr[0].toString();
                        arrayList2 = W;
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    final ih.i iVar = new ih.i(gVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList);
                    final org.telegram.messenger.c accountInstance = unVar3.getAccountInstance();
                    long j14 = unVar3.j6;
                    org.telegram.messenger.jj jjVar3 = unVar3.D5;
                    org.telegram.messenger.jj jjVar4 = unVar3.l4;
                    final org.telegram.ui.kn knVar = unVar3.B5;
                    final org.telegram.messenger.sw P8 = unVar3.P8();
                    final long a92 = unVar3.a9();
                    final org.telegram.messenger.oj ojVar2 = unVar3.w5;
                    org.telegram.messenger.r5 r5Var = org.telegram.messenger.qz.I;
                    if (gVar != null) {
                        final ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        j12 = j14;
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        jjVar = jjVar3;
                        final int[] iArr = new int[1];
                        SparseArray sparseArray = gVar.a;
                        int size = sparseArray.size();
                        int i16 = 0;
                        while (i16 < size) {
                            int i17 = size;
                            ih.f fVar = (ih.f) sparseArray.valueAt(i16);
                            org.telegram.messenger.jj jjVar5 = jjVar4;
                            int keyAt = sparseArray.keyAt(i16);
                            SparseArray sparseArray2 = sparseArray;
                            if (fVar instanceof jh.i) {
                                arrayList9.add(((jh.i) fVar).b);
                                arrayList10.add(Integer.valueOf(keyAt));
                            } else if (fVar instanceof jh.d) {
                                org.telegram.messenger.pz pzVar = ((jh.d) fVar).c;
                                pzVar.B = keyAt;
                                arrayList3.add(pzVar);
                            } else if (fVar instanceof jh.c) {
                                jh.c cVar = (jh.c) fVar;
                                String str2 = cVar.b;
                                if (TextUtils.isEmpty(str2)) {
                                    Uri uri = cVar.c;
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
                            i16++;
                            size = i17;
                            sparseArray = sparseArray2;
                            jjVar4 = jjVar5;
                        }
                        jjVar2 = jjVar4;
                        if (arrayList3.isEmpty()) {
                            i11 = 0;
                        } else {
                            iArr[0] = iArr[0] + 1;
                            i11 = 1;
                        }
                        if (arrayList4.isEmpty() && arrayList7.isEmpty()) {
                            i13 = i11;
                            i12 = 1;
                        } else {
                            i12 = 1;
                            iArr[0] = iArr[0] + 1;
                            i13 = 1;
                        }
                        if (arrayList9.isEmpty()) {
                            i14 = i13;
                        } else {
                            iArr[0] = iArr[0] + i12;
                            i14 = i12;
                        }
                        int i18 = i12;
                        unVar = unVar3;
                        accountInstance = accountInstance;
                        final org.telegram.messenger.px pxVar = new org.telegram.messenger.px(arrayList4, arrayList7, accountInstance, arrayList5, j12, jjVar, jjVar2, knVar, z10, i10, P8, j10, a92, ojVar2, iVar, arrayList6, arrayList8);
                        P8 = P8;
                        Runnable runnable = new Runnable() { // from class: org.telegram.messenger.qx
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArrayList arrayList11 = arrayList3;
                                boolean isEmpty = arrayList11.isEmpty();
                                px pxVar2 = pxVar;
                                if (isEmpty) {
                                    pxVar2.run();
                                    return;
                                }
                                int[] iArr2 = iArr;
                                int i19 = iArr2[0] - 1;
                                iArr2[0] = i19;
                                qz.X(accountInstance, arrayList11, j12, jjVar, jjVar2, null, knVar, false, true, null, null, z10, i10, 0, false, null, P8, 0L, false, j10, a92, ojVar2, iVar, i19 > 0);
                                qz.I.c(new ms(pxVar2, 12));
                            }
                        };
                        iVar = iVar;
                        if (!arrayList9.isEmpty()) {
                            int i19 = iArr[0] - i18;
                            iArr[0] = i19;
                            j13 = a92;
                            ojVar = ojVar2;
                            org.telegram.messenger.ax axVar = new org.telegram.messenger.ax(iVar, arrayList9, j12, accountInstance, "", i19 > 0 ? i18 : 0, arrayList10, null, jjVar, jjVar2, z10, i10, 0, null, P8, 0L, false, j10, runnable);
                            iVar = iVar;
                            accountInstance = accountInstance;
                            P8 = P8;
                            j11 = j10;
                            new Thread(axVar).start();
                            break;
                        } else {
                            j11 = j10;
                            j13 = a92;
                            ojVar = ojVar2;
                            runnable.run();
                            break;
                        }
                    } else {
                        j11 = j10;
                        j12 = j14;
                        jjVar = jjVar3;
                        jjVar2 = jjVar4;
                        unVar = unVar3;
                        ojVar = ojVar2;
                        j13 = a92;
                    }
                    org.telegram.messenger.oz c11 = org.telegram.messenger.oz.c(null, null, null, null, null, null, null, null, iVar.a, null, j12, null, jjVar, jjVar2, null, true, null, null, null, null, z10, i10, 0, 0, null, null, false, false);
                    c11.b = iVar.d;
                    c11.L = true;
                    c11.w = iVar.e;
                    c11.K = P8;
                    c11.Q = j11;
                    c11.R = j13;
                    c11.T = ojVar;
                    c11.j = iVar;
                    org.telegram.messenger.qz.C(accountInstance.a).r0(c11);
                    unVar.F6();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        TLRPC.User user;
        if (!(view instanceof vh)) {
            return false;
        }
        vh vhVar = (vh) view;
        bi biVar = this.b;
        if (biVar.M1 || (user = vhVar.b) == null) {
            return false;
        }
        biVar.j1(vhVar.c, user);
        return true;
    }

    @Override // wg.c
    public int g(org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        switch (this.a) {
            case 5:
                float f7 = org.telegram.messenger.sc.e(262144) ? 0.85f : 0.76f;
                int w02 = org.telegram.ui.ActionBar.t6.w0(z10 ? org.telegram.ui.ActionBar.t6.a7 : org.telegram.ui.ActionBar.t6.i5, p6Var);
                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var);
                bi biVar = this.b;
                return biVar.g4 ? i0.b.f(0.75f, w03, biVar.h4) : w7.b9.n(f7, w02, w03);
            case 6:
                if (this.b.g4) {
                    return 0;
                }
                return z10 ? 687865855 : -1;
            case 7:
                if (this.b.g4) {
                    return 0;
                }
                return z10 ? 352321535 : -1;
            default:
                bi biVar2 = this.b;
                if (biVar2.g4) {
                    if (org.telegram.messenger.i0.B(biVar2.h4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        bi biVar = this.b;
        biVar.x4 = true;
        biVar.dismiss();
    }

    @Override // ei.n
    public void j(int i10) {
        bi biVar = this.b;
        tg.f fVar = biVar.z4;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (v7.u7.a(i10, 4)) {
            gi.a e = biVar.X0.e();
            e.b(biVar.b.getY(), biVar.b.getWidth(), biVar.b.getY() + biVar.b.getHeight());
            fVar.h(e);
        }
        fVar.e(biVar.D4, biVar.b.getWidth(), biVar.b.getHeight());
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void k(int i10) {
        this.b.R2.getActionBarMenuOnItemClick().b(i10);
    }

    @Override // org.telegram.ui.Components.ji
    public void l(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        bi biVar = this.b;
        ji jiVar = biVar.P1;
        if (jiVar != null) {
            jiVar.l(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (k2Var == null || !(k2Var instanceof org.telegram.ui.un)) {
            ai aiVar = biVar.T3;
            if (aiVar != null) {
                aiVar.b1(arrayList, charSequence, z10, i10, i11, j10, z11, j11);
                return;
            }
            return;
        }
        org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
        if (unVar.n7()) {
            unVar.u8(charSequence, null);
            org.telegram.messenger.c accountInstance = unVar.getAccountInstance();
            CharSequence charSequence2 = charSequence != null ? charSequence : null;
            long j12 = unVar.j6;
            org.telegram.messenger.jj jjVar = unVar.D5;
            org.telegram.messenger.jj jjVar2 = unVar.l4;
            org.telegram.messenger.jj jjVar3 = unVar.F5;
            org.telegram.messenger.sw P8 = unVar.P8();
            org.telegram.messenger.r5 r5Var = org.telegram.messenger.qz.I;
            new Thread(new org.telegram.messenger.ax(null, arrayList, j12, accountInstance, charSequence2, false, null, jjVar3, jjVar, jjVar2, z10, i10, i11, null, P8, j10, z11, j11, null)).start();
            unVar.F6();
        }
    }

    @Override // fe.l
    public /* synthetic */ void a() {
    }
}
