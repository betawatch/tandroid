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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wu0 extends lm0 {
    public final Context c;
    public t90 e;
    public int n;
    public final int r;
    public int s;
    public final /* synthetic */ aw0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public wu0(aw0 aw0Var, Context context, int i10) {
        this.v = aw0Var;
        this.c = context;
        this.r = i10;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final MessageObject E(int i10) {
        return i10 < this.d.size() ? (MessageObject) this.d.get(i10) : (MessageObject) this.f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j10, long j11) {
        org.telegram.ui.ActionBar.r2 r2Var = this.v.x1;
        if (DialogObject.isEncryptedDialog(j10)) {
            return;
        }
        if (this.h != 0) {
            r2Var.getConnectionsManager().cancelRequest(this.h, true);
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
        tL_messages_search.peer = r2Var.getMessagesController().getInputPeer(j10);
        if (j11 != 0) {
            if (j10 == r2Var.getUserConfig().getClientUserId()) {
                tL_messages_search.flags |= 4;
                tL_messages_search.saved_peer_id = r2Var.getMessagesController().getInputPeer(j11);
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
        this.h = r2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.ui.Components.uu0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ArrayList arrayList = new ArrayList();
                wu0 wu0Var = wu0.this;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                        TLRPC.Message message = messages_messages.messages.get(i13);
                        int i14 = i10;
                        if (i14 == 0 || message.id <= i14) {
                            arrayList.add(new MessageObject(wu0Var.v.x1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new zr0(wu0Var, i12, arrayList, str, 1));
            }
        }, 2);
        r2Var.getConnectionsManager().bindRequestToGuid(this.h, r2Var.getClassGuid());
    }

    public final void G(String str, boolean z10) {
        t90 t90Var = this.e;
        if (t90Var != null) {
            AndroidUtilities.cancelRunOnUIThread(t90Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        aw0 aw0Var = this.v;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                aw0Var.x1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            tu0[] tu0VarArr = aw0Var.m0;
            if (i10 >= tu0VarArr.length) {
                t90 t90Var2 = new t90(20, this, str);
                this.e = t90Var2;
                AndroidUtilities.runOnUIThread(t90Var2, 300L);
                return;
            } else {
                tu0 tu0Var = tu0VarArr[i10];
                if (tu0Var.E == this.r) {
                    tu0Var.v.e(true, z10);
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
    public final void v(s4.e1 e1Var, int i10) {
        View view = e1Var.a;
        aw0 aw0Var = this.v;
        long j10 = aw0Var.l1;
        SparseArray[] sparseArrayArr = aw0Var.b1;
        int i11 = this.r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                MessageObject E = E(i10);
                o7Var.c(E, i10 != h() - 1);
                if (aw0Var.E1) {
                    o7Var.b(sparseArrayArr[(E.getDialogId() > j10 ? 1 : (E.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.getId()) >= 0, !aw0Var.d1);
                    return;
                } else {
                    o7Var.b(false, !aw0Var.d1);
                    return;
                }
            }
            return;
        }
        if (i11 != 3) {
            if (i11 == 4 && (view instanceof org.telegram.ui.Cells.n7)) {
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                MessageObject E2 = E(i10);
                n7Var.f(E2, i10 != h() - 1);
                if (aw0Var.E1) {
                    n7Var.e(sparseArrayArr[(E2.getDialogId() > j10 ? 1 : (E2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.getId()) >= 0, !aw0Var.d1);
                    return;
                } else {
                    n7Var.e(false, !aw0Var.d1);
                    return;
                }
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.r7) {
            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
            MessageObject E3 = E(i10);
            r7Var.y = i10 != h() - 1;
            r7Var.e();
            r7Var.b0 = E3;
            r7Var.requestLayout();
            if (aw0Var.E1) {
                r7Var.f(sparseArrayArr[(E3.getDialogId() > j10 ? 1 : (E3.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.getId()) >= 0, !aw0Var.d1);
            } else {
                r7Var.f(false, !aw0Var.d1);
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        aw0 aw0Var = this.v;
        org.telegram.ui.ActionBar.u6 u6Var = aw0Var.H1;
        Context context = this.c;
        int i11 = this.r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.o7(context, 0, u6Var);
        } else if (i11 == 4) {
            view = new vu0(this, context, u6Var, 0);
        } else {
            org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, 0, u6Var);
            r7Var.setDelegate(aw0Var.V1);
            view = r7Var;
        }
        view.setLayoutParams(new s4.q0(-1, -2));
        return new vl0(view);
    }
}
