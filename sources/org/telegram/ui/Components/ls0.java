package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ls0 extends sk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ zt0 n;

    public ls0(zt0 zt0Var, Context context) {
        this.n = zt0Var;
        this.c = context;
    }

    public static void E(ls0 ls0Var, long j10) {
        zt0 zt0Var = ls0Var.n;
        if (ls0Var.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j11 = zt0Var.l1;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.x1;
        if (org.telegram.messenger.o5.C(j11)) {
            j11 = k2Var.getMessagesController().Z0(Integer.valueOf((int) (j11 & 4294967295L))).user_id;
        }
        TLRPC.InputUser n12 = k2Var.getMessagesController().n1(j11);
        tL_messages_getCommonChats.user_id = n12;
        if (n12 instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j10;
        ls0Var.e = true;
        ls0Var.f();
        k2Var.getConnectionsManager().bindRequestToGuid(k2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new x1(ls0Var, 11)), k2Var.getClassGuid());
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.b() != this.d.size();
    }

    @Override // s4.g0
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 1;
        }
        int size = arrayList.size();
        return (arrayList.isEmpty() || this.h) ? size : size + 1;
    }

    @Override // s4.g0
    public final int d(int i10) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty() || this.e) {
            return i10 < arrayList.size() ? 14 : 16;
        }
        return 15;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        if (c1Var.f == 14) {
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.k6) {
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                ArrayList arrayList = this.d;
                k6Var.z((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                k6Var.M = z10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.k6 k6Var;
        zt0 zt0Var = this.n;
        org.telegram.ui.ActionBar.p6 p6Var = zt0Var.H1;
        Context context = this.c;
        if (i10 == 14) {
            k6Var = new org.telegram.ui.Cells.k6(context, p6Var);
        } else {
            if (i10 == 15) {
                p3 V = zt0.V(6, zt0Var.l1, context, p6Var);
                V.setLayoutParams(new s4.o0(-1, -1));
                return new ck0(V);
            }
            zz zzVar = new zz(context, p6Var);
            zzVar.setIsSingleCell(true);
            zzVar.x = false;
            zzVar.setViewType(1);
            k6Var = zzVar;
        }
        return sc.e.o(k6Var, k6Var, -1, -2);
    }
}
