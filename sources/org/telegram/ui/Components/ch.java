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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch implements jl, org.telegram.ui.ActionBar.q1, te.i, sj0, ri.n, gh.d, ri.m, org.telegram.ui.ActionBar.l0, pn, z4, aj {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;

    public /* synthetic */ ch(ti tiVar, int i7) {
        this.a = i7;
        this.b = tiVar;
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        boolean v12;
        switch (this.a) {
            case 14:
                ti tiVar = this.b;
                li liVar = tiVar.w2;
                if (liVar != tiVar.e2 && liVar != tiVar.l2) {
                    if (!liVar.M(z10, i7, i10, 0L, tiVar.g1())) {
                        tiVar.B4 = true;
                        tiVar.dismiss();
                        break;
                    }
                } else {
                    tiVar.v1(z10, i7, 0, tiVar.L2, tiVar.g1());
                    break;
                }
                break;
            default:
                ti tiVar2 = this.b;
                ef efVar = tiVar2.c2;
                long k10 = efVar != null ? efVar.k() : 0L;
                bi biVar = tiVar2.G2;
                tiVar2.L2 = k10;
                biVar.setEffect(k10);
                li liVar2 = tiVar2.w2;
                if (liVar2 == tiVar2.e2 || liVar2 == tiVar2.l2) {
                    v12 = tiVar2.v1(z10, i7, i10, k10, tiVar2.g1());
                } else {
                    if (!liVar2.M(z10, i7, i10, k10, tiVar2.g1())) {
                        tiVar2.dismiss();
                    }
                    v12 = false;
                }
                ef efVar2 = tiVar2.c2;
                if (efVar2 != null) {
                    efVar2.h(!v12);
                    tiVar2.c2 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        TLRPC.User user;
        if (!(view instanceof mi)) {
            return false;
        }
        mi miVar = (mi) view;
        ti tiVar = this.b;
        if (tiVar.Q1 || (user = miVar.b) == null) {
            return false;
        }
        tiVar.l1(miVar.c, user);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e9, code lost:
    
        if (r24 != 0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.pn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(TLRPC.MessageMedia messageMedia, Editable editable, sh.d dVar, ArrayList arrayList, final boolean z10, final int i7, final long j3) {
        String str;
        ArrayList arrayList2;
        long j10;
        final long j11;
        final org.telegram.messenger.fj fjVar;
        final org.telegram.messenger.fj fjVar2;
        org.telegram.ui.bn bnVar;
        org.telegram.messenger.kj kjVar;
        long j12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.a;
        ti tiVar = this.b;
        switch (i14) {
            case 13:
                org.telegram.ui.bn bnVar2 = (org.telegram.ui.bn) tiVar.a2;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (bnVar2.u7()) {
                    org.telegram.messenger.xy c10 = org.telegram.messenger.xy.c(null, null, null, null, null, null, null, null, null, null, bnVar2.l6, null, bnVar2.F5, bnVar2.m4, null, true, null, null, null, null, z10, i7, 0, 0, null, null, false, false);
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
                org.telegram.ui.bn bnVar3 = (org.telegram.ui.bn) tiVar.a2;
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
                    org.telegram.messenger.fj fjVar3 = bnVar3.F5;
                    org.telegram.messenger.fj fjVar4 = bnVar3.m4;
                    final org.telegram.ui.rm rmVar = bnVar3.D5;
                    final org.telegram.messenger.bw Y8 = bnVar3.Y8();
                    final long j92 = bnVar3.j9();
                    final org.telegram.messenger.kj kjVar2 = bnVar3.y5;
                    org.telegram.messenger.q5 q5Var = org.telegram.messenger.zy.J;
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
                        fjVar = fjVar3;
                        final int[] iArr = new int[1];
                        SparseArray sparseArray = dVar.a;
                        int size = sparseArray.size();
                        int i15 = 0;
                        while (i15 < size) {
                            int i16 = size;
                            sh.c cVar = (sh.c) sparseArray.valueAt(i15);
                            org.telegram.messenger.fj fjVar5 = fjVar4;
                            int keyAt = sparseArray.keyAt(i15);
                            SparseArray sparseArray2 = sparseArray;
                            if (cVar instanceof th.g) {
                                arrayList9.add(((th.g) cVar).b);
                                arrayList10.add(Integer.valueOf(keyAt));
                            } else if (cVar instanceof th.d) {
                                org.telegram.messenger.yy yyVar = ((th.d) cVar).c;
                                yyVar.B = keyAt;
                                arrayList3.add(yyVar);
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
                            fjVar4 = fjVar5;
                        }
                        fjVar2 = fjVar4;
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
                        final org.telegram.messenger.ww wwVar = new org.telegram.messenger.ww(arrayList4, arrayList7, accountInstance, arrayList5, j11, fjVar, fjVar2, rmVar, z10, i7, Y8, j3, j92, kjVar2, fVar, arrayList6, arrayList8);
                        Y8 = Y8;
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
                                zy.X(accountInstance, arrayList11, j11, fjVar, fjVar2, null, rmVar, false, true, null, null, z10, i7, 0, false, null, Y8, 0L, false, j3, j92, kjVar2, fVar, i18 > 0);
                                zy.J.c(new xr(wwVar2, 11));
                            }
                        };
                        fVar = fVar;
                        if (!arrayList9.isEmpty()) {
                            int i18 = iArr[0] - i17;
                            iArr[0] = i18;
                            j12 = j92;
                            kjVar = kjVar2;
                            org.telegram.messenger.iw iwVar = new org.telegram.messenger.iw(fVar, arrayList9, j11, accountInstance, "", i18 > 0 ? i17 : 0, arrayList10, null, fjVar, fjVar2, z10, i7, 0, null, Y8, 0L, false, j3, runnable);
                            fVar = fVar;
                            accountInstance = accountInstance;
                            Y8 = Y8;
                            j10 = j3;
                            new Thread(iwVar).start();
                            break;
                        } else {
                            j10 = j3;
                            j12 = j92;
                            kjVar = kjVar2;
                            runnable.run();
                            break;
                        }
                    } else {
                        j10 = j3;
                        j11 = j13;
                        fjVar = fjVar3;
                        fjVar2 = fjVar4;
                        bnVar = bnVar3;
                        kjVar = kjVar2;
                        j12 = j92;
                    }
                    org.telegram.messenger.xy c11 = org.telegram.messenger.xy.c(null, null, null, null, null, null, null, null, fVar.a, null, j11, null, fjVar, fjVar2, null, true, null, null, null, null, z10, i7, 0, 0, null, null, false, false);
                    c11.b = fVar.d;
                    c11.L = true;
                    c11.w = fVar.e;
                    c11.K = Y8;
                    c11.Q = j10;
                    c11.R = j12;
                    c11.T = kjVar;
                    c11.j = fVar;
                    org.telegram.messenger.zy.C(accountInstance.a).r0(c11);
                    bnVar.L6();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.bn) this.b.a2).d(messageMedia, i7, z10, i10, 0L);
                break;
            case 12:
                ((org.telegram.ui.bn) this.b.a2).d(messageMedia, i7, z10, i10, j3);
                break;
            default:
                ((org.telegram.ui.bn) this.b.a2).d(messageMedia, i7, z10, i10, j3);
                break;
        }
    }

    @Override // org.telegram.ui.Components.aj
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        ti tiVar = this.b;
        aj ajVar = tiVar.T1;
        if (ajVar != null) {
            ajVar.e(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
        if (g2Var == null || !(g2Var instanceof org.telegram.ui.bn)) {
            ri riVar = tiVar.X3;
            if (riVar != null) {
                riVar.W1(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
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
            org.telegram.messenger.fj fjVar = bnVar.F5;
            org.telegram.messenger.fj fjVar2 = bnVar.m4;
            org.telegram.messenger.fj fjVar3 = bnVar.H5;
            org.telegram.messenger.bw Y8 = bnVar.Y8();
            org.telegram.messenger.q5 q5Var = org.telegram.messenger.zy.J;
            new Thread(new org.telegram.messenger.iw(null, arrayList, j11, accountInstance, charSequence2, false, null, fjVar3, fjVar, fjVar2, z10, i7, i10, null, Y8, j3, z11, j10, null)).start();
            bnVar.L6();
        }
    }

    @Override // gh.d
    public int f(org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        switch (this.a) {
            case 5:
                float f10 = org.telegram.messenger.pc.e(262144) ? 0.85f : 0.76f;
                int w02 = org.telegram.ui.ActionBar.n6.w0(z10 ? org.telegram.ui.ActionBar.n6.a7 : org.telegram.ui.ActionBar.n6.i5, i6Var);
                int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var);
                ti tiVar = this.b;
                return tiVar.k4 ? i0.a.f(0.75f, w03, tiVar.l4) : c8.j0.n(f10, w02, w03);
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
                ti tiVar2 = this.b;
                if (tiVar2.k4) {
                    if (org.telegram.messenger.g0.B(tiVar2.l4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z10) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // te.i
    public void g(te.j jVar) {
        this.b.j1();
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void h(int i7) {
        this.b.V2.getActionBarMenuOnItemClick().b(i7);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ti tiVar = this.b;
        tiVar.B4 = true;
        tiVar.dismiss();
    }

    @Override // ri.n
    public int j() {
        ti tiVar = this.b;
        tiVar.getClass();
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, tiVar.J0);
    }

    @Override // ri.m
    public void k(int i7) {
        ti tiVar = this.b;
        dh.g gVar = tiVar.D4;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.ed.a(i7, 4)) {
            ti.a e10 = tiVar.Y0.e();
            e10.b(tiVar.b.getY(), tiVar.b.getWidth(), tiVar.b.getY() + tiVar.b.getHeight());
            gVar.h(e10);
        }
        gVar.e(tiVar.H4, tiVar.b.getWidth(), tiVar.b.getHeight());
    }

    @Override // te.i
    public /* synthetic */ void a() {
    }
}
