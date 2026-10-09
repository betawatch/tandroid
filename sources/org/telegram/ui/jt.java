package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jt implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nt c;

    public jt(nt ntVar, ArrayList arrayList, boolean z10) {
        this.c = ntVar;
        this.a = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        rt rtVar = this.c.a;
        if (rtVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            pt ptVar = rtVar.l;
            if (ptVar != null) {
                TLRPC.Document document = rtVar.W;
                String str = rtVar.Y;
                boolean z10 = true;
                Object obj = rtVar.b0;
                if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                    z10 = false;
                }
                ptVar.n(document, str, obj, z10, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            pt ptVar2 = rtVar.l;
            if (ptVar2 != null) {
                ptVar2.M(rtVar.a0, rtVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            MediaDataController.getInstance(rtVar.r).addRecentSticker(2, rtVar.b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document2 = rtVar.W;
            Object obj2 = rtVar.b0;
            String str2 = rtVar.Y;
            pt ptVar3 = rtVar.l;
            if (ptVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.g5.K(rtVar.w, ptVar3.a(), new a1.d(ptVar3, document2, str2, obj2, 10));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            MediaDataController.getInstance(rtVar.r).addRecentSticker(0, rtVar.b0, rtVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            rtVar.l.k(rtVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            rtVar.l.p(rtVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            rtVar.l.F(rtVar.W);
        }
        rtVar.p();
    }
}
