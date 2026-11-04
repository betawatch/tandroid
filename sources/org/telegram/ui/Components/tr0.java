package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tr0 extends sj0 {
    public final Context c;
    public j50 e;
    public int n;
    public final int r;
    public int s;
    public final /* synthetic */ ws0 w;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public tr0(ws0 ws0Var, Context context, int i3) {
        this.w = ws0Var;
        this.c = context;
        this.r = i3;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final org.telegram.messenger.zi E(int i3) {
        return i3 < this.d.size() ? (org.telegram.messenger.zi) this.d.get(i3) : (org.telegram.messenger.zi) this.f.get(i3 - this.d.size());
    }

    public final void F(int i3, long j10, long j11, String str) {
        org.telegram.ui.ActionBar.d2 d2Var = this.w.y1;
        if (org.telegram.messenger.m5.C(j10)) {
            return;
        }
        if (this.h != 0) {
            d2Var.getConnectionsManager().cancelRequest(this.h, true);
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
        tL_messages_search.offset_id = i3;
        int i10 = this.r;
        if (i10 == 1) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
        } else if (i10 == 3) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
        } else if (i10 == 4) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
        }
        tL_messages_search.q = str;
        tL_messages_search.peer = d2Var.getMessagesController().j1(j10);
        if (j11 != 0) {
            if (j10 == d2Var.getUserConfig().e()) {
                tL_messages_search.flags |= 4;
                tL_messages_search.saved_peer_id = d2Var.getMessagesController().j1(j11);
            } else {
                tL_messages_search.flags |= 2;
                tL_messages_search.top_msg_id = (int) j11;
            }
        }
        if (tL_messages_search.peer == null) {
            return;
        }
        int i11 = this.n + 1;
        this.n = i11;
        this.s++;
        this.h = d2Var.getConnectionsManager().sendRequest(tL_messages_search, new org.telegram.messenger.hf(this, i3, i11, str, 2), 2);
        d2Var.getConnectionsManager().bindRequestToGuid(this.h, d2Var.getClassGuid());
    }

    public final void G(String str, boolean z10) {
        j50 j50Var = this.e;
        if (j50Var != null) {
            org.telegram.messenger.g0.r(j50Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i3 = 0;
        ws0 ws0Var = this.w;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                ws0Var.y1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            rr0[] rr0VarArr = ws0Var.n0;
            if (i3 >= rr0VarArr.length) {
                j50 j50Var2 = new j50(22, this, str);
                this.e = j50Var2;
                org.telegram.messenger.g0.i3(j50Var2, 300L);
                return;
            } else {
                rr0 rr0Var = rr0VarArr[i3];
                if (rr0Var.F == this.r) {
                    rr0Var.w.e(true, z10);
                }
                i3++;
            }
        }
    }

    @Override // u4.h0
    public final int b() {
        int size = this.d.size();
        int size2 = this.f.size();
        return size2 != 0 ? size + size2 : size;
    }

    @Override // u4.h0
    public final int d(int i3) {
        return 24;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        View view = d1Var.a;
        ws0 ws0Var = this.w;
        long j10 = ws0Var.m1;
        SparseArray[] sparseArrayArr = ws0Var.c1;
        int i10 = this.r;
        if (i10 == 1) {
            if (view instanceof org.telegram.ui.Cells.g7) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.zi E = E(i3);
                g7Var.c(E, i3 != b() - 1);
                if (ws0Var.F1) {
                    g7Var.b(sparseArrayArr[(org.telegram.messenger.zi.B0(E.k) > j10 ? 1 : (org.telegram.messenger.zi.B0(E.k) == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.f1()) >= 0, !ws0Var.e1);
                    return;
                } else {
                    g7Var.b(false, !ws0Var.e1);
                    return;
                }
            }
            return;
        }
        if (i10 != 3) {
            if (i10 == 4 && (view instanceof org.telegram.ui.Cells.f7)) {
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                org.telegram.messenger.zi E2 = E(i3);
                f7Var.f(E2, i3 != b() - 1);
                if (ws0Var.F1) {
                    f7Var.e(sparseArrayArr[(org.telegram.messenger.zi.B0(E2.k) > j10 ? 1 : (org.telegram.messenger.zi.B0(E2.k) == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.f1()) >= 0, !ws0Var.e1);
                    return;
                } else {
                    f7Var.e(false, !ws0Var.e1);
                    return;
                }
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            org.telegram.messenger.zi E3 = E(i3);
            j7Var.E = i3 != b() - 1;
            j7Var.e();
            j7Var.c0 = E3;
            j7Var.requestLayout();
            if (ws0Var.F1) {
                j7Var.f(sparseArrayArr[(org.telegram.messenger.zi.B0(E3.k) > j10 ? 1 : (org.telegram.messenger.zi.B0(E3.k) == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.f1()) >= 0, !ws0Var.e1);
            } else {
                j7Var.f(false, !ws0Var.e1);
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        ws0 ws0Var = this.w;
        org.telegram.ui.ActionBar.e6 e6Var = ws0Var.I1;
        Context context = this.c;
        int i10 = this.r;
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.g7(0, context, e6Var);
        } else if (i10 == 4) {
            view = new sr0(this, context, e6Var, 0);
        } else {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(0, context, e6Var);
            j7Var.setDelegate(ws0Var.W1);
            view = j7Var;
        }
        view.setLayoutParams(new u4.p0(-1, -2));
        return new bj0(view);
    }
}
