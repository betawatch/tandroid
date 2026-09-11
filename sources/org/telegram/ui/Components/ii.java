package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ii implements fk {
    public final /* synthetic */ vi a;

    public ii(vi viVar) {
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.fk
    public final void O() {
        this.a.B1(true);
    }

    @Override // org.telegram.ui.Components.fk
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        vi viVar = this.a;
        fk fkVar = viVar.X;
        if (fkVar != null) {
            fkVar.k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        Object obj = viVar.f0;
        if (obj instanceof fk) {
            ((fk) obj).k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        if (obj instanceof org.telegram.ui.pn0) {
            org.telegram.ui.pn0 pn0Var = (org.telegram.ui.pn0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            pn0Var.G1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.fk
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        vi viVar = this.a;
        fk fkVar = viVar.X;
        if (fkVar != null) {
            fkVar.l(j3, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
        if (n2Var instanceof org.telegram.ui.co) {
            ((org.telegram.ui.co) n2Var).l(j3, arrayList, z10, i10);
        } else if (n2Var instanceof org.telegram.ui.pn0) {
            ((org.telegram.ui.pn0) n2Var).G1(arrayList);
        }
    }

    @Override // org.telegram.ui.Components.fk
    public final void w() {
        vi viVar = this.a;
        fk fkVar = viVar.X;
        if (fkVar != null) {
            fkVar.w();
            return;
        }
        Object obj = viVar.f0;
        if (obj instanceof fk) {
            ((fk) obj).w();
            return;
        }
        if (obj instanceof org.telegram.ui.pn0) {
            org.telegram.ui.pn0 pn0Var = (org.telegram.ui.pn0) obj;
            pn0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                pn0Var.startActivityForResult(intent, 21);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
