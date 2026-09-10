package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lt implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ pt c;

    public lt(pt ptVar, ArrayList arrayList, boolean z10) {
        this.c = ptVar;
        this.a = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tt ttVar = this.c.a;
        if (ttVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            rt rtVar = ttVar.l;
            if (rtVar != null) {
                rtVar.l(ttVar.W, ttVar.Y, ttVar.b0, ((Integer) arrayList.get(intValue)).intValue() == 0, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            rt rtVar2 = ttVar.l;
            if (rtVar2 != null) {
                rtVar2.M(ttVar.a0, ttVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            MediaDataController.getInstance(ttVar.r).addRecentSticker(2, ttVar.b0, ttVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document = ttVar.W;
            Object obj = ttVar.b0;
            String str = ttVar.Y;
            rt rtVar3 = ttVar.l;
            if (rtVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.d5.L(ttVar.w, rtVar3.a(), new a1.d(rtVar3, document, str, obj, 10));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            MediaDataController.getInstance(ttVar.r).addRecentSticker(0, ttVar.b0, ttVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            ttVar.l.i(ttVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            ttVar.l.n(ttVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            ttVar.l.D(ttVar.W);
        }
        ttVar.p();
    }
}
