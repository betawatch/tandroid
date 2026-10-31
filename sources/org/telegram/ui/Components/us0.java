package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class us0 extends sk0 {
    public final Context c;
    public gi0 e;
    public int n;
    public final int r;
    public int s;
    public final /* synthetic */ zt0 w;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public us0(zt0 zt0Var, Context context, int i10) {
        this.w = zt0Var;
        this.c = context;
        this.r = i10;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final org.telegram.messenger.jj E(int i10) {
        return i10 < this.d.size() ? (org.telegram.messenger.jj) this.d.get(i10) : (org.telegram.messenger.jj) this.f.get(i10 - this.d.size());
    }

    public final void F(int i10, long j10, long j11, String str) {
        org.telegram.ui.ActionBar.k2 k2Var = this.w.x1;
        if (org.telegram.messenger.o5.C(j10)) {
            return;
        }
        if (this.h != 0) {
            k2Var.getConnectionsManager().cancelRequest(this.h, true);
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
        tL_messages_search.offset_id = i10;
        int i11 = this.r;
        if (i11 == 1) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
        } else if (i11 == 3) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
        } else if (i11 == 4) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
        }
        tL_messages_search.q = str;
        tL_messages_search.peer = k2Var.getMessagesController().i1(j10);
        if (j11 != 0) {
            if (j10 == k2Var.getUserConfig().e()) {
                tL_messages_search.flags |= 4;
                tL_messages_search.saved_peer_id = k2Var.getMessagesController().i1(j11);
            } else {
                tL_messages_search.flags |= 2;
                tL_messages_search.top_msg_id = (int) j11;
            }
        }
        if (tL_messages_search.peer == null) {
            return;
        }
        int i12 = this.n + 1;
        this.n = i12;
        this.s++;
        this.h = k2Var.getConnectionsManager().sendRequest(tL_messages_search, new org.telegram.messenger.of(this, i10, i12, str, 2), 2);
        k2Var.getConnectionsManager().bindRequestToGuid(this.h, k2Var.getClassGuid());
    }

    public final void G(String str, boolean z10) {
        gi0 gi0Var = this.e;
        if (gi0Var != null) {
            org.telegram.messenger.i0.r(gi0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        zt0 zt0Var = this.w;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                zt0Var.x1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            ss0[] ss0VarArr = zt0Var.m0;
            if (i10 >= ss0VarArr.length) {
                gi0 gi0Var2 = new gi0(11, this, str);
                this.e = gi0Var2;
                org.telegram.messenger.i0.h3(gi0Var2, 300L);
                return;
            } else {
                ss0 ss0Var = ss0VarArr[i10];
                if (ss0Var.E == this.r) {
                    ss0Var.w.e(true, z10);
                }
                i10++;
            }
        }
    }

    @Override // s4.g0
    public final int b() {
        int size = this.d.size();
        int size2 = this.f.size();
        return size2 != 0 ? size + size2 : size;
    }

    @Override // s4.g0
    public final int d(int i10) {
        return 24;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        zt0 zt0Var = this.w;
        long j10 = zt0Var.l1;
        SparseArray[] sparseArrayArr = zt0Var.b1;
        int i11 = this.r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                org.telegram.messenger.jj E = E(i10);
                l7Var.c(E, i10 != b() - 1);
                if (zt0Var.E1) {
                    l7Var.b(sparseArrayArr[(org.telegram.messenger.jj.B0(E.k) > j10 ? 1 : (org.telegram.messenger.jj.B0(E.k) == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.f1()) >= 0, !zt0Var.d1);
                    return;
                } else {
                    l7Var.b(false, !zt0Var.d1);
                    return;
                }
            }
            return;
        }
        if (i11 != 3) {
            if (i11 == 4 && (view instanceof org.telegram.ui.Cells.k7)) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                org.telegram.messenger.jj E2 = E(i10);
                k7Var.f(E2, i10 != b() - 1);
                if (zt0Var.E1) {
                    k7Var.e(sparseArrayArr[(org.telegram.messenger.jj.B0(E2.k) > j10 ? 1 : (org.telegram.messenger.jj.B0(E2.k) == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.f1()) >= 0, !zt0Var.d1);
                    return;
                } else {
                    k7Var.e(false, !zt0Var.d1);
                    return;
                }
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            org.telegram.messenger.jj E3 = E(i10);
            o7Var.D = i10 != b() - 1;
            o7Var.e();
            o7Var.b0 = E3;
            o7Var.requestLayout();
            if (zt0Var.E1) {
                o7Var.f(sparseArrayArr[(org.telegram.messenger.jj.B0(E3.k) > j10 ? 1 : (org.telegram.messenger.jj.B0(E3.k) == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.f1()) >= 0, !zt0Var.d1);
            } else {
                o7Var.f(false, !zt0Var.d1);
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        zt0 zt0Var = this.w;
        org.telegram.ui.ActionBar.p6 p6Var = zt0Var.H1;
        Context context = this.c;
        int i11 = this.r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.l7(0, context, p6Var);
        } else if (i11 == 4) {
            view = new ts0(this, context, p6Var, 0);
        } else {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(0, context, p6Var);
            o7Var.setDelegate(zt0Var.V1);
            view = o7Var;
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        return new ck0(view);
    }
}
