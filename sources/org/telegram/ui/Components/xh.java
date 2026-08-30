package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xh implements xj {
    public final /* synthetic */ li a;

    public xh(li liVar) {
        this.a = liVar;
    }

    @Override // org.telegram.ui.Components.xj
    public final void O() {
        this.a.B1(true);
    }

    @Override // org.telegram.ui.Components.xj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        li liVar = this.a;
        xj xjVar = liVar.U;
        if (xjVar != null) {
            xjVar.l(arrayList, str, arrayList2, arrayList3, z4, i10, j10, z10, j11);
            return;
        }
        Object obj = liVar.c0;
        if (obj instanceof xj) {
            ((xj) obj).l(arrayList, str, arrayList2, arrayList3, z4, i10, j10, z10, j11);
            return;
        }
        if (obj instanceof org.telegram.ui.dn0) {
            org.telegram.ui.dn0 dn0Var = (org.telegram.ui.dn0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            dn0Var.G1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.xj
    public final void m(long j10, ArrayList arrayList, boolean z4, int i10) {
        li liVar = this.a;
        xj xjVar = liVar.U;
        if (xjVar != null) {
            xjVar.m(j10, arrayList, z4, i10);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) p2Var).m(j10, arrayList, z4, i10);
        } else if (p2Var instanceof org.telegram.ui.dn0) {
            ((org.telegram.ui.dn0) p2Var).G1(arrayList);
        }
    }

    @Override // org.telegram.ui.Components.xj
    public final void x() {
        li liVar = this.a;
        xj xjVar = liVar.U;
        if (xjVar != null) {
            xjVar.x();
            return;
        }
        Object obj = liVar.c0;
        if (obj instanceof xj) {
            ((xj) obj).x();
            return;
        }
        if (obj instanceof org.telegram.ui.dn0) {
            org.telegram.ui.dn0 dn0Var = (org.telegram.ui.dn0) obj;
            dn0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                dn0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
