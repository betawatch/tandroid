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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg implements vk, org.telegram.ui.ActionBar.r1, te.i, dj0, oi.n, gh.d, oi.m, org.telegram.ui.ActionBar.m0, an, t4, ki {
    public final /* synthetic */ int a;
    public final /* synthetic */ di b;

    public /* synthetic */ mg(di diVar, int i7) {
        this.a = i7;
        this.b = diVar;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        boolean u12;
        switch (this.a) {
            case 14:
                di diVar = this.b;
                vh vhVar = diVar.s2;
                if (vhVar != diVar.a2 && vhVar != diVar.h2) {
                    if (!vhVar.L(z9, i7, i10, 0L, diVar.f1())) {
                        diVar.x4 = true;
                        diVar.dismiss();
                        break;
                    }
                } else {
                    diVar.u1(z9, i7, 0, diVar.H2, diVar.f1());
                    break;
                }
                break;
            default:
                di diVar2 = this.b;
                ue ueVar = diVar2.Y1;
                long j3 = ueVar != null ? ueVar.j() : 0L;
                lh lhVar = diVar2.C2;
                diVar2.H2 = j3;
                lhVar.setEffect(j3);
                vh vhVar2 = diVar2.s2;
                if (vhVar2 == diVar2.a2 || vhVar2 == diVar2.h2) {
                    u12 = diVar2.u1(z9, i7, i10, j3, diVar2.f1());
                } else {
                    if (!vhVar2.L(z9, i7, i10, j3, diVar2.f1())) {
                        diVar2.dismiss();
                    }
                    u12 = false;
                }
                ue ueVar2 = diVar2.Y1;
                if (ueVar2 != null) {
                    ueVar2.g(!u12);
                    diVar2.Y1 = null;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e9, code lost:
    
        if (r24 != 0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.an
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(TLRPC.MessageMedia messageMedia, Editable editable, sh.d dVar, ArrayList arrayList, final boolean z9, final int i7, final long j3) {
        String str;
        ArrayList arrayList2;
        long j10;
        final long j11;
        final org.telegram.messenger.ij ijVar;
        final org.telegram.messenger.ij ijVar2;
        org.telegram.ui.an anVar;
        org.telegram.messenger.nj njVar;
        long j12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.a;
        di diVar = this.b;
        switch (i14) {
            case 13:
                org.telegram.ui.an anVar2 = (org.telegram.ui.an) diVar.W1;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (anVar2.t7()) {
                    org.telegram.messenger.ez c10 = org.telegram.messenger.ez.c(null, null, null, null, null, null, null, null, null, null, anVar2.j6, null, anVar2.D5, anVar2.l4, null, true, null, null, null, null, z9, i7, 0, 0, null, null, false, false);
                    c10.l = tL_messageMediaToDo;
                    c10.K = anVar2.W8();
                    c10.Q = j3;
                    c10.R = anVar2.h9();
                    c10.T = anVar2.w5;
                    anVar2.getSendMessagesHelper().r0(c10);
                    anVar2.K6();
                    break;
                }
                break;
            default:
                org.telegram.ui.an anVar3 = (org.telegram.ui.an) diVar.W1;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (anVar3.t7()) {
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
                    long j13 = anVar3.j6;
                    org.telegram.messenger.ij ijVar3 = anVar3.D5;
                    org.telegram.messenger.ij ijVar4 = anVar3.l4;
                    final org.telegram.ui.qm qmVar = anVar3.B5;
                    final org.telegram.messenger.hw W8 = anVar3.W8();
                    final long h92 = anVar3.h9();
                    final org.telegram.messenger.nj njVar2 = anVar3.w5;
                    org.telegram.messenger.p5 p5Var = org.telegram.messenger.gz.I;
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
                        ijVar = ijVar3;
                        final int[] iArr = new int[1];
                        SparseArray sparseArray = dVar.a;
                        int size = sparseArray.size();
                        int i15 = 0;
                        while (i15 < size) {
                            int i16 = size;
                            sh.c cVar = (sh.c) sparseArray.valueAt(i15);
                            org.telegram.messenger.ij ijVar5 = ijVar4;
                            int keyAt = sparseArray.keyAt(i15);
                            SparseArray sparseArray2 = sparseArray;
                            if (cVar instanceof th.g) {
                                arrayList9.add(((th.g) cVar).b);
                                arrayList10.add(Integer.valueOf(keyAt));
                            } else if (cVar instanceof th.d) {
                                org.telegram.messenger.fz fzVar = ((th.d) cVar).c;
                                fzVar.B = keyAt;
                                arrayList3.add(fzVar);
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
                        anVar = anVar3;
                        accountInstance = accountInstance;
                        final org.telegram.messenger.ex exVar = new org.telegram.messenger.ex(arrayList4, arrayList7, accountInstance, arrayList5, j11, ijVar, ijVar2, qmVar, z9, i7, W8, j3, h92, njVar2, fVar, arrayList6, arrayList8);
                        W8 = W8;
                        Runnable runnable = new Runnable() { // from class: org.telegram.messenger.fx
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArrayList arrayList11 = arrayList3;
                                boolean isEmpty = arrayList11.isEmpty();
                                ex exVar2 = exVar;
                                if (isEmpty) {
                                    exVar2.run();
                                    return;
                                }
                                int[] iArr2 = iArr;
                                int i18 = iArr2[0] - 1;
                                iArr2[0] = i18;
                                gz.X(accountInstance, arrayList11, j11, ijVar, ijVar2, null, qmVar, false, true, null, null, z9, i7, 0, false, null, W8, 0L, false, j3, h92, njVar2, fVar, i18 > 0);
                                gz.I.c(new ds(exVar2, 11));
                            }
                        };
                        fVar = fVar;
                        if (!arrayList9.isEmpty()) {
                            int i18 = iArr[0] - i17;
                            iArr[0] = i18;
                            j12 = h92;
                            njVar = njVar2;
                            org.telegram.messenger.pw pwVar = new org.telegram.messenger.pw(fVar, arrayList9, j11, accountInstance, "", i18 > 0 ? i17 : 0, arrayList10, null, ijVar, ijVar2, z9, i7, 0, null, W8, 0L, false, j3, runnable);
                            fVar = fVar;
                            accountInstance = accountInstance;
                            W8 = W8;
                            j10 = j3;
                            new Thread(pwVar).start();
                            break;
                        } else {
                            j10 = j3;
                            j12 = h92;
                            njVar = njVar2;
                            runnable.run();
                            break;
                        }
                    } else {
                        j10 = j3;
                        j11 = j13;
                        ijVar = ijVar3;
                        ijVar2 = ijVar4;
                        anVar = anVar3;
                        njVar = njVar2;
                        j12 = h92;
                    }
                    org.telegram.messenger.ez c11 = org.telegram.messenger.ez.c(null, null, null, null, null, null, null, null, fVar.a, null, j11, null, ijVar, ijVar2, null, true, null, null, null, null, z9, i7, 0, 0, null, null, false, false);
                    c11.b = fVar.d;
                    c11.L = true;
                    c11.w = fVar.e;
                    c11.K = W8;
                    c11.Q = j10;
                    c11.R = j12;
                    c11.T = njVar;
                    c11.j = fVar;
                    org.telegram.messenger.gz.C(accountInstance.a).r0(c11);
                    anVar.K6();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        TLRPC.User user;
        if (!(view instanceof wh)) {
            return false;
        }
        wh whVar = (wh) view;
        di diVar = this.b;
        if (diVar.M1 || (user = whVar.b) == null) {
            return false;
        }
        diVar.k1(whVar.c, user);
        return true;
    }

    @Override // org.telegram.ui.Components.vk
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.an) this.b.W1).d(messageMedia, i7, z9, i10, 0L);
                break;
            case 12:
                ((org.telegram.ui.an) this.b.W1).d(messageMedia, i7, z9, i10, j3);
                break;
            default:
                ((org.telegram.ui.an) this.b.W1).d(messageMedia, i7, z9, i10, j3);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ki
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        di diVar = this.b;
        ki kiVar = diVar.P1;
        if (kiVar != null) {
            kiVar.e(arrayList, charSequence, z9, i7, i10, j3, z10, j10);
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if (f2Var == null || !(f2Var instanceof org.telegram.ui.an)) {
            bi biVar = diVar.T3;
            if (biVar != null) {
                biVar.M1(arrayList, charSequence, z9, i7, i10, j3, z10, j10);
                return;
            }
            return;
        }
        org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var;
        if (anVar.t7()) {
            anVar.B8(charSequence, null);
            org.telegram.messenger.c accountInstance = anVar.getAccountInstance();
            CharSequence charSequence2 = charSequence != null ? charSequence : null;
            long j11 = anVar.j6;
            org.telegram.messenger.ij ijVar = anVar.D5;
            org.telegram.messenger.ij ijVar2 = anVar.l4;
            org.telegram.messenger.ij ijVar3 = anVar.F5;
            org.telegram.messenger.hw W8 = anVar.W8();
            org.telegram.messenger.p5 p5Var = org.telegram.messenger.gz.I;
            new Thread(new org.telegram.messenger.pw(null, arrayList, j11, accountInstance, charSequence2, false, null, ijVar3, ijVar, ijVar2, z9, i7, i10, null, W8, j3, z10, j10, null)).start();
            anVar.K6();
        }
    }

    @Override // te.i
    public void f(te.j jVar) {
        this.b.i1();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        di diVar = this.b;
        diVar.x4 = true;
        diVar.dismiss();
    }

    @Override // oi.n
    public int h() {
        di diVar = this.b;
        diVar.getClass();
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, diVar.I0);
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void i(int i7) {
        this.b.R2.getActionBarMenuOnItemClick().b(i7);
    }

    @Override // gh.d
    public int k(org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        switch (this.a) {
            case 5:
                float f10 = org.telegram.messenger.rc.e(262144) ? 0.85f : 0.76f;
                int w02 = org.telegram.ui.ActionBar.k6.w0(z9 ? org.telegram.ui.ActionBar.k6.a7 : org.telegram.ui.ActionBar.k6.i5, f6Var);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, f6Var);
                di diVar = this.b;
                return diVar.g4 ? i0.a.f(0.75f, w03, diVar.h4) : c8.g0.n(f10, w02, w03);
            case 6:
                if (this.b.g4) {
                    return 0;
                }
                return z9 ? 687865855 : -1;
            case 7:
                if (this.b.g4) {
                    return 0;
                }
                return z9 ? 352321535 : -1;
            default:
                di diVar2 = this.b;
                if (diVar2.g4) {
                    if (org.telegram.messenger.g0.B(diVar2.h4) <= 0.72f) {
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
        di diVar = this.b;
        dh.g gVar = diVar.z4;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.zc.a(i7, 4)) {
            qi.a e10 = diVar.X0.e();
            e10.b(diVar.b.getY(), diVar.b.getWidth(), diVar.b.getY() + diVar.b.getHeight());
            gVar.h(e10);
        }
        gVar.e(diVar.D4, diVar.b.getWidth(), diVar.b.getHeight());
    }

    @Override // te.i
    public /* synthetic */ void a() {
    }
}
