package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        if (obj instanceof org.telegram.ui.qn0) {
            org.telegram.ui.qn0 qn0Var = (org.telegram.ui.qn0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            qn0Var.G1(arrayList4);
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
        org.telegram.ui.ActionBar.o2 o2Var = viVar.f0;
        if (o2Var instanceof org.telegram.ui.bo) {
            ((org.telegram.ui.bo) o2Var).l(j3, arrayList, z10, i10);
        } else if (o2Var instanceof org.telegram.ui.qn0) {
            ((org.telegram.ui.qn0) o2Var).G1(arrayList);
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
        if (obj instanceof org.telegram.ui.qn0) {
            org.telegram.ui.qn0 qn0Var = (org.telegram.ui.qn0) obj;
            qn0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                qn0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
