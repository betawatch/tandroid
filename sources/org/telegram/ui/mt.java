package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class mt implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qt c;

    public mt(qt qtVar, ArrayList arrayList, boolean z10) {
        this.c = qtVar;
        this.a = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ut utVar = this.c.a;
        if (utVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            st stVar = utVar.l;
            if (stVar != null) {
                stVar.m(utVar.W, utVar.Y, utVar.b0, ((Integer) arrayList.get(intValue)).intValue() == 0, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            st stVar2 = utVar.l;
            if (stVar2 != null) {
                stVar2.M(utVar.a0, utVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            MediaDataController.getInstance(utVar.r).addRecentSticker(2, utVar.b0, utVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document = utVar.W;
            Object obj = utVar.b0;
            String str = utVar.Y;
            st stVar3 = utVar.l;
            if (stVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.c5.L(utVar.w, stVar3.a(), new a1.d(stVar3, document, str, obj, 10));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            MediaDataController.getInstance(utVar.r).addRecentSticker(0, utVar.b0, utVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            utVar.l.j(utVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            utVar.l.o(utVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            utVar.l.E(utVar.W);
        }
        utVar.p();
    }
}
