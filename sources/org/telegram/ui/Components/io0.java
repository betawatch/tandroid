package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class io0 extends tj0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final a0.h e = new a0.h();
    public final /* synthetic */ po0 f;

    public io0(po0 po0Var, Context context) {
        this.f = po0Var;
        this.c = context;
        E();
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f != 1;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.h hVar = this.e;
        hVar.b();
        po0 po0Var = this.f;
        long j3 = org.telegram.messenger.m10.i(po0Var.a).n;
        if (po0Var.V1) {
            ho0 ho0Var = new ho0();
            ho0Var.id = Long.MAX_VALUE;
            arrayList.add(ho0Var);
            hVar.k(ho0Var, ho0Var.id);
        }
        if (!org.telegram.messenger.np.s1(po0Var.a).E.isEmpty()) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.np.s1(po0Var.a).E.get(0);
            arrayList.add(dialog);
            hVar.k(dialog, dialog.id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = org.telegram.messenger.np.s1(po0Var.a).y;
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList3.get(i7);
            if (dialog2 instanceof TLRPC.TL_dialog) {
                long j10 = dialog2.id;
                if (j10 != j3 && !org.telegram.messenger.m5.C(j10)) {
                    if (org.telegram.messenger.m5.E(dialog2.id)) {
                        if (dialog2.folder_id == 1) {
                            arrayList2.add(dialog2);
                        } else {
                            arrayList.add(dialog2);
                        }
                        hVar.k(dialog2, dialog2.id);
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.np.s1(po0Var.a).M0(Long.valueOf(-dialog2.id));
                        if (M0 != null && !org.telegram.messenger.t3.r0(M0) && ((!M0.gigagroup || org.telegram.messenger.t3.N(M0)) && (!org.telegram.messenger.t3.T(M0) || M0.creator || (((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages) || M0.megagroup)))) {
                            if (dialog2.folder_id == 1) {
                                arrayList2.add(dialog2);
                            } else {
                                arrayList.add(dialog2);
                            }
                            hVar.k(dialog2, dialog2.id);
                        }
                    }
                }
            }
        }
        arrayList.addAll(arrayList2);
        org.telegram.ui.an anVar = po0Var.b2;
        if (anVar != null) {
            int i10 = anVar.a;
            if (i10 == 1) {
                ArrayList arrayList4 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList4);
            } else if (i10 == 2) {
                while (!arrayList.isEmpty() && arrayList.size() < 80) {
                    arrayList.add((TLRPC.Dialog) i5.c.h(1, arrayList));
                }
            }
        }
        f();
    }

    @Override // v4.h0
    public final int b() {
        int size = this.d.size();
        return size != 0 ? size + 1 : size;
    }

    @Override // v4.h0
    public final int d(int i7) {
        return i7 == 0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.Dialog dialog;
        if (e1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) e1Var.a;
        int i10 = i7 - 1;
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                dialog = (TLRPC.Dialog) arrayList.get(i10);
                if (dialog != null) {
                    return;
                }
                po0 po0Var = this.f;
                c7Var.d((TLRPC.TL_forumTopic) po0Var.R1.get(dialog), org.telegram.messenger.np.s1(po0Var.a).y2(dialog.id), false);
                long j3 = dialog.id;
                c7Var.c(j3, po0Var.Q1.h(j3) >= 0, null);
                return;
            }
        }
        dialog = null;
        if (dialog != null) {
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View go0Var;
        po0 po0Var = this.f;
        Context context = this.c;
        if (i7 != 0) {
            go0Var = new View(context);
            go0Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L((!po0Var.d2 || po0Var.k2[1] == null) ? 56.0f : 109.0f)));
        } else {
            go0Var = new go0(this, context, po0Var.J0);
            go0Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(100.0f)));
        }
        return new cj0(go0Var);
    }
}
