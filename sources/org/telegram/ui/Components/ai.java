package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ai implements zj {
    public final /* synthetic */ ni a;

    public ai(ni niVar) {
        this.a = niVar;
    }

    @Override // org.telegram.ui.Components.zj
    public final void O() {
        this.a.B1(true);
    }

    @Override // org.telegram.ui.Components.zj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        ni niVar = this.a;
        zj zjVar = niVar.T;
        if (zjVar != null) {
            zjVar.l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        Object obj = niVar.b0;
        if (obj instanceof zj) {
            ((zj) obj).l(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
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
            vm0Var.G1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.zj
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        ni niVar = this.a;
        zj zjVar = niVar.T;
        if (zjVar != null) {
            zjVar.m(j10, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            ((org.telegram.ui.tn) o2Var).m(j10, arrayList, z10, i10);
        } else if (o2Var instanceof org.telegram.ui.vm0) {
            ((org.telegram.ui.vm0) o2Var).G1(arrayList);
        }
    }

    @Override // org.telegram.ui.Components.zj
    public final void x() {
        ni niVar = this.a;
        zj zjVar = niVar.T;
        if (zjVar != null) {
            zjVar.x();
            return;
        }
        Object obj = niVar.b0;
        if (obj instanceof zj) {
            ((zj) obj).x();
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
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }
}
