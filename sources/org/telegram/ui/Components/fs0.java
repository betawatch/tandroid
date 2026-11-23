package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fs0 extends dk0 {
    public final Context c;
    public sh0 e;
    public int n;
    public final int r;
    public int s;
    public final /* synthetic */ it0 w;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public fs0(it0 it0Var, Context context, int i7) {
        this.w = it0Var;
        this.c = context;
        this.r = i7;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final org.telegram.messenger.fj E(int i7) {
        return i7 < this.d.size() ? (org.telegram.messenger.fj) this.d.get(i7) : (org.telegram.messenger.fj) this.f.get(i7 - this.d.size());
    }

    public final void F(int i7, long j3, long j10, String str) {
        org.telegram.ui.ActionBar.g2 g2Var = this.w.y1;
        if (org.telegram.messenger.n5.C(j3)) {
            return;
        }
        if (this.h != 0) {
            g2Var.getConnectionsManager().cancelRequest(this.h, true);
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
        tL_messages_search.peer = g2Var.getMessagesController().l1(j3);
        if (j10 != 0) {
            if (j3 == g2Var.getUserConfig().e()) {
                tL_messages_search.flags |= 4;
                tL_messages_search.saved_peer_id = g2Var.getMessagesController().l1(j10);
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
        this.h = g2Var.getConnectionsManager().sendRequest(tL_messages_search, new org.telegram.messenger.qf(this, i7, i11, str, 2), 2);
        g2Var.getConnectionsManager().bindRequestToGuid(this.h, g2Var.getClassGuid());
    }

    public final void G(String str, boolean z10) {
        sh0 sh0Var = this.e;
        if (sh0Var != null) {
            org.telegram.messenger.g0.r(sh0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i7 = 0;
        it0 it0Var = this.w;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                it0Var.y1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            ds0[] ds0VarArr = it0Var.n0;
            if (i7 >= ds0VarArr.length) {
                sh0 sh0Var2 = new sh0(11, this, str);
                this.e = sh0Var2;
                org.telegram.messenger.g0.h3(sh0Var2, 300L);
                return;
            } else {
                ds0 ds0Var = ds0VarArr[i7];
                if (ds0Var.F == this.r) {
                    ds0Var.w.e(true, z10);
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
        it0 it0Var = this.w;
        long j3 = it0Var.m1;
        SparseArray[] sparseArrayArr = it0Var.c1;
        int i10 = this.r;
        if (i10 == 1) {
            if (view instanceof org.telegram.ui.Cells.h7) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                org.telegram.messenger.fj E = E(i7);
                h7Var.c(E, i7 != b() - 1);
                if (it0Var.F1) {
                    h7Var.b(sparseArrayArr[(org.telegram.messenger.fj.B0(E.k) > j3 ? 1 : (org.telegram.messenger.fj.B0(E.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.e1()) >= 0, !it0Var.e1);
                    return;
                } else {
                    h7Var.b(false, !it0Var.e1);
                    return;
                }
            }
            return;
        }
        if (i10 != 3) {
            if (i10 == 4 && (view instanceof org.telegram.ui.Cells.g7)) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                org.telegram.messenger.fj E2 = E(i7);
                g7Var.f(E2, i7 != b() - 1);
                if (it0Var.F1) {
                    g7Var.e(sparseArrayArr[(org.telegram.messenger.fj.B0(E2.k) > j3 ? 1 : (org.telegram.messenger.fj.B0(E2.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.e1()) >= 0, !it0Var.e1);
                    return;
                } else {
                    g7Var.e(false, !it0Var.e1);
                    return;
                }
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            org.telegram.messenger.fj E3 = E(i7);
            k7Var.E = i7 != b() - 1;
            k7Var.e();
            k7Var.c0 = E3;
            k7Var.requestLayout();
            if (it0Var.F1) {
                k7Var.f(sparseArrayArr[(org.telegram.messenger.fj.B0(E3.k) > j3 ? 1 : (org.telegram.messenger.fj.B0(E3.k) == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.e1()) >= 0, !it0Var.e1);
            } else {
                k7Var.f(false, !it0Var.e1);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        it0 it0Var = this.w;
        org.telegram.ui.ActionBar.i6 i6Var = it0Var.I1;
        Context context = this.c;
        int i10 = this.r;
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.h7(0, context, i6Var);
        } else if (i10 == 4) {
            view = new es0(this, context, i6Var, 0);
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(0, context, i6Var);
            k7Var.setDelegate(it0Var.W1);
            view = k7Var;
        }
        view.setLayoutParams(new v4.q0(-1, -2));
        return new mj0(view);
    }
}
