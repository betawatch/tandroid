package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ji implements gk {
    public final /* synthetic */ wi a;

    public ji(wi wiVar) {
        this.a = wiVar;
    }

    @Override // org.telegram.ui.Components.gk
    public final void O() {
        this.a.B1(true);
    }

    @Override // org.telegram.ui.Components.gk
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        wi wiVar = this.a;
        gk gkVar = wiVar.X;
        if (gkVar != null) {
            gkVar.k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        Object obj = wiVar.f0;
        if (obj instanceof gk) {
            ((gk) obj).k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        if (obj instanceof org.telegram.ui.in0) {
            org.telegram.ui.in0 in0Var = (org.telegram.ui.in0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            in0Var.G1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.gk
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        wi wiVar = this.a;
        gk gkVar = wiVar.X;
        if (gkVar != null) {
            gkVar.l(j3, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = wiVar.f0;
        if (n2Var instanceof org.telegram.ui.xn) {
            ((org.telegram.ui.xn) n2Var).l(j3, arrayList, z10, i10);
        } else if (n2Var instanceof org.telegram.ui.in0) {
            ((org.telegram.ui.in0) n2Var).G1(arrayList);
        }
    }

    @Override // org.telegram.ui.Components.gk
    public final void w() {
        wi wiVar = this.a;
        gk gkVar = wiVar.X;
        if (gkVar != null) {
            gkVar.w();
            return;
        }
        Object obj = wiVar.f0;
        if (obj instanceof gk) {
            ((gk) obj).w();
            return;
        }
        if (obj instanceof org.telegram.ui.in0) {
            org.telegram.ui.in0 in0Var = (org.telegram.ui.in0) obj;
            in0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                in0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
