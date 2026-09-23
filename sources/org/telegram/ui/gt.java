package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gt implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ lt c;

    public gt(lt ltVar, ArrayList arrayList, boolean z10) {
        this.c = ltVar;
        this.a = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        pt ptVar = this.c.a;
        if (ptVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            nt ntVar = ptVar.l;
            if (ntVar != null) {
                ntVar.n(ptVar.W, ptVar.Y, ptVar.b0, ((Integer) arrayList.get(intValue)).intValue() == 0, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            nt ntVar2 = ptVar.l;
            if (ntVar2 != null) {
                ntVar2.M(ptVar.a0, ptVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            MediaDataController.getInstance(ptVar.r).addRecentSticker(2, ptVar.b0, ptVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document = ptVar.W;
            Object obj = ptVar.b0;
            String str = ptVar.Y;
            nt ntVar3 = ptVar.l;
            if (ntVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.e5.L(ptVar.w, ntVar3.a(), new a1.d(ntVar3, document, str, obj, 10));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            MediaDataController.getInstance(ptVar.r).addRecentSticker(0, ptVar.b0, ptVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            ptVar.l.k(ptVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            ptVar.l.p(ptVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            ptVar.l.F(ptVar.W);
        }
        ptVar.p();
    }
}
