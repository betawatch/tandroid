package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nu implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw b;

    public /* synthetic */ nu(uw uwVar, int i3) {
        this.a = i3;
        this.b = uwVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i3 = this.a;
        uw uwVar = this.b;
        switch (i3) {
            case 0:
                ArrayList arrayList = uwVar.J2;
                if (uwVar.getParentActivity() == null) {
                    break;
                } else {
                    boolean z10 = !arrayList.isEmpty();
                    boolean z11 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (z10 && longValue != uwVar.getUserConfig().e()) {
                            z10 = false;
                        }
                        if (org.telegram.messenger.m5.C(longValue)) {
                            z11 = false;
                        }
                        TLRPC.Chat M0 = uwVar.getMessagesController().M0(Long.valueOf(-longValue));
                        if (M0 != null && !org.telegram.messenger.t3.B(M0)) {
                            z11 = false;
                        }
                    }
                    boolean z12 = uwVar.m4() && uwVar.x3();
                    if (z12) {
                        ArrayList arrayList2 = uwVar.E2;
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                Object obj = arrayList2.get(i11);
                                i11++;
                                if (((org.telegram.messenger.ye) obj).b()) {
                                    z12 = false;
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = uwVar.E2;
                    boolean z13 = arrayList3 != null && arrayList3.size() > 1;
                    org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(uwVar, view);
                    H.l(R.drawable.msg_sendfile, org.telegram.messenger.bd.M0(z13 ? 2131745645 : 2131745646, null), new au(uwVar, 5), z12);
                    H.c(R.drawable.input_notify_off, org.telegram.messenger.bd.M0(2131745593, null), new au(uwVar, 6), false);
                    H.l(R.drawable.msg_calendar2, org.telegram.messenger.bd.M0(z10 ? 2131745524 : 2131745869, null), new org.telegram.ui.Components.up0(6, uwVar, z10), z11);
                    H.Z();
                    break;
                }
                break;
            case 1:
                uw uwVar2 = this.b;
                uwVar2.D4(uwVar2.J2, org.telegram.messenger.hs.p1, true, true, null);
                break;
            case 2:
                uwVar.B4(view);
                break;
            default:
                uwVar.getContactsController().B();
                uwVar.W4();
                break;
        }
        return true;
    }
}
