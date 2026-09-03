package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class it0 extends ql0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ yu0 n;

    public it0(yu0 yu0Var, Context context) {
        this.n = yu0Var;
        this.c = context;
    }

    public static void E(it0 it0Var, long j10) {
        yu0 yu0Var = it0Var.n;
        if (it0Var.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j11 = yu0Var.g1;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
        if (DialogObject.isEncryptedDialog(j11)) {
            j11 = org.telegram.messenger.y3.n(p2Var.getMessagesController(), j11).user_id;
        }
        TLRPC.InputUser inputUser = p2Var.getMessagesController().getInputUser(j11);
        tL_messages_getCommonChats.user_id = inputUser;
        if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j10;
        it0Var.e = true;
        it0Var.l();
        p2Var.getConnectionsManager().bindRequestToGuid(p2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(it0Var, 12)), p2Var.getClassGuid());
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.b() != this.d.size();
    }

    @Override // f2.o0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 1;
        }
        int size = arrayList.size();
        return (arrayList.isEmpty() || this.h) ? size : size + 1;
    }

    @Override // f2.o0
    public final int j(int i10) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty() || this.e) {
            return i10 < arrayList.size() ? 14 : 16;
        }
        return 15;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        if (l1Var.f == 14) {
            View view = l1Var.a;
            if (view instanceof org.telegram.ui.Cells.g6) {
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                ArrayList arrayList = this.d;
                g6Var.t((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z4 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z4 = false;
                }
                g6Var.J = z4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.g6 g6Var;
        yu0 yu0Var = this.n;
        org.telegram.ui.ActionBar.f6 f6Var = yu0Var.C1;
        Context context = this.c;
        if (i10 == 14) {
            g6Var = new org.telegram.ui.Cells.g6(context, f6Var);
        } else {
            if (i10 == 15) {
                kt0 M = yu0.M(6, yu0Var.g1, context, f6Var);
                M.setLayoutParams(new f2.w0(-1, -1));
                return new dl0(M);
            }
            u00 u00Var = new u00(context, f6Var);
            u00Var.setIsSingleCell(true);
            u00Var.w = false;
            u00Var.setViewType(1);
            g6Var = u00Var;
        }
        return org.telegram.ui.ai.n(g6Var, g6Var, -1, -2);
    }
}
