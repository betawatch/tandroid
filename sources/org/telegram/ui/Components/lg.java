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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements uk, org.telegram.ui.ActionBar.r1, te.i, dj0, oi.n, gh.d, oi.m, org.telegram.ui.ActionBar.m0, zm, s4, ji {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci b;

    public /* synthetic */ lg(ci ciVar, int i7) {
        this.a = i7;
        this.b = ciVar;
    }

    @Override // org.telegram.ui.Components.s4
    public void L(int i7, int i10, boolean z9) {
        boolean u12;
        switch (this.a) {
            case 14:
                ci ciVar = this.b;
                uh uhVar = ciVar.v2;
                if (uhVar != ciVar.d2 && uhVar != ciVar.k2) {
                    if (!uhVar.L(z9, i7, i10, 0L, ciVar.f1())) {
                        ciVar.A4 = true;
                        ciVar.dismiss();
                        break;
                    }
                } else {
                    ciVar.u1(z9, i7, 0, ciVar.K2, ciVar.f1());
                    break;
                }
                break;
            default:
                ci ciVar2 = this.b;
                te teVar = ciVar2.b2;
                long j3 = teVar != null ? teVar.j() : 0L;
                kh khVar = ciVar2.F2;
                ciVar2.K2 = j3;
                khVar.setEffect(j3);
                uh uhVar2 = ciVar2.v2;
                if (uhVar2 == ciVar2.d2 || uhVar2 == ciVar2.k2) {
                    u12 = ciVar2.u1(z9, i7, i10, j3, ciVar2.f1());
                } else {
                    if (!uhVar2.L(z9, i7, i10, j3, ciVar2.f1())) {
                        ciVar2.dismiss();
                    }
                    u12 = false;
                }
                te teVar2 = ciVar2.b2;
                if (teVar2 != null) {
                    teVar2.g(!u12);
                    ciVar2.b2 = null;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e9, code lost:
    
        if (r24 != 0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.zm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(TLRPC.MessageMedia messageMedia, Editable editable, sh.e eVar, ArrayList arrayList, final boolean z9, final int i7, final long j3) {
        String str;
        ArrayList arrayList2;
        long j10;
        final long j11;
        final org.telegram.messenger.ij ijVar;
        final org.telegram.messenger.ij ijVar2;
        org.telegram.ui.cn cnVar;
        org.telegram.messenger.nj njVar;
        long j12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.a;
        ci ciVar = this.b;
        switch (i14) {
            case 13:
                org.telegram.ui.cn cnVar2 = (org.telegram.ui.cn) ciVar.Z1;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (cnVar2.u7()) {
                    org.telegram.messenger.ez c10 = org.telegram.messenger.ez.c(null, null, null, null, null, null, null, null, null, null, cnVar2.j6, null, cnVar2.D5, cnVar2.l4, null, true, null, null, null, null, z9, i7, 0, 0, null, null, false, false);
                    c10.l = tL_messageMediaToDo;
                    c10.K = cnVar2.X8();
                    c10.Q = j3;
                    c10.R = cnVar2.i9();
                    c10.T = cnVar2.w5;
                    cnVar2.getSendMessagesHelper().r0(c10);
                    cnVar2.L6();
                    break;
                }
                break;
            default:
                org.telegram.ui.cn cnVar3 = (org.telegram.ui.cn) ciVar.Z1;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (cnVar3.u7()) {
                    long nextLong = Utilities.b.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        ArrayList W = cnVar3.getMediaDataController().W(charSequenceArr, true, true);
                        str = charSequenceArr[0].toString();
                        arrayList2 = W;
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    final sh.g gVar = new sh.g(eVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList);
                    final org.telegram.messenger.c accountInstance = cnVar3.getAccountInstance();
                    long j13 = cnVar3.j6;
                    org.telegram.messenger.ij ijVar3 = cnVar3.D5;
                    org.telegram.messenger.ij ijVar4 = cnVar3.l4;
                    final org.telegram.ui.sm smVar = cnVar3.B5;
                    final org.telegram.messenger.hw X8 = cnVar3.X8();
                    final long i92 = cnVar3.i9();
                    final org.telegram.messenger.nj njVar2 = cnVar3.w5;
                    org.telegram.messenger.p5 p5Var = org.telegram.messenger.gz.I;
                    if (eVar != null) {
                        final ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        j11 = j13;
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        ijVar = ijVar3;
                        final int[] iArr = new int[1];
                        SparseArray sparseArray = eVar.a;
                        int size = sparseArray.size();
                        int i15 = 0;
                        while (i15 < size) {
                            int i16 = size;
                            sh.d dVar = (sh.d) sparseArray.valueAt(i15);
                            org.telegram.messenger.ij ijVar5 = ijVar4;
                            int keyAt = sparseArray.keyAt(i15);
                            SparseArray sparseArray2 = sparseArray;
                            if (dVar instanceof th.g) {
                                arrayList9.add(((th.g) dVar).b);
                                arrayList10.add(Integer.valueOf(keyAt));
                            } else if (dVar instanceof th.d) {
                                org.telegram.messenger.fz fzVar = ((th.d) dVar).c;
                                fzVar.B = keyAt;
                                arrayList3.add(fzVar);
                            } else if (dVar instanceof th.c) {
                                th.c cVar = (th.c) dVar;
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
                            i15++;
                            size = i16;
                            sparseArray = sparseArray2;
                            ijVar4 = ijVar5;
                        }
                        ijVar2 = ijVar4;
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
                        cnVar = cnVar3;
                        accountInstance = accountInstance;
                        final org.telegram.messenger.dx dxVar = new org.telegram.messenger.dx(arrayList4, arrayList7, accountInstance, arrayList5, j11, ijVar, ijVar2, smVar, z9, i7, X8, j3, i92, njVar2, gVar, arrayList6, arrayList8);
                        X8 = X8;
                        Runnable runnable = new Runnable() { // from class: org.telegram.messenger.ex
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArrayList arrayList11 = arrayList3;
                                boolean isEmpty = arrayList11.isEmpty();
                                dx dxVar2 = dxVar;
                                if (isEmpty) {
                                    dxVar2.run();
                                    return;
                                }
                                int[] iArr2 = iArr;
                                int i18 = iArr2[0] - 1;
                                iArr2[0] = i18;
                                gz.X(accountInstance, arrayList11, j11, ijVar, ijVar2, null, smVar, false, true, null, null, z9, i7, 0, false, null, X8, 0L, false, j3, i92, njVar2, gVar, i18 > 0);
                                gz.I.c(new ds(dxVar2, 11));
                            }
                        };
                        gVar = gVar;
                        if (!arrayList9.isEmpty()) {
                            int i18 = iArr[0] - i17;
                            iArr[0] = i18;
                            j12 = i92;
                            njVar = njVar2;
                            org.telegram.messenger.ow owVar = new org.telegram.messenger.ow(gVar, arrayList9, j11, accountInstance, "", i18 > 0 ? i17 : 0, arrayList10, null, ijVar, ijVar2, z9, i7, 0, null, X8, 0L, false, j3, runnable);
                            gVar = gVar;
                            accountInstance = accountInstance;
                            X8 = X8;
                            j10 = j3;
                            new Thread(owVar).start();
                            break;
                        } else {
                            j10 = j3;
                            j12 = i92;
                            njVar = njVar2;
                            runnable.run();
                            break;
                        }
                    } else {
                        j10 = j3;
                        j11 = j13;
                        ijVar = ijVar3;
                        ijVar2 = ijVar4;
                        cnVar = cnVar3;
                        njVar = njVar2;
                        j12 = i92;
                    }
                    org.telegram.messenger.ez c11 = org.telegram.messenger.ez.c(null, null, null, null, null, null, null, null, gVar.a, null, j11, null, ijVar, ijVar2, null, true, null, null, null, null, z9, i7, 0, 0, null, null, false, false);
                    c11.b = gVar.d;
                    c11.L = true;
                    c11.w = gVar.e;
                    c11.K = X8;
                    c11.Q = j10;
                    c11.R = j12;
                    c11.T = njVar;
                    c11.j = gVar;
                    org.telegram.messenger.gz.C(accountInstance.a).r0(c11);
                    cnVar.L6();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        TLRPC.User user;
        if (!(view instanceof vh)) {
            return false;
        }
        vh vhVar = (vh) view;
        ci ciVar = this.b;
        if (ciVar.P1 || (user = vhVar.b) == null) {
            return false;
        }
        ciVar.k1(vhVar.c, user);
        return true;
    }

    @Override // org.telegram.ui.Components.uk
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.cn) this.b.Z1).d(messageMedia, i7, z9, i10, 0L);
                break;
            case 12:
                ((org.telegram.ui.cn) this.b.Z1).d(messageMedia, i7, z9, i10, j3);
                break;
            default:
                ((org.telegram.ui.cn) this.b.Z1).d(messageMedia, i7, z9, i10, j3);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ji
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        ci ciVar = this.b;
        ji jiVar = ciVar.S1;
        if (jiVar != null) {
            jiVar.e(arrayList, charSequence, z9, i7, i10, j3, z10, j10);
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
        if (f2Var == null || !(f2Var instanceof org.telegram.ui.cn)) {
            ai aiVar = ciVar.W3;
            if (aiVar != null) {
                aiVar.M1(arrayList, charSequence, z9, i7, i10, j3, z10, j10);
                return;
            }
            return;
        }
        org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var;
        if (cnVar.u7()) {
            cnVar.C8(charSequence, null);
            org.telegram.messenger.c accountInstance = cnVar.getAccountInstance();
            CharSequence charSequence2 = charSequence != null ? charSequence : null;
            long j11 = cnVar.j6;
            org.telegram.messenger.ij ijVar = cnVar.D5;
            org.telegram.messenger.ij ijVar2 = cnVar.l4;
            org.telegram.messenger.ij ijVar3 = cnVar.F5;
            org.telegram.messenger.hw X8 = cnVar.X8();
            org.telegram.messenger.p5 p5Var = org.telegram.messenger.gz.I;
            new Thread(new org.telegram.messenger.ow(null, arrayList, j11, accountInstance, charSequence2, false, null, ijVar3, ijVar, ijVar2, z9, i7, i10, null, X8, j3, z10, j10, null)).start();
            cnVar.L6();
        }
    }

    @Override // te.i
    public void f(te.j jVar) {
        this.b.i1();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ci ciVar = this.b;
        ciVar.A4 = true;
        ciVar.dismiss();
    }

    @Override // oi.n
    public int h() {
        ci ciVar = this.b;
        ciVar.getClass();
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, ciVar.I0);
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void i(int i7) {
        this.b.U2.getActionBarMenuOnItemClick().b(i7);
    }

    @Override // gh.d
    public int k(org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        switch (this.a) {
            case 5:
                float f10 = org.telegram.messenger.sc.e(262144) ? 0.85f : 0.76f;
                int w02 = org.telegram.ui.ActionBar.m6.w0(z9 ? org.telegram.ui.ActionBar.m6.a7 : org.telegram.ui.ActionBar.m6.i5, h6Var);
                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var);
                ci ciVar = this.b;
                return ciVar.j4 ? i0.a.f(0.75f, w03, ciVar.k4) : c8.g0.m(f10, w02, w03);
            case 6:
                if (this.b.j4) {
                    return 0;
                }
                return z9 ? 687865855 : -1;
            case 7:
                if (this.b.j4) {
                    return 0;
                }
                return z9 ? 352321535 : -1;
            default:
                ci ciVar2 = this.b;
                if (ciVar2.j4) {
                    if (org.telegram.messenger.g0.B(ciVar2.k4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z9) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // oi.m
    public void l(int i7) {
        ci ciVar = this.b;
        dh.g gVar = ciVar.C4;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.zc.a(i7, 4)) {
            qi.a e10 = ciVar.X0.e();
            e10.b(ciVar.b.getY(), ciVar.b.getWidth(), ciVar.b.getY() + ciVar.b.getHeight());
            gVar.h(e10);
        }
        gVar.e(ciVar.G4, ciVar.b.getWidth(), ciVar.b.getHeight());
    }

    @Override // te.i
    public /* synthetic */ void a() {
    }
}
