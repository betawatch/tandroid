package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class cs implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gs c;

    public cs(gs gsVar, ArrayList arrayList, boolean z9) {
        this.c = gsVar;
        this.a = arrayList;
        this.b = z9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ks ksVar = this.c.a;
        if (ksVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            is isVar = ksVar.l;
            if (isVar != null) {
                TLRPC.Document document = ksVar.W;
                String str = ksVar.Y;
                boolean z9 = true;
                Object obj = ksVar.b0;
                if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                    z9 = false;
                }
                isVar.l(document, str, obj, z9, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            is isVar2 = ksVar.l;
            if (isVar2 != null) {
                isVar2.M(ksVar.a0, ksVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            org.telegram.messenger.ui.b0(ksVar.r).d(2, ksVar.b0, ksVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document2 = ksVar.W;
            Object obj2 = ksVar.b0;
            String str2 = ksVar.Y;
            is isVar3 = ksVar.l;
            if (isVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.v4.I(ksVar.w, isVar3.a(), new a1.d(isVar3, document2, str2, obj2, 13));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            org.telegram.messenger.ui.b0(ksVar.r).d(0, ksVar.b0, ksVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            ksVar.l.i(ksVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            ksVar.l.o(ksVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            ksVar.l.F(ksVar.W);
        }
        ksVar.o();
    }
}
