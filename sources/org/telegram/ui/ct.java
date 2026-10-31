package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ct implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gt c;

    public ct(gt gtVar, ArrayList arrayList, boolean z10) {
        this.c = gtVar;
        this.a = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lt ltVar = this.c.a;
        if (ltVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            jt jtVar = ltVar.l;
            if (jtVar != null) {
                TLRPC.Document document = ltVar.W;
                String str = ltVar.Y;
                boolean z10 = true;
                Object obj = ltVar.b0;
                if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                    z10 = false;
                }
                jtVar.l(document, str, obj, z10, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            jt jtVar2 = ltVar.l;
            if (jtVar2 != null) {
                jtVar2.L(ltVar.a0, ltVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            org.telegram.messenger.ui.b0(ltVar.r).d(2, ltVar.b0, ltVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document2 = ltVar.W;
            Object obj2 = ltVar.b0;
            String str2 = ltVar.Y;
            jt jtVar3 = ltVar.l;
            if (jtVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.s4.K(ltVar.w, jtVar3.a(), new a1.d(jtVar3, document2, str2, obj2, 9));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            org.telegram.messenger.ui.b0(ltVar.r).d(0, ltVar.b0, ltVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            ltVar.l.i(ltVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            ltVar.l.n(ltVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            ltVar.l.E(ltVar.W);
        }
        ltVar.o();
    }
}
