package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c1 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p4(g5 g5Var, ArrayList arrayList, ArrayList arrayList2, boolean z10, String str) {
        this.d = g5Var;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = z10;
        this.b = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int indexOf;
        TL_iv.TL_inputRichMessage tL_inputRichMessage;
        int i7 = 2;
        switch (this.a) {
            case 0:
                g5 g5Var = (g5) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                ArrayList arrayList2 = (ArrayList) this.f;
                boolean z10 = this.c;
                String str = (String) this.b;
                if (tL_error == null) {
                    g5Var.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    vr messagesStorage = g5Var.getMessagesStorage();
                    messagesStorage.getClass();
                    if (!arrayList.isEmpty()) {
                        messagesStorage.a.c(new sp(messagesStorage, arrayList, 20));
                    }
                    Utilities.h.c(new w4(g5Var, arrayList2, i7));
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
                        if (!TextUtils.isEmpty(user.phone)) {
                            g5Var.getMessagesStorage().f(user.phone, "");
                            d5 d5Var = (d5) g5Var.a0.get(user.phone);
                            if (d5Var != null && (indexOf = d5Var.g.indexOf(user.phone)) != -1) {
                                d5Var.h.set(indexOf, 1);
                            }
                        }
                    }
                    g0.h3(new aa.c0(g5Var, arrayList2, z10, str, 11));
                    break;
                }
                break;
            case 1:
                g0.h3(new ey(0, (ez) this.d, tLObject, (TLRPC.TL_messages_requestUrlAuth) this.e, (org.telegram.ui.an) this.f, (String) this.b, this.c));
                break;
            default:
                ez ezVar = (ez) this.d;
                boolean z11 = this.c;
                gj gjVar = (gj) this.e;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.f;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.b;
                if (tL_error == null) {
                    if (z11 && gjVar != null) {
                        gjVar.A2 = true;
                    }
                    ezVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new as(ezVar, gjVar));
                    break;
                } else {
                    if (r8.r(tL_error.text)) {
                        String str2 = tL_error.text;
                        in inVar = new in(gjVar, ezVar, tL_messages_editMessage, e2Var, z11);
                        ezVar = ezVar;
                        if (gjVar != null && (tL_inputRichMessage = tL_messages_editMessage.rich_message) != null) {
                            ArrayList arrayList3 = new ArrayList(tL_inputRichMessage.documents.size() + tL_inputRichMessage.photos.size());
                            arrayList3.addAll(tL_inputRichMessage.photos);
                            arrayList3.addAll(tL_inputRichMessage.documents);
                            if (!arrayList3.isEmpty()) {
                                int c10 = r8.c(str2);
                                if (c10 < 0 || c10 >= arrayList3.size()) {
                                    c10 = 0;
                                }
                                ezVar.getFileRefController().u(new Object[]{arrayList3.get(c10), inVar}, gjVar);
                                break;
                            }
                        }
                    }
                    g0.h3(new pq(19, ezVar, gjVar));
                    if (e2Var != null) {
                        g0.h3(new rw(ezVar, tL_error, e2Var, tL_messages_editMessage, 1));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ p4(gj gjVar, ez ezVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.e2 e2Var, boolean z10) {
        this.d = ezVar;
        this.c = z10;
        this.e = gjVar;
        this.f = tL_messages_editMessage;
        this.b = e2Var;
    }

    public /* synthetic */ p4(ez ezVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.an anVar, String str, boolean z10) {
        this.d = ezVar;
        this.e = tL_messages_requestUrlAuth;
        this.f = anVar;
        this.b = str;
        this.c = z10;
    }
}
