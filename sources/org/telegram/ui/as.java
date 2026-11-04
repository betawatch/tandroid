package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class as implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ es c;

    public as(es esVar, ArrayList arrayList, boolean z10) {
        this.c = esVar;
        this.a = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        is isVar = this.c.a;
        if (isVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            gs gsVar = isVar.l;
            if (gsVar != null) {
                TLRPC.Document document = isVar.W;
                String str = isVar.Y;
                boolean z10 = true;
                Object obj = isVar.b0;
                if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                    z10 = false;
                }
                gsVar.l(document, str, obj, z10, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            gs gsVar2 = isVar.l;
            if (gsVar2 != null) {
                gsVar2.M(isVar.a0, isVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            org.telegram.messenger.li.b0(isVar.r).d(2, isVar.b0, isVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document2 = isVar.W;
            Object obj2 = isVar.b0;
            String str2 = isVar.Y;
            gs gsVar3 = isVar.l;
            if (gsVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.t4.K(isVar.w, gsVar3.a(), new a1.d(gsVar3, document2, str2, obj2, 12));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            org.telegram.messenger.li.b0(isVar.r).d(0, isVar.b0, isVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            isVar.l.i(isVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            isVar.l.o(isVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            isVar.l.E(isVar.W);
        }
        isVar.o();
    }
}
