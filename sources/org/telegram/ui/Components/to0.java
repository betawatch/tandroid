package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class to0 extends dk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final a0.h e = new a0.h();
    public final /* synthetic */ ap0 f;

    public to0(ap0 ap0Var, Context context) {
        this.f = ap0Var;
        this.c = context;
        E();
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f != 1;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.h hVar = this.e;
        hVar.b();
        ap0 ap0Var = this.f;
        long j3 = org.telegram.messenger.k10.i(ap0Var.a).n;
        if (ap0Var.V1) {
            so0 so0Var = new so0();
            so0Var.id = Long.MAX_VALUE;
            arrayList.add(so0Var);
            hVar.k(so0Var, so0Var.id);
        }
        if (!org.telegram.messenger.np.u1(ap0Var.a).E.isEmpty()) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.np.u1(ap0Var.a).E.get(0);
            arrayList.add(dialog);
            hVar.k(dialog, dialog.id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = org.telegram.messenger.np.u1(ap0Var.a).y;
        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList3.get(i7);
            if (dialog2 instanceof TLRPC.TL_dialog) {
                long j10 = dialog2.id;
                if (j10 != j3 && !org.telegram.messenger.n5.C(j10)) {
                    if (org.telegram.messenger.n5.E(dialog2.id)) {
                        if (dialog2.folder_id == 1) {
                            arrayList2.add(dialog2);
                        } else {
                            arrayList.add(dialog2);
                        }
                        hVar.k(dialog2, dialog2.id);
                    } else {
                        TLRPC.Chat O0 = org.telegram.messenger.np.u1(ap0Var.a).O0(Long.valueOf(-dialog2.id));
                        if (O0 != null && !org.telegram.messenger.v3.r0(O0) && ((!O0.gigagroup || org.telegram.messenger.v3.N(O0)) && (!org.telegram.messenger.v3.T(O0) || O0.creator || (((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.post_messages) || O0.megagroup)))) {
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
        org.telegram.ui.bn bnVar = ap0Var.b2;
        if (bnVar != null) {
            int i10 = bnVar.a;
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

    @Override // v4.i0
    public final int b() {
        int size = this.d.size();
        return size != 0 ? size + 1 : size;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return i7 == 0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Dialog dialog;
        if (f1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) f1Var.a;
        int i10 = i7 - 1;
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                dialog = (TLRPC.Dialog) arrayList.get(i10);
                if (dialog != null) {
                    return;
                }
                ap0 ap0Var = this.f;
                e7Var.d((TLRPC.TL_forumTopic) ap0Var.R1.get(dialog), org.telegram.messenger.np.u1(ap0Var.a).E2(dialog.id), false);
                long j3 = dialog.id;
                e7Var.c(j3, ap0Var.Q1.h(j3) >= 0, null);
                return;
            }
        }
        dialog = null;
        if (dialog != null) {
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View ro0Var;
        ap0 ap0Var = this.f;
        Context context = this.c;
        if (i7 != 0) {
            ro0Var = new View(context);
            ro0Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L((!ap0Var.d2 || ap0Var.k2[1] == null) ? 56.0f : 109.0f)));
        } else {
            ro0Var = new ro0(this, context, ap0Var.J0);
            ro0Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(100.0f)));
        }
        return new mj0(ro0Var);
    }
}
