// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class maa extends n39 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final vf6 e = new vf6();
    public final /* synthetic */ taa f;

    public maa(taa taaVar, Context context) {
        this.f = taaVar;
        this.c = context;
        E();
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f != 1;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        vf6 vf6Var = this.e;
        vf6Var.b();
        taa taaVar = this.f;
        long j = y6c.h(taaVar.a).n;
        if (taaVar.U1) {
            laa laaVar = new laa();
            laaVar.id = Long.MAX_VALUE;
            arrayList.add(laaVar);
            vf6Var.k(laaVar, laaVar.id);
        }
        if (!na7.q1(taaVar.a).E.isEmpty()) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) na7.q1(taaVar.a).E.get(0);
            arrayList.add(dialog);
            vf6Var.k(dialog, dialog.id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = na7.q1(taaVar.a).y;
        for (int i = 0; i < arrayList3.size(); i++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList3.get(i);
            if (dialog2 instanceof TLRPC.TL_dialog) {
                long j2 = dialog2.id;
                if (j2 != j && !cf3.B(j2)) {
                    if (cf3.D(dialog2.id)) {
                        if (dialog2.folder_id == 1) {
                            arrayList2.add(dialog2);
                        } else {
                            arrayList.add(dialog2);
                        }
                        vf6Var.k(dialog2, dialog2.id);
                    } else {
                        TLRPC.Chat K0 = na7.q1(taaVar.a).K0(Long.valueOf(-dialog2.id));
                        if (K0 != null && !hc2.r0(K0) && ((!K0.gigagroup || hc2.N(K0)) && (!hc2.T(K0) || K0.creator || (((tL_chatAdminRights = K0.admin_rights) != null && tL_chatAdminRights.post_messages) || K0.megagroup)))) {
                            if (dialog2.folder_id == 1) {
                                arrayList2.add(dialog2);
                            } else {
                                arrayList.add(dialog2);
                            }
                            vf6Var.k(dialog2, dialog2.id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        mu1 mu1Var = taaVar.a2;
        if (mu1Var != null) {
            int i2 = mu1Var.a;
            if (i2 == 1) {
                ArrayList arrayList4 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList4);
            } else if (i2 == 2) {
                while (!arrayList.isEmpty() && arrayList.size() < 80) {
                    arrayList.add((TLRPC.Dialog) b00.f(1, arrayList));
                }
            }
        }
        f();
    }

    @Override // w39
    public final int b() {
        int size = this.d.size();
        return size != 0 ? size + 1 : size;
    }

    @Override // w39
    public final int d(int i) {
        return i == 0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        TLRPC.Dialog dialog;
        if (s49Var.f != 0) {
            return;
        }
        waa waaVar = (waa) s49Var.a;
        int i2 = i - 1;
        if (i2 >= 0) {
            ArrayList arrayList = this.d;
            if (i2 < arrayList.size()) {
                dialog = (TLRPC.Dialog) arrayList.get(i2);
                if (dialog == null) {
                    taa taaVar = this.f;
                    waaVar.d((TLRPC.TL_forumTopic) taaVar.Q1.get(dialog), na7.q1(taaVar.a).x2(dialog.id), false);
                    long j = dialog.id;
                    waaVar.c(j, taaVar.P1.h(j) >= 0, null);
                    return;
                }
                return;
            }
        }
        dialog = null;
        if (dialog == null) {
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        taa taaVar = this.f;
        Context context = this.c;
        if (i != 0) {
            view = new View(context);
            view.setLayoutParams(new e49(-1, gl.L((!taaVar.c2 || taaVar.j2[1] == null) ? 56.0f : 109.0f)));
        } else {
            kaa kaaVar = new kaa(this, context, taaVar.J0);
            kaaVar.setLayoutParams(new e49(-1, gl.L(100.0f)));
            view = kaaVar;
        }
        return new y29(view);
    }
}
