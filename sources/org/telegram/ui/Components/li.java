package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class li implements jk {
    public final /* synthetic */ yi a;

    public li(yi yiVar) {
        this.a = yiVar;
    }

    @Override // org.telegram.ui.Components.jk
    public final void O() {
        this.a.E1(true);
    }

    @Override // org.telegram.ui.Components.jk
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        yi yiVar = this.a;
        jk jkVar = yiVar.X;
        if (jkVar != null) {
            jkVar.k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        Object obj = yiVar.f0;
        if (obj instanceof jk) {
            ((jk) obj).k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        if (obj instanceof org.telegram.ui.nn0) {
            org.telegram.ui.nn0 nn0Var = (org.telegram.ui.nn0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            nn0Var.F1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.jk
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        yi yiVar = this.a;
        jk jkVar = yiVar.X;
        if (jkVar != null) {
            jkVar.l(j3, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            ((org.telegram.ui.zn) n2Var).l(j3, arrayList, z10, i10);
        } else if (n2Var instanceof org.telegram.ui.nn0) {
            ((org.telegram.ui.nn0) n2Var).F1(arrayList);
        }
    }

    @Override // org.telegram.ui.Components.jk
    public final void x() {
        yi yiVar = this.a;
        jk jkVar = yiVar.X;
        if (jkVar != null) {
            jkVar.x();
            return;
        }
        Object obj = yiVar.f0;
        if (obj instanceof jk) {
            ((jk) obj).x();
            return;
        }
        if (obj instanceof org.telegram.ui.nn0) {
            org.telegram.ui.nn0 nn0Var = (org.telegram.ui.nn0) obj;
            nn0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                nn0Var.startActivityForResult(intent, 21);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
