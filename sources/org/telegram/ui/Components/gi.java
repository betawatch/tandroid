package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class gi implements ek {
    public final /* synthetic */ ti a;

    public gi(ti tiVar) {
        this.a = tiVar;
    }

    @Override // org.telegram.ui.Components.ek
    public final void O() {
        this.a.E1(true);
    }

    @Override // org.telegram.ui.Components.ek
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        ti tiVar = this.a;
        ek ekVar = tiVar.X;
        if (ekVar != null) {
            ekVar.l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        Object obj = tiVar.f0;
        if (obj instanceof ek) {
            ((ek) obj).l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        if (obj instanceof org.telegram.ui.vm0) {
            org.telegram.ui.vm0 vm0Var = (org.telegram.ui.vm0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            vm0Var.F1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.ek
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        ti tiVar = this.a;
        ek ekVar = tiVar.X;
        if (ekVar != null) {
            ekVar.m(j10, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f0;
        if (n2Var instanceof org.telegram.ui.qn) {
            ((org.telegram.ui.qn) n2Var).m(j10, arrayList, z10, i10);
        } else if (n2Var instanceof org.telegram.ui.vm0) {
            ((org.telegram.ui.vm0) n2Var).F1(arrayList);
        }
    }

    @Override // org.telegram.ui.Components.ek
    public final void y() {
        ti tiVar = this.a;
        ek ekVar = tiVar.X;
        if (ekVar != null) {
            ekVar.y();
            return;
        }
        Object obj = tiVar.f0;
        if (obj instanceof ek) {
            ((ek) obj).y();
            return;
        }
        if (obj instanceof org.telegram.ui.vm0) {
            org.telegram.ui.vm0 vm0Var = (org.telegram.ui.vm0) obj;
            vm0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                vm0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
