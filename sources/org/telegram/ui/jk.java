package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jk implements org.telegram.ui.Components.wi0 {
    public final /* synthetic */ bn a;

    public jk(bn bnVar) {
        this.a = bnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r5 == null) goto L26;
     */
    @Override // org.telegram.ui.Components.wi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        TLRPC.Document e10;
        boolean z12;
        HashSet hashSet;
        int i7;
        int i10;
        org.telegram.messenger.fj fjVar;
        TLRPC.Message message;
        bn bnVar = this.a;
        SparseArray[] sparseArrayArr = bnVar.o6;
        if (bnVar.Bb == null) {
            return;
        }
        if (bnVar.a() == bnVar.getUserConfig().e() && !bnVar.getUserConfig().q()) {
            new ug.y0((org.telegram.ui.ActionBar.g2) bnVar, 24, true).show();
            bnVar.O7(false);
            return;
        }
        boolean contains = bnVar.Bb.getSelectedReactions().contains(p0Var);
        HashSet hashSet2 = new HashSet();
        int i11 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i12 = 0;
        while (i11 < sparseArrayArr.length) {
            boolean z15 = z13;
            boolean z16 = z14;
            int i13 = i12;
            int i14 = 0;
            while (i14 < sparseArrayArr[i11].size()) {
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) sparseArrayArr[i11].valueAt(i14);
                if (fjVar2.z2()) {
                    org.telegram.messenger.aj u92 = bnVar.u9(fjVar2);
                    if (u92 != null && !hashSet2.contains(Long.valueOf(u92.a))) {
                        hashSet2.add(Long.valueOf(u92.a));
                        fjVar2 = u92.c();
                    }
                    z12 = contains;
                    hashSet = hashSet2;
                    i7 = i11;
                    i10 = i14;
                    i14 = i10 + 1;
                    hashSet2 = hashSet;
                    contains = z12;
                    i11 = i7;
                }
                if (fjVar2.v2(p0Var) == contains) {
                    hashSet = hashSet2;
                    fjVar = fjVar2;
                    z12 = contains;
                    i7 = i11;
                    i10 = i14;
                    bnVar.Eb(bnVar.J8(fjVar2.e1(), false), fjVar, null, null, 0.0f, 0.0f, p0Var, false, false, false, true);
                    if (!z12) {
                        i13++;
                    }
                } else {
                    z12 = contains;
                    hashSet = hashSet2;
                    i7 = i11;
                    i10 = i14;
                    fjVar = fjVar2;
                }
                if (fjVar.k != null) {
                    boolean z17 = bnVar.D0.O;
                    if (z17) {
                        org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) bnVar.G6[0].get(fjVar.e1());
                        if (fjVar3 != null && (message = fjVar3.k) != null) {
                            message.reactions = fjVar.k.reactions;
                        }
                    } else if (!z17 && bnVar.F3 != null) {
                        z15 = true;
                    }
                }
                if (bnVar.D0.O && !fjVar.v2(bnVar.F3)) {
                    org.telegram.messenger.aj u93 = bnVar.u9(fjVar);
                    if (u93 != null) {
                        ArrayList arrayList = u93.d;
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            bnVar.getMediaDataController().R1(((org.telegram.messenger.fj) arrayList.get(i15)).e1());
                        }
                    } else {
                        bnVar.getMediaDataController().R1(fjVar.e1());
                    }
                    jg.l1 l1Var = bnVar.b4;
                    if (l1Var != null) {
                        l1Var.f();
                    }
                    z15 = true;
                    z16 = true;
                }
                i14 = i10 + 1;
                hashSet2 = hashSet;
                contains = z12;
                i11 = i7;
            }
            i11++;
            z13 = z15;
            z14 = z16;
            i12 = i13;
        }
        if (z13) {
            bnVar.Sc(z14);
        }
        bnVar.O7(true);
        if (i12 > 0) {
            long j3 = p0Var.g;
            if (j3 == 0) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).r.get(p0Var.f);
                if (tL_availableReaction == null) {
                    return;
                } else {
                    e10 = tL_availableReaction.activate_animation;
                }
            } else {
                e10 = org.telegram.ui.Components.o5.e(org.telegram.messenger.i10.t0, j3);
            }
            if (e10 == null) {
                return;
            }
            org.telegram.ui.Components.kc.b0(bnVar).y(i12, e10, null).k(true);
        }
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean l() {
        return true;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void q(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
