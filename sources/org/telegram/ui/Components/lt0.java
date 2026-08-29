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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lt0 extends il0 {
    public final Context c;
    public ii0 e;
    public int n;
    public final int r;
    public int s;
    public final /* synthetic */ qu0 v;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    public lt0(qu0 qu0Var, Context context, int i10) {
        this.v = qu0Var;
        this.c = context;
        this.r = i10;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final MessageObject E(int i10) {
        return i10 < this.d.size() ? (MessageObject) this.d.get(i10) : (MessageObject) this.f.get(i10 - this.d.size());
    }

    public final void F(final int i10, final String str, long j10, long j11) {
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
        final int i12 = this.n + 1;
        this.n = i12;
        this.s++;
        this.h = o2Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: org.telegram.ui.Components.jt0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ArrayList arrayList = new ArrayList();
                lt0 lt0Var = lt0.this;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                        TLRPC.Message message = messages_messages.messages.get(i13);
                        int i14 = i10;
                        if (i14 == 0 || message.id <= i14) {
                            arrayList.add(new MessageObject(lt0Var.v.r1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new ag.z1((Object) lt0Var, i12, arrayList, (Serializable) str, 25));
            }
        }, 2);
        o2Var.getConnectionsManager().bindRequestToGuid(this.h, o2Var.getClassGuid());
    }

    public final void G(String str, boolean z10) {
        ii0 ii0Var = this.e;
        if (ii0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ii0Var);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            l();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = 0;
        qu0 qu0Var = this.v;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                qu0Var.r1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            it0[] it0VarArr = qu0Var.g0;
            if (i10 >= it0VarArr.length) {
                ii0 ii0Var2 = new ii0(12, this, str);
                this.e = ii0Var2;
                AndroidUtilities.runOnUIThread(ii0Var2, 300L);
                return;
            } else {
                it0 it0Var = it0VarArr[i10];
                if (it0Var.B == this.r) {
                    it0Var.w.e(true, z10);
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
    public final void v(f2.n1 n1Var, int i10) {
        View view = n1Var.a;
        qu0 qu0Var = this.v;
        long j10 = qu0Var.f1;
        SparseArray[] sparseArrayArr = qu0Var.V0;
        int i11 = this.r;
        if (i11 == 1) {
            if (view instanceof org.telegram.ui.Cells.g7) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                MessageObject E = E(i10);
                g7Var.c(E, i10 != h() - 1);
                if (qu0Var.y1) {
                    g7Var.b(sparseArrayArr[(E.getDialogId() > j10 ? 1 : (E.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.getId()) >= 0, !qu0Var.X0);
                    return;
                } else {
                    g7Var.b(false, !qu0Var.X0);
                    return;
                }
            }
            return;
        }
        if (i11 != 3) {
            if (i11 == 4 && (view instanceof org.telegram.ui.Cells.f7)) {
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                MessageObject E2 = E(i10);
                f7Var.f(E2, i10 != h() - 1);
                if (qu0Var.y1) {
                    f7Var.e(sparseArrayArr[(E2.getDialogId() > j10 ? 1 : (E2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.getId()) >= 0, !qu0Var.X0);
                    return;
                } else {
                    f7Var.e(false, !qu0Var.X0);
                    return;
                }
            }
            return;
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            MessageObject E3 = E(i10);
            j7Var.y = i10 != h() - 1;
            j7Var.e();
            j7Var.U = E3;
            j7Var.requestLayout();
            if (qu0Var.y1) {
                j7Var.f(sparseArrayArr[(E3.getDialogId() > j10 ? 1 : (E3.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.getId()) >= 0, !qu0Var.X0);
            } else {
                j7Var.f(false, !qu0Var.X0);
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        qu0 qu0Var = this.v;
        org.telegram.ui.ActionBar.c6 c6Var = qu0Var.B1;
        Context context = this.c;
        int i11 = this.r;
        if (i11 == 1) {
            view = new org.telegram.ui.Cells.g7(context, 0, c6Var);
        } else if (i11 == 4) {
            view = new kt0(this, context, c6Var, 0);
        } else {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 0, c6Var);
            j7Var.setDelegate(qu0Var.O1);
            view = j7Var;
        }
        view.setLayoutParams(new f2.x0(-1, -2));
        return new vk0(view);
    }
}
