package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pu implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx b;

    public /* synthetic */ pu(bx bxVar, int i7) {
        this.a = i7;
        this.b = bxVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i7 = this.a;
        bx bxVar = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = bxVar.K2;
                if (bxVar.getParentActivity() == null) {
                    break;
                } else {
                    boolean z10 = !arrayList.isEmpty();
                    boolean z11 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (z10 && longValue != bxVar.getUserConfig().e()) {
                            z10 = false;
                        }
                        if (org.telegram.messenger.n5.C(longValue)) {
                            z11 = false;
                        }
                        TLRPC.Chat O0 = bxVar.getMessagesController().O0(Long.valueOf(-longValue));
                        if (O0 != null && !org.telegram.messenger.v3.B(O0)) {
                            z11 = false;
                        }
                    }
                    boolean z12 = bxVar.o4() && bxVar.x3();
                    if (z12) {
                        ArrayList arrayList2 = bxVar.F2;
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                Object obj = arrayList2.get(i11);
                                i11++;
                                if (((org.telegram.messenger.ef) obj).b()) {
                                    z12 = false;
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = bxVar.F2;
                    boolean z13 = arrayList3 != null && arrayList3.size() > 1;
                    org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(bxVar, view);
                    I.l(R.drawable.msg_sendfile, org.telegram.messenger.gd.N0(z13 ? 2131745439 : 2131745440, null), new fu(bxVar, 13), z12);
                    I.c(R.drawable.input_notify_off, org.telegram.messenger.gd.N0(2131745387, null), new fu(bxVar, 14), false);
                    I.l(R.drawable.msg_calendar2, org.telegram.messenger.gd.N0(z10 ? 2131745318 : 2131745663, null), new org.telegram.ui.Components.qp0(7, bxVar, z10), z11);
                    I.a0();
                    break;
                }
                break;
            case 1:
                bx bxVar2 = this.b;
                bxVar2.K4(bxVar2.K2, org.telegram.messenger.ks.p1, true, true, null);
                break;
            case 2:
                bxVar.G4(view);
                break;
            default:
                bxVar.getContactsController().B();
                bxVar.e5();
                break;
        }
        return true;
    }
}
