package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class pt implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tt c;

    public pt(tt ttVar, ArrayList arrayList, boolean z10) {
        this.c = ttVar;
        this.a = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xt xtVar = this.c.a;
        if (xtVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            vt vtVar = xtVar.l;
            if (vtVar != null) {
                TLRPC.Document document = xtVar.W;
                String str = xtVar.Y;
                boolean z10 = true;
                Object obj = xtVar.b0;
                if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                    z10 = false;
                }
                vtVar.m(document, str, obj, z10, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            vt vtVar2 = xtVar.l;
            if (vtVar2 != null) {
                vtVar2.M(xtVar.a0, xtVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            MediaDataController.getInstance(xtVar.r).addRecentSticker(2, xtVar.b0, xtVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document2 = xtVar.W;
            Object obj2 = xtVar.b0;
            String str2 = xtVar.Y;
            vt vtVar3 = xtVar.l;
            if (vtVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.g5.K(xtVar.w, vtVar3.a(), new a1.d(vtVar3, document2, str2, obj2, 10));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            MediaDataController.getInstance(xtVar.r).addRecentSticker(0, xtVar.b0, xtVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            xtVar.l.j(xtVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            xtVar.l.o(xtVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            xtVar.l.F(xtVar.W);
        }
        xtVar.p();
    }
}
