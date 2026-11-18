package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ds0 extends bk0 {
    public final Context c;
    public hn0 e;
    public int n;
    public final int r;
    public int s;
    public final /* synthetic */ gt0 w;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public ds0(gt0 gt0Var, Context context, int i7) {
        this.w = gt0Var;
        this.c = context;
        this.r = i7;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final org.telegram.messenger.fj E(int i7) {
        return i7 < this.d.size() ? (org.telegram.messenger.fj) this.d.get(i7) : (org.telegram.messenger.fj) this.f.get(i7 - this.d.size());
    }

    public final void F(int i7, long j3, long j10, String str) {
        org.telegram.ui.ActionBar.h2 h2Var = this.w.y1;
        if (org.telegram.messenger.n5.C(j3)) {
            return;
        }
        if (this.h != 0) {
            h2Var.getConnectionsManager().cancelRequest(this.h, true);
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
        tL_messages_search.peer = h2Var.getMessagesController().l1(j3);
        if (j10 != 0) {
            if (j3 == h2Var.getUserConfig().e()) {
                tL_messages_search.flags |= 4;
                tL_messages_search.saved_peer_id = h2Var.getMessagesController().l1(j10);
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
        this.h = h2Var.getConnectionsManager().sendRequest(tL_messages_search, new org.telegram.messenger.qf(this, i7, i11, str, 2), 2);
        h2Var.getConnectionsManager().bindRequestToGuid(this.h, h2Var.getClassGuid());
    }

    public final void G(String str, boolean z10) {
        hn0 hn0Var = this.e;
        if (hn0Var != null) {
            org.telegram.messenger.g0.r(hn0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i7 = 0;
        gt0 gt0Var = this.w;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                gt0Var.y1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            bs0[] bs0VarArr = gt0Var.n0;
            if (i7 >= bs0VarArr.length) {
                hn0 hn0Var2 = new hn0(7, this, str);
                this.e = hn0Var2;
                org.telegram.messenger.g0.h3(hn0Var2, 300L);
                return;
            } else {
                bs0 bs0Var = bs0VarArr[i7];
                if (bs0Var.F == this.r) {
                    bs0Var.w.e(true, z10);
                }
                i7++;
            }
        }
    }

    @Override // v4.i0
    public final int b() {
        int size = this.d.size();
        int size2 = this.f.size();
        return size2 != 0 ? size + size2 : size;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return 24;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        View view = f1Var.a;
        gt0 gt0Var = this.w;
        long j3 = gt0Var.m1;
        SparseArray[] sparseArrayArr = gt0Var.c1;
        int i10 = this.r;
        if (i10 == 1) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                org.telegram.messenger.fj E = E(i7);
                i7Var.c(E, i7 != b() - 1);
                if (gt0Var.F1) {
                    i7Var.b(sparseArrayArr[(org.telegram.messenger.fj.B0(E.k) > j3 ? 1 : (org.telegram.messenger.fj.B0(E.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.e1()) >= 0, !gt0Var.e1);
                    return;
                } else {
                    i7Var.b(false, !gt0Var.e1);
                    return;
                }
            }
            return;
        }
        if (i10 != 3) {
            if (i10 == 4 && (view instanceof org.telegram.ui.Cells.h7)) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                org.telegram.messenger.fj E2 = E(i7);
                h7Var.f(E2, i7 != b() - 1);
                if (gt0Var.F1) {
                    h7Var.e(sparseArrayArr[(org.telegram.messenger.fj.B0(E2.k) > j3 ? 1 : (org.telegram.messenger.fj.B0(E2.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.e1()) >= 0, !gt0Var.e1);
                    return;
                } else {
                    h7Var.e(false, !gt0Var.e1);
                    return;
                }
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            org.telegram.messenger.fj E3 = E(i7);
            l7Var.E = i7 != b() - 1;
            l7Var.e();
            l7Var.c0 = E3;
            l7Var.requestLayout();
            if (gt0Var.F1) {
                l7Var.f(sparseArrayArr[(org.telegram.messenger.fj.B0(E3.k) > j3 ? 1 : (org.telegram.messenger.fj.B0(E3.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.e1()) >= 0, !gt0Var.e1);
            } else {
                l7Var.f(false, !gt0Var.e1);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        gt0 gt0Var = this.w;
        org.telegram.ui.ActionBar.i6 i6Var = gt0Var.I1;
        Context context = this.c;
        int i10 = this.r;
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.i7(0, context, i6Var);
        } else if (i10 == 4) {
            view = new cs0(this, context, i6Var, 0);
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(0, context, i6Var);
            l7Var.setDelegate(gt0Var.W1);
            view = l7Var;
        }
        view.setLayoutParams(new v4.q0(-1, -2));
        return new kj0(view);
    }
}
