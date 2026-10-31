package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pb1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wp0 implements b10, org.telegram.messenger.fs, org.telegram.ui.ux {
    public final /* synthetic */ zt0 a;

    public /* synthetic */ wp0(zt0 zt0Var) {
        this.a = zt0Var;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean N(org.telegram.ui.ay ayVar) {
        return false;
    }

    @Override // org.telegram.messenger.fs
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new sq0(this.a, 0));
    }

    public void b(boolean z10) {
        zt0 zt0Var = this.a;
        if (!z10) {
            zt0Var.requestLayout();
        }
        zt0Var.setVisibleHeight(zt0Var.P1);
    }

    @Override // org.telegram.ui.ux
    public boolean y(org.telegram.ui.ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        int i12;
        zt0 zt0Var = this.a;
        SparseArray[] sparseArrayArr = zt0Var.b1;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
        ArrayList arrayList2 = new ArrayList();
        boolean z12 = true;
        int i13 = 1;
        while (true) {
            i12 = 0;
            if (i13 < 0) {
                break;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i14 = 0; i14 < sparseArrayArr[i13].size(); i14++) {
                arrayList3.add(Integer.valueOf(sparseArrayArr[i13].keyAt(i14)));
            }
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0) {
                    arrayList2.add((org.telegram.messenger.jj) sparseArrayArr[i13].get(num.intValue()));
                }
            }
            sparseArrayArr[i13].clear();
            i13--;
        }
        zt0Var.c1 = 0;
        zt0Var.l1(false);
        it0 it0Var = zt0Var.T;
        if (it0Var != null) {
            it0Var.x.clear();
        }
        UndoView undoView = null;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.gs) arrayList.get(0)).a != k2Var.getUserConfig().e() && charSequence == null) {
            long j10 = ((org.telegram.messenger.gs) arrayList.get(0)).a;
            Bundle g10 = a1.g.g("scrollToTopOnResume", true);
            if (org.telegram.messenger.o5.C(j10)) {
                g10.putInt("enc_id", (int) (j10 & 4294967295L));
            } else {
                if (org.telegram.messenger.o5.E(j10)) {
                    g10.putLong("user_id", j10);
                } else {
                    g10.putLong("chat_id", -j10);
                }
                if (!k2Var.getMessagesController().E(g10, ayVar, null, null)) {
                    return true;
                }
            }
            k2Var.getNotificationCenter().k(org.telegram.messenger.zs.t, new Object[0]);
            org.telegram.ui.un unVar = new org.telegram.ui.un(g10);
            gg.e.a(unVar, (org.telegram.messenger.gs) arrayList.get(0));
            ayVar.presentFragment(unVar, true);
            unVar.Tb(arrayList2);
            return true;
        }
        zt0Var.G1(true);
        int i15 = 0;
        while (i15 < arrayList.size()) {
            long j11 = ((org.telegram.messenger.gs) arrayList.get(i15)).a;
            if (charSequence != null) {
                k2Var.getSendMessagesHelper().r0(org.telegram.messenger.oz.b(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            k2Var.getSendMessagesHelper().q0(arrayList2, j11, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i15++;
            z12 = z12;
            undoView = undoView;
            i12 = 0;
        }
        boolean z13 = z12;
        UndoView undoView2 = undoView;
        ayVar.finishFragment();
        UndoView undoView3 = k2Var instanceof ProfileActivity ? ((ProfileActivity) k2Var).L : undoView2;
        if (undoView3 == null) {
            return z13;
        }
        if (arrayList.size() == z13) {
            undoView3.m(((org.telegram.messenger.gs) arrayList.get(0)).a, Integer.valueOf(arrayList2.size()), 53);
            return z13;
        }
        undoView3.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
        return z13;
    }
}
