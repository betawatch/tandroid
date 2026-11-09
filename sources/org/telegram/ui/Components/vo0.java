package org.telegram.ui.Components;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo0 implements n00, org.telegram.messenger.wr, org.telegram.ui.sw {
    public final /* synthetic */ zs0 a;

    public /* synthetic */ vo0(zs0 zs0Var) {
        this.a = zs0Var;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean N(org.telegram.ui.yw ywVar) {
        return false;
    }

    @Override // org.telegram.messenger.wr
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new so0(this.a, 0));
    }

    public void b(boolean z9) {
        zs0 zs0Var = this.a;
        if (!z9) {
            zs0Var.requestLayout();
        }
        zs0Var.setVisibleHeight(zs0Var.P1);
    }

    @Override // org.telegram.ui.sw
    public boolean y(org.telegram.ui.yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, y91 y91Var) {
        int i11;
        zs0 zs0Var = this.a;
        SparseArray[] sparseArrayArr = zs0Var.b1;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.x1;
        ArrayList arrayList2 = new ArrayList();
        boolean z11 = true;
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
                    arrayList2.add((org.telegram.messenger.ij) sparseArrayArr[i12].get(num.intValue()));
                }
            }
            sparseArrayArr[i12].clear();
            i12--;
        }
        zs0Var.c1 = 0;
        zs0Var.q1(false);
        ks0 ks0Var = zs0Var.T;
        if (ks0Var != null) {
            ks0Var.x.clear();
        }
        UndoView undoView = null;
        if (arrayList.size() <= 1 && ((org.telegram.messenger.xr) arrayList.get(0)).a != f2Var.getUserConfig().e() && charSequence == null) {
            long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).a;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (org.telegram.messenger.m5.C(j3)) {
                k10.putInt("enc_id", (int) (j3 & 4294967295L));
            } else {
                if (org.telegram.messenger.m5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (!f2Var.getMessagesController().E(k10, ywVar, null, null)) {
                    return true;
                }
            }
            f2Var.getNotificationCenter().k(org.telegram.messenger.qs.t, new Object[0]);
            org.telegram.ui.cn cnVar = new org.telegram.ui.cn(k10);
            qg.d.a(cnVar, (org.telegram.messenger.xr) arrayList.get(0));
            ywVar.presentFragment(cnVar, true);
            cnVar.gc(arrayList2);
            return true;
        }
        zs0Var.L1(true);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            long j10 = ((org.telegram.messenger.xr) arrayList.get(i14)).a;
            if (charSequence != null) {
                f2Var.getSendMessagesHelper().r0(org.telegram.messenger.ez.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            f2Var.getSendMessagesHelper().q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
            i14++;
            z11 = z11;
            undoView = undoView;
            i11 = 0;
        }
        boolean z12 = z11;
        UndoView undoView2 = undoView;
        ywVar.finishFragment();
        UndoView undoView3 = f2Var instanceof ProfileActivity ? ((ProfileActivity) f2Var).L : undoView2;
        if (undoView3 == null) {
            return z12;
        }
        if (arrayList.size() == z12) {
            undoView3.m(((org.telegram.messenger.xr) arrayList.get(0)).a, Integer.valueOf(arrayList2.size()), 53);
            return z12;
        }
        undoView3.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
        return z12;
    }
}
