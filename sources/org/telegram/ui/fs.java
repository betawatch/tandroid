package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fs implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ js c;

    public fs(js jsVar, ArrayList arrayList, boolean z9) {
        this.c = jsVar;
        this.a = arrayList;
        this.b = z9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ns nsVar = this.c.a;
        if (nsVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            ls lsVar = nsVar.l;
            if (lsVar != null) {
                TLRPC.Document document = nsVar.W;
                String str = nsVar.Y;
                boolean z9 = true;
                Object obj = nsVar.b0;
                if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                    z9 = false;
                }
                lsVar.l(document, str, obj, z9, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            ls lsVar2 = nsVar.l;
            if (lsVar2 != null) {
                lsVar2.M(nsVar.a0, nsVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            org.telegram.messenger.ui.b0(nsVar.r).d(2, nsVar.b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document2 = nsVar.W;
            Object obj2 = nsVar.b0;
            String str2 = nsVar.Y;
            ls lsVar3 = nsVar.l;
            if (lsVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.u4.I(nsVar.w, lsVar3.a(), new a1.d(lsVar3, document2, str2, obj2, 13));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            org.telegram.messenger.ui.b0(nsVar.r).d(0, nsVar.b0, nsVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            nsVar.l.i(nsVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            nsVar.l.o(nsVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            nsVar.l.F(nsVar.W);
        }
        nsVar.o();
    }
}
