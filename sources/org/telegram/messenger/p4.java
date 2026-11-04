package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p4(Object obj, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.c;
                ArrayList arrayList = g5Var.x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    int i3 = 0;
                    if (this.b != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        g5Var.h = true;
                        if (!arrayList.isEmpty() && g5Var.r) {
                            g5Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        g5Var.getUserConfig().r = (int) (System.currentTimeMillis() / 1000);
                        g5Var.getUserConfig().v(false);
                        g0.h3(new x4(g5Var, 6));
                        if (r2.a) {
                            a8.b("load contacts don't change");
                            break;
                        }
                    } else {
                        g5Var.getUserConfig().h = contacts_contacts.saved_count;
                        g5Var.getUserConfig().v(false);
                        g0.h3(new vf(g5Var, contacts_contacts.users, i3, contacts_contacts.contacts, 3));
                        break;
                    }
                }
                break;
            case 1:
                ld ldVar = (ld) this.c;
                if (tL_error == null) {
                    g0.h3(new a4(ldVar, this.b, tLObject, 1));
                    break;
                }
                break;
            case 2:
                g0.h3(new zq((nv) this.c, tLObject, this.b, 4));
                break;
            case 3:
                vv vvVar = (vv) this.c;
                long j10 = this.b;
                if (j10 == 0) {
                    vvVar.getClass();
                    break;
                } else {
                    vvVar.getMessagesStorage().q1(j10);
                    break;
                }
            default:
                yy yyVar = (yy) this.c;
                if (tL_error == null) {
                    yyVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.b;
                if (j11 == 0) {
                    yyVar.getClass();
                    break;
                } else {
                    yyVar.getMessagesStorage().q1(j11);
                    break;
                }
        }
    }
}
