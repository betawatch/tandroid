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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg implements cl, org.telegram.ui.ActionBar.q1, te.i, ij0, ri.n, gh.d, ri.m, org.telegram.ui.ActionBar.l0, in, r4, si {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki b;

    public /* synthetic */ sg(ki kiVar, int i7) {
        this.a = i7;
        this.b = kiVar;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        boolean u12;
        switch (this.a) {
            case 14:
                ki kiVar = this.b;
                ci ciVar = kiVar.w2;
                if (ciVar != kiVar.e2 && ciVar != kiVar.l2) {
                    if (!ciVar.M(z10, i7, i10, 0L, kiVar.f1())) {
                        kiVar.B4 = true;
                        kiVar.dismiss();
                        break;
                    }
                } else {
                    kiVar.u1(z10, i7, 0, kiVar.L2, kiVar.f1());
                    break;
                }
                break;
            default:
                ki kiVar2 = this.b;
                ue ueVar = kiVar2.c2;
                long k10 = ueVar != null ? ueVar.k() : 0L;
                sh shVar = kiVar2.G2;
                kiVar2.L2 = k10;
                shVar.setEffect(k10);
                ci ciVar2 = kiVar2.w2;
                if (ciVar2 == kiVar2.e2 || ciVar2 == kiVar2.l2) {
                    u12 = kiVar2.u1(z10, i7, i10, k10, kiVar2.f1());
                } else {
                    if (!ciVar2.M(z10, i7, i10, k10, kiVar2.f1())) {
                        kiVar2.dismiss();
                    }
                    u12 = false;
                }
                ue ueVar2 = kiVar2.c2;
                if (ueVar2 != null) {
                    ueVar2.h(!u12);
                    kiVar2.c2 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        TLRPC.User user;
        if (!(view instanceof di)) {
            return false;
        }
        di diVar = (di) view;
        ki kiVar = this.b;
        if (kiVar.Q1 || (user = diVar.b) == null) {
            return false;
        }
        kiVar.k1(diVar.c, user);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e9, code lost:
    
        if (r24 != 0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.in
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(TLRPC.MessageMedia messageMedia, Editable editable, sh.d dVar, ArrayList arrayList, final boolean z10, final int i7, final long j3) {
        String str;
        ArrayList arrayList2;
        long j10;
        final long j11;
        final org.telegram.messenger.gj gjVar;
        final org.telegram.messenger.gj gjVar2;
        org.telegram.ui.an anVar;
        org.telegram.messenger.lj ljVar;
        long j12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.a;
        ki kiVar = this.b;
        switch (i14) {
            case 13:
                org.telegram.ui.an anVar2 = (org.telegram.ui.an) kiVar.a2;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (anVar2.u7()) {
                    org.telegram.messenger.cz c10 = org.telegram.messenger.cz.c(null, null, null, null, null, null, null, null, null, null, anVar2.k6, null, anVar2.E5, anVar2.m4, null, true, null, null, null, null, z10, i7, 0, 0, null, null, false, false);
                    c10.l = tL_messageMediaToDo;
                    c10.K = anVar2.Y8();
                    c10.Q = j3;
                    c10.R = anVar2.j9();
                    c10.T = anVar2.x5;
                    anVar2.getSendMessagesHelper().r0(c10);
                    anVar2.L6();
                    break;
                }
                break;
            default:
                org.telegram.ui.an anVar3 = (org.telegram.ui.an) kiVar.a2;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (anVar3.u7()) {
                    long nextLong = Utilities.b.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        ArrayList W = anVar3.getMediaDataController().W(charSequenceArr, true, true);
                        str = charSequenceArr[0].toString();
                        arrayList2 = W;
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    final sh.f fVar = new sh.f(dVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList);
                    final org.telegram.messenger.c accountInstance = anVar3.getAccountInstance();
                    long j13 = anVar3.k6;
                    org.telegram.messenger.gj gjVar3 = anVar3.E5;
                    org.telegram.messenger.gj gjVar4 = anVar3.m4;
                    final org.telegram.ui.qm qmVar = anVar3.C5;
                    final org.telegram.messenger.fw Y8 = anVar3.Y8();
                    final long j92 = anVar3.j9();
                    final org.telegram.messenger.lj ljVar2 = anVar3.x5;
                    org.telegram.messenger.p5 p5Var = org.telegram.messenger.ez.J;
                    if (dVar != null) {
                        final ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        j11 = j13;
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        gjVar = gjVar3;
                        final int[] iArr = new int[1];
                        SparseArray sparseArray = dVar.a;
                        int size = sparseArray.size();
                        int i15 = 0;
                        while (i15 < size) {
                            int i16 = size;
                            sh.c cVar = (sh.c) sparseArray.valueAt(i15);
                            org.telegram.messenger.gj gjVar5 = gjVar4;
                            int keyAt = sparseArray.keyAt(i15);
                            SparseArray sparseArray2 = sparseArray;
                            if (cVar instanceof th.g) {
                                arrayList9.add(((th.g) cVar).b);
                                arrayList10.add(Integer.valueOf(keyAt));
                            } else if (cVar instanceof th.d) {
                                org.telegram.messenger.dz dzVar = ((th.d) cVar).c;
                                dzVar.B = keyAt;
                                arrayList3.add(dzVar);
                            } else if (cVar instanceof th.c) {
                                th.c cVar2 = (th.c) cVar;
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
                            gjVar4 = gjVar5;
                        }
                        gjVar2 = gjVar4;
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
                        anVar = anVar3;
                        accountInstance = accountInstance;
                        final org.telegram.messenger.bx bxVar = new org.telegram.messenger.bx(arrayList4, arrayList7, accountInstance, arrayList5, j11, gjVar, gjVar2, qmVar, z10, i7, Y8, j3, j92, ljVar2, fVar, arrayList6, arrayList8);
                        Y8 = Y8;
                        Runnable runnable = new Runnable() { // from class: org.telegram.messenger.cx
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArrayList arrayList11 = arrayList3;
                                boolean isEmpty = arrayList11.isEmpty();
                                bx bxVar2 = bxVar;
                                if (isEmpty) {
                                    bxVar2.run();
                                    return;
                                }
                                int[] iArr2 = iArr;
                                int i18 = iArr2[0] - 1;
                                iArr2[0] = i18;
                                ez.X(accountInstance, arrayList11, j11, gjVar, gjVar2, null, qmVar, false, true, null, null, z10, i7, 0, false, null, Y8, 0L, false, j3, j92, ljVar2, fVar, i18 > 0);
                                ez.J.c(new as(bxVar2, 11));
                            }
                        };
                        fVar = fVar;
                        if (!arrayList9.isEmpty()) {
                            int i18 = iArr[0] - i17;
                            iArr[0] = i18;
                            j12 = j92;
                            ljVar = ljVar2;
                            org.telegram.messenger.mw mwVar = new org.telegram.messenger.mw(fVar, arrayList9, j11, accountInstance, "", i18 > 0 ? i17 : 0, arrayList10, null, gjVar, gjVar2, z10, i7, 0, null, Y8, 0L, false, j3, runnable);
                            fVar = fVar;
                            accountInstance = accountInstance;
                            Y8 = Y8;
                            j10 = j3;
                            new Thread(mwVar).start();
                            break;
                        } else {
                            j10 = j3;
                            j12 = j92;
                            ljVar = ljVar2;
                            runnable.run();
                            break;
                        }
                    } else {
                        j10 = j3;
                        j11 = j13;
                        gjVar = gjVar3;
                        gjVar2 = gjVar4;
                        anVar = anVar3;
                        ljVar = ljVar2;
                        j12 = j92;
                    }
                    org.telegram.messenger.cz c11 = org.telegram.messenger.cz.c(null, null, null, null, null, null, null, null, fVar.a, null, j11, null, gjVar, gjVar2, null, true, null, null, null, null, z10, i7, 0, 0, null, null, false, false);
                    c11.b = fVar.d;
                    c11.L = true;
                    c11.w = fVar.e;
                    c11.K = Y8;
                    c11.Q = j10;
                    c11.R = j12;
                    c11.T = ljVar;
                    c11.j = fVar;
                    org.telegram.messenger.ez.C(accountInstance.a).r0(c11);
                    anVar.L6();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.cl
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.an) this.b.a2).d(messageMedia, i7, z10, i10, 0L);
                break;
            case 12:
                ((org.telegram.ui.an) this.b.a2).d(messageMedia, i7, z10, i10, j3);
                break;
            default:
                ((org.telegram.ui.an) this.b.a2).d(messageMedia, i7, z10, i10, j3);
                break;
        }
    }

    @Override // ri.n
    public int e() {
        ki kiVar = this.b;
        kiVar.getClass();
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, kiVar.J0);
    }

    @Override // te.i
    public void f(te.j jVar) {
        this.b.i1();
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void g(int i7) {
        this.b.V2.getActionBarMenuOnItemClick().b(i7);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ki kiVar = this.b;
        kiVar.B4 = true;
        kiVar.dismiss();
    }

    @Override // gh.d
    public int j(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        switch (this.a) {
            case 5:
                float f10 = org.telegram.messenger.qc.e(262144) ? 0.85f : 0.76f;
                int w02 = org.telegram.ui.ActionBar.j6.w0(z10 ? org.telegram.ui.ActionBar.j6.a7 : org.telegram.ui.ActionBar.j6.i5, e6Var);
                int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var);
                ki kiVar = this.b;
                return kiVar.k4 ? i0.a.f(0.75f, w03, kiVar.l4) : c8.g0.m(f10, w02, w03);
            case 6:
                if (this.b.k4) {
                    return 0;
                }
                return z10 ? 687865855 : -1;
            case 7:
                if (this.b.k4) {
                    return 0;
                }
                return z10 ? 352321535 : -1;
            default:
                ki kiVar2 = this.b;
                if (kiVar2.k4) {
                    if (org.telegram.messenger.g0.B(kiVar2.l4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // org.telegram.ui.Components.si
    public void k(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        ki kiVar = this.b;
        si siVar = kiVar.T1;
        if (siVar != null) {
            siVar.k(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
        if (e2Var == null || !(e2Var instanceof org.telegram.ui.an)) {
            ii iiVar = kiVar.X3;
            if (iiVar != null) {
                iiVar.b2(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
                return;
            }
            return;
        }
        org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var;
        if (anVar.u7()) {
            anVar.D8(charSequence, null);
            org.telegram.messenger.c accountInstance = anVar.getAccountInstance();
            CharSequence charSequence2 = charSequence != null ? charSequence : null;
            long j11 = anVar.k6;
            org.telegram.messenger.gj gjVar = anVar.E5;
            org.telegram.messenger.gj gjVar2 = anVar.m4;
            org.telegram.messenger.gj gjVar3 = anVar.G5;
            org.telegram.messenger.fw Y8 = anVar.Y8();
            org.telegram.messenger.p5 p5Var = org.telegram.messenger.ez.J;
            new Thread(new org.telegram.messenger.mw(null, arrayList, j11, accountInstance, charSequence2, false, null, gjVar3, gjVar, gjVar2, z10, i7, i10, null, Y8, j3, z11, j10, null)).start();
            anVar.L6();
        }
    }

    @Override // ri.m
    public void l(int i7) {
        ki kiVar = this.b;
        dh.g gVar = kiVar.D4;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.zc.a(i7, 4)) {
            ti.a e10 = kiVar.Y0.e();
            e10.b(kiVar.b.getY(), kiVar.b.getWidth(), kiVar.b.getY() + kiVar.b.getHeight());
            gVar.h(e10);
        }
        gVar.e(kiVar.H4, kiVar.b.getWidth(), kiVar.b.getHeight());
    }

    @Override // te.i
    public /* synthetic */ void a() {
    }
}
