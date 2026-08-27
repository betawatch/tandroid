package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bt implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ft c;

    public bt(ft ftVar, ArrayList arrayList, boolean z10) {
        this.c = ftVar;
        this.a = arrayList;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kt ktVar = this.c.a;
        if (ktVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            ht htVar = ktVar.l;
            if (htVar != null) {
                htVar.l(ktVar.W, ktVar.Y, ktVar.b0, ((Integer) arrayList.get(intValue)).intValue() == 0, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            ht htVar2 = ktVar.l;
            if (htVar2 != null) {
                htVar2.M(ktVar.a0, ktVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            MediaDataController.getInstance(ktVar.r).addRecentSticker(2, ktVar.b0, ktVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document = ktVar.W;
            Object obj = ktVar.b0;
            String str = ktVar.Y;
            ht htVar3 = ktVar.l;
            if (htVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.y4.L(ktVar.w, htVar3.a(), new a1.d(htVar3, document, str, obj, 12));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            MediaDataController.getInstance(ktVar.r).addRecentSticker(0, ktVar.b0, ktVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            ktVar.l.i(ktVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            ktVar.l.n(ktVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            ktVar.l.D(ktVar.W);
        }
        ktVar.p();
    }
}
