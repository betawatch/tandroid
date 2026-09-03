package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tt0 extends rl0 {
    public final Context c;
    public b90 e;
    public int n;
    public final int r;
    public int s;
    public final /* synthetic */ yu0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public tt0(yu0 yu0Var, Context context, int i10) {
        this.v = yu0Var;
        this.c = context;
        this.r = i10;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final MessageObject E(int i10) {
        return i10 < this.d.size() ? (MessageObject) this.d.get(i10) : (MessageObject) this.f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j10, long j11) {
        org.telegram.ui.ActionBar.p2 p2Var = this.v.s1;
        if (DialogObject.isEncryptedDialog(j10)) {
            return;
        }
        if (this.h != 0) {
            p2Var.getConnectionsManager().cancelRequest(this.h, true);
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
        tL_messages_search.peer = p2Var.getMessagesController().getInputPeer(j10);
        if (j11 != 0) {
            if (j10 == p2Var.getUserConfig().getClientUserId()) {
                tL_messages_search.flags |= 4;
                tL_messages_search.saved_peer_id = p2Var.getMessagesController().getInputPeer(j11);
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
        this.h = p2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.ui.Components.rt0
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
                            arrayList.add(new MessageObject(tt0Var.v.s1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new dg.u1((Object) tt0Var, i12, arrayList, (Serializable) str, 25));
            }
        }, 2);
        p2Var.getConnectionsManager().bindRequestToGuid(this.h, p2Var.getClassGuid());
    }

    public final void G(String str, boolean z4) {
        b90 b90Var = this.e;
        if (b90Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b90Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        yu0 yu0Var = this.v;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                yu0Var.s1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            qt0[] qt0VarArr = yu0Var.h0;
            if (i10 >= qt0VarArr.length) {
                b90 b90Var2 = new b90(19, this, str);
                this.e = b90Var2;
                AndroidUtilities.runOnUIThread(b90Var2, 300L);
                return;
            } else {
                qt0 qt0Var = qt0VarArr[i10];
                if (qt0Var.C == this.r) {
                    qt0Var.w.e(true, z4);
                }
                i10++;
            }
        }
    }

    @Override // f2.p0
    public final int h() {
        int size = this.d.size();
        int size2 = this.f.size();
        return size2 != 0 ? size + size2 : size;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 24;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        View view = m1Var.a;
        yu0 yu0Var = this.v;
        long j10 = yu0Var.g1;
        SparseArray[] sparseArrayArr = yu0Var.W0;
        int i11 = this.r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject E = E(i10);
                i7Var.c(E, i10 != h() - 1);
                if (yu0Var.z1) {
                    i7Var.b(sparseArrayArr[(E.getDialogId() > j10 ? 1 : (E.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.getId()) >= 0, !yu0Var.Y0);
                    return;
                } else {
                    i7Var.b(false, !yu0Var.Y0);
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
                if (yu0Var.z1) {
                    h7Var.e(sparseArrayArr[(E2.getDialogId() > j10 ? 1 : (E2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.getId()) >= 0, !yu0Var.Y0);
                    return;
                } else {
                    h7Var.e(false, !yu0Var.Y0);
                    return;
                }
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
            MessageObject E3 = E(i10);
            l7Var.y = i10 != h() - 1;
            l7Var.e();
            l7Var.V = E3;
            l7Var.requestLayout();
            if (yu0Var.z1) {
                l7Var.f(sparseArrayArr[(E3.getDialogId() > j10 ? 1 : (E3.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.getId()) >= 0, !yu0Var.Y0);
            } else {
                l7Var.f(false, !yu0Var.Y0);
            }
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        yu0 yu0Var = this.v;
        org.telegram.ui.ActionBar.g6 g6Var = yu0Var.C1;
        Context context = this.c;
        int i11 = this.r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.i7(context, 0, g6Var);
        } else if (i11 == 4) {
            view = new st0(this, context, g6Var, 0);
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 0, g6Var);
            l7Var.setDelegate(yu0Var.P1);
            view = l7Var;
        }
        view.setLayoutParams(new f2.x0(-1, -2));
        return new el0(view);
    }
}
