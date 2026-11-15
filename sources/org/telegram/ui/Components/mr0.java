package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class mr0 extends tj0 {
    public final Context c;
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;
    public boolean h;
    public int n;
    public final /* synthetic */ ys0 r;

    public mr0(ys0 ys0Var, Context context) {
        this.r = ys0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 14 || i7 == 25;
    }

    public final void E(long j3) {
        org.telegram.ui.ActionBar.e2 e2Var = this.r.y1;
        if (this.e) {
            return;
        }
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        TLRPC.InputUser o12 = e2Var.getMessagesController().o1(F());
        tL_messages_getCommonChats.user_id = o12;
        if (o12 instanceof TLRPC.TL_inputUserEmpty) {
            return;
        }
        tL_messages_getCommonChats.limit = 100;
        tL_messages_getCommonChats.max_id = j3;
        this.e = true;
        f();
        this.n = e2Var.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new v1(this, 11));
        e2Var.getConnectionsManager().bindRequestToGuid(this.n, e2Var.getClassGuid());
    }

    public final long F() {
        ys0 ys0Var = this.r;
        return org.telegram.messenger.m5.C(ys0Var.m1) ? ys0Var.y1.getMessagesController().a1(Integer.valueOf((int) (ys0Var.m1 & 4294967295L))).user_id : ys0Var.m1;
    }

    public final boolean G() {
        TLRPC.User a22;
        return (this.d.isEmpty() || (a22 = this.r.y1.getMessagesController().a2(Long.valueOf(F()))) == null || a22.bot || a22.self || org.telegram.messenger.q10.x(a22)) ? false : true;
    }

    @Override // v4.h0
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

    @Override // v4.h0
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

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 != 14) {
            if (i10 == 25 && (view instanceof org.telegram.ui.Cells.x4)) {
                ((org.telegram.ui.Cells.x4) view).b(R.drawable.msg_groups_create, 5, org.telegram.messenger.hd.a0(null, null, 2131751745, org.telegram.messenger.q10.j(this.r.y1.getMessagesController().a2(Long.valueOf(F())), true)), true);
                return;
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.f6) {
            org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
            if (G()) {
                i7--;
            }
            ArrayList arrayList = this.d;
            f6Var.x((TLRPC.Chat) arrayList.get(i7), null, null, null, false, false);
            f6Var.N = (i7 == arrayList.size() - 1 && this.h) ? false : true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.f6 f6Var;
        ys0 ys0Var = this.r;
        org.telegram.ui.ActionBar.e6 e6Var = ys0Var.I1;
        Context context = this.c;
        if (i7 == 14) {
            f6Var = new org.telegram.ui.Cells.f6(context, e6Var);
        } else {
            if (i7 == 15) {
                p3 X = ys0.X(6, ys0Var.m1, context, e6Var);
                X.setLayoutParams(new v4.p0(-1, -1));
                return new cj0(X);
            }
            if (i7 != 25) {
                pz pzVar = new pz(context, e6Var);
                pzVar.setIsSingleCell(true);
                pzVar.x = false;
                pzVar.setViewType(1);
                f6Var = pzVar;
            } else {
                org.telegram.ui.Cells.x4 x4Var = new org.telegram.ui.Cells.x4(context);
                x4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                x4Var.setTextLeft(org.telegram.messenger.g0.C);
                f6Var = x4Var;
            }
        }
        return i5.c.q(f6Var, f6Var, -1, -2);
    }
}
