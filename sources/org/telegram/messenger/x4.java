package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class x4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x4(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i5 i5Var = (i5) this.c;
                ArrayList arrayList = i5Var.x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    int i7 = 0;
                    if (this.b != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        i5Var.h = true;
                        if (!arrayList.isEmpty() && i5Var.r) {
                            i5Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        i5Var.getUserConfig().r = (int) (System.currentTimeMillis() / 1000);
                        i5Var.getUserConfig().v(false);
                        g0.g3(new m4(i5Var, 6));
                        if (s2.a) {
                            a8.b("load contacts don't change");
                            break;
                        }
                    } else {
                        i5Var.getUserConfig().h = contacts_contacts.saved_count;
                        i5Var.getUserConfig().v(false);
                        g0.g3(new dg(i5Var, contacts_contacts.users, i7, contacts_contacts.contacts, 3));
                        break;
                    }
                }
                break;
            case 1:
                qd qdVar = (qd) this.c;
                if (tL_error == null) {
                    g0.g3(new d4(qdVar, this.b, tLObject, 1));
                    break;
                }
                break;
            case 2:
                g0.g3(new br((pv) this.c, tLObject, this.b, 4));
                break;
            case 3:
                xv xvVar = (xv) this.c;
                long j3 = this.b;
                if (j3 == 0) {
                    xvVar.getClass();
                    break;
                } else {
                    xvVar.getMessagesStorage().q1(j3);
                    break;
                }
            case 4:
                zy zyVar = (zy) this.c;
                if (tL_error == null) {
                    zyVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                }
                long j10 = this.b;
                if (j10 == 0) {
                    zyVar.getClass();
                    break;
                } else {
                    zyVar.getMessagesStorage().q1(j10);
                    break;
                }
            default:
                e00 e00Var = (e00) this.c;
                e00Var.getClass();
                g0.g3(new br(e00Var, this.b, tLObject, 6));
                break;
        }
    }
}
