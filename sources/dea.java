// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dea extends c79 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final zh6 e = new zh6();
    public final /* synthetic */ kea f;

    public dea(kea keaVar, Context context) {
        this.f = keaVar;
        this.c = context;
        E();
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f != 1;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        zh6 zh6Var = this.e;
        zh6Var.b();
        kea keaVar = this.f;
        long j = yac.h(keaVar.a).n;
        if (keaVar.U1) {
            cea ceaVar = new cea();
            ceaVar.id = Long.MAX_VALUE;
            arrayList.add(ceaVar);
            zh6Var.k(ceaVar.id, ceaVar);
        }
        if (!uc7.s1(keaVar.a).E.isEmpty()) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) uc7.s1(keaVar.a).E.get(0);
            arrayList.add(dialog);
            zh6Var.k(dialog.id, dialog);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = uc7.s1(keaVar.a).y;
        for (int i = 0; i < arrayList3.size(); i++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList3.get(i);
            if (dialog2 instanceof TLRPC.TL_dialog) {
                long j2 = dialog2.id;
                if (j2 != j && !wf3.B(j2)) {
                    if (wf3.D(dialog2.id)) {
                        if (dialog2.folder_id == 1) {
                            arrayList2.add(dialog2);
                        } else {
                            arrayList.add(dialog2);
                        }
                        zh6Var.k(dialog2.id, dialog2);
                    } else {
                        TLRPC.Chat M0 = uc7.s1(keaVar.a).M0(Long.valueOf(-dialog2.id));
                        if (M0 != null && !xc2.r0(M0) && ((!M0.gigagroup || xc2.N(M0)) && (!xc2.T(M0) || M0.creator || (((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages) || M0.megagroup)))) {
                            if (dialog2.folder_id == 1) {
                                arrayList2.add(dialog2);
                            } else {
                                arrayList.add(dialog2);
                            }
                            zh6Var.k(dialog2.id, dialog2);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        zu1 zu1Var = keaVar.a2;
        if (zu1Var != null) {
            int i2 = zu1Var.a;
            if (i2 == 1) {
                ArrayList arrayList4 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList4);
            } else if (i2 == 2) {
                while (!arrayList.isEmpty() && arrayList.size() < 80) {
                    arrayList.add((TLRPC.Dialog) c00.g(1, arrayList));
                }
            }
        }
        f();
    }

    @Override // j79
    public final int b() {
        int size = this.d.size();
        return size != 0 ? size + 1 : size;
    }

    @Override // j79
    public final int d(int i) {
        return i == 0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        TLRPC.Dialog dialog;
        if (f89Var.f != 0) {
            return;
        }
        nea neaVar = (nea) f89Var.a;
        int i2 = i - 1;
        if (i2 >= 0) {
            ArrayList arrayList = this.d;
            if (i2 < arrayList.size()) {
                dialog = (TLRPC.Dialog) arrayList.get(i2);
                if (dialog == null) {
                    kea keaVar = this.f;
                    neaVar.d((TLRPC.TL_forumTopic) keaVar.Q1.get(dialog), uc7.s1(keaVar.a).B2(dialog.id), false);
                    long j = dialog.id;
                    neaVar.c(j, keaVar.P1.h(j) >= 0, null);
                    return;
                }
                return;
            }
        }
        dialog = null;
        if (dialog == null) {
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        kea keaVar = this.f;
        Context context = this.c;
        if (i != 0) {
            view = new View(context);
            view.setLayoutParams(new r79(-1, hl.L((!keaVar.c2 || keaVar.j2[1] == null) ? 56.0f : 109.0f)));
        } else {
            bea beaVar = new bea(this, context, keaVar.J0);
            beaVar.setLayoutParams(new r79(-1, hl.L(100.0f)));
            view = beaVar;
        }
        return new n69(view);
    }
}
