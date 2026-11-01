package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                TLRPC.Document document = ktVar.W;
                String str = ktVar.Y;
                boolean z10 = true;
                Object obj = ktVar.b0;
                if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                    z10 = false;
                }
                htVar.l(document, str, obj, z10, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            ht htVar2 = ktVar.l;
            if (htVar2 != null) {
                htVar2.L(ktVar.a0, ktVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            org.telegram.messenger.vi.b0(ktVar.r).d(2, ktVar.b0, ktVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document2 = ktVar.W;
            Object obj2 = ktVar.b0;
            String str2 = ktVar.Y;
            ht htVar3 = ktVar.l;
            if (htVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.s4.K(ktVar.w, htVar3.a(), new a1.d(htVar3, document2, str2, obj2, 9));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            org.telegram.messenger.vi.b0(ktVar.r).d(0, ktVar.b0, ktVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            ktVar.l.i(ktVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            ktVar.l.n(ktVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            ktVar.l.E(ktVar.W);
        }
        ktVar.o();
    }
}
