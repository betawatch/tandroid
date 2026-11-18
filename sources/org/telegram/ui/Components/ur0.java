package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ur0 extends bk0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public int n;
    public final /* synthetic */ gt0 r;

    public ur0(gt0 gt0Var, Context context) {
        this.r = gt0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 14 || i7 == 25;
    }

    public final void E(long j3) {
        org.telegram.ui.ActionBar.h2 h2Var = this.r.y1;
        if (this.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        TLRPC.InputUser q12 = h2Var.getMessagesController().q1(F());
        tL_messages_getCommonChats.user_id = q12;
        if (q12 instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j3;
        this.e = true;
        f();
        this.n = h2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new e2(this, 11));
        h2Var.getConnectionsManager().bindRequestToGuid(this.n, h2Var.getClassGuid());
    }

    public final long F() {
        gt0 gt0Var = this.r;
        return org.telegram.messenger.n5.C(gt0Var.m1) ? gt0Var.y1.getMessagesController().c1(Integer.valueOf((int) (gt0Var.m1 & 4294967295L))).user_id : gt0Var.m1;
    }

    public final boolean G() {
        TLRPC.User c22;
        return (this.d.isEmpty() || (c22 = this.r.y1.getMessagesController().c2(Long.valueOf(F()))) == null || c22.bot || c22.self || org.telegram.messenger.o10.y(c22)) ? false : true;
    }

    @Override // v4.i0
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 1;
        }
        int size = arrayList.size();
        if (arrayList.isEmpty()) {
            return size;
        }
        if (G()) {
            size++;
        }
        return !this.h ? size + 1 : size;
    }

    @Override // v4.i0
    public final int d(int i7) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty() && !this.e) {
            return 15;
        }
        if (G()) {
            if (i7 == 0) {
                return 25;
            }
            i7--;
        }
        return i7 < arrayList.size() ? 14 : 16;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 != 14) {
            if (i10 == 25 && (view instanceof org.telegram.ui.Cells.y4)) {
                ((org.telegram.ui.Cells.y4) view).b(R.drawable.msg_groups_create, 5, org.telegram.messenger.gd.a0(null, null, 2131751734, org.telegram.messenger.o10.k(this.r.y1.getMessagesController().c2(Long.valueOf(F())), true)), true);
                return;
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.h6) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (G()) {
                i7--;
            }
            ArrayList arrayList = this.d;
            h6Var.x((TLRPC.Chat) arrayList.get(i7), null, null, null, false, false);
            h6Var.N = (i7 == arrayList.size() - 1 && this.h) ? false : true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.h6 h6Var;
        gt0 gt0Var = this.r;
        org.telegram.ui.ActionBar.i6 i6Var = gt0Var.I1;
        Context context = this.c;
        if (i7 == 14) {
            h6Var = new org.telegram.ui.Cells.h6(context, i6Var);
        } else {
            if (i7 == 15) {
                x3 X = gt0.X(6, gt0Var.m1, context, i6Var);
                X.setLayoutParams(new v4.q0(-1, -1));
                return new kj0(X);
            }
            if (i7 != 25) {
                wz wzVar = new wz(context, i6Var);
                wzVar.setIsSingleCell(true);
                wzVar.x = false;
                wzVar.setViewType(1);
                h6Var = wzVar;
            } else {
                org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(context);
                y4Var.a(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
                y4Var.setTextLeft(org.telegram.messenger.g0.C);
                h6Var = y4Var;
            }
        }
        return i5.c.q(h6Var, h6Var, -1, -2);
    }
}
