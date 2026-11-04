package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m91;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo0 implements i00, org.telegram.messenger.or, org.telegram.ui.nw {
    public final /* synthetic */ ws0 a;

    public /* synthetic */ wo0(ws0 ws0Var) {
        this.a = ws0Var;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(org.telegram.ui.uw uwVar) {
        return false;
    }

    @Override // org.telegram.messenger.or
    public void a(String str) {
        r0.getStoriesController().r(r0.m1, str, new to0(this.a, 0));
    }

    public void b(boolean z10) {
        ws0 ws0Var = this.a;
        if (!z10) {
            ws0Var.requestLayout();
        }
        ws0Var.setVisibleHeight(ws0Var.Q1);
    }

    @Override // org.telegram.ui.nw
    public boolean y(org.telegram.ui.uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        int i11;
        ws0 ws0Var = this.a;
        SparseArray[] sparseArrayArr = ws0Var.c1;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
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
                    arrayList2.add((org.telegram.messenger.zi) sparseArrayArr[i12].get(num.intValue()));
                }
            }
            sparseArrayArr[i12].clear();
            i12--;
        }
        ws0Var.d1 = 0;
        ws0Var.o1(false);
        hs0 hs0Var = ws0Var.U;
        if (hs0Var != null) {
            hs0Var.x.clear();
        }
        UndoView undoView = null;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.pr) arrayList.get(0)).a != d2Var.getUserConfig().e() && charSequence == null) {
            long j10 = ((org.telegram.messenger.pr) arrayList.get(0)).a;
            Bundle k10 = a1.g.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.m5.C(j10)) {
                k10.putInt("enc_id", (int) (j10 & 4294967295L));
            } else {
                if (org.telegram.messenger.m5.E(j10)) {
                    k10.putLong("user_id", j10);
                } else {
                    k10.putLong("chat_id", -j10);
                }
                if (!d2Var.getMessagesController().E(k10, uwVar, null, null)) {
                    return true;
                }
            }
            d2Var.getNotificationCenter().k(org.telegram.messenger.hs.t, new Object[0]);
            org.telegram.ui.wm wmVar = new org.telegram.ui.wm(k10);
            rg.c.a(wmVar, (org.telegram.messenger.pr) arrayList.get(0));
            uwVar.presentFragment(wmVar, true);
            wmVar.dc(arrayList2);
            return true;
        }
        ws0Var.J1(true);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            long j11 = ((org.telegram.messenger.pr) arrayList.get(i14)).a;
            if (charSequence != null) {
                d2Var.getSendMessagesHelper().r0(org.telegram.messenger.wy.b(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            d2Var.getSendMessagesHelper().q0(arrayList2, j11, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i14++;
            z12 = z12;
            undoView = undoView;
            i11 = 0;
        }
        boolean z13 = z12;
        UndoView undoView2 = undoView;
        uwVar.finishFragment();
        UndoView undoView3 = d2Var instanceof ProfileActivity ? ((ProfileActivity) d2Var).M : undoView2;
        if (undoView3 == null) {
            return z13;
        }
        if (arrayList.size() == z13) {
            undoView3.m(((org.telegram.messenger.pr) arrayList.get(0)).a, Integer.valueOf(arrayList2.size()), 53);
            return z13;
        }
        undoView3.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
        return z13;
    }
}
