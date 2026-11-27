// default package

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bia extends c79 {
    public final Context c;
    public ida e;
    public int n;
    public final byte r;
    public int s;
    public final /* synthetic */ eja w;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public bia(eja ejaVar, Context context, int i) {
        this.w = ejaVar;
        this.c = context;
        this.r = i;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final r47 E(int i) {
        return i < this.d.size() ? (r47) this.d.get(i) : (r47) this.f.get(i - this.d.size());
    }

    public final void F(final int i, long j, long j2, final String str) {
        e eVar = this.w.y1;
        if (wf3.B(j)) {
            return;
        }
        if (this.h != 0) {
            eVar.getConnectionsManager().cancelRequest(this.h, true);
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
        tL_messages_search.offset_id = i;
        byte b = this.r;
        if (b == 1) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
        } else if (b == 3) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
        } else if (b == 4) {
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
        }
        tL_messages_search.q = str;
        tL_messages_search.peer = eVar.getMessagesController().j1(j);
        if (j2 != 0) {
            long e = eVar.getUserConfig().e();
            int i2 = tL_messages_search.flags;
            if (j == e) {
                tL_messages_search.flags = i2 | 4;
                tL_messages_search.saved_peer_id = eVar.getMessagesController().j1(j2);
            } else {
                tL_messages_search.flags = i2 | 2;
                tL_messages_search.top_msg_id = (int) j2;
            }
        }
        if (tL_messages_search.peer == null) {
            return;
        }
        final int i3 = this.n + 1;
        this.n = i3;
        this.s++;
        this.h = eVar.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: aia
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ArrayList arrayList = new ArrayList();
                bia biaVar = bia.this;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i4 = 0; i4 < messages_messages.messages.size(); i4++) {
                        TLRPC.Message message = messages_messages.messages.get(i4);
                        int i5 = i;
                        if (i5 == 0 || message.id <= i5) {
                            arrayList.add(new r47(biaVar.w.y1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                hl.c3(new efa(biaVar, i3, arrayList, str, (byte) 3));
            }
        }, 2);
        eVar.getConnectionsManager().bindRequestToGuid(this.h, eVar.getClassGuid());
    }

    public final void G(String str, boolean z) {
        ida idaVar = this.e;
        if (idaVar != null) {
            hl.r(idaVar);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i = 0;
        eja ejaVar = this.w;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                ejaVar.y1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            zha[] zhaVarArr = ejaVar.n0;
            if (i >= zhaVarArr.length) {
                ida idaVar2 = new ida(this, str, (byte) 5);
                this.e = idaVar2;
                hl.d3(idaVar2, 300L);
                return;
            } else {
                zha zhaVar = zhaVarArr[i];
                if (zhaVar.F == this.r) {
                    zhaVar.w.e(true, z);
                }
                i++;
            }
        }
    }

    @Override // j79
    public final int b() {
        int size = this.d.size();
        int size2 = this.f.size();
        return size2 != 0 ? size + size2 : size;
    }

    @Override // j79
    public final int d(int i) {
        return 24;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        View view = f89Var.a;
        eja ejaVar = this.w;
        long j = ejaVar.m1;
        SparseArray[] sparseArrayArr = ejaVar.c1;
        byte b = this.r;
        if (b == 1) {
            if (view instanceof zea) {
                zea zeaVar = (zea) view;
                r47 E = E(i);
                zeaVar.c(E, i != b() - 1);
                if (ejaVar.F1) {
                    zeaVar.b(sparseArrayArr[(r47.B0(E.k) > j ? 1 : (r47.B0(E.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.e1()) >= 0, !ejaVar.e1);
                    return;
                } else {
                    zeaVar.b(false, !ejaVar.e1);
                    return;
                }
            }
            return;
        }
        if (b != 3) {
            if (b == 4 && (view instanceof vea)) {
                vea veaVar = (vea) view;
                r47 E2 = E(i);
                veaVar.f(E2, i != b() - 1);
                if (ejaVar.F1) {
                    veaVar.e(sparseArrayArr[(r47.B0(E2.k) > j ? 1 : (r47.B0(E2.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.e1()) >= 0, !ejaVar.e1);
                    return;
                } else {
                    veaVar.e(false, !ejaVar.e1);
                    return;
                }
            }
            return;
        }
        if (view instanceof cfa) {
            cfa cfaVar = (cfa) view;
            r47 E3 = E(i);
            cfaVar.E = i != b() - 1;
            cfaVar.e();
            cfaVar.c0 = E3;
            cfaVar.requestLayout();
            if (ejaVar.F1) {
                cfaVar.f(sparseArrayArr[(r47.B0(E3.k) > j ? 1 : (r47.B0(E3.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.e1()) >= 0, !ejaVar.e1);
            } else {
                cfaVar.f(false, !ejaVar.e1);
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout sg4Var;
        eja ejaVar = this.w;
        vnb vnbVar = ejaVar.I1;
        Context context = this.c;
        byte b = this.r;
        byte b2 = 1;
        if (b == 1) {
            sg4Var = new zea(0, vnbVar, context);
        } else if (b == 4) {
            sg4Var = new sg4(this, context, vnbVar, b2);
        } else {
            cfa cfaVar = new cfa(0, vnbVar, context);
            cfaVar.setDelegate(ejaVar.W1);
            sg4Var = cfaVar;
        }
        sg4Var.setLayoutParams(new r79(-1, -2));
        return new n69(sg4Var);
    }
}
