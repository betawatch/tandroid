package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class di implements ek {
    public final /* synthetic */ ti a;

    public di(ti tiVar) {
        this.a = tiVar;
    }

    @Override // org.telegram.ui.Components.ek
    public final void P() {
        this.a.G1(true);
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

    @Override // org.telegram.ui.Components.ek
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        ti tiVar = this.a;
        ek ekVar = tiVar.X;
        if (ekVar != null) {
            ekVar.m(j10, arrayList, z10, i10);
            return;
        }
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f0;
        if (r2Var instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) r2Var).m(j10, arrayList, z10, i10);
        } else if (r2Var instanceof org.telegram.ui.in0) {
            ((org.telegram.ui.in0) r2Var).G1(arrayList);
        }
    }

    @Override // org.telegram.ui.Components.ek
    public final void x() {
        ti tiVar = this.a;
        ek ekVar = tiVar.X;
        if (ekVar != null) {
            ekVar.x();
            return;
        }
        Object obj = tiVar.f0;
        if (obj instanceof ek) {
            ((ek) obj).x();
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
