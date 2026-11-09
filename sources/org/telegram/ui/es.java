package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class es implements View.OnClickListener {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ is c;

    public es(is isVar, ArrayList arrayList, boolean z9) {
        this.c = isVar;
        this.a = arrayList;
        this.b = z9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ms msVar = this.c.a;
        if (msVar.w == null) {
            return;
        }
        int intValue = ((Integer) view.getTag()).intValue();
        ArrayList arrayList = this.a;
        if (((Integer) arrayList.get(intValue)).intValue() == 0 || ((Integer) arrayList.get(intValue)).intValue() == 6) {
            ks ksVar = msVar.l;
            if (ksVar != null) {
                TLRPC.Document document = msVar.W;
                String str = msVar.Y;
                boolean z9 = true;
                Object obj = msVar.b0;
                if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                    z9 = false;
                }
                ksVar.l(document, str, obj, z9, 0, 0);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 1) {
            ks ksVar2 = msVar.l;
            if (ksVar2 != null) {
                ksVar2.M(msVar.a0, msVar.i);
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
            org.telegram.messenger.ui.b0(msVar.r).d(2, msVar.b0, msVar.W, (int) (System.currentTimeMillis() / 1000), this.b);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
            TLRPC.Document document2 = msVar.W;
            Object obj2 = msVar.b0;
            String str2 = msVar.Y;
            ks ksVar3 = msVar.l;
            if (ksVar3 == null) {
                return;
            } else {
                org.telegram.ui.Components.v4.I(msVar.w, ksVar3.a(), new a1.d(ksVar3, document2, str2, obj2, 13));
            }
        } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
            org.telegram.messenger.ui.b0(msVar.r).d(0, msVar.b0, msVar.W, (int) (System.currentTimeMillis() / 1000), true);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
            msVar.l.i(msVar.X);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
            msVar.l.o(msVar.W);
        } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
            msVar.l.F(msVar.W);
        }
        msVar.o();
    }
}
