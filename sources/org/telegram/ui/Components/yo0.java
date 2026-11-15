package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.u91;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo0 implements q00, org.telegram.messenger.tr, org.telegram.ui.sw {
    public final /* synthetic */ ys0 a;

    public /* synthetic */ yo0(ys0 ys0Var) {
        this.a = ys0Var;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean P(org.telegram.ui.yw ywVar) {
        return false;
    }

    @Override // org.telegram.messenger.tr
    public void a(String str) {
        r0.getStoriesController().r(r0.m1, str, new vo0(this.a, 0));
    }

    public void b(boolean z10) {
        ys0 ys0Var = this.a;
        if (!z10) {
            ys0Var.requestLayout();
        }
        ys0Var.setVisibleHeight(ys0Var.Q1);
    }

    @Override // org.telegram.ui.sw
    public boolean y(org.telegram.ui.yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        int i11;
        ys0 ys0Var = this.a;
        SparseArray[] sparseArrayArr = ys0Var.c1;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
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
        ys0Var.d1 = 0;
        ys0Var.q1(false);
        js0 js0Var = ys0Var.U;
        if (js0Var != null) {
            js0Var.x.clear();
        }
        UndoView undoView = null;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.ur) arrayList.get(0)).a != e2Var.getUserConfig().e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.ur) arrayList.get(0)).a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.m5.C(j3)) {
                k10.putInt("enc_id", (int) (j3 & 4294967295L));
            } else {
                if (org.telegram.messenger.m5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!e2Var.getMessagesController().E(k10, ywVar, null, null)) {
                    return true;
                }
            }
            e2Var.getNotificationCenter().k(org.telegram.messenger.ns.t, new Object[0]);
            org.telegram.ui.an anVar = new org.telegram.ui.an(k10);
            qg.c.a(anVar, (org.telegram.messenger.ur) arrayList.get(0));
            ywVar.presentFragment(anVar, true);
            anVar.hc(arrayList2);
            return true;
        }
        ys0Var.L1(true);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            long j10 = ((org.telegram.messenger.ur) arrayList.get(i14)).a;
            if (charSequence != null) {
                e2Var.getSendMessagesHelper().r0(org.telegram.messenger.cz.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            e2Var.getSendMessagesHelper().q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i14++;
            z12 = z12;
            undoView = undoView;
            i11 = 0;
        }
        boolean z13 = z12;
        UndoView undoView2 = undoView;
        ywVar.finishFragment();
        UndoView undoView3 = e2Var instanceof ProfileActivity ? ((ProfileActivity) e2Var).M : undoView2;
        if (undoView3 == null) {
            return z13;
        }
        if (arrayList.size() == z13) {
            undoView3.m(((org.telegram.messenger.ur) arrayList.get(0)).a, Integer.valueOf(arrayList2.size()), 53);
            return z13;
        }
        undoView3.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
        return z13;
    }
}
