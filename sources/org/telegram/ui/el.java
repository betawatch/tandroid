package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class el implements org.telegram.ui.Components.mj0 {
    public final /* synthetic */ un a;

    public el(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.Components.mj0
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.mj0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.mj0
    public final /* synthetic */ boolean h() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r5 == null) goto L26;
     */
    @Override // org.telegram.ui.Components.mj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        TLRPC.Document e;
        boolean z12;
        HashSet hashSet;
        int i10;
        int i11;
        org.telegram.messenger.kj kjVar;
        TLRPC.Message message;
        un unVar = this.a;
        SparseArray[] sparseArrayArr = unVar.m6;
        if (unVar.xb == null) {
            return;
        }
        if (unVar.a() == unVar.getUserConfig().e() && !unVar.getUserConfig().q()) {
            new kg.i1((org.telegram.ui.ActionBar.k2) unVar, 24, true).show();
            unVar.L7(false);
            return;
        }
        boolean contains = unVar.xb.getSelectedReactions().contains(o0Var);
        HashSet hashSet2 = new HashSet();
        int i12 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i13 = 0;
        while (i12 < sparseArrayArr.length) {
            boolean z15 = z13;
            boolean z16 = z14;
            int i14 = i13;
            int i15 = 0;
            while (i15 < sparseArrayArr[i12].size()) {
                org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) sparseArrayArr[i12].valueAt(i15);
                if (kjVar2.z2()) {
                    org.telegram.messenger.fj p9 = unVar.p9(kjVar2);
                    if (p9 != null && !hashSet2.contains(Long.valueOf(p9.a))) {
                        hashSet2.add(Long.valueOf(p9.a));
                        kjVar2 = p9.c();
                    }
                    z12 = contains;
                    hashSet = hashSet2;
                    i10 = i12;
                    i11 = i15;
                    i15 = i11 + 1;
                    hashSet2 = hashSet;
                    contains = z12;
                    i12 = i10;
                }
                if (kjVar2.v2(o0Var) == contains) {
                    hashSet = hashSet2;
                    kjVar = kjVar2;
                    z12 = contains;
                    i10 = i12;
                    i11 = i15;
                    unVar.vb(unVar.E8(kjVar2.f1(), false), kjVar, null, null, 0.0f, 0.0f, o0Var, false, false, false, true);
                    if (!z12) {
                        i14++;
                    }
                } else {
                    z12 = contains;
                    hashSet = hashSet2;
                    i10 = i12;
                    i11 = i15;
                    kjVar = kjVar2;
                }
                if (kjVar.k != null) {
                    boolean z17 = unVar.C0.N;
                    if (z17) {
                        org.telegram.messenger.kj kjVar3 = (org.telegram.messenger.kj) unVar.E6[0].get(kjVar.f1());
                        if (kjVar3 != null && (message = kjVar3.k) != null) {
                            message.reactions = kjVar.k.reactions;
                        }
                    } else if (!z17 && unVar.E3 != null) {
                        z15 = true;
                    }
                }
                if (unVar.C0.N && !kjVar.v2(unVar.E3)) {
                    org.telegram.messenger.fj p92 = unVar.p9(kjVar);
                    if (p92 != null) {
                        ArrayList arrayList = p92.d;
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            unVar.getMediaDataController().M1(((org.telegram.messenger.kj) arrayList.get(i16)).f1());
                        }
                    } else {
                        unVar.getMediaDataController().M1(kjVar.f1());
                    }
                    zf.b1 b1Var = unVar.a4;
                    if (b1Var != null) {
                        b1Var.f();
                    }
                    z15 = true;
                    z16 = true;
                }
                i15 = i11 + 1;
                hashSet2 = hashSet;
                contains = z12;
                i12 = i10;
            }
            i12++;
            z13 = z15;
            z14 = z16;
            i13 = i14;
        }
        if (z13) {
            unVar.Jc(z14);
        }
        unVar.L7(true);
        if (i13 > 0) {
            long j10 = o0Var.g;
            if (j10 == 0) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.vi.b0(org.telegram.messenger.e20.s0).r.get(o0Var.f);
                if (tL_availableReaction == null) {
                    return;
                } else {
                    e = tL_availableReaction.activate_animation;
                }
            } else {
                e = org.telegram.ui.Components.f5.e(org.telegram.messenger.e20.s0, j10);
            }
            if (e == null) {
                return;
            }
            org.telegram.ui.Components.cc.a0(unVar).y(i13, e, null).k(true);
        }
    }

    @Override // org.telegram.ui.Components.mj0
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.mj0
    public final /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
