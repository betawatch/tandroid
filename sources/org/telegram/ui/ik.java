package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ik implements org.telegram.ui.Components.hi0 {
    public final /* synthetic */ an a;

    public ik(an anVar) {
        this.a = anVar;
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ boolean U() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r5 == null) goto L26;
     */
    @Override // org.telegram.ui.Components.hi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        TLRPC.Document e10;
        boolean z11;
        HashSet hashSet;
        int i7;
        int i10;
        org.telegram.messenger.ij ijVar;
        TLRPC.Message message;
        an anVar = this.a;
        SparseArray[] sparseArrayArr = anVar.m6;
        if (anVar.xb == null) {
            return;
        }
        if (anVar.a() == anVar.getUserConfig().e() && !anVar.getUserConfig().q()) {
            new ug.w0((org.telegram.ui.ActionBar.f2) anVar, 24, true).show();
            anVar.N7(false);
            return;
        }
        boolean contains = anVar.xb.getSelectedReactions().contains(o0Var);
        HashSet hashSet2 = new HashSet();
        int i11 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i12 = 0;
        while (i11 < sparseArrayArr.length) {
            boolean z14 = z12;
            boolean z15 = z13;
            int i13 = i12;
            int i14 = 0;
            while (i14 < sparseArrayArr[i11].size()) {
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) sparseArrayArr[i11].valueAt(i14);
                if (ijVar2.A2()) {
                    org.telegram.messenger.dj s9 = anVar.s9(ijVar2);
                    if (s9 != null && !hashSet2.contains(Long.valueOf(s9.a))) {
                        hashSet2.add(Long.valueOf(s9.a));
                        ijVar2 = s9.c();
                    }
                    z11 = contains;
                    hashSet = hashSet2;
                    i7 = i11;
                    i10 = i14;
                    i14 = i10 + 1;
                    hashSet2 = hashSet;
                    contains = z11;
                    i11 = i7;
                }
                if (ijVar2.w2(o0Var) == contains) {
                    hashSet = hashSet2;
                    ijVar = ijVar2;
                    z11 = contains;
                    i7 = i11;
                    i10 = i14;
                    anVar.Ab(anVar.H8(ijVar2.f1(), false), ijVar, null, null, 0.0f, 0.0f, o0Var, false, false, false, true);
                    if (!z11) {
                        i13++;
                    }
                } else {
                    z11 = contains;
                    hashSet = hashSet2;
                    i7 = i11;
                    i10 = i14;
                    ijVar = ijVar2;
                }
                if (ijVar.k != null) {
                    boolean z16 = anVar.C0.N;
                    if (z16) {
                        org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) anVar.E6[0].get(ijVar.f1());
                        if (ijVar3 != null && (message = ijVar3.k) != null) {
                            message.reactions = ijVar.k.reactions;
                        }
                    } else if (!z16 && anVar.E3 != null) {
                        z14 = true;
                    }
                }
                if (anVar.C0.N && !ijVar.w2(anVar.E3)) {
                    org.telegram.messenger.dj s92 = anVar.s9(ijVar);
                    if (s92 != null) {
                        ArrayList arrayList = s92.d;
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            anVar.getMediaDataController().M1(((org.telegram.messenger.ij) arrayList.get(i15)).f1());
                        }
                    } else {
                        anVar.getMediaDataController().M1(ijVar.f1());
                    }
                    jg.m1 m1Var = anVar.a4;
                    if (m1Var != null) {
                        m1Var.f();
                    }
                    z14 = true;
                    z15 = true;
                }
                i14 = i10 + 1;
                hashSet2 = hashSet;
                contains = z11;
                i11 = i7;
            }
            i11++;
            z12 = z14;
            z13 = z15;
            i12 = i13;
        }
        if (z12) {
            anVar.Oc(z13);
        }
        anVar.N7(true);
        if (i12 > 0) {
            long j3 = o0Var.g;
            if (j3 == 0) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).r.get(o0Var.f);
                if (tL_availableReaction == null) {
                    return;
                } else {
                    e10 = tL_availableReaction.activate_animation;
                }
            } else {
                e10 = org.telegram.ui.Components.i5.e(org.telegram.messenger.p10.s0, j3);
            }
            if (e10 == null) {
                return;
            }
            org.telegram.ui.Components.hc.a0(anVar).y(i12, e10, null).k(true);
        }
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
