package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ht implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ mt c;

    public ht(mt mtVar, ArrayList arrayList, boolean z4) {
        this.c = mtVar;
        this.a = arrayList;
        this.b = z4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qt qtVar = this.c.a;
        if (qtVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            ot otVar = qtVar.l;
            if (otVar != null) {
                otVar.l(qtVar.W, qtVar.Y, qtVar.b0, ((Integer) arrayList.get(intValue)).intValue() == 0, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            ot otVar2 = qtVar.l;
            if (otVar2 != null) {
                otVar2.M(qtVar.a0, qtVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            MediaDataController.getInstance(qtVar.r).addRecentSticker(2, qtVar.b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document = qtVar.W;
            Object obj = qtVar.b0;
            String str = qtVar.Y;
            ot otVar3 = qtVar.l;
            if (otVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.z4.L(qtVar.w, otVar3.a(), new a1.d(otVar3, document, str, obj, 11));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            MediaDataController.getInstance(qtVar.r).addRecentSticker(0, qtVar.b0, qtVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            qtVar.l.i(qtVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            qtVar.l.n(qtVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            qtVar.l.E(qtVar.W);
        }
        qtVar.p();
    }
}
