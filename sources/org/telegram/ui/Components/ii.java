package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ii implements gk {
    public final /* synthetic */ vi a;

    public ii(vi viVar) {
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.gk
    public final void O() {
        this.a.E1(true);
    }

    @Override // org.telegram.ui.Components.gk
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        vi viVar = this.a;
        gk gkVar = viVar.X;
        if (gkVar != null) {
            gkVar.l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        Object obj = viVar.f0;
        if (obj instanceof gk) {
            ((gk) obj).l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        if (obj instanceof org.telegram.ui.un0) {
            org.telegram.ui.un0 un0Var = (org.telegram.ui.un0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            un0Var.F1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.gk
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        vi viVar = this.a;
        gk gkVar = viVar.X;
        if (gkVar != null) {
            gkVar.m(j10, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            ((org.telegram.ui.fo) m2Var).m(j10, arrayList, z10, i10);
        } else if (m2Var instanceof org.telegram.ui.un0) {
            ((org.telegram.ui.un0) m2Var).F1(arrayList);
        }
    }

    @Override // org.telegram.ui.Components.gk
    public final void y() {
        vi viVar = this.a;
        gk gkVar = viVar.X;
        if (gkVar != null) {
            gkVar.y();
            return;
        }
        Object obj = viVar.f0;
        if (obj instanceof gk) {
            ((gk) obj).y();
            return;
        }
        if (obj instanceof org.telegram.ui.un0) {
            org.telegram.ui.un0 un0Var = (org.telegram.ui.un0) obj;
            un0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                un0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
