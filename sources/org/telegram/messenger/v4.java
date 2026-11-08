package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class v4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v4(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.c;
                ArrayList arrayList = g5Var.x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    int i7 = 0;
                    if (this.b != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        g5Var.h = true;
                        if (!arrayList.isEmpty() && g5Var.r) {
                            g5Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        g5Var.getUserConfig().r = (int) (System.currentTimeMillis() / 1000);
                        g5Var.getUserConfig().v(false);
                        g0.h3(new k4(g5Var, 6));
                        if (r2.a) {
                            a8.b("load contacts don't change");
                            break;
                        }
                    } else {
                        g5Var.getUserConfig().h = contacts_contacts.saved_count;
                        g5Var.getUserConfig().v(false);
                        g0.h3(new dg(g5Var, contacts_contacts.users, i7, contacts_contacts.contacts, 3));
                        break;
                    }
                }
                break;
            case 1:
                sd sdVar = (sd) this.c;
                if (tL_error == null) {
                    g0.h3(new a4(sdVar, this.b, tLObject, 1));
                    break;
                }
                break;
            case 2:
                g0.h3(new ir((vv) this.c, tLObject, this.b, 4));
                break;
            case 3:
                dw dwVar = (dw) this.c;
                long j3 = this.b;
                if (j3 == 0) {
                    dwVar.getClass();
                    break;
                } else {
                    dwVar.getMessagesStorage().q1(j3);
                    break;
                }
            default:
                gz gzVar = (gz) this.c;
                if (tL_error == null) {
                    gzVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                }
                long j10 = this.b;
                if (j10 == 0) {
                    gzVar.getClass();
                    break;
                } else {
                    gzVar.getMessagesStorage().q1(j10);
                    break;
                }
        }
    }
}
