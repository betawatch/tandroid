package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class hi implements ik {
    public final /* synthetic */ xi a;

    public hi(xi xiVar) {
        this.a = xiVar;
    }

    @Override // org.telegram.ui.Components.ik
    public final void M() {
        this.a.y1(true);
    }

    @Override // org.telegram.ui.Components.ik
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        xi xiVar = this.a;
        ik ikVar = xiVar.X;
        if (ikVar != null) {
            ikVar.k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        Object obj = xiVar.f0;
        if (obj instanceof ik) {
            ((ik) obj).k(arrayList, str, arrayList2, arrayList3, z10, i10, j3, z11, j10);
            return;
        }
        if (obj instanceof org.telegram.ui.kn0) {
            org.telegram.ui.kn0 kn0Var = (org.telegram.ui.kn0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                sendingMediaInfo.path = (String) arrayList.get(i11);
                arrayList4.add(sendingMediaInfo);
            }
            kn0Var.G1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.ik
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        xi xiVar = this.a;
        ik ikVar = xiVar.X;
        if (ikVar != null) {
            ikVar.l(j3, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = xiVar.f0;
        if (n2Var instanceof org.telegram.ui.yn) {
            ((org.telegram.ui.yn) n2Var).l(j3, arrayList, z10, i10);
        } else if (n2Var instanceof org.telegram.ui.kn0) {
            ((org.telegram.ui.kn0) n2Var).G1(arrayList);
        }
    }

    @Override // org.telegram.ui.Components.ik
    public final void w() {
        xi xiVar = this.a;
        ik ikVar = xiVar.X;
        if (ikVar != null) {
            ikVar.w();
            return;
        }
        Object obj = xiVar.f0;
        if (obj instanceof ik) {
            ((ik) obj).w();
            return;
        }
        if (obj instanceof org.telegram.ui.kn0) {
            org.telegram.ui.kn0 kn0Var = (org.telegram.ui.kn0) obj;
            kn0Var.getClass();
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                kn0Var.startActivityForResult(intent, 21);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }
}
