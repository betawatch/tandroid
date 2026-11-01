package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ip0 extends tk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public final a0.h e = new a0.h();
    public final /* synthetic */ pp0 f;

    public ip0(pp0 pp0Var, Context context) {
        this.f = pp0Var;
        this.c = context;
        E();
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 1;
    }

    public final void E() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        ArrayList arrayList = this.d;
        arrayList.clear();
        a0.h hVar = this.e;
        hVar.b();
        pp0 pp0Var = this.f;
        long j10 = org.telegram.messenger.e20.i(pp0Var.a).n;
        if (pp0Var.R1) {
            hp0 hp0Var = new hp0();
            hp0Var.id = Long.MAX_VALUE;
            arrayList.add(hp0Var);
            hVar.k(hp0Var, hp0Var.id);
        }
        if (!org.telegram.messenger.wp.r1(pp0Var.a).D.isEmpty()) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.wp.r1(pp0Var.a).D.get(0);
            arrayList.add(dialog);
            hVar.k(dialog, dialog.id);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = org.telegram.messenger.wp.r1(pp0Var.a).y;
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList3.get(i10);
            if (dialog2 instanceof TLRPC.TL_dialog) {
                long j11 = dialog2.id;
                if (j11 != j10 && !org.telegram.messenger.o5.C(j11)) {
                    if (org.telegram.messenger.o5.E(dialog2.id)) {
                        if (dialog2.folder_id == 1) {
                            arrayList2.add(dialog2);
                        } else {
                            arrayList.add(dialog2);
                        }
                        hVar.k(dialog2, dialog2.id);
                    } else {
                        TLRPC.Chat L0 = org.telegram.messenger.wp.r1(pp0Var.a).L0(Long.valueOf(-dialog2.id));
                        if (L0 != null && !org.telegram.messenger.w3.r0(L0) && ((!L0.gigagroup || org.telegram.messenger.w3.N(L0)) && (!org.telegram.messenger.w3.T(L0) || L0.creator || (((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.post_messages) || L0.megagroup)))) {
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
        org.telegram.ui.un unVar = pp0Var.X1;
        if (unVar != null) {
            int i11 = unVar.a;
            if (i11 == 1) {
                ArrayList arrayList4 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                arrayList.clear();
                arrayList.addAll(arrayList4);
            } else if (i11 == 2) {
                while (!arrayList.isEmpty() && arrayList.size() < 80) {
                    arrayList.add((TLRPC.Dialog) i0.a.g(1, arrayList));
                }
            }
        }
        f();
    }

    @Override // s4.g0
    public final int b() {
        int size = this.d.size();
        return size != 0 ? size + 1 : size;
    }

    @Override // s4.g0
    public final int d(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.Dialog dialog;
        if (c1Var.f != 0) {
            return;
        }
        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) c1Var.a;
        int i11 = i10 - 1;
        if (i11 >= 0) {
            ArrayList arrayList = this.d;
            if (i11 < arrayList.size()) {
                dialog = (TLRPC.Dialog) arrayList.get(i11);
                if (dialog != null) {
                    return;
                }
                pp0 pp0Var = this.f;
                h7Var.d((TLRPC.TL_forumTopic) pp0Var.N1.get(dialog), org.telegram.messenger.wp.r1(pp0Var.a).x2(dialog.id), false);
                long j10 = dialog.id;
                h7Var.c(j10, pp0Var.M1.h(j10) >= 0, null);
                return;
            }
        }
        dialog = null;
        if (dialog != null) {
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View gp0Var;
        pp0 pp0Var = this.f;
        Context context = this.c;
        if (i10 != 0) {
            gp0Var = new View(context);
            gp0Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L((!pp0Var.Z1 || pp0Var.g2[1] == null) ? 56.0f : 109.0f)));
        } else {
            gp0Var = new gp0(this, context, pp0Var.I0);
            gp0Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(100.0f)));
        }
        return new dk0(gp0Var);
    }
}
