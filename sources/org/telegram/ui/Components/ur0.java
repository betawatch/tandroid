package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ur0 extends oj0 {
    public final Context c;
    public v80 e;
    public int n;
    public final int r;
    public int s;
    public final /* synthetic */ xs0 w;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public ur0(xs0 xs0Var, Context context, int i7) {
        this.w = xs0Var;
        this.c = context;
        this.r = i7;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final org.telegram.messenger.ij E(int i7) {
        return i7 < this.d.size() ? (org.telegram.messenger.ij) this.d.get(i7) : (org.telegram.messenger.ij) this.f.get(i7 - this.d.size());
    }

    public final void F(int i7, long j3, long j10, String str) {
        org.telegram.ui.ActionBar.f2 f2Var = this.w.x1;
        if (org.telegram.messenger.m5.C(j3)) {
            return;
        }
        if (this.h != 0) {
            f2Var.getConnectionsManager().cancelRequest(this.h, true);
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
        tL_messages_search.peer = f2Var.getMessagesController().j1(j3);
        if (j10 != 0) {
            if (j3 == f2Var.getUserConfig().e()) {
                tL_messages_search.flags |= 4;
                tL_messages_search.saved_peer_id = f2Var.getMessagesController().j1(j10);
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
        this.h = f2Var.getConnectionsManager().sendRequest(tL_messages_search, new org.telegram.messenger.qf(this, i7, i11, str, 2), 2);
        f2Var.getConnectionsManager().bindRequestToGuid(this.h, f2Var.getClassGuid());
    }

    public final void G(String str, boolean z9) {
        v80 v80Var = this.e;
        if (v80Var != null) {
            org.telegram.messenger.g0.r(v80Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i7 = 0;
        xs0 xs0Var = this.w;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                xs0Var.x1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            sr0[] sr0VarArr = xs0Var.m0;
            if (i7 >= sr0VarArr.length) {
                v80 v80Var2 = new v80(17, this, str);
                this.e = v80Var2;
                org.telegram.messenger.g0.i3(v80Var2, 300L);
                return;
            } else {
                sr0 sr0Var = sr0VarArr[i7];
                if (sr0Var.E == this.r) {
                    sr0Var.w.e(true, z9);
                }
                i7++;
            }
        }
    }

    @Override // v4.g0
    public final int b() {
        int size = this.d.size();
        int size2 = this.f.size();
        return size2 != 0 ? size + size2 : size;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return 24;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        View view = d1Var.a;
        xs0 xs0Var = this.w;
        long j3 = xs0Var.l1;
        SparseArray[] sparseArrayArr = xs0Var.b1;
        int i10 = this.r;
        if (i10 == 1) {
            if (view instanceof org.telegram.ui.Cells.h7) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                org.telegram.messenger.ij E = E(i7);
                h7Var.c(E, i7 != b() - 1);
                if (xs0Var.E1) {
                    h7Var.b(sparseArrayArr[(org.telegram.messenger.ij.B0(E.k) > j3 ? 1 : (org.telegram.messenger.ij.B0(E.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.f1()) >= 0, !xs0Var.d1);
                    return;
                } else {
                    h7Var.b(false, !xs0Var.d1);
                    return;
                }
            }
            return;
        }
        if (i10 != 3) {
            if (i10 == 4 && (view instanceof org.telegram.ui.Cells.g7)) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.ij E2 = E(i7);
                g7Var.f(E2, i7 != b() - 1);
                if (xs0Var.E1) {
                    g7Var.e(sparseArrayArr[(org.telegram.messenger.ij.B0(E2.k) > j3 ? 1 : (org.telegram.messenger.ij.B0(E2.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.f1()) >= 0, !xs0Var.d1);
                    return;
                } else {
                    g7Var.e(false, !xs0Var.d1);
                    return;
                }
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            org.telegram.messenger.ij E3 = E(i7);
            k7Var.D = i7 != b() - 1;
            k7Var.e();
            k7Var.b0 = E3;
            k7Var.requestLayout();
            if (xs0Var.E1) {
                k7Var.f(sparseArrayArr[(org.telegram.messenger.ij.B0(E3.k) > j3 ? 1 : (org.telegram.messenger.ij.B0(E3.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.f1()) >= 0, !xs0Var.d1);
            } else {
                k7Var.f(false, !xs0Var.d1);
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        xs0 xs0Var = this.w;
        org.telegram.ui.ActionBar.f6 f6Var = xs0Var.H1;
        Context context = this.c;
        int i10 = this.r;
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.h7(0, context, f6Var);
        } else if (i10 == 4) {
            view = new tr0(this, context, f6Var, 0);
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(0, context, f6Var);
            k7Var.setDelegate(xs0Var.V1);
            view = k7Var;
        }
        view.setLayoutParams(new v4.o0(-1, -2));
        return new xi0(view);
    }
}
