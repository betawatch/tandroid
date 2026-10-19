package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class eu0 extends hm0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ tv0 n;

    public eu0(tv0 tv0Var, Context context) {
        this.n = tv0Var;
        this.c = context;
    }

    public static void E(eu0 eu0Var, long j10) {
        tv0 tv0Var = eu0Var.n;
        if (eu0Var.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j11 = tv0Var.j1;
        org.telegram.ui.ActionBar.n2 n2Var = tv0Var.v1;
        if (DialogObject.isEncryptedDialog(j11)) {
            j11 = org.telegram.messenger.g0.l(n2Var.getMessagesController(), j11).user_id;
        }
        TLRPC.InputUser inputUser = n2Var.getMessagesController().getInputUser(j11);
        tL_messages_getCommonChats.user_id = inputUser;
        if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j10;
        eu0Var.e = true;
        eu0Var.l();
        n2Var.getConnectionsManager().bindRequestToGuid(n2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(eu0Var, 12)), n2Var.getClassGuid());
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.b() != this.d.size();
    }

    @Override // s4.g0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 1;
        }
        int size = arrayList.size();
        return (arrayList.isEmpty() || this.h) ? size : size + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty() || this.e) {
            return i10 < arrayList.size() ? 14 : 16;
        }
        return 15;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (b1Var.f == 14) {
            View view = b1Var.a;
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                ArrayList arrayList = this.d;
                h6Var.u((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                h6Var.M = z10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.h6 h6Var;
        tv0 tv0Var = this.n;
        org.telegram.ui.ActionBar.d6 d6Var = tv0Var.F1;
        Context context = this.c;
        if (i10 == 14) {
            h6Var = new org.telegram.ui.Cells.h6(context, d6Var);
        } else {
            if (i10 == 15) {
                gu0 M = tv0.M(6, tv0Var.j1, context, d6Var);
                M.setLayoutParams(new s4.o0(-1, -1));
                return new sl0(M);
            }
            b10 b10Var = new b10(context, d6Var);
            b10Var.setIsSingleCell(true);
            b10Var.w = false;
            b10Var.setViewType(1);
            h6Var = b10Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(h6Var, h6Var, -1, -2);
    }
}
