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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class hu0 extends xl0 {
    public final Context c;
    public yn0 e;
    public int n;
    public final int r;
    public int s;
    public final /* synthetic */ lv0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public hu0(lv0 lv0Var, Context context, int i10) {
        this.v = lv0Var;
        this.c = context;
        this.r = i10;
    }

    @Override // org.telegram.ui.Components.xl0
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
        this.h = n2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.ui.Components.fu0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ArrayList arrayList = new ArrayList();
                hu0 hu0Var = hu0.this;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                        TLRPC.Message message = messages_messages.messages.get(i13);
                        int i14 = i10;
                        if (i14 == 0 || message.id <= i14) {
                            arrayList.add(new MessageObject(hu0Var.v.v1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new ai.c9(hu0Var, i12, arrayList, str, 26));
            }
        }, 2);
        n2Var.getConnectionsManager().bindRequestToGuid(this.h, n2Var.getClassGuid());
    }

    public final void G(String str, boolean z10) {
        yn0 yn0Var = this.e;
        if (yn0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yn0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        lv0 lv0Var = this.v;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                lv0Var.v1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            eu0[] eu0VarArr = lv0Var.k0;
            if (i10 >= eu0VarArr.length) {
                yn0 yn0Var2 = new yn0(9, this, str);
                this.e = yn0Var2;
                AndroidUtilities.runOnUIThread(yn0Var2, 300L);
                return;
            } else {
                eu0 eu0Var = eu0VarArr[i10];
                if (eu0Var.F == this.r) {
                    eu0Var.w.e(true, z10);
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
        lv0 lv0Var = this.v;
        long j3 = lv0Var.j1;
        SparseArray[] sparseArrayArr = lv0Var.Z0;
        int i11 = this.r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                MessageObject E = E(i10);
                l7Var.c(E, i10 != h() - 1);
                if (lv0Var.C1) {
                    l7Var.b(sparseArrayArr[(E.getDialogId() > j3 ? 1 : (E.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.getId()) >= 0, !lv0Var.b1);
                    return;
                } else {
                    l7Var.b(false, !lv0Var.b1);
                    return;
                }
            }
            return;
        }
        if (i11 != 3) {
            if (i11 == 4 && (view instanceof org.telegram.ui.Cells.k7)) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                MessageObject E2 = E(i10);
                k7Var.f(E2, i10 != h() - 1);
                if (lv0Var.C1) {
                    k7Var.e(sparseArrayArr[(E2.getDialogId() > j3 ? 1 : (E2.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.getId()) >= 0, !lv0Var.b1);
                    return;
                } else {
                    k7Var.e(false, !lv0Var.b1);
                    return;
                }
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
            MessageObject E3 = E(i10);
            o7Var.y = i10 != h() - 1;
            o7Var.e();
            o7Var.b0 = E3;
            o7Var.requestLayout();
            if (lv0Var.C1) {
                o7Var.f(sparseArrayArr[(E3.getDialogId() > j3 ? 1 : (E3.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.getId()) >= 0, !lv0Var.b1);
            } else {
                o7Var.f(false, !lv0Var.b1);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        lv0 lv0Var = this.v;
        org.telegram.ui.ActionBar.f6 f6Var = lv0Var.F1;
        Context context = this.c;
        int i11 = this.r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.l7(context, 0, f6Var);
        } else if (i11 == 4) {
            view = new gu0(this, context, f6Var, 0);
        } else {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 0, f6Var);
            o7Var.setDelegate(lv0Var.S1);
            view = o7Var;
        }
        view.setLayoutParams(new s4.p0(-1, -2));
        return new il0(view);
    }
}
