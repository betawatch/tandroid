package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class kw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ kw(gz gzVar, ArrayList arrayList, boolean z9, boolean z10, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i7) {
        this.e = gzVar;
        this.f = arrayList;
        this.c = z9;
        this.d = z10;
        this.r = message;
        this.h = arrayList2;
        this.n = arrayList3;
        this.b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10 = this.a;
        TLObject tLObject = this.r;
        Object obj = this.n;
        Object obj2 = this.h;
        Serializable serializable = this.f;
        Object obj3 = this.e;
        switch (i10) {
            case 0:
                gz gzVar = (gz) obj3;
                yr messagesStorage = gzVar.getMessagesStorage();
                boolean z9 = this.c;
                messagesStorage.j1((ArrayList) serializable, true, false, false, 0, false, !z9 ? 1 : 0, 0L);
                g0.h3(new bi.sb(gzVar, this.d, (TLRPC.Message) tLObject, (ArrayList) obj2, z9, (ArrayList) obj, this.b));
                break;
            default:
                org.telegram.ui.ca caVar = (org.telegram.ui.ca) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) tLObject;
                org.telegram.ui.la laVar = caVar.a;
                ArrayList arrayList = laVar.x;
                ArrayList arrayList2 = laVar.w;
                arrayList.remove((String) serializable);
                boolean z10 = ((TLObject) obj2) instanceof TLRPC.TL_boolTrue;
                int i11 = this.b;
                boolean z11 = this.c;
                TLRPC.TL_username tL_username2 = null;
                if (z10) {
                    laVar.n0(i11, z11, false);
                } else {
                    boolean z12 = this.d;
                    if (tL_error == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        laVar.o0(tL_username, z12, true);
                    } else {
                        tL_username.active = z11;
                        laVar.n0(i11, z11, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, laVar.getParentActivity(), laVar.getResourceProvider());
                        String M0 = id.M0(2131743675, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = id.M0(2131743676, null);
                        alertDialog$Builder.k(id.M0(2131747832, null), new ab.j(caVar, tL_username, z12, 4));
                        alertDialog$Builder.p();
                    }
                }
                i7 = ((org.telegram.ui.ActionBar.f2) laVar).currentAccount;
                TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(laVar.l0()));
                laVar.getMessagesController().t5(a22, tL_username.username, tL_username.active);
                if (laVar.y != 0 && arrayList2 != null) {
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj4 = arrayList2.get(i12);
                        i12++;
                        if (((TLRPC.TL_username) obj4).active) {
                            break;
                        }
                    }
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size2) {
                            Object obj5 = arrayList2.get(i13);
                            i13++;
                            TLRPC.TL_username tL_username3 = (TLRPC.TL_username) obj5;
                            if (tL_username3.editable) {
                                tL_username2 = tL_username3;
                            }
                        }
                    }
                    if (tL_username2 != null) {
                        laVar.o0(tL_username2, true, false);
                        laVar.getMessagesController().t5(a22, tL_username2.username, tL_username2.active);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ kw(org.telegram.ui.ca caVar, String str, TLObject tLObject, int i7, boolean z9, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z10) {
        this.e = caVar;
        this.f = str;
        this.h = tLObject;
        this.b = i7;
        this.c = z9;
        this.n = tL_error;
        this.r = tL_username;
        this.d = z10;
    }
}
