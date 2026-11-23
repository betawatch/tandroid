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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements ll, org.telegram.ui.ActionBar.q1, te.i, sj0, ri.n, gh.d, ri.m, org.telegram.ui.ActionBar.l0, sn, a5, bj {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;

    public /* synthetic */ dh(ui uiVar, int i7) {
        this.a = i7;
        this.b = uiVar;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        boolean v12;
        switch (this.a) {
            case 14:
                ui uiVar = this.b;
                mi miVar = uiVar.w2;
                if (miVar != uiVar.e2 && miVar != uiVar.l2) {
                    if (!miVar.M(z10, i7, i10, 0L, uiVar.g1())) {
                        uiVar.B4 = true;
                        uiVar.dismiss();
                        break;
                    }
                } else {
                    uiVar.v1(z10, i7, 0, uiVar.L2, uiVar.g1());
                    break;
                }
                break;
            default:
                ui uiVar2 = this.b;
                df dfVar = uiVar2.c2;
                long k10 = dfVar != null ? dfVar.k() : 0L;
                ci ciVar = uiVar2.G2;
                uiVar2.L2 = k10;
                ciVar.setEffect(k10);
                mi miVar2 = uiVar2.w2;
                if (miVar2 == uiVar2.e2 || miVar2 == uiVar2.l2) {
                    v12 = uiVar2.v1(z10, i7, i10, k10, uiVar2.g1());
                } else {
                    if (!miVar2.M(z10, i7, i10, k10, uiVar2.g1())) {
                        uiVar2.dismiss();
                    }
                    v12 = false;
                }
                df dfVar2 = uiVar2.c2;
                if (dfVar2 != null) {
                    dfVar2.h(!v12);
                    uiVar2.c2 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.bn) this.b.a2).b(messageMedia, i7, z10, i10, 0L);
                break;
            case 12:
                ((org.telegram.ui.bn) this.b.a2).b(messageMedia, i7, z10, i10, j3);
                break;
            default:
                ((org.telegram.ui.bn) this.b.a2).b(messageMedia, i7, z10, i10, j3);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        TLRPC.User user;
        if (!(view instanceof ni)) {
            return false;
        }
        ni niVar = (ni) view;
        ui uiVar = this.b;
        if (uiVar.Q1 || (user = niVar.b) == null) {
            return false;
        }
        uiVar.l1(niVar.c, user);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e9, code lost:
    
        if (r24 != 0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.sn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(TLRPC.MessageMedia messageMedia, Editable editable, sh.d dVar, ArrayList arrayList, final boolean z10, final int i7, final long j3) {
        String str;
        ArrayList arrayList2;
        long j10;
        final long j11;
        final org.telegram.messenger.gj gjVar;
        final org.telegram.messenger.gj gjVar2;
        org.telegram.ui.bn bnVar;
        org.telegram.messenger.lj ljVar;
        long j12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.a;
        ui uiVar = this.b;
        switch (i14) {
            case 13:
                org.telegram.ui.bn bnVar2 = (org.telegram.ui.bn) uiVar.a2;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (bnVar2.u7()) {
                    org.telegram.messenger.yy c10 = org.telegram.messenger.yy.c(null, null, null, null, null, null, null, null, null, null, bnVar2.l6, null, bnVar2.F5, bnVar2.m4, null, true, null, null, null, null, z10, i7, 0, 0, null, null, false, false);
                    c10.l = tL_messageMediaToDo;
                    c10.K = bnVar2.Y8();
                    c10.Q = j3;
                    c10.R = bnVar2.j9();
                    c10.T = bnVar2.y5;
                    bnVar2.getSendMessagesHelper().r0(c10);
                    bnVar2.L6();
                    break;
                }
                break;
            default:
                org.telegram.ui.bn bnVar3 = (org.telegram.ui.bn) uiVar.a2;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (bnVar3.u7()) {
                    long nextLong = Utilities.b.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        ArrayList Y = bnVar3.getMediaDataController().Y(charSequenceArr, true, true);
                        str = charSequenceArr[0].toString();
                        arrayList2 = Y;
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    final sh.f fVar = new sh.f(dVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList);
                    final org.telegram.messenger.c accountInstance = bnVar3.getAccountInstance();
                    long j13 = bnVar3.l6;
                    org.telegram.messenger.gj gjVar3 = bnVar3.F5;
                    org.telegram.messenger.gj gjVar4 = bnVar3.m4;
                    final org.telegram.ui.rm rmVar = bnVar3.D5;
                    final org.telegram.messenger.cw Y8 = bnVar3.Y8();
                    final long j92 = bnVar3.j9();
                    final org.telegram.messenger.lj ljVar2 = bnVar3.y5;
                    org.telegram.messenger.q5 q5Var = org.telegram.messenger.az.J;
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
                                org.telegram.messenger.zy zyVar = ((th.d) cVar).c;
                                zyVar.B = keyAt;
                                arrayList3.add(zyVar);
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
                        bnVar = bnVar3;
                        accountInstance = accountInstance;
                        final org.telegram.messenger.xw xwVar = new org.telegram.messenger.xw(arrayList4, arrayList7, accountInstance, arrayList5, j11, gjVar, gjVar2, rmVar, z10, i7, Y8, j3, j92, ljVar2, fVar, arrayList6, arrayList8);
                        Y8 = Y8;
                        Runnable runnable = new Runnable() { // from class: org.telegram.messenger.yw
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArrayList arrayList11 = arrayList3;
                                boolean isEmpty = arrayList11.isEmpty();
                                xw xwVar2 = xwVar;
                                if (isEmpty) {
                                    xwVar2.run();
                                    return;
                                }
                                int[] iArr2 = iArr;
                                int i18 = iArr2[0] - 1;
                                iArr2[0] = i18;
                                az.X(accountInstance, arrayList11, j11, gjVar, gjVar2, null, rmVar, false, true, null, null, z10, i7, 0, false, null, Y8, 0L, false, j3, j92, ljVar2, fVar, i18 > 0);
                                az.J.c(new yr(xwVar2, 11));
                            }
                        };
                        fVar = fVar;
                        if (!arrayList9.isEmpty()) {
                            int i18 = iArr[0] - i17;
                            iArr[0] = i18;
                            j12 = j92;
                            ljVar = ljVar2;
                            org.telegram.messenger.jw jwVar = new org.telegram.messenger.jw(fVar, arrayList9, j11, accountInstance, "", i18 > 0 ? i17 : 0, arrayList10, null, gjVar, gjVar2, z10, i7, 0, null, Y8, 0L, false, j3, runnable);
                            fVar = fVar;
                            accountInstance = accountInstance;
                            Y8 = Y8;
                            j10 = j3;
                            new Thread(jwVar).start();
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
                        bnVar = bnVar3;
                        ljVar = ljVar2;
                        j12 = j92;
                    }
                    org.telegram.messenger.yy c11 = org.telegram.messenger.yy.c(null, null, null, null, null, null, null, null, fVar.a, null, j11, null, gjVar, gjVar2, null, true, null, null, null, null, z10, i7, 0, 0, null, null, false, false);
                    c11.b = fVar.d;
                    c11.L = true;
                    c11.w = fVar.e;
                    c11.K = Y8;
                    c11.Q = j10;
                    c11.R = j12;
                    c11.T = ljVar;
                    c11.j = fVar;
                    org.telegram.messenger.az.C(accountInstance.a).r0(c11);
                    bnVar.L6();
                    break;
                }
                break;
        }
    }

    @Override // ri.n
    public int e() {
        ui uiVar = this.b;
        uiVar.getClass();
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, uiVar.J0);
    }

    @Override // te.i
    public void f(te.j jVar) {
        this.b.j1();
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void g(int i7) {
        this.b.V2.getActionBarMenuOnItemClick().b(i7);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ui uiVar = this.b;
        uiVar.B4 = true;
        uiVar.dismiss();
    }

    @Override // org.telegram.ui.Components.bj
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        ui uiVar = this.b;
        bj bjVar = uiVar.T1;
        if (bjVar != null) {
            bjVar.i(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
        if (g2Var == null || !(g2Var instanceof org.telegram.ui.bn)) {
            si siVar = uiVar.X3;
            if (siVar != null) {
                siVar.b2(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
                return;
            }
            return;
        }
        org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
        if (bnVar.u7()) {
            bnVar.D8(charSequence, null);
            org.telegram.messenger.c accountInstance = bnVar.getAccountInstance();
            CharSequence charSequence2 = charSequence != null ? charSequence : null;
            long j11 = bnVar.l6;
            org.telegram.messenger.gj gjVar = bnVar.F5;
            org.telegram.messenger.gj gjVar2 = bnVar.m4;
            org.telegram.messenger.gj gjVar3 = bnVar.H5;
            org.telegram.messenger.cw Y8 = bnVar.Y8();
            org.telegram.messenger.q5 q5Var = org.telegram.messenger.az.J;
            new Thread(new org.telegram.messenger.jw(null, arrayList, j11, accountInstance, charSequence2, false, null, gjVar3, gjVar, gjVar2, z10, i7, i10, null, Y8, j3, z11, j10, null)).start();
            bnVar.L6();
        }
    }

    @Override // gh.d
    public int j(org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        switch (this.a) {
            case 5:
                float f10 = org.telegram.messenger.qc.e(262144) ? 0.85f : 0.76f;
                int w02 = org.telegram.ui.ActionBar.m6.w0(z10 ? org.telegram.ui.ActionBar.m6.a7 : org.telegram.ui.ActionBar.m6.i5, h6Var);
                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var);
                ui uiVar = this.b;
                return uiVar.k4 ? i0.a.f(0.75f, w03, uiVar.l4) : c8.i0.n(f10, w02, w03);
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
                ui uiVar2 = this.b;
                if (uiVar2.k4) {
                    if (org.telegram.messenger.g0.B(uiVar2.l4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // ri.m
    public void l(int i7) {
        ui uiVar = this.b;
        dh.g gVar = uiVar.D4;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.dd.a(i7, 4)) {
            ti.a e10 = uiVar.Y0.e();
            e10.b(uiVar.b.getY(), uiVar.b.getWidth(), uiVar.b.getY() + uiVar.b.getHeight());
            gVar.h(e10);
        }
        gVar.e(uiVar.H4, uiVar.b.getWidth(), uiVar.b.getHeight());
    }

    @Override // te.i
    public /* synthetic */ void a() {
    }
}
