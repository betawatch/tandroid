// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mca extends q59 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final vh6 e = new vh6();
    public final /* synthetic */ tca f;

    public mca(tca tcaVar, Context context) {
        this.f = tcaVar;
        this.c = context;
        E();
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f != 1;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        vh6 vh6Var = this.e;
        vh6Var.b();
        tca tcaVar = this.f;
        long j = z8c.h(tcaVar.a).n;
        if (tcaVar.U1) {
            lca lcaVar = new lca();
            lcaVar.id = Long.MAX_VALUE;
            arrayList.add(lcaVar);
            vh6Var.k(lcaVar, lcaVar.id);
        }
        if (!oc7.r1(tcaVar.a).E.isEmpty()) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) oc7.r1(tcaVar.a).E.get(0);
            arrayList.add(dialog);
            vh6Var.k(dialog, dialog.id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = oc7.r1(tcaVar.a).y;
        for (int i = 0; i < arrayList3.size(); i++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList3.get(i);
            if (dialog2 instanceof TLRPC.TL_dialog) {
                long j2 = dialog2.id;
                if (j2 != j && !pg3.B(j2)) {
                    if (pg3.D(dialog2.id)) {
                        if (dialog2.folder_id == 1) {
                            arrayList2.add(dialog2);
                        } else {
                            arrayList.add(dialog2);
                        }
                        vh6Var.k(dialog2, dialog2.id);
                    } else {
                        TLRPC.Chat L0 = oc7.r1(tcaVar.a).L0(Long.valueOf(-dialog2.id));
                        if (L0 != null && !sd2.r0(L0) && ((!L0.gigagroup || sd2.N(L0)) && (!sd2.T(L0) || L0.creator || (((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.post_messages) || L0.megagroup)))) {
                            if (dialog2.folder_id == 1) {
                                arrayList2.add(dialog2);
                            } else {
                                arrayList.add(dialog2);
                            }
                            vh6Var.k(dialog2, dialog2.id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        yv1 yv1Var = tcaVar.a2;
        if (yv1Var != null) {
            int i2 = yv1Var.a;
            if (i2 == 1) {
                ArrayList arrayList4 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList4);
            } else if (i2 == 2) {
                while (!arrayList.isEmpty() && arrayList.size() < 80) {
                    arrayList.add((TLRPC.Dialog) b10.f(1, arrayList));
                }
            }
        }
        f();
    }

    @Override // y59
    public final int b() {
        int size = this.d.size();
        return size != 0 ? size + 1 : size;
    }

    @Override // y59
    public final int d(int i) {
        return i == 0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        TLRPC.Dialog dialog;
        if (u69Var.f != 0) {
            return;
        }
        wca wcaVar = (wca) u69Var.a;
        int i2 = i - 1;
        if (i2 >= 0) {
            ArrayList arrayList = this.d;
            if (i2 < arrayList.size()) {
                dialog = (TLRPC.Dialog) arrayList.get(i2);
                if (dialog == null) {
                    tca tcaVar = this.f;
                    wcaVar.d((TLRPC.TL_forumTopic) tcaVar.Q1.get(dialog), oc7.r1(tcaVar.a).y2(dialog.id), false);
                    long j = dialog.id;
                    wcaVar.c(j, tcaVar.P1.h(j) >= 0, null);
                    return;
                }
                return;
            }
        }
        dialog = null;
        if (dialog == null) {
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        tca tcaVar = this.f;
        Context context = this.c;
        if (i != 0) {
            view = new View(context);
            view.setLayoutParams(new g69(-1, gm.L((!tcaVar.c2 || tcaVar.j2[1] == null) ? 56.0f : 109.0f)));
        } else {
            kca kcaVar = new kca(this, context, tcaVar.J0);
            kcaVar.setLayoutParams(new g69(-1, gm.L(100.0f)));
            view = kcaVar;
        }
        return new b59(view);
    }
}
