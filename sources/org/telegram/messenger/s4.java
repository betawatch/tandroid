package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class s4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s4(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i5 i5Var = (i5) this.c;
                ArrayList arrayList = i5Var.x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    int i10 = 0;
                    if (this.b != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        i5Var.h = true;
                        if (!arrayList.isEmpty() && i5Var.r) {
                            i5Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        i5Var.getUserConfig().r = (int) (System.currentTimeMillis() / 1000);
                        i5Var.getUserConfig().v(false);
                        i0.g3(new a5(i5Var, 6));
                        if (v2.a) {
                            f8.b("load contacts don't change");
                            break;
                        }
                    } else {
                        i5Var.getUserConfig().h = contacts_contacts.saved_count;
                        i5Var.getUserConfig().v(false);
                        i0.g3(new dg(i5Var, contacts_contacts.users, i10, contacts_contacts.contacts, 3));
                        break;
                    }
                }
                break;
            case 1:
                od odVar = (od) this.c;
                if (tL_error == null) {
                    i0.g3(new d4(odVar, this.b, tLObject, 1));
                    break;
                }
                break;
            case 2:
                i0.g3(new pr((hw) this.c, tLObject, this.b, 4));
                break;
            case 3:
                pw pwVar = (pw) this.c;
                long j10 = this.b;
                if (j10 == 0) {
                    pwVar.getClass();
                    break;
                } else {
                    pwVar.getMessagesStorage().q1(j10);
                    break;
                }
            default:
                rz rzVar = (rz) this.c;
                if (tL_error == null) {
                    rzVar.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                }
                long j11 = this.b;
                if (j11 == 0) {
                    rzVar.getClass();
                    break;
                } else {
                    rzVar.getMessagesStorage().q1(j11);
                    break;
                }
        }
    }
}
