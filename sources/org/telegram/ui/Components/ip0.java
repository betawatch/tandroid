package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ip0 implements x00, org.telegram.messenger.rr, org.telegram.ui.vw {
    public final /* synthetic */ it0 a;

    public /* synthetic */ ip0(it0 it0Var) {
        this.a = it0Var;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean F() {
        return false;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean O(org.telegram.ui.bx bxVar) {
        return false;
    }

    @Override // org.telegram.messenger.rr
    public void a(String str) {
        r0.getStoriesController().r(r0.m1, str, new fp0(this.a, 0));
    }

    public void b(boolean z10) {
        it0 it0Var = this.a;
        if (!z10) {
            it0Var.requestLayout();
        }
        it0Var.setVisibleHeight(it0Var.Q1);
    }

    @Override // org.telegram.ui.vw
    public boolean z(org.telegram.ui.bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        int i11;
        it0 it0Var = this.a;
        SparseArray[] sparseArrayArr = it0Var.c1;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.y1;
        ArrayList arrayList2 = new ArrayList();
        boolean z12 = true;
        int i12 = 1;
        while (true) {
            i11 = 0;
            if (i12 < 0) {
                break;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i13 = 0; i13 < sparseArrayArr[i12].size(); i13++) {
                arrayList3.add(Integer.valueOf(sparseArrayArr[i12].keyAt(i13)));
            }
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0) {
                    arrayList2.add((org.telegram.messenger.fj) sparseArrayArr[i12].get(num.intValue()));
                }
            }
            sparseArrayArr[i12].clear();
            i12--;
        }
        it0Var.d1 = 0;
        it0Var.q1(false);
        ts0 ts0Var = it0Var.U;
        if (ts0Var != null) {
            ts0Var.x.clear();
        }
        UndoView undoView = null;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.sr) arrayList.get(0)).a != g2Var.getUserConfig().e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.n5.C(j3)) {
                k10.putInt("enc_id", (int) (j3 & 4294967295L));
            } else {
                if (org.telegram.messenger.n5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!g2Var.getMessagesController().E(k10, bxVar, null, null)) {
                    return true;
                }
            }
            g2Var.getNotificationCenter().k(org.telegram.messenger.ks.t, new Object[0]);
            org.telegram.ui.bn bnVar = new org.telegram.ui.bn(k10);
            qg.c.a(bnVar, (org.telegram.messenger.sr) arrayList.get(0));
            bxVar.presentFragment(bnVar, true);
            bnVar.hc(arrayList2);
            return true;
        }
        it0Var.L1(true);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            long j10 = ((org.telegram.messenger.sr) arrayList.get(i14)).a;
            if (charSequence != null) {
                g2Var.getSendMessagesHelper().r0(org.telegram.messenger.xy.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            g2Var.getSendMessagesHelper().q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i14++;
            z12 = z12;
            undoView = undoView;
            i11 = 0;
        }
        boolean z13 = z12;
        UndoView undoView2 = undoView;
        bxVar.finishFragment();
        UndoView undoView3 = g2Var instanceof ProfileActivity ? ((ProfileActivity) g2Var).M : undoView2;
        if (undoView3 == null) {
            return z13;
        }
        if (arrayList.size() == z13) {
            undoView3.m(((org.telegram.messenger.sr) arrayList.get(0)).a, Integer.valueOf(arrayList2.size()), 53);
            return z13;
        }
        undoView3.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
        return z13;
    }
}
