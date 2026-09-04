package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class it0 extends kl0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ xu0 n;

    public it0(xu0 xu0Var, Context context) {
        this.n = xu0Var;
        this.c = context;
    }

    public static void E(it0 it0Var, long j3) {
        xu0 xu0Var = it0Var.n;
        if (it0Var.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        long j10 = xu0Var.j1;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.v1;
        if (DialogObject.isEncryptedDialog(j10)) {
            j10 = org.telegram.messenger.w1.m(n2Var.getMessagesController(), j10).user_id;
        }
        TLRPC.InputUser inputUser = n2Var.getMessagesController().getInputUser(j10);
        tL_messages_getCommonChats.user_id = inputUser;
        if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j3;
        it0Var.e = true;
        it0Var.l();
        n2Var.getConnectionsManager().bindRequestToGuid(n2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new y1(it0Var, 12)), n2Var.getClassGuid());
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.b() != this.d.size();
    }

    @Override // s4.h0
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 1;
        }
        int size = arrayList.size();
        return (arrayList.isEmpty() || this.h) ? size : size + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty() || this.e) {
            return i10 < arrayList.size() ? 14 : 16;
        }
        return 15;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (c1Var.f == 14) {
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                ArrayList arrayList = this.d;
                h6Var.t((TLRPC.Chat) arrayList.get(i10), null, null, null, false, false);
                boolean z10 = true;
                if (i10 == arrayList.size() - 1 && this.h) {
                    z10 = false;
                }
                h6Var.M = z10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.h6 h6Var;
        xu0 xu0Var = this.n;
        org.telegram.ui.ActionBar.f6 f6Var = xu0Var.F1;
        Context context = this.c;
        if (i10 == 14) {
            h6Var = new org.telegram.ui.Cells.h6(context, f6Var);
        } else {
            if (i10 == 15) {
                kt0 M = xu0.M(6, xu0Var.j1, context, f6Var);
                M.setLayoutParams(new s4.p0(-1, -1));
                return new vk0(M);
            }
            t00 t00Var = new t00(context, f6Var);
            t00Var.setIsSingleCell(true);
            t00Var.w = false;
            t00Var.setViewType(1);
            h6Var = t00Var;
        }
        return com.google.android.gms.internal.vision.e2.l(h6Var, h6Var, -1, -2);
    }
}
