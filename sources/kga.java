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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kga extends q59 {
    public final Context c;
    public e6a e;
    public int n;
    public final byte r;
    public int s;
    public final /* synthetic */ nha w;
    public ArrayList d = new ArrayList();
    public ArrayList f = new ArrayList();
    public int h = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public kga(nha nhaVar, Context context, int i) {
        this.w = nhaVar;
        this.c = context;
        this.r = i;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return this.f.size() + this.d.size() != 0;
    }

    public final k47 E(int i) {
        return i < this.d.size() ? (k47) this.d.get(i) : (k47) this.f.get(i - this.d.size());
    }

    public final void F(final int i, long j, long j2, final String str) {
        d dVar = this.w.y1;
        if (pg3.B(j)) {
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
        tL_messages_search.peer = dVar.getMessagesController().i1(j);
        if (j2 != 0) {
            long e = dVar.getUserConfig().e();
            int i2 = tL_messages_search.flags;
            if (j == e) {
                tL_messages_search.flags = i2 | 4;
                tL_messages_search.saved_peer_id = dVar.getMessagesController().i1(j2);
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
        this.h = dVar.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() { // from class: jga
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ArrayList arrayList = new ArrayList();
                kga kgaVar = kga.this;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i4 = 0; i4 < messages_messages.messages.size(); i4++) {
                        TLRPC.Message message = messages_messages.messages.get(i4);
                        int i5 = i;
                        if (i5 == 0 || message.id <= i5) {
                            arrayList.add(new k47(kgaVar.w.y1.getCurrentAccount(), message, false, true));
                        }
                    }
                }
                gm.c3(new tda(kgaVar, i3, arrayList, str, (byte) 2));
            }
        }, 2);
        dVar.getConnectionsManager().bindRequestToGuid(this.h, dVar.getClassGuid());
    }

    public final void G(String str, boolean z) {
        e6a e6aVar = this.e;
        if (e6aVar != null) {
            gm.r(e6aVar);
            this.e = null;
        }
        if (!this.d.isEmpty() || !this.f.isEmpty()) {
            this.d.clear();
            this.f.clear();
            f();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        int i = 0;
        nha nhaVar = this.w;
        if (isEmpty) {
            if (this.d.isEmpty() && this.f.isEmpty() && this.s == 0) {
                return;
            }
            this.d.clear();
            this.f.clear();
            if (this.h != 0) {
                nhaVar.y1.getConnectionsManager().cancelRequest(this.h, true);
                this.h = 0;
                this.s--;
                return;
            }
            return;
        }
        while (true) {
            iga[] igaVarArr = nhaVar.n0;
            if (i >= igaVarArr.length) {
                e6a e6aVar2 = new e6a(this, str, (byte) 8);
                this.e = e6aVar2;
                gm.d3(e6aVar2, 300L);
                return;
            } else {
                iga igaVar = igaVarArr[i];
                if (igaVar.F == this.r) {
                    igaVar.w.e(true, z);
                }
                i++;
            }
        }
    }

    @Override // y59
    public final int b() {
        int size = this.d.size();
        int size2 = this.f.size();
        return size2 != 0 ? size + size2 : size;
    }

    @Override // y59
    public final int d(int i) {
        return 24;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        View view = u69Var.a;
        nha nhaVar = this.w;
        long j = nhaVar.m1;
        SparseArray[] sparseArrayArr = nhaVar.c1;
        byte b = this.r;
        if (b == 1) {
            if (view instanceof ida) {
                ida idaVar = (ida) view;
                k47 E = E(i);
                idaVar.c(E, i != b() - 1);
                if (nhaVar.F1) {
                    idaVar.b(sparseArrayArr[(k47.B0(E.k) > j ? 1 : (k47.B0(E.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E.e1()) >= 0, !nhaVar.e1);
                    return;
                } else {
                    idaVar.b(false, !nhaVar.e1);
                    return;
                }
            }
            return;
        }
        if (b != 3) {
            if (b == 4 && (view instanceof eda)) {
                eda edaVar = (eda) view;
                k47 E2 = E(i);
                edaVar.f(E2, i != b() - 1);
                if (nhaVar.F1) {
                    edaVar.e(sparseArrayArr[(k47.B0(E2.k) > j ? 1 : (k47.B0(E2.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E2.e1()) >= 0, !nhaVar.e1);
                    return;
                } else {
                    edaVar.e(false, !nhaVar.e1);
                    return;
                }
            }
            return;
        }
        if (view instanceof lda) {
            lda ldaVar = (lda) view;
            k47 E3 = E(i);
            ldaVar.E = i != b() - 1;
            ldaVar.e();
            ldaVar.c0 = E3;
            ldaVar.requestLayout();
            if (nhaVar.F1) {
                ldaVar.f(sparseArrayArr[(k47.B0(E3.k) > j ? 1 : (k47.B0(E3.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(E3.e1()) >= 0, !nhaVar.e1);
            } else {
                ldaVar.f(false, !nhaVar.e1);
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout wg4Var;
        nha nhaVar = this.w;
        ylb ylbVar = nhaVar.I1;
        Context context = this.c;
        byte b = this.r;
        byte b2 = 1;
        if (b == 1) {
            wg4Var = new ida(0, ylbVar, context);
        } else if (b == 4) {
            wg4Var = new wg4(this, context, ylbVar, b2);
        } else {
            lda ldaVar = new lda(0, ylbVar, context);
            ldaVar.setDelegate(nhaVar.W1);
            wg4Var = ldaVar;
        }
        wg4Var.setLayoutParams(new g69(-1, -2));
        return new b59(wg4Var);
    }
}
