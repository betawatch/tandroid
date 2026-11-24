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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kea extends n39 {
    public final Context c;
    public t7a e;
    public int n;
    public final byte r;
    public int s;
    public final /* synthetic */ nfa w;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public kea(nfa nfaVar, Context context, int i) {
        this.w = nfaVar;
        this.c = context;
        this.r = i;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final k27 E(int i) {
        return i < this.d.size() ? (k27) this.d.get(i) : (k27) this.f.get(i - this.d.size());
    }

    public final void F(final int i, long j, long j2, final String str) {
        d dVar = this.w.y1;
        if (cf3.B(j)) {
            return;
        }
        if (this.h != 0) {
            dVar.getConnectionsManager().cancelRequest(this.h, true);
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
        tL_messages_search.peer = dVar.getMessagesController().h1(j);
        if (j2 != 0) {
            long e = dVar.getUserConfig().e();
            int i2 = tL_messages_search.flags;
            if (j == e) {
                tL_messages_search.flags = i2 | 4;
                tL_messages_search.saved_peer_id = dVar.getMessagesController().h1(j2);
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
        this.h = dVar.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: jea
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ArrayList arrayList = new ArrayList();
                kea keaVar = kea.this;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i4 = 0; i4 < messages_messages.messages.size(); i4++) {
                        TLRPC.Message message = messages_messages.messages.get(i4);
                        int i5 = i;
                        if (i5 == 0 || message.id <= i5) {
                            arrayList.add(new k27(keaVar.w.y1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                gl.c3(new ica(keaVar, i3, arrayList, str, (byte) 1));
            }
        }, 2);
        dVar.getConnectionsManager().bindRequestToGuid(this.h, dVar.getClassGuid());
    }

    public final void G(String str, boolean z) {
        t7a t7aVar = this.e;
        if (t7aVar != null) {
            gl.r(t7aVar);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i = 0;
        nfa nfaVar = this.w;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                nfaVar.y1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            iea[] ieaVarArr = nfaVar.n0;
            if (i >= ieaVarArr.length) {
                t7a t7aVar2 = new t7a(this, str, (byte) 6);
                this.e = t7aVar2;
                gl.d3(t7aVar2, 300L);
                return;
            } else {
                iea ieaVar = ieaVarArr[i];
                if (ieaVar.F == this.r) {
                    ieaVar.w.e(true, z);
                }
                i++;
            }
        }
    }

    @Override // w39
    public final int b() {
        int size = this.d.size();
        int size2 = this.f.size();
        return size2 != 0 ? size + size2 : size;
    }

    @Override // w39
    public final int d(int i) {
        return 24;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        View view = s49Var.a;
        nfa nfaVar = this.w;
        long j = nfaVar.m1;
        SparseArray[] sparseArrayArr = nfaVar.c1;
        byte b = this.r;
        if (b == 1) {
            if (view instanceof iba) {
                iba ibaVar = (iba) view;
                k27 E = E(i);
                ibaVar.c(E, i != b() - 1);
                if (nfaVar.F1) {
                    ibaVar.b(sparseArrayArr[(k27.B0(E.k) > j ? 1 : (k27.B0(E.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.e1()) >= 0, !nfaVar.e1);
                    return;
                } else {
                    ibaVar.b(false, !nfaVar.e1);
                    return;
                }
            }
            return;
        }
        if (b != 3) {
            if (b == 4 && (view instanceof eba)) {
                eba ebaVar = (eba) view;
                k27 E2 = E(i);
                ebaVar.f(E2, i != b() - 1);
                if (nfaVar.F1) {
                    ebaVar.e(sparseArrayArr[(k27.B0(E2.k) > j ? 1 : (k27.B0(E2.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.e1()) >= 0, !nfaVar.e1);
                    return;
                } else {
                    ebaVar.e(false, !nfaVar.e1);
                    return;
                }
            }
            return;
        }
        if (view instanceof lba) {
            lba lbaVar = (lba) view;
            k27 E3 = E(i);
            lbaVar.E = i != b() - 1;
            lbaVar.e();
            lbaVar.c0 = E3;
            lbaVar.requestLayout();
            if (nfaVar.F1) {
                lbaVar.f(sparseArrayArr[(k27.B0(E3.k) > j ? 1 : (k27.B0(E3.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.e1()) >= 0, !nfaVar.e1);
            } else {
                lbaVar.f(false, !nfaVar.e1);
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout ue4Var;
        nfa nfaVar = this.w;
        wjb wjbVar = nfaVar.I1;
        Context context = this.c;
        byte b = this.r;
        byte b2 = 1;
        if (b == 1) {
            ue4Var = new iba(0, wjbVar, context);
        } else if (b == 4) {
            ue4Var = new ue4(this, context, wjbVar, b2);
        } else {
            lba lbaVar = new lba(0, wjbVar, context);
            lbaVar.setDelegate(nfaVar.W1);
            ue4Var = lbaVar;
        }
        ue4Var.setLayoutParams(new e49(-1, -2));
        return new y29(ue4Var);
    }
}
