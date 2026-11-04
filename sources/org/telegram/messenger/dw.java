package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class dw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ dw(yy yyVar, ArrayList arrayList, boolean z10, boolean z11, TLRPC.Message message, ArrayList arrayList2, ArrayList arrayList3, int i3) {
        this.e = yyVar;
        this.f = arrayList;
        this.c = z10;
        this.d = z11;
        this.r = message;
        this.h = arrayList2;
        this.n = arrayList3;
        this.b = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i10 = this.a;
        TLObject tLObject = this.r;
        Object obj = this.n;
        Object obj2 = this.h;
        Serializable serializable = this.f;
        Object obj3 = this.e;
        switch (i10) {
            case 0:
                yy yyVar = (yy) obj3;
                qr messagesStorage = yyVar.getMessagesStorage();
                boolean z10 = this.c;
                messagesStorage.j1((ArrayList) serializable, true, false, false, 0, false, !z10 ? 1 : 0, 0L);
                g0.h3(new ci.pa(yyVar, this.d, (TLRPC.Message) tLObject, (ArrayList) obj2, z10, (ArrayList) obj, this.b));
                break;
            default:
                org.telegram.ui.ba baVar = (org.telegram.ui.ba) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) tLObject;
                org.telegram.ui.ka kaVar = baVar.a;
                ArrayList arrayList = kaVar.x;
                ArrayList arrayList2 = kaVar.w;
                arrayList.remove((String) serializable);
                boolean z11 = ((TLObject) obj2) instanceof TLRPC.TL_boolTrue;
                int i11 = this.b;
                boolean z12 = this.c;
                TLRPC.TL_username tL_username2 = null;
                if (z11) {
                    kaVar.n0(i11, z12, false);
                } else {
                    boolean z13 = this.d;
                    if (tL_error == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                        kaVar.o0(tL_username, z13, true);
                    } else {
                        tL_username.active = z12;
                        kaVar.n0(i11, z12, false);
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, kaVar.getParentActivity(), kaVar.getResourceProvider());
                        String M0 = bd.M0(2131743682, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = bd.M0(2131743683, null);
                        alertDialog$Builder.k(bd.M0(2131747839, null), new ci.l3(baVar, tL_username, z13, 3));
                        alertDialog$Builder.p();
                    }
                }
                i3 = ((org.telegram.ui.ActionBar.d2) kaVar).currentAccount;
                TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(kaVar.l0()));
                kaVar.getMessagesController().t5(a22, tL_username.username, tL_username.active);
                if (kaVar.y != 0 && arrayList2 != null) {
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
                        kaVar.o0(tL_username2, true, false);
                        kaVar.getMessagesController().t5(a22, tL_username2.username, tL_username2.active);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ dw(org.telegram.ui.ba baVar, String str, TLObject tLObject, int i3, boolean z10, TLRPC.TL_error tL_error, TLRPC.TL_username tL_username, boolean z11) {
        this.e = baVar;
        this.f = str;
        this.h = tLObject;
        this.b = i3;
        this.c = z10;
        this.n = tL_error;
        this.r = tL_username;
        this.d = z11;
    }
}
