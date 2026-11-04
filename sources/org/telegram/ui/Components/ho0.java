package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ho0 extends sj0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final a0.h e = new a0.h();
    public final /* synthetic */ oo0 f;

    public ho0(oo0 oo0Var, Context context) {
        this.f = oo0Var;
        this.c = context;
        E();
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f != 1;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.h hVar = this.e;
        hVar.b();
        oo0 oo0Var = this.f;
        long j10 = org.telegram.messenger.h10.i(oo0Var.a).n;
        if (oo0Var.S1) {
            go0 go0Var = new go0();
            go0Var.id = Long.MAX_VALUE;
            arrayList.add(go0Var);
            hVar.k(go0Var, go0Var.id);
        }
        if (!org.telegram.messenger.hp.s1(oo0Var.a).E.isEmpty()) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.hp.s1(oo0Var.a).E.get(0);
            arrayList.add(dialog);
            hVar.k(dialog, dialog.id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = org.telegram.messenger.hp.s1(oo0Var.a).y;
        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList3.get(i3);
            if (dialog2 instanceof TLRPC.TL_dialog) {
                long j11 = dialog2.id;
                if (j11 != j10 && !org.telegram.messenger.m5.C(j11)) {
                    if (org.telegram.messenger.m5.E(dialog2.id)) {
                        if (dialog2.folder_id == 1) {
                            arrayList2.add(dialog2);
                        } else {
                            arrayList.add(dialog2);
                        }
                        hVar.k(dialog2, dialog2.id);
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(oo0Var.a).M0(Long.valueOf(-dialog2.id));
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
        org.telegram.ui.wm wmVar = oo0Var.Y1;
        if (wmVar != null) {
            int i10 = wmVar.a;
            if (i10 == 1) {
                ArrayList arrayList4 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList4);
            } else if (i10 == 2) {
                while (!arrayList.isEmpty() && arrayList.size() < 80) {
                    arrayList.add((TLRPC.Dialog) k2.p1.h(1, arrayList));
                }
            }
        }
        f();
    }

    @Override // u4.h0
    public final int b() {
        int size = this.d.size();
        return size != 0 ? size + 1 : size;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return i3 == 0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.Dialog dialog;
        if (d1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) d1Var.a;
        int i10 = i3 - 1;
        if (i10 >= 0) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                dialog = (TLRPC.Dialog) arrayList.get(i10);
                if (dialog != null) {
                    return;
                }
                oo0 oo0Var = this.f;
                c7Var.d((TLRPC.TL_forumTopic) oo0Var.O1.get(dialog), org.telegram.messenger.hp.s1(oo0Var.a).y2(dialog.id), false);
                long j10 = dialog.id;
                c7Var.c(j10, oo0Var.N1.h(j10) >= 0, null);
                return;
            }
        }
        dialog = null;
        if (dialog != null) {
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View fo0Var;
        oo0 oo0Var = this.f;
        Context context = this.c;
        if (i3 != 0) {
            fo0Var = new View(context);
            fo0Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L((!oo0Var.a2 || oo0Var.h2[1] == null) ? 56.0f : 109.0f)));
        } else {
            fo0Var = new fo0(this, context, oo0Var.J0);
            fo0Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(100.0f)));
        }
        return new bj0(fo0Var);
    }
}
