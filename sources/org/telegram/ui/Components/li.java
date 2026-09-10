package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class li implements kk {
    public final /* synthetic */ yi a;

    public li(yi yiVar) {
        this.a = yiVar;
    }

    @Override // org.telegram.ui.Components.kk
    public final void O() {
        this.a.B1(true);
    }

    @Override // org.telegram.ui.Components.kk
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        yi yiVar = this.a;
        kk kkVar = yiVar.X;
        if (kkVar != null) {
            kkVar.k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        Object obj = yiVar.f0;
        if (obj instanceof kk) {
            ((kk) obj).k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        if (obj instanceof org.telegram.ui.on0) {
            org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            on0Var.G1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.kk
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        yi yiVar = this.a;
        kk kkVar = yiVar.X;
        if (kkVar != null) {
            kkVar.l(j3, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            ((org.telegram.ui.eo) p2Var).l(j3, arrayList, z10, i10);
        } else if (p2Var instanceof org.telegram.ui.on0) {
            ((org.telegram.ui.on0) p2Var).G1(arrayList);
        }
    }

    @Override // org.telegram.ui.Components.kk
    public final void w() {
        yi yiVar = this.a;
        kk kkVar = yiVar.X;
        if (kkVar != null) {
            kkVar.w();
            return;
        }
        Object obj = yiVar.f0;
        if (obj instanceof kk) {
            ((kk) obj).w();
            return;
        }
        if (obj instanceof org.telegram.ui.on0) {
            org.telegram.ui.on0 on0Var = (org.telegram.ui.on0) obj;
            on0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                on0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
