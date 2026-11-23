package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp0 implements z00, org.telegram.messenger.sr, org.telegram.ui.ww {
    public final /* synthetic */ jt0 a;

    public /* synthetic */ jp0(jt0 jt0Var) {
        this.a = jt0Var;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(org.telegram.ui.cx cxVar) {
        return false;
    }

    @Override // org.telegram.messenger.sr
    public void a(String str) {
        r0.getStoriesController().r(r0.m1, str, new gp0(this.a, 0));
    }

    public void b(boolean z10) {
        jt0 jt0Var = this.a;
        if (!z10) {
            jt0Var.requestLayout();
        }
        jt0Var.setVisibleHeight(jt0Var.Q1);
    }

    @Override // org.telegram.ui.ww
    public boolean y(org.telegram.ui.cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        int i11;
        jt0 jt0Var = this.a;
        SparseArray[] sparseArrayArr = jt0Var.c1;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.y1;
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
                    arrayList2.add((org.telegram.messenger.gj) sparseArrayArr[i12].get(num.intValue()));
                }
            }
            sparseArrayArr[i12].clear();
            i12--;
        }
        jt0Var.d1 = 0;
        jt0Var.q1(false);
        us0 us0Var = jt0Var.U;
        if (us0Var != null) {
            us0Var.x.clear();
        }
        UndoView undoView = null;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.tr) arrayList.get(0)).a != g2Var.getUserConfig().e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.tr) arrayList.get(0)).a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.n5.C(j3)) {
                k10.putInt("enc_id", (int) (j3 & 4294967295L));
            } else {
                if (org.telegram.messenger.n5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!g2Var.getMessagesController().E(k10, cxVar, null, null)) {
                    return true;
                }
            }
            g2Var.getNotificationCenter().k(org.telegram.messenger.ls.t, new Object[0]);
            org.telegram.ui.bn bnVar = new org.telegram.ui.bn(k10);
            qg.c.a(bnVar, (org.telegram.messenger.tr) arrayList.get(0));
            cxVar.presentFragment(bnVar, true);
            bnVar.hc(arrayList2);
            return true;
        }
        jt0Var.L1(true);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            long j10 = ((org.telegram.messenger.tr) arrayList.get(i14)).a;
            if (charSequence != null) {
                g2Var.getSendMessagesHelper().r0(org.telegram.messenger.yy.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            g2Var.getSendMessagesHelper().q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i14++;
            z12 = z12;
            undoView = undoView;
            i11 = 0;
        }
        boolean z13 = z12;
        UndoView undoView2 = undoView;
        cxVar.finishFragment();
        UndoView undoView3 = g2Var instanceof ProfileActivity ? ((ProfileActivity) g2Var).M : undoView2;
        if (undoView3 == null) {
            return z13;
        }
        if (arrayList.size() == z13) {
            undoView3.m(((org.telegram.messenger.tr) arrayList.get(0)).a, Integer.valueOf(arrayList2.size()), 53);
            return z13;
        }
        undoView3.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
        return z13;
    }
}
