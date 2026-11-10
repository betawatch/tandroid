package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fo0 extends oj0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final a0.h e = new a0.h();
    public final /* synthetic */ mo0 f;

    public fo0(mo0 mo0Var, Context context) {
        this.f = mo0Var;
        this.c = context;
        E();
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f != 1;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.h hVar = this.e;
        hVar.b();
        mo0 mo0Var = this.f;
        long j3 = org.telegram.messenger.p10.i(mo0Var.a).n;
        if (mo0Var.U1) {
            eo0 eo0Var = new eo0();
            eo0Var.id = Long.MAX_VALUE;
            arrayList.add(eo0Var);
            hVar.k(eo0Var, eo0Var.id);
        }
        if (!org.telegram.messenger.qp.s1(mo0Var.a).D.isEmpty()) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.qp.s1(mo0Var.a).D.get(0);
            arrayList.add(dialog);
            hVar.k(dialog, dialog.id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = org.telegram.messenger.qp.s1(mo0Var.a).y;
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
                        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(mo0Var.a).M0(Long.valueOf(-dialog2.id));
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
        org.telegram.ui.cn cnVar = mo0Var.a2;
        if (cnVar != null) {
            int i10 = cnVar.a;
            if (i10 == 1) {
                ArrayList arrayList4 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList4);
            } else if (i10 == 2) {
                while (!arrayList.isEmpty() && arrayList.size() < 80) {
                    arrayList.add((TLRPC.Dialog) jg.g.i(1, arrayList));
                }
            }
        }
        f();
    }

    @Override // v4.g0
    public final int b() {
        int size = this.d.size();
        return size != 0 ? size + 1 : size;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return i7 == 0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.Dialog dialog;
        if (d1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) d1Var.a;
        int i10 = i7 - 1;
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                dialog = (TLRPC.Dialog) arrayList.get(i10);
                if (dialog != null) {
                    return;
                }
                mo0 mo0Var = this.f;
                d7Var.d((TLRPC.TL_forumTopic) mo0Var.Q1.get(dialog), org.telegram.messenger.qp.s1(mo0Var.a).y2(dialog.id), false);
                long j3 = dialog.id;
                d7Var.c(j3, mo0Var.P1.h(j3) >= 0, null);
                return;
            }
        }
        dialog = null;
        if (dialog != null) {
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View do0Var;
        mo0 mo0Var = this.f;
        Context context = this.c;
        if (i7 != 0) {
            do0Var = new View(context);
            do0Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L((!mo0Var.c2 || mo0Var.j2[1] == null) ? 56.0f : 109.0f)));
        } else {
            do0Var = new do0(this, context, mo0Var.I0);
            do0Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(100.0f)));
        }
        return new xi0(do0Var);
    }
}
