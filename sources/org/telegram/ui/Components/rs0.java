package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rs0 extends yk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ hu0 n;

    public rs0(hu0 hu0Var, Context context) {
        this.n = hu0Var;
        this.c = context;
    }

    public static void E(rs0 rs0Var, long j10) {
        hu0 hu0Var = rs0Var.n;
        if (rs0Var.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j11 = hu0Var.f1;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
        if (DialogObject.isEncryptedDialog(j11)) {
            j11 = org.telegram.messenger.y1.n(n2Var.getMessagesController(), j11).user_id;
        }
        TLRPC.InputUser inputUser = n2Var.getMessagesController().getInputUser(j11);
        tL_messages_getCommonChats.user_id = inputUser;
        if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j10;
        rs0Var.e = true;
        rs0Var.l();
        n2Var.getConnectionsManager().bindRequestToGuid(n2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new w1(rs0Var, 12)), n2Var.getClassGuid());
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.b() != this.d.size();
    }

    @Override // f2.q0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 1;
        }
        int size = arrayList.size();
        return (arrayList.isEmpty() || this.h) ? size : size + 1;
    }

    @Override // f2.q0
    public final int j(int i10) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty() || this.e) {
            return i10 < arrayList.size() ? 14 : 16;
        }
        return 15;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f == 14) {
            View view = o1Var.a;
            if (view instanceof org.telegram.ui.Cells.e6) {
                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                ArrayList arrayList = this.d;
                e6Var.u((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                e6Var.I = z10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.e6 e6Var;
        hu0 hu0Var = this.n;
        org.telegram.ui.ActionBar.c6 c6Var = hu0Var.B1;
        Context context = this.c;
        if (i10 == 14) {
            e6Var = new org.telegram.ui.Cells.e6(context, c6Var);
        } else {
            if (i10 == 15) {
                ts0 M = hu0.M(6, hu0Var.f1, context, c6Var);
                M.setLayoutParams(new f2.y0(-1, -1));
                return new lk0(M);
            }
            h00 h00Var = new h00(context, c6Var);
            h00Var.setIsSingleCell(true);
            h00Var.w = false;
            h00Var.setViewType(1);
            e6Var = h00Var;
        }
        return org.telegram.ui.Cells.pa.l(e6Var, e6Var, -1, -2);
    }
}
