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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh implements jl, org.telegram.ui.ActionBar.r1, te.i, qj0, ri.n, gh.d, ri.m, org.telegram.ui.ActionBar.m0, qn, z4, zi {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;

    public /* synthetic */ bh(si siVar, int i7) {
        this.a = i7;
        this.b = siVar;
    }

    @Override // org.telegram.ui.Components.z4
    public void O(int i7, int i10, boolean z10) {
        boolean v12;
        switch (this.a) {
            case 14:
                si siVar = this.b;
                ki kiVar = siVar.w2;
                if (kiVar != siVar.e2 && kiVar != siVar.l2) {
                    if (!kiVar.M(z10, i7, i10, 0L, siVar.g1())) {
                        siVar.B4 = true;
                        siVar.dismiss();
                        break;
                    }
                } else {
                    siVar.v1(z10, i7, 0, siVar.L2, siVar.g1());
                    break;
                }
                break;
            default:
                si siVar2 = this.b;
                df dfVar = siVar2.c2;
                long k10 = dfVar != null ? dfVar.k() : 0L;
                ai aiVar = siVar2.G2;
                siVar2.L2 = k10;
                aiVar.setEffect(k10);
                ki kiVar2 = siVar2.w2;
                if (kiVar2 == siVar2.e2 || kiVar2 == siVar2.l2) {
                    v12 = siVar2.v1(z10, i7, i10, k10, siVar2.g1());
                } else {
                    if (!kiVar2.M(z10, i7, i10, k10, siVar2.g1())) {
                        siVar2.dismiss();
                    }
                    v12 = false;
                }
                df dfVar2 = siVar2.c2;
                if (dfVar2 != null) {
                    dfVar2.h(!v12);
                    siVar2.c2 = null;
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl
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

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        TLRPC.User user;
        if (!(view instanceof li)) {
            return false;
        }
        li liVar = (li) view;
        si siVar = this.b;
        if (siVar.Q1 || (user = liVar.b) == null) {
            return false;
        }
        siVar.l1(liVar.c, user);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e9, code lost:
    
        if (r24 != 0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.qn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(TLRPC.MessageMedia messageMedia, Editable editable, sh.e eVar, ArrayList arrayList, final boolean z10, final int i7, final long j3) {
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
        si siVar = this.b;
        switch (i14) {
            case 13:
                org.telegram.ui.bn bnVar2 = (org.telegram.ui.bn) siVar.a2;
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
                org.telegram.ui.bn bnVar3 = (org.telegram.ui.bn) siVar.a2;
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
                    final sh.g gVar = new sh.g(eVar, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList);
                    final org.telegram.messenger.c accountInstance = bnVar3.getAccountInstance();
                    long j13 = bnVar3.l6;
                    org.telegram.messenger.fj fjVar3 = bnVar3.F5;
                    org.telegram.messenger.fj fjVar4 = bnVar3.m4;
                    final org.telegram.ui.rm rmVar = bnVar3.D5;
                    final org.telegram.messenger.bw Y8 = bnVar3.Y8();
                    final long j92 = bnVar3.j9();
                    final org.telegram.messenger.kj kjVar2 = bnVar3.y5;
                    org.telegram.messenger.q5 q5Var = org.telegram.messenger.zy.J;
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
                        fjVar = fjVar3;
                        final int[] iArr = new int[1];
                        SparseArray sparseArray = eVar.a;
                        int size = sparseArray.size();
                        int i15 = 0;
                        while (i15 < size) {
                            int i16 = size;
                            sh.d dVar = (sh.d) sparseArray.valueAt(i15);
                            org.telegram.messenger.fj fjVar5 = fjVar4;
                            int keyAt = sparseArray.keyAt(i15);
                            SparseArray sparseArray2 = sparseArray;
                            if (dVar instanceof th.g) {
                                arrayList9.add(((th.g) dVar).b);
                                arrayList10.add(Integer.valueOf(keyAt));
                            } else if (dVar instanceof th.d) {
                                org.telegram.messenger.yy yyVar = ((th.d) dVar).c;
                                yyVar.B = keyAt;
                                arrayList3.add(yyVar);
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
                        final org.telegram.messenger.ww wwVar = new org.telegram.messenger.ww(arrayList4, arrayList7, accountInstance, arrayList5, j11, fjVar, fjVar2, rmVar, z10, i7, Y8, j3, j92, kjVar2, gVar, arrayList6, arrayList8);
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
                                zy.X(accountInstance, arrayList11, j11, fjVar, fjVar2, null, rmVar, false, true, null, null, z10, i7, 0, false, null, Y8, 0L, false, j3, j92, kjVar2, gVar, i18 > 0);
                                zy.J.c(new xr(wwVar2, 11));
                            }
                        };
                        gVar = gVar;
                        if (!arrayList9.isEmpty()) {
                            int i18 = iArr[0] - i17;
                            iArr[0] = i18;
                            j12 = j92;
                            kjVar = kjVar2;
                            org.telegram.messenger.iw iwVar = new org.telegram.messenger.iw(gVar, arrayList9, j11, accountInstance, "", i18 > 0 ? i17 : 0, arrayList10, null, fjVar, fjVar2, z10, i7, 0, null, Y8, 0L, false, j3, runnable);
                            gVar = gVar;
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
                    org.telegram.messenger.xy c11 = org.telegram.messenger.xy.c(null, null, null, null, null, null, null, null, gVar.a, null, j11, null, fjVar, fjVar2, null, true, null, null, null, null, z10, i7, 0, 0, null, null, false, false);
                    c11.b = gVar.d;
                    c11.L = true;
                    c11.w = gVar.e;
                    c11.K = Y8;
                    c11.Q = j10;
                    c11.R = j12;
                    c11.T = kjVar;
                    c11.j = gVar;
                    org.telegram.messenger.zy.C(accountInstance.a).r0(c11);
                    bnVar.L6();
                    break;
                }
                break;
        }
    }

    @Override // ri.n
    public int e() {
        si siVar = this.b;
        siVar.getClass();
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, siVar.J0);
    }

    @Override // te.i
    public void f(te.j jVar) {
        this.b.j1();
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void g(int i7) {
        this.b.V2.getActionBarMenuOnItemClick().b(i7);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        si siVar = this.b;
        siVar.B4 = true;
        siVar.dismiss();
    }

    @Override // org.telegram.ui.Components.zi
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        si siVar = this.b;
        zi ziVar = siVar.T1;
        if (ziVar != null) {
            ziVar.i(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
            return;
        }
        org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
        if (h2Var == null || !(h2Var instanceof org.telegram.ui.bn)) {
            qi qiVar = siVar.X3;
            if (qiVar != null) {
                qiVar.b2(arrayList, charSequence, z10, i7, i10, j3, z11, j10);
                return;
            }
            return;
        }
        org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var;
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
    public int j(org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        switch (this.a) {
            case 5:
                float f10 = org.telegram.messenger.pc.e(262144) ? 0.85f : 0.76f;
                int w02 = org.telegram.ui.ActionBar.n6.w0(z10 ? org.telegram.ui.ActionBar.n6.a7 : org.telegram.ui.ActionBar.n6.i5, i6Var);
                int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var);
                si siVar = this.b;
                return siVar.k4 ? i0.a.f(0.75f, w03, siVar.l4) : c8.i0.n(f10, w02, w03);
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
                si siVar2 = this.b;
                if (siVar2.k4) {
                    if (org.telegram.messenger.g0.B(siVar2.l4) <= 0.72f) {
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
        si siVar = this.b;
        dh.g gVar = siVar.D4;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.dd.a(i7, 4)) {
            ti.a e10 = siVar.Y0.e();
            e10.b(siVar.b.getY(), siVar.b.getWidth(), siVar.b.getY() + siVar.b.getHeight());
            gVar.h(e10);
        }
        gVar.e(siVar.H4, siVar.b.getWidth(), siVar.b.getHeight());
    }

    @Override // te.i
    public /* synthetic */ void a() {
    }
}
