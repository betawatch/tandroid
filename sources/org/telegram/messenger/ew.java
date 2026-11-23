package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class ew implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ ew(zy zyVar, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i7) {
        this.e = zyVar;
        this.f = arrayList;
        this.c = z10;
        this.d = z11;
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
                zy zyVar = (zy) obj3;
                tr messagesStorage = zyVar.getMessagesStorage();
                boolean z10 = this.c;
                messagesStorage.j1((ArrayList) serializable, true, false, false, 0, false, !z10 ? 1 : 0, 0L);
                g0.g3(new di.ia(zyVar, this.d, (TLRPC.Message) tLObject, (ArrayList) obj2, z10, (ArrayList) obj, this.b));
                break;
            default:
                org.telegram.ui.ca caVar = (org.telegram.ui.ca) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) tLObject;
                org.telegram.ui.la laVar = caVar.a;
                ArrayList arrayList = laVar.x;
                ArrayList arrayList2 = laVar.w;
                arrayList.remove((String) serializable);
                boolean z11 = ((TLObject) obj2) instanceof TLRPC.TL_boolTrue;
                int i11 = this.b;
                boolean z12 = this.c;
                TLRPC.TL_username tL_username2 = null;
                if (z11) {
                    laVar.n0(i11, z12, false);
                } else {
                    boolean z13 = this.d;
                    if (tL_error == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        laVar.o0(tL_username, z13, true);
                    } else {
                        tL_username.active = z12;
                        laVar.n0(i11, z12, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, laVar.getParentActivity(), laVar.getResourceProvider());
                        String N0 = gd.N0(2131743425, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = gd.N0(2131743426, null);
                        alertDialog$Builder.k(gd.N0(2131747637, null), new ab.j(caVar, tL_username, z13, 4));
                        alertDialog$Builder.p();
                    }
                }
                i7 = ((org.telegram.ui.ActionBar.g2) laVar).currentAccount;
                TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(laVar.l0()));
                laVar.getMessagesController().F5(c22, tL_username.username, tL_username.active);
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
                        laVar.getMessagesController().F5(c22, tL_username2.username, tL_username2.active);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ew(org.telegram.ui.ca caVar, String str, TLObject tLObject, int i7, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.e = caVar;
        this.f = str;
        this.h = tLObject;
        this.b = i7;
        this.c = z10;
        this.n = tL_error;
        this.r = tL_username;
        this.d = z11;
    }
}
