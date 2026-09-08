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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class tt0 extends kl0 {
    public final Context c;
    public jn0 e;
    public int n;
    public final int r;
    public int s;
    public final /* synthetic */ xu0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public tt0(xu0 xu0Var, Context context, int i10) {
        this.v = xu0Var;
        this.c = context;
        this.r = i10;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final MessageObject E(int i10) {
        return i10 < this.d.size() ? (MessageObject) this.d.get(i10) : (MessageObject) this.f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j3, long j10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.v.v1;
        if (DialogObject.isEncryptedDialog(j3)) {
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
        tL_messages_search.peer = n2Var.getMessagesController().getInputPeer(j3);
        if (j10 != 0) {
            if (j3 == n2Var.getUserConfig().getClientUserId()) {
                tL_messages_search.flags |= 4;
                tL_messages_search.saved_peer_id = n2Var.getMessagesController().getInputPeer(j10);
            } else {
                tL_messages_search.flags |= 2;
                tL_messages_search.top_msg_id = (int) j10;
            }
        }
        if (tL_messages_search.peer == null) {
            return;
        }
        final int i12 = this.n + 1;
        this.n = i12;
        this.s++;
        this.h = n2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.ui.Components.rt0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ArrayList arrayList = new ArrayList();
                tt0 tt0Var = tt0.this;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                        TLRPC.Message message = messages_messages.messages.get(i13);
                        int i14 = i10;
                        if (i14 == 0 || message.id <= i14) {
                            arrayList.add(new MessageObject(tt0Var.v.v1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new bi.k8(tt0Var, i12, arrayList, str, 26));
            }
        }, 2);
        n2Var.getConnectionsManager().bindRequestToGuid(this.h, n2Var.getClassGuid());
    }

    public final void G(String str, boolean z10) {
        jn0 jn0Var = this.e;
        if (jn0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(jn0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        xu0 xu0Var = this.v;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                xu0Var.v1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            qt0[] qt0VarArr = xu0Var.k0;
            if (i10 >= qt0VarArr.length) {
                jn0 jn0Var2 = new jn0(9, this, str);
                this.e = jn0Var2;
                AndroidUtilities.runOnUIThread(jn0Var2, 300L);
                return;
            } else {
                qt0 qt0Var = qt0VarArr[i10];
                if (qt0Var.F == this.r) {
                    qt0Var.w.e(true, z10);
                }
                i10++;
            }
        }
    }

    @Override // s4.h0
    public final int h() {
        int size = this.d.size();
        int size2 = this.f.size();
        return size2 != 0 ? size + size2 : size;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 24;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        xu0 xu0Var = this.v;
        long j3 = xu0Var.j1;
        SparseArray[] sparseArrayArr = xu0Var.Z0;
        int i11 = this.r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.j7) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject E = E(i10);
                j7Var.c(E, i10 != h() - 1);
                if (xu0Var.C1) {
                    j7Var.b(sparseArrayArr[(E.getDialogId() > j3 ? 1 : (E.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.getId()) >= 0, !xu0Var.b1);
                    return;
                } else {
                    j7Var.b(false, !xu0Var.b1);
                    return;
                }
            }
            return;
        }
        if (i11 != 3) {
            if (i11 == 4 && (view instanceof org.telegram.ui.Cells.i7)) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject E2 = E(i10);
                i7Var.f(E2, i10 != h() - 1);
                if (xu0Var.C1) {
                    i7Var.e(sparseArrayArr[(E2.getDialogId() > j3 ? 1 : (E2.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.getId()) >= 0, !xu0Var.b1);
                    return;
                } else {
                    i7Var.e(false, !xu0Var.b1);
                    return;
                }
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.n7) {
            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
            MessageObject E3 = E(i10);
            n7Var.y = i10 != h() - 1;
            n7Var.e();
            n7Var.b0 = E3;
            n7Var.requestLayout();
            if (xu0Var.C1) {
                n7Var.f(sparseArrayArr[(E3.getDialogId() > j3 ? 1 : (E3.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.getId()) >= 0, !xu0Var.b1);
            } else {
                n7Var.f(false, !xu0Var.b1);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        xu0 xu0Var = this.v;
        org.telegram.ui.ActionBar.f6 f6Var = xu0Var.F1;
        Context context = this.c;
        int i11 = this.r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.j7(context, 0, f6Var);
        } else if (i11 == 4) {
            view = new st0(this, context, f6Var, 0);
        } else {
            org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, f6Var);
            n7Var.setDelegate(xu0Var.S1);
            view = n7Var;
        }
        view.setLayoutParams(new s4.p0(-1, -2));
        return new vk0(view);
    }
}
