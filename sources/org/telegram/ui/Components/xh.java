package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xh implements zj {
    public final /* synthetic */ mi a;

    public xh(mi miVar) {
        this.a = miVar;
    }

    @Override // org.telegram.ui.Components.zj
    public final void O() {
        this.a.B1(true);
    }

    @Override // org.telegram.ui.Components.zj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        mi miVar = this.a;
        zj zjVar = miVar.U;
        if (zjVar != null) {
            zjVar.l(arrayList, str, arrayList2, arrayList3, z4, i10, j10, z10, j11);
            return;
        }
        Object obj = miVar.c0;
        if (obj instanceof zj) {
            ((zj) obj).l(arrayList, str, arrayList2, arrayList3, z4, i10, j10, z10, j11);
            return;
        }
        if (obj instanceof org.telegram.ui.fn0) {
            org.telegram.ui.fn0 fn0Var = (org.telegram.ui.fn0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            fn0Var.G1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.zj
    public final void m(long j10, ArrayList arrayList, boolean z4, int i10) {
        mi miVar = this.a;
        zj zjVar = miVar.U;
        if (zjVar != null) {
            zjVar.m(j10, arrayList, z4, i10);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = miVar.c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) p2Var).m(j10, arrayList, z4, i10);
        } else if (p2Var instanceof org.telegram.ui.fn0) {
            ((org.telegram.ui.fn0) p2Var).G1(arrayList);
        }
    }

    @Override // org.telegram.ui.Components.zj
    public final void x() {
        mi miVar = this.a;
        zj zjVar = miVar.U;
        if (zjVar != null) {
            zjVar.x();
            return;
        }
        Object obj = miVar.c0;
        if (obj instanceof zj) {
            ((zj) obj).x();
            return;
        }
        if (obj instanceof org.telegram.ui.fn0) {
            org.telegram.ui.fn0 fn0Var = (org.telegram.ui.fn0) obj;
            fn0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                fn0Var.startActivityForResult(intent, 21);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }
}
