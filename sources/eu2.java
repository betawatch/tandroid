// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class eu2 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eu2(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                qu2 qu2Var = (qu2) obj;
                ArrayList arrayList = qu2Var.x;
                if (tL_error == null) {
                    TLRPC.contacts_Contacts contacts_contacts = (TLRPC.contacts_Contacts) tLObject;
                    int i = 0;
                    if (j != 0 && (contacts_contacts instanceof TLRPC.TL_contacts_contactsNotModified)) {
                        qu2Var.h = true;
                        if (!arrayList.isEmpty() && qu2Var.r) {
                            qu2Var.c(arrayList, null, null, null);
                            arrayList.clear();
                        }
                        qu2Var.getUserConfig().r = (int) (System.currentTimeMillis() / 1000);
                        qu2Var.getUserConfig().u(false);
                        gl.c3(new wt2(qu2Var, (byte) 6));
                        if (w01.a) {
                            fa4.b("load contacts don't change");
                            break;
                        }
                    } else {
                        qu2Var.getUserConfig().h = contacts_contacts.saved_count;
                        qu2Var.getUserConfig().u(false);
                        gl.c3(new hu2(qu2Var, contacts_contacts.users, i, contacts_contacts.contacts, (byte) 0));
                        break;
                    }
                }
                break;
            case 1:
                qa6 qa6Var = (qa6) obj;
                if (tLObject != null) {
                    gl.c3(new de2(qa6Var, tLObject, this.b, (byte) 28));
                    break;
                }
                break;
            case 2:
                eb6 eb6Var = (eb6) obj;
                if (tL_error == null) {
                    gl.c3(new de2(eb6Var, this.b, tLObject, (byte) 1));
                    break;
                }
                break;
            case 3:
                gl.c3(new go6(obj, (Object) tLObject, this.b, (byte) 23));
                break;
            case 4:
                bu9 bu9Var = (bu9) obj;
                if (j != 0) {
                    bu9Var.getMessagesStorage().n1(j);
                    break;
                }
                break;
            case 5:
                z3a z3aVar = (z3a) obj;
                if (tL_error == null) {
                    z3aVar.getMessagesController().R3((TLRPC.Updates) tLObject, false);
                }
                if (j != 0) {
                    z3aVar.getMessagesStorage().n1(j);
                    break;
                }
                break;
            case 6:
                gl.c3(new go6(obj, this.b, (Object) tLObject, (byte) 29));
                break;
            default:
                pub pubVar = (pub) obj;
                pubVar.getClass();
                gl.c3(new d2b(pubVar, this.b, tLObject, (byte) 6));
                break;
        }
    }
}
