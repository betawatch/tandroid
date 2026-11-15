package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class vr0 extends tj0 {
    public final Context c;
    public hh0 e;
    public int n;
    public final int r;
    public int s;
    public final /* synthetic */ ys0 w;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public vr0(ys0 ys0Var, Context context, int i7) {
        this.w = ys0Var;
        this.c = context;
        this.r = i7;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final org.telegram.messenger.gj E(int i7) {
        return i7 < this.d.size() ? (org.telegram.messenger.gj) this.d.get(i7) : (org.telegram.messenger.gj) this.f.get(i7 - this.d.size());
    }

    public final void F(int i7, long j3, long j10, String str) {
        org.telegram.ui.ActionBar.e2 e2Var = this.w.y1;
        if (org.telegram.messenger.m5.C(j3)) {
            return;
        }
        if (this.h != 0) {
            e2Var.getConnectionsManager().cancelRequest(this.h, true);
            this.h = 0;
            this.s--;
        }
        if (str == null || str.length() == 0) {
            this.f.clear();
            this.n = 0;
            f();
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = 50;
        tL_messages_search.offset_id = i7;
        int i10 = this.r;
        if (i10 == 1) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
        } else if (i10 == 3) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
        } else if (i10 == 4) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
        }
        tL_messages_search.q = str;
        tL_messages_search.peer = e2Var.getMessagesController().j1(j3);
        if (j10 != 0) {
            if (j3 == e2Var.getUserConfig().e()) {
                tL_messages_search.flags |= 4;
                tL_messages_search.saved_peer_id = e2Var.getMessagesController().j1(j10);
            } else {
                tL_messages_search.flags |= 2;
                tL_messages_search.top_msg_id = (int) j10;
            }
        }
        if (tL_messages_search.peer == null) {
            return;
        }
        int i11 = this.n + 1;
        this.n = i11;
        this.s++;
        this.h = e2Var.getConnectionsManager().sendRequest(tL_messages_search, new org.telegram.messenger.pf(this, i7, i11, str, 2), 2);
        e2Var.getConnectionsManager().bindRequestToGuid(this.h, e2Var.getClassGuid());
    }

    public final void G(String str, boolean z10) {
        hh0 hh0Var = this.e;
        if (hh0Var != null) {
            org.telegram.messenger.g0.r(hh0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i7 = 0;
        ys0 ys0Var = this.w;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                ys0Var.y1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            tr0[] tr0VarArr = ys0Var.n0;
            if (i7 >= tr0VarArr.length) {
                hh0 hh0Var2 = new hh0(11, this, str);
                this.e = hh0Var2;
                org.telegram.messenger.g0.i3(hh0Var2, 300L);
                return;
            } else {
                tr0 tr0Var = tr0VarArr[i7];
                if (tr0Var.F == this.r) {
                    tr0Var.w.e(true, z10);
                }
                i7++;
            }
        }
    }

    @Override // v4.h0
    public final int b() {
        int size = this.d.size();
        int size2 = this.f.size();
        return size2 != 0 ? size + size2 : size;
    }

    @Override // v4.h0
    public final int d(int i7) {
        return 24;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        View view = e1Var.a;
        ys0 ys0Var = this.w;
        long j3 = ys0Var.m1;
        SparseArray[] sparseArrayArr = ys0Var.c1;
        int i10 = this.r;
        if (i10 == 1) {
            if (view instanceof org.telegram.ui.Cells.g7) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.gj E = E(i7);
                g7Var.c(E, i7 != b() - 1);
                if (ys0Var.F1) {
                    g7Var.b(sparseArrayArr[(org.telegram.messenger.gj.B0(E.k) > j3 ? 1 : (org.telegram.messenger.gj.B0(E.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.e1()) >= 0, !ys0Var.e1);
                    return;
                } else {
                    g7Var.b(false, !ys0Var.e1);
                    return;
                }
            }
            return;
        }
        if (i10 != 3) {
            if (i10 == 4 && (view instanceof org.telegram.ui.Cells.f7)) {
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                org.telegram.messenger.gj E2 = E(i7);
                f7Var.f(E2, i7 != b() - 1);
                if (ys0Var.F1) {
                    f7Var.e(sparseArrayArr[(org.telegram.messenger.gj.B0(E2.k) > j3 ? 1 : (org.telegram.messenger.gj.B0(E2.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.e1()) >= 0, !ys0Var.e1);
                    return;
                } else {
                    f7Var.e(false, !ys0Var.e1);
                    return;
                }
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            org.telegram.messenger.gj E3 = E(i7);
            j7Var.E = i7 != b() - 1;
            j7Var.e();
            j7Var.c0 = E3;
            j7Var.requestLayout();
            if (ys0Var.F1) {
                j7Var.f(sparseArrayArr[(org.telegram.messenger.gj.B0(E3.k) > j3 ? 1 : (org.telegram.messenger.gj.B0(E3.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.e1()) >= 0, !ys0Var.e1);
            } else {
                j7Var.f(false, !ys0Var.e1);
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        ys0 ys0Var = this.w;
        org.telegram.ui.ActionBar.e6 e6Var = ys0Var.I1;
        Context context = this.c;
        int i10 = this.r;
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.g7(0, context, e6Var);
        } else if (i10 == 4) {
            view = new ur0(this, context, e6Var, 0);
        } else {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(0, context, e6Var);
            j7Var.setDelegate(ys0Var.W1);
            view = j7Var;
        }
        view.setLayoutParams(new v4.p0(-1, -2));
        return new cj0(view);
    }
}
