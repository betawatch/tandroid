package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ou0 extends hm0 {
    public final Context c;
    public go0 e;
    public int n;
    public final int r;
    public int s;
    public final /* synthetic */ sv0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public ou0(sv0 sv0Var, Context context, int i10) {
        this.v = sv0Var;
        this.c = context;
        this.r = i10;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final MessageObject E(int i10) {
        return i10 < this.d.size() ? (MessageObject) this.d.get(i10) : (MessageObject) this.f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j10, long j11) {
        org.telegram.ui.ActionBar.n2 n2Var = this.v.v1;
        if (DialogObject.isEncryptedDialog(j10)) {
            return;
        }
        if (this.h != 0) {
            n2Var.getConnectionsManager().cancelRequest(this.h, true);
            this.h = 0;
            this.s--;
        }
        if (str == null || str.length() == 0) {
            this.f.clear();
            this.n = 0;
            l();
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
        tL_messages_search.peer = n2Var.getMessagesController().getInputPeer(j10);
        if (j11 != 0) {
            if (j10 == n2Var.getUserConfig().getClientUserId()) {
                tL_messages_search.flags |= 4;
                tL_messages_search.saved_peer_id = n2Var.getMessagesController().getInputPeer(j11);
            } else {
                tL_messages_search.flags |= 2;
                tL_messages_search.top_msg_id = (int) j11;
            }
        }
        if (tL_messages_search.peer == null) {
            return;
        }
        final int i12 = this.n + 1;
        this.n = i12;
        this.s++;
        this.h = n2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.ui.Components.mu0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ArrayList arrayList = new ArrayList();
                ou0 ou0Var = ou0.this;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                        TLRPC.Message message = messages_messages.messages.get(i13);
                        int i14 = i10;
                        if (i14 == 0 || message.id <= i14) {
                            arrayList.add(new MessageObject(ou0Var.v.v1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new ai.cb(ou0Var, i12, arrayList, str, 28));
            }
        }, 2);
        n2Var.getConnectionsManager().bindRequestToGuid(this.h, n2Var.getClassGuid());
    }

    public final void G(String str, boolean z10) {
        go0 go0Var = this.e;
        if (go0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(go0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        sv0 sv0Var = this.v;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                sv0Var.v1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            lu0[] lu0VarArr = sv0Var.k0;
            if (i10 >= lu0VarArr.length) {
                go0 go0Var2 = new go0(9, this, str);
                this.e = go0Var2;
                AndroidUtilities.runOnUIThread(go0Var2, 300L);
                return;
            } else {
                lu0 lu0Var = lu0VarArr[i10];
                if (lu0Var.F == this.r) {
                    lu0Var.w.e(true, z10);
                }
                i10++;
            }
        }
    }

    @Override // s4.g0
    public final int h() {
        int size = this.d.size();
        int size2 = this.f.size();
        return size2 != 0 ? size + size2 : size;
    }

    @Override // s4.g0
    public final int j(int i10) {
        return 24;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.a;
        sv0 sv0Var = this.v;
        long j10 = sv0Var.j1;
        SparseArray[] sparseArrayArr = sv0Var.Z0;
        int i11 = this.r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject E = E(i10);
                i7Var.c(E, i10 != h() - 1);
                if (sv0Var.C1) {
                    i7Var.b(sparseArrayArr[(E.getDialogId() > j10 ? 1 : (E.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.getId()) >= 0, !sv0Var.b1);
                    return;
                } else {
                    i7Var.b(false, !sv0Var.b1);
                    return;
                }
            }
            return;
        }
        if (i11 != 3) {
            if (i11 == 4 && (view instanceof org.telegram.ui.Cells.h7)) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                MessageObject E2 = E(i10);
                h7Var.f(E2, i10 != h() - 1);
                if (sv0Var.C1) {
                    h7Var.e(sparseArrayArr[(E2.getDialogId() > j10 ? 1 : (E2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.getId()) >= 0, !sv0Var.b1);
                    return;
                } else {
                    h7Var.e(false, !sv0Var.b1);
                    return;
                }
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.m7) {
            org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) view;
            MessageObject E3 = E(i10);
            m7Var.y = i10 != h() - 1;
            m7Var.e();
            m7Var.b0 = E3;
            m7Var.requestLayout();
            if (sv0Var.C1) {
                m7Var.f(sparseArrayArr[(E3.getDialogId() > j10 ? 1 : (E3.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.getId()) >= 0, !sv0Var.b1);
            } else {
                m7Var.f(false, !sv0Var.b1);
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        sv0 sv0Var = this.v;
        org.telegram.ui.ActionBar.d6 d6Var = sv0Var.F1;
        Context context = this.c;
        int i11 = this.r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.i7(context, 0, d6Var);
        } else if (i11 == 4) {
            view = new nu0(this, context, d6Var, 0);
        } else {
            org.telegram.ui.Cells.m7 m7Var = new org.telegram.ui.Cells.m7(context, 0, d6Var);
            m7Var.setDelegate(sv0Var.S1);
            view = m7Var;
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        return new sl0(view);
    }
}
