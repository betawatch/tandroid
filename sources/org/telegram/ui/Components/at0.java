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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class at0 extends vk0 {
    public final Context c;
    public jg0 e;
    public int n;
    public final int r;
    public int s;
    public final /* synthetic */ eu0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public at0(eu0 eu0Var, Context context, int i9) {
        this.v = eu0Var;
        this.c = context;
        this.r = i9;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final MessageObject E(int i9) {
        return i9 < this.d.size() ? (MessageObject) this.d.get(i9) : (MessageObject) this.f.get(i9 - this.d.size());
    }

    public final void F(final int i9, final String str, long j10, long j11) {
        org.telegram.ui.ActionBar.o2 o2Var = this.v.r1;
        if (DialogObject.isEncryptedDialog(j10)) {
            return;
        }
        if (this.h != 0) {
            o2Var.getConnectionsManager().cancelRequest(this.h, true);
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
        tL_messages_search.offset_id = i9;
        int i10 = this.r;
        if (i10 == 1) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
        } else if (i10 == 3) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
        } else if (i10 == 4) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
        }
        tL_messages_search.q = str;
        tL_messages_search.peer = o2Var.getMessagesController().getInputPeer(j10);
        if (j11 != 0) {
            if (j10 == o2Var.getUserConfig().getClientUserId()) {
                tL_messages_search.flags |= 4;
                tL_messages_search.saved_peer_id = o2Var.getMessagesController().getInputPeer(j11);
            } else {
                tL_messages_search.flags |= 2;
                tL_messages_search.top_msg_id = (int) j11;
            }
        }
        if (tL_messages_search.peer == null) {
            return;
        }
        final int i11 = this.n + 1;
        this.n = i11;
        this.s++;
        this.h = o2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.ui.Components.ys0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ArrayList arrayList = new ArrayList();
                at0 at0Var = at0.this;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i12 = 0; i12 < messages_messages.messages.size(); i12++) {
                        TLRPC.Message message = messages_messages.messages.get(i12);
                        int i13 = i9;
                        if (i13 == 0 || message.id <= i13) {
                            arrayList.add(new MessageObject(at0Var.v.r1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new c3.d(at0Var, i11, arrayList, str, 26));
            }
        }, 2);
        o2Var.getConnectionsManager().bindRequestToGuid(this.h, o2Var.getClassGuid());
    }

    public final void G(String str, boolean z10) {
        jg0 jg0Var = this.e;
        if (jg0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(jg0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i9 = 0;
        eu0 eu0Var = this.v;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                eu0Var.r1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            xs0[] xs0VarArr = eu0Var.g0;
            if (i9 >= xs0VarArr.length) {
                jg0 jg0Var2 = new jg0(15, this, str);
                this.e = jg0Var2;
                AndroidUtilities.runOnUIThread(jg0Var2, 300L);
                return;
            } else {
                xs0 xs0Var = xs0VarArr[i9];
                if (xs0Var.B == this.r) {
                    xs0Var.w.e(true, z10);
                }
                i9++;
            }
        }
    }

    @Override // f2.r0
    public final int h() {
        int size = this.d.size();
        int size2 = this.f.size();
        return size2 != 0 ? size + size2 : size;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 24;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        View view = q1Var.a;
        eu0 eu0Var = this.v;
        long j10 = eu0Var.f1;
        SparseArray[] sparseArrayArr = eu0Var.V0;
        int i10 = this.r;
        if (i10 == 1) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject E = E(i9);
                i7Var.c(E, i9 != h() - 1);
                if (eu0Var.y1) {
                    i7Var.b(sparseArrayArr[(E.getDialogId() > j10 ? 1 : (E.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.getId()) >= 0, !eu0Var.X0);
                    return;
                } else {
                    i7Var.b(false, !eu0Var.X0);
                    return;
                }
            }
            return;
        }
        if (i10 != 3) {
            if (i10 == 4 && (view instanceof org.telegram.ui.Cells.h7)) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                MessageObject E2 = E(i9);
                h7Var.f(E2, i9 != h() - 1);
                if (eu0Var.y1) {
                    h7Var.e(sparseArrayArr[(E2.getDialogId() > j10 ? 1 : (E2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.getId()) >= 0, !eu0Var.X0);
                    return;
                } else {
                    h7Var.e(false, !eu0Var.X0);
                    return;
                }
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            MessageObject E3 = E(i9);
            l7Var.y = i9 != h() - 1;
            l7Var.e();
            l7Var.U = E3;
            l7Var.requestLayout();
            if (eu0Var.y1) {
                l7Var.f(sparseArrayArr[(E3.getDialogId() > j10 ? 1 : (E3.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.getId()) >= 0, !eu0Var.X0);
            } else {
                l7Var.f(false, !eu0Var.X0);
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        eu0 eu0Var = this.v;
        org.telegram.ui.ActionBar.b6 b6Var = eu0Var.B1;
        Context context = this.c;
        int i10 = this.r;
        if (i10 == 1) {
            view = new org.telegram.ui.Cells.i7(context, 0, b6Var);
        } else if (i10 == 4) {
            view = new zs0(this, context, b6Var, 0);
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 0, b6Var);
            l7Var.setDelegate(eu0Var.O1);
            view = l7Var;
        }
        view.setLayoutParams(new f2.a1(-1, -2));
        return new ik0(view);
    }
}
