package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ek implements org.telegram.ui.Components.ki0 {
    public final /* synthetic */ wm a;

    public ek(wm wmVar) {
        this.a = wmVar;
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ boolean v() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r5 == null) goto L26;
     */
    @Override // org.telegram.ui.Components.ki0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        TLRPC.Document e10;
        boolean z12;
        HashSet hashSet;
        int i3;
        int i10;
        org.telegram.messenger.zi ziVar;
        TLRPC.Message message;
        wm wmVar = this.a;
        SparseArray[] sparseArrayArr = wmVar.n6;
        if (wmVar.yb == null) {
            return;
        }
        if (wmVar.a() == wmVar.getUserConfig().e() && !wmVar.getUserConfig().q()) {
            new vg.v0((org.telegram.ui.ActionBar.d2) wmVar, 24, true).show();
            wmVar.N7(false);
            return;
        }
        boolean contains = wmVar.yb.getSelectedReactions().contains(n0Var);
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
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) sparseArrayArr[i11].valueAt(i14);
                if (ziVar2.A2()) {
                    org.telegram.messenger.ui s92 = wmVar.s9(ziVar2);
                    if (s92 != null && !hashSet2.contains(Long.valueOf(s92.a))) {
                        hashSet2.add(Long.valueOf(s92.a));
                        ziVar2 = s92.c();
                    }
                    z12 = contains;
                    hashSet = hashSet2;
                    i3 = i11;
                    i10 = i14;
                    i14 = i10 + 1;
                    hashSet2 = hashSet;
                    contains = z12;
                    i11 = i3;
                }
                if (ziVar2.w2(n0Var) == contains) {
                    hashSet = hashSet2;
                    ziVar = ziVar2;
                    z12 = contains;
                    i3 = i11;
                    i10 = i14;
                    wmVar.Ab(wmVar.H8(ziVar2.f1(), false), ziVar, null, null, 0.0f, 0.0f, n0Var, false, false, false, true);
                    if (!z12) {
                        i13++;
                    }
                } else {
                    z12 = contains;
                    hashSet = hashSet2;
                    i3 = i11;
                    i10 = i14;
                    ziVar = ziVar2;
                }
                if (ziVar.k != null) {
                    boolean z17 = wmVar.D0.O;
                    if (z17) {
                        org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) wmVar.F6[0].get(ziVar.f1());
                        if (ziVar3 != null && (message = ziVar3.k) != null) {
                            message.reactions = ziVar.k.reactions;
                        }
                    } else if (!z17 && wmVar.F3 != null) {
                        z15 = true;
                    }
                }
                if (wmVar.D0.O && !ziVar.w2(wmVar.F3)) {
                    org.telegram.messenger.ui s93 = wmVar.s9(ziVar);
                    if (s93 != null) {
                        ArrayList arrayList = s93.d;
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            wmVar.getMediaDataController().M1(((org.telegram.messenger.zi) arrayList.get(i15)).f1());
                        }
                    } else {
                        wmVar.getMediaDataController().M1(ziVar.f1());
                    }
                    kg.i1 i1Var = wmVar.b4;
                    if (i1Var != null) {
                        i1Var.f();
                    }
                    z15 = true;
                    z16 = true;
                }
                i14 = i10 + 1;
                hashSet2 = hashSet;
                contains = z12;
                i11 = i3;
            }
            i11++;
            z13 = z15;
            z14 = z16;
            i12 = i13;
        }
        if (z13) {
            wmVar.Oc(z14);
        }
        wmVar.N7(true);
        if (i12 > 0) {
            long j10 = n0Var.g;
            if (j10 == 0) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).r.get(n0Var.f);
                if (tL_availableReaction == null) {
                    return;
                } else {
                    e10 = tL_availableReaction.activate_animation;
                }
            } else {
                e10 = org.telegram.ui.Components.g5.e(org.telegram.messenger.h10.t0, j10);
            }
            if (e10 == null) {
                return;
            }
            org.telegram.ui.Components.fc.a0(wmVar).y(i12, e10, null).k(true);
        }
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }
}
