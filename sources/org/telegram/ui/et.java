package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class et implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ jt c;

    public et(jt jtVar, ArrayList arrayList, boolean z10) {
        this.c = jtVar;
        this.a = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nt ntVar = this.c.a;
        if (ntVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            lt ltVar = ntVar.l;
            if (ltVar != null) {
                ltVar.n(ntVar.W, ntVar.Y, ntVar.b0, ((Integer) arrayList.get(intValue)).intValue() == 0, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            lt ltVar2 = ntVar.l;
            if (ltVar2 != null) {
                ltVar2.M(ntVar.a0, ntVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            MediaDataController.getInstance(ntVar.r).addRecentSticker(2, ntVar.b0, ntVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document = ntVar.W;
            Object obj = ntVar.b0;
            String str = ntVar.Y;
            lt ltVar3 = ntVar.l;
            if (ltVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.e5.L(ntVar.w, ltVar3.a(), new a1.d(ltVar3, document, str, obj, 10));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            MediaDataController.getInstance(ntVar.r).addRecentSticker(0, ntVar.b0, ntVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            ntVar.l.k(ntVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            ntVar.l.p(ntVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            ntVar.l.F(ntVar.W);
        }
        ntVar.p();
    }
}
