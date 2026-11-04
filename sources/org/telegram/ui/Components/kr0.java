package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kr0 extends sj0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ ws0 n;

    public kr0(ws0 ws0Var, Context context) {
        this.n = ws0Var;
        this.c = context;
    }

    public static void E(kr0 kr0Var, long j10) {
        ws0 ws0Var = kr0Var.n;
        if (kr0Var.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j11 = ws0Var.m1;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.y1;
        if (org.telegram.messenger.m5.C(j11)) {
            j11 = d2Var.getMessagesController().a1(Integer.valueOf((int) (j11 & 4294967295L))).user_id;
        }
        TLRPC.InputUser o12 = d2Var.getMessagesController().o1(j11);
        tL_messages_getCommonChats.user_id = o12;
        if (o12 instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j10;
        kr0Var.e = true;
        kr0Var.f();
        d2Var.getConnectionsManager().bindRequestToGuid(d2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new w1(kr0Var, 11)), d2Var.getClassGuid());
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.b() != this.d.size();
    }

    @Override // u4.h0
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 1;
        }
        int size = arrayList.size();
        return (arrayList.isEmpty() || this.h) ? size : size + 1;
    }

    @Override // u4.h0
    public final int d(int i3) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty() || this.e) {
            return i3 < arrayList.size() ? 14 : 16;
        }
        return 15;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        if (d1Var.f == 14) {
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.f6) {
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                ArrayList arrayList = this.d;
                f6Var.x((TLRPC.Chat) arrayList.get(i3), null, null, null, false, false);
                boolean z10 = true;
                if (i3 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                f6Var.N = z10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.f6 f6Var;
        ws0 ws0Var = this.n;
        org.telegram.ui.ActionBar.e6 e6Var = ws0Var.I1;
        Context context = this.c;
        if (i3 == 14) {
            f6Var = new org.telegram.ui.Cells.f6(context, e6Var);
        } else {
            if (i3 == 15) {
                p3 X = ws0.X(6, ws0Var.m1, context, e6Var);
                X.setLayoutParams(new u4.p0(-1, -1));
                return new bj0(X);
            }
            iz izVar = new iz(context, e6Var);
            izVar.setIsSingleCell(true);
            izVar.x = false;
            izVar.setViewType(1);
            f6Var = izVar;
        }
        return k2.p1.p(f6Var, f6Var, -1, -2);
    }
}
