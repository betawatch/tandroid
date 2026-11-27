// default package

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ks1 extends s57 {
    public final /* synthetic */ zu1 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks1(zu1 zu1Var, Context context, zu1 zu1Var2, ll0 ll0Var, v47 v47Var, TLRPC.User user, TLRPC.Chat chat, int i, o57 o57Var, int i2, boolean z) {
        super(context, zu1Var2, ll0Var, v47Var, user, chat, i, o57Var, i2, z);
        this.I = zu1Var;
    }

    @Override // s57
    public final void b() {
        r47 r47Var;
        ou1 ou1Var;
        zu1 zu1Var = this.I;
        ou1 ou1Var2 = zu1Var.D5;
        if (ou1Var2 == null || (r47Var = ou1Var2.a) == null || !((ou1Var = zu1Var.x5.d) == null || ou1Var.a == null || r47Var.e1() == zu1Var.x5.d.a.e1())) {
            zu1Var.D5 = zu1Var.x5.d;
        }
    }

    @Override // s57
    public final void c(boolean z) {
        int i;
        boolean z2;
        t47 t47Var;
        a(false);
        zu1 zu1Var = this.I;
        v47 v47Var = zu1Var.x5;
        if (v47Var != null) {
            if (!z) {
                zu1Var.E5 = true;
            }
            t47 t47Var2 = v47Var.b;
            if (t47Var2 != null) {
                int size = t47Var2.e.size();
                i = 0;
                z2 = false;
                for (int i2 = 0; i2 < size; i2++) {
                    r47 r47Var = (r47) zu1Var.x5.b.e.get(i2);
                    if (r47Var.C4()) {
                        i = 3;
                    } else if (r47Var.S3()) {
                        if (i != 2) {
                            i = r47Var.Y3() ? 2 : 1;
                        }
                    } else if (r47Var.z3()) {
                        z2 = true;
                    }
                    zu1Var.o6[0].put(r47Var.e1(), r47Var);
                }
            } else {
                i = 0;
                z2 = false;
            }
            Bundle j = qd4.j(3, "onlySelect", "dialogsType", true);
            j.putBoolean("quote", !z);
            boolean z3 = (z || (t47Var = zu1Var.x5.a) == null || t47Var.e.isEmpty() || zu1Var.x5.d != null) ? false : true;
            j.putBoolean("reply_to", z3);
            if (z3) {
                zu1Var.Xa(j, (r47) zu1Var.x5.a.e.get(0));
            }
            j.putInt("hasPoll", i);
            j.putBoolean("hasInvoice", z2);
            t47 t47Var3 = zu1Var.x5.b;
            j.putInt("messagesCount", t47Var3 != null ? t47Var3.e.size() : 0);
            j.putBoolean("canSelectTopics", true);
            uj3 uj3Var = new uj3(j);
            uj3Var.E2 = zu1Var;
            zu1Var.presentFragment(uj3Var);
        }
    }
}
