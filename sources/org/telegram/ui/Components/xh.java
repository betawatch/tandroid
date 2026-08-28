package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xh implements wj {
    public final /* synthetic */ ki a;

    public xh(ki kiVar) {
        this.a = kiVar;
    }

    @Override // org.telegram.ui.Components.wj
    public final void N() {
        this.a.B1(true);
    }

    @Override // org.telegram.ui.Components.wj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i9, long j10, boolean z11, long j11) {
        ki kiVar = this.a;
        wj wjVar = kiVar.T;
        if (wjVar != null) {
            wjVar.l(arrayList, str, arrayList2, arrayList3, z10, i9, j10, z11, j11);
            return;
        }
        Object obj = kiVar.b0;
        if (obj instanceof wj) {
            ((wj) obj).l(arrayList, str, arrayList2, arrayList3, z10, i9, j10, z11, j11);
            return;
        }
        if (obj instanceof org.telegram.ui.wm0) {
            org.telegram.ui.wm0 wm0Var = (org.telegram.ui.wm0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i10);
                arrayList4.add(sendingMediaInfo);
            }
            wm0Var.G1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.wj
    public final void m(long j10, ArrayList arrayList, boolean z10, int i9) {
        ki kiVar = this.a;
        wj wjVar = kiVar.T;
        if (wjVar != null) {
            wjVar.m(j10, arrayList, z10, i9);
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            ((org.telegram.ui.qn) o2Var).m(j10, arrayList, z10, i9);
        } else if (o2Var instanceof org.telegram.ui.wm0) {
            ((org.telegram.ui.wm0) o2Var).G1(arrayList);
        }
    }

    @Override // org.telegram.ui.Components.wj
    public final void x() {
        ki kiVar = this.a;
        wj wjVar = kiVar.T;
        if (wjVar != null) {
            wjVar.x();
            return;
        }
        Object obj = kiVar.b0;
        if (obj instanceof wj) {
            ((wj) obj).x();
            return;
        }
        if (obj instanceof org.telegram.ui.wm0) {
            org.telegram.ui.wm0 wm0Var = (org.telegram.ui.wm0) obj;
            wm0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                wm0Var.startActivityForResult(intent, 21);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }
}
