package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                        g0.h3(new cg(g5Var, contacts_contacts.users, i7, contacts_contacts.contacts, 3));
                        break;
                    }
                }
                break;
            case 1:
                rd rdVar = (rd) this.c;
                if (tL_error == null) {
                    g0.h3(new a4(rdVar, this.b, tLObject, 1));
                    break;
                }
                break;
            case 2:
                g0.h3(new dr((tv) this.c, tLObject, this.b, 4));
                break;
            case 3:
                bw bwVar = (bw) this.c;
                long j3 = this.b;
                if (j3 == 0) {
                    bwVar.getClass();
                    break;
                } else {
                    bwVar.getMessagesStorage().q1(j3);
                    break;
                }
            default:
                ez ezVar = (ez) this.c;
                if (tL_error == null) {
                    ezVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                }
                long j10 = this.b;
                if (j10 == 0) {
                    ezVar.getClass();
                    break;
                } else {
                    ezVar.getMessagesStorage().q1(j10);
                    break;
                }
        }
    }
}
